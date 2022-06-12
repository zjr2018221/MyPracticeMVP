package com.zhang.mvp.mode.home;


import com.zhang.mvp.base.BaseModel;
import com.zhang.mvp.constant.NetType;
import com.zhang.mvp.interfaces.Callback;
import com.zhang.mvp.interfaces.home.IHome;
import com.zhang.mvp.mode.data.ChannelBean;
import com.zhang.mvp.net.CommonSubscriber;
import com.zhang.mvp.net.HttpManager;
import com.zhang.mvp.utils.RxUtils;

import io.reactivex.disposables.Disposable;

public class HomeModel extends BaseModel implements IHome.Model {
    @Override
    public void getHomeData(Callback callback) {
        Disposable disposable = HttpManager.getInstance().getService(NetType.base).getChannel()
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<ChannelBean>(callback) {
                    @Override
                    public void onNext(ChannelBean cityData) {
                        callback.success(cityData);
                    }
                });  //产生一个网络请求disposable对象
        addDisposable(disposable);  //把请求对象添加到对象池
    }

}
