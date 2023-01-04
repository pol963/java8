package me.whiteship.javaTest8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Function_Interface_collection_framework {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++) {
            list.add(i);
        }

       /* Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
        System.out.println(list.toString());")
        */

        //위의 방법들을 아래와같이 간단하게 사용.
        list.forEach(i -> System.out.print(i+","));

        System.out.println("");

        //removeIf 조건에 맞는 값 제거.
        list.removeIf(x -> x%2==0 || x%3==0 );
        System.out.println(list);

        //list 의 각 요소에 속성더하기.
        list.replaceAll(i->i*10);
        System.out.println(list);


        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");

        //Iterator 가 아닌 메서드로 다루기.
        map.forEach((k,v)-> System.out.print("{" +k+"," +v+ "},"));



    }
}
