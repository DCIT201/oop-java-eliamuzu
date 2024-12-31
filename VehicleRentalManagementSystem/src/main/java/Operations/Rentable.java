package Operations;

import Inventory.Customer;

//interface with methods to be implemented by vehicles
public interface Rentable {
    void rent(Customer customer, int days);
    void cancelRent(Customer customer, int days);
}
