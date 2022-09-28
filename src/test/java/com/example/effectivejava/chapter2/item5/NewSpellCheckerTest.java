package com.example.effectivejava.chapter2.item5;

import com.example.effectivejava.chapter2.item5.after.DictionaryInterface;
import com.example.effectivejava.chapter2.item5.after.KoreanDictionary;
import com.example.effectivejava.chapter2.item5.supplier.SupplierSpellChecker;

class NewSpellCheckerTest {
    public void test() {
        DictionaryInterface dictionary = new KoreanDictionary();
    }

    public void test2() {
/*        SupplierSpellChecker spellChecker = new SupplierSpellChecker(() -> new KoreanDictionary());
        SupplierSpellChecker spellChecker = new SupplierSpellChecker(KoreanDictionary::new);*/
    }
}