package com.rathana.dagger2demo.app.di.module;

import com.rathana.dagger2demo.entity.Person;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    @Named("person")
    public Person providePerson(){
        return  new Person(1,"Admin","female");
    }

    @Provides
    @Singleton
    @Named("url")
    public String provideBaseUrl(){
        return "https//:www.google.com.kh";
    };

    @Provides
    @Singleton
    @Named("AppName")
    public String provideAppName(){
        return "Dagger2 demo";
    }


//    @Provides
//    @Singleton
//    @Named("newUrl")
//    public String provideNewUrl(@Named("url") String url){
//        return url;
//    }

}

