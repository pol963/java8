package basic.javaBasic;

// 1. Math.random() 메서드를 사용하여 난수 10개 발생시켜보기.
// 2. Math.random 메서드를 사용하여 1.0 ~ 10.0 사이의 난수 10개 발생시켜 보기.
// 3. Math.random 메서드를 사용하여 1~10 사이의 난수 10개를 발생시켜 보기. -> 정수.
public class Random_for {
    public static void main(String[] args) {

        int num = 0;
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(Math.random()); //Math.random -> 0.0 ~ 1.0 까지의 난수를 발생. 1.0은 제외.
        }
        System.out.println("");
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(Math.random()*10);
        }
        System.out.println("");
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println((int)(Math.random()*10)); //곱하기가 먼저 이후 형변환 -> 괄호.
        }
        System.out.println("");
        //1~10사이의 난수
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println((int)(Math.random()*10)+1);
        }

        System.out.println("================================================================");
        //-5~5 까지의 난수 발생시켜보기. -5,-4,-3,-2,-1,0,1,2,3,4,5 총 11개.
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println((int)(Math.random()*11)-5);
        }
    }
}
