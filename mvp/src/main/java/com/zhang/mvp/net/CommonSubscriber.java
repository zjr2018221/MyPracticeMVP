package com.zhang.mvp.net;

import android.text.TextUtils;
import android.util.Log;

import com.zhang.mvp.interfaces.Callback;
import com.zhang.mvp.utils.HttpLoadingDialog;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * 处理网络请求结果的错误和完成
 *
 * @param <T>
 */
public abstract class CommonSubscriber<T> extends ResourceSubscriber<T> {

    private Callback callback;
    private String errorMsg;
    private boolean isShowErrorState = false;

    protected CommonSubscriber(Callback callback) {
        this.callback = callback;
    }

    protected CommonSubscriber(Callback callback, String emsg) {
        this.callback = callback;
        errorMsg = emsg;
    }

    @Override
    public void onError(Throwable t) {
        //LoadingUtil.getInstance().hideLoading();
        Log.e("TAG", "fail: " + t.getMessage());
        if (callback == null) return;
        if (t.getMessage() != null && t.getMessage().contains("401")) {

        }
        if (t.getMessage() != null) {
            HttpLoadingDialog.dismissLoadingDialog();
            callback.fail(t.getMessage());
        }
        if (errorMsg != null && TextUtils.isEmpty(errorMsg)) {
            HttpLoadingDialog.dismissLoadingDialog();
            callback.fail(errorMsg);
        }
    }

    @Override
    public void onComplete() {
        //LoadingUtil.getInstance().hideLoading();
        //mView.showLoading(View.GONE);
    }
}
