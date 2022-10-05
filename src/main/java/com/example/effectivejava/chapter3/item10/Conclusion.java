package com.example.effectivejava.chapter3.item10;

public class Conclusion {
    /*
    * 10. equals는 일반 규약을 지켜 재정의하라
    * 핵심 정리 : equals를 재정의하지 않는 것이 최선
    *
    * 다음 경우에 해당한다면 equals를 재정의할 필요가 없다.
    * 각 인스턴스가 본질적으로 고유하다.
    * 인스턴스의 '논리적 동치성'을 검사할 필요가 없다.
    * 상위 클래스에서 재정의한 equals가 하위클래스에도 적절하다.
    * 클래스가 private이거나 package-private이고 equlas메서드를 호출할 일이 없다.
    * */

    /*
    * 싱글턴에 equals가 필요한가?
    * enum에 equals가 필요한가?
    * 두 개의 지폐가 같은가? 다른 것인가? -> "값이 같다" (논리적 동치성이 필요)
    * 두 개의 문자열이 같은가? "바보", "멍청이" (논리적 동치성 검사 필요 x)
    * 상위클래스에 이미 equals가 정의되어 있다면? (Abstract -> Set, Map)
    *
    * */

    /*
    * 반사성 : A.equals(a) == true
    * 대칭성 : A.equals(B) == B.equals(A) (다른 타입을 지원할 때 깨지기 쉽다.)
    * 추이성 : A.equals(B) && B.equals(C), A.equals(C)
    * -> 상속받은 클래스가 필드를 확장하면 무조건 깨진다 (TimeStamp)
    * -> date.equals(timestamp) true
    * -> timestamp.equals(date) false
    * 일관성 : A.equals(B) == A.equals(B)
    * -> 너무 복잡하게 구현하면 지키기 힘들다( ex URL )
    * notNull : A.equals(null) == false;
    * */

    /*
    * 안전하게 구현하는 법
    * 1. if (this == o) return true
    * 2. if (!(o instanceOf Obj) return false
    * 3. 핵심적인 필드들만 비교할 것
    * -> 내부에 Lock을 구현하기 위해 넣어놓은 필드를 구별하지 마라.
    * 4. 부동소수점의 영향을 받는 자료형(float, double)은 자체적인 compare로 비교
    * 5. primitive 타입이 아니라면 equals를 사용해서 비교
    * 6. 특정 값이 널이여도 된다면 Objects.equals를 사용하면 된다.
    * 7. 책에서 추천하는 방법 -> AutoValue어노테이션 사용
    * 8. 현실 -> 롬복 쓰자 ㅎㅎ
   * */

   /*
   * Value Object
   * 1. 식별자가 없고 불변이다
   * 2. 식별자가 아니라 인스턴스가 가지고 있는 상태를 기반으로 equals, hashCode, toString을 구현한다
   * 3. == 가 아니라 equals로 구별한다
   * 4. 동일한(equals)객체는 상호 교환 가능하다
  다* */

    /*
    * StackOverFlow
    *
    * 스택과 힙(객체들이 존재하는 공간 -> GC)
    * 메서드 호출 시 -> 스택에 스택 프레임이 쌓인다
    * 스택 프레임에 들어있는 정보
    * -> 메서드에 전달하는 매개변수
    * -> 메서드 실행 끝내고 돌아갈 곳
    * -> 힙에 들어있는 객체에 대한 레퍼런스 등
    * 더 이상 스택을 쌓을 수 없다면? StackOverFlowError (주로 재귀호출 시)
    * 스택 사이즈를 조절하고 싶다면? Xxx1M
    * */

    /*
    * SOLID
    * Single responsibility 한 클래스는 하나의 책임만 가져야 한다
    * Open-Closed Principal 확장에는 열려있으나 변경에는 닫혀 있어야 한다
    * Liskov substitution principal 객체는 정확성을 깨트리지 않으며 하위 타입 인스턴스로 변경 가능해야 한다
    * Interface segregation principal 특정 클라이언트를 위한 인터페이스 여러개 > 범용 인터페이스보다 낫다
    * Dependency inversion principal 추상화에 의존하라
    *
    * 중 리스코프 치환원칙
    * -> 상위클래스가 사용하던 코드는 하위클래스도 사용 가능해야함
    * */
}
