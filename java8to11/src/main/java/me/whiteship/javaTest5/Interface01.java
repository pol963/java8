package me.whiteship.javaTest5;

class A{
    public void method(B b){
        b.method();
    }
}
class B{
    public void method(){
        System.out.println("B의 메서드 호출");
    }
}
//위의 코드들은 클래스 A와 B의 의존성이 강합니다. 만약 A가 C라는 클래스를 의존(사용)한다고 가정한다면 이는 A의 코드를 변경해야합니다.


//아래의 코드들은 A 클래스가 의존성이 강한것을 생각해 인터페이스로 의존성을 낮춘 코드. AI의 코드는 변하는것 없이 인터페이스와의 조작만으로 해결.
class C implements I{
    public void method(){
        System.out.println("C 클래스의 메서드 호출.");
    }
}

class AI{
    public void method(I i){ //인터페이스를 상속받은 클래스만 들어올 수 있습니다. 
        i.method();
    }
}

interface I {
    public void method();
}

class BI implements I{
    public void method(){
        System.out.println("BI 의 메서드 호출.");
    }
}

public class Interface01 {
    public static void main(String[] args) {

        A a = new A();
        a.method(new B()); //B 클래스의 메서드 호출 -> A가 B를 의존(사용).

        AI ai = new AI();
        ai.method(new BI());
        ai.method(new C());
    }
}
