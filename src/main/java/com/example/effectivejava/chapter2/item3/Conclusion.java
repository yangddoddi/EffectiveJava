package com.example.effectivejava.chapter2.item3;

public class Conclusion {

    /*
    *
    * 생성자나 열거 타입으로 싱글턴임을 보증하라
    * 1. private 생성자 + public static field
    * 장점 : 간결하고 싱글턴임을 API에 드러낼 수 있다.
    * 단점1 : 싱글톤을 사용하는 클라이언트 테스트하기 어려워진다. (싱글턴을 사용하는 클래스)
    * -> interface 사용 시에는 Mock을 사용해서 해결할 수 있다
    * 단점2 : 리플렉션으로 private 생성자를 호출할 수 있다.
    * -> 생성자에서 예외 던져서 해결 가능
    * 단점3 : 역직렬화할 때 새로운 인스턴스가 생길 수 있다.
    *
    * 2. private 생성자 + 정적 팩터리 메서드
    * 단점 : 위와 동일하다
    * 장점 : API를 바꾸지 않고 싱글톤이 아니게 변경할 수 있음
    * 장점2 : 정적 팩터리를 제네릭 싱글턴 팩터리로 만들 수 있음
    * 장점3 : 정적 팩터리의 메서드 참조를 공급자로 사용할 수 있음
    *
    * 3. 열거형
    * 장점 : 리플렉션, 직렬화의 방지 수단이 필요하지 않다.
    * 단점 : 상속할 수 없다.
    * 충격적이게도 인터페이스를 구현할 수 있음.
    *
    * */


    /*
    * Serializable
    * 바이트스트림으로 변환한 객체를 파일로 저장하거나 네트워크를 통해 다른 사람에게 전송
    * transient를 사용해서 직렬화하지 않을 필드 선언하기
    * serialVersionUID는 언제 사용하는가요
    *
    * 직렬화 후 클래스 멤버가 변경되고 역직렬화 시?
    * serialVersionUID가 달라서 문제가 생김.
    *
    * 임의로 무조건 역직렬화하게 하는 방법?
    * java config inspection -> serializable class without serialVersion 옵션
    * -> 자동완성으로 만들기 가능
    * private static final long serialVersionUID = ~~ ;
    * */
}
