package basic.javaBasic;

public class for_convolution {
    public static void main(String[] args) {
        for(int i = 2; i < 10 ; i++) {
            for(int j = 1; j < 10 ; j++) {
                System.out.println(i + " * " + j + " = " + i * j );
            }
            System.out.println("");
        }

        for(int i = 1 ; i <= 5 ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
