package ch06_07;

class Car {
    String color;
    int door;

    public void drive(){
        System.out.println("drive~");
    }
    public void stop(){
        System.out.println("stop~");
    }
}

class FireEngine extends Car {
    void water(){
        System.out.println("소화작업을 위한 물 뿌리기");
    }
}

public class Car01 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water(); //리모콘 FireEngine 5개
        car = fe; //리모콘 Car 4개
        //car.water(); //Car 리모콘에는 water 이 없음.
        fe2 = (FireEngine)car; // 형변환 필수 기재. fe2 기능 5개.
        fe2.water(); // 사용가능.
    }
}
