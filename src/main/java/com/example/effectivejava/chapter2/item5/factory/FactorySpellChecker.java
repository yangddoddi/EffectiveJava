package com.example.effectivejava.chapter2.item5.factory;

import com.example.effectivejava.chapter2.item5.after.DictionaryInterface;

public class FactorySpellChecker {
    private final DictionaryInterface dictionary;
    public FactorySpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }
}
