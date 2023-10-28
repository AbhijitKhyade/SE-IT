package FileHandling;

import java.io.IOException;
import java.util.Scanner;

public class TestFileHandling {

    int menu(){
        int choice = 0;
        System.out.println("--------File Handling --------");
        System.out.println("-----------------------------");
        System.out.println("1.Add Records");
        System.out.println("2.Display Records");
        System.out.println("3.Delete Records");
        System.out.println("4.Search Records");
        System.out.println("5.Modify Records");
        System.out.println("6.Exit");
        System.out.println("-----------------------------");
        return choice;
    }

    public static void main(String []args) throws IOException {
        File_Handling obj = new File_Handling();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        TestFileHandling a = new TestFileHandling();
        do{
            a.menu();
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            //Menu driven program
            switch (choice) {
                case 1:
                    obj.addRecords();
                    break;
                case 2:
                    obj.displayRecords();
                    break;
                case 3:
                    obj.deleteRecords();
                    break;
                case 4:
                    obj.searchRecords();
                    break;
                case 5:
                    obj.modifyRecords();
                    break;
                case 6:
                    System.out.println("Exiting the program!!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(choice < 6);
    }
}

