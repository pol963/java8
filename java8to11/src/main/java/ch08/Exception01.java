package ch08;

public class Exception01 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4); //생략.
        }catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
                System.out.println("ArithmeticException");

        }catch (Exception e){
            System.out.println("Exception");
        }

        System.out.println(5);
    }
}
