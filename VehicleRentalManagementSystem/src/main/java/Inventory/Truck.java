package Inventory;

import java.util.List;
import java.util.ArrayList; 

public class Truck extends Vehicle {
    private int loadCapacity = 10;
    private static List <Truck> rentedTrucks = new ArrayList<>();
    private static List<Truck> availableTrucks = new ArrayList<>();

    public Truck(String model, double baseRentalCost) {
        super(model, baseRentalCost);
        this.loadCapacity = loadCapacity;

    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {

        return getBaseRentalRate() * days + loadCapacity *0.2* days;
    }

    @Override
    public String isAvailableForRental() {
        if (getAvailability())
            return "Available";
        else return "Not Available";
    }

    @Override
    public void rent(Customer customer, int days) {
        if(getAvailability()){
            rentedTrucks.add(this);
            setAvailability(false);
            availableTrucks.remove(this);
        }
    }

    @Override
    public void cancelRent(Customer customer, int days) {
        rentedTrucks.remove(this);
        setAvailability(true);
        availableTrucks.add(this);
    }

    public static List<Truck> getRentedTrucks() {
        return rentedTrucks;
        }

    public static List<Truck> getAvailableTrucks() {
        return availableTrucks;
    }

}
