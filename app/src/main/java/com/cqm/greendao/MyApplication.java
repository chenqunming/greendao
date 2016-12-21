package com.cqm.greendao;

import android.app.Application;
import android.content.Context;

import com.cqm.greendao.db.GreenDaoManager;

/**
 * Created by chenqm on 2016/12/20.
 */

public class MyApplication extends Application {

    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        //greenDao全局配置,只希望有一个数据库操作对象
        GreenDaoManager.getInstance();
    }
    public static Context getContext() {
        return mContext;
    }
}
