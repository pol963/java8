package me.whiteship.javaTest8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Function_Interface2 {
    public static void main(String[] args) {

        Supplier<Integer> s = () -> (int)(Math.random() *100)+1; //1~100까지의 난수.
        Consumer<Integer> c = i -> System.out.print(i+" , ");
        Predicate<Integer> p = i -> i%2==0; //짝수 검사.
        Function<Integer, Integer> f = i -> i/10*10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s,list);
        System.out.println(list);
        printEvenNum(p,c,list);

    }

    //짝수만 넣어주는 메서드.
    static <T> void printEvenNum(Predicate<T> p,Consumer<T> c,List<T> list){
        System.out.print("[");

        for(T i : list){
            if(p.test(i)){
                c.accept(i);
            }
        }

        System.out.print("]");
    }



    //난수 넣어주는 메서드.
    static <T> void makeRandomList(Supplier<T> s , List<T> list){
        for(int i = 0; i < 10; i++){
            list.add(s.get());
        }
    }






}
