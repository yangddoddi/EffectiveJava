package com.example.effectivejava.chapter2.item1;

/*
* 클래스가 아닌 인터페이스를 반환할 수 있다.
* 이를 이용해서 사용자에게 구체적인 클래스를 숨기고 인터페이스만으로 필요한 기능을 모두 제공할 수 있다.
*
* 한층 더 나아가 자바 8 이후로는 Interface에서 public static 메서드를 정의할 수 있기 때문에
* Interface에서 바로 구체 클래스를 반환하는 것도 가능하다. (정적 팩토리 메서드를 굳이 만들지 않아도 됨)
* */

public class HelloServiceFactory {
    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    public static void main(String[] args) {
        HelloService ko = HelloServiceFactory.of("ko");
        HelloService ko1 = HelloService.of("ko");
    }
}
