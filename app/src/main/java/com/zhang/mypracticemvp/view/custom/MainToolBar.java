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
    @BindView(R.id.mtb_text)
    TextView mtbText;
    @BindView(R.id.mtb_search)
    ImageView mtbSearch;

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


    @OnClick({R.id.mtb_side, R.id.mtb_search})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mtb_side: // 点击侧滑菜单

                break;
            case R.id.mtb_search: // 点击搜索

                break;
        }
    }
}
