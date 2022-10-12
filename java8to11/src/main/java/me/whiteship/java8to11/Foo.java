package me.whiteship.java8to11;

/*
자바에서 인터페이스를 만든 후 이후 인터페이스를 상속받는 클래스들이 있고 그 기능을 사용한다고 가정했을때
인터페이스에 기능을 추가한다면 해당 인터페이스를 구현한 클래스들을 깨트리지 않게 하기 위한 기능이 있다.
이때 사용되는 기능이 Default Method 이다.
다만 이후 추가되는 기능이기에 리스크는 있다.

 */

public class Foo {

    public static void main(String[] args) {
        Foo04_DefaultM_StaticM foo04 = new DefaultFoo("mingi");
        foo04.printNane();
        foo04.printNameUppercase();
    }


}
