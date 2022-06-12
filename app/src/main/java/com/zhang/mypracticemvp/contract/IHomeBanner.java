package com.zhang.mypracticemvp.contract;


import com.zhang.mvp.databean.HomeBannerBean;
import com.zhang.mvp.interfaces.Callback;
import com.zhang.mvp.interfaces.IBasePersenter;
import com.zhang.mvp.interfaces.IBaseView;
import com.zhang.mvp.interfaces.IModel;

/**
 * 创建日期：6/10/22 6:54 PM
 *
 * @author zhangjiarui
 * 包名： com.zhang.mypracticemvp.contract
 * 类说明：
 */
public interface IHomeBanner {

    interface View extends IBaseView {
        void homeBannerView(HomeBannerBean homeBannerBean);
    }

    interface Presenter extends IBasePersenter<View> {
        void homeBannerPresenter();
    }

    interface Model extends IModel {
        void homeBannerModel(Callback callback);
    }
}
