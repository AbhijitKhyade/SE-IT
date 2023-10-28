package FactoryDesignPattern;

import java.util.Scanner;

public class TestFactoryPattern {
    public static void main(String[] args){
        //Instance of class CarFactory
        CarFactory obj = new CarFactory();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Sedan\n2.HatchBack\n3.SUV\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            //Menu drive program
            switch (choice){
                case 1:
                    obj.buildCar(CarType.Sedan);
                    break;
                case 2:
                    obj.buildCar(CarType.Hatchback);
                    break;
                case 3:
                    obj.buildCar(CarType.SUV);
                    break;
                case 4:
                    System.out.println("Exiting the program!!!");
                    break;
                default:
                    System.out.println("invalid choice.");
            }
        }while (choice < 4);
    }
}
