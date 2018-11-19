package com.collections.example;

public class ChildThreadInterface implements Runnable {

    @Override
    public void run() {
        String name= "Psycho";
        System.out.println("Childthreadinterface running");
    }
}
