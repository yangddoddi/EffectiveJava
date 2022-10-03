package com.example.effectivejava.chapter2.item8.finlaizer;

/*
 * weakReference
 * phantomReference
 * cleaner 사용할 것을 권장(api에 적혀있기를..)
 * -> 그냥 try-with-resources쓰삼.  (AutoCloseable)
 * */

/*
* 문제점 1. 제때 자원을 반환하지 못함
* 문제점 2. 파이널라이저 안에서 코딩 실수로 자신을 참조하게될 경우 스스로 복사하게됨
* 문제점 3.
* */

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

public class EffectiveFinalizer {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        int i=0;
        for (;;) {
            i++;
            new EffectiveFinalizer();

            if ((i % 1_000_000)==0) {
                Class<?> finalizerClass = Class.forName("java.lang.ref.Finalizer");
                Field queue = finalizerClass.getDeclaredField("queue");
                queue.setAccessible(true);
                ReferenceQueue<Object> referenceQueue = (ReferenceQueue) queue.get(null);

                Field queueLengthField = ReferenceQueue.class.getDeclaredField("queueLength");
                queueLengthField.setAccessible(true);
                long l = (long) queueLengthField.get(referenceQueue);
                System.out.format("thehre are %d references in the queue %n", l);
            }
        }
    }
}
