package ch06_07;

public class class_Tv {
    public static void main(String[] args) {

        Tv t = new Tv();
        t.channel = 3;
        t.power();
        t.channelDown();

        System.out.println("지금 채널은 "+ t.channel +" 입니다.");
    }


}
//설계도 -> 클래스
class Tv{

    //속성
    int channel;
    String color;
    boolean power;

    //기능
    void power(){
        power = !power;
    }
    void channelDown(){
        --channel;
    }
    void channelUp(){
        ++channel;
    }
}