package com.example.effectivejava.chapter2.item5.factory;

import com.example.effectivejava.chapter2.item5.after.DictionaryInterface;
import com.example.effectivejava.chapter2.item5.after.KoreanDictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {
    @Override
    public DictionaryInterface getDictionary() {
        return new KoreanDictionary();
    }
}
