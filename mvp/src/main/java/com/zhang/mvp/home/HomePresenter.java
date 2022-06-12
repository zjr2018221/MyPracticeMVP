package com.zhang.mvp.home;

import android.widget.Toast;

import com.zhang.mvp.base.BasePersenter;
import com.zhang.mvp.interfaces.Callback;
import com.zhang.mvp.interfaces.home.IHome;
import com.zhang.mvp.mode.data.ChannelBean;
import com.zhang.mvp.mode.home.HomeModel;


/**
 *
 */
public class HomePresenter extends BasePersenter<IHome.View> implements IHome.Presenter {

    IHome.Model model;
    public HomePresenter(){
        model = new HomeModel();
    }

    @Override
    public void getHome() {
        model.getHomeData(new Callback<ChannelBean>() {
            @Override
            public void fail(String msg) {
                if(mView != null){
                    mView.showToast(msg, Toast.LENGTH_SHORT);
                }
            }

            @Override
            public void success(ChannelBean result) {
                if(mView != null){
                    mView.homeReturn(result);
                }
            }
        });
    }
}
