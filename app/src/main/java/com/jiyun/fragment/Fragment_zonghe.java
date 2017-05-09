package com.jiyun.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiyun.adapter.ViewPager_Zonghe;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.OnClick;
import china.jiyun.com.os_chinatest.R;

/**
 * Created by 李艳东 on 2017/5/9.
 */

public class Fragment_zonghe extends Fragment {


    @Bind(R.id.mytableLayout)
    TabLayout mytableLayout;
    @Bind(R.id.myviewPager)
    ViewPager myviewPager;
    private ArrayList<Fragment> fragments;
    private Zonghe_zixun zonghe_zixun;
    private Zonghe_boke zonghe_boke;
    private Zonghe_wenda zonghe_wenda;
    private Zonghe_huodong zonghe_huodong;
    private ViewPager_Zonghe zonghe;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zonghe, null);
        initData();
        return view;
    }

    //    @Override
//    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//        setContentView(R.layout.fragment_zonghe);
//        ButterKnife.bind(this);
//        initData();
//    }

    private void initData() {
        fragments = new ArrayList<>();
        zonghe_zixun = new Zonghe_zixun();
        zonghe_boke = new Zonghe_boke();
        zonghe_wenda = new Zonghe_wenda();
        zonghe_huodong = new Zonghe_huodong();
        fragments.add(zonghe_zixun);
        fragments.add(zonghe_boke);
        fragments.add(zonghe_wenda);
        fragments.add(zonghe_huodong);
        zonghe = new ViewPager_Zonghe(getFragmentManager(), fragments);
        myviewPager.setAdapter(zonghe);
        mytableLayout.setupWithViewPager(myviewPager);
        mytableLayout.setTabMode(TabLayout.MODE_FIXED);
    }


    @OnClick(R.id.mytableLayout)
    public void onViewClicked() {

    }
}
