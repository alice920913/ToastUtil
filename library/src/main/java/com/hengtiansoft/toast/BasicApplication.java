package com.hengtiansoft.toast;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/**
 * ProjectName：ToastUtil
 * PackageName: com.hengtiansoft.toast
 * Description：
 *
 * @author zhuoyilu
 * Modifier：zhuoyilu
 * ModifyTime：2017/7/11 13:30
 * Comment：
 */

public class BasicApplication extends Application {
    /** application单例 **/
    private static BasicApplication sApp;

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
    }

    public static Context getAppContext() {
        return sApp;
    }

    public static Resources getAppResources() {
        return sApp.getResources();
    }
}
