package com.example.android.myjokes;

import java.util.ArrayList;
import java.util.Random;

public class myClass {
    private ArrayList<String> strings ;
    public myClass(){
        strings = new ArrayList<>();
        strings.add("Dinosaurs can not do push ups");
        strings.add("Java developers can not c#");
        strings.add("IOS is better than Android !");
        strings.add("Anton, do you think I am a bad mother ? My name is Paul.");
        strings.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        strings.add("What is the difference between a snowman and a snow woman? Snowballs");
    }

    public String getJoke(){
        return strings.get(new Random().nextInt(5));
    }


}
