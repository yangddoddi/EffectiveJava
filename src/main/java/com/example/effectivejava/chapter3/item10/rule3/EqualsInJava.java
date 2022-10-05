package com.example.effectivejava.chapter3.item10.rule3;

import java.net.MalformedURLException;
import java.net.URL;

public class EqualsInJava extends Object {
    public static void main (String[] args) throws MalformedURLException {
        URL google1 = new URL("https", "about.google", "/products");
        URL google2 = new URL("https", "about.google", "/products");
        System.out.println(google1.equals(google2));
    }
}
