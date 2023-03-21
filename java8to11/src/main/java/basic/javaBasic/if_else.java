package basic.javaBasic;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요");
        Scanner scanner = new Scanner(System.in);

        score = scanner.nextInt();

        if(score >= 80){
            System.out.println("A 입니다.");
        } else if (score >= 60 && score < 80){
            System.out.println("B 입니다.");
        } else {
            System.out.println("C 입니다." );
        }

        scanner.close();

    }
}
