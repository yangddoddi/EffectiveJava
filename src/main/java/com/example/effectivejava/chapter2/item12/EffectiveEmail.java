package com.example.effectivejava.chapter2.item12;

public class EffectiveEmail {
    private final String PATTERN = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
    private final String email;

    private EffectiveEmail(String email) {
        this.email=email;
    }

    @Override
    public String toString() {
        return String.format(PATTERN, email);
    }

    public static EffectiveEmail of(String email) {
        return new EffectiveEmail(email);
    }
}
