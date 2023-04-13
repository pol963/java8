package ch06_07;

class TimeTest02{
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour){
        if (hour < 0 || hour > 23) return;

        this.hour = hour;

    }
    public int getHour(){
        return hour;
    }

}

public class Time02 {
    public static void main(String[] args) {

        TimeTest02 t2 = new TimeTest02();
        t2.setHour(22);
        System.out.println("t2.getHour() : " + t2.getHour());
        t2.setHour(26);
        System.out.println("t2.getHour() : " + t2.getHour());


    }
}
