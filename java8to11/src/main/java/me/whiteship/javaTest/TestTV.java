package me.whiteship.javaTest;

public class TestTV {
    public static void main(String[] args) {

        Tv t1 = new Tv();
        t1.channel = 8;
        t1.color = "red";

        t1.C_Up();
        System.out.println(t1.channel);
        t1.C_Down();
        System.out.println(t1.channel);


    }
}

//클래스는 객체를 만들기위한 설계도.
class Tv{

    //객체를 만들고 사용할때 필요한 맴버변수-속성
    String color;
    boolean power;
    int channel;

    //객체를 만들고 사용하기위한 맴버메서드-기능
    void power(){ power = !power;}
    void C_Up(){--channel;}
    void C_Down(){++channel;}
        }
