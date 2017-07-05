package com.ysr.basereplugin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.qihoo360.replugin.RePlugin
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener { RePlugin.startActivity(this@MainActivity, RePlugin.createIntent("demo1", "com.qihoo360.replugin.sample.demo1.MainActivity")) }
    }
}
