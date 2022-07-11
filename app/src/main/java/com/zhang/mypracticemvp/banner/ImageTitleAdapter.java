package com.zhang.mypracticemvp.banner;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.youth.banner.adapter.BannerAdapter;
import com.zhang.mvp.databean.HomeBannerBean;
import com.zhang.mypracticemvp.R;

import java.util.List;

/**
 * 自定义Banner布局，图片+标题
 */

public class ImageTitleAdapter extends BannerAdapter<HomeBannerBean.DataBean, RecyclerView.ViewHolder> {

    private Context mContext;

    public ImageTitleAdapter(List<HomeBannerBean.DataBean> mData, Context context) {
        super(mData);
        this.mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_image_title, parent, false);
        return new BannerViewHolder(view);
    }

    @Override
    public void onBindView(RecyclerView.ViewHolder holder, HomeBannerBean.DataBean data, int position, int size) {
        BannerViewHolder viewHolder = (BannerViewHolder) holder;
        viewHolder.bannerText.setText(data.getTitle());
        Glide.with(mContext)
                .load(data.getImagePath())
//                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                .into(viewHolder.bannerImage);
    }

    public class BannerViewHolder extends RecyclerView.ViewHolder{
        ImageView bannerImage;
        TextView bannerText;
        public BannerViewHolder(View itemView) {
            super(itemView);
            bannerImage = itemView.findViewById(R.id.bannerImage);
            bannerText = itemView.findViewById(R.id.bannerTitle);
        }
    }
}
