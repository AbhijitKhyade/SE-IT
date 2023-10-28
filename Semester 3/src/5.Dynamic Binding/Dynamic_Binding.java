import java.util.Scanner;

//Creating Abstract class
abstract class Shape
{
    protected double length,height;
    abstract void area();
    void Input(){}
    void display(){}
}

//Inherited class
class Triangle extends Shape
{
    private double Area;
    //Taking input from user
    void Input() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter base of triangle: ");
                length = Double.parseDouble(sc.next());
                while (length < 0) {
                    System.out.print("Base cannot be negative");
                    System.out.print("\nEnter base of triangle: ");
                    length = Double.parseDouble(sc.next());
                }
                System.out.print("Enter height of triangle: ");
                height = Double.parseDouble(sc.next());
                while (height < 0) {
                    System.out.print("Height cannot be negative");
                    System.out.print("\nEnter height of triangle: ");
                    height = Double.parseDouble(sc.next());
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    //Function to calculate area
    void area()
    {
        Area = 0.5 * length * height;
    }

    //displaying area
    void display()
    {
        System.out.print("\nArea of Triangle: "+ Area+"\n");
    }
}

//Inherited class
class Rectangle extends Shape
{
    double Area;
    //Taking input from user
    void Input()
    {
        Scanner sc = new Scanner(System.in);
       boolean flag = true;
       while(true){
           try{
               System.out.print("Enter Length of Rectangle: ");
               length = Double.parseDouble(sc.next());
               while(length < 0)
               {
                   System.out.print("Length cannot be negative");
                   System.out.print("\nEnter length of rectangle: ");
                   length =Double.parseDouble(sc.next());
               }
               System.out.print("Enter Breadth of Rectangle: ");
               height = Double.parseDouble(sc.next());
               while(height < 0)
               {
                   System.out.print("Breadth cannot be negative");
                   System.out.print("\nEnter breadth of rectangle: ");
                   height = Double.parseDouble(sc.next());
               }
               flag = false;
           }catch (Exception e){
               System.out.println(e);
           }
       }
    }

    //Function to calculate area
    void area()
    {
        Area =  length * height;
    }
    //displaying area
    void display()
    {
        System.out.print("\nArea of Rectangle: "+ Area +"\n");
    }
}

public class Dynamic_Binding
{
    public static void main(String[] args)
    {
        int choice;
        Shape S;
        Scanner sc1 = new Scanner(System.in);

        do {
            System.out.print("\n1.Area of Triangle\n2.Area of Rectangle\n3.Exit.");
            System.out.print("\nEnter your choice: ");
            choice = sc1.nextInt();

            switch (choice)
            {
                case 1:
                    S = new Triangle();  //Dynamic Binding means Memory is allocated to object at runtime
                    S.Input();
                    S.area();
                    S.display();
                    break;
                case 2:
                    S = new Rectangle();
                    S.Input();
                    S.area();
                    S.display();
                    break;
                case 3:
                    System.out.println("Exiting the program!!!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(choice < 3);
    }
}