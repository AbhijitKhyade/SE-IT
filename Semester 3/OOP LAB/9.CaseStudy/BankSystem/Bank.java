package BankSystem;

import java.util.ArrayList;

public class Bank {

    private String name, password, mobile,accNo;
    private double balance;
    private int age;

    Bank(String x,String y,String z,Double a,int b,String c){//parameterized constructor
        name = x;
        password = y;
        mobile = z;
        balance = a;
        age = b;
        accNo = c;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public int getAge() {
        return age;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }
}
