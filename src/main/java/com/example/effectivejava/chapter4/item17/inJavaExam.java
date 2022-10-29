package com.example.effectivejava.chapter4.item17;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class inJavaExam {
    public static void main(String[] args) {
        BigInteger one = BigInteger.ONE;
        BigInteger negate = one.negate();

        Set<MutableClass> set1 = new HashSet<>();
        Set<MutableClass> set2 = new HashSet<>();
        Set<MutableClass> set3 = new HashSet<>();
        // => Set 자체는 불편이지만 내부 객체의 값을 바꿔버리면 불변이 깨짐.
    }
}
