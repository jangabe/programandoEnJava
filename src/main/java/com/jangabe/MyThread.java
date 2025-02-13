package com.jangabe;

public class MyThread extends Thread{

    private String name;
    private int time;
    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
    }
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println(name+i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
