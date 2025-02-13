package com.jangabe;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

        Animal dog = new Dog();
        dog.action();
        dog.sound();
        Animal.breath();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Creatinga an ArrayList without any type specified
        ArrayList <String> al = new ArrayList<String> ();

        al.add("Sachin");
        al.add("Rahul");

        // Now Compiler doesn't allow this
        al.add(String.valueOf(10));

        String s1 = al.get(0);
        String s2 = al.get(1);
        String s3 = al.get(2);

        MyThread thread = new MyThread("threadone", 1000);
        thread.start();

        MyThread thread2 = new MyThread("threatwo", 500);
        thread2.start();

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable("hilo1", 1000);
        Thread tr1 = new Thread(myThreadRunnable);
        tr1.start();

        MyThreadRunnable myThreadRunnable2 = new MyThreadRunnable("hilo2", 500);
        Thread tr2 = new Thread(myThreadRunnable2);
        tr2.start();

    }
}