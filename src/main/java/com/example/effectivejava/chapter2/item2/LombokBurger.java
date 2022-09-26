package com.example.effectivejava.chapter2.item2;

import lombok.Builder;

@Builder
public class LombokBurger {
    private final int bread;
    private final int patty;
    private final int onion;
    private final int tomato;
    private final int lettuce;
    private final int source;

    public static void main(String[] args) {
        LombokBurger burger = LombokBurger.builder()
                .bread(2)
                .lettuce(2)
                .onion(1)
                .patty(1)
                .source(1)
                .tomato(1)
                .build();
    }
}
