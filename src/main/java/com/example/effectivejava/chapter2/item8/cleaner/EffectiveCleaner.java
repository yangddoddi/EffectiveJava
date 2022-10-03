package com.example.effectivejava.chapter2.item8.cleaner;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class EffectiveCleaner {
    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<Object> resourcesToCleanUp = new ArrayList<>();
        BigObj bigObj = new BigObj(resourcesToCleanUp);

        cleaner.register(bigObj, new BigObj.ResourcesCleaner(resourcesToCleanUp));
        bigObj = null;

        System.gc();
        Thread.sleep(3000L);
    }
}
