package com.example.effectivejava.chapter2.item7;

public class Conclusion {
    /*
    * 다 쓴 객체 참조를 해제하라
    * - 어떤 객체에 대한 레퍼런스가 남아있으면 가비지 컬렉션의 대사잉 되지 않는다
    * - 자기 메모리를 직접 관리하는 클래스라면 메모리 누수에 주의해야 한다
    * 예) 스택, 캐시, 리스너, 콜백
    * - 참조 객체를 null처리하는 일은 예외적인 경우이며 가장 좋은 방법은 유효범위 밖으로 밀어내는 것
    * */

    /*
     * NullPointerException
     * Optional을 활용해서 NullPointerException을 최대한 피하자
     * why NullPointerException?
     * - 메서드에서 null을 리턴 && null 체크 x
     * 메서드에서 적절한 값을 리턴할 수 없는 경우에 선택할 수 있는 대안
     * - 예외를 던진다
     * - null을 리턴한다
     * - Optional을 리턴한다
     *
     * Optional 객체를 반환 값으로 사용할 때 return null 절대 금지 (return Optional.empty)
     * Oprional로 컬렉션을 감싸지 말것 (이미 empty()메서드가 있음)
     * 파라미터로 Optional 사용 금지 (아무 의미가 없음. 어차피 optional인지 null인지 체크)
     *
     * primitiveType이면 OptionalLong OptionalInt 쓰삼.
     * */

    /*
    * weakHashMap
    * : 더이상 사용하지 않는 객체를 GC할 때 자동으로 삭제해주는 Map
    *
    * - key가 더이상 강하게 참조되는 곳이 없다면 해당 엔트리(키,밸류)를 제거하다
    * - 레퍼런스 종류 -> Strong, Soft, Weak, Phantom
    * - 맵의 엔트리를 맵의 value가 아니라 key에 의존하는 경우 사용(흔치 않음)
    * - key reference를 만들어서 사용해야함 (자바 내부에 상수로 등록되어 해제 안되기떄문)
    * - 캐시를 구현할 때 사용할 수 있으나 캐시 직접 구현은 권장하지 않음
    *
    * SoftReference -> 공간 정리 필요성이 있을 때 삭제(gc가 관리하는 것으로 항상 없어지는 게 아님)
    * WeakReference -> GC 일어나면 ㅇ벗어짐
    *               -> WeakHashMap에서만 작동함, 다른 자료구조에서는 의미 없고 직접 구현해야..
    * PhantomReference -> Queue를 사용해야함
    *                  -> 사라지지 않고 queue에 저장됨
    *                  -> 자원 반납 여부 체크 혹은 자원 정리 용도로 사용
    * 중요 : WeakReference, SoftReference는 굉장히 불확실함(GC에 의존하기 때문에)
    * 명시적으로 제거하는 게 나을 수 있음
    *
    *
    *    음* */

    /*
    * ScheduledThreadPoolExecutor
    * Thread, Runnable, ExecutorService
    * 쓰레드풀의 개수를 정의할 떄 주의할 것
    * CPU, I/O
    * 쓰레드툴의 종류
    * Single, Fixed, Cached, Scheduled
    * Runnable, Callable, Future
    * CompletableFuture, ForkJoinPool
    * */
}
