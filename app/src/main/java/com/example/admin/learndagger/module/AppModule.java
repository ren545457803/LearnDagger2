package com.example.admin.learndagger.module;

import com.example.admin.learndagger.bean.B;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2016-06-27.
 */

@Module
public class AppModule {
    @Provides @Singleton public B provideB(){
        return new B();
    }
}
