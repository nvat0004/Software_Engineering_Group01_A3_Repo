

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    // Additional attributes specific to Member
    private String dateOfBirth;
    private String gender;
    private String address;
    private double creditBalance;
//    private List<Class> bookedClasses;

    // Constructor
    public Member(String email, String password, String firstName, String lastName, String mobileNumber,
                  String dateOfBirth, String gender, String address, double creditBalance) {
        super(email, password, firstName, lastName, mobileNumber);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.creditBalance = creditBalance;
    }

    // Method to register a new member
    public void register(String email, String password, String firstName, String lastName,
                         String dateOfBirth, String gender, String address) {
        setEmail(email);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
    }


    // Getters and Setters for additional attributes
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public double viewCreditBalance() {
        return creditBalance;
    }

    // Implement abstract methods from User class
    @Override
    public void login() {
        String correctEmail = "member@student.monash.edu";
        String correctPassword = "Monash1234!";

        if (this.getEmail().equals(correctEmail) && this.getPassword().equals(correctPassword)) {
            System.out.println("Member login successful.");
        } else {
            System.out.println("Invalid credentials for Member.");
        }
    }

    @Override
    public void logout() {
        // Implement logout logic here
    }

    @Override
    public void viewProfile() {
        System.out.println("Profile: " + getUserDetails() + ", Date of Birth: " + dateOfBirth + ", Gender: " + gender + ", Address: " + address);
    }

    @Override
    public void loadFile() {
        // Implement file loading logic here
    }
}
