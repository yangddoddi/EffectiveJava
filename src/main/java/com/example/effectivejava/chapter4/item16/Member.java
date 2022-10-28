package com.example.effectivejava.chapter4.item16;

public class Member {
    public String name; // x
    private Long id; // o
    public final int age = 13; // 그래도 죽었다 깨어나도 public을 써야겠다면 final을 사용해라

    public Member(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public static void main(String[] args) {
        Member member = new Member("하하", 13L);
        String name = member.name;
        Long id = member.getId();

        // 가변 값을 사용할 때는 새로운 객체를 생성해서 방어적 복사를 해야 안전하다.
    }
}
