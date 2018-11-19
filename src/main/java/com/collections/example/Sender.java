package com.collections.example;

public class Sender {
    public  void send(String Msg) {
        synchronized (this) {
            System.out.println("Sending.... " + Msg);
            try {

                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println("Thread interrupted");
            }
            System.out.println(Msg + "  sent...");
        }
    }
}
