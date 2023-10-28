package ComplexNo;

import java.util.Scanner;

public class TestComplexNo {
    public static void main(String[] args){
        Complex obj1 = new Complex();
        obj1.accept();
        System.out.print("First Complex number: ");
        obj1.display();
        Complex obj2 = new Complex();
        obj2.accept();
        System.out.print("Second Complex number: ");
        obj2.display();
        System.out.println();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Complex cal = new Complex();

        do{
            System.out.println("1.Add ComplexNo\n2.Subtract ComplexNo\n3.Multiply ComplexNo\n4.Divide ComplexNo\n5.Change Inputs\n6.Exit Program");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    System.out.print("First complex number: ");
                    obj1.display();
                    System.out.print("Second complex number: ");
                    obj2.display();
                    cal.add(obj1,obj2);
                    System.out.print("Addition of two Complex numbers: ");
                    cal.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("First complex number: ");
                    obj1.display();
                    System.out.print("Second complex number: ");
                    obj2.display();
                    cal.subtract(obj1,obj2);
                    System.out.print("Subtraction of two Complex numbers: ");
                    cal.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("First complex number: ");
                    obj1.display();
                    System.out.print("Second complex number: ");
                    obj2.display();
                    cal.multiply(obj1,obj2);
                    System.out.print("Multiplication of two Complex numbers: ");
                    cal.display();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("First complex number: ");
                    obj1.display();
                    System.out.print("Second complex number: ");
                    obj2.display();
                    cal.divide(obj1,obj2);
                    System.out.print("Division of two Complex numbers: ");
                    cal.display();
                    System.out.println();
                    break;
                case 5:
                    obj1.accept();
                    System.out.print("First Complex number: ");
                    obj1.display();
                    obj2.accept();
                    System.out.print("Second Complex number: ");
                    obj2.display();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting the program!!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }while(choice < 6);
    }
}