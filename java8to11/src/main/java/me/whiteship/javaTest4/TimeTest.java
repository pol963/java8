package me.whiteship.javaTest4;

//캡슐화.

class Test01 {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isaBoolean(hour)) return;

        this.hour = hour;
    }

    // 유효한지 확인하는 메서드. 조건식의 메서드화. 내부에서만 쓰는메서드 외부에드러낼필요가 없는 메서드 -> private.
    private static boolean isaBoolean(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Test01 t = new Test01();
        t.setHour(5);
        System.out.println(t.getHour());

    }
}
