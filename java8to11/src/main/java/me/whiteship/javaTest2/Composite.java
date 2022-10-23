package me.whiteship.javaTest2;

class point{
    int x,y;
        }
class Circle extends point{ //상속의 경우.
    int r;
        }

class Circle2 {
    point p = new point();
    int c2r;
}

public class Composite {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 1;
        c.y = 2;
        c.r = 2;
        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.r = " + c.r);

        Circle2 c2 = new Circle2();
        c2.p.x = 5;
        c2.p.y = 6;
        c2.c2r = 3;
        System.out.println("c2.p.x = " + c2.p.x);
        System.out.println("c2.p.y = " + c2.p.y);
        System.out.println("c2.c2r = " + c2.c2r);
    }
}
