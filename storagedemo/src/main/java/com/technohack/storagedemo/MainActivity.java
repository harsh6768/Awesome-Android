package com.technohack.storagedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

     private Toolbar toolbar;
     private Button internalStorageBtn,externalStorageBtn,sharedPreferencesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Storage");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));


        internalStorageBtn=findViewById(R.id.internal_storage_btnId);
        externalStorageBtn=findViewById(R.id.external_storage_btnId);
        sharedPreferencesBtn=findViewById(R.id.shared_preferences_btnId);

        internalStorageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,InternalStorage.class));
            }
        });

        externalStorageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,ExternalStorage.class));

            }
        });

        sharedPreferencesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, SharedPreferencesPage.class));

            }
        });

    }
}
