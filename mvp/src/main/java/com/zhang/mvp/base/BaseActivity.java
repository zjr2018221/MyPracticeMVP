package com.zhang.mvp.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zhang.mvp.interfaces.IBasePersenter;
import com.zhang.mvp.interfaces.IBaseView;
import com.zhang.mvp.utils.NetUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;



/**
 * activity基类
 * @param <P>
 */
public abstract class BaseActivity<P extends IBasePersenter> extends AppCompatActivity implements IBaseView {


    //p层关联
    protected P presenter;
    protected Unbinder unbinder; //butterknife
    private int netMobile;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        //需要界面view
        setContentView(getLayout());
        unbinder = ButterKnife.bind(this);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setNavigationBarColor(Color.WHITE);
            getWindow().setStatusBarColor(Color.WHITE);
        }
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
            //初始化界面

        inspectNet();
        initView();
        presenter = createPersenter();
        if(presenter != null){
            presenter.attachView(this);
        }
        //初始化界面数据
        initData();

    }
    /**
     * 初始化时判断有没有网络
     */

    public boolean inspectNet() {
        this.netMobile = NetUtil.getNetWorkState(this);
        return isNetConnect();

    }

    /**
     * 判断有无网络 。
     *
     * @return true 有网, false 没有网络.
     */
    public boolean isNetConnect() {
        if (netMobile == 1) {
//            Toast.makeText(this, "wifi连接", Toast.LENGTH_SHORT).show();
            return true;
        } else if (netMobile == 0) {
//            Toast.makeText(this, "数据连接", Toast.LENGTH_SHORT).show();
            return true;
        } else if (netMobile == -1) {
            Toast.makeText(this, "网络中断", Toast.LENGTH_SHORT).show();
            return false;
        }
        return false;
    }

    //定义一个获取当前界面的方法  由子类提供的
    protected abstract int getLayout();
    //初始化界面
    protected abstract void initView();
    //初始化p层的方法
    protected abstract P createPersenter();
    //初始化界面数据
    protected abstract void initData();


    @Override
    public void tips(String tip) {

    }

    @Override
    public void loading(int visible) {

    }

    @Override
    public void showToast(String msg, int time){
        Toast.makeText(this,msg,time).show();
    }

    /**
     * 界面销毁
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
        //释放p关联的v的引用
        if(presenter != null){
            presenter.unAttachView();
        }
    }


}
