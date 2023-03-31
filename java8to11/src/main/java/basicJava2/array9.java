package basicJava2;

public class array9 {
    public static void main(String[] args) {

        String[] sArr1 = {"가위","바위","보"};

        for(int i = 0; i < 10; i++) {
            int tmp = (int)(Math.random()*3);
            System.out.println(sArr1[tmp]);
        }

    }
}
