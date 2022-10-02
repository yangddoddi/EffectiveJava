package com.example.effectivejava.chapter2.item7.listener.optional;

import java.util.Optional;

public class Channel {
    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return Optional.empty();
        } else {
            return Optional.of(new MemberShip());
        }
    }

    public static void main(String[] args) {
        Channel channel = new Channel();
        Optional<MemberShip> optional = channel.defaultMemberShip();

        optional.ifPresent( m -> {
            System.out.println(m);
        });
    }
}
