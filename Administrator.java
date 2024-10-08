

public class Administrator extends User {
    // Attribute specific to Administrator
    private String adminID;

    // Constructor
    public Administrator(String email, String password, String firstName, String lastName, String mobileNumber, String adminID) {
        super(email, password, firstName, lastName, mobileNumber);
        this.adminID = adminID;
    }

    // Method to add credits to a member's account
    public void addCredits(Member member, int amount) {
        member.setCreditBalance(member.getCreditBalance() + amount);
        // Logic to reflect the credit addition (e.g., update in a database)
    }


    // Getters and Setters for adminID
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    // Implement abstract methods from User class
    @Override
    public void login() {
        // Implement administrator login logic here
    }

    @Override
    public void logout() {
        // Implement administrator logout logic here
    }

    @Override
    public void viewProfile() {
        System.out.println("Administrator Profile: " + getUserDetails() + ", Admin ID: " + adminID);
    }

    @Override
    public void loadFile() {
        // Implement file loading logic specific to the administrator
    }
}
