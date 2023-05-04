package ch08;

public class Exception_printStackTrace_getMessage01 {
    public static void main(String[] args) {

        System.out.println(1);
         try{
             System.out.println(2);
             System.out.println(0/0);
             System.out.println(3);
         }catch (ArithmeticException ae){
             ae.printStackTrace();
             System.out.println("메시지 : " + ae.getMessage());
         }// try~catch

         System.out.println(4);

    } // main
}
