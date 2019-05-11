package com.technohack.firebase_signin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private Button loginSignInBtn,loginReg;
    private TextInputEditText loginEmail,loginPass;

    private ProgressDialog progressDialog;
    private FirebaseAuth mAuth;
    private TextView forgetPassText;
    private Toolbar toolbar;
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        if(currentUser!=null){

            Intent loginIntent=new Intent(LoginActivity.this,HomePage.class);
            // regSuccessIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(loginIntent);
            finish();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // MultiDex.install(this);

        FirebaseApp.initializeApp(this);

        mAuth=FirebaseAuth.getInstance();

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Sign-In User");

        forgetPassText=findViewById(R.id.login_resetPassTextId);

        loginEmail=findViewById(R.id.login_emailId);
        loginPass=findViewById(R.id.login_passId);
        loginReg=findViewById(R.id.login_regId);
        loginSignInBtn=findViewById(R.id.login_signInId);

        loginReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginRegIntent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(loginRegIntent);
            }
        });

        loginSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUser();
            }
        });
        forgetPassText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this,ResetPassword.class));

            }
        });
    }

    private void signUser() {

        final String mEmail= Objects.requireNonNull(loginEmail.getText()).toString().trim();
        final String mPass= Objects.requireNonNull(loginPass.getText()).toString().trim();

        if(mEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()){
            loginEmail.setError("Please enter valid email");
        }else if(mPass.isEmpty() || mPass.length()<6){
            loginPass.setError("Please enter valid password");
        }else{

            loginUser(mEmail,mPass);
        }

    }

    private void loginUser(String mEmail, String mPass) {

        //for progressbarDialog
        progressDialog= new ProgressDialog(LoginActivity.this, R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Sign-In Account ...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

        mAuth.signInWithEmailAndPassword(mEmail,mPass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){

                    progressDialog.dismiss();
                    // Toast.makeText(Register.this, "Failed to register", Toast.LENGTH_SHORT).show();
                    Intent loginIntent=new Intent(LoginActivity.this,HomePage.class);
                    loginIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(loginIntent);
                    finish();
                }else{
                    progressDialog.dismiss();
                    Toast.makeText(LoginActivity.this, "Failed to Login", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
