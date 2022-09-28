package com.example.effectivejava.chapter2.item5.before;

public class SpellChecker {
    private final static Dictionary dictionary = new Dictionary();
    private SpellChecker() {};
    public static boolean isValid(String word) {
        return dictionary.getContent().contains(word);
    }
}
