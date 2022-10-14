package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App_APImethod {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("MinGi");
        name.add("MaxGi");
        name.add("apply");
        name.add("banana");

        name.forEach(System.out::println);


        //기존 방식.
        List<Integer> numbers = new ArrayList< >();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //기존 방식.
        for(int i = 0; i < numbers.size() ; i++) {
            int n = numbers.get(i);
            System.out.println(n);
        }

        System.out.println("===========================");

        //람다를 이용.
        numbers.forEach(i -> System.out.println(i));

        System.out.println("===========================");
        //람다와 메서드 레퍼런스 이용.
        numbers.forEach(System.out::println);
        System.out.println("==========================");

        //배열 나누기 - spliterator
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("==========================");
        while(spliterator1.tryAdvance(System.out::println));

        System.out.println("==========================");

        // removeIf - 조건에맞는 데이터 추려내기.
        name.removeIf(s -> s.startsWith("M"));
        name.forEach(System.out::println);
        System.out.println("==============================");


        //Comparator 인터페이스가 제공하는 메서드. - 배열,리스트의 정렬을 돕기위한 인터페이스.

        List<String> name2 = new ArrayList<>();
        name2.add("MinGi");
        name2.add("MaxGi");
        name2.add("apply");
        name2.add("banana");
        name2.add("Camera");

        name2.sort(String::compareToIgnoreCase);
        name2.forEach(System.out::println);

        System.out.println("==========================");

        //역순 정렬.
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name2.sort(compareToIgnoreCase.reversed());
        name2.forEach(System.out::println);







    }
}










