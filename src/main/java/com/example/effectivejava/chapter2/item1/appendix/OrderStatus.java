package com.example.effectivejava.chapter2.item1.appendix;

import lombok.Getter;

@Getter
public enum OrderStatus {

    PREPARING(0, "준비중"),
    SHIPPED(1, "배송중"),
    DELIVERING(2, "지역 배송 중"),
    DELIVERED(3, "배송 완료");

    private int code;
    private String message;

    OrderStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
