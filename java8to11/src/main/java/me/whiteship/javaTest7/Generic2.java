package me.whiteship.javaTest7;

import java.util.ArrayList;

class Tv{ }
class Audio{ }

public class Generic2 {
    public static void main(String[] args) {

        ArrayList<Tv> v = new ArrayList<>();

        v.add(new Tv());
        // v.add(new Audio()); 타입변수가 Tv 타입 이기에 Audio 는 들어갈 수 없습니다.

        Tv t =  v.get(0); //형변환이 필요 없습니다.


    }
}
