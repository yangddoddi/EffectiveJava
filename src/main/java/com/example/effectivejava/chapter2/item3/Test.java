package com.example.effectivejava.chapter2.item3;

import java.util.function.Supplier;

public class Test {
    public void printprint(Supplier<Parent> supplier) {
        Parent parent = SecondSingleton.getInstance();
        parent.print();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.printprint(SecondSingleton::getInstance);
    }
}
