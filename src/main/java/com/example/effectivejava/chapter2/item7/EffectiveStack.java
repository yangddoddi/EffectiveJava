package com.example.effectivejava.chapter2.item7;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

// 메모리 누수가 일어나는 위치는 어디인가?
public class EffectiveStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public EffectiveStack() { elements = new Object[DEFAULT_INITIAL_CAPACITY]; }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size ==0) throw new EmptyStackException();
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size);
    }

    public Object pop2() {
        if (size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }
}
