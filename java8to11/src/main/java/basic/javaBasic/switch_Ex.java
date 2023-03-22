package basic.javaBasic;

import java.util.Scanner;

public class switch_Ex {
    public static void main(String[] args) {

        System.out.println("현재 월을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        switch (num){

            case 1: case 2: case 3: case 12:
                System.out.println("겨울입니다.");
                break;
            case 4: case 5: case 6:
                System.out.println("봄입니다.");
                break;
            case 7: case 8: case 9:
                System.out.println("여름입니다.");
                break;
            case 10: case 11:
                System.out.println("가을입니다");
                break;

        }

    }
}
