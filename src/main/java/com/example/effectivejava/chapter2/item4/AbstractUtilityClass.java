package com.example.effectivejava.chapter2.item4;

public abstract class AbstractUtilityClass {
    public static void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {
        AbstractUtilityClass utilityClass = new ChildUtilityClass();
    }
}

class ChildUtilityClass extends AbstractUtilityClass {

}
