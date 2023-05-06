package ch09;

public class Object_equals01 {
    public static void main(String[] args) {

        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2)){ //v1과 v2의 객체 주소는 다릅니다. 오버라이딩을 통해 value 의 값을 비교하게 할 수 있습니다.
            System.out.println("v1과 v2는 같습니다.");
        }else{
            System.out.println("v1과 v2는 다릅니다.");
        }//if

    }//main
}//Object_equals

class Value{
    int value;

    Value(int value) {
        this.value = value; //this -> 객체 자신.
    }

    // 오버라이딩. 기존 객체와 객체를 비교하는 equals 를 value 만 비교하게끔.
    public boolean equals(Object obj){

        //큰것에서 작은것. instanceof
        if(!(obj instanceof Value)) return false;

        Value v = (Value) obj;

        return this.value == v.value;
    }

}
