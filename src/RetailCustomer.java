public class RetailCustomer extends Customer {
    
    private double totalPurchases;


    public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases){
        super(firstName, lastName, customerLevel);
        this.totalPurchases = totalPurchases;
    }


    public double getTotalPurchases() {
        return this.totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }
    

    public int findDiscountRate(){

       int discountRate = 0;

        if (totalPurchases > 10000) {
            discountRate = 15;
        } 
        else if (totalPurchases > 5000) {
            discountRate = 10;
        } 
        else if (totalPurchases > 1000) {
            discountRate = 5;
        }

        return discountRate;
    }

    public double incentives(){
        int discountRate = findDiscountRate(); 
        //cast discountRate to double       
        return totalPurchases * ((double)discountRate / 100.0);
    }

    public String toString(){
        return super.toString() + "";
    }
}
