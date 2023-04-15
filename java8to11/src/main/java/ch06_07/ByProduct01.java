package ch06_07;
/*
  1. 물건을 구입하는 클래스 구현하기.
  2. 물건은 tv,computer 가 있다.
  3. 물건을 구입할때 구입가격의 일정 퍼센트만큼 보너스 포인트를 구매자에게 부여해주기.
*/

class Product01{ // 다형성을 위한 부모 상품 클래스.
    int price;
    int bonusPoint;

    Product01(int price){ //생성자 Buyer 가 물건 구입시 가격과 보너스포인트를 정산.
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv02 extends Product01{ //상품 Tv
    Tv02(){
        super(200); //super -> 조상클래스의 생성자를 호출. 즉 Product01 의 생성자 호출.
    }
    public String toString(){ //Object 타입의 toString 를 오버라이딩.
        return "Tv";
    }
}
class Computer02 extends Product01{ //상품 Computer

    Computer02(){
        super(300);
    }

    public String toString(){
        return "Computer02";
    }
}
class Buyer02{
    int money = 1000;
    int bonusPoint;

    //Product01 을 매개변수로 받는 다형성의 장점으로 Tv,Computer 를 받을 수 있습니다.
    //만약 Product01 로 매개변수를 받지 않고 상품마다 받게된다면 지금은 2개지만 상품이 100개가 되고 할때 일일이 메서드를 구현해야합니다.
    void buy(Product01 p){
        if(money < p.price){
            System.out.println("소지하고 있는 돈이 부족합니다.");
            return; //소지하고 있는 금액이 상품가격보다 적다면 return -> 메서드 종료 아래 구문 실행 x
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+" 를 구매하셧습니다.");
    }
}
public class ByProduct01 {
    public static void main(String[] args) {

        Buyer02 b = new Buyer02();
        //Product02 p = new Tv02();
        //b.buy(p)
        b.buy(new Tv02()); //위 두줄을 한줄로 줄인것.
        b.buy(new Computer02());

        System.out.println("남은 금액은 " + b.money + " 입니다.");
        System.out.println("보너스 포인트는 " + b.bonusPoint + " 입니다.");

    }

}





