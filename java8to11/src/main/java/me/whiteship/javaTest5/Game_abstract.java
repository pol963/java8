package me.whiteship.javaTest5;



public class Game_abstract {
    public static void main(String[] args) {

        Unit[] group = {new Marine() ,new Tank() ,new Dropship()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100,200);
        }

    }
}

abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop(){};
}

class Marine extends Unit{
    public void move(int x, int y){
        System.out.println("Marine move: " + x + " " + y);
    }
}

class Tank extends Unit{
    public void move(int x, int y){
        System.out.println("Tank move: " + x + " " + y);
    }
}

class Dropship extends Unit{
    public void move(int x, int y){
        System.out.println("Dropship move: " + x + " " + y);
    }
}







