package com.example.effectivejava.chapter2.item7;

import com.example.effectivejava.chapter2.item7.cache.Dummy;
import com.example.effectivejava.chapter2.item7.cache.EffectiveCacheKey;
import com.example.effectivejava.chapter2.item7.cache.EffectiveRepository;
import com.example.effectivejava.chapter2.item7.listener.ChatRoom;
import com.example.effectivejava.chapter2.item7.listener.User;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class EffectiveRepositoryTest {

    @Test
    void test() throws InterruptedException {
        EffectiveRepository effectiveRepository = new EffectiveRepository();
        Integer p1 = 1;
        Dummy findDummy = effectiveRepository.getDummyId(p1);
        // 만약 new CacheKey 자체를 넣으면?
        // 객체 자체를 참조하고 있으면 빠지지 않음 명시적으로 비우지 않는한

        assertFalse(effectiveRepository.getCache().isEmpty());

        // run gc
        System.out.println("run gc");
        System.gc();
        System.out.println("wait");
        Thread.sleep(3000L);

        assertTrue(effectiveRepository.getCache().isEmpty());
        // WeakHashMap은 성공, HashMap은 실패한다
    }
    // 명시적 null
    // 직접 넣고 빼기, 자료구조 활용하기
    // 이외에는 LRU(the latest recently used)  Cache
    // 가장 최근에 사용된 캐시 n개까지만 두고 나머지는 삭제
    // 구현해보자
    // 4. background thread를 사용하자

    @Test
    void test2() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        EffectiveRepository repository = new EffectiveRepository();
        EffectiveCacheKey key1 = new EffectiveCacheKey(1);

        repository.getCacheKey(key1);

        Runnable removeOldCache = () -> {
            System.out.println("running removeOldCache Task");
            Map<EffectiveCacheKey, Dummy> cache = repository.getCache();
            Set<EffectiveCacheKey> cacheKeys = cache.keySet();
            Optional<EffectiveCacheKey> key = cacheKeys.stream().min(Comparator.comparing((e) -> e.getCreated()));
            key.ifPresent((k) -> {
                System.out.println("removing" + k);
                cache.remove(k);
            });
        };

        System.out.println("this time is : " + new Date());

        executor.scheduleAtFixedRate(removeOldCache, 1, 3, TimeUnit.SECONDS);

        Thread.sleep(20000L);

        executor.shutdown();
    }

    @Test
    void chatRoom() throws InterruptedException {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User();
        User user2 = new User();

    }
}