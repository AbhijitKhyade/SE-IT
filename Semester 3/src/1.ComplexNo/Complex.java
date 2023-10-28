package ComplexNo;

import java.util.Scanner;

public class Complex {

    //Instance variables
    private float real,img;
    //No argument constructor
    Complex(){
        real = 0;
        img = 0;
    }
    //Parameterised constructor
    Complex(float r, float i){
        real = r;
        img = i;
    }
    //Function to take input from user
    void accept(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter real part of complex no: ");
                real = Float.parseFloat(sc.next());
                flag = false;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please enter floating point numbers..");
            }
        }
        boolean flag1 = true;
        while(flag1){
            try{
                System.out.print("Enter imaginary part of complex no: ");
                img = Float.parseFloat(sc.next());
                flag1 = false;
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Please enter floating point numbers..");
            }
        }
    }

    //Function to display the complex no.s
    void display(){
        if(img == 0){
            System.out.println(""+real);
        }
        else if(real == 0){
            System.out.println(""+img+"i");
        }
        else if(img < 0){
            System.out.println(""+real+img+"i");
        }
        else{
            System.out.println(""+real+"+"+img+"i");
        }
    }

    //Function to add two complex no
    void add(Complex a1, Complex a2){
        real = a1.real + a2.real;
        img = a1.img + a2.img;
    }

    //Function to subtract two complex no
    void subtract(Complex a1, Complex a2){
        real = a1.real - a2.real;
        img = a1.img - a2.img;
    }

    //Function to multiply to complex no
    void multiply(Complex a1, Complex a2){
        real = a1.real * a2.real - a1.img * a2.img;
        img = a1.real * a2.img + a1.img * a2.real;
    }

    //Function to divide two complex no
    void divide(Complex a1, Complex a2){
        real = (a1.real * a2.real + a1.img * a2.img)/((a2.real * a2.real) + (a2.img * a2.img));
        img = (a1.img * a2.real - a1.real * a2.img)/((a2.real * a2.real) + (a2.img * a2.img));
    }
}
