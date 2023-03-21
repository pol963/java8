package basic.javaBasic.Math;

public class round {
    public static void main(String[] args) {
        double pi = 3.141592;

        /*
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println("shortPi : " + shortPi);
        */

        //위의 과정 풀어놓기.
        System.out.println(pi);
        System.out.println(pi*1000); //소수점 위치 변경.
        System.out.println(Math.round(pi*1000)); //반올림.
        System.out.println(Math.round(pi*1000)/1000); //int int 결과값 int
        System.out.println(Math.round(pi*1000)/1000.0); // 실수

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //3.141을 얻기. -> 반올림 x
        System.out.println(pi*1000);
        System.out.println((int)(pi*1000));
        System.out.println((int)(pi*1000)/1000.0);

    }
}
