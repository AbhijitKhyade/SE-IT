package StrategyDesignPattern;
import java.util.Scanner;
public class CreditCardStrategy implements PaymentStrategy{
    String name,cardNo;
    int cvv,expDate;
    //Constructor
    CreditCardStrategy(){
        getInfo();
    }
    Scanner sc = new Scanner(System.in);
    //Function to get input
    public void getInfo(){
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your Card number: ");
        cardNo = sc.next();
        System.out.print("Enter cvv of card: ");
        cvv = sc.nextInt();
        System.out.print("Enter Expiry Date of card: ");
        expDate = sc.nextInt();
    }
    //Function to pay amt
    @Override
    public void pay(int amt) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Paying through CreditCard Charging Rs " + amt);
        System.out.println("----------------------------------------------------------");
    }
}
