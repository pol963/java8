package me.whiteship.javaTest8;

import java.util.List;
import java.util.function.Supplier;

public class Function_Interface2 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)Math.random()*100+1;
        System.out.println(s);



    }




}
