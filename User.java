

public abstract class User {
    // Attributes
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    // Constructor
    public User(String email, String password, String firstName, String lastName, String mobileNumber) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    // Abstract Methods
    public abstract void login();
    public abstract void logout();
    public abstract void viewProfile();
    public abstract void loadFile();

    // Concrete Methods for setting and getting attributes
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Method to get full user details
    public String getUserDetails() {
        return "Name: " + firstName + " " + lastName + ", Mobile: " + mobileNumber + ", Email: " + email;
    }

    // Method to update multiple user details at once
    public void setUserDetails(String firstName, String lastName, String mobileNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    // Profile edit functionality
    public void editProfile(String firstName, String lastName, String mobileNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setMobileNumber(mobileNumber);
    }
}
