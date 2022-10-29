package me.whiteship.javaTest4;

class Test{
    public int pub; //접근제한없음
    protected int prt; //같은 패키지 + 다른 패키지 자손
           int def; //같은 패키지
    private int pri; // 같은 클래스

    //같은클래스내 모두 사용가능.
    public void printM(){
        System.out.println(pub);
        System.out.println(prt);
        System.out.println(def);
        System.out.println(pri);
    }

}

public class MyParent {
    public static void main(String[] args) {

        Test t = new Test();
        System.out.println(t.pub);
        System.out.println(t.prt);
        System.out.println(t.def);
        // System.out.println(t.pri); //private 같은클래스 영역만 가능 오류.

    }
}
