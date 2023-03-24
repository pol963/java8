package basic.javaBasic;

import java.util.Scanner;

//while,continue,break 를 사용하여 메뉴창 구현하기. scanner 포함.
public class while_break_continue {
    public static void main(String[] args) {

        int num = 0;
        int menu = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 : Square");
            System.out.println("2 : Square root");
            System.out.println("3 : log");
            System.out.println("원하는 메뉴를 입력하세요 1~3 종료는 0번.");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp); //변환.

            if(menu==0){
                System.out.println("시스템을 종료합니다.");
                break; //반복문 종료.
            }else if(!(1 <= menu && menu <= 3) ){
                System.out.println("잘못입력하셧습니다.");
                continue;
            }

            System.out.println("선택하신 메뉴는 " + menu + " 입니다.");
        }
        scanner.close();


    }
}
