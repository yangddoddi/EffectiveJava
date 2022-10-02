package com.example.effectivejava.chapter2.item6;

public class EffectiveAutoboxing {
    private static long sum() {
//        Long sum = 0L;
        long sum = 0L;
        /*
        * 내 실행 환경에서 6배 차이난다.
        * */
        for (long i=0; i<= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        long x = sum();
        long end = System.nanoTime();
        System.out.println((end-start) / 1000000. + " ms.");
        System.out.println(x);
    }
}
