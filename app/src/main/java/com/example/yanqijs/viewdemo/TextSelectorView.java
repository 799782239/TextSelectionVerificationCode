package com.example.yanqijs.viewdemo;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.byteam.superadapter.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yQ on 2016-08-16.
 */

public class TextSelectorView extends RelativeLayout {

    private RecyclerView mRecyclerView;
    private TextView mTextView;

    private TextAdapter mTextAdapter;

    private List<TextModel> datas = new ArrayList<>();


    public final static int MAX_TOUCH = 4;
    private int touchCount = 0;

    private String touchContent="";

    public TextSelectorView(Context context) {
        this(context, null);
    }

    public TextSelectorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextSelectorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = LayoutInflater.from(context).inflate(R.layout.view_text_selector, this);
        initData();
        initView(view, context);

    }

    private void initView(View view, Context mContext) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mTextView = (TextView) view.findViewById(R.id.text_content);
        mRecyclerView.setLayoutManager(new GridLayoutManager(mContext, 6));
        mTextAdapter = new TextAdapter(mContext, datas, R.layout.item_text);
        mTextAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int viewType, int position) {

                if (mTextAdapter.getData().get(position).isClick()) {
                    //撤销
                    mTextAdapter.getData().get(position).setClick(false);
                    touchCount--;
                    touchContent = deleteText(touchContent, mTextAdapter.getData().get(position).getText_content());
                    if (touchCount < 0) {
                        touchCount = 0;
                    }
                } else {
                    //添加
                    if (touchCount < MAX_TOUCH) {
                        mTextAdapter.getData().get(position).setClick(true);
                        touchContent = touchContent + mTextAdapter.getData().get(position).getText_content();
                        setText(touchContent);
                        touchCount++;
                    }
                }
                mTextAdapter.notifyDataSetChanged();
            }
        });
        mRecyclerView.setAdapter(mTextAdapter);
    }

    private void initData() {
        for (int i = 0; i < 12; i++) {
            TextModel te = new TextModel();
            te.setText_content("i" + i);
            te.setClick(false);
            datas.add(te);
        }
    }

    private void setText(String string) {
        mTextView.setText(string);
    }

    private String deleteText(String string, String delStr) {
        string = string.replace(delStr, "");
        setText(string);
        return string;
    }

}
