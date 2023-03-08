package basic.javaBasic;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int total = num1 + num2;
        System.out.println("num1 + num2 = " + total);

        scanner.close();
    }
}
