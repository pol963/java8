package basicJava2;

public class StringIndex {
    public static void main(String[] args) {
        String str = "ABCDEF";

        char c = str.charAt(2); //해당 인덱스에서 문자열 중에서 문자 하나를 꺼내오기.
        System.out.println("c = " + c);

        String str2 = str.substring(1,4);// 1번 인덱스부터 4번 인덱스 전까지.
        System.out.println("str2 = " + str2);



    }
}
