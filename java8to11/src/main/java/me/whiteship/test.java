package me.whiteship;

import java.util.ArrayList;

class Tv{}
class Audio{}

public class test {
    public static void main(String[] args) {
        ArrayList<Tv> v = new ArrayList<Tv>();
        v.add(new Tv());
        // v.add(new Audio()); 타입불일치.
        Tv t = v.get(0);
    }
}
