package com.example.effectivejava.chapter4.item17;

/*
* 처음 생성된 이후 값이 변하지 않고 새로운 인스턴스를 반환하기 때문에 함수형 프로그래밍에 적합하다.
* 함수형 프로그래밍이 아니더라도 값이 절대 바뀌지 않을 것을 알기 때문에 프로그래밍 자체가 편하다.
* (외부적으로 방어적 복사 같은 걸 할 필요가 없음)
*
* 여러 쓰레드가 동시에 사용해도 서로에게 영향을 전혀 주지 않기 때문에 Thread-Safe하다.
* 객체간에 참조를 공유하더라도 늘 새로운 인스턴스를 반환할 뿐 필드를 변경하지 않기 때문 안전하다.
* */

public final class Complex  {
    private final double re;
    private final double im;

    public static final Complex ZERO = new Complex(0,0);
    public static final Complex ONE = new Complex(1,0);
    public static final Complex I = new Complex(0,1);

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public Complex minus(Complex c) {
        return new Complex(re-c.re, im - c.im);
    }
}
