package Vehicles;

import java.util.Scanner;

class bike implements vehicle {
    Scanner sc = new Scanner(System.in);
    int gear, speed, in_speed;

    bike(int s, int g) {
        gear = g;
        speed = s;
        in_speed = 0;
    }

    @Override
    //function for increasing speed
    public void speedUp() {
        System.out.println("How much speed you want to increase: ");
        in_speed = sc.nextInt();
        System.out.println("Speed after increase: " + (in_speed + speed));
    }

    @Override
    public void applyBrake() {
        System.out.println("Brake applied successfully ");
        System.out.println("Speed is reduced to 0");
    }

    @Override
    //function for changing gear
    public void gearUp() {
        System.out.println("Enter gear you want to shift on: ");
        gear = sc.nextInt();
        if (gear == 1) {
            System.out.println("bike on 1st gear and having speed between 0 to 30");
        }
        else if (gear == 2) {
            System.out.println("bike on 2nd gear and having speed between 30 to 60");
        }
        else if (gear == 3) {
            System.out.println("bike on 3rd gear and having speed between 60 to 90");
        }
        else if (gear == 4) {
            System.out.println("bike on 4th gear and having speed between 90 to 120");
        }
    }
}
