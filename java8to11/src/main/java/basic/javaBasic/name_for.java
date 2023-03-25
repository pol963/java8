package basic.javaBasic;

public class name_for {
    public static void main(String[] args) {

        loot1 : for(int i = 2; i < 10 ; i++){
                    for(int j = 1 ; j <10 ; j++){
                        if(j == 5)
                            break loot1;

                            System.out.println(i + " * " + j + " = " + i*j);

                    }
            
        }

    }
}
