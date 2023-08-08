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
        // Calculate the discount rate based on RetailCustomer's total purchases
        double discountRate = findDiscountRate();

        // calling the super since they are same method names
        double retailCustomerIncentives = super.incentives();

        // Calculate the cashback amount based on the total purchases
        double cashbackAmount = retailCustomerIncentives * cashBackRate;

        // Add the cashback amount to the incentives earned by the Retail Customer
        double totalIncentive = retailCustomerIncentives + cashbackAmount;

        return totalIncentive;
    }


}
