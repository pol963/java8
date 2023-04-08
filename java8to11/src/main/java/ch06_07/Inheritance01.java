package ch06_07;

class Tv01{

    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }

}

class SmartTv01 extends Tv01{
    boolean caption;
    void displayCation(String text){ //자막 -> 텍스트가 있다면 캡션상태가 on 이라면 보여주기.
        if(caption){
            System.out.println(text);
        }
    }
}

public class Inheritance01 {
    public static void main(String[] args) {
        SmartTv01 stv01 = new SmartTv01();
        stv01.channel = 10;
        stv01.channelUp();
        System.out.println("channel : " + stv01.channel);
        stv01.displayCation("Hi");
        stv01.caption=true;
        stv01.displayCation("Hi");
    }
}
