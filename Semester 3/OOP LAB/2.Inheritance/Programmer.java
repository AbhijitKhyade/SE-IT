package Inheritance;

import java.util.Scanner;

public class Programmer extends Employee{
    Salary s;

    Programmer(){
        s = new Salary();
    }

    void BpInput(){
        s.Input();
    }

    void Salary_Cal(){
        s.CalculateSalary();
    }

    void display_sal(){
        s.displaySal();
    }
}
