package Publication;

import java.util.Scanner;
public class Polymorphism {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        Magazine m = new Magazine();
        Book b = new Book();

        while(true){
            System.out.println("\n------------MENU------------");
            System.out.println("1 ---> ORDER BOOK");
            System.out.println("2 ---> ORDER MAGAZINE ");
            System.out.println("3 ---> TOTAL BOOK SALE ");
            System.out.println("4 ---> TOTAL MAGAZINE SALE ");
            System.out.println("5 ---> TOTAL PUBLICATION SALE ");
            System.out.println("6 ---> EXIT\n");
            int choice;
            System.out.print("ENTER YOUR CHOICE : ");
            choice = y.nextInt();

            switch (choice){
                case 1:
                    System.out.println();
                    b.orderCopies();
                    System.out.println();
                    System.out.println("-------ORDER DETAILS--------");
                    b.displayData();
                    System.out.println();
                    b.saleCopy();
                    break;
                case 2:
                    System.out.println();
                    m.recieveIssue();
                    System.out.println();
                    System.out.println("-------ORDER DETAILS--------");
                    m.displayData();
                    System.out.println();
                    m.saleCopy();
                    break;
                case 3:
                    System.out.println();
                    b.totalBookSale();
                    break;
                case 4:
                    System.out.println();
                    m.totalMagSale();
                    break;
                case 5:
                    System.out.println();
                    b.totalBookSale();
                    m.totalMagSale();
                    System.out.println();
                    System.out.println("----->TOTAL PUBLICATION SALE : Rs. "+(b.getTotal_book()+m.getTotal_mag()));
                    break;
                case 6:
                    System.out.println();
                    System.out.println("EXITING PROGRAM............");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("----->incorrect choice!");
                    break;
            }
        }
    }
}
