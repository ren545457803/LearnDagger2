package com.example.admin.learndagger.component;

import com.example.admin.learndagger.MainActivity;
import com.example.admin.learndagger.annotation.PerActivity;

import dagger.Component;

/**
 * Created by admin on 2016-06-28.
 */
@PerActivity
@Component(dependencies = AppComponent.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
