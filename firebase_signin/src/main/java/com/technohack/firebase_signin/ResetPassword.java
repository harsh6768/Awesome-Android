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
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;
import java.util.regex.Pattern;

public class ResetPassword extends AppCompatActivity {

    private TextInputEditText resetEmailText;
    private Button resetPassBtn;
    private Toolbar toolbar;
    private FirebaseAuth mAuth;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Reset Password");

        FirebaseApp.initializeApp(this);
        mAuth=FirebaseAuth.getInstance();

        resetEmailText=findViewById(R.id.reset_emailId);
        resetPassBtn=findViewById(R.id.reset_passBtnId);

        resetPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //for progressbarDialog
                progressDialog= new ProgressDialog(ResetPassword.this, R.style.AppTheme_Dark_Dialog);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Sending Email Link ...");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();

                final String mEmail=resetEmailText.getText().toString().trim();
                if(mEmail.isEmpty() && !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()){
                    resetEmailText.setError("Please provide valid Email-Id");
                }else{

                    mAuth.sendPasswordResetEmail(mEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            if (task.isSuccessful()){
                                progressDialog.dismiss();
                                Toast.makeText(ResetPassword.this, "Check Your mail to reset Password", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(ResetPassword.this,LoginActivity.class));
                                finish();
                            }else{
                                progressDialog.dismiss();
                                Toast.makeText(ResetPassword.this, "Enter Valid Email-Id", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }
            }
        });
    }
}
