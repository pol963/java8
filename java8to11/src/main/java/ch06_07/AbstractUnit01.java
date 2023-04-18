package ch06_07;

abstract class Unit01{
    int x,y; //좌표.
    void stop(){};
    abstract void move(int x,int y);
    abstract void attack(int x,int y,String s);

}

class Marin01 extends Unit01{
    @Override
    void move(int x, int y) {
        System.out.println("x : " + x + " y : " + y + "로 마린이 이동합니다.");
    }
    void stemPack(){
        System.out.println("마린 스팀팩 사용");
    }

    void attack(int x,int y,String s){
        System.out.println("x : " + x + " y : " + y + "위치의 " + s + "공격");
    }
}

class Ghost01 extends Unit01{
    void move(int x, int y) {
        System.out.println("x : " + x + " y : " + y + " 로 고스트가 이동합니다.");
    }

    void hide(){
        System.out.println("고스트가 은폐합니다.");
    }
    void attack(int x,int y,String s){
        System.out.println("x : " + x + " y : " + y + " 위치의 " + s + "공격");
    }
}

public class AbstractUnit01 {
    public static void main(String[] args) {
        Unit01[] u1 = {new Marin01(), new Ghost01()};

        for (int i = 0; i < u1.length; i++){
            u1[i].move(20,3);
            u1[i].attack(22,8,"뮤탈 ");
        }

        Marin01 m1 = new Marin01();
        m1.stemPack();

        Ghost01 g1 = new Ghost01();
        g1.hide();

    }
}
