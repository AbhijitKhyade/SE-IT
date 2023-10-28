package Publication;
import java.util.Scanner;

class Publication {
    protected String title;
    protected double price;
    protected int copies;

    Publication(){
        title = "";
        price = 0;
        copies = 0;
    }
    Scanner sc = new Scanner(System.in);

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }


    public void getData(){
        System.out.print("ENTER TITLE : ");
        setTitle(sc.nextLine());
        System.out.print("ENTER PRICE : Rs. ");
        setPrice(sc.nextDouble());
        //----->Validation for price.
        while(price < 0){
            System.out.println("INVALID PRICE");
            System.out.print("ENTER PRICE : Rs. ");
            setPrice(sc.nextDouble());
        }
        System.out.print("ENTER NUMBER OF COPIES : ");
        setCopies(sc.nextInt());
    }

    //----->Overridden display method
    public void displayData(){
        System.out.println("TITLE : "+getTitle());
        System.out.println("PRICE : Rs. "+getPrice());
        System.out.println("NUMBER OF COPIES : "+getCopies());
    }

    //----->Overridden sale copy method
    public void saleCopy(){
        double total = getCopies()*getPrice();
        System.out.println("AMOUNT TO BE PAID : Rs. "+total);
    }
}


