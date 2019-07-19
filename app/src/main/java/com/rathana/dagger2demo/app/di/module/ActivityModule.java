package com.rathana.dagger2demo.app.di.module;

import com.rathana.dagger2demo.app.di.scope.ActivityScope;
import com.rathana.dagger2demo.entity.Person;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    @ActivityScope
    @Named("Theary")
    public Person provideTheary(){
        return new Person(2,"Theary","female");
    }
}
