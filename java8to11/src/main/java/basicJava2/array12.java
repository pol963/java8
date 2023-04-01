package basicJava2;

import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {

        String[][] arr1 = {
                {"chair","의자"},
                {"computer","컴퓨터"},
                {"integer","정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr1.length; i++){
            System.out.printf("Q%d. %s의 뜻은?",i+1,arr1[i][0]);


            String tmp = scanner.nextLine();

            if(tmp.equals(arr1[i][1])){
                System.out.printf("정답입니다. %n%n");
            }else{
                System.out.printf("오답입니다. 정답은 %s 입니다. %n%n" ,arr1[i][1]);
            }
        }

        scanner.close();
    }
}
