package com.zhang.mypracticemvp.view.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.gyf.immersionbar.ImmersionBar;
import com.zhang.mypracticemvp.R;
import com.zhang.mypracticemvp.view.fragment.HomeFragment;
import com.zhang.mypracticemvp.view.fragment.OfficialAccountsFragment;
import com.zhang.mypracticemvp.view.fragment.ProjectFragment;
import com.zhang.mypracticemvp.view.fragment.SquareFragment;
import com.zhang.mypracticemvp.view.fragment.SystemFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 创建日期：6/8/22 3:20 PM
 *
 * @author zhangjiarui
 * 包名： com.zhang.mypracticemvp.view.activity
 * 类说明：主Activity
 */
public class HomeActivity extends FragmentActivity {

    @BindView(R.id.ha_frame)
    FrameLayout haFrame;
    @BindView(R.id.bottomNavigagionview)
    BottomNavigationView bottomNavigagionView;

    private static final int HOME = 0;
    private static final int SQUARE = 1;
    private static final int OFFICIAL = 2;
    private static final int SYSTEM = 3;
    private static final int PROJECT = 4;

    private List<String> fragmentList;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initImmersionBar();
        fragmentList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.tab)));
        fragmentManager = getSupportFragmentManager();
        showFragment(HOME);
        initViewPager();
    }

    private void showFragment(int index) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        for (int i = 0; i < fragmentList.size(); i++) {
            // 预加载所有Fragment
            Fragment fragment = fragmentManager.findFragmentByTag(fragmentList.get(i));
            if(fragment == null){
                fragment = instantFragment(i);
            }

            if(!fragment.isAdded()){
                fragmentTransaction.add(R.id.ha_frame,fragment,fragmentList.get(i));
            }

            // 显示当前fragment,隐藏其他fragment
            if(i == index){
                fragmentTransaction.show(fragment);
            }else {
                fragmentTransaction.hide(fragment);
            }
        }
        fragmentTransaction.commitAllowingStateLoss();
    }

    private Fragment instantFragment(int index) {
        switch (index){
            case HOME:
                return HomeFragment.newInstance("","");
            case SQUARE:
                return SquareFragment.newInstance("","");
            case OFFICIAL:
                return OfficialAccountsFragment.newInstance("","");
            case SYSTEM:
                return SystemFragment.newInstance("","");
            case PROJECT:
                return ProjectFragment.newInstance("","");
            default:
                return HomeFragment.newInstance("","");
        }
    }


    private void initViewPager() {
        bottomNavigagionView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int index = 0;
                switch (item.getItemId()) {
                    case R.id.navigation1:
                        index = HOME;
                        break;
                    case R.id.navigation2:
                        index = SQUARE;
                        break;
                    case R.id.navigation3:
                        index = OFFICIAL;
                        break;
                    case R.id.navigation4:
                        index = SYSTEM;
                        break;
                    case R.id.navigation5:
                        index = PROJECT;
                        break;
                }
                showFragment(index);
                return true;
            }
        });

    }
    private void initImmersionBar() {
        ImmersionBar.with(this)
                .statusBarColor(com.zhang.mvp.R.color.white)
                .statusBarDarkFont(true)
                .fitsSystemWindows(true)
                .init();
    }
}
