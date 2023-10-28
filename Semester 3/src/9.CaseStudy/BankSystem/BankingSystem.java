package BankSystem;

// import BankSystem.BankOperation;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        //Instance of class Bank
        BankOperation c = new BankOperation();
        //Scanner class object
        Scanner y = new Scanner(System.in);
        while (true){
            System.out.println("---------------Menu----------------");
            System.out.println("1.Create a new account");
            System.out.println("2.Deposit money");
            System.out.println("3.Withdraw money");
            System.out.println("4.Check Balance");
            System.out.println("5.Display account information");
            System.out.println("6.Update account information");
            System.out.println("7.Exit");
            System.out.print("\nPlease select a choice : ");

            int choice;
            choice = y.nextInt();
            //Menu driven program
            switch (choice) {
                case 1 -> c.createAccount();
                case 2 -> c.depositMoney();
                case 3 -> c.withdrawMoney();
                case 4 -> c.checkBalance();
                case 5 -> c.display();
                case 6 -> c.update();
                case 7 -> {
                    System.out.println("Closing banking system");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice ");
            }

        }
    }
}
