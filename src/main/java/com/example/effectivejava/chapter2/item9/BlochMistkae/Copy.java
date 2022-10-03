package com.example.effectivejava.chapter2.item9.BlochMistkae;

import java.io.*;

public class Copy {
    private static final int BUFFER_SIZE = 8*1024;

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n=in.read(buf))>=0)
                out.write(buf, 0, n);
        } finally {
            try {
                out.close();
            } catch (IOException e) {

            }
            try {
                in.close();
            } catch (IOException e) {

            }
            /*
            * 하나의 finally 안에 모두 들어가면 자원 반환이 안전하게 처리되지 않는다.
            * (하나의 close에서 exception이 발생하면?)
            * */
        }
    }
}
