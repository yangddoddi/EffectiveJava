package com.example.effectivejava.chapter3.item10.rule1;

import java.util.ArrayList;
import java.util.List;

// 대칭성이 지켜지지 않는 예시

public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString)o).s);
        if (o instanceof String)
            return s.equalsIgnoreCase((String) o);
        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString stupidEquals = new CaseInsensitiveString("바보");
        String stupid = "바보";
        System.out.println(stupidEquals.equals(stupid));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(stupidEquals);
        System.out.println(list.contains(stupid));
    }
}
