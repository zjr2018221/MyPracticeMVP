package com.zhang.mypracticemvp.view.fragment;

import android.os.Bundle;
import android.util.Log;

import com.zhang.mvp.base.BaseFragment;
import com.zhang.mvp.databean.HomeBannerBean;
import com.zhang.mypracticemvp.R;
import com.zhang.mypracticemvp.contract.IHomeBanner;
import com.zhang.mypracticemvp.presenter.HomeBannerPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页
 */
public class HomeFragment extends BaseFragment<IHomeBanner.Presenter> implements IHomeBanner.View {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
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
        imgList = new ArrayList<>();
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
        Log.e("qqq", "homeBannerView: "+homeBannerBean.getData().get(1).getTitle().toString() );
        List<HomeBannerBean.DataBean> data = homeBannerBean.getData();
        imgList.clear();
        imgList.addAll(data);
    }


}