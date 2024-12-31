package Inventory;

import Operations.Rentable;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private boolean hasAirCondition;
    private boolean hasGps;
    private static List<Car>rentedCars = new ArrayList<>(); //list to store cars that are rented at a particular point in time
    private static List<Car> availableCars = new ArrayList<>(); //list to do same for available cars

    public Car(String model, double baseRentalRate, boolean hasAirCondition, boolean hasGps) {
        super(model, baseRentalRate);
        this.hasAirCondition = hasAirCondition;
        this.hasGps = hasGps;
        availableCars.add(this);
    }

    public boolean checkHasAirCondition() {
        return hasAirCondition;
    }

    public void setHasAirCondition(boolean hasAirCondition) {
        this.hasAirCondition = hasAirCondition;
    }

    @Override
    public double calculateRentalCost(int days) {
        double totalCost = getBaseRentalRate() * days;
        if(hasAirCondition){
            totalCost += 10 * days;
        }
            return totalCost;
    }

    @Override
    public String isAvailableForRental() {
        if(getAvailability())
            return "This car is available";
        else return "This car is not available";
    }

    //implementation of methods from Rentable interface
    @Override
    public void rent(Customer customer, int days) {
       if(getAvailability()){
           rentedCars.add(this);
           setAvailability(false);
           availableCars.remove(this);
       }
    }

    @Override
    public void cancelRent(Customer customer, int days) {
        rentedCars.remove(this);
        setAvailability(true);
        availableCars.add(this);
    }

    public void getRentedCars() {
        for(Car car : rentedCars){
            System.out.println(car);
        }
    }

    public void getAvailableCars() {
        for(Car car : availableCars){
            System.out.println(car);
        }
    }


}
