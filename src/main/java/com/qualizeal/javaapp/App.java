package com.qualizeal.javaapp;


public class App {
	
    public static void main(String[] args) {
    	
    	Truck myTruck = new Truck("BMW", "I-7", 2023, "Full Electric", 11.4);
    	
        Car myCar = new Car("Toyota", "Camry", 2021, "Gasoline", 4);
        
        MotorCycle myMotorCycle = new MotorCycle("Harley-Davidson", "Street 750", 2020, "Gasoline", false);
                
        System.out.println("Truck Fuel Efficiency: " + myTruck.calculateFuelEfficiency() + " MPG");
        
        System.out.println("Distance Traveled: " + myTruck.calculateDistanceTraveled(10) + " miles");
        
        System.out.println("Max Speed: " + myTruck.getMaxSpeed() + " MPH");

        System.out.println("\nCar Fuel Efficiency: " + myCar.calculateFuelEfficiency() + " MPG");
        
        System.out.println("Distance Traveled: " + myCar.calculateDistanceTraveled(10) + " miles");
        
        System.out.println("Max Speed: " + myCar.getMaxSpeed() + " MPH");

        System.out.println("\nMotorCycle Fuel Efficiency: " + myMotorCycle.calculateFuelEfficiency() + " MPG");
        
        System.out.println("Distance Traveled: " + myMotorCycle.calculateDistanceTraveled(10) + " miles");
        
        System.out.println("Max Speed: " + myMotorCycle.getMaxSpeed() + " MPH");

        

    	
    	/*Employee emp = new Employee(50000);
    	
        emp.work();
        
        System.out.println("Employee Salary is : " + emp.getSalary());

        HRManager hrManager = new HRManager(70000);
        
        hrManager.work();
        
        hrManager.addEmployee("John Doe");
        
        System.out.println("HR Manager Salary is : " + hrManager.getSalary()); */
        
        
    	
    	/* Circle myCircle = new Circle(5.0); 
    	
        System.out.println("Radius of the circle: " + myCircle.radius);
        
        System.out.println("Perimeter of the Circle: " + myCircle.getPerimeter());
        
        System.out.println("Area of the Circle: " + myCircle.getArea()); */
        
        
        
       /*Animal myAnimal = new Animal();
        myAnimal.makeSound(); 

        Cat myCat = new Cat();
        myCat.makeSound();  */
    }
}