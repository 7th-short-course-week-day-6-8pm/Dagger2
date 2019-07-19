package com.rathana.dagger2demo.app;

import android.app.Application;
import android.app.Person;
import android.util.Log;

import com.rathana.dagger2demo.app.di.component.ApplicationComponent;
import com.rathana.dagger2demo.app.di.component.DaggerApplicationComponent;

import javax.inject.Inject;

public class MyApp extends Application {
    private ApplicationComponent component;

    Person person;
    @Inject
    public void setPerson(Person person) {
        this.person = person;
    }

    private static final String TAG = "MyApp";
    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerApplicationComponent.builder().build();
        component.inject(this);

        Log.e(TAG, "onCreate: " +person);
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
