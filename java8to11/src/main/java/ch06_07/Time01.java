package ch06_07;

class Time{
    private int hour;
    private int minute;
    private int second;

    Time(){

    }


    public int Hour(int hour) {
        if(hour >= 0 && hour <= 23){
             this.hour = hour;
        }else{
            System.out.println("잘못된 시간입니다");
            this.hour = hour;
        }
        return this.hour;
    }

}

public class Time01 {
    public static void main(String[] args) {


    Time t = new Time();
    int h = t.Hour(23);
    System.out.println("h = " + h);

    }

}
