package com.jiyun.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 李艳东 on 2017/5/9.
 */

public class ViewPager_Zonghe extends FragmentPagerAdapter {
    String[] strings = new String[]{"开源咨询", "推荐博客", "技术问答", "每日一搏"};
    private ArrayList<Fragment> fragments;

    public ViewPager_Zonghe(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings[position];
    }
}
