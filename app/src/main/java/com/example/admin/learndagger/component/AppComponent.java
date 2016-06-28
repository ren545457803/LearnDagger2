package com.example.admin.learndagger.component;

import com.example.admin.learndagger.bean.B;
import com.example.admin.learndagger.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by admin on 2016-06-27.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    B getB();
}
