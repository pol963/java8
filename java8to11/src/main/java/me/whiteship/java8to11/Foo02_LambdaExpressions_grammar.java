package me.whiteship.java8to11;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Foo02_LambdaExpressions_grammar {


    //람다식의 문법.
    public static void main(String[] args) {

        //파라메터인자가 없고 리턴값을 정해저있는 람다식의 구조.
        //Supplier 는 함수형인터페이스, get10 은 변수 , () 는 넘겨줄 매개변수, -> 이후는 본문이며 10은 리턴값
        //본문(이후 바디) 바디는 리턴값을 줄 수 있고 리턴을 생략할 수 있다.
        //바디는 한줄이라면 중괄호{}를 생략할 수 있다. 여러줄이라면 중괄호 필수.
        Supplier<Integer> get10 = () -> 10;

        //인자가 2개이상인경우 + 인자의 데이터타입이 같을 경우
        BinaryOperator<Integer> sum = (a,b) -> a + b;
        System.out.println(sum.apply(1,3));


    }


}
