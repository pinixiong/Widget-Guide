package com.rj.guide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<SlideItem> list = new ArrayList<>();
        CustomBtn btn = new CustomBtn();
        btn.setName("档案资料");
        btn.setEvent("档案资料已选中");
        list.add(btn);

        btn = new CustomBtn();
        btn.setName("详细信息");
        btn.setEvent("详细信息已选中");
        btn.setIsCheck(true);
        list.add(btn);

        btn = new CustomBtn();
        btn.setName("查看档案");
        btn.setEvent("查看档案已选中");
        list.add(btn);

    /*    btn = new CustomBtn();
        btn.setName("查看记录");
        btn.setEvent("查看记录已选中");
        list.add(btn);*/


        SlideTitle slideTitle = (SlideTitle)findViewById(R.id.slideTitle);
        // 标题点击监听
        slideTitle
                .setSlideTitleOnClickListener(new SlideTitle.SlideTitleOnClickListener() {
                    @Override
                    public void slideTitleOnClick(SlideItem item) {
                        if (item instanceof CustomBtn){
                            CustomBtn btn = (CustomBtn)item;
                            Toast.makeText(getBaseContext(), btn.getEvent(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });
        slideTitle.setMidChildTitleFlow(list);
    }

}

