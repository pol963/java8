package ch06_07;

class A {
    // public void method(B b) {} -> 만약 B 클래스가 아닌 C 클래스를 사용 할 시 의존도가 강해 클래스 수정이 필수이다.
    // 인터페이스를 사용한다면 A 클래스를 수정하지 않아도 사용이 가능합니다. C 클래스가 인터페이스 I 를 implemented.
    public void method(I i){ //인터페이스 I 를 구현한 클래스만 들어올 수 있습니다.
        i.method();
    }
}

interface I{
    public void method();
        }

class B implements I{
    public void method(){
        System.out.println("B 클래스의 메서드.");
    }
}

class C implements I{
    public void method(){
        System.out.println("C 클래스의 메서드.");
    }
}

public class InterfaceTest01 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C()); //A 클래스가 B,C 클래스 에 의존. 사용.
        a.method(new B()); //A 클래스는 변하지 않고 메인클래스도 변화가 적음. -> 인터페이스 사용시.
    }
}
