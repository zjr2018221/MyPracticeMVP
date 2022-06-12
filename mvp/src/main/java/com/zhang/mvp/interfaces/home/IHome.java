package com.zhang.mvp.interfaces.home;


import com.zhang.mvp.interfaces.Callback;
import com.zhang.mvp.interfaces.IBasePersenter;
import com.zhang.mvp.interfaces.IBaseView;
import com.zhang.mvp.interfaces.IModel;
import com.zhang.mvp.mode.data.ChannelBean;

/**
 * home页面的契约类接口
 */
public interface IHome {

    interface View extends IBaseView {

        void homeReturn(ChannelBean result); //接收home数据加载返回

    }

    interface Presenter extends IBasePersenter<View> {
        void getHome();  //获取home页面数据的接口
    }

    interface Model extends IModel {
        //加载主页数据
        void getHomeData(Callback callback);
    }
}
