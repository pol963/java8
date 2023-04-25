package ch06_07;

public class InnerClass03 { // 내부클래스는 맴버처럼 사용가능.

    class InstanceInner01{}
    static class StaticInner01{}

    InstanceInner01 i01 = new InstanceInner01(); //instance 맴버 - instance 맴버 가능.
    StaticInner01 s01 = new StaticInner01(); //static 맴버 - static 맴버 가능.

    static void staticMethod01(){
       // InstanceInner01 i01 = new InstanceInner01(); static 맴버 - instance 맴버 불가능. static 메서드.
        StaticInner01 s01 = new StaticInner01(); // static 맴버(메서드) - static 맴버(클래스) 가능.

    }

    void instanceMethod(){ // instance 메서드.
        InstanceInner01 i01 = new InstanceInner01(); // instance(메서드) - instance(클래스) 가능.
        StaticInner01 s01 = new StaticInner01(); // instance(메서드) - static(클래스) 가능.
    }


    public static void main(String[] args) {

    }
}
