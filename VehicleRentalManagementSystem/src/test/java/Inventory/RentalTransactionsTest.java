package Inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RentalTransactionsTest {

    @Test
    public void testCalculateRentalCost() {
        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "555-1234", "123 Main St");
        Car car = new Car("Toyota Camry", 50.0, true, true);
        RentalTransactions transaction = new RentalTransactions(customer, car, 3);
        assertEquals(180.0, transaction.getRentalCost()); // 50 * 3 + 10 * 3
    }

    @Test
    public void testGenerateTransactionId() {
        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "555-1234", "123 Main St");
        Car car = new Car("Toyota Camry", 50.0, true, true);
        RentalTransactions transaction = new RentalTransactions(customer, car, 3);
        assertNotNull(RentalTransactions.generateTransactionId());
    }
}