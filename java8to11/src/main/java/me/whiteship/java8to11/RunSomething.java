package me.whiteship.java8to11;

//자바8에 들어와서 인터페이스에 정의할 수 있는 메서드가 더욱 다양해짐을 공부.


//만약 함수형이 아닌 기능적 인터페이스를 사용하고 싶다면 @FunctionalInterface 어노테이션을 써주면 됩니다.
public interface RunSomething {

    //인터페이스에 하나의 추상메서드가 하나만 있는것을 함수형인터페이스라고 합니다. -> 다른 static,default 메서드가있어도 추상메서드하나만 중요.
    void doIt();

    //static 메서드의 구현가능.
    static void printName(){
        System.out.println("MinGi");


    }

    //default 메서드의 구현가능.
    default void printAge(){
        System.out.println("30");
    }




}
