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
        String lastNamePart = lastName.toUpperCase();
        
        // Pad the last name with 'X' if it's less than 4 characters
        if (lastNamePart.length() < 4) {
            int paddingLength = 4 - lastNamePart.length();
            for (int i = 0; i < paddingLength; i++) {
                lastNamePart += 'X';
            }
        } else {
            lastNamePart = lastNamePart.substring(0, 4);
        }

        // Generate 5 random digits between 0-9
        String randomDigits = "";
        for (int i = 0; i < 5; i++) {
            int randomDigit = (int) (Math.random() * 10);
            randomDigits += randomDigit;
        }

        // Combine the parts to form the customer ID
        customerID = lastNamePart + "-" + randomDigits;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public abstract double incentives();

    public String toString() {
        return String.format("Customer ID: %s\nName: %s %s\nLevel: %s", customerID, firstName, lastName, customerLevel);
    }

    
}
