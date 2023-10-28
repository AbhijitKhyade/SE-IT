package Vehicles;

import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        int gear,speed;
        Scanner sc = new Scanner(System.in);

        while(true){
            int choice;
            System.out.println("1.Car\n2.Bike\n3.Bicycle\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int ch1,ch2,ch3;
            if(choice == 1){
                System.out.print("Enter current speed: ");
                speed = sc.nextInt();
                System.out.print("Enter no of gear: ");
                gear = sc.nextInt();
                Car c1 = new Car(speed,gear);
                do{
                    System.out.print("Enter which operation you want to perform: ");
                    System.out.println("\n1.Speedup\n2.Apply brake\n3.GearUp\n4.no operation");
                    System.out.print("Enter your choice: ");
                    ch1 = sc.nextInt();

                    switch (ch1){
                        case 1:
                            c1.speedUp();
                            break;
                        case 2:
                            c1.applyBrake();
                            break;
                        case 3:
                            c1.gearUp();
                            break;
                        case 4:
                            System.out.println("Exiting from the car operation...");
                            break;
                    }
                }while (ch1 < 4);
            }
            else if (choice == 2) {
                System.out.print("Enter current speed: ");
                speed = sc.nextInt();
                System.out.print("Enter no of gear: ");
                gear = sc.nextInt();
                bike b1 = new bike(speed,gear);
                do{
                    System.out.print("Enter which operation you want to perform: ");
                    System.out.println("\n1.Speedup\n2.Apply brake\n3.GearUp\n4.no operation");
                    ch2 = sc.nextInt();

                    switch (ch2){
                        case 1:
                            b1.speedUp();
                            break;
                        case 2:
                            b1.applyBrake();
                            break;
                        case 3:
                            b1.gearUp();
                            break;
                        case 4:
                            System.out.println("Exiting from the bike operation...");
                            break;
                    }
                }while (ch2 < 4);
            }
            else if (choice == 3) {
                System.out.print("Enter current speed: ");
                speed = sc.nextInt();
                System.out.print("Enter no of gear: ");
                gear = sc.nextInt();
                bicycle by1 = new bicycle(speed,gear);
                do{
                    System.out.print("Enter which operation you want to perform: ");
                    System.out.println("\n1.Speedup\n2.Apply brake\n3.GearUp\n4.no operation");
                    System.out.print("Enter your choice: ");
                    ch3 = sc.nextInt();

                    switch (ch3){
                        case 1:
                            by1.speedUp();
                            break;
                        case 2:
                            by1.applyBrake();
                            break;
                        case 3:
                            by1.gearUp();
                            break;
                        case 4:
                            System.out.println("Exiting from the car operation...");
                            break;
                    }
                }while (ch3 < 4);
            }
            else{
                break;
            }
        }
    }
}
