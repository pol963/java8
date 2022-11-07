package me.whiteship.javaTest4;

class Product{ //제품.
    int price; //제품가격.
    int bonusPoint; //제품을 구매할시 지급되는 보너스 포인트.

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product{
    Tv1(){
        //조상클래스의 생성자를 호출.
        super(100); //가격 이후 Product 클래스의 생성자를 호출 매개변수로 100만원.
    }

    //오버라이드 Object 클래스의 toString.
    public String toString(){
        return "Tv";
    }

}

class Computer extends Product{
    Computer(){
        super(100);
    }

    public String toString(){
        return "Computer";
    }

}

class Buyer{ //물건을 사는 사람.
    int money = 1000;
    int bonusPoint = 0;

    //가장 중요한 부분 물건을 구매하는 메서드 다형성이용.
    void buy(Product p){
        if(p.price > money){
            System.out.println("잔액이 부족합니다.");
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을 구매하셧습니다.");

    }

}


public class BuyTvComputer_polymorphism {
    public static void main(String[] args) {

        Buyer b = new Buyer();

        //다형성 이용 객체생성. 조상타입의 참조변수로 자손타입의 객체를 이용.
        Product p = new Tv1();
        b.buy(p);

        //위코드를 아래와같이 줄일 수 있습니다.
        b.buy(new Computer());

        System.out.println("남은 금액은 " + b.money + " 만원 입니다.");
        System.out.println("보너스포인트는  " + b.bonusPoint + " 만원 입니다.");


    }
}















