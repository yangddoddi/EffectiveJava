package com.example.effectivejava.chapter2.item2;

/*
*
* 필요값이 모두 세팅되기 전에 실행될 우려가 있다.
* 정확히 어디까지 세팅된 상태로 객체를 생성해야하는지 알 수 없다. (문서화 밖에 방법 없음)
* 불변 객체로 만들 수 없다. (final) -> 프리징할 수는 있음..
*
* */

public class JavaBeansBurger {
    private int bread;
    private int patty;
    private int onion;
    private int tomato;
    private int lettuce;
    private int source;

    public void setBread(int bread) {
        this.bread = bread;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
