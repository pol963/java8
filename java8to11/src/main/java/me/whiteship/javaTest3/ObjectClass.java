package me.whiteship.javaTest3;

class point{ //extends Object 생략
    int x, y;
}

class Circle{//Object 생략
    int r;
    point p = new point();
}

public class ObjectClass {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println(c.toString()); //toString() 메서드는 ObjectClass 의 맴버. 컴파일러의 자동추가로 자동상속.
        //toString 은 생략이 가능 println() 메서드의 기능중 하나.
    }
}
