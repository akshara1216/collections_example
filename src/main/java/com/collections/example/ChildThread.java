package com.collections.example;

public class ChildThread extends Thread {
     private Sender sender;
     private String msg;
     private Thread t;

    public ChildThread(String m,Sender snd)
     {
        msg =  m;
        sender = snd;
     }

    @Override
    public void run() {
        /*synchronized (sender)*/
        {
            sender.send(msg);
        }

    }
}
