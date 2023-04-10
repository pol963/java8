package ch06_07;

class Point01{
    int x, y;
}

//포함관계.
class Circle01{
    Point01 p = new Point01();
    int z;
}


public class Inheritance02 {
    public static void main(String[] args) {
        Circle01 c = new Circle01();
        c.p.x = 1;
        c.p.y = 2;
        c.z = 3;
        System.out.println("c.p.x = " + c.p.x);
        System.out.println("c.p.y = " + c.p.y);
        System.out.println("c.z = " + c.z);
    }
}
