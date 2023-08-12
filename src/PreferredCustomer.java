/**
 * @author Matthew Ovie Enamuotor
 * @since August 2023
 * @version 1.1
 * 
 * This subclass represents a subclass of RetailCustomer, implements its methods and provides information to be implemented in its subclass
 */

public class PreferredCustomer extends RetailCustomer {
    
    private int cashBackRate;

    
    /**
     * Purpose: Constructs a Retail Customer object with the specified super constructor and CashbackRate.
     * 
     * @param firstName
     * @param lastName  The last name of the preferred customer
     * @param customerLevel The Retail Customer's level
     * @param totalPurchases Total purchases of the customer
     * @param cashBackRate The cash back rate
     */
    public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashBackRate) {
        super(firstName, lastName, customerLevel, totalPurchases);
        this.cashBackRate = cashBackRate;
    }

    

    /**
     * Gets the cash back rate
     * 
     * @return the cashback rate
     */
    public int getCashBackRate() {
        return this.cashBackRate;
    }

    /**
     * Sets the cashback rate
     * 
     * @param cashBackRate
     */
    public void setCashBackRate(int cashBackRate) {
        this.cashBackRate = cashBackRate;
    }

    /**
     * Purpose: Overrides Retail Customer's abstract incentive toString Method
     * 
     */
    public double incentives() {
        double cashbackIncentive = super.incentives() * ((double) cashBackRate / 100.0);
        double totalIncentive = super.incentives() + cashbackIncentive;
    
        // Round the total incentive to two decimal places
        totalIncentive = Math.round(totalIncentive * 100.0) / 100.0;
    
        return totalIncentive;
    }
    
    /**
     * Purpose: Overrides Retail Customer's toString Method
     * 
     */
    public String toString() {
        return super.toString() + String.format("%-20s %d%%", "Cashback Rate:", cashBackRate);
    }
    
}
