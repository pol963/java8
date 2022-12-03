package me.whiteship.javaTest7;

public class InnerClass2 {

    class InstanceInner{
        int iv = 100;
        final static int CONST = 110; //상수 static 제어자가 있지만 상수이기에 일반 InnerClass 에서도 정의 가능.
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 220;
    }

    void myMethod(){
        class LocalInner{
            int iv = 300;
            final static int CONST = 330;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        // System.out.println(LocalInner.CONST); 사용불가 지역 내부 메서드 클래스.
    }
}
