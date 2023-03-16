package basic.javaBasic;

public class ncrement_Decrement_Operators {
    public static void main(String[] args) {

        int a2 = 2;
        int a1 = ++a2;

        System.out.println("a2: " + a2);

        int a4 = 2;
        a4++;
        int a3 = a4;
        System.out.println("a3: " + a3);

        int a5=a3;
        a3++;
        System.out.println("a5: " + a5);

        System.out.println("a3  :"+a3);

        System.out.println("");

        //후위형
        int i = 5, j = 0;
        j = i++; //i의 5가 먼저 j에 들어간 후 i가 1증감.
        System.out.println(" i++ 후 , i : " + i + " , j : " + j);

        //리셋
        i = 5;
        j = 0;

        //전위형.
        j = ++i; //선증감.
        System.out.println("++i 후 , i : " + i + " , j : " + j);

        System.out.println("i : " + i);
    }
}
