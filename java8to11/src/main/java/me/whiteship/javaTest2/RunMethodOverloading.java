package me.whiteship.javaTest2;
/*
    메서드 오버로딩에 대해 학습.
    이름은 같으나 기능이 다른 메서드 3개를 구현하기.
    각 타입은 int,long,array[] 의 타입.
 */

public class RunMethodOverloading {
    public static void main(String[] args) {

        MathOverloading mo = new MathOverloading();
        System.out.println(mo.add(1,3));
        System.out.println(mo.add(2,4L));
        int[] a = {1,2,3,5};
        System.out.println(mo.add(a));
    }

}

class MathOverloading{
     int add(int a, int b){
        return a+b;
    }

     long add(int a, long b){
        return a+b;
    }

     int add(int[] a){
        int result = 0;
        for(int i = 0 ; i <a.length ; i++){
            result += a[i];
        }

        return result;
    }

}