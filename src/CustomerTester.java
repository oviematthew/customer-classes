
import java.util.ArrayList;
public class CustomerTester {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Customer tester!");
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
        System.out.println("---------------------------------------------------------------------------------------");

        // Create an ArrayList object of type Customer named customerList and size it to hold four customers.
        ArrayList<Customer> customerList = new ArrayList<>();

        // Create four Customer objects. Do not use superclass reference variables to create the four objects
        BusinessCustomer businessCustomer1 = new BusinessCustomer("Ronald", "Bagaporo", "Business","Home Depot", 10, 3105.50);
        RetailCustomer retailCustomer1 = new RetailCustomer("Vinayak", "Dev", "Retail", 11200.00);
        PreferredCustomer preferredCustomer1 = new PreferredCustomer("Austin", "O'Neill", "Preferred", 6456.85, 5);
        RetailCustomer retailCustomer2 = new RetailCustomer("Vinay", "De Soni", "Retail", 7890.00);

        // Adding the four objects to the arraylist
        customerList.add(businessCustomer1);
        customerList.add(retailCustomer1);
        customerList.add(preferredCustomer1);
        customerList.add(retailCustomer2);

        // Using a loop, print each object in the array calling the toString() method
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
            System.out.println();
        }

        //Use another loop that will print each customer’s full name and the incentives he/she is entitled to.
        for (Customer customer : customerList) {
            System.out.println(customer.getFirstName() + " " +customer.getLastName() + " " + "earns a discount incentive of $" + customer.incentives());
        }

        System.out.println();
        //Create five more Customer objects
        BusinessCustomer businessCustomer2 = new BusinessCustomer("Bhavesh", "Savaliya", "Business","Starbucks", 15, 9875.25);
        RetailCustomer retailCustomer3 = new RetailCustomer("Daimaio", "Chen", "Retail", 3100.50);
        RetailCustomer retailCustomer4 = new RetailCustomer("Vivian", "Viana-Bresolin", "Retail", 6780.00);
        PreferredCustomer preferredCustomer2 = new PreferredCustomer("Ashish", "Sharma", "Preferred", 10450.00, 10);
        PreferredCustomer preferredCustomer3 = new PreferredCustomer("Kristina", "Papko", "Preferred", 5750.00, 12);

        // Print each new Customer object calling the toString() method.
        System.out.println(businessCustomer2.toString());
        System.out.println();
        System.out.println(retailCustomer3.toString());
        System.out.println();
        System.out.println(retailCustomer4.toString());
        System.out.println();
        System.out.println(preferredCustomer2.toString());
        System.out.println();
        System.out.println(preferredCustomer3.toString());
        
        

        // Add each new Customer object to the Customer list.
        customerList.add(businessCustomer2);
        customerList.add(retailCustomer3);
        customerList.add(retailCustomer4);
        customerList.add(preferredCustomer2);
        customerList.add(preferredCustomer3);


        // Make Changes Using Setter Methods

    }
}
