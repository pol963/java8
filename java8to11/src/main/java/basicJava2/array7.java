package basicJava2;

import java.util.Arrays;

public class array7 {
    public static void main(String[] args) {

        int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr1));

        for(int i = 0; i < 100; i++){
            int n = (int)(Math.random() * 10); //난수 생성.
            int tmp = arr1[0]; //0번째 인덱스 숫자 tmp 에 저장

            arr1[0] = arr1[n]; //난수로 생성된 n번째 인덱스 0번에 저장.
            arr1[n] = tmp;//0번 인덱스 숫자 n번에 저장.

        }

        System.out.println(Arrays.toString(arr1));
    }
}
