package ch06_07;

class Product02{
    int price = 0;
    int bonusPoint;

    Product02(){}

    Product02(int price){
        this.price = price;
        this.bonusPoint = (int) (price/10);
    }
}

class Tv03 extends Product02{
    Tv03(){
        super(200);
    }
    public String toString(){
        return "Tv03";
    }
}

class Pc extends Product02{
    Pc(){
        super(300);
    }
    public String toString(){ return "Pc";}
}
class Audio01 extends Product02{
    Audio01(){
        super(150);
    }
    public String toString(){ return "Audio01";}
}

class Buyer03{
    int money = 2000;
    int bonusPoint = 0;

    Product02[] cart = new Product02[10];
    int i = 0;

    void buy(Product02 p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + " 를 구매하셧습니다.");
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i = 0; i < cart.length; i++){
            if(cart[i] == null) break; // cart 에 더이상 데이터가 없다면 반복문 빠져나가기.
            itemList += cart[i]+ " , ";
            sum += cart[i].price;
        }

        System.out.println("구입하신 물품의 총 가격은 " + sum + " 입니다.");
        System.out.println("구매하신 물품은 " + itemList + " 입니다.");


    }
}

public class ByProduct02 {
    public static void main(String[] args) {

        Buyer03 b = new Buyer03();
        b.buy(new Pc());
        b.buy(new Tv03());
        b.buy(new Audio01());

        b.summary();

    }
}










