package me.whiteship.javaTest4;

class Car{
    int door;
    String color;

    public void stop(){
        System.out.println("car stop");
    }

    public void drive(){
        System.out.println("car drive");
    }

}

class FireEngine extends Car{
    public void water(){
        System.out.println("water cleanup");
    }
}

public class casting {
    public static void main(String[] args) {

        Car c = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        c = fe;

        // c.water();

        fe2 = (FireEngine) c;

        fe2.water();

    }
}
