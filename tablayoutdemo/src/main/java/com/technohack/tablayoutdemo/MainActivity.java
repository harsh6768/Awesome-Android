package com.technohack.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tab Layout");

        tabLayout=findViewById(R.id.tabLayoutId);
        viewPager=findViewById(R.id.viewPagerId);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(viewPagerAdapter);

       tabLayout.setupWithViewPager(viewPager);




    }
}
