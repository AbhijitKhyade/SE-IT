package CaseStudy;

class Customer {
    private String customerName;   //declaration of customerName
    private int customerAge;   //declaration of customerAge
    public void setCustomerName(String customerName){
        this.customerName = customerName;  //setting value of customerName
    }

    public String getCustomerName(){
        return customerName;   //returning value of customerName
    }

    public void setCustomerAge(int customerAge){
        this.customerAge = customerAge; //setting value of customerAge
    }

    public int getCustomerAge(){
        return customerAge;  //returning value of customerAge
    }
}