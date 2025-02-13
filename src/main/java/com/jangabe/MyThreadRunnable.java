package com.jangabe;

public class MyThreadRunnable implements Runnable{

    private String name;
    private int time;
    public MyThreadRunnable(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println(name+i);
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
