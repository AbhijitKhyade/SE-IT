package Inheritance;

import java.util.Scanner;

public class Assistant_Project_Manager extends Employee{
    Salary s;

    Assistant_Project_Manager(){
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
