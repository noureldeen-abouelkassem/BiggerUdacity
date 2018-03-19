package com.example.android.myjokes;

import java.util.ArrayList;
import java.util.Random;

public class myClass {
    private ArrayList<String> jokesList;
    public myClass(){
        jokesList = new ArrayList<>();
        jokesList.add("Dinosaurs can not do push ups");
        jokesList.add("Java developers can not c#");
        jokesList.add("IOS is better than Android !");
        jokesList.add("Anton, do you think I am a bad mother ? My name is Paul.");
        jokesList.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        jokesList.add("What is the difference between a snowman and a snow woman? Snowballs");
    }

    public String getJoke(){
        return jokesList.get(new Random().nextInt(jokesList.size()));
    }


}
