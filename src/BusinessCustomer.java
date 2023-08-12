public class BusinessCustomer extends Customer {
    
    private String companyName;
    private int discountRate;
    private double totalPurchases;

    public BusinessCustomer(String firstname, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases ){
        super(firstname, lastName, customerLevel);
        this.companyName = companyName;
        this.discountRate = discountRate;
        this.totalPurchases = totalPurchases;
    }


    public String getCompanyName() {
        return this.companyName;
    }

    
    public int getDiscountRate() {
        return this.discountRate;
    }

    public double getTotalPurchases() {
        return this.totalPurchases;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public double incentives(){
        return totalPurchases * ((double) discountRate / 100.0);
    }

    public String toString() {
        double netPurchases = totalPurchases - incentives();

        return super.toString() + "\n" +super.getCustomerLevel() + " Customer for " + companyName + 
        String.format("\nTotal Purchases: $%.2f \nDiscount Rate: %d%% \nDiscount Incentive: $%.2f \nNet Purchases: $%.2f",
        totalPurchases, discountRate, incentives(), netPurchases);
    }
}
