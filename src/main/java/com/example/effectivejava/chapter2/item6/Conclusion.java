package com.example.effectivejava.chapter2.item6;

public class Conclusion {

    /*
    * 불필요한 객체 생성을 피하라
    * 1. 문자열
    * - 동일한 객체라서 매번 새로 만들 필요 X
    * - new String("dd")가 아닌 문자열 리터럴 "자바"를 사용해 동일 무낮열을 재사용하자
    * 2. 정규식, pattern
    * - 생셩 비용이 비싸기 때문에 캐싱하여 재사용하자
    * - 유한 상태 알고리즘이 사용되기 떄문
    * 3. 오토박싱
    * - 기본 타입(int)를 상응하는 (Integer)로 변환
    * - 섞어서 사용하면 불필요한 객체가 생성됨.
    * */

    /*
    * Deprecation
    * - 사용 자제를 권하고 대안을 제시하는 방법
    * - @Deprecated(forRemoval = true, since = "x.x")
    * - : 삭제될 예정임을 전달
    * - @deprecated
    * - : javadoc에 설명 작성용
    * */

    /*
    * Pattern
    * String.matches(String regexn)
    * String.split(String regex) -> 한 글자인 경우 빠름(성능차이X)
    * Pattrn.compile(regex).split(str)
    * String.replace*(String regex, String replacement)
    * Pattern.compile(regex).matcher(str).replaceAll(repl)
    * */

    /*
    * 가비지 컬렉션
    * - Mark, Sweep, Compact
    * - Young Generation (Edan, S0, S1), Old Generation
    * - Minor GC, Full GC
    * - ThroughPut, Latency (Stop-The-World), Footprint
    * - Serial, Parallel, CMS, G1, ZGC, Shenandoah
    *  -> How to choose the best java garbage collector
    *
    * 1. 함수 내부에서 만들어진 객체는 함수 종료 시 객체 또한 가비지 컬렉터에 의해 삭제된다.
    * 2. Mark : 오브젝트가 이후 참조되는지 확인
    * 3. Sweep : 메모리 삭제
    * 4. Compact : 파편화된 메모리 정리
    * 5. Young Generation : Old Generation 가기 전까지 Eden -> S0 -> S1으로 이동 (가득찰 때마다)
    * 6. Old Generation : 오래 참조되는 객체만 Old Generation에서 관리됨
    * 7. Minor GC : Young Generation에서 일어나는 GC
    * 8. Full GC : Old Generation에서 일어나는 대규모 GC
    * 9. Serial GC : 싱글 스레드로 작동
    * 10. Parallel GC : 멀티 스레드로 작동
    * 11. Latency : GC 가동 시 GC만 작동하고 이외 모두 정지됨. (특히 Compact)
    * 12. Footprint : GC 가동 시 필요한 메모리 공간
    * 13. CMS GC 부터는 Latency가 굉장히 줄어듦.
    * 14. 현재 많이 사용되는 것 : G1, ZGC(가장 발전된 형태)
    * */
}
