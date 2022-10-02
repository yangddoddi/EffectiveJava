package com.example.effectivejava.chapter2.item7.cache;

import java.util.HashMap;
import java.util.Map;

public class EffectiveRepository {
    private Map<EffectiveCacheKey, Dummy> cache;

    public EffectiveRepository() {
        this.cache = new HashMap<>();
    }

    public Dummy getDummyId(Integer id) {
        EffectiveCacheKey key = new EffectiveCacheKey(id);
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            Dummy dummy = new Dummy(); // 실제로는 DB에서 오겠죠
            cache.put(key, dummy); // 계속해서 쌓이기만 하고 있음
            return dummy;
        }
    }

    public Dummy getCacheKey(EffectiveCacheKey key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            Dummy dummy = new Dummy();
            cache.put(key, dummy);
            return dummy;
        }
    }

    public Map<EffectiveCacheKey, Dummy> getCache() {
        return cache;
    }
}
