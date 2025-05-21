package Assignments;

interface Vehicle {
    void vehicleTypes();
}

class RentalCenter {
    public void centerDetails() {
        System.out.println("Rental Center: Open 8AM to 8PM, Location: City Center");
    }
}

class VehicleRental extends RentalCenter implements Vehicle {
    public void availableVehicles() {
        System.out.println("Available Vehicles: Car, Bike, Truck, Scooter");
    }

    public void vehicleTypes() {
        System.out.println("Vehicle Types: Sedan, SUV, Sports, Electric");
    }
}

class Customer {
    public void customerDetails() {
        System.out.println("Customer Details: Name, Contact, Driving License");
    }
}

class VIPCustomer extends Customer {
    public void vipBenefits() {
        System.out.println("VIP Benefits: Priority Booking, Discounted Rates, Free Upgrades");
    }
}

public class test6 {
    public static void main(String[] args) {
        RentalCenter rc = new RentalCenter();
        VehicleRental vr = new VehicleRental();
        Customer cust = new Customer();
        VIPCustomer vip = new VIPCustomer();

        rc.centerDetails();
        vr.vehicleTypes();
        vr.availableVehicles();
        vr.centerDetails();  // inherited from RentalCenter
        cust.customerDetails();
        vip.customerDetails();  // inherited from Customer
        vip.vipBenefits();
    }
}

