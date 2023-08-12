/**
 * @author Matthew Ovie Enamuotor
 * @since August 2023
 * @version 1.1
 * 
 * This abstract Superclass represents a customer and provides basic customer information and behaviors Subclasses must implement
 */

public abstract class Customer implements Comparable<Customer>{
    
    private String firstName;
    private String lastName;
    private String customerID;
    private String customerLevel;


    /**
     * Purpose: Constructs a Customer object with the specified first name, last name, and customer level.
     *
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     * @param customerLevel The customer's level or category.
     */
    public Customer(String firstName, String lastName, String customerLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerLevel = customerLevel;
        setCustomerID();
       
    };


    /**
     * Purpose: Gets the first name of the customer.
     *
     * @return The first name of the customer.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Purpose: Gets the last name of the customer.
     *
     * @return The last name of the customer.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Purpose: Gets the customer ID.
     *
     * @return The customer ID.
     */
    public String getCustomerID() {
        return customerID;
    }


    /**
     * Purpose: Gets the customer level.
     *
     * @return The customer level.
     */
    public String getCustomerLevel() {
        return customerLevel;
    }

    /**
     * Purpose: Sets the first name of the customer.
     *
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Purpose: Sets the last name of the customer.
     *
     * @param lastName The new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Purpose: creates a custom customer Id based on customer last name
     */
    private void setCustomerID() {

        // First start by removing any spaces in the last name
        String lastNameNoSpace = lastName.replace(" ", "");

        // Then remove those with apostrophes
        String lastNameNoApos = lastNameNoSpace.replace("'", "");

        // convert last name to uppercase
        String finalLastName = lastNameNoApos.toUpperCase();
        

        // If lastname is less than 4 assign x for outstanding remaining parts if not, just take 4 out of it
        if (finalLastName.length() < 4) {

            int additionalLetters = 4 - finalLastName.length();
            for (int i = 0; i < additionalLetters; i++) {
                finalLastName += 'X';
            }
        } else {
            finalLastName = finalLastName.substring(0, 4);
        }

        // Generate 5 random digits between 0-9
        String randomDigits = "";
        for (int i = 0; i < 5; i++) {
            int randomDigit = (int) (Math.random() * 10);
            randomDigits += randomDigit;
        }


        // Combine the parts plus - to form the customer ID
        customerID = finalLastName + "-" + randomDigits;
    }

    /**
     * Purpose: To set the customer level
     * @param customerLevel
     */
    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    /**
     * Purpose: Declaring an abstract incentive method to be overriden by subclasses
     * @return
     */
    public abstract double incentives();


    /*
     * 
     * Purpose: CompareTo method to use for last name sorting
     */
    public int compareTo(Customer p)
    {
         if(this.lastName.compareTo(p.lastName) > 0)
            return 1;
        else if(this.lastName.compareTo(p.lastName) < 0)
            return -1;
        else
            return 0; 

    }

    /**
     * Purpose: Overrides Object's toString Method
     * 
     */
    public String toString() {
        return customerID + ", " + firstName +" " + lastName;
    }
    
    
}
