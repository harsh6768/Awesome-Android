package com.technohack.firebase_signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity {

    private Button logoutBtn;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        FirebaseApp.initializeApp(this);
        mAuth=FirebaseAuth.getInstance();
        logoutBtn=findViewById(R.id.home_logoutBtnId);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signOut();
                startActivity(new Intent(HomePage.this,LoginActivity.class));
            }
        });
    }
}
