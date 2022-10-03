package com.example.effectivejava.chapter2.item8.inner_outer;

import java.lang.reflect.Field;

public class LambdaEx {
    private int value = 10;

    private Runnable instance = () -> {
        System.out.println(value);
        /*
        * 바깥에 있는 값을 참조할 경우
        * 해당 객체에 대한 참조가 람다 내부에 포함됨 (field name: arg$1)
        *
        * 바깥에 있는 값을 참조하지 않거나, 스태틱인 경우는 괜찮다.
        * */
    };

    public static void main(String[] args) {
        LambdaEx ex = new LambdaEx();
        Field[] declaredFields = ex.instance.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field type: " + field.getType());
            System.out.println("field name: " + field.getName());
        }
    }
}
