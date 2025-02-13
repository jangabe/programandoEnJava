package com.jangabe;

public class Dog implements Animal{

    @Override
    public void action() {
        System.out.println("Look for cats");
    }

    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}
