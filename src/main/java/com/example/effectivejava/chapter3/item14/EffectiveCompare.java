package com.example.effectivejava.chapter3.item14;

import java.math.BigDecimal;

public class EffectiveCompare {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(1111111111L);
        BigDecimal num2 = BigDecimal.valueOf(2222222222L);
        BigDecimal num3 = BigDecimal.valueOf(1111111111L);

        // 반사성
        System.out.println(num1.compareTo(num1));
        // 대칭성
        System.out.println(num1.compareTo(num2)); // -1
        System.out.println(num2.compareTo(num1)); // 1
        // 추이성
        System.out.println(num3.compareTo(num1) > 0);
        System.out.println(num1.compareTo(num2) > 0);
        // 일관성 - 두 수가 같으면 어떤 수와 비교했을 때 결과가 같아야함
        System.out.println(num1.compareTo(num3));
        System.out.println(num2.compareTo(num1));
        System.out.println(num2.compareTo(num3));
        // compareTo의 결과가 같다면 equals도 true이거나 문서화를 하는 게 좋다.
    }
}
