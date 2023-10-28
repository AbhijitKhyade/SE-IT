package Generics;

import java.util.Scanner;

public class TestGenericClass {
    public static void main(String[] args) {
        Generic<Integer> g1 = new Generic<Integer>();
        Generic<String> g2 = new Generic<String>();
        Scanner y = new Scanner(System.in);

        while(true){
            System.out.println("Select type of array to work on :-");
            System.out.println("1)Integer array\n2)String array");
            System.out.println("3)Exit program");
            int ch1;
            System.out.print("Enter your choice : ");
            ch1 = y.nextInt();
            System.out.println();

            if(ch1==1){
                System.out.println("-----------------INTEGER ARRAY---------------");
                g1.accept();
                boolean flag1 = true;
                while(flag1){
                    System.out.println("Operations on integer array :-");
                    System.out.println("1)Display\n2)Find even and odd numbers\n3)Find prime numbers\n4)Change array");
                    System.out.println("5)Exit");
                    int ch2;
                    System.out.print("Enter your choice : ");
                    ch2 = y.nextInt();
                    System.out.println("=====================================");

                    switch (ch2) {
                        case 1 -> {
                            g1.display();
                            System.out.println("=====================================");
                        }
                        case 2 -> {
                            g1.evenOdd();
                            System.out.println("=====================================");
                        }
                        case 3 -> {
                            g1.prime();
                            System.out.println("=====================================");
                        }
                        case 4 -> {
                            g1.accept();
                            System.out.println("=====================================");
                        }
                        case 5 -> {
                            System.out.println("Exiting integer array......");
                            System.out.println("=====================================");
                            flag1 = false;
                        }
                        default -> {
                            System.out.println("Invalid operation!!!!!");
                            System.out.println("=====================================");
                        }
                    }
                }
            }
            else if (ch1 == 2){
                System.out.println("------------------STRING ARRAY-----------------");
                g2.accept();
                boolean flag2 = true;
                while (flag2){
                    System.out.println("Operations on string array :-");
                    System.out.println("1)Display\n2)Find words which are palindrome\n3)Change array\n4)Exit");
                    int ch3;
                    System.out.print("Enter your choice : ");
                    ch3 = y.nextInt();
                    System.out.println("=====================================");

                    switch (ch3) {
                        case 1 -> {
                            g2.display();
                            System.out.println("=====================================");
                        }
                        case 2 -> {
                            g2.palindrome();
                            System.out.println("=====================================");
                        }
                        case 3 -> {
                            g2.accept();
                            System.out.println("=====================================");
                        }
                        case 4 -> {
                            System.out.println("Exiting string array........");
                            System.out.println("=====================================");
                            flag2 = false;
                        }
                        default -> {
                            System.out.println("Invalid operation!!!!!!");
                            System.out.println("=====================================");
                        }
                    }
                }
            }
            else if (ch1 == 3){
                System.out.println("Exiting program........");
                System.exit(0);
                System.out.println("=====================================");
                break;
            }
            else{
                System.out.println("Invalid choice!!!!!");
                System.out.println("=====================================");
            }
        }
    }
}
