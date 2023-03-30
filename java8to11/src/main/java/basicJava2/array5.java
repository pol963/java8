package basicJava2;

public class array5 {
    public static void main(String[] args) {

        //배열의 각 인덱스에 들어있는 값과 총 합 그리고 평균 구하기.

        int sum = 0;
        float avg = 0; //평균은 소수점예상.

        int[] iArr1 = {50,68,100,40,20};

        for(int i = 0; i < iArr1.length; i++){
            sum += iArr1[i];
            System.out.println("iArr1["+i+"] = " + iArr1[i]);

        }

        System.out.println("sum = " + sum);
        avg = sum/(float)iArr1.length; //int int = int /// int float = float ->  float 형변환 필수 소수점.
        System.out.println("avg = " + avg);
    }
}
