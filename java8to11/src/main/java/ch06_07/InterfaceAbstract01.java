package ch06_07;

abstract class Unit02{
    int x,y;
    abstract void move(int x,int y);
    void stop(){
        System.out.println("멈춥니다.");
    }
}

interface Fightable01{ //예외가 있지만 기본적으로 인터페이스의 모든 메서드는 public abstract 가 붙는다.
    //오버라이딩 규칙에 의해 오버라이딩 할 시 public 보다 접근 제어자가 좁을 수 없습니다.
    //만약 여기서 변수를 선언한다고 해도 public static final 이 생략된것 이다. -> 인터페이스는 상수만 가능.
    void move(int x,int y); //public abstract 생략.
    void attack(Fightable01 f); //public abstract 생략.

}

class Fighter01 extends Unit02 implements Fightable01{

    @Override
    public void move(int x, int y) { //오버라이딩 규칙에 의해 public 강제.
        System.out.println("좌표 : " + x +", "+ y + " 로 이동");
    }

    @Override
    public void attack(Fightable01 f) {// 위와 동일.
        System.out.println(f+" 공격.");
    }

    public void attack(String s){
        System.out.println(s + "를 공격");
    }
    public void attack(int i ,int j,String s){
        System.out.println("좌표 " +i+ ", " +j+" 의 " + s + " 를 공격");
    }
}

public class InterfaceAbstract01 {
    public static void main(String[] args) {
        Fighter01 f = new Fighter01();
        f.move(200,20);
        f.attack(new Fighter01());
        f.attack("히드라");
        f.attack(10,20,"마린");
    }
}
