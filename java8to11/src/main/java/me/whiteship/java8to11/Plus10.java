package me.whiteship.java8to11;

import java.util.function.Function;

//기존의 RunFunctionalInterFace,RunSomething 등의 함수형인터페이스는 자바에서 기본적으로 제공해줍니다.
public class Plus10 implements Function<Integer,Integer> {

    //자바 기본제공 함수형인터페이스메서드의 apply.
    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
