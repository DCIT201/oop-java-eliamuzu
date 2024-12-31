# VEHICLE RENTAL MANAGEMENT SYSTEM

This project is designed to demonstrate the principles of Object-Oriented Programming (OOP) by building a system to manage vehicle renting.

## Features

- **Vehicle Management**: Add, remove, and manage different types of vehicles (e.g., cars, motorcycles).
- **Customer Management**: Add and manage customer information.
- **Rental Transactions**: Handle rental transactions, including renting and returning vehicles.
- **Loyalty Program**: Implement a loyalty program for customers.
- **Availability Tracking**: Track the availability of vehicles for rent.

Strucure of Project and Class

In the Inventory Package :

The abstract Vehicle class
- Base class for all vehicles.
- Contains common attributes like model, base rental rate, and availability status.

The Car Class
- Extends the `Vehicle` class.
- Includes additional attributes like air conditioning and GPS.

Our Motorcycle class
- Extends the `Vehicle` class.
- Includes additional attributes like category and number of helmets.

The Customer class
- Stores customer information such as name, email, phone number, and rental history.

Rental Transactions
- Manages rental transactions, including calculating rental costs and generating transaction IDs.

The CLass Rental Agency
- Manages the overall rental agency, including the list of vehicles and rental transactions.



