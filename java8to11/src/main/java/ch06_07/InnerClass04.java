package ch06_07;

public class InnerClass04 {

    private int outerIv01 = 0; //private 외부 변수.
    static int outerCv01 = 0; //static 외부 클래스 변수.

    class InnerClass{

        int iiv = outerIv01; // 외부 클래스의 private 맴버에도 접근이 가능합니다.
        int iiv2 = outerCv01; // instance 에서 접근 가능.

    }

    static class StaticInner{
        // int siv = outerIv01; static 에서는 외부 instance 를 참조 불가능.
        int siv = outerCv01; // static 끼리는 참조 가능. private 접근 제어자여도 가능.
    }

    void justMethod(){
        int lv = 0;
        final int LV = 0; //JDK 1.8 부터 final 생략 가능.

        class LocalInner{ //지역 내부 클래스. -> 지역내부클래스를 감싸고있는 메서드는 상수만 접근 가능.
            int liv01 = lv; // jdk 1.8 이후로 에러x -> final 이 생략되어도 값이 이후 바뀌지 않는다면 상수로 간주. 사용 가능 -> 이후 값이 바뀌면 에러.
            int liv02 = LV;
            int liv03 = outerIv01;
            int liv04 = outerCv01;
        }

    }


    public static void main(String[] args) {

    }
}
