package me.whiteship.javaTest3;

class point1{
    int x;
    int y;

    String getLocation(){
        return "x : " + x + ", y : " + y;
    }
}

class point3d extends point1{
    int z;
    //오버라이딩.
    String getLocation(){
        return "x : " + x + " , y : " + y + " , z : " + z;
    }

}

class point3dToString extends Object{
    int x, y;

    public String toString(){

        return "x: " + x + " , y: " + y;
    }
}


public class Overriding {
    public static void main(String[] args) {
        point3d p3 = new point3d();
        p3.x = 3;
        p3.y = 1;
        p3.z = 2;

       System.out.println(p3.getLocation());

       point3dToString pt = new point3dToString();
       pt.x = 3;
       pt.y = 1;
       System.out.println(pt); //toString 생략.


    }
}
