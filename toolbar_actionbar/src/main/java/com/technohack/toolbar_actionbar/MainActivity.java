package com.technohack.toolbar_actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Toolbar Demo");
        toolbar.setLogo(R.mipmap.ic_launcher_anroid);


    }

}
