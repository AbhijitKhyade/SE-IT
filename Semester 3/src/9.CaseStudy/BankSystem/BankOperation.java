package BankSystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BankOperation {

    //to store multiple accounts
    ArrayList<Bank> account = new ArrayList<Bank>();
    private Scanner sc = new Scanner(System.in);
    String name,pass,m,id;
    double amt;
    int age;
    //Function to create a new account
    public void createAccount()
    {
        //Reading input from user
        System.out.print("Enter Account Holder name: ");
        name = sc.next();
        System.out.print("Enter 4 digit Id no : ");
        id = sc.next();
        while(id.length() != 4){
                System.out.print("Please Enter 4 digit Id no : ");
                id = sc.next();
        }
        System.out.print("Enter mob.no: ");
        m =sc.next();
        while(m.length() != 10)
        {
            System.out.print("Please Enter 10 digit mob.no: ");
            m =sc.next();
        }
        System.out.print("Enter age: ");
        age = sc.nextInt();
        while(age < 18)
        {
            System.out.print("Please Enter valid age: ");
            age =sc.nextInt();
        }
        while(age > 100 )
        {
            System.out.print("Please Enter valid age: ");
            age =sc.nextInt();
        }
        System.out.print("Enter 8 digit password: ");
        pass = sc.next();
        while(pass.length() != 8)
        {
            System.out.print("Please Enter 8 character password: ");
            pass =sc.next();
        }
        System.out.print("Enter initial Amount: ");
        amt =sc.nextDouble();
        while(amt < 0)
        {
            System.out.print("Please Enter amount: ");
            amt =sc.nextDouble();
        }

        Bank b = new Bank(name,pass,m,amt,age,id);
        account.add(b);

        System.out.println("Account Created Successfully.");
    }

    //to find customer data
    Bank FindData(){
        Bank b = null;

        String key;
        while (true){
            System.out.print("Enter 4 digit Id no : ");
            key = sc.next();
            while(key.length() != 4){
                System.out.print("Please Enter 4 digit Id no : ");
                key = sc.next();
            }
            break;
        }

        boolean flag = false;
        for(int i = 0; i < account.size();i++){
            if(Objects.equals(key,account.get(i).getAccNo())){
                b = account.get(i);
                flag = true;
                break;
            }
        }

        if(flag){

            while(true){
                String p;
                System.out.print("Enter pass word : ");
                p = sc.next();
                if(Objects.equals(b.getPassword(), p))
                    return b;
            }
        }
        return null;
    }

    //Function to display customer data
    public void display(){
        Bank b = FindData();

        if(b == null){
            System.out.println("Data not found");
        }
        else{
            System.out.println("--------Account Information--------");
            System.out.println("Account holder name : "+b.getName());
            System.out.println("Age : "+b.getAge());
            System.out.println("Mobile number : "+b.getMobile());
            System.out.println("Id : "+b.getAccNo());
            System.out.println("Balance : "+b.getBalance()+"Rs.");
        }
    }

    //Function to deposit money
    public void depositMoney(){
        Bank b = FindData();

        if(b == null){
            System.out.println("Data not found");
        }
        else{
            double deposit = 0;
            while(true){
                System.out.print("Enter amount to be deposited : ");
                deposit = sc.nextDouble();
                if(deposit > 0)
                    break;
                else
                    System.out.println("Amount should be positive");
            }

            b.setBalance(b.getBalance()+deposit);
            System.out.println("Amount deposited successfully ");
            System.out.println("Account balance : "+b.getBalance());
        }
    }

    //Function to withdraw money
    public void withdrawMoney(){
        Bank b = FindData();

        if(b == null){
            System.out.println("Data not found ");
        }
        else{
            double x = 0;
            while(true){
                System.out.print("Enter amount to withdraw : ");
                x = sc.nextDouble();
                if(x < b.getBalance()&&x > 0)
                    break;
                else
                    System.out.println("Amount should be less than balance and positive");
            }

            b.setBalance(b.getBalance()-x);
            System.out.println("Amount withdrawn successfully");
            System.out.println("Account balance : "+b.getBalance());
        }
    }

    //Function to check Balance
    public void checkBalance(){
        Bank b = FindData();
        if(b == null){
            System.out.println("Data not found");
        }
        else{
            System.out.println("Account balance : "+b.getBalance());
        }
    }

    //Function to update the record
    public void update(){
        Bank b = FindData();
        if(b == null){
            System.out.println("Data not found");
        }
        else{
            boolean flag = false;
            while (!flag){
                System.out.println("Choose field to update : ");
                System.out.println("1) Name\n2) Age\n3) Mobile number\n4) Reset Password");
                System.out.println("5) to exit");
                int c;
                System.out.print("Enter choice : ");
                c = sc.nextInt();

                switch (c) {
                    case 1 -> {
                        String x;
                        System.out.print("Enter name : ");
                        sc.nextLine();
                        x = sc.nextLine();
                        b.setName(x);
                    }
                    case 2 -> {
                        int y;
                        while (true) {
                            System.out.print("Enter new age : ");
                            y = sc.nextInt();
                            while(age < 0 )
                            {
                                System.out.print("Please Enter valid age: ");
                                age =sc.nextInt();
                            }
                            break;
                        }
                        b.setAge(y);
                    }
                    case 3 -> {
                        String z;
                        while (true) {
                            System.out.print("Enter mobile number : ");
                            z = sc.next();
                            while(m.length() != 10)
                            {
                                System.out.print("Please Enter 10 digit mob.no: ");
                                m =sc.next();
                            }
                            break;
                        }
                        b.setMobile(z);
                    }
                    case 4 -> {
                        String pass;
                        System.out.print("Enter new pass : ");
                        pass = sc.next();
                        b.setPassword(pass);
                    }
                    case 5 -> flag = true;
                    default -> System.out.println("Invalid choice ");
                }
            }
        }
    }
}
