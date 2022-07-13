package com.zhang.mypracticemvp.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.zhang.mypracticemvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 创建日期：6/8/22 4:22 PM
 *
 * @author zhangjiarui
 * 包名： com.zhang.mypracticemvp.view.custom
 * 类说明：
 */
public class MainToolBar extends Toolbar {

    @BindView(R.id.mtb_relative)
    RelativeLayout mtbRelative;
    @BindView(R.id.mtb_side)
    ImageView mtbSide;
    @BindView(R.id.mtb_goback)
    ImageView mtbGoBack;
    @BindView(R.id.mtb_text)
    TextView mtbText;
    @BindView(R.id.mtb_search)
    ImageView mtbSearch;
    @BindView(R.id.mtb_menu)
    ImageView mtbMenu;

    private Context mContext;

    public MainToolBar(Context context) {
        this(context, null);
    }

    public MainToolBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MainToolBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    private void initView() {
//        LayoutInflater.from(mContext).inflate( R.layout.main_toolbar, this);
        View.inflate(mContext, R.layout.main_toolbar, this);
        ButterKnife.bind(this);
    }

    public void changeTitleText(String msg) { // 更改标题文本
        mtbText.setText(msg);
    }

    public void  fatherPage(boolean isShow){ // 主页
        if(isShow){
            mtbSide.setVisibility(View.VISIBLE);
            mtbSearch.setVisibility(View.VISIBLE);
        }else {
            mtbGoBack.setVisibility(View.INVISIBLE);
            mtbMenu.setVisibility(View.INVISIBLE);
        }
    }

    public void sonPage(boolean isShow){ // 子页
        if(isShow){
            mtbGoBack.setVisibility(View.VISIBLE);
            mtbMenu.setVisibility(View.VISIBLE);
        }else {
            mtbSide.setVisibility(View.INVISIBLE);
            mtbSearch.setVisibility(View.INVISIBLE);
        }
    }


    @OnClick({R.id.mtb_side,R.id.mtb_side,R.id.mtb_search,R.id.mtb_menu,})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mtb_side:   // 点击侧滑菜单
                if(onTBClickListener != null){
                    onTBClickListener.onSideClickListener();
                }
                break;
            case R.id.mtb_goback: // 点击退出返回
                if(onTBClickListener != null){
                    onTBClickListener.onGoBackClickListener();
                }
                break;
            case R.id.mtb_search: // 点击搜索
                if(onTBClickListener != null){
                    onTBClickListener.onSearchClickListener();
                }
                break;
            case R.id.mtb_menu:   // 点击菜单
                if(onTBClickListener != null){
                    onTBClickListener.onMenuClickListener();
                }
                break;
        }
    }

    public interface OnTBClickListener{ // 点击事件接口回调
        void onSideClickListener();

        void onGoBackClickListener();

        void onSearchClickListener();

        void onMenuClickListener();
    }

    private OnTBClickListener onTBClickListener;

    public void setOnTBClickListener(OnTBClickListener onClick){
        this.onTBClickListener = onClick;
    }

    public abstract static class TBClickListener implements OnTBClickListener{ // 写一个抽象类，防止每个接口方法都显示
        @Override
        public void onGoBackClickListener() {
        }

        @Override
        public void onMenuClickListener() {

        }

        @Override
        public void onSearchClickListener() {

        }

        @Override
        public void onSideClickListener() {

        }
    }

}
