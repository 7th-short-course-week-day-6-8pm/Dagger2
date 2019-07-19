package com.rathana.dagger2demo.app.di.component;

import android.app.Person;

import com.rathana.dagger2demo.LoginActivity;
import com.rathana.dagger2demo.MainActivity;
import com.rathana.dagger2demo.app.di.module.ActivityModule;
import com.rathana.dagger2demo.app.di.scope.ActivityScope;

import javax.inject.Named;
import javax.inject.Qualifier;

import dagger.Component;
import dagger.Provides;

@Component(modules = {ActivityModule.class},
dependencies ={ApplicationComponent.class})
@ActivityScope
public interface ActivityComponent {

    void inject(MainActivity activity);
    void inject(LoginActivity activity);

//    @Named("person")
//    Person getPerson();

}
