package CaseStudy;

class SavingsAccount extends Account{
    //inheriting Account class in SavingAccount
    private double minimumBalance;       //declaration of minimumBalance
    public void setMinimumBalance(double minimumBalance){
        this.minimumBalance=minimumBalance;    //setting minimumBalance
    }

    public double getMinimumBalance(){
        return minimumBalance;  //returning minimumBalance
    }

    public boolean withdraw(double amount){
        //method to return true or false
        if((balance-amount)>minimumBalance){
            //check whether withdraw amount is greater than minimumBalance
            balance -= amount;  //balance minus amount
            return true;       //returning true
        }
        else
            return false; //returning false
    }
}