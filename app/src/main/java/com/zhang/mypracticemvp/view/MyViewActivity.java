package com.zhang.mypracticemvp.view;

import com.zhang.mvp.base.BaseActivity;
import com.zhang.mvp.interfaces.IBasePersenter;

public class MyViewActivity extends BaseActivity {
    @Override
    protected int getLayout() {
        return 0;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected IBasePersenter createPersenter() {
        return null;
    }

    @Override
    protected void initData() {

    }
}
