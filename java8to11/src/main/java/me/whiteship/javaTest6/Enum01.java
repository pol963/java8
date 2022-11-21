package me.whiteship.javaTest6;

enum Direction {
    EAST,SOUTH,WEST,NORTH //자동으로 EAST 부터 0,1,2,3 이 부여됩니다.
}

public class Enum01 {
    public static void main(String[] args) {

        //초기화 방법.
        Direction d1 = Direction.EAST; //1번째 방법
        Direction d2 = Direction.valueOf("WEST"); //2번째 방법.
        Direction d3 = Direction.EAST;

        //출력
        System.out.println("d1 : " + d1);
        System.out.println("d2 : " + d2);
        System.out.println("d3 : " + d3);

        System.out.println("d1==d2 ? " + (d1==d2));
        System.out.println("d1==d3 ? " + (d1==d3));

        System.out.println("d1.equals(d2) ? " + (d1.equals(d2)));
        System.out.println("d1.equals(d3) ? " + (d1.equals(d3)));

        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));



        switch(d1){
            case EAST: //문법적으로 Direction.EAST 가 아닌 그냥 EAST.
                System.out.println("방향은 EAST"); break;
            case WEST:
                System.out.println("방향은 WEST"); break;
            case SOUTH:
                System.out.println("방향은 SOUTH"); break;
            case NORTH:
                System.out.println("방향은 NORTH"); break;
            default:
                System.out.println("방향은 X"); break;

        }

        Direction[] dArr = Direction.values();

        for(Direction d : dArr)
            System.out.printf("%s=%d%n", d.name(), d.ordinal());   

    }
}
