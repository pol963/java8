package me.whiteship.javaTest4;

class car {
      String color;
      int door;

      void drive(){
          System.out.println("drive");
      }

      void stop(){
       System.out.println("stop");
      }

}

class fireCar extends car {
    void water(){
        System.out.println("water");
    }
}

public class Car_Casting {
    public static void main(String[] args) {

        car c = null;
        fireCar fc = new fireCar();
        fireCar fc2 = null;

        fc.water();

        c = fc; //형변환 (car) 생략
        // c.water(); 에러 car 클래스에는 water 메서드가 없기 때문.

        fc2 = (fireCar)c; //형변환 생략불가능 맴버5개. firCar 은 car 을 상속.
        fc2.water();



    }
}















