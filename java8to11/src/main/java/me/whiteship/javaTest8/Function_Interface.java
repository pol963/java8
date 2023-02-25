package me.whiteship.javaTest8;

public class Function_Interface {

    @FunctionalInterface
    interface MyFunctionTest{
        int max(int a, int b);
    }
    public static void main(String[] args) {

        MyFunctionTest ft = (a,b) -> a > b ? a : b;

        int value = ft.max(5,7);
        System.out.println(value);

    }
}


