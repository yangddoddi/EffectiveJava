package com.example.effectivejava.chapter2.item5.supplier;

import com.example.effectivejava.chapter2.item5.after.DictionaryInterface;

import java.util.function.Supplier;

public class SupplierSpellChecker {
    private final DictionaryInterface dictionary;

    public SupplierSpellChecker(DictionaryInterface dictionary) {
        this.dictionary = dictionary;
    }

    public SupplierSpellChecker(Supplier<? extends DictionaryInterface> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word) {
        return dictionary.getContent().contains(word);
    }
}
