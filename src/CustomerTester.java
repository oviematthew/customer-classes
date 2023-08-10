
import java.util.ArrayList;
public class CustomerTester {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Customer tester!");
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
        System.out.println("---------------------------------------------------------------------------------------");


        ArrayList<Customer> customerList = new ArrayList<>();

        BusinessCustomer businessCustomer1 = new BusinessCustomer("Ronald", "Bagaporo", "Business",
                                                                  "Home Depot", 10, 3105.50);
        RetailCustomer retailCustomer1 = new RetailCustomer("Vinayak", "Dev", "Retail", 11200.00);
        PreferredCustomer preferredCustomer1 = new PreferredCustomer("Austin", "ONeill", "Preferred",
                                                                     6456.85, 5);
        RetailCustomer retailCustomer2 = new RetailCustomer("Vinay", "De Soni", "Retail", 7890.00);

        customerList.add(businessCustomer1);
        customerList.add(retailCustomer1);
        customerList.add(preferredCustomer1);
        customerList.add(retailCustomer2);

        for (Customer customer : customerList) {
            System.out.println(customer.toString());
            System.out.println("Incentives: $" + customer.incentives());
            System.out.println();
        }
        
    }
}
