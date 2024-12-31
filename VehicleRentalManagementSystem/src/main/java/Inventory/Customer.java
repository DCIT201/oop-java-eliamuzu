package Inventory;

import Operations.LoyaltyProgramme;

import java.util.ArrayList;
import java.util.List;

public class Customer implements LoyaltyProgramme {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private static int count = 0;
    private List<RentalTransactions> rentalHistory;

    public Customer(String firstName, String lastName, String email, String phoneNumber, String address) {
        this.customerId = "Cust" + ++count;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return firstName +" " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<RentalTransactions> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalRecord(RentalTransactions r) {
        rentalHistory.add(r);
    }

    @Override
    public void eligibleForLoyaltyProgramme() {
        if(rentalHistory.size() > 3){
            System.out.println("Yay! you get a 10% discount on your next rental");
        }
    }


}

