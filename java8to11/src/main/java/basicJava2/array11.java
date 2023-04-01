package basicJava2;

public class array11 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {40,50,60}, //1번학생 국어 영어 수학.
                {30,40,50}, //2번학생 국어 영어 수학.
                {20,30,40}, //3번
                {50,40,40}, //4번
        };

        int korTotal = 0,engTotal = 0,mathTotal = 0;

        System.out.println("      국어 영어 수학 총점 과 평균");

        for(int i = 0; i < arr1[i].length; i++){
            int sum = 0; //개인 총점
            float avg = 0.0f; //개인 평균

            korTotal += arr1[i][0];
            engTotal += arr1[i][1];
            mathTotal += arr1[i][2];
            System.out.printf("%3d",i+1);

            for(int j=0; j<arr1[i].length; j++){
                sum += arr1[i][j]; //개인 총합.
                System.out.printf("%5d", arr1[i][j]);

            }
            avg = sum/(float)arr1[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);


        }
       System.out.printf("총점:%4d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}
