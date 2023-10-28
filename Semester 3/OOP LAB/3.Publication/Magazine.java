package Publication;

class Magazine extends Publication {
    private int orderQty;
    private String currentIssue;
    private double total_mag;

    Magazine(){
        orderQty = 0;
        currentIssue = "";
        total_mag = 0;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setCurrentIssue(String currentIssue) {
        this.currentIssue = currentIssue;
    }

    public String getCurrentIssue() {
        return currentIssue;
    }

    public double getTotal_mag() {
        return total_mag;
    }

    public void setTotal_mag(double total_mag) {
        this.total_mag = total_mag;
    }

    //----->Method to take input for magazine.
    public void recieveIssue(){
        super.getData();
        setOrderQty(getCopies());
        System.out.print("ENTER CURRENT ISSUE : ");
        sc.nextLine();
        setCurrentIssue(sc.nextLine());
    }

     //----->Overriding display method for magazine class
    public void displayData() {
        super.displayData();
        System.out.println("CURRENT ISSUE : "+getCurrentIssue());
    }

     //----->Overriding sale copy method for magazine class
    public void saleCopy() {
        double total = getCopies()*getPrice();
        System.out.println("----->AMOUNT TO BE PAID : Rs. "+total);
        setTotal_mag(total_mag += total);

    }

    //----->Method to display total magazine sale
    public void totalMagSale(){
        System.out.println("------>TOTAL MAGAZINE SALE : Rs. "+getTotal_mag());
    }
}