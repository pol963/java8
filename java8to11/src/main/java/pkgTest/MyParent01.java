package pkgTest;

class MyParent{
    private int prv; //같은클래스
            int def; //같은패키지
    protected int prt; //같은패키지 + 다른패키지 자손
    public int pub; //접근제한없음.

    public void printMember(){
        System.out.println(prv);
        System.out.println(def);
        System.out.println(pub);
        System.out.println(prt);
    }

}

public class MyParent01 {
    public static void main(String[] args) {
        MyParent mp = new MyParent();
        // mp.prb; -> private = 같은 클래스에서만 접근 가능.
        mp.def = 10;
        mp.prt = 20;
        mp.pub = 30;


        //System.out.println(mp.prv);
        System.out.println(mp.def);
        System.out.println(mp.pub);
        System.out.println(mp.prt);
    }
}
