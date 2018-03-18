package com.udacity.gradle.builditbigger.backend;

import com.example.android.myjokes.myClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private myClass myData;
    public MyBean(){
        myData = new myClass();
    }

    public String getData() {
        return myData.getJoke();
    }

}