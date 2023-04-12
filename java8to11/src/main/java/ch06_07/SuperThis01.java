package ch06_07;

class Parent01{
    int x = 10;
}
class Child01 extends Parent01{
    int x = 20;
    void childMethod(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x); //super -> 조상의 맴버를 가르킴.
    }
}
public class SuperThis01 {
    public static void main(String[] args) {
        Child01 c1 = new Child01();
        c1.childMethod();
    }
}
