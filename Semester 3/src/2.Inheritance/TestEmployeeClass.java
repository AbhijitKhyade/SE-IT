package Inheritance;

import java.util.Scanner;

public class TestEmployeeClass {
    public static void main(String[] args)
    {
        int choice;
        Scanner sc1 = new Scanner(System.in);

        do {
            System.out.print("\n1.Programmer\n2.Team Lead\n3.Assistant Project Manager\n4.Project Manager\n5.Exit");
            System.out.print("\nEnter Choice: ");
            choice = sc1.nextInt();
            switch (choice)
            {
                case 1:
                    Programmer p1 = new Programmer();
                    p1.read();
                    p1.BpInput();
                    p1.display();
                    System.out.print("\n\nProgrammer Salary Slip: ");
                    p1.Salary_Cal();
                    p1.display_sal();
                    break;
                case 2:
                    Team_Lead t1 = new Team_Lead();
                    t1.read();
                    t1.BpInput();
                    t1.display();
                    System.out.print("\n\nTeam Lead Salary Slip: ");
                    t1.Salary_Cal();
                    t1.display_sal();
                    break;
                case 3:
                    Assistant_Project_Manager a1 = new Assistant_Project_Manager();
                    a1.read();
                    a1.BpInput();
                    a1.display();
                    System.out.print("\n\nAssistant_Project_Manager Salary Slip: ");
                    a1.Salary_Cal();
                    a1.display_sal();
                    break;
                case 4:
                    Project_Manager p2 = new Project_Manager();
                    p2.read();
                    p2.BpInput();
                    p2.display();
                    System.out.print("\n\nProgrammer Salary Slip: ");
                    p2.Salary_Cal();
                    p2.display_sal();
                    break;
                case 5:
                    System.out.println("Exiting the program!!!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(choice < 5);
    }
}
