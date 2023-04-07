package ch06_07;

import java.util.Scanner;

public class Method02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단을 입력하세요.");
        int den = scanner.nextInt();
        Math1 m1 = new Math1();

        m1.multiplication(den);
    }
}

class Math1{
    void multiplication(int num){

        if(!(num >=2 && num <= 9))

            return;
        for(int i = 1; i <= 9 ; i++){
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }
}
