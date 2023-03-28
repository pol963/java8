package basicJava2;

import java.util.Arrays;

public class array4 {
    public static void main(String[] args) {

        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {10,20,30,40,50};
        char[] chArr = {'a', 'b', 'c', 'd', 'e'};


        for(int i = 0; i < iArr1.length; i++){

            iArr1[i] =  0+i;
            System.out.println("iArr1[i] = " + iArr1[i]); //1~10까지.

        }

        System.out.println("");
        for(int i=0; i < iArr2.length; i++){
            iArr2[i] = (int)(Math.random()*10)+1; //정수화. -> 1~10까지의 난수화.
            System.out.println("iArr2[i] = " + iArr2[i]);

        }

        System.out.println("iArr1 : " + Arrays.toString(iArr1));
        System.out.println("iArr2 : " + Arrays.toString(iArr2));
        System.out.println("chArr : " + Arrays.toString(chArr));

    }
}
