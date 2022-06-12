package com.zhang.mvp.utils;

import android.app.Activity;
import android.widget.Toast;


/**
 * @author JWT
 */

public class ToastUtil {
    private static Toast toast;
    private static Toast toastView;

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static Toast showShort(final Activity context, CharSequence message) {
        if (message==null||"success".equals(message.toString())){
            message = "操作成功";
        }
        CharSequence finalMessage = message;
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (null == toast) {
                    toast = Toast.makeText(context, finalMessage, Toast.LENGTH_SHORT);
                } else {
                    toast.setText(finalMessage);
                }
                toast.show();
            }
        });
        return toast;
    }
  /*  *//**
     * 自定义布局短时间显示Toast
     *
     * @param context
     * @param message
     * @param isYes
     *//*
    public static Toast showShortOwn(final Activity context, CharSequence message, boolean isYes) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View toast_view = inflater.inflate(R.layout.toast_layout,null);
        ImageView imageView = toast_view.findViewById(R.id.img);
        TextView textView = toast_view.findViewById(R.id.text);
        textView.setText(message);
        if (isYes){
            imageView.setImageResource(R.mipmap.icon_toast_dui);
        }else {
            imageView.setImageResource(R.mipmap.icon_toast_tishi);
        }
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (null == toastView) {
                    toastView = new Toast(context);
                    toastView.setGravity(Gravity.BOTTOM, 0, 200);
                    toastView.setDuration(Toast.LENGTH_SHORT);
                }
                toastView.setView(toast_view);
                // 动画
                ObjectAnimator.ofFloat(imageView, "rotationY", 0, 360).setDuration(1700).start();
                toastView.show();
            }
        });
        return toastView;
    }*/
    /**
     * 长时间时间显示Toast
     *
     * @param context
     * @param message
     */
    public static Toast showLong(final Activity context, CharSequence message) {
        if (message==null||"success".equals(message.toString())){
            message = "操作成功";
        }
        CharSequence finalMessage = message;
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (null == toast) {
                    toast = Toast.makeText(context, finalMessage, Toast.LENGTH_SHORT);
                } else {
                    toast.setText(finalMessage);
                }
                toast.show();
            }
        });
        return toast;
    }
}
