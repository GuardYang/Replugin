package com.ysr.plugunit1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 若插件Activity继承AppCompatActivity，需要在清单文件设置主题
 * <p>
 * <p>
 * <p>
 * Created by ysr on 2017/7/5 17:00.
 * 邮箱 ysr200808@163.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
