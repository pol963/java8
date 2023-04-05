package ch06_07;

public class Iv_Cv {
    public static void main(String[] args) {

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.num = 5;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.num = 8;

        System.out.println("c1.kind = " + c1.kind);
        System.out.println("c1.num = " + c1.num);
        System.out.println("c2.kind = " + c2.kind);
        System.out.println("c2.num = " + c2.num);
        System.out.println("c1.width = " + c1.width);
        System.out.println("c2.height = " + c2.height);

        c1.width = 120;
        c2.height = 270;

        System.out.println("변경후 c2.width = " + c2.width);
        System.out.println("변경후 c1.height = " + c1.height);

        //인스턴스 변수(iv) -> 각 객체마다 다른 공간을 가지고있음 -> 독립된 값 지정 가능.
        //클래스 변수(cv) -> 모든 객체가 하나의 저장공간을 공유 -> 항상 공통된 값을 가지고 있음.

    }
}

class Card{
    static int width = 100;
    static int height = 250;

    String kind ="";
    int num = 0;

}
