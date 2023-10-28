package Vehicles;

import java.util.Scanner;

class Car implements vehicle {
    public int speed,gear,in_speed;

    Car(int s, int g){
        speed = s;
        gear = g;
        in_speed = 0;
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void speedUp() {
        System.out.println("How much speed you want to increase: ");
        in_speed = sc.nextInt();
        System.out.println("Speed after increase: "+(in_speed+speed));
    }

    @Override
    public void gearUp() {
        System.out.println("Enter gear you want to shift on: ");
        gear = sc.nextInt();
        if(gear==1) {
            System.out.println("Car on 1st gear and having speed between: "+(in_speed+speed));
        }
        else if(gear==2) {
            System.out.println("Car on 2nd gear and having speed between: "+(in_speed+speed));
        }
        else if(gear==3) {
            System.out.println("Car on 3rd gear and having speed between: "+(in_speed+speed));
        }
        else if(gear==4) {
            System.out.println("Car on 4th gear and having speed between: "+(in_speed+speed));
        }
        else if (gear==5) {
            System.out.println("Reverse gear is activated");
        }

    }

    @Override
    public void applyBrake() {
        System.out.println("Brake applied successfully ");
        System.out.println("Speed is reduced to 0");
    }
}
