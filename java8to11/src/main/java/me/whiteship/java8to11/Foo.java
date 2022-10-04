package me.whiteship.java8to11;

import java.util.function.*;

//자바8에서의 기존 클래스에서 람다식으로 변경 가능함을 학습.
public class Foo {

    public static void main(String[] args) {

        //익명 내부 클래스 에서 람다식으로 코드를 바꿔주는것
        RunFunctionalInterFace runFunctionalInterFace = (number) -> number + 10;
        System.out.println("");
        System.out.println("");

        /*
        자바에서 기본제공해주는 함수형인터페이스의 메서드로 구현.
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));
        */

        //Plus10 클래스가없어도 아래처럼 자바에서 기본제공해주기때문에 구현이 가능합니다. ->apply 기본제공
        //Integer 타입으로 파라메터로 받고 Integer 타입으로 값을 리턴해주는것.
        //plus10 은 변수 이름 , =변수에 대입 ()파라메터값(지정해준 Integer) i는 이후 숫자대입 +10은 i에 더할 숫자. -> 이후는 리턴값
        Function<Integer,Integer> plus10 = (i) -> i+10;
        //함수조합을 위한 람다.
        Function<Integer,Integer> multiply2 = (i) -> i*2;

        //apply 메서드에 의해 1+10.
        //System.out.println(multiply2.apply(1));

        //고차원함수 - 함수가 함수를 매개변수로 받을 수 있고 리턴할 수 있다.
        //compose 메서드는 입력받은값을 먼저 처리하고 이후 다시 앞의 메서드에 결과값를 전달.
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(10));

        //andThen compose 와는 다르게 받은 파라메터값을 먼저 앞에있는 메서드에게 넘겨 처리한 후 뒤의 메서드에게 결과값을 넘겨줌.
        System.out.println(plus10.andThen(multiply2).apply(10));


        //Consumer - 자바에서 기본으로 제공해주는 함수형 인터페이스. 리턴값이 X
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        //Supplier - 값을 가저오는 함수형인터페이스.
        Supplier<Integer> getInt = () -> 50;
        System.out.println(getInt.get());

        //Predicate - 파라메타값 참,거짓 리턴.
        Predicate<String> startsWithMinGi = (s) -> s.startsWith("MinGi");
        System.out.println(startsWithMinGi.test("MinGi"));

        Predicate<Integer> isEven = (i) -> i%2 == 0;
        System.out.println(isEven.test(9));

        //UnaryOperator - 받는 파라메터 값과 리턴해주는 자료형이 같다면 하나로 통일 가능.
        UnaryOperator<Integer> plus20 = (i) -> i+20;
        UnaryOperator<Integer> multiply3 = (i) -> i*10;
        System.out.println(plus20.compose(multiply3).apply(5));


    }
    }

