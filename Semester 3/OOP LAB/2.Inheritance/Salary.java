package Inheritance;

import java.util.Scanner;

public class Salary {
    double Basic_pay;
    double Gross_Salary,Net_Salary;

    void Input()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("\nEnter your Basic Pay: ");
        Basic_pay = sc2.nextDouble();
    }

    // Calculating Salary
    void CalculateSalary()
    {
        /* 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1%
        of BP for staff club fund*/

        Gross_Salary = Basic_pay + (Basic_pay * 0.97) + (Basic_pay * 0.1);
        Net_Salary = Gross_Salary  - (Basic_pay * 0.001) - (Basic_pay * 0.12);
    }

    //  Displaying the calculated salary
    void displaySal()
    {
        System.out.print("\n----------------------------------------");
        System.out.print("\nThe DA              : "+Basic_pay*0.97);
        System.out.print("\nThe HRA             : "+Basic_pay*0.10);
        System.out.print("\nThe PF              : "+Basic_pay*0.12);
        System.out.print("\nThe Staff club fund : "+Basic_pay*0.001);
        System.out.print("\nThe Gross Salary    : "+Gross_Salary);
        System.out.print("\nThe Net Salary      : "+Net_Salary);
        System.out.print("\n----------------------------------------");
    }
}
