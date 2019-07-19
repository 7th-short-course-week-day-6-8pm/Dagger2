package com.rathana.dagger2demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.rathana.dagger2demo.app.MyApp;
import com.rathana.dagger2demo.app.di.component.ActivityComponent;
import com.rathana.dagger2demo.app.di.component.ApplicationComponent;
import com.rathana.dagger2demo.app.di.component.DaggerActivityComponent;
import com.rathana.dagger2demo.app.di.component.DaggerApplicationComponent;
import com.rathana.dagger2demo.entity.Person;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("Theary")
    Person person;
//
//
//    String baseUrl;
//
    @Inject @Named("AppName") String appName;
//
//    @Inject
//    public void setBaseUrl(@Named("url")String baseUrl) {
//        this.baseUrl = baseUrl;
//    }

    @Inject @Named("person") Person admin;

    ActivityComponent component;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //component= DaggerApplicationComponent.builder().build();
        //component= ((MyApp) getApplication()).getComponent();
        //component.inject(this);

        component = DaggerActivityComponent.builder()
                    .applicationComponent(((MyApp) getApplication()).getComponent())
                    .build();
        component.inject(this);

         Log.e(TAG, "onCreate: "+person );
//        Log.e(TAG, "onCreate: BaseUrl " +baseUrl);
        Log.e(TAG, "onCreate: App name " +appName);
        Log.e(TAG, "onCreate: "+admin );

    }

    public void goToLogin(View view){
        startActivity(new Intent(this,LoginActivity.class));
    }
}
