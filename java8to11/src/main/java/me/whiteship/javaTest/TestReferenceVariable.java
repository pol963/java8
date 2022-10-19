package me.whiteship.javaTest;

public class TestReferenceVariable {
    public static void main(String[] args) {

        Data3 d = new Data3();
        d.x = 10;
        System.out.println("main d.x : " + d.x);
        change(d);
        System.out.println("main d.x :  " + d.x);
    }
    static void change(Data3 d){
        d.x = 1000;
        System.out.println("change d.x : " + d.x);
    }

    }

class Data3 {
    int x;
}