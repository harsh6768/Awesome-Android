package com.technohack.fregmentdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Fragment1 fragment1=new Fragment1();
                return fragment1;
            case 1:
                Fragment2 fragment2=new Fragment2();
                return fragment2;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
         switch (position){
             case 0:
                 return "Fragment1";
             case 1:
                 return "Fragment2";
         }
        return super.getPageTitle(position);
    }

}
