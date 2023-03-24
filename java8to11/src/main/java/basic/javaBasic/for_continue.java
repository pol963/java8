package basic.javaBasic;

public class for_continue {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){ //i 가 10보다 크거나 같아질떄까지 반복.
            if(i%2 == 0) // i를 2로 나눈 나머지가 0일때.
                continue; // continue 문 반복문의 끝으로 이동. 아래 출력문은 생략.
            System.out.println("i : " + i); //i를 2로 나눈 나머지가 0이 아닐때에만 출력.
        }
    }
}
