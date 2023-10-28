package Inheritance;

import java.util.Scanner;

public class Project_Manager extends Employee {
    Salary s;

    Project_Manager(){
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
