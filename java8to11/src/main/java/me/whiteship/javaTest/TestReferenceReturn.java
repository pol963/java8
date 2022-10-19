package me.whiteship.javaTest;
/*
    메서드의 리턴타입이 참조형변수일때 알아보기.
    Data3 클래스를 만든뒤 변수(속성) 을 하나만주기.
    main 메서드에서 Data3객체를 만들어 10을 저장하기.
    메서드를 이용하여 객체를 하나 만든후 그 객체에 main 객체의 값을 복사 저장하기.
    메서드의 리턴값을 참조변수로 하기.
    정리. main 메서드에서 만든객체의 결과값과 메서드에서 만든 객체의 결과값이 일치하게하기.
 */

public class TestReferenceReturn {
    public static void main(String[] args) {

        Data4 d = new Data4();
        d.x = 10;

        Data4 d2 = copy(d);

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);


    }

    static Data4 copy(Data4 d) {

        Data4 tmp = new Data4();
        tmp.x = d.x;
        return tmp;

    }
}

class Data4{ int x;}
