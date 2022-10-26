package com.example.effectivejava.chapter3.item14;

import java.util.Comparator;
import java.util.Objects;

// 단, Comparable은 상속 시 재정의할 수 없다.
// 그러면 TreeSet/ PriorityQueue 같은 경우 어떻게 사용하나?
// 해당 자료구조에서 Comparator를 재정의하면 된다.
// 아니면 그냥 컴포지션하는 것도 방법이다.
public class MyComparableClass implements Comparable<MyComparableClass>{
    private final int value;
    private final String name;

    public MyComparableClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    /*
    * this.compareTo(i)의 리턴 값이 0이여 this.equals(i)의 값이 false일 수 있음
    * */
    @Override
    public int compareTo(MyComparableClass o) {
        // return this.value-o.value;
//        return Integer.compare(this.value, o.value);
        return COMPARATOR.compare(this, o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComparableClass that = (MyComparableClass) o;
        return value == that.value && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, name);
    }

    private static final Comparator<MyComparableClass> COMPARATOR
            = Comparator.comparingInt((MyComparableClass m ) -> m.value)
            .thenComparingInt(m -> m.value);
}
