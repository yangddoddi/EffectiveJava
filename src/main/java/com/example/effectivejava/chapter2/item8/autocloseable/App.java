package com.example.effectivejava.chapter2.item8.autocloseable;

public class App {
    public static void main(String[] args) {
        try (EffectiveAutoClosable effectiveAutoClosable = new EffectiveAutoClosable();
             EffectiveAutoClosable effectiveAutoClosable2 = new EffectiveAutoClosable();
             EffectiveAutoClosable effectiveAutoClosable3 = new EffectiveAutoClosable();) {

        } catch (Exception e) {

        }
    }
}
