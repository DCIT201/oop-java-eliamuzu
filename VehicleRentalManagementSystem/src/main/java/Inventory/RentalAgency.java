package Inventory;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private String agencyName;
    private String agencyNumber;
    private String rentalDays;
    private List <Vehicle> vehicles;
    private List <RentalTransactions> rentalTransactions;

    public RentalAgency(String agencyName, String agencyNumber, String rentalDays) {
        this.agencyName = agencyName;
        this.agencyNumber = agencyNumber;
        this.rentalDays= rentalDays;
        this.vehicles = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        if(agencyName == null){
            throw new NullPointerException("Agency name cannot be null");
        }
        this.agencyName = agencyName;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(String agencyNumber) {
        if(agencyNumber == null){
            throw new NullPointerException("Agency number cannot be null");
        }
        this.agencyNumber = agencyNumber;
    }

    public String getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(String rentalDays) {
        if(rentalDays == null){
            throw new NullPointerException("Rental days cannot be null");
        }
        this.rentalDays = rentalDays;
    }

    public List<Vehicle> getAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getAvailability()) {
                System.out.println(vehicle);
            }
        };
        return null;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public RentalTransactions rentVehicle(Customer customer,Vehicle vehicle,int days) {
        RentalTransactions transaction = null;
        if (vehicle.getAvailability()) {
            transaction = new RentalTransactions(customer, vehicle, days);
            rentalTransactions.add(transaction);
            vehicle.rent(customer,days);
        }
        System.out.println("Confirmed");
        return transaction;
    }

    public List<RentalTransactions> getRentalTransactions() {
        return rentalTransactions;
    }

}
