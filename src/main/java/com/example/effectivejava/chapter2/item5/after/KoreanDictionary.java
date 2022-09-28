package com.example.effectivejava.chapter2.item5.after;

public class KoreanDictionary implements DictionaryInterface{
    private String content;

    @Override
    public String getContent() {
        return this.content;
    }
}
