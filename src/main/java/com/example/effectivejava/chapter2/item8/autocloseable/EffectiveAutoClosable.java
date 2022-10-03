package com.example.effectivejava.chapter2.item8.autocloseable;

import java.io.BufferedReader;
import java.io.IOException;

public class EffectiveAutoClosable implements AutoCloseable {
    // Closable도 있다. (IO Based) -> Closeable은 반드시 멱등성을 가져야함
    // 멱등성을 가져야하는 이유? close를 호출할 수 있음
    private BufferedReader br;

    @Override
    public void close() throws Exception { // 사용하는 쪽에서 처리해라
        try {
            br.close();
        }catch (IOException e) {
            throw new RuntimeException("failed to close" + br); // Unchecked Exception으로 변환
            // 혹은 로깅하기
            // 멱등성을 가지는 것이 좋다 -> 변함없이 항상 같은 결과가 나와야함 idempotent
        }
    }
}
