package Inventory;

import Operations.Rentable;

import java.util.ArrayList;
import java.util.List;

public class Motorcycle extends Vehicle {
    private String category;
    private int numberOfHelmets;
    private static List<Motorcycle> availableMotorcycles = new ArrayList<>();
    private static List<Motorcycle> rentedMotorcycles = new ArrayList<>();


    public Motorcycle(String model, double baseRentalCost) {
        super(model, baseRentalCost);
        this.category = category;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public String isAvailableForRental() {
       if(getAvailability())
        return "Available";
       else return "Not Available";
    }

    @Override
    public void rent(Customer customer, int days) {
        if(getAvailability()){
            rentedMotorcycles.add(this);
            setAvailability(false);
            availableMotorcycles.remove(this);
        }
    }

    @Override
    public void cancelRent(Customer customer, int days) {
        rentedMotorcycles.remove(this);
        setAvailability(true);
        availableMotorcycles.add(this);
    }

    public void getRentedMotorcycles() {
        for(Motorcycle motorcycle : rentedMotorcycles) {
            System.out.println(motorcycle);
        }
    }

    public void getAvailableMotorcycles() {
        for(Motorcycle motorcycle : availableMotorcycles) {
            System.out.println(motorcycle);
        }
    }

}
