public class PreferredCustomer extends RetailCustomer {
    
    private int cashBackRate;

    public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashBackRate) {
        super(firstName, lastName, customerLevel, totalPurchases);
        this.cashBackRate = cashBackRate;
    }

    

    public int getCashBackRate() {
        return this.cashBackRate;
    }

    public void setCashBackRate(int cashBackRate) {
        this.cashBackRate = cashBackRate;
    }

   
    public double incentives() {
        double cashbackIncentive = super.incentives() * ((double) cashBackRate / 100.0);
        double totalIncentive = super.incentives() + cashbackIncentive;
    
        // Round the total incentive to two decimal places
        totalIncentive = Math.round(totalIncentive * 100.0) / 100.0;
    
        return totalIncentive;
    }
    

    public String toString() {
        double netPurchases = super.getTotalPurchases() - incentives();
    
        return super.toString() + String.format("\nCashback Rate: %d%%\nNet Purchases: $%.2f", cashBackRate, netPurchases);
    }
}
