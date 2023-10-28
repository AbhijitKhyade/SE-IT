package Vehicles;

import java.util.Scanner;

public class bicycle implements vehicle{

    Scanner sc =new Scanner(System.in);
    int gear, speed,in_speed;
    bicycle(int s,int g) {
        gear=g;
        speed=s;
        in_speed=0;
    }

    @Override
    //function for increasing speed
    public void speedUp() {
        System.out.println("How much speed you want to increase: ");
        in_speed=sc.nextInt();
        System.out.println("speed after increase: "+(in_speed+speed));
    }

    @Override
    //function for apply break
    public void applyBrake() {
        System.out.println("Brake applied successfully ");
        System.out.println("Speed is reduced to 0");
    }

    @Override
    //function for changing gear
    public void gearUp() {
        System.out.println("Enter gear you want to shift on: ");
        gear=sc.nextInt();
        if(gear==1) {
            System.out.println("bicycle on 1st gear and having speed between 0 to 15 km/hr");
        }
        else if(gear==2) {
            System.out.println("bicycle on 2nd gear and having speed between 15 to 25 km/hr");
        }
        else if(gear==3) {
            System.out.println("bicycle on 3rd gear and having speed between 25 to 40 km/hr");
        }
        else if(gear==4) {
            System.out.println("bicycle on 4th gear and having speed between 40 to 60 km/hr");
        }
    }
}
