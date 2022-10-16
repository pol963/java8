package me.whiteship.javaTest;

//사용위치에 따른 변수종류와 변수의 차이. iv 와 cv.
public class TestCard {
    public static void main(String[] args) {

        //1번객체
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 5;

        System.out.println("c1의 카드무늬는 : " + c1.kind + "  c1의 카드숫자는 : " + c1.number);
        System.out.println("c1의 높이는 : " + Card.height + "  c1의 넓이는 : " + Card.width);

        //2번객체
        Card c2 = new Card();
        c2.kind = "space";
        c2.number = 7;

        //CV 변경 - CV는 메모리상에서 하나의 공간에서 있고 모든객체가 이를 참조하기에 CV는 변경시 모든객체의 속성이 변합니다.
        Card.height = 300;
        Card.width = 150;

        System.out.println("c2의 카드무늬는 : " + c2.kind + "  c2의 카드숫자는 : " + c2.number);

        System.out.println("c1의 높이는 : " + c1.height + "  c1의 넓이는 : " + c1.width);
        System.out.println("c1의 높이는 : " + c2.height + "  c1의 넓이는 : " + c2.width);

    }
}

class Card{
    //IV - 인스턴스 변수
    String kind;
    int number;

    //CV - 클래스변수
    static int width = 100;
    static int height = 250;
}
