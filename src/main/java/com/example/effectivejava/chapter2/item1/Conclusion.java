package com.example.effectivejava.chapter2.item1;

class Conclusion {
    public Conclusion() {
    }

    /*
    * 정적 팩토리 메서드의 장점
    * 1. 이름을 가질 수 있다. (동일한 시그니처를 가진 생성자를 특성에 따라 지정 가능)
    * 2. 호출될 때마다 인스턴스를 새로 생성할 필요가 없음. (싱글톤 보장)
    * 3. 반환 타입의 하위 타입 객체를 반환할 수 있음. (인터페이스에서 of메서드 사용 시)
    * 4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환 가능(EnumSet)
    * 5. 정적 팩터리 메서드는 작성하는 시점에는 반환할 클래스가 존재하지 않아도 된다.
    * (import 없이 meta를 이용하여 클래스를 로드할 수 있음)
    * 
    * 정적 팩토리 메서드의 단점
    * 1. private 생성자 사용 시 상속할 수 없다.
    *  -> 근데 그냥 필드로 가지면 그만임
    *  -> 혹은 생성자도 열어두고 팩토리 메서드도 사용하는 방법도 있음.
    * 2. 팩토리 메서드는 javaDoc로 문서화 시 별도로 분류되지 않아 개발자가 찾기 힘들다.
    *  -> 그래서 of, valueOf, getInstance, instance 등 주로 사용하는 메서드를 사용해서 펙터리 메서드를 만들기를 권장한다.
    *  -> 혹은 문서화 시 @See #getInstance()같은 어노테이션을 사용해서 설명을 작성해준다.
    * 
    * */

    /*
     * Enum
     * 상수 목록을 담을 수 있는 데이터 타입.
     * 특정한 변수가 가질 수 있는 값을 제한 가능. (Type Safety)
     * Singletone Pattern에도 사용할 수 있음.
     * values를 사용해서 모든 값을 배열 형태로 가져올 수 있다.
     * Enum은 하나의 인스턴스만 제공하기 때문에 ==으로 비교 가능하다.
     * ++ 오히려 nullPointException을 피하기 위해 그냥 ==이 낫다.
     *
     * EnumMap or EnumSet?
     * */

    /*
    * FlyweightPattern
    * 객체의 같은 필드가 여러번 재생성되는 경우
    * 자주 변하는 속성(extrinsit)과 변하지 않는 속성(intrinsit)을 분리하고 재사용하여 메모리 사용 줄임
    * */

   /*
   * interface
   * JAVA8
   * -> default method 혹은 public static method를 정의할 수 있다.
   * JAVA9
   * -> private static method를 가질 수 있다.
   *
   * -> private field를 가져야하는 경우가 아니라면 abstract에서 interface로 많이 대체됨
   * ex > Comparator의 경우 reverse(default) reverseOrder(static)
   * */

    /*
    * 서비스 제공자 프레임워크 (SPI)와 서비스 제공자(서베스 구현체)
    * -> 확장 가능한 애플리케이션을 만드는 방법 (OCP)
    * -> 여러 구현체가 만들어질 수 있는 인터페이스
    *
    * Spring의 서비스 제공자 등록 API?
    * -> Configuration
    *
    * Spring의 서비스 제공자 접근 API?
    * -> ApplicationContext의 getBean
    * -> Autowired
    *
    * 자바의 경우 META와 ServiceLoader
    *
    * 혹은 브릿지 디자인 패턴
    * */

    /*
    * 리플렉션 : 반영된 이미지를 보고 생성한다는 의미.
    *
    * 1. 클래스 로더를 통해 읽어온 클래스 메타 데이터를 사용하는 기술
    * 2.
    *
    * ex > 애너테이션 정보, 속성 불러올 때
    *      DynamicJdkProxy
    *
    * */
}
