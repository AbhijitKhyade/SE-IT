package CaseStudy;

import java.util.Scanner;

class Bank {
    Scanner sc = new Scanner(System.in);  //creating object of scanner class
    public SavingsAccount a = new SavingsAccount();    // creating object of SavingAccount class
    public Customer c = new Customer();         //creating object of Customer class

    public SavingsAccount createAccount(){  //method to create an Account

        System.out.print("Enter your name: ");    //printing on console
        String customerName = sc.nextLine();    //taking customerName as input from user
        c.setCustomerName(customerName); 	//calling setCustomerName method

        System.out.print("Enter your age: ");     //printing on console
        int customerAge = sc.nextInt();          //taking customerage as input from user
        if(customerAge<18){//check whether the age is less than 18
            do{
                System.out.print("Minimum age should be 18 to create an account.\nPlease enter valid age: ");
                customerAge = sc.nextInt();
            }while(customerAge < 18); //if age is less than 18
        }
        c.setCustomerAge(customerAge); //calling setCustomerName method

        a.setCustomerObject(c);//calling setCustomerName method

        System.out.print("Enter your account Id: ");   //printing on console
        int accountid = sc.nextInt(); //taking accountid as input from user
        a.setAccountId(accountid); //calling setAccountId method

        System.out.print("Enter your account type: ");   //printing on console
        String accounttype = sc.next();  //taking accounttype as input from user
        a.setAccountType(accounttype); //calling setAccountType method

        System.out.print("Enter balance: ");  //printing on console
        double balance = sc.nextDouble();//taking balance as input from user
        a.setBalance(balance);//calling setBalance method

        System.out.print("Enter minimum balance: ");  //printing on console
        double minbalance =  sc.nextDouble(); //taking minbalance as input from user
        a.setMinimumBalance(minbalance); //calling setMinimumBalance method
        return a;      //returning saving account
    }


    void getWithdrawAmount(){
        System.out.print("Enter amount you want to withdraw: ");
        double amount = sc.nextDouble();
        System.out.print("Enter account id: ");
        int id = sc.nextInt();
        if(id == a.getAccountId()){
            if(amount > 20000) {
                System.out.println("Withdrawal failed. Maximum limit of withdrawal in one transaction is Rs.20000.");
            }
            else {
                if(a.withdraw(amount)){
                    System.out.println("Withdrawal successful! Balance is: "+a.getBalance());
                }
                else{
                    System.out.println("Sorry! Not enough balance.");
                }
            }
        }
        else{
            System.out.println("Invalid account id, customer not found.");
        }
    }

    public void depositAmount(double amount){ //method to deposit Amount
        double bal = a.getBalance()+amount;    //previous balance + amount
        a.setBalance(bal);  //call setBalance method
        System.out.println("Amount deposited successfully. Balance is: "+a.getBalance());
    }

    public void checkBalance(){   //method to check Balance
        System.out.println("Balance is: "+a.getBalance());//calling getbalance method
    }

    public void displayAccountInformation(){   //method to display Account Information
        System.out.println("Welcome "+c.getCustomerName()+"! Following are your account details:");
        //display name of customer
        System.out.println("Age :"+c.getCustomerAge()); //display Age of customer
        System.out.println("Account Id: "+a.getAccountId());      //display Account Id of customer
        System.out.println("Account Type: "+a.getAccountType()); //display Account Type of customer
        System.out.println("Balance: "+a.getBalance());     //display Balance of customer
        System.out.println("Minimum balance: "+a.getMinimumBalance());  //display Minimum balance of customer
    }
}

