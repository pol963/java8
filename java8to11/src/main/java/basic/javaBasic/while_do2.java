package basic.javaBasic;

import java.util.Scanner;

public class while_do2 {
    public static void main(String[] args) {

        //숫자를 입력받고 각 숫자의 합을 구하라.

        int num = 0;
        int sum = 0;

        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in); //스캐너 객체 생성.
        String tmp = scanner.nextLine(); //입력한 숫자 읽어오기.
        num = Integer.parseInt(tmp); // 문자열 숫자를 정수형으로 변환.
        /*
        while(num != 0){

        }*/


        for(num=num;num > 0 ; num = num / 10){
            System.out.println(num%10); //끝자리 구하기.
            sum += num%10; //합
            System.out.println("sum : " + sum); //합
        }

        /* for 문을 while 문으로 변경.
        while (num > 0){
            sum += num%10;
            num = num / 10;
        }

         */

    }
}
