package basicJava2;

public class array10 {
    public static void main(String[] args) {

        //2차원 배열의 생성과 동시에 초기화.
        int[][] arr1 ={
                {10,20,30},
                {40,50,60},
                {70,80,90},
                {100,110,120},
        };

        int sum = 0;

        for(int i=0; i<arr1.length; i++){ //행
            for(int j=0; j<arr1[i].length; j++){//열
                System.out.printf("arr1[%d]][%d] = %d\n ",i,j,arr1[i][j]);

                sum += arr1[i][j];
            }
        }

        System.out.println("sum : " + sum);


        //2차원 배열은 배열안에 배열이 있는것과 같다.
    }
}
