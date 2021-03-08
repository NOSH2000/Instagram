package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Initializes Parse SDK as soon as the application is created
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("c6QFwmJqY7AQdssWCIGn8MIyHg4VgDAkAEPwku1s")
                .clientKey("jU1Nt9ZaxYLjzVV1tc8psrM2YmRcyOzxdBBp86gX")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
