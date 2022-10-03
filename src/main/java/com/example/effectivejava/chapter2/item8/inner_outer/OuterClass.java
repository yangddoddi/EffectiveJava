package com.example.effectivejava.chapter2.item8.inner_outer;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi() {
        System.out.println("hi");
    }

    class InnerClass {

        public void hello() {
            OuterClass.this.hi();

        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();

        System.out.println(innerClass);

        outerClass.printField();
    }

    private void printField() {
        Field[] declaredFields = InnerClass.class.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field type:" + field.getType());
            System.out.println("field name:" + field.getName());
            /*
            * field name:this$0
            * Outer.this로 외부 클래스에 항상 참조
            * */
        }
    }
}
