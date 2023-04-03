package basicJava2;

import java.util.Arrays;

public class array14 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[][] arr2 = {
                {11,22},
                {33,44}
        };

        System.out.println("arr1 : "+Arrays.toString(arr1));
        System.out.println("arr2 : "+Arrays.deepToString(arr2));

        System.out.println("");

        String[] arr3 = {"AAA","BBB"};
        String[] arr4 = {"AAA","BBB"};
        System.out.println("");
        System.out.println(Arrays.equals(arr3, arr4));

        String[][] arr5 = {
                {"AAA","BBB"},
                {"AAA","BBB"},
        };

        String[][] arr6 = {
                {"AAA","BBB"},
                {"AAA","BBBa"}
        };

        System.out.println(Arrays.deepEquals(arr5, arr6));

    }
}
