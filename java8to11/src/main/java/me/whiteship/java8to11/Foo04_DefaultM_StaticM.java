package me.whiteship.java8to11;

import java.util.Locale;

public interface Foo04_DefaultM_StaticM {

    void printNane();

    /*
        @implSpec
        이 구현체는 getName()으로 가져온 문자를 대문자로 출력.
    */
    default void printNameUppercase(){
        System.out.println(getName().toUpperCase());
    }

    String getName();

}
