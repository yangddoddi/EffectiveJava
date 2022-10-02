package com.example.effectivejava.chapter2.item7.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class EffectiveExecutors {
    public static void main(String[] args) {
        int numberOfCpu = Runtime.getRuntime().availableProcessors();// 가용 쓰레드 개수
        System.out.println("numberOfCpu" + " = " + numberOfCpu);

        ExecutorService numberOfCpu2 = Executors.newCachedThreadPool(); // 필요한만큼 생성
        // 쓰레드를 무한정으로 추가 생성함
        System.out.println("cachedThread" + " = " + numberOfCpu2);

        ExecutorService oneCpu = Executors.newSingleThreadExecutor();
        System.out.println("oneCpu" + " = " + oneCpu); // 하나로 다 해결함

        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(10);
        System.out.println("scheduled = " + scheduled);
        /*
        * Cpu가 많이 쓰이는 경우(해시, 블럭체인, 딥러닝 등)는 쓰레드 풀이 별 의미가 없음.
        * */
        ExecutorService service = Executors.newFixedThreadPool(10); // 쓰레드 풀 만들기
        // Blocking Queue를 사용한다. (concurrent하게 접근 가능하다.)
        // 우리가 일반적으로 사용하는 자료구조는 concurrency에 안전하지 않음
        // 동시에 접근하면 예외 발생
        for (int i=0; i<100; i++) {
            service.submit(new Task());
        }
        /*
        * Thread를 만드는 것에는 많은 리소스가 필요하다
        * 결과 받기 ->
        * */
        for(int i=0; i<100; i++) {
            Thread thread = new Thread(new Task());
            thread.start();
        }

        System.out.println(Thread.currentThread() + " hello");
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 작업의 결과를 받고 싶다
    static class Task2 implements Callable<String> {
        @Override
        public String call() throws Exception {
            return Thread.currentThread() + " world";
        }
    }
}
