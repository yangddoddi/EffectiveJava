package com.example.effectivejava.chapter2.item3;

public class BasicPlusSingleton {
    public static final BasicPlusSingleton INSTANCE = new BasicPlusSingleton();
    private static boolean created;

    private BasicPlusSingleton() {
        if (created) {
            throw new RuntimeException();
        }
        created = true;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
