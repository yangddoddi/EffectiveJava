package com.example.effectivejava.chapter2.item8.finalizer_attack;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Account account = null;
        try {
            account = new BrokenAccount("Blocked User");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.gc();
        Thread.sleep(5000L);
    }

    /*
    * 막는 방법
    * 1. 상속 자체를 막는다 (Final class)
    * 2. finalize() Override하고 final을 붙인다
  다 * */
}
