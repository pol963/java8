package basicJava2;

import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        for(int i = 0; i < arr1.length; i++) {
            System.out.println("arr1 : " + arr1[i]);
        }

        //좀더 편하게.
        System.out.println(Arrays.toString(arr1));
    }
}
