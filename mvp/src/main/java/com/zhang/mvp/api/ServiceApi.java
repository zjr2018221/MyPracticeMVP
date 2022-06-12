package com.zhang.mvp.api;


import com.zhang.mvp.constant.NetConstant;
import com.zhang.mvp.databean.HomeBannerBean;
import com.zhang.mvp.mode.data.BacklogDisposePoliceBean;
import com.zhang.mvp.mode.data.BacklogDisposePoliceDetailsBean;
import com.zhang.mvp.mode.data.BacklogFarmingTaskBean;
import com.zhang.mvp.mode.data.BaseBean;
import com.zhang.mvp.mode.data.ChangePassWordBean;
import com.zhang.mvp.mode.data.ChannelBean;
import com.zhang.mvp.mode.data.DelDevicePicturesBean;
import com.zhang.mvp.mode.data.DevicePicturesBean;
import com.zhang.mvp.mode.data.EquipmentCenterBean;
import com.zhang.mvp.mode.data.EquipmentCenterItemBean;
import com.zhang.mvp.mode.data.EquipmentCenterTypeBean;
import com.zhang.mvp.mode.data.EquipmentControlSuccessBean;
import com.zhang.mvp.mode.data.EquipmentStatusControlBean;
import com.zhang.mvp.mode.data.ExecuteFarmingTaskBean;
import com.zhang.mvp.mode.data.HistoricalDataCurveBean;
import com.zhang.mvp.mode.data.HistoricalDataHeaderBean;
import com.zhang.mvp.mode.data.HomeWeatherInfoBean;
import com.zhang.mvp.mode.data.LineChartBean;
import com.zhang.mvp.mode.data.LoginSuccessBean;
import com.zhang.mvp.mode.data.MessageBean;
import com.zhang.mvp.mode.data.ParkDetectionBean;
import com.zhang.mvp.mode.data.PengInfoBean;
import com.zhang.mvp.mode.data.PestStatisticsBean;
import com.zhang.mvp.mode.data.ShuiFeiAndWenShiBean;
import com.zhang.mvp.mode.data.VersionBean;
import com.zhang.mvp.mode.data.WeatherStationBean;

import java.util.HashMap;

import java.util.List;
import java.util.Map;


import io.reactivex.Flowable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ServiceApi {


    @GET("banner/json")
    Flowable<HomeBannerBean> getHomeBannerData();

    @GET(NetConstant.CHANNEL_DATA)
    Flowable<ChannelBean> getChannel();

    //检查版本信息
    @POST("sys/district/app/comments")
    Flowable<VersionBean> getVersionInfo(@Query("tionCation") int code);
    //首页数据
    @GET("sys/district/home/info")
    Flowable<ParkDetectionBean> getHomeData(@QueryMap Map<String, Object> map);

    //水肥一体化  温室控制  病虫害监测列表接口
    @GET("sys/district/home/list")
    Flowable<ShuiFeiAndWenShiBean> getShuiFeiAndWenShiData(@QueryMap Map<String, Object> map);


    //设备中心  查询设备列表
    @GET("sys/equipment/equipment/list")
    Flowable<EquipmentCenterBean> getEquipmentCenterData(@QueryMap Map<String, Object> map);

    //查询设备类型
    @GET("sys/district/home/list-type")
    Flowable<EquipmentCenterTypeBean> getEquipmentCenterType(@QueryMap Map<String, Object> map);

    //查询所有区域类型
    @GET("sys/district/sitetype/list-all")
    Flowable<List<EquipmentCenterItemBean>> getEquipmentCenterItemType();

    //登录接口
    @POST("sys/sso/sys/login")
    Flowable<LoginSuccessBean> getLogin(@Body RequestBody requestBody);//登录

    //详情
    @GET("sys/equipment/equipment/queryByIdDetails")
    Flowable<WeatherStationBean> getWeatherStation(@QueryMap HashMap<String, Object> requestBody);

    //历史 筛选
    @GET("sys/product/profile/listProfileWithEquipmentId")
    Flowable<HistoricalDataHeaderBean> getWeatherStationSelect(@QueryMap HashMap<String, Object> requestBody);

    @GET("sys/data/data/queryByIdList")
    Flowable<HistoricalDataCurveBean> getHistoricalDataCurve(@QueryMap HashMap<String, Object> map);

    //详情折线图
    @GET("sys/data/data/queryByStatisticHour")
    Flowable<LineChartBean> getLineChartBean(@QueryMap HashMap<String, Object> map);

    //设备状态/设备控制
    @GET("sys/data/data/queryHistoryPageByIdList")
    Flowable<EquipmentStatusControlBean> getQueryHistoryPageByIdList(@QueryMap HashMap<String, Object> map);

    //查询待执行农事任务
    @GET("sys/district/task/staylistAPP")
    Flowable<BacklogFarmingTaskBean> getBacklogFarmingTaskData(@QueryMap Map<String, Object> map);

    //查询已完成农事任务
    @GET("sys/district/task/alistAPP")
    Flowable<BacklogFarmingTaskBean> getFarmRecordCompleteData(@QueryMap Map<String, Object> map);

    //查询已完成农事任务详情
    @GET("sys/district/task/selectSuperId")
    Flowable<ExecuteFarmingTaskBean> getExecuteFarmingTaskDetailsData(@QueryMap Map<String, Object> map);

    /*
     *执行农事接口
     */
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("sys/district/farming/insertAPP")
    Flowable<BaseBean> postExecuteFarmingTask(@Body RequestBody route);

    //获取消息列表
    @GET("sys/district/msg/list")
    Flowable<MessageBean> getMessageData(@QueryMap Map<String, Object> map);

    //分页查询设备采集的图片
    @GET("sys/equipment/image/page")
    Flowable<DevicePicturesBean> getDevicePictures(@QueryMap Map<String, Object> map);

    //删除设备采集的图片
    @DELETE("sys/equipment/image/delete")
    Flowable<DelDevicePicturesBean> delDevicePictures(@QueryMap Map<String, Object> map);

    //查询报警通知   0未处理   1  已处理
    @GET("/sys/district/iotAlarm/list")
    Flowable<BacklogDisposePoliceBean> getBacklogDisposePoliceData(@QueryMap Map<String, Object> map);

    //查询报警通知详情
    @GET("/sys/district//iotAlarm/detail")
    Flowable<BacklogDisposePoliceDetailsBean> getBacklogDisposePoliceDetailsData(@QueryMap Map<String, Object> map);

    /*
     *执行报警接口
     */
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("sys/district/iotAlarm/add")
    Flowable<BaseBean> postDisposePoliceSubmit(@Body RequestBody route);


    /**
     * 修改密码
     */
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @PUT("/sys/user/user/password")
    Flowable<ChangePassWordBean> postChangePassWord(@Body RequestBody route);

    /**
     * 虫情
     */
    @GET("/sys/district/insect/info")
    Flowable<PestStatisticsBean> getPestStatistics(@QueryMap Map<String, Object> map);

    /**
     * 设备控制上传
     */
    @POST("sys/mqtt/sub/subControlCommandAPP")
    Flowable<EquipmentControlSuccessBean> getSubEquipmentControl(@Body RequestBody requestBody);

    /**
     * 首页气象数据
     */
    @GET("sys/weather/weather/liveMonitoringData")
    Flowable<HomeWeatherInfoBean> getHomeWeatherInfo();

    /*
     * 棚管家控制
     */
    @GET("sys/data/sdata/queryPengControlData")
    Flowable<PengInfoBean> pengInfo(@QueryMap Map<String, Object> map);

    @POST("sys/mqtt/sub/subPengControlCommandAPP")
    Flowable<BaseBean> zhiXingPengCOntrolCommand(@Body RequestBody requestBody);

    @GET("sys/mqtt/sub/cancelExecutingCommandAPP")
    Flowable<BaseBean> quxiaoPengControl(@QueryMap Map<String, Object> map);
}
