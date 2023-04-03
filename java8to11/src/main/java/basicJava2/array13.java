package basicJava2;

import java.util.Arrays;

public class array13 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};

        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(arr4));
    }
}
