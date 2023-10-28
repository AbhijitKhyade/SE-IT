package CaseStudy;

import java.util.Scanner;

public class TestBankClass {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);  //creating object of scanner class
        SavingsAccount a; //creating object of SavingsAccount class
        Bank bm = new Bank(); //cresting object of Bank class

        do{
            //menu driven program
            System.out.println("\n\t1.Create Account\n\t2.Display Account\n\t3.Check Balance"
                    + "\n\t4.Deposit Amount\n\t5.Withdraw Amount\n\t6.Exit");
            System.out.print("Enter your choice: ");  //printing on console
            int choice=sc.nextInt();   //taking input from user
            System.out.println("");
            switch(choice)      //switch case
            {
                case 1:
                    a = bm.createAccount();    //calling createAccount method
                    System.out.println("=================================================");
                    break;
                case 2:
                    bm.displayAccountInformation();  //calling displayAccountInformation method
                    System.out.println("=================================================");
                    break;
                case 3:
                    bm.checkBalance();   //calling checkBalance method
                    System.out.println("=================================================");
                    break;
                case 4:
                    System.out.print("Enter the amount you want to deposit: ");
                    double amount=sc.nextDouble();
                    bm.depositAmount(amount);       //calling depositAmount method
                    System.out.println("=================================================");
                    break;
                case 5:
                    bm.getWithdrawAmount();          //calling getWithdrawAmount method
                    System.out.println("=================================================");
                    break;
                case 6:
                    System.out.println("=================================================");
                    return ; //stop execution of program
                default:
                    System.out.println("INVALID INPUT !!");//printing invalid input
                    System.out.println("=================================================");
                    break;
            }
        }while(true);
    }
}
