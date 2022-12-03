package me.whiteship.javaTest8;

public class Function_Interface {

    static MyFunction2 getMyFunction(){ //반환타입이 MyFunction2 인 메서드.
        MyFunction2 f = () -> System.out.println("f3.run");
        return f;
    }

    public static void main(String[] args) {

        /* 람다 사용 전.
         MyFunction f = new MyFunction(){
             public int max(int a, int b){
                 return a > b ? a : b;
             }
         };
        */

        //위의 코드를 람다로 간편하게 변경
        MyFunction f = (a, b) -> a > b ? a : b;
        int value = f.max(3,4);
        System.out.println(value);

        MyFunction2 f2 = () -> System.out.println("f2.run()");
        f2.run();

        MyFunction2 f3 = getMyFunction();
        f3.run();

    }
}

@FunctionalInterface
interface MyFunction{
    public abstract int max(int a, int b); // -> int max(int a, int b) 와 동일 public abstract 생략가능.

}

@FunctionalInterface
interface MyFunction2{
    void run();
}

