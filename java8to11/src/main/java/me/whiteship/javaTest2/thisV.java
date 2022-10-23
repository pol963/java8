package me.whiteship.javaTest2;

public class thisV {
    public static void main(String[] args) {

    }

}

class car1{

    long a,b; //진짜 이름은 this.a this.b 입니다. 생략된것.
    car1(int a,int b){ //생성자.
        this.a = a; //생성자 안에 매개변수와 iv의 이름이 같기에 구분하여 명시.
        this.b = b;
    }

    long add(){ //인스턴스메서드.
        return a+b; //원래이름은 this.a this.b 입니다. 생략.
    }

    static long add(int a, int b){ //static 메서드입니다. 내부에서 iv를 사용못하며 iv는 this 에 사용가능하기에 아래변수는 lv입니다.
        return a+b;
    }
}
