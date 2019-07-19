package com.rathana.dagger2demo.app.di.component;


import android.app.Application;

import com.rathana.dagger2demo.LoginActivity;
import com.rathana.dagger2demo.MainActivity;
import com.rathana.dagger2demo.app.di.module.ApplicationModule;
import com.rathana.dagger2demo.entity.Person;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(Application application);

    @Named("AppName")
    String getAppName();

    @Named("person")
    Person getPerson();

}
