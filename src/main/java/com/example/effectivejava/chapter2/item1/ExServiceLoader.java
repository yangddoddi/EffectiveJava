package com.example.effectivejava.chapter2.item1;

import java.util.ServiceLoader;

public class ExServiceLoader {
    public static void main(String[] args) {
        /*
        * 자바의 팩토리 메서드
        * 클래스 내부의 모든 구현체를 가져온다
        *
        * 이것을 이용해서 jar 내의 의존성 클래스를 import하지 않고 사용할 수 있음(확장성 증대)
        * */
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        loader.findFirst().ifPresent(e ->
                System.out.println(e));
    }
}
