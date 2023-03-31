package basicJava2;

import java.util.Arrays;

//로또번호 프로그램.
public class array8 {
    public static void main(String[] args) {

        int[] ball = new int[45]; //45개의 인덱스를 가진 배열 선언.

        //각 인덱스에 반복문을 통하여 숫자 저장.
        for (int i = 0; i < ball.length;i++)
            ball[i] = i+1; //1~45를 각 인덱스에 저장.


        int tmp = 0; //두 값을 바꾸는데 사용할 변수 선언
        int j = 0; //임의의 값을 얻어서 저장할 변수.

        for(int i = 0; i < 6;i++){
            j = (int)(Math.random() * 45); //0~44 까지의 임의의 값을 저장.
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for(int i = 0; i <6;i++){
            System.out.printf("ball[%d]:=%d\n",i,ball[i]);
        }



    }
}
