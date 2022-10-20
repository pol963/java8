package me.whiteship.javaTest2;

public class defaultConstructer1 {
    public static void main(String[] args) {
        data1 d1 = new data1();
        data2 d2 = new data2(3);

        car c = new car("blue","auto");
        System.out.println(c.color);
        System.out.println(c.gearType);

    }
}

class data1{ //컴파일러가 자동으로 기본생성자를 추가해줍니다.

}

class data2{//생성자를 이미 구현했기때문에 컴파일러가 기본생성자를 추가하지 않습니다. -> 클래스를 만들때는 기본생성자는 넣어주는것이 좋습니다.

    data2(){}
    int value;
    data2(int x){
        value = x;
    };
}

class car{

    String color; //차량색상
    String gearType; //기어타입

    car(){} //기본생성자
    car(String c,String gt ){ //매개변수가 있는 생성자.
        color = c;
        gearType = gt;
    }
}

