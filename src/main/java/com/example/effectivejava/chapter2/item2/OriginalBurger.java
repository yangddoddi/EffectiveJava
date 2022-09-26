package com.example.effectivejava.chapter2.item2;

public class OriginalBurger {
    private final int bread;
    private final int patty;
    private final int onion;
    private final int tomato;
    private final int lettuce;
    private final int source;


    public OriginalBurger(int bread) {
        this.bread = bread;
        this.patty = 0;
        this.onion = 0;
        this.tomato = 0;
        this.lettuce = 0;
        this.source = 0;
    }

    public OriginalBurger(int bread, int patty) {
        this.bread = bread;
        this.patty = patty;
        this.onion = 0;
        this.tomato = 0;
        this.lettuce = 0;
        this.source = 0;
    }

    public OriginalBurger(int bread, int patty, int onion) {
        this.bread = bread;
        this.patty = patty;
        this.onion = onion;
        this.tomato = 0;
        this.lettuce = 0;
        this.source = 0;
    }

    public OriginalBurger(int bread, int patty, int onion, int tomato) {
        this.bread = bread;
        this.patty = patty;
        this.onion = onion;
        this.tomato = tomato;
        this.lettuce = 0;
        this.source = 0;
    }

    public OriginalBurger(int bread, int patty, int onion, int tomato, int lettuce) {
        this.bread = bread;
        this.patty = patty;
        this.onion = onion;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.source = 0;
    }

    public OriginalBurger(int bread, int patty, int onion, int tomato, int lettuce, int source) {
        this.bread = bread;
        this.patty = patty;
        this.onion = onion;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.source = source;
    }
}
