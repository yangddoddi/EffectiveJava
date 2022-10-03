package com.example.effectivejava.chapter2.item9.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
    static String firstLineOfFile(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
        /*
        * try 소괄호 안에서 자원 사용
        * 직접 닫지 않는다
        * */
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        System.out.println(firstLineOfFile(path));
    }
}
