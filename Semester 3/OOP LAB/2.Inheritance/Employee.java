package Inheritance;

import java.util.Scanner;

public class Employee {
    //Data members
    private String name,Address,mail_id,Mobile_No;
    private int Emp_Id;

    // Taking Input from user
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your Address: ");
        Address = sc.next();
        System.out.print("Enter your mail_id: ");
        mail_id = sc.next();
        // Mobile No Validation
        System.out.print("Enter your mobile no: ");
        Mobile_No = sc.next();
        while(Mobile_No.length() != 10)
        {
            System.out.print("\nInvalid.");
            System.out.print("\nPlease Enter your mobile no: ");
            Mobile_No = sc.next();
        }
        boolean flag = true;
        while (flag){
            try{
                System.out.print("Enter your Employee Id: ");
                Emp_Id = Integer.parseInt(sc.next());
                while(Emp_Id < 0){
                    System.out.print("Please Enter your Employee Id: ");
                    Emp_Id = Integer.parseInt(sc.next());
                }
                flag = false;
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    // Displaying the input
    void display()
    {
        System.out.println("Employee Details: ");
        System.out.println("--------------------------");
        System.out.println("Name      : "+name);
        System.out.println("Emp_Id    : "+Emp_Id);
        System.out.println("Address   : "+Address);
        System.out.println("Mail_id   : "+mail_id);
        System.out.println("Mobile no : "+Mobile_No);
        System.out.println("--------------------------");
    }
}
