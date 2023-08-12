/**
 * @author Matthew Ovie Enamuotor
 * @since August 2023
 * @version 1.1
 * 
 * This subclass represents a subclass of customer, implements its methods and provides information to be implemented in its subclass
 */


public class RetailCustomer extends Customer {
    
    private double totalPurchases;


    /**
     * Purpose: Constructs a Customer object with the specified super constructor and Total Purchases.
     * 
     * @param firstname The first name of the business customer
     * @param lastName  The last name of the business customer
     * @param customerLevel The Customer's level
     * @param totalPurchases Total Purchases of the customer
     */
    public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases){
        super(firstName, lastName, customerLevel);
        this.totalPurchases = totalPurchases;
    }


    /**
     * Purpose: To get the total purchases
     * 
     * @return the total purchases
     */
    public double getTotalPurchases() {
        return this.totalPurchases;
    }

    
    /**
     * Purpose: To set the total purchases
     * 
     * @param totalPurchases
     */
    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }
    

    /**
     * Purpose: to find the discount rate based on conditional fatcors
     * 
     * @return the discount rate
     */
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


    /**
     * Purpose: Overrides Customer's abstract incentive toString Method
     * 
     */
    public double incentives() {
        int discountRate = findDiscountRate(); 
        double incentives = totalPurchases * ((double) discountRate / 100.0);
        
        // Round total incentives to two decimal places
        double roundedIncentives = Math.round(incentives * 100.0) / 100.0;
        
        return roundedIncentives;
    }
    
    /**
     * Purpose: Overrides Customer's toString Method
     * 
     */
    public String toString() {
        double netPurchases = totalPurchases - incentives();
        
        return super.toString() + "\n" + super.getCustomerLevel() + " Customer" + "\n" +
            String.format("%-20s $%,.2f\n", "Total Purchases:", totalPurchases) +
            String.format("%-20s %d%%\n", "Discount Rate:", findDiscountRate()) +
            String.format("%-20s $%,.2f\n", "Discount Incentive:", incentives()) +
            String.format("%-20s $%,.2f\n", "Net Purchases:", netPurchases);
    }
    
    
}
