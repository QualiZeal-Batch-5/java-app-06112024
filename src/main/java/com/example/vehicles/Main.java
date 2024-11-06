package com.example.vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Volvo", "FH16", 2020, "Diesel", 20.0);
        Vehicle car = new Car("Toyota", "Camry", 2021, "Petrol", 5);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2019, "Petrol", false);

        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Motorcycle Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");

        System.out.println("Truck Distance Traveled with 50 liters: " + truck.calculateDistanceTraveled(50) + " km");
        System.out.println("Car Distance Traveled with 50 liters: " + car.calculateDistanceTraveled(50) + " km");
        System.out.println("Motorcycle Distance Traveled with 50 liters: " + motorcycle.calculateDistanceTraveled(50) + " km");

        System.out.println("Truck Max Speed: " + truck.getMaxSpeed() + " km/h");
        System.out.println("Car Max Speed: " + car.getMaxSpeed() + " km/h");
        System.out.println("Motorcycle Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
    }
}
