package Inventory;
import java.util.Scanner;

public class RunSystem {
    public static void main(String[] args) {
        System.out.println("Hello There! Welcome to the Vehicle Rental Management System!" + "\n");
        System.out.println("Let's get started personalizing your system" + "\n" +
                "Kindly follow the instructions below to set your details");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the Rental Agency");
        String agencyName = input.nextLine();
        System.out.println("Please enter the number of the Rental Agency");
        String agencyNumber = input.nextLine();
        System.out.println("Please enter your working days");
        String workingDays = input.nextLine();

        RentalAgency agency = new RentalAgency(agencyName, agencyNumber, workingDays);

        System.out.println("These are some of the primary operations the system has: " + "\n");
        System.out.println(" 1. Register customer" + "\n"
        + "2.  agency.addVehicle()" + "\n"
        + "3. agency.getAvailableVehicles()" + "\n"
        + "4. agency.getRentalTransactions()" + "\n"
        + "5.agency.removeVehicle()" + "\n");



    }
}
