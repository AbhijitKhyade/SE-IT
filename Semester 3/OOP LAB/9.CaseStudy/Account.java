package CaseStudy;

abstract class Account { //creating abstract class account
    protected double balance; //declaration of balance
    protected int accountId;  //declaration of accountId
    protected String accountType; //declaration of accountType
    protected Customer custobj;  //declaration of customer obj

    void setBalance(double balance){
        this.balance=balance;   //setting value of balance
    }

    double getBalance(){
        return balance;  //returning value of balance
    }

    void setAccountId(int accountId){
        this.accountId=accountId;   //setting value of balance
    }

    int getAccountId(){
        return accountId; //returning value of accountId
    }

    void setAccountType(String accountType){
        this.accountType=accountType;  //setting value of balance
    }

    String getAccountType(){
        return accountType;  //returning value of accountType
    }

    void setCustomerObject(Customer custobj){
        this.custobj=custobj; //setting value of balance
    }

    Customer getCustomerObject(){
        return custobj;    //returning value of custobj
    }

    public abstract boolean withdraw(double amount); //abstract method withdraw
}
