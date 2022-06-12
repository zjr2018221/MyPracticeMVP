package com.zhang.mypracticemvp.presenter;

import android.util.Log;
import android.widget.Toast;

import com.zhang.mvp.base.BasePersenter;
import com.zhang.mvp.interfaces.Callback;
import com.zhang.mvp.databean.HomeBannerBean;
import com.zhang.mypracticemvp.contract.IHomeBanner;
import com.zhang.mypracticemvp.model.HomeBannerMolder;

/**
 * 创建日期：6/10/22 7:22 PM
 *
 * @author zhangjiarui
 * 包名： com.zhang.mypracticemvp.presenter
 * 类说明：
 */
public class HomeBannerPresenter extends BasePersenter<IHomeBanner.View> implements IHomeBanner.Presenter{
    IHomeBanner.Model model;

    public HomeBannerPresenter(){
        this.model = new HomeBannerMolder();
    }

    @Override
    public void homeBannerPresenter() {
        model.homeBannerModel(new Callback<HomeBannerBean>() {
            @Override
            public void fail(String msg) {
                mView.showToast(msg, Toast.LENGTH_SHORT);
            }

            @Override
            public void success(HomeBannerBean bean) {
                if(mView != null){
                    mView.homeBannerView(bean);
                }
            }
        });
    }
}
