package ch06_07;

import java.util.Scanner;

public class Method_Calculator {
    public static void main(String[] args) {
        MyMath Mm = new MyMath();
        long resultAdd =Mm.add(3,2);
        System.out.println("resultAdd: " + resultAdd);
        System.out.println(Mm.subtract(3,1));
        System.out.println(Mm.multiply(5,6));
        System.out.println(Mm.divide(9,3));

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자입력");
        long m1 =scanner.nextLong();
        long m2 =scanner.nextLong();
        long maxTotal = Mm.max(m1,m2);
        System.out.println("maxTotal = " + maxTotal);
        
        
    }
}

class MyMath {
    public long add(long x, long y) {
        long result = x + y;
        return result;
    }

    public long subtract(long x, long y) {
        long result = x - y;
        return result;
    }
    public long multiply(long x, long y){
        long result = x * y;
        return result;
    }
    public double divide(double x, double y){
        return x / y;
    }

    public long max(long a, long b){

        return a > b ? a : b;
    }


}