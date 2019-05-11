package com.technohack.firebase_signin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {

    private Button regLoginBtn,regSignUpBtn;
    private TextInputEditText regUsername,regEmail,regPass,regConfirmPass;
    private ProgressDialog progressDialog;

    private FirebaseAuth mAuth;
    private Toolbar toolbar;

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        if(currentUser!=null){

            Intent regSuccessIntent=new Intent(RegisterActivity.this,HomePage.class);
            //regSuccessIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(regSuccessIntent);
            finish();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // MultiDex.install(this);

        FirebaseApp.initializeApp(this);
        mAuth=FirebaseAuth.getInstance();

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Sign-up User");

        regUsername=findViewById(R.id.register_usernameId);
        regEmail=findViewById(R.id.register_emailId);
        regPass=findViewById(R.id.reg_passwordId);
        regConfirmPass=findViewById(R.id.reg_confirm_passId);
        regLoginBtn=findViewById(R.id.reg_login_id);
        regSignUpBtn=findViewById(R.id.reg_signUpId);

        regLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginRegIntent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(loginRegIntent);
            }
        });

        regSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {

        final String mUsername= Objects.requireNonNull(regUsername.getText()).toString().trim();
        final String mEmail= Objects.requireNonNull(regEmail.getText()).toString().trim();
        final String mPass= Objects.requireNonNull(regPass.getText()).toString().trim();
        final String mConfirm= Objects.requireNonNull(regConfirmPass.getText()).toString().trim();

        if(mUsername.isEmpty() || mUsername.length()<4){
            regUsername.setError("Please enter valid username");
        }else if(mEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()){
            regEmail.setError("Please enter valid email");
        }else if(mPass.isEmpty() || mPass.length()<6){
            regPass.setError("Please enter valid password");
        }else if(mConfirm.isEmpty() || !mConfirm.equals(mPass)){
            regConfirmPass.setError("Please confirm your password");
        }else{

            regNewUser(mUsername,mEmail,mPass,mConfirm);
        }

    }

    private void regNewUser(final String mUsername, final String mEmail, final String mPass, String mConfirm) {

        //for progressbarDialog
        progressDialog= new ProgressDialog(RegisterActivity.this, R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating Account ...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

        mAuth.createUserWithEmailAndPassword(mEmail,mPass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){

                    startActivity(new Intent(RegisterActivity.this,HomePage.class));
                    finish();

                }else{
                    progressDialog.dismiss();
                    Toast.makeText(RegisterActivity.this, "Failed to register", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
