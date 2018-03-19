package com.my.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
//
//创建布局管理器，例如：LinearLayout ll
//创建界面组件 例如：Button bt
//向容器ll中添加bt ll.addView(bt)
//为界面组件添加属性  bt.setOnClickListener(...)
public class MainActivity extends AppCompatActivity {
    int[] images=new int[]{R.mipmap.img1,R.mipmap.img2,R.mipmap.img3};
    int currentimage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout main_ll = (LinearLayout) findViewById(R.id.main_ll);
        final ImageView iv = new ImageView(this);
        main_ll.addView(iv);

        iv.setImageResource(images[currentimage]);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentimage>=2){
                    currentimage=-1;
                }
                iv.setImageResource(images[++currentimage]);
            }
        });

    }
}
