package me.whiteship.javaTest6;

import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj.toString());
        }

        it = list.iterator(); //Iterator 는 1회용 따라서 한번더 사용 하려면 한번더 초기화.
        System.out.println("");
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj.toString());
        }

        System.out.println("");

        //아래의 코드도 작동되나 만약 ArrayList 가 아닌 hashMap 의 형태엿다면 작동X. iterator 은 작동O
        for(int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            System.out.println(obj2.toString());
        }

    }
}
