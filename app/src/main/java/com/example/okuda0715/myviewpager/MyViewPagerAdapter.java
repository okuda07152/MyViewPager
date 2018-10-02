package com.example.okuda0715.myviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class MyViewPagerAdapter extends FragmentPagerAdapter{

    public MyViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Page.newInstance(R.color.colorYellow);
            case 1:
                return Page.newInstance(R.color.colorGreen);
            case 2:
                return Page.newInstance(R.color.colorBlue);
        }
        return Page.newInstance(R.color.colorAccent);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "ページ１";
            case 1:
                return "ページ２";
            case 2:
                return "ページ３";
        }
        return "ページタイトル取得失敗";
    }
}
