package com.zhang.mvp.base;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gyf.immersionbar.ImmersionBar;
import com.zhang.mvp.R;
import com.zhang.mvp.interfaces.IBasePersenter;
import com.zhang.mvp.interfaces.IBaseView;
import com.zhang.mvp.utils.NetUtil;
import com.zhang.mvp.utils.ToastUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseFragment<P extends IBasePersenter> extends Fragment implements IBaseView {

    protected P persenter;
    Unbinder unbinder;
    protected Context mContext;
    private int netMobile;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        View view = LayoutInflater.from(container.getContext()).inflate(getLayout(),null);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getActivity().getWindow().getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//            decorView.setSystemUiVisibility(option);
//            getActivity().getWindow().setNavigationBarColor(Color.TRANSPARENT);
//            getActivity().getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }
//        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
//            getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//        }
        mContext = getContext();
        unbinder = ButterKnife.bind(this,view);
        persenter = createPresenter();
        if(persenter != null){
            persenter.attachView(this);
        }
        inspectNet();
        initView();
        initData();
    }

    /**
     * 初始化时判断有没有网络
     */

    public boolean inspectNet() {
        this.netMobile = NetUtil.getNetWorkState(getActivity());
        return isNetConnect();

    }

    /**
     * 判断有无网络 。
     *
     * @return true 有网, false 没有网络.
     */
    public boolean isNetConnect() {
        if (netMobile == 1) {
            return true;
        } else if (netMobile == 0) {
            return true;
        } else if (netMobile == -1) {
            Toast.makeText(getActivity(), "网络中断", Toast.LENGTH_SHORT).show();
            return false;
        }
        return false;
    }

    public abstract int getLayout();

    public abstract void initView();

    public abstract P createPresenter();

    public abstract void initData();

    @Override
    public void tips(String tip) {

    }

    @Override
    public void loading(int visible) {

    }

    @Override
    public void showToast(String msg, int time){
        ToastUtil.showShort(getActivity(),msg);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
        if(persenter != null){
            persenter.unAttachView();
        }
    }
}
