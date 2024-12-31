package Inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RentalAgencyTest {

    @Test
    public void testAddVehicle() {
        RentalAgency agency = new RentalAgency("Best Rentals", "12345", "7");
        Car car = new Car("Toyota Camry", 50.0, true, true);
        agency.addVehicle(car);
        assertTrue(agency.getAvailableVehicles().contains(car));
    }

    @Test
    public void testAddRentalTransaction() {
        RentalAgency agency = new RentalAgency("Best Rentals", "12345", "7");
        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "555-1234", "123 Main St");
        Car car = new Car("Toyota Camry", 50.0, true, true);
        RentalTransactions transaction = new RentalTransactions(customer, car, 3);
        RentalAgency.rentalTransactions.add(transaction);
        assertTrue(agency.getRentalTransactions().contains(transaction));
    }
}