package com.example.effectivejava.chapter2.item2;

public class JavaBeansFrozen {
    private String name;
    private int age;
    private boolean isFrozen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( !isFrozen ) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if ( !isFrozen ) {
            this.age = age;
        }
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void freezing(boolean frozen) {
        if ( isFrozen ) {
            isFrozen = frozen;
        }
    }

    public void unFreezing() {
        isFrozen = false;
    }
}
