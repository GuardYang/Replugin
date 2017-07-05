package com.ysr.basereplugin

import android.app.Application
import android.content.Context
import android.content.res.Configuration

import com.qihoo360.replugin.RePlugin

/**
 * Created by ysr on 2017/7/5 12:56.
 * 邮箱 ysr200808@163.com
 */

class BaseApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)

        RePlugin.App.attachBaseContext(this)

    }

    override fun onCreate() {
        super.onCreate()

        RePlugin.App.onCreate()

    }

    override fun onLowMemory() {
        super.onLowMemory()

        /* Not need to be called if your application's minSdkVersion > = 14 */
        RePlugin.App.onLowMemory()

    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)

        /* Not need to be called if your application's minSdkVersion > = 14 */
        RePlugin.App.onTrimMemory(level)

    }

    override fun onConfigurationChanged(config: Configuration) {
        super.onConfigurationChanged(config)

        /* Not need to be called if your application's minSdkVersion > = 14 */
        RePlugin.App.onConfigurationChanged(config)

    }
}