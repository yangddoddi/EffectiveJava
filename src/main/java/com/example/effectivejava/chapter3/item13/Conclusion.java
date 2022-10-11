package com.example.effectivejava.chapter3.item13;

public class Conclusion {
    /*
    * clone 규약
    * a.clone() != a   => true
    * a.clone().getClass() == a.getClass()      => true
    * a.clone().equals(a) ?      true일수도 아닐수
    *
    * 불변 객체라면
    * Cloneable 인터페이스 구현하고 clone 메서드 재정의. 단, super.clone()을 사용하라 (비결정적)
    * super.clone을 사용할 경우 규약이 깨진다.(하위 클래스에서)
    * 상위타입을 하위타입으로 변경할 수 없기 때문
    *
    * */

    /*
    * 재정의 주의점
    * 1. 접근 제한자는 public, 반환 타입은 자신의 클래스
    * 2. super.clone을 호출한 뒤 필요한 필드를 수정
    * 3. 배열 복제할 때는 배열의 clone 메서드 사용
    * 4. 경우에 따라 final을 쓸 수 없을지도
    * 5. 필요한 경우 직접 deep copy해줘야
    * 6. spuer.clone으로 객체를 만든 뒤 고수준 메서드를 호출하는 방법도
    * 7. 오버라이딩 할 수 있는 메서드는 참조하지 않을 것 // 하위클래스에스에서 동작이 바뀔 수 있기 때문
    * 8. 상속용 클래스(abstract)면 Cloneable을 구현하지 말자.
    * 9. 어쩔 수 없이 상속받게 됐을 경우 해당ㅁ ㅔ서드를 사용하지 못하게 막아버려라.
    * 9. Cloneable을 구현한 스레드 안전 클레 ㅡ잓성 시에는 동기화해야 한다.
    * */

    /*
    * 왜 비검사 예외를 선호하는가?
    * - 컴파일 에러를 신경쓸 필요가 없다.
    * - 그러면 왜 검사 예외가 있는 것일까요?
    *
    *  왜 unchecked exception은 방치하는가?
    *  - 클라이언트가 해결할 방법이 없다.
    * */

    /*
    * TreeSet - 정렬된 컬렉션
    *
    * 엘리먼트를 추가한 순서는 중요하지 않다.
    * 엘리먼트가 지닌 natural order에 따라 정렬한다. (natural order가 없으면 아예 못 넣는다.)
    * 오름차순으로 정렬한다.
    * thread-safe하지 않다.
    * Collections.synchronizedSet(~~) -> 쓰레드 쒜입
    *
    * */
}
