package com.ysr.plugunit1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qihoo360.replugin.loader.a.PluginAppCompatActivity;

/**
 * 若插件Activity继承AppCompatActivity，需要在清单文件设置主题
 * <p>
 * Created by ysr on 2017/7/5 17:00.
 * 邮箱 ysr200808@163.com
 */
public class MainActivity extends PluginAppCompatActivity {

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
