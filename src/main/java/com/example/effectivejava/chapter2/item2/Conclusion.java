package com.example.effectivejava.chapter2.item2;

public class Conclusion {

    /*
    *
    *
    * 장점
    * - 불변
    * - 필요한 인자 가독성
    *
    * 단점
    * - 코드 길어진다 (롬복으로 극복 가능)
    * - 롬복 사용 시 생성자와 빌더 모두 존재하게 된다 (AllArgConstructor PRIVATE으로 극복 가능)
    * - 필수 값을 지정해줄 수 없다 (생성자 만들어서 위에 Builder 붙이면 극복 가능)
    *
    *
    * */


    /*
    * 자바빈 규약
    * - GUI에서 값을 불러오기 위함
    * - 굉장히 광범위
    * - Getter Setter 이름 규약 (getXXX, setXXX, isXXX)
    * - 기본 생성자 (리플렉션을 위해)
    * - Serializable 구현 (객체 저장을 위해)
    *
    * -> 현재는 GUI툴이 아닌 프레임워크를 위해
    * -> NoArg, Getter 필요(여러 프레임 워크에서 리플렉션을 사용하므로)
    * */


    /*
    * Oject.freeze()에 전달한 객체는 더이상 변경할 수 없음
    *
    * 참고 -> immutable은 내부 참조 객체는 불변이 아님.
    * */

    /*
    * IllegalArgumentException
    * - 잘못된 인자를 넘겨 받았을 때 사용할 수 있는 기본 런타임 예외
    * - checkedException (선언 강제)
    * - uncheckedException (catch할 수 없는)
    *
    * IllegalArgumentException("예외 메세지")
    * 굳이 메서드에 UnchekedExceptuin을 throws를 표기하는 이유?
    * 예외 발생할 수 있음을 미리 알려주기 위해
    *
    * 언제 CheckedException을 쓰지?
    * 추가적인 처리를 시키고 싶은 경우
    *
    * RuntimeExceptIon 읽어보기기    * */

    /*
    * varargs(가변인수)
    * 메서드에서 하나만 선언할 수 있음
    * -> 배열로 가져와서 풀어준느 것.
    *
    *
    * */
}
