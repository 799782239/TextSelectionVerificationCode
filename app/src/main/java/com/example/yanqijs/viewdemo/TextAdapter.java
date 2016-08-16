package com.example.yanqijs.viewdemo;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;

import org.byteam.superadapter.IMulItemViewType;
import org.byteam.superadapter.SuperAdapter;
import org.byteam.superadapter.internal.SuperViewHolder;

import java.util.List;

/**
 * Created by yanqijs on 2016/8/16.
 */

public class TextAdapter extends SuperAdapter<TextModel> {

    public TextAdapter(Context context, List<TextModel> items, int layoutResId) {
        super(context, items, layoutResId);
    }

    public TextAdapter(Context context, List<TextModel> items, IMulItemViewType<TextModel> mulItemViewType) {
        super(context, items, mulItemViewType);
    }

    @Override
    public void onBind(SuperViewHolder holder, int viewType, int layoutPosition, TextModel item) {
        if (getData().get(layoutPosition).isClick()) {
            holder.setBackgroundColor(R.id.text, Color.GREEN);
        } else {
            holder.setBackgroundColor(R.id.text, mContext.getResources().getColor(R.color.colorAccent));
        }
        if (!TextUtils.isEmpty(getData().get(layoutPosition).getText_content())) {
            holder.setText(R.id.text, getData().get(layoutPosition).getText_content());
        }
    }
}
