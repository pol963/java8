package me.whiteship.javaTest;
//값을 입력받아 더하기,뺴기를 하는 메서드를 다른클래스에 구현하기.
//더하여 입력받은 두 값중 더 큰 값을 리턴하는 메서드를 만들기.

public class TestMath_Method {
    public static void main(String[] args) {

        Math m = new Math();

        int addResult = m.add(3,5);
        int subtractResult = m.subtract(5,3);
        int maxResult = m.max(2,7);

        System.out.println("addResult : " + addResult);
        System.out.println("subtractResult : " + subtractResult);
        System.out.println("maxResult : " + maxResult);

        m.print99dan(5);

    }

}

//기능을 모으는 클래스.
class Math{

    //구구단.
    void print99dan(int dan){
        for(int i = 1 ; i<= 9 ; i++){
            System.out.printf("%d * %d = %d%n" , dan , i , dan*i);
        }
    }

    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int max(int x, int y){
        int num;
        if(x < y){
            num = y;
        }else{
            num= x;
        }
        return num;
    }


}
