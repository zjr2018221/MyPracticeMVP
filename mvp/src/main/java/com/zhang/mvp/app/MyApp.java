package com.zhang.mvp.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.tencent.bugly.crashreport.CrashReport;
import java.util.Locale;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/7 20:31
 */
public class MyApp extends Application {

    public static Context mApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = getApplicationContext();
        //bugly
//        CrashReport.initCrashReport(getApplicationContext(), "d528d30a77", false);
//        JPushInterface.setDebugMode(true);
//        JPushInterface.init(this);
//        initAutoSize();
    }
    //https://blog.csdn.net/luo_boke/article/details/108594891
//    private void initAutoSize() {
//        //当 App 中出现多进程, 并且您需要适配所有的进程, 就需要在 App 初始化时调用 initCompatMultiProcess()
//        AutoSize.initCompatMultiProcess(this);
//        AutoSize.checkAndInit(this);
//        AutoSizeConfig.getInstance()
//                .setCustomFragment(true)
//                .setExcludeFontScale(true)
////                .setPrivateFontScale(0.9f)
//                .setLog(false)
////                .setBaseOnWidth(true)
////                .setUseDeviceSize(true)
//                //屏幕适配监听器
//                .setOnAdaptListener(new onAdaptListener() {
//                    @Override
//                    public void onAdaptBefore(Object target, Activity activity) {
////                        AutoSizeConfig.getInstance().setScreenWidth(ScreenUtils.getScreenSize(activity)[0]);
////                        AutoSizeConfig.getInstance().setScreenHeight(ScreenUtils.getScreenSize(activity)[1]);
//                        AutoSizeLog.d(String.format(Locale.ENGLISH, "%s onAdaptBefore!", target.getClass().getName()));
//                    }
//
//                    @Override
//                    public void onAdaptAfter(Object target, Activity activity) {
//                        AutoSizeLog.d(String.format(Locale.ENGLISH, "%s onAdaptAfter!", target.getClass().getName()));
//                    }
//                });
////        configUnits();
//    }

    public static Context getContext() {
        return mApplication;
    }

//    private void configUnits() {
//        AutoSizeConfig.getInstance()
//                .getUnitsManager()
//                .setSupportDP(true)
//                .setDesignSize(750, 1335)
//                .setSupportSP(true)
//                .setSupportSubunits(Subunits.MM);
//    }
    /**
     * 获取系统上下文：用于ToastUtil类
     */
    public static Context getAppContext() {
        return mApplication;
    }

}
