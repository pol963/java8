package me.whiteship.java8to11;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Foo03_VariableCapture {
    //변수 캡쳐
    public static void main(String[] args) {
        Foo03_VariableCapture foo = new Foo03_VariableCapture();
        foo.run();

    }
    public void run() {
        int baseNumber = 10;

        //비교를 위한 로컬 클래스.
        class LocalClass{
            void printBaseNumber(){
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        //비교를 위한 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        //비교를 위한 람다식
        //IntConsumer 는 인트형으로 입력받은 값을 가져옴.
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);

        };

        printInt.accept(10);


        /*
        로컬클래스나 익명클래스는 내부에 외부와같은 변수가 있을경우 내부에있는 변수를 따르지만
        람다식은 내부에 변수를 두어도 그 변수를 따르지않고 람다식이 포함된 메서드에 있는 변수를 따릅니다.
        */


    }
}