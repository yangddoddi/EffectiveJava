package com.example.effectivejava.chapter3.item11;

import java.util.HashMap;
import java.util.Objects;

public class PhoneNumber {
    private final int areaCode, prefix, lineNum;
    private int hashCode;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

//    @Override
//    public int hashCode(){
//        int result = Integer.hashCode(areaCode);
//        result = 31 * result + Integer.hashCode(prefix);
//        result = 31 * result + Integer.hashCode(prefix);
//        return result;
//        /*
//        * 31인 이유
//        * 1. 홀수인 것이 좋다(소수가 날아가지 않도록)
//        * 2. 사전에 있는 모든 단어를 해싱했을 때 31이 가장 해시 충돌이 적었다고 하네요..
//        * */
//    }

    @Override
    public int hashCode() {
        if ( hashCode != 0 ) return hashCode;
        else {
            return Objects.hash(areaCode, prefix, lineNum);
        }
        // 멀티 쓰레드일 경우 해시코드가 달라질 가능성도 있음.
    }



    public static void main(String[] args) {
        HashMap<PhoneNumber, String> map = new HashMap<>();
        PhoneNumber phoneNumber = new PhoneNumber(123, 456, 7890);
        PhoneNumber phoneNumber2 = new PhoneNumber(123, 456, 7890);

        map.put(phoneNumber, "웅이");
        map.put(phoneNumber2, "복순이");

        String s = map.get(new PhoneNumber(123, 456, 7890));
        //null

        //다른 값인데 같은 해시코드라면?
        //찾아는 줌. 느려질 뿐. 해시테이블 내부에서 찾는다. (해시충돌) -> LinkedList
    }


}
