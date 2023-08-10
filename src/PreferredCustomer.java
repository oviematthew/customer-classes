public class PreferredCustomer extends RetailCustomer {
    
    private int cashBackRate;

    public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases,
            int cashBackRate) {
        super(firstName, lastName, customerLevel, totalPurchases);
        this.cashBackRate = cashBackRate;
    }

    

    public int getCashBackRate() {
        return this.cashBackRate;
    }

    public void setCashBackRate(int cashBackRate) {
        this.cashBackRate = cashBackRate;
    }

   
    public double incentives(){
       

        // calling the super since they are same method names
        double retailCustomerIncentives = super.incentives();

        // Calculate the cashback amount based on the total purchases
        double cashbackAmount = retailCustomerIncentives * cashBackRate;

        // Add the cashback amount to the incentives earned by the Retail Customer
        double totalIncentive = retailCustomerIncentives + cashbackAmount;

        return totalIncentive;
    }

    public String toString() {
        return super.toString() + String.format("\nCashback Rate: %d%%", + cashBackRate);
    }
}
