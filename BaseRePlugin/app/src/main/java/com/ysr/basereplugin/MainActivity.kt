package com.ysr.basereplugin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.qihoo360.replugin.RePlugin
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 宿主App主页
 *
 * Created by ysr on 2017/7/04 20:24.
 * 邮箱 yfeng1023@gmail.com
 *
 * 加载内置App直接将App文件属性改成jar
 * 安装一个外置插件RePlugin.install("/sdcard/demo.apk");
 *  RePlugin.install也可以用于插件升级
 *  RePlugin.uninstall插件卸载
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {//打开第一个app
            RePlugin.startActivity(this@MainActivity, RePlugin.createIntent("firstapp", "com.ysr.plugunit1.MainActivity"))
        }
        btnTwo.setOnClickListener {//打开第二个app
            RePlugin.startActivity(this@MainActivity, RePlugin.createIntent("twoapp", "com.ysr.plugunit2.MainActivity"))
        }
        butThree.setOnClickListener {//打开数据展示模块
            RePlugin.startActivity(this@MainActivity, RePlugin.createIntent("demo1", "com.qihoo360.replugin.sample.demo1.MainActivity"))
        }
    }
}
