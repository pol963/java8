package me.whiteship.javaTest5;

abstract class Unit2{
    int x,y;
    abstract void move(int x,int y);
    public void stop(){
        System.out.println("멈춥니다.");
    }
}

interface Fightable{ //인터페이스의 모든 메서드는 public abstract 제어자가 생략되어 있습니다.
    void move(int x,int y);
    void attack(Fightable f); // 매개변수가 인터페이스타입이라는 것은 인터페이스를 구현한 클래스의 객체만 들어올 수 있습니다.
}

class Fighter extends Unit2 implements Fightable{
    public void move(int x, int y){ //오버라이딩 규칙 접근제어자가 조상보다 좁으면 안된다.
        System.out.println("["+x+"]"+"[" +y+"]");
    }

    public void attack(Fightable f){
        System.out.println(f+"를 공격");
    }

    Fightable getFighter(){
        Fighter f = new Fighter();
        return f; //(Fightable) 생략 - 형변환.
    }

}

public class AbstractClass_Interface {
    public static void main(String[] args) {

        Fighter f = new Fighter();
        f.move(100,200);
        f.attack(new Fighter());
        //위 코드를 풀어서 코딩하면 아래처럼 됩니다.
        Fighter f2 = new Fighter();
        f.attack(f2);

        Fightable f3 = f.getFighter();

    }
}
