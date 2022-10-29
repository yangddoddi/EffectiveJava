package com.example.effectivejava.chapter4.item17.jmm;

public class EffectiveJMM {
    private int x;
    private int y;

    public  EffectiveJMM() {
        this.x = 1;
        this.y = 2;
    }

    public static void main(String[] args) {
        /*
        * 1. Object o = new EffectiveJMM();
        * 2. o.x = 1;
        * 3. o.y = 2;
        * 4. effectiveJMM = w;
        *
        * (1)이 순서가 반드시 정해져있는 것이 아니다.
        * (2)해당 순서가 유효한지 판단하는 것은 오직 단일 쓰레드 내부에서.
        * (3)쓰레드가 여러 개라면 객체가 완성되기 전에 어떤 쓰레드는 해당 객체를 참조하게 될 수 있다.
        * (흔한 일은 아님, 언어적 스펙에 따른 이론적인 이야기)
        * (4) final 필드가 있을 경우, 무조건 final에 해당하는 변수가 초기화되어야만 쓰레드가 해당 객체를 참조할 수 있다.
        * */
        EffectiveJMM effectiveJMM = new EffectiveJMM();
    }
}
