package com.example.effectivejava.chapter2.item2;

/*
*
* 점층적 생성자 패턴
* 각 인자로 어떤 값이 들어가야하는지 파악하기 어렵다.
*
* */

public class ConstructorChainingBurger {
    private final int bread;
    private final int patty;
    private final int onion;
    private final int tomato;
    private final int lettuce;
    private final int source;

    public ConstructorChainingBurger(int bread) {
        this(bread,0);
    }

    public ConstructorChainingBurger(int bread, int patty) {
        this(bread,patty,0);
    }

    public ConstructorChainingBurger(int bread, int patty, int onion) {
        this(bread,patty,onion,0);
    }

    public ConstructorChainingBurger(int bread, int patty, int onion, int tomato) {
        this(bread,patty,onion,tomato,0);
    }

    public ConstructorChainingBurger(int bread, int patty, int onion, int tomato, int lettuce) {
        this(bread,patty,onion,tomato,lettuce, 0);
    }

    public ConstructorChainingBurger(int bread, int patty, int onion, int tomato, int lettuce, int source) {
        this.bread = bread;
        this.patty = patty;
        this.onion = onion;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.source = source;
    }
}
