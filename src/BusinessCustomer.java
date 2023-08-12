/**
 * @author Matthew Ovie Enamuotor
 * @since August 2023
 * @version 1.1
 * 
 * This subclass represents a subclass of customer, implements its methods and provides information to be implemented
 */

public class BusinessCustomer extends Customer {
    
    private String companyName;
    private int discountRate;
    private double totalPurchases;

    /**
     * Purpose: Constructs a Customer object with the specified super constructor, Company Name, Discount Rate and Total Purchases.
     * 
     * @param firstname The first name of the business customer
     * @param lastName  The last name of the business customer
     * @param customerLevel The Customer's level
     * @param companyName   Company name 
     * @param discountRate  Discount rate for the customer
     * @param totalPurchases Total Purchases of the customer
     */
    public BusinessCustomer(String firstname, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases ){
        super(firstname, lastName, customerLevel);
        this.companyName = companyName;
        this.discountRate = discountRate;
        this.totalPurchases = totalPurchases;
    }


    /**
     * Purpose: gets the company name of the customer
     * 
     * @return the company name
     */
    public String getCompanyName() {
        return this.companyName;
    }

    
    /** 
     * Purpose: gets the discount rate
     * 
     * @return the discount rate
     */
    public int getDiscountRate() {
        return this.discountRate;
    }

    /**
     * Purpose: gets the total purchases
     * 
     * @return the total purchases
     */
    public double getTotalPurchases() {
        return this.totalPurchases;
    }

    /**
     * Purpose: Set Company Name
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Purpose: Set Discount Rate
     * 
     * @param discountRate
     */
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * Purpose: Set total purchases
     * @param totalPurchases
     */
    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    /**
     * Purpose: Overrides Customer's abstract incentive toString Method
     * 
     */
    public double incentives(){
        return totalPurchases * ((double) discountRate / 100.0);
    }

    /**
     * Purpose: Overrides Customer's toString Method
     * 
     */
    public String toString() {
        double netPurchases = totalPurchases - incentives();
        
        return super.toString() + "\n" + super.getCustomerLevel() + " Customer for " + companyName + 
            String.format("\n%-20s $%,.2f\n", "Total Purchases:", totalPurchases) +
            String.format("%-20s %d%%\n", "Discount Rate:", discountRate) +
            String.format("%-20s $%,.2f\n", "Discount Incentive:", incentives()) +
            String.format("%-20s $%,.2f\n", "Net Purchases:", netPurchases);
    }
    
    
}    
