package com.example.effectivejava.chapter3.item11;

public class Conclusion {
    /*
    * equals를 재정의하려거든 hashCode도 재정의하라
    * - equals 비교에 사용하는 정보가 변경되지 않았다면 hashCode는 매번 같은 값을 리턴해야 한다.
    * - 두 객체에 대한 equasl가 같다면, hashCode도 같아야 한다.
    * - 두 객체에 대한 equals가 다르더라도, hashCode의 값은 같을 수 있지만 해시 테이블 성능을 고려해 다른 값을 리턴하는 것이 좋다.
    * - O(1) -> O(N)으로 낮아짐
    *
    * 불변 객체고 해싱할 일이 많담녀 해시코드를 저장하는 것도 방법이다
    * */

    /*
    * 해시맵 내부의 연결리스트
    * - 자바 8에서 해시 충돌 시 성능 개선을 위해 내부적으로 동일한 버켓에 일정 개수 이상 엔트리가 추가되면
    * 연결리스트 대신 이진 트리를 사용하도록 바뀌었다.
    * - 연결 리스트에서 어떤 값을 찾는데 걸리는 시간 - O(N) 넣을 때는 O(1)
    * - 이진트리에서 어떤 값을 찾는데 걸리는 시간 O(logN) -> 레드블랙트리
    * - why LinkedList ?  공간 복잡도 떄문?
    * */

    /*
    * Thread - Safety
    * - 가장 안전한 방법은 여러 스레드간에 공유하는 코드가 없는 것
    * - 공윻ㅏ는 데이터가 있다면 ?
    * > Synchronization
    * > ThreadLocal -> 한 쓰레드 내에서만 공유 가능한 데이터(Transaction)
    * > 불변 객체 -> Thread-Safe
    * > Synchronized 데이터 -> 성능이 느려진다
    * > 성능 향상? -> 여러 쓰레드가 들어와도 되는 부분은 바로 리턴, 안되는 부분만 잘라서 synchronized
    * (double-checked locking) + volatile까지 붙임(예전에 캐시해둔 데이터가 아닌 메인메모리의 가장 최근 데이터를 가져옴)
    * > Cocurrent 데이터 -> 여러 쓰레드가 동시에 바꾸는 걸 허용함.(기존 자료구조는 허용하지 않음)
    * ..
    * */
}
