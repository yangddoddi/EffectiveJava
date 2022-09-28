package com.example.effectivejava.chapter2.item3;

public class SecondSingleton<T> implements Parent {
    private static final SecondSingleton INSTANCE = new SecondSingleton();
    private SecondSingleton() {}
    public static <T> SecondSingleton<T> getInstance() {return
            (SecondSingleton<T>) INSTANCE;}

    public T temp(T t) {
        return t;
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    public static void main (String[] args) {
        SecondSingleton<String> instance = SecondSingleton.getInstance();
        SecondSingleton<Integer> instance2 = SecondSingleton.getInstance();

//        System.out.println(instance2==instance);
        System.out.println(instance.hashCode() == instance2.hashCode());
    }
}
