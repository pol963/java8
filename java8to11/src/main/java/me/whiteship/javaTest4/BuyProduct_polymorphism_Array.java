package me.whiteship.javaTest4;

class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product2(){}
}

class Tv2 extends Product2{
    Tv2(){
        super(100);
    }

    public String toString(){
        return "Tv2";
    }

}

class Computer2 extends Product2{
    Computer2(){
        super(200);
    }

    public String toString(){
        return "Computer2";
    }

}

class Audio2 extends Product2{

    Audio2(){
        super(150);
    }

    public String toString(){
        return "Audio2";
    }
}

class Buyer2{

    int money = 1000;
    int bonusPoint = 0;

    Product2[] cart = new Product2[10]; //구매한 상품들을 담아두는 장바구니. 이후 정산에 필요.
    int i = 0; //이후 반복문을 통해서 카트 정산시에 필요한 변수.

    //구매기능 메서드.
    public void buy(Product2 p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint = p.bonusPoint;
        cart[i++] = p;
        System.out.println(p+" 를 구매하셧습니다.");
    }

    //정산 메서드.
    public void summary(){
        int sum = 0; //구매 총 금액.
        String itemList = ""; //구매 총 물품.

        for(int i = 0; i < cart.length ; i++){
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i]+" , ";
        }
        System.out.println("구매하신 물품의 총 금액은 " + sum + " 만원 입니다.");
        System.out.println("구매하신 물품의 종류는 " + itemList + "입니다.");
    }
}

public class BuyProduct_polymorphism_Array {
    public static void main(String[] args) {

        Buyer2 b = new Buyer2();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());

        b.summary();

    }
}




















