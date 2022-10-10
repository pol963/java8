package me.whiteship.java8to11;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {


        UnaryOperator<String> hi = (s) -> "hi"+s;
        System.out.println(hi.apply("MinGi"));

        //Greeting 클래스의 hi 메서드를 참조.
        UnaryOperator<String> hi2 =  Greeting::hi;
        System.out.println(hi2.apply("MinGi"));

        //Greeting 클래스의 hello 메서드를 참조. static 이 아니기에 new 로 객체를 생성
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply(" MinGi"));

        //Greeting 클래스의 인자가 있는 생성자.
        Function<String,Greeting> MinGiGreeting = Greeting::new;
        Greeting minGi = MinGiGreeting.apply("MinGi");
        System.out.println(minGi.getName());


    }

}
