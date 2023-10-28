package Publication;

class Book extends Publication{
    private String author;

    private double total_book;

    Book(){
        author = "";
        total_book = 0;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTotal_book(double total_book) {
        this.total_book = total_book;
    }

    public double getTotal_book() {
        return total_book;
    }

    @Override //----->Overriding display method for book class
    public void displayData() {
        super.displayData();
        System.out.println("NAME OF AUTHOR : "+getAuthor());

    }

    //----->Method to take input for book.
    public void orderCopies(){
        super.getData();
        System.out.print("ENTER NAME OF THE AUTHOR : ");
        setAuthor(sc.next());
    }

    @Override //----->Overriding sale copy method for book class
    public void saleCopy() {
        double total = getCopies()*getPrice();
        System.out.println("----->AMOUNT TO BE PAID : RS. "+total);
        setTotal_book(total_book += total);
    }

    //----->Method to display total book sale
    public void totalBookSale(){
        System.out.println("----->TOTAL BOOK SALE : Rs. "+getTotal_book());
    }
}