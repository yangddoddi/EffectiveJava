package com.example.effectivejava.chapter2.item3.methodrefrence;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef {
    LocalDateTime time;

    public MethodRef(LocalDateTime time) {
        this.time = time;
    }

    public static int compareByAge(MethodRef a, MethodRef b) {
        return a.time.compareTo(b.time);
    }

    public static void main(String[] args) {
        List<MethodRef> list = List.of(
                new MethodRef(LocalDateTime.now()),
                new MethodRef(LocalDateTime.now().minusDays(100)),
                new MethodRef(LocalDateTime.now().plusDays(100))
        );

//        list.sort(
//                (o1,o2) -> o2.compareTo(o1)
//        ); // 이건 람다
        /*
        list.sort((o1,o2) -> MethodRef.compareByAge(o1, o2)); // 이건 람다

        list.sort(MethodRef::compareByAge); // 이건 메서드 참조 Method Reference
        -> 스태틱이 아니라 인스턴스 메서드는 불가능하다.
        단, 임의 객체 메서드 참조의 경우 MethocRef::compareByAge가 가능함. (단 메서드가 o1,o2가 아닌 this.compareTo(o))
        */

        List<LocalDateTime> dates = new ArrayList<>();
        dates.add(LocalDateTime.now());
        dates.add(LocalDateTime.now());
        dates.add(LocalDateTime.now());

        dates.stream().map(d -> new MethodRef(d)).collect(Collectors.toList()); // 람다
        dates.stream().map(MethodRef::new).collect(Collectors.toList()); // 생성자 메서드를 참조

        /*
        * Function<I,V> (I) -> return V (인자가 있는 생성자)
        * Supplier(T) () -> return T (기본 생성자)
        * Consumer(T) (T) -> { void } (System.out.println())
        * Predicate(T) (T) -> return Boolean ( Stream.filter() )
        * */

    }
}