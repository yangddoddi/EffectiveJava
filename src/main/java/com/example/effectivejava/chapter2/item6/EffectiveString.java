package com.example.effectivejava.chapter2.item6;

public class EffectiveString {
    public static void main(String[] args) {
        /*
        * string은 상수풀에 저장되어 있다
        * string2는 무조건 강제적으로 새로운 문자열을 생성한다
        * string3은 string이 저장한 문자열을 재사용한다
        * */

        String string = "String";
        String string2 = new String(("String"));
        String string3 = "String";

        System.out.println(string==string2); // false
        System.out.println(string.equals(string2)); // true
        System.out.println(string==string3); // true
        System.out.println(string.equals(string3)); // true
        // => but, 혹시라도 인스턴스가 다른 경우에 대비해서 문자열 비교는 반드시 equals를 사용할 것.
    }
}
