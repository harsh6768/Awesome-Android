package com.technohack.storagedemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.Objects;

public class GetSharedPreferencesData extends AppCompatActivity {

    public static final String DEFAULT="Default";
    TextView getSharedData;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_shared_preferences_data);

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("SharedPreferences");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSharedData=findViewById(R.id.get_shared_dataId);

        SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
        String data=sharedPreferences.getString("data",DEFAULT);

        getSharedData.setText(data);

    }
}
