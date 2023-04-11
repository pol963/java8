package ch06_07;

class Point03 extends Object{
    int x, y;

    @Override
    public String toString() {
        return "x : " + x + " , y :" + y;
    }
}


public class Overriding02 {
    public static void main(String[] args) {

        Point03 p3 = new Point03();
        p3.x = 100;
        p3.y = 200;

        //System.out.println(p3.toString());
        System.out.println(p3);

    }
}
