package ch06_07;
class Outer3 {
    int value = 100;	// Outer3.this.value

    class Inner {
        int value = 200;   // this.value

        void method1() {
            int value = 300;
            System.out.println("value :" + value);
            System.out.println("InnerValue :" + this.value);
            System.out.println("OuterValue :" + Outer3.this.value);
        }
    } // Inner
}//Outer
public class InnerClass05 {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner oi = o.new Inner();
        oi.method1();



    }
}
