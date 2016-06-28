package com.example.admin.learndagger;

import android.app.Application;
import android.util.Log;

import com.example.admin.learndagger.bean.A;
import com.example.admin.learndagger.bean.B;
import com.example.admin.learndagger.component.AppComponent;
import com.example.admin.learndagger.component.DaggerAppComponent;

import javax.inject.Inject;

/**
 * Created by admin on 2016-06-27.
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    AppComponent mAppComponent;

    @Inject
    public A a;

    @Inject
    public B b;

    @Override
    public void onCreate() {
        super.onCreate();


        Log.d(TAG,"开始注入Application:");
        mAppComponent = DaggerAppComponent.create();
    }

    public AppComponent appComponent(){
        return mAppComponent;
    }

}
