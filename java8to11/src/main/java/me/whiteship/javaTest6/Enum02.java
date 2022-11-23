package me.whiteship.javaTest6;

enum Direction2{
    EAST(1,">"), SOUTH(2,"v"), WEST(3,"<"), NORTH(4,"^");

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value; //상수의 값을 저장해주는 필드1.
    private final String symbol; //상수의 값을 저장해주는 필드2.


    Direction2(int i, String s) { //모든 생성자는 private. 생략된 상태.

        this.value = i;
        this.symbol = s;

    }

    public int getValue(){ return value;}
    public String getSymbol(){ return symbol;}

    //값을받고 리턴 -1은 인덱스계산.
    public static Direction2 of(int dir){
        if(dir < 1 || dir > 4){ //1보다작거나 4보다 크거나.
            throw new IllegalArgumentException("Invalid value: " + dir);
        }

        return DIR_ARR[dir -1];

    }

}


public class Enum02 {
    public static void main(String[] args) {

        for(Direction2 d : Direction2.values()){
            System.out.printf("%s=%d%n", d.name(),d.getValue());
        }

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        System.out.printf("d1=%s ,%d%n",d1.name(),d1.getValue());
        System.out.printf("d2=%s ,%d%n",d2.name(),d2.getValue());



    }
}
