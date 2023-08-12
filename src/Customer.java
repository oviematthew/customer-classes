public abstract class Customer {
    
    private String firstName;
    private String lastName;
    private String customerID;
    private String customerLevel;



    public Customer(String firstName, String lastName, String customerLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerLevel = customerLevel;
        setCustomerID();
       
    };


    public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public abstract double incentives();

    public String toString() {
        return customerID + ", " + firstName +" " + lastName;
    }
    
    
}
