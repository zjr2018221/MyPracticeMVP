package com.zhang.mvp.base;

import com.zhang.mvp.interfaces.IBasePersenter;
import com.zhang.mvp.interfaces.IBaseView;
import java.lang.ref.WeakReference;


/**
 * p层的基类
 */
public abstract class BasePersenter<V extends IBaseView> implements IBasePersenter<V> {

    protected V mView;
    //通过弱引用把V层关联
    WeakReference<V> weakReference;


    @Override
    public void attachView(V view) {
        weakReference = new WeakReference<V>(view);
        mView = weakReference.get();
    }

    @Override
    public void unAttachView() {
        mView = null;
    }

}
