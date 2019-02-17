package com.technohack.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button implicitIntentBtn;

    private Button explicitIntentBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        implicitIntentBtn=findViewById(R.id.btn_implicitIntents);
        explicitIntentBtn=findViewById(R.id.btn_explicitIntents);
        //navigating into the implicit activity
        implicitIntentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ImplicitIntent.class));
            }
        });

        //To open any activity we use explicit intent
        // here  i will open the ImplicitIntent activity which is nothing but a explicit Intent
        explicitIntentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ImplicitIntent.class));
            }
        });

    }
}
