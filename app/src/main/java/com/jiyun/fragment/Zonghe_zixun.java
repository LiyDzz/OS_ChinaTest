package com.jiyun.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import china.jiyun.com.os_chinatest.R;

/**
 * Created by 李艳东 on 2017/5/9.
 */

public class Zonghe_zixun extends Fragment {


    @Bind(R.id.luobo)
    ViewPager luobo;
    @Bind(R.id.zixun_recycleview)
    RecyclerView zixunRecycleview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.zonghe_zixun, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


}
