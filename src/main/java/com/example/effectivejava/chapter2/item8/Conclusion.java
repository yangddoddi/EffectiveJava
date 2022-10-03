package com.example.effectivejava.chapter2.item8;

public class Conclusion {
    /*
    * 아이템 8. finalizer와 cleaner 사용을 피하라
    * - finalizer와 cleaner는 즉시 수행된다는 보장이 ㅇ벗다.
    * - finalizer와 cleaner는 실행되지 않을 수도 있다.
    * - finalizer 동작 중에 예외가 발생하면 정리 작업이 처리되지 않을 수도 있다.
    * - finalizer와 cleaner는 심각한 성능 문제가 있다.
    * - finalizer는 보안 문제가 있다.
    * - 반납할 자원이 있는 클래스는 AutoCloseable을 구현하고 클라이언트에서
    * - close()를 호출하거나 try-with-resource를 사용해야 한다
    *
    * */

   /*
   * OuterClass - InnerClass ?
   * Static이 아닌 innerClass는 자동으로 OuterClass에 대한 참조를 가진다
   *
   * Lambda도 마찬가지로 외부의 값을 캡처링할 때 해당 값이 static이 아니라면 객체에 대한 참조를 가짐
   *
   * */

    /*
    * Finalizer 공격 막는 방법
    * 1. 상속 자체를 막는다 (Final class)
    * 2. finalize() Override하고 final을 붙인다
  다 * */
}
