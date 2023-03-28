package basicJava2;

public class array2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("arr.length: " + arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.println("arr["+i+"]: " + arr[i]);
        }

        System.out.println("");

        //선언과 동시에 초기화 + 배열길이 정하기.
        int[] arr2 = {10,20,30,40,50,};

        for(int j = 0; j < arr.length; j++){
            System.out.println("arr2["+j+"] : " + arr2[j]);
        }
    }
}
