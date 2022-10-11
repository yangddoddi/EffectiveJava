package com.example.effectivejava.chapter3.item13;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Map;

public class EffectiveStack<T extends Object> implements Cloneable {
    public T[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public EffectiveStack() {
        this.elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }
//
//    public EffectiveStack(EffectiveStack<T> e) {
//        EffectiveStack<T> copy = new EffectiveStack<>();
//        for (int i=0; i<e.elements.length; i++) {
//            copy.elements[i] = new Object()
//        }
//    }

    public void push(T t) {
        ensureCapacity();
        elements[size++] = t;
    }

    public Object pop() {
        if (size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

//    @Override
//    public EffectiveStack clone() {
//        try {
//            EffectiveStack clone = (EffectiveStack) super.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

//    @Override
//    public EffectiveStack clone() {
//        try {
//            EffectiveStack clone = (EffectiveStack) super.clone();
//            clone.elements = this.elements.clone();
//            // Warning : 배열 내부의 오브젝트는 여전히 같은 참조값을 가지고 있음.
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    @Override
    public synchronized EffectiveStack<T> clone() {
        try {
            EffectiveStack<T> clone = (EffectiveStack<T>) super.clone();
            clone.elements = this.elements.clone();
            for (int i=0; i<elements.length; i++) {
                if (elements[i] != null) {
                    clone.elements[i] = this.elements[i];
                }
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        PhoneNum phoneNum1 = new PhoneNum(111, 1111, 1111);
        PhoneNum phoneNum2 = new PhoneNum(222, 222, 2222);

        EffectiveStack effectiveStack = new EffectiveStack();
        effectiveStack.push(phoneNum1);
        effectiveStack.push(phoneNum2);

        EffectiveStack clone = effectiveStack.clone();
        PhoneNum pop1 = (PhoneNum) effectiveStack.pop();
        PhoneNum pop2 = (PhoneNum) clone.pop();

        System.out.println(pop1 == pop2);
        System.out.println(pop1.equals(pop2));
    }
}
