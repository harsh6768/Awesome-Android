package com.technohack.slidingrootnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;


public class MainActivity extends AppCompatActivity {

     private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbarId);
        toolbar.setTitle("Sliding Root");
        setSupportActionBar(toolbar);

        //for sliding root navigationBar
        new SlidingRootNavBuilder(this)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withMenuLayout(R.layout.othermenus)
                .inject();

    }
}
