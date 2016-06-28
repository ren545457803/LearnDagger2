package com.example.admin.learndagger;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.admin.learndagger.bean.A;
import com.example.admin.learndagger.bean.B;
import com.example.admin.learndagger.component.DaggerMainComponent;
import com.example.admin.learndagger.component.MainComponent;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    MainComponent component;

    @Inject
    public A a;
    @Inject
    public B b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "我擦");
                Log.d(TAG, "a:" + a);
                Log.d(TAG, "b:" + b);
            }
        });

        component = DaggerMainComponent.builder()
                .appComponent(((MyApplication)getApplication()).appComponent())
                .build();
        component.inject(this);
    }
}
