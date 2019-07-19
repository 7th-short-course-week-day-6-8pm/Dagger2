package com.rathana.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rathana.dagger2demo.app.MyApp;
import com.rathana.dagger2demo.entity.Person;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

//    @Inject
//    Person person;
    private static final String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        ((MyApp)getApplication()).getComponent().inject(this);
//        Log.e(TAG, "onCreate: "+person );
    }
}
