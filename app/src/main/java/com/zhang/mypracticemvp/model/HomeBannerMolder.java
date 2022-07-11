package com.zhang.mypracticemvp.model;

import com.zhang.mvp.base.BaseModel;
import com.zhang.mvp.constant.NetType;
import com.zhang.mvp.databean.HomeBannerBean;
import com.zhang.mvp.interfaces.Callback;
import com.zhang.mvp.net.CommonSubscriber;
import com.zhang.mvp.net.HttpManager;
import com.zhang.mvp.utils.RxUtils;
import com.zhang.mypracticemvp.contract.IHomeBanner;


/**
 * 创建日期：6/10/22 7:26 PM
 *
 * @author zhangjiarui
 * 包名： com.zhang.mypracticemvp.model
 * 类说明：
 */
public class HomeBannerMolder extends BaseModel implements IHomeBanner.Model {
    @Override
    public void homeBannerModel(Callback callback) {

        addDisposable(HttpManager.getInstance().getService(NetType.deviceCollectsPictures).getHomeBannerData()
        .compose(RxUtils.rxScheduler())
        .subscribeWith(new CommonSubscriber<HomeBannerBean>(callback) {
            @Override
            public void onNext(HomeBannerBean homeBannerBean) {
                callback.success(homeBannerBean);
            }
        }));
    }
}
