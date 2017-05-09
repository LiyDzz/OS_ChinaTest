package china.jiyun.com.os_chinatest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.jiyun.adapter.ViewPager_Zonghe;
import com.jiyun.fragment.Zonghe_boke;
import com.jiyun.fragment.Zonghe_huodong;
import com.jiyun.fragment.Zonghe_wenda;
import com.jiyun.fragment.Zonghe_zixun;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class HomeActivity extends FragmentActivity {


    private ArrayList<Fragment> fragments;

    private Zonghe_zixun zonghe_zixun;
    private Zonghe_boke zonghe_boke;
    private Zonghe_wenda zonghe_wenda;
    private Zonghe_huodong zonghe_huodong;
    private ViewPager_Zonghe zonghe;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_zonghe);
        ButterKnife.bind(this);
        viewPager = (ViewPager) findViewById(R.id.myviewPager);
        tabLayout = (TabLayout) findViewById(R.id.mytableLayout);
        initData();
    }

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
        zonghe = new ViewPager_Zonghe(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(zonghe);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
    }


}
