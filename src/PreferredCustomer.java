public class PreferredCustomer extends BusinessCustomer {
    
    private int cashBackRate;

    public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashBackRate){
        super(firstName, lastName, customerLevel, customerLevel, cashBackRate, totalPurchases);
        this.cashBackRate = cashBackRate;
    }


    public int getCashBackRate() {
        return this.cashBackRate;
    }

    public void setCashBackRate(int cashBackRate) {
        this.cashBackRate = cashBackRate;
    }

    public double incentives(){

    }

    public String toString;
}
