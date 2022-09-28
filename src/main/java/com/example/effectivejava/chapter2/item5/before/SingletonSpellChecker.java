package com.example.effectivejava.chapter2.item5.before;

public class SingletonSpellChecker {
    private final Dictionary dictionary = new Dictionary();
    private SingletonSpellChecker() {}
    private static final SingletonSpellChecker INSTANCE = new SingletonSpellChecker();
    public boolean isValid(String word) {
        return dictionary.getContent().contains(word);
    }
}
