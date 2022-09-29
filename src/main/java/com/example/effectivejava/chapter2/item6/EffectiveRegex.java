package com.example.effectivejava.chapter2.item6;

import java.util.regex.Pattern;

public class EffectiveRegex {
    static boolean isValid(String email) {
        return email.matches("^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$");
    }

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$"
    );

    static boolean isValidFastVer(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static void main(String[] args) {
        /*
        *
        * */

        boolean result = false;
        long start = System.nanoTime();
        String email = "asdasd@asdasd.com";
        for (int i=0; i<100; i++) {
            result = EffectiveRegex.isValid(email);
//            result = EffectiveRegex.isValidFastVer(email);
            /*
            * 1.2배 ~ 1.5배가량 차이남.
            * */
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(result);
    }
}

