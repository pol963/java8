package basic.javaBasic;

public class while_do {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while(sum <= 100){
            System.out.println(i + " ," + sum);
            sum += ++i;
        }
    }
}
