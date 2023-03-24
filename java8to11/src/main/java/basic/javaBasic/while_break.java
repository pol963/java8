package basic.javaBasic;

public class while_break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true){ //무한 반복.
            if(sum > 100){ //sum 이 100을 넘게 되면 break;.
                break;
            }
            ++i; //i 선증가.
            sum += i;

            System.out.println("i : " + i);
            System.out.println("sum : " + sum);
        }



    }


}
