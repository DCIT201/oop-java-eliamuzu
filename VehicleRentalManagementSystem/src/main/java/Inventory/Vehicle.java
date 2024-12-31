package Inventory;

import Operations.Rentable;

public abstract class Vehicle implements Rentable {
    //Private fields
    private int idTracker = 0;
    private static int vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String model, double baseRentalRate) {
        Vehicle.vehicleId = ++idTracker; //our vehicle id is set automatically
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true; // A vehicle added is available by default
    }

    //creating getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    //creating setters
    public void setModel(String model) {
        if (model == null)
            throw new IllegalArgumentException("model is invalid");
        else
            this.model = model;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0)
            throw new IllegalArgumentException("baseRentalRate is invalid");
        else
            this.baseRentalRate = baseRentalRate;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //Abstract methods for rent transactions
    public abstract double calculateRentalCost(int days);

    public abstract String isAvailableForRental();

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + "\n" + " Model: " + model
                + "\n" + " Base Rental Rate: " + baseRentalRate + "per day"
                + "\n" + " Availability: " + (isAvailable ? "Yes" : "No");
    }

    @Override
    public void rent(Customer customer, int days) {
    }

    @Override
    public void cancelRent(Customer customer, int days) {
    }
}

