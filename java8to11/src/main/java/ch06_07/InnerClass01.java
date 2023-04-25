package ch06_07;
/* innerClass
* 특징 1. 객체생성없이 내부,외부 클래스의 맴버를 다룰 수 있다.
* 특징 2. 코드의 복잡성을 줄일 수 있다(일종의 캡슐화).*/


class A01{ //B01 클래스의 외부클래스.
    int i = 100;
    B01 b01 = new B01();
     class B01{ //A01 클래스의 내부클래스. 하나의 맴버처럼 사용. 객체생성없이 사용가능.

         void printA01method(){
          System.out.println(i);
        }
     }
}

public class InnerClass01 { // InnerClass -> 클래스 안에 클래스(내부클래스).
    public static void main(String[] args) {

        A01 a01 = new A01();
        a01.b01.printA01method();

    }
}
