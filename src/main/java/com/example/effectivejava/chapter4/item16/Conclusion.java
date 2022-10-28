package com.example.effectivejava.chapter4.item16;

public class Conclusion {
    /*
    * 아이템 16. public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라
    * - 클라이언트 코드가 필드를 직접 사용하면 캡슐화의 장점을 제공하지 못한다
    * - 필드를 변경하려면 API를 변경해야 한다.
    * - 필드에 접근할 때 부수 작업을 할 수 없다.
    * - Package-private 클래스 또는 private 중첩 클래스라면 데이터 필드를 노출해도 문제가 없다.
    * */

    /*
    * 이걸 무시하고 만든 Dimension 클래스는 성능에 문제가 있음.
    * 안전하게 사용하기 위해 매번 방어적 복사가 필요함.
    * 또한 중복 코드가 계속해서 발생함.
    * */
}
