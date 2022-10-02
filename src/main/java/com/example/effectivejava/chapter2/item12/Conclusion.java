package com.example.effectivejava.chapter2.item12;

public class Conclusion {
    /*
    * toStirng은 간결하면서 사람이 읽기 쉬운 형태의 유익한 정보를 반환해야 한다.
    * Object의 toString은 클래스이름@16진수로 표기한 해시 코드
    * 객체가 가진 모든 정보를 보여주는 것이 좋다
    * 값 클래스라면 포맷을 문서에 명시하는 것이 좋으며, 해당 포맷으로 객체를 생성할 수 있는
    * 정적 패터리나 생성자를 제공하는 것이 좋다.
    * toString이 반환한 값에 포함된 정보를 얻어올 수 있는 API를 제공하는 것이 좋다.
    * 경우에 따라 AutoValue, 롬복 또는 IDE를 사용하지 않는 게 적절할 수 있다.
    * */
}
