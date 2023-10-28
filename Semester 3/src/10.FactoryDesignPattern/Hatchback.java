package FactoryDesignPattern;

import java.util.Scanner;
//Inherited class
public class Hatchback extends Car{

    //Parameterized constructor
    Hatchback(CarType model){
        super(model);
        brand();
        constructCar();
        colour();
    }
    Scanner sc = new Scanner(System.in);

    //Function to constructCar
    @Override
    void constructCar() {
        System.out.println("Manufacturing the car...");
        System.out.println("Constructing the HatchBack car.");
    }

    //Function to colour the car
    @Override
    void colour() {
        String colour;
            System.out.println("1.White\n2.Black\n3.Red\n4.Grey");
            System.out.print("Enter colour name to paint the car: ");
            colour = sc.next();

            switch (colour){
                case "White":
                    System.out.println("Car is ready with white colour!");
                    break;
                case "Black":
                    System.out.println("Car is ready with Black colour!");
                    break;
                case "Red":
                    System.out.println("Car is ready with Red colour!");
                    break;
                case "Grey":
                    System.out.println("Car is ready with Grey colour!");
                    break;
            }
        System.out.println("Car is Constructed!");
    }

    //Function to choose brand of car
    @Override
    void brand() {
            String Brand;
                System.out.println("1.Tata\n2.Honda\n3.Toyota\n4.Mahindra");
                System.out.print("Enter Brand name for car: ");
                Brand = sc.next();

                switch (Brand) {
                    case "Tata":
                        System.out.println("HatchBack Tata car is constructing");
                        break;
                    case "Honda":
                        System.out.println("HatchBack Honda car is constructing");
                        break;
                    case "Toyota":
                        System.out.println("HatchBack Toyota car is constructing");
                        break;
                    case "Mahindra":
                        System.out.println("HatchBack Mahindra car is constructing");
                        break;
                }
    }
}
