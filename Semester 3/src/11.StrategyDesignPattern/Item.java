package StrategyDesignPattern;

public class Item {
    //Attributes
    String UpcCode;
    int price;

    //Parameterized constructor
    Item(String str, int p ){
        UpcCode = str;
        price = p;
    }

    //Function which return UpcCode
    String getUpcCode(){
        return UpcCode;
    }

    //Function which returns Price
    int getPrice(){
        return price;
    }
}
