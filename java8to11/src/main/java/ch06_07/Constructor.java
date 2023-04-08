package ch06_07;

class Data1{
    //컴파일러가 자동으로 기본생성자 추가.
    int value;
}
class Data2{
    int value;
    Data2(int x){
        value = x;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Data1 d1 = new Data1();

        //Data2 d2 = new Data2(); 에러 기본생성자가 없습니다. 생성하거나 혹은 미리 만들어둔 생성자를 사용해야 합니다.
        Data2 d2 = new Data2(3);
    }
}
