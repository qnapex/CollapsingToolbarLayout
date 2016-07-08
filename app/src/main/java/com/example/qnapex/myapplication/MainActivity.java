package com.example.qnapex.myapplication;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Gravity;

import com.example.qnapex.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onBackPressed();
//            }
//        });

        //使用CollapsingToolbarLayout必须把title设置到CollapsingToolbarLayout上，设置到Toolbar上则不会显示
        databinding.collapsingToolbarLayout.setTitle("测试");
        //通过CollapsingToolbarLayout修改字体颜色
        databinding.collapsingToolbarLayout.setExpandedTitleColor(Color.TRANSPARENT);//设置还没收缩时状态下字体颜色
        databinding.collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);//设置收缩后Toolbar上字体的颜色
        databinding.collapsingToolbarLayout.setCollapsedTitleGravity(Gravity.CENTER_HORIZONTAL);

        databinding.recyclerview.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        databinding.recyclerview.addItemDecoration(new SpaceItemDecoration(this));
        databinding.recyclerview.setAdapter(new RecyclerAdapter(this));


//        ListView listView = (ListView) findViewById(R.id.listView);
//        ListAdapter listAdapter = new ListAdapter(this);
//        listView.setAdapter(listAdapter);
    }
}
