package Inventory;

public class RentalTransactions {
    private String transactionId;
    private Vehicle vehicle;
    private Customer customer;
    private String dateRented;
    private int rentalDuration;
    private double rentalCost;

    public RentalTransactions(Customer customer, Vehicle vehicle, int rentalDuration) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDuration = rentalDuration;
        this.rentalCost = getRentalCost();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        if(vehicle == null) {
            throw new IllegalArgumentException("Enter a valid vehicle");
        }
        this.vehicle = vehicle;
    }

    public String getDateRented() {
        return dateRented;
    }

    public void setDateRented(String dateRented) {
        if(dateRented == null) {
            throw new IllegalArgumentException("Enter a valid dateRented");
        }
        this.dateRented = dateRented;
    }
    public int getRentalDuration() {
        return rentalDuration;
    }
    public void setRentalDuration(int rentalDuration) {
        if(rentalDuration <= 0) {
            throw new IllegalArgumentException("Enter a valid rentalDuration");
        }
        this.rentalDuration = rentalDuration;
    }

    public double getRentalCost() {
        return vehicle.calculateRentalCost(rentalDuration);
    }


    @Override
    public String toString() {
        return "Vehicle rented: " + getVehicle() +"\n"
                + "DateRented: " + getDateRented() + "\n"
                + "RentalDuration: " + getRentalDuration() + "\n"
                + "RentalCost: " + getRentalCost() + "\n";
    }
}


