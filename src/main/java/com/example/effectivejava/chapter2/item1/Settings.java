package com.example.effectivejava.chapter2.item1;

import lombok.ToString;

@ToString
public class Settings {
    private boolean useAutoSteering;
    private boolean useAbs;
    private Difficulty difficulty;
    private Settings() {}
    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }

    public static void main (String[] args) {

        /*
        * 1. 생성자를 통해 생성 시에는 항상 새로운 인스턴스를 만드는 과정을 거쳐야한다
        * 2. 통제가 불가능하다. (하나의 인스턴스만 존재하게 하고 싶다?)
        * */
//        System.out.println(new Settings());
//        System.out.println(new Settings());
//        이 경우에는 같은 클래스에 위치하고 있지만 다른 클래스라서 생성할 수 없다고 치자.


        /*
        * 생성자를 private으로 만든 뒤 static으로 객체를 만들어놓고 팩터리 메서드로 호출할 수 있게 한다면, 하나의 인스턴스만 사용하도록 강요할 수 있다.
        * ex ) Boolean.valueOf의 경우
        * */
        Settings set1 = Settings.getInstance();
        Settings set2 = Settings.getInstance();
        Settings set3 = Settings.getInstance();

        System.out.println(set1.equals(set2));
        System.out.println(set2.equals(set3));

    }
}
