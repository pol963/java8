package me.whiteship.javaTest5;

abstract class Player{ //추상클래스
    abstract void play(int pos); //추상메서드
    abstract void stop(); //추상메서드
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos+" 부터 재생합니다."); //추상메서드의 구현.
    }

    void stop() { System.out.println("재생을 멈춥니다."); } //추상메서드 구현.

}


public class PlayTest_abstract {
    public static void main(String[] args) {
        // Player p = new Player();  추상클래스는 미완성클래스이기에 객체생성이 불가능 이후 상속을 통해 다른클래스를 만드는대 도움을 줍니다.

        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();

        Player p = new AudioPlayer(); //다형성.
        p.play(200);
        p.stop();


    }
}
