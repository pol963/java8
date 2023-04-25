package ch06_07;



public class InnerClass02 {

    //내부클래스.
    class InstanceInnerClass01{
        int iv = 100;
        // static int cv = 100; cv 는 내부클래스에서 선언할 수 없습니다.
        final static int CONST = 100; //final 은 상수이므로 선언이 가능합니다.
    }

    static class StaticClass01{
        int iv = 200;
        static int cv = 200; //static 클래스 안에서는 cv 선언 가능.
    }

    void method(){
        class LocalInnerClass01{ //메서드 내부 이너 클래스. 메서드 내부에서만 사용 가능합니다.
            int iv = 200;
            // static int cv = 200; // 메서드 내의 내부 클래스 에서도 cv 선언 불가.
            final static int CONST = 300; //final static 은 허용.
        }

        int i = LocalInnerClass01.CONST; //내부에서 사용 가능.

    }

    public static void main(String[] args) {

        System.out.println(InstanceInnerClass01.CONST);
        System.out.println(StaticClass01.cv);

    }
}
