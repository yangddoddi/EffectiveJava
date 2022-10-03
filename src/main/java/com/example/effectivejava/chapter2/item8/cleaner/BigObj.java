package com.example.effectivejava.chapter2.item8.cleaner;

import java.util.List;

public class BigObj {
    private List<Object> resource;
    public BigObj(List<Object> resource) { this.resource = resource; }

    /*
    * 절대 클린하려는 객체를 참조하면 안됨 -> 객체 무한 복제
    * 이너 클래스로 존재할 경우 스태틱이여야함(같은 말)
    * */

    /*
    * 언제 쓰나요?
    * GC 될 기회를 줄 수 있도록(안전망)
    * PhantomReference를 사용함
    * */

    /*
    * 성능 문제로 인해 명시적으로 해제해주는 것이 좋다.
    * */
    public static class ResourcesCleaner implements Runnable {
        private List<Object> resourceToClean;
        public ResourcesCleaner(List<Object> resourceToClean) {
            this.resourceToClean = resourceToClean;
        }
        @Override
        public void run() {
            resourceToClean=null;
            System.out.println("cleaned up.");
        }
    }
}
