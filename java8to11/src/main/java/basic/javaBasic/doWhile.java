package basic.javaBasic;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int input = 0; int answer = 0;

        answer = (int)(Math.random()*100) + 1; // random 은 0.0 ~ 1.0 미만. *100 으로 1~99 +1.
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("숫자를 입력하세요.");
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("더 작은수를 입력하세요.");
            }else if(input < answer){
                System.out.println("더 큰수를 입력하세요.");
            }
        }while(input!=answer);
                System.out.println("정답입니다.");
    }
}
