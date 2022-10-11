package com.example.effectivejava.chapter3.item13;

import lombok.ToString;

import java.util.HashMap;

@ToString
public class PhoneNum implements Cloneable {
    private int areaCode;
    private int prefix;
    private int lineNum;

    public PhoneNum(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public PhoneNum clone() {
        try {
            return (PhoneNum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        PhoneNum phoneNum = new PhoneNum(223, 111, 4423);
        HashMap<PhoneNum, String> map = new HashMap<>();
        map.put(phoneNum, "냠냠");

        PhoneNum clone = phoneNum.clone();
        System.out.println(map.get(clone)); // hash값이 다르니 null
        System.out.println(clone != phoneNum); // hashr값이 다르므로 true
        System.out.println(clone.getClass() == phoneNum.getClass());
        System.out.println(clone.equals(phoneNum));
    }
}
