package com.technohack.fregmentdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.FragmentA ,Fragment2.FragmentB {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout=findViewById(R.id.tab_layoutId);
        viewPager=findViewById(R.id.view_pagerId);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onASendText(String data) {
        String tag = "android:switcher:" + R.id.view_pagerId + ":" + 1;
        Fragment2  fragment2=(Fragment2) getSupportFragmentManager().getFragments().get(1);
        fragment2.onBSetTextUpdate(data);

    }

    @Override
    public void onBSendText(String data) {

        //String tag="android:switcher:"+R.id.view_pagerId+":"+0;

        Fragment1 fragment1= (Fragment1) getSupportFragmentManager().getFragments().get(0);
        fragment1.onASetTextUpdate(data);
    }
}
