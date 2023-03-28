package basicJava2;


public class array1 {
    public static void main(String[] args) {

       int[] array = new int[5];
       array[2] = 111;
       System.out.println("array[0] : " + array[0]);
       System.out.println("array[1] : " + array[1]);
       System.out.println("array[2] : " + array[2]);
       System.out.println("array[3] : " + array[3]);
       System.out.println("array[4] : " + array[4]);

       int value = array[2];
       System.out.println("value : " + value);
    }
}
