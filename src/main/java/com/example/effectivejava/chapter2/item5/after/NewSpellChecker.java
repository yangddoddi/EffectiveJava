package com.example.effectivejava.chapter2.item5.after;

public class NewSpellChecker {
    private final DictionaryInterface dictionary;
    public NewSpellChecker(DictionaryInterface dictionary) {
        this.dictionary = dictionary;
    }
    public boolean isValid(String word) {
        return dictionary.getContent().contains(word);
    }
}
