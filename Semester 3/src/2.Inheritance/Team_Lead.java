package Inheritance;

import java.util.Scanner;

public class Team_Lead extends Employee{
    Salary s;

    Team_Lead(){
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
