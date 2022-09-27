package com.example.effectivejava.chapter2.item3;

public class BasicSingleton {

    public static final BasicSingleton INSTANCE = new BasicSingleton();

    private BasicSingleton() {
    }

    public static void main(String[] args) {
        BasicSingleton instance = BasicSingleton.INSTANCE;
    }
}
