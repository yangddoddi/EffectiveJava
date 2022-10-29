package com.example.effectivejava.chapter4.item17;

// 상속을 허용하지 않는다.
// => 상속 받은 객체가 내부 필드를 변경하는 메서드를 만들게 될 수 있음
public final class ImmutableClass {
    // 원칙. private/ final 을 사용한다.
    // => 내부의 어떤 메서드에서도 해당 값을 변경하지 못하게하기 위함.
    // => 우리가 원하는 형태로만 외부에 반환해주기 위함. (final이 없다는 가정 하에)
    private final String name;
    private final Integer age;

    // 내부 변수 가변 객체를 참조하고 있을 경우 private final을 붙여도 여전히 값을 변경할 수 있다.
    // 외부의 다른 객체와 해당 참조를 공유해서도 안되고, 외부에서 접근할 수도 없어야 한다.
    private final MutableClass mutableClass;

    // 상속을 허용하지 않는다.
    // => 상속 받은 객체가 내부 필드를 변경하는 메서드를 만들게 될 수 있음.
    private ImmutableClass(String name, Integer age, MutableClass mutableClass) {
        this.name = name;
        this.age = age;
        this.mutableClass = mutableClass;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // 만약 가변 객체를 외부에 반환해야할 경우 새로운 객체를 생성해서 내보내야한다.
    public MutableClass getMutableClass() {
        return new MutableClass(mutableClass.getName(), mutableClass.getAge());
    }
}
