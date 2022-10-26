package com.example.effectivejava.chapter3.item14;

public class Conclusion {
    /*
    * Item 14. Comparable을 구현할지 고민하라
    *
    * Object.equals에 더해 순서까지 비교 가능하며 제네릭을 지원한다.
    * 자신이 전달된 객체보다 작으면 음수, 같으면 0, 크면 양수를 리턴한다.
    * (-1, 0, 1이 아님에 주의)
    * 반사성/ 대칭성/ 추이성을 만족해야 한다.
    * x.compareTo(y) == 0이라면 x.equals(y)여야 한다. (무조건은 아님)
    * */
}
