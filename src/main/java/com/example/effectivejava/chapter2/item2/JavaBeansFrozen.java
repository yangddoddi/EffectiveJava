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

    public void freeze() {
        if ( isFrozen ) {
            isFrozen = true;
        }
    }

    public void unFreeze() {

        isFrozen = false;
    }
}
