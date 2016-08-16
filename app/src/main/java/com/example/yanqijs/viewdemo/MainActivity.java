package com.example.yanqijs.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import org.byteam.superadapter.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private RecyclerView mRecyclerView;
//    private TextAdapter mTextAdapter;
//    private List<TextModel> datas = new ArrayList<>();
//    public final static int MAX_TOUCH = 4;
//    private int touchCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initData();
//        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
//        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 6));
//        mTextAdapter = new TextAdapter(this, datas, R.layout.item_text);
//        mTextAdapter.setOnItemClickListener(new OnItemClickListener() {
//            @Override
//            public void onItemClick(View itemView, int viewType, int position) {
//                if (mTextAdapter.getData().get(position).isClick()) {
//                    mTextAdapter.getData().get(position).setClick(false);
//                    touchCount--;
//                    if (touchCount < 0) {
//                        touchCount = 0;
//                    }
//                } else {
//                    if (touchCount < MAX_TOUCH) {
//                        mTextAdapter.getData().get(position).setClick(true);
//                        touchCount++;
//                    }
//                }
//                mTextAdapter.notifyDataSetChanged();
//                Log.i("maintouch", touchCount + "");
//            }
//        });
//        mRecyclerView.setAdapter(mTextAdapter);
    }

//    private void initData() {
//        for (int i = 0; i < 12; i++) {
//            TextModel te = new TextModel();
//            te.setText_content("中");
//            te.setClick(false);
//            datas.add(te);
//        }
//    }
}
