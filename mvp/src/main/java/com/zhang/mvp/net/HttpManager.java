package com.zhang.mvp.net;

import android.util.Log;

import com.zhang.mvp.api.ServiceApi;
import com.zhang.mvp.app.MyApp;
import com.zhang.mvp.constant.NetConstant;
import com.zhang.mvp.constant.NetType;
import com.zhang.mvp.utils.SharedPrefrenceUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络请求
 * 整个项目全局使用
 */
public class HttpManager {

    private static HttpManager instance;

    public static HttpManager getInstance() {
        if (instance == null) {
            synchronized (HttpManager.class) {
                if (instance == null) {
                    instance = new HttpManager();
                }
            }
        }
        return instance;
    }

    private ServiceApi serviceApi;


    private Map<String, Retrofit> map = new HashMap<>();  //retrofit请求对象的对象池


    private Retrofit getRetrofit(String url) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url)
                .client(getOkHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    private OkHttpClient getOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(new LoggingInterceptor())
                .addInterceptor(new HeaderInterceptor())
                .build();
        return okHttpClient;
    }

    static class LoggingInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            HttpUrl url = request.url();
            String s = url.toString();
            Response response = chain.proceed(request);
            ResponseBody responseBody = response.peekBody(Integer.MAX_VALUE);
            Log.i("responseBody", responseBody.string());
            Log.i("responseBody11", s);
            return response;
        }
    }

    static class HeaderInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            String token = SharedPrefrenceUtils.getString(MyApp.mApplication, "token", "");
            Request request = chain.request().newBuilder()
                    .addHeader("X-Access-Token", token)
                    .build();
            return chain.proceed(request);
        }
    }

    /**
     * ServiceApi
     *
     * @return
     */
    public ServiceApi getService(NetType type) {
        if (serviceApi == null) {
            serviceApi = getRetrofit(getBaseUrl(type)).create(ServiceApi.class);
        }
        return serviceApi;
    }

    private String getBaseUrl(NetType type) {
        switch (type) {
            case base:
                return NetConstant.BASE_URL;
            case qinsi:
                return "http://192.168.0.118:6092/";
            case login://登录
                return "http://114.242.26.227:7025/"; // 61.240.138.137:7025   114.242.26.227:7025   61.240.138.137:7026
            case weatherStation://气象站详情
                return "http://114.242.26.227:7025/";
            case abc:
                return "http://192.168.0.118:6161/";
            case deviceCollectsPictures:
                return "https://www.wanandroid.com/";
            default:
                break;
        }
        return null;
    }

}
