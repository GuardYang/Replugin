package com.ysr.basereplugin

import com.qihoo360.replugin.RePluginApplication

/**所有方法必须在UI线程来“同步”调用。切勿放到工作线程，或者通过post方法来执行
 *所有方法必须一一对应，例如 RePlugin.App.attachBaseContext 方法只在Application.attachBaseContext中调用
 *请将RePlugin.App的调用方法，放在“仅次于super.xxx()”方法的后面
 * Created by ysr on 2017/7/5 12:56.
 * 邮箱 ysr200808@163.com
 */
class BaseApplication : RePluginApplication()
//class BaseApplication : Application() {
//
//    override fun attachBaseContext(base: Context) {
//        super.attachBaseContext(base)
//
//        RePlugin.App.attachBaseContext(this)
//
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//
//        RePlugin.App.onCreate()
//
//    }
//
//    override fun onLowMemory() {
//        super.onLowMemory()
//
//        /* Not need to be called if your application's minSdkVersion > = 14 */
//        RePlugin.App.onLowMemory()
//
//    }
//
//    override fun onTrimMemory(level: Int) {
//        super.onTrimMemory(level)
//
//        /* Not need to be called if your application's minSdkVersion > = 14 */
//        RePlugin.App.onTrimMemory(level)
//
//    }
//
//    override fun onConfigurationChanged(config: Configuration) {
//        super.onConfigurationChanged(config)
//
//        /* Not need to be called if your application's minSdkVersion > = 14 */
//        RePlugin.App.onConfigurationChanged(config)
//
//    }
//}