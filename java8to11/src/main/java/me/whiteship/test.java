package me.whiteship;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class test {
    public static void main(String[] args) {

        ArrayList<Product> productArrayList1 = new ArrayList<Product>();
        //ArrayList<Product> productArrayList2 = new ArrayList<Tv>();
        List<Tv> productArrayList2 = new ArrayList<Tv>();

        productArrayList1.add(new Product());
        productArrayList1.add(new Tv());
        productArrayList1.add(new Audio());

        productArrayList2.add(new Tv());
        // productArrayList2.add(new Product());

        printAllArrayList(productArrayList1);
        System.out.println("");
        printAllListTv(productArrayList2);
    }

    public static void printAllArrayList(ArrayList<Product> list){
        for(Product p : list){
            System.out.println(p);
        }
    }

    public static void printAllListTv(List<Tv> list){
        for(Tv t : list){
            System.out.println(t);
        }
    }

}
