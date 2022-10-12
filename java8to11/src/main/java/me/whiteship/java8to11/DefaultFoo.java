package me.whiteship.java8to11;

import java.util.Locale;

public class DefaultFoo implements Foo04_DefaultM_StaticM {

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    //필요하다면 재정의가 가능합니다.
    @Override
    public void printNameUppercase(){
        System.out.println(this.name.toUpperCase());
    }


    @Override
    public void printNane() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
