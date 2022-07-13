package com.zhang.mypracticemvp.webview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.zhang.mypracticemvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * WebView
 */
public class CommonWebView extends WebView {

    @BindView(R.id.webview)
    WebView webView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    private Context mContext;

    public CommonWebView(Context context) {
        this(context, null);
    }

    public CommonWebView(Context context, AttributeSet attrs) {
        this(context,null,0);
    }

    public CommonWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        setWebView();
    }

    private void initView() {
        View.inflate(mContext, R.layout.view_webview ,this);
        ButterKnife.bind(this);
    }

    private void setWebView() { // 设置WebView属性
        webView.requestFocus();
        webView.requestFocusFromTouch();
//        webView.setWebViewClient(getWebViewClient());
        webView.setWebChromeClient(getWebChromeClient());

        WebSettings webSettings = webView.getSettings();
//        webSettings.setUserAgentString(webView.getSettings().getUserAgentString() + WEBVIEW_USER_AGENT);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);//支持通过JS打开新窗口
        webSettings.setAllowFileAccess(true);// 设置可以访问文件
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);//设置可以访问URL
        webSettings.setGeolocationEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        /*五种缓存模式的设置setCacheMode：
        LOAD_CACHE_ONLY: 不使用网络，只读取本地缓存数据。
        LOAD_DEFAULT: 根据cache-control决定是否从网络上取数据。
        LOAD_CACHE_NORMAL: API level 17中已经废弃, 从API level 11开始作用同LOAD_DEFAULT模式。
        LOAD_CACHE_ELSE_NETWORK:
        LOAD_NO_CACHE: 不使用缓存，只从网络获取数据。*/
//        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //设置缓存模式(后续建议bhfae.com下的设置为LOAD_CACHE_ELSE_NETWORK,其他默认)
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT); //设置缓存模式 (为了兼容,暂时使用默认)
        webSettings.setDomStorageEnabled(true);// 设置是否开启DOM存储API权限
        webSettings.setDatabaseEnabled(true); //设置是否开启数据库存储API权限
        webSettings.setAppCacheEnabled(true);
//        String cacheDirPath = mContext.getFilesDir().getAbsolutePath() + BHFAE_WEBVIEW_CACHE;
//        webSettings.setAppCachePath(cacheDirPath);

        //设置自适应屏幕，两者合用
        webSettings.setUseWideViewPort(true); //将图片调整到适合webview的大小
        webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);//设置webView自适应页面
        webSettings.setTextZoom(100);//设置webview里的字体不跟随系统字体发生改变,默认100
        webSettings.setSupportZoom(false); // 设置支持缩放,默认为true
        webSettings.setBuiltInZoomControls(false);// 设置出现缩放工具,若为 false 不可缩放
        webSettings.setDisplayZoomControls(false);// 隐藏原生的缩放控件
        webSettings.setSavePassword(false); //关闭密码保存
        webSettings.setSaveFormData(false); // 是否记录并提示用户填充对应form元素，内核默认是true
    }

    public WebChromeClient getWebChromeClient(){
        return new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress >= 80) {
                    progressBar.setVisibility(GONE);
                } else {
                    progressBar.setVisibility(View.VISIBLE);
                    progressBar.setProgress(newProgress);
                }
            }
        };
    }
}
