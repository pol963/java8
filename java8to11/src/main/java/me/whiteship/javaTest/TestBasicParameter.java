package me.whiteship.javaTest;

/*
    기본형 매개변수의 개념.
    기본형 매개변수는 변수를 읽어오기만 가능하고 변경은 불가능합니다.

    아래의 코드들은 호출스택의 규칙에 의해 변수로 그 흐름을 파악합니다.
 */

public class TestBasicParameter {
    public static void main(String[] args) {

        //Data 타입의 d 참조변수 선언. -> d 객체 생성.
        Data d = new Data();

        //d객체의 x에 10을 할당
        d.x = 10;
        //출력
        System.out.println("d.x : " + d.x);

        //change 메서드에 의해 메서드안에있는 lv의 x값이 출력. - 1000
        change(d.x);

        //change 메서드가 호출스택에서 사라지고 lv도 사라지기 때문에 기존에 호출스택에있던 main 메서드의 x 출력 10.
        System.out.println("d.x : " + d.x);


    }

    static public void change(int x){
        x = 1000;
        System.out.println("change : " + x);
    }

}

class Data{
    int x;
}



