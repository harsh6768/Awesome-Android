package com.technohack.storagedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SharedPreferencesPage extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText data;
    private Button saveBtn,seeSharedBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_page);

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("SharedPreferences");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        data=findViewById(R.id.shared_textId);
        saveBtn=findViewById(R.id.saveBtnId);
        seeSharedBtn=findViewById(R.id.seeSharedDataId);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String mData=data.getText().toString().trim();
                if(mData.isEmpty()){
                    data.setError("Please Provide data");
                }else{

                    //to store the data into the shared preferences
                    SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
                    SharedPreferences.Editor editor=sharedPreferences.edit();

                    editor.putString("data",mData);
                    editor.apply();

                    Toast.makeText(SharedPreferencesPage.this, "Successfully Data Saved", Toast.LENGTH_SHORT).show();

                }
            }
        });

        seeSharedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SharedPreferencesPage.this,GetSharedPreferencesData.class));
            }
        });
    }

}
