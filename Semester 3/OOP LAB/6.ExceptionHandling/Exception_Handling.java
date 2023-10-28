package ExceptionHandling;

import java.util.Scanner;

public class Exception_Handling {
    private String name,div;
    private int rollNo,marks,total;

    Scanner sc = new Scanner(System.in);
    public void accept(){
        System.out.println("Enter Student Details: ");
        System.out.print("Enter name of student: ");
        name = sc.next();
        System.out.print("Enter division: ");
        div = sc.next();
        System.out.println("Name: "+name);
        System.out.println("Division: "+div);
        boolean flag = true;
        while (flag){
            try{
                System.out.print("Enter rollNo of student: ");
                rollNo = Integer.parseInt(sc.next());
                while(rollNo < 0){
                    System.out.println("Invalid Roll no");
                    System.out.print("Enter rollNo of student: ");
                    rollNo = Integer.parseInt(sc.next());
                }
                System.out.println("Roll No: "+rollNo);
                flag = false;
            }catch (NumberFormatException e){
                System.out.println("NumberFormatException caught!!!");
                System.out.println("Please enter integers only");
            }catch (Exception e){
                System.out.println(e);
            }
        }
        boolean flag1 = true;
        while (flag1){
            try{
                System.out.print("Enter marks obtained: ");
                marks = Integer.parseInt(sc.next());
                while(marks < 0){
                    System.out.println("Invalid marks");
                    System.out.print("Enter marks obtained: ");
                    marks = Integer.parseInt(sc.next());
                }
                System.out.println("Marks: "+marks);
                flag1 = false;
            }catch (NumberFormatException e){
                System.out.println("NumberFormatException caught!!!");
                System.out.println("Please enter integers only");
            }catch (Exception e){
                System.out.println(e);
            }
        }

        try{
            int a;
            System.out.print("Enter total subjects: ");
            a = sc.nextInt();
            total = (40+36+45+48+49)/a;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Caught!!!\nDivide by zero error");
        }

        try{
            int []arr = {98,82,90,84,95};
            System.out.print("Enter index to fetch the marks of student: ");
            int index = Integer.parseInt(sc.next());
            System.out.println("Marks: "+arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught!!!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}