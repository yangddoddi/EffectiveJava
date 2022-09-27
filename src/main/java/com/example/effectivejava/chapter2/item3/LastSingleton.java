package com.example.effectivejava.chapter2.item3;

public enum LastSingleton {
    INSTANCE;

    public void print() {
        System.out.println("print");
    }

    public static void main (String[] args) {
        LastSingleton instance = LastSingleton.INSTANCE;
    }
}
