package com.example.effectivejava.chapter4.item15;

public class Conclusion {
    /*
    * item 15. 클래스와 멤버의 접근 권한을 최소화하라
    * - 시스템 개발 속도 증가 (여러 컴포넌트 병렬 개발)
    * - 시스템 관리 비용 감소 (컴포넌트 빠른 파악)
    * - 성능 최적화 (프로파일링을 통한 컴포넌트 최적화)
    * - 소프트웨어 재사용성
    * - 시스템 개발 난이도 하락 (전체를 만들기 전에 개별 컴포넌트 검증 가능)
    *
    * 모든 클래스와 멤버의 접근성을 좁히면 좋다.
    * 탑래벨 클래스와 인터페이스에 package-private 혹은 public을 사용할 수 있다.
    * public으로 선언한 API는 하위 호환을 유지하기 위해 지속적으로 관리해야 한다.
    * 패키지 외부에서 쓰이지 않을 클래스나 인터페이스라면 package-private으로 선언하는 것이 좋다.
    *
    * 한 클래스에서만 사용하는 Package-private 클래스나 인터페이스는 당 클래스에 private static으로 중첩시키는 것이 좋다.
    * */

    /*
    * private & package-private => 내부 구현용
    * public, protected => 공개 API
    * 코드 테스트 용도로 private을 package-private으로 만드는 것은 가능
    * public 클래스의 인스턴스 필드는 되도록 public이 아닌 것이 좋다.
    * 클래스에서 public static final 배열 필드를 두거나 해당 필드를 반환하는 접근자 메서드를 제공하면 안됨
    * */

    /*
    * 단, Serializable 구현 시에는 private 메서드도 공개적으로 사용될 수 있다.
    * => Serializable을 위해 값을 유지해야하므로
    * */

    /*
    * 자바 9 모듈? (Java Platform Module System, JPMS)
    * 언정성 -> 순환 참조를 허용하지 않는다, 패키지는 모듈 내에서만 사용 가능하다
    * 캡슐화 -> public interface/class도 공개된 패키지만 사용 가능하다.
    * 확장성 -> 필요한 자바 플랫폼 모듈만 모아서 JRE를 구성할 수 있다.
    * */
}
