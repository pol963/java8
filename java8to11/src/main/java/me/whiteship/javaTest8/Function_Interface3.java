package me.whiteship.javaTest8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Function_Interface3 {
    public static void main(String[] args) {

        //String 타입의 데이터를 받아 16진수 변환
        Function<String,Integer> f = (s) -> Integer.parseInt(s,16);

        //Integer 타입의 데이터를 받아 2진수 String 타입으로 변환
        Function<Integer,String> g = (i) -> Integer.toBinaryString(i);

        //f의 매개변수 String g의 리턴.
        Function<String,String> h = f.andThen(g);
        //Integer g의 매개변수 Integer f의 리턴.
        Function<Integer,Integer> h2 = f.compose(g);

        System.out.println(h.apply("FF")); //"FF" 16진수 "2진수String"
        System.out.println(h2.apply(2)); //2 "2진수String" 16진수

        //항등함수 넣은것 그대로 나오는것.
        Function<String,String> f2 = x -> x;
        System.out.println(f2.apply("AAA")); //"AAA"를 넣고 "AAA"가 나옵니다.

        String str1 = new String("abc");
        String str2 = new String("abcd");

        //str1 과 str2 가 같은지 결과 반환.
        Predicate<String> p2 = Predicate.isEqual(str1);
        //boolean result = str1.equals(str2); 와 동일.
        boolean result = Predicate.isEqual(str1).test(str2);
        System.out.println(result);


    }
}
