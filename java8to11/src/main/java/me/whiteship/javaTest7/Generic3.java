package me.whiteship.javaTest7;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv1 extends Product {}
class Audio2 extends Product {}



public class Generic3 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        List<Tv1> ProductList2 = new ArrayList<Tv1>(); //가능. 다형성.
        // ArrayList<Tv1> productList2 = new ArrayList<Product>(); 에러 제네릭스 타입변수 불일치.

        productList.add(new Tv1()); // 상속받은 자손 가능. 다형성
        productList.add(new Audio2()); // 상속받은 자손 가능. 다형성

        ProductList2.add(new Tv1());
        // ProductList2.add(new Audio2()); 불가능 Tv1과 Audio2 는 아무런 관계도 없습니다.

        printlnAll(productList);
        System.out.println("");
        printlnAllTv(ProductList2);
    }

    // 출력 메서드.
    public static void printlnAll(ArrayList<Product> list){ //제네릭스 타입 변수가 Product Tv1 혹은 Audio2 는 들어올 수 없습니다.
        for(Product p : list){
            System.out.println(p);
        }
    }

    public static void printlnAllTv(List<Tv1> list){
        for(Tv1 t : list){
            System.out.println(t);
        }
    }

}
