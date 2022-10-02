package com.example.effectivejava.chapter2.item7.cache;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class EffectiveCacheKey {
    Integer key;
    private LocalDateTime created;

    public EffectiveCacheKey(Integer key) {
        this.key = key;
        this.created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
