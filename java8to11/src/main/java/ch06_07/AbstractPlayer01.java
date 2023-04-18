package ch06_07;

//추상클래스 -> 자손들이 다 다르게 사용할 수 있다 판단하여 사용.
abstract class Player01{
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer01 extends Player01{ // 추상클래스를 상속받은 자손클래스 반드시 추상메서드를 구현해줘야 합니다.
    void play(int pos){
        System.out.println(pos + " 부터 재생합니다.");
    }
    void stop(){
        System.out.println("재생을 멈춥니다.");
    }

}

public class AbstractPlayer01 {
    public static void main(String[] args) {


        //AudioPlayer01 ap1 = new AudioPlayer01();
        //ap1.play(34);
        //ap1.stop();
        Player01 p1 = new AudioPlayer01(); //다형성을 이용한 객체 생성.
        p1.play(22);
        p1.stop();

    }
}
