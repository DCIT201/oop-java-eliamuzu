package Inventory;

import Operations.BusinessLogic;

public class RentalTransactions implements BusinessLogic {
    private String transactionId;
    private Vehicle vehicle;
    private Customer customer;
    private String dateRented;
    private int rentalDuration;
    private double rentalCost;

    public RentalTransactions(Customer customer, Vehicle vehicle, int rentalDuration) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        if (rentalDuration <= 0) {
            throw new IllegalArgumentException("Rental duration must be greater than zero");
        }

        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDuration = rentalDuration;
        this.rentalCost = calculateRentalCost();
        this.transactionId = generateTransactionId(); // using the method to generate a unique transaction ID
    }

    private double calculateRentalCost() {
        return vehicle.calculateRentalCost(rentalDuration);
    }

    public static String generateTransactionId() {
       int tn = 0;
        return "TXN" + ++tn;  
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Enter a valid vehicle");
        }
        this.vehicle = vehicle;
    }

    public String getDateRented() {
        return dateRented;
    }

    public void setDateRented(String dateRented) {
        if (dateRented == null) {
            throw new IllegalArgumentException("Enter a valid dateRented");
        }
        this.dateRented = dateRented;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        if (rentalDuration <= 0) {
            throw new IllegalArgumentException("Enter a valid rentalDuration");
        }
        this.rentalDuration = rentalDuration;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    @Override
    public String toString() {
        return "Vehicle rented: " + getVehicle() + "\n"
                + "DateRented: " + getDateRented() + "\n"
                + "RentalDuration: " + getRentalDuration() + "\n"
                + "RentalCost: " + getRentalCost() + "\n";
    }

    private double totalRevenue = 0;
    private double totalExpenses;

    @Override
    public double calculateProfit() {
        totalRevenue += getRentalCost();
        return totalRevenue - totalExpenses;
    }
}
