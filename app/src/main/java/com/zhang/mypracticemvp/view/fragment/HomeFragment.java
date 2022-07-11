package com.zhang.mypracticemvp.view.fragment;

import android.os.Bundle;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.config.BannerConfig;
import com.youth.banner.config.IndicatorConfig;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.util.BannerUtils;
import com.zhang.mvp.base.BaseFragment;
import com.zhang.mvp.databean.HomeBannerBean;
import com.zhang.mypracticemvp.R;
import com.zhang.mypracticemvp.banner.ImageTitleAdapter;
import com.zhang.mypracticemvp.contract.IHomeBanner;
import com.zhang.mypracticemvp.presenter.HomeBannerPresenter;
import com.zhang.mypracticemvp.view.custom.MainToolBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 首页
 */
public class HomeFragment extends BaseFragment<IHomeBanner.Presenter> implements IHomeBanner.View {

    @BindView(R.id.fh_toolbar)
    MainToolBar fhToolbar;
    @BindView(R.id.fh_banner)
    Banner fhBanner;
    ////RecyclerView
//    implementation 'androidx.recyclerview:recyclerview:1.2.1'
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private List<HomeBannerBean.DataBean> imgList;

    public HomeFragment() {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {
        ChangeNavigation();
        imgList = new ArrayList<>();
    }

    private void ChangeNavigation() { // 改变导航栏
        fhToolbar.changeTitleText("玩Android");
    }

    @Override
    public IHomeBanner.Presenter createPresenter() {
        return new HomeBannerPresenter();
    }

    @Override
    public void initData() {
        persenter.homeBannerPresenter();
    }

    @Override
    public void homeBannerView(HomeBannerBean homeBannerBean) {
        Log.i("homeBannerView", "homeBannerView: " + homeBannerBean.getData().get(1).getTitle());
        List<HomeBannerBean.DataBean> data = homeBannerBean.getData();
        imgList.clear();
        imgList.addAll(data);
        setBanner(homeBannerBean);
    }

    private void setBanner(HomeBannerBean homeBannerBean){
//        fhBanner.setAdapter(new BannerImageAdapter<HomeBannerBean.DataBean>(homeBannerBean.getData()) {
//            @Override
//            public void onBindView(BannerImageHolder holder, HomeBannerBean.DataBean data, int position, int size) {
//
//
//                //图片加载自己实现
//                Glide.with(holder.itemView)
//                        .load(data.getImagePath())
//                        .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
//                        .into(holder.imageView);
//            }
//        })
//                .addBannerLifecycleObserver(this)//添加生命周期观察者
//                .setIndicator(new CircleIndicator(mContext));
        fhBanner.setAdapter(new ImageTitleAdapter(homeBannerBean.getData(),mContext));
        fhBanner.setIndicator(new CircleIndicator(mContext));
        fhBanner.setIndicatorGravity(IndicatorConfig.Direction.RIGHT);
        fhBanner.setIndicatorMargins(new IndicatorConfig.Margins(0, 0,
                BannerConfig.INDICATOR_MARGIN, BannerUtils.dp2px(12)));
    }

}