package com.jangabe;

public interface Animal {
    void action();
    static void breath(){
        System.out.println("This animal can breath...");
    }
    default void sound(){
        System.out.println("Strange noise");
    }
}
