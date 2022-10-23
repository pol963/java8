package me.whiteship.javaTest2;

class Tv{
    boolean power;
    int channel;

    void power(){ power = !power;}
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}

class SmartTv extends Tv{

    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

public class inheritance {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println("channel : " + stv.channel);

        stv.caption = true;
        System.out.println(stv.channel);
        stv.displayCaption("hello world");


    }
}








