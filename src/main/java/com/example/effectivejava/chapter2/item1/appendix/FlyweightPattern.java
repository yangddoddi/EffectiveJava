package com.example.effectivejava.chapter2.item1.appendix;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPattern {

}

class Font {
    private char value;
    private String color;
    private String fontFamily;
    private int fontSize;

    public Font(char value, String color, String fontFamily, int fontSize) {
        this.value = value;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    public Font(String fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}

class after {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }

    private char value;
    private String color;
}