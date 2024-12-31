package Inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testGetName() {
        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "555-1234", "123 Main St");
        assertEquals("John Doe", customer.getName());
    }

    @Test
    public void testSetEmail() {
        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "555-1234", "123 Main St");
        customer.setEmail("new.email@example.com");
        assertEquals("new.email@example.com", customer.getEmail());
    }
}