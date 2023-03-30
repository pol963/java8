package basicJava2;

public class array6 {
    public static void main(String[] args) {

        //배열의 최대값과 최소값을 구해보기.

        int[] iArr1 = {100,200,33,50,80};

        int max = iArr1[0];
        int min = iArr1[0];

        for(int i = 1; i < iArr1.length; i++) {
            if(max < iArr1[i]){
                max = iArr1[i];
            }else if(min > iArr1[i]){
                min = iArr1[i];
            }
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
