package com.example.effectivejava.chapter2.item7.listener;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatRoom {
    private List<WeakReference<User>> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(new WeakReference<>(user));
    }

    public void sendMessage(String message) {
        users.forEach(u -> Objects.requireNonNull(u.get()).receive(message));
    }

    public List<WeakReference<User>> getUsers() {
        return users;
    }

    public List<WeakReference<User>> getUsersStrongReference() {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom = null;
        return users;
    }


}
