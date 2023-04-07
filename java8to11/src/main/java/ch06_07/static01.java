package ch06_07;

class MyStatic{
    int a,b;

    int add(){
        return a+b;
    }

    static int add(int a,int b){
        return a+b;
    }

}



public class static01 {
    public static void main(String[] args) {

        //static 메서드 객체생성없이 바로 사용가능 -> 클래스이름으로 접근.
        //static 메서드는 iv를 사용하지 않을때 붙이면 된다.
        //static 변수의 경우 공통된 속성일시 붙여준다 ex) 카드의 폭과 높이 등.
        System.out.println("static : " + MyStatic.add(100,200));

        //im 객체 생성 필수.
        MyStatic ms = new MyStatic();
        ms.a = 400;
        ms.b = 200;
        System.out.println(ms.add());



    }
}
