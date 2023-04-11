package ch06_07;

class Point2{
    int x, y;
    String getLocation(){
        return "x : " + x + "y : " + y;
    }
}

class Point3d extends Point2{
    int z;

    @Override
    String getLocation(){
        return "x : " + x + " , y : " + y + " , z : " + z;
    }

}

public class Overriding01 {
    public static void main(String[] args) {

        Point3d p3 = new Point3d();
        p3.x = 3;
        p3.y = 6;
        p3.z = 9;

        System.out.println(p3.getLocation());

    }

}
