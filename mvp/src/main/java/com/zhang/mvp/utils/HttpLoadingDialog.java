package com.zhang.mvp.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

import com.zhang.mvp.R;


/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/19 9:30
 */
public class HttpLoadingDialog extends Dialog {
    /**
     * 加载提示
     */
    private TextView tvText;
    /**
     * 加载提示内容
     */
    private String title;
    private static Activity mParentActivity;
    private int layoutId;

    public HttpLoadingDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public HttpLoadingDialog(Context context, int theme, String title) {
        super(context, theme);
        this.title = title;
    }
    public HttpLoadingDialog(Context context, String title, int layout, int theme) {
        super(context,theme);
        this.title = title;
        this.layoutId = layout;
    }

    public HttpLoadingDialog(Context context) {
        super(context);
    }

    public HttpLoadingDialog(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (layoutId!=0){
            this.setContentView(layoutId);
        }else {
            this.setContentView(R.layout.layout_loading_http);
        }
        tvText = (TextView) findViewById(R.id.tv_loading_text);
        tvText.setText(title + "");
    }

    private static HttpLoadingDialog mLoadingDialog;

    public static HttpLoadingDialog showLoadingDialog(Context context, String title) {
        return showLoadingDialog(context, title, null);
    }

    public static HttpLoadingDialog showLoadingDialog(Context context, String title, OnCancelListener listener) {
        mParentActivity = (Activity) context;
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.tvText.setText(title + "");
        } else {
            mLoadingDialog = new HttpLoadingDialog(context, R.style.loading_dialog, title);
            mLoadingDialog.setCanceledOnTouchOutside(false);
        }
        if (listener != null) {
            mLoadingDialog.setOnCancelListener(listener);
        }
        if (mLoadingDialog != null && !mLoadingDialog.isShowing()) {
            mParentActivity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mLoadingDialog.show();
                }
            });
        }
        mLoadingDialog.setOnKeyListener(onKeyListener);
        return mLoadingDialog;
    }
    public static HttpLoadingDialog showLoadingDialog(Context context, String title, boolean cancelable) {
        mParentActivity = (Activity) context;

        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.setCancelable(cancelable);
            mLoadingDialog.tvText.setText(title + "");
        } else {
            mLoadingDialog = new HttpLoadingDialog(context, R.style.loading_dialog, title);
            mLoadingDialog.setCanceledOnTouchOutside(cancelable);
            mLoadingDialog.setCancelable(cancelable);
        }
        if (mLoadingDialog != null && !mLoadingDialog.isShowing())
        {  mLoadingDialog.show();}
        mLoadingDialog.setOnKeyListener(onKeyListener);
        return mLoadingDialog;
    }
    /**
     * 监听Dialog 按返回键的响应
     */
    private static OnKeyListener onKeyListener = new OnKeyListener() {
        @Override
        public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
            if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
                dismissLoadingDialog();
                mParentActivity.finish();
            }
            return false;
        }
    };

    public static void dismissLoadingDialog() {
        try {
            if (mParentActivity != null && !mParentActivity.isFinishing() && mLoadingDialog != null && mLoadingDialog.isShowing()) {
                mParentActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mLoadingDialog.cancel();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
