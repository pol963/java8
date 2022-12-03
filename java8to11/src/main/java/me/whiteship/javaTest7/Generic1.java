package me.whiteship.javaTest7;

import java.util.ArrayList;

public class Generic1 {
    public static void main(String[] args) {

        //Generic 이란 실행시 나오는 형변환 오류를 컴파일러가 잡게 하기 위해 나온 개념.

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3); //이때 정수 3이 아닌 "3" 으로 문자열이 들어간다면 에러 컴파일러가 잡아줍니다. -> 만약 Generic 을 사용하지않는다면 실행시 오류.

        Integer num = list.get(2);
        System.out.println("num : " + num);


        //여러 타입가능.
        ArrayList<Object> list2 = new ArrayList<Object>();
        list2.add(1);
        list2.add("겨울");

        Object getList = list2.get(1);
        System.out.println("getList : " + getList );

    }
}
