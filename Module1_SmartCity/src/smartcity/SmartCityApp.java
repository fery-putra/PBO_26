package smartcity;

import java.util.Scanner;

/**
 * MODULE 1: Smart City Management System - Foundation

 * This program demonstrates:
 * - Class and Object creation
 * - Methods (with and without parameters/return values)
 * - Input/Output operations
 * - Data types (int, double, String, boolean)
 * - Conditional statements (if-else)
 * - Switch-case statements
 * - Loops (for, while, do-while)
 */

// Class definition for Building
class Building {
    // Attributes (instance variables) - different data types
    String name;           // String data type
    String type;           // String data type
    int floors;            // int data type
    double area;           // double data type
    boolean isOperational; // boolean data type
    int capacity;          // int data type

    // Method to display building information
    void displayInfo() {
        System.out.println("\n=== Building Information ===");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Floors: " + floors);
        System.out.println("Area: " + area + " sq meters");
        System.out.println("Status: " + (isOperational ? "Operational" : "Under Maintenance"));
        System.out.println("Capacity: " + capacity + " people");
    }

    // Method with parameters - calculate building efficiency
    void calculateEfficiency(int currentOccupancy) {
        // Conditional statement (if-else)
        if (currentOccupancy > capacity) {
            System.out.println("WARNING: Building is overcrowded!");
        } else if (currentOccupancy == 0) {
            System.out.println("Building is empty.");
        } else {
            double efficiency = (currentOccupancy * 100.0) / capacity;
            System.out.println("Building Efficiency: " + efficiency + "%");
        }
    }

    // Method with return value - calculate total area
    double calculateTotalArea() {
        return area * floors;
    }

    // Method to perform maintenance check based on building type
    void performMaintenance() {
        System.out.println("\n=== Maintenance Check for " + name + " ===");

        // Switch-case statement
        switch (type.toLowerCase()) {
            case "hospital":
                System.out.println("- Checking medical equipment");
                System.out.println("- Sanitizing all areas");
                System.out.println("- Testing emergency systems");
                break;
            case "school":
                System.out.println("- Inspecting classrooms");
                System.out.println("- Checking educational equipment");
                System.out.println("- Testing fire safety systems");
                break;
            case "office":
                System.out.println("- Checking HVAC systems");
                System.out.println("- Testing network infrastructure");
                System.out.println("- Inspecting elevators");
                break;
            case "park":
                System.out.println("- Maintaining green spaces");
                System.out.println("- Checking playground equipment");
                System.out.println("- Cleaning pathways");
                break;
            default:
                System.out.println("- General building inspection");
                System.out.println("- Checking basic utilities");
                break;
        }
        System.out.println("Maintenance completed!");
    }
}

// Main application class
public class SmartCityApp {

    // Method to display Menu
    static void displayMenu() {
        System.out.println("\n====== SMART CITY MANAGEMENT SYSTEM ======");
        System.out.println("1. Add New Building");
        System.out.println("2. Display All Buildings");
        System.out.println("3. Check Building Efficiency");
        System.out.println("4. Perform Maintenance");
        System.out.println("5. Calculate City Statistics");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to create a building from user input
    static Building createBuilding(Scanner scanner) {
        Building building = new Building(); // Creating Object

        System.out.print("\nEnter building name: ");
        building.name = scanner.nextLine();

        System.out.print("Enter building type (Hospital/School/Office/Park): ");
        building.type = scanner.nextLine();

        System.out.print("Enter number of floors: ");
        building.floors = scanner.nextInt();

        System.out.print("Enter area per floor (sq meters): ");
        building.area = scanner.nextDouble();

        System.out.print("Enter capacity (number of people): ");
        building.capacity = scanner.nextInt();

        System.out.print("Is building operational? (true/false): ");
        building.isOperational = scanner.nextBoolean();

        scanner.nextLine(); // Consume newline

        System.out.println("\nBuilding added successfully!");
        return building;
    }

    // Method to display all buildings using Loop
    static void displayAllBuildings(Building[] buildings, int count) {
        // Conditional check
        if (count == 0) {
            System.out.println("\nNo buildings in the city yet!");
            return;
        }

        System.out.println("\n====== ALL BUILDINGS IN SMART CITY ======");

        // For loop to iterate through buildings
        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Building " + (i + 1) + " ---");
            buildings[i].displayInfo();
        }
    }

    // Method to calculate city statistics using loops
    static void calculateCityStats(Building[] buildings, int count) {
        // Conditional check
        if (count == 0) {
            System.out.println("\nNo buildings to calculate statistics!");
            return;
        }

        int totalFloors = 0;
        double totalArea = 0;
        int operationalCount = 0;

        // While loop to calculate totals
        int index = 0;
        while (index < count) {
            totalFloors += buildings[index].floors;
            totalArea += buildings[index].calculateTotalArea();

            // Conditional statement
            if (buildings[index].isOperational) {
                operationalCount++;
            }
            index++;
        }

        System.out.println("\n====== CITY STATISTICS ======");
        System.out.println("Total Buildings: " + count);
        System.out.println("Total Floors: " + totalFloors);
        System.out.println("Total Area: " + totalArea + " sq meters");
        System.out.println("Operational Buildings: " + operationalCount);
        System.out.println("Under Maintenance: " + (count - operationalCount));

        // Calculate average using do-while for demonstration
        double averageArea = 0;
        int i = 0;
        do {
            averageArea += buildings[i].calculateTotalArea();
            i++;
        } while (i < count);
        averageArea /= count;

        System.out.println("Average Building Area: " + averageArea + " sq meters");
    }

    // Main method - program entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store buildings (max 10 for this module)
        Building[] buildings = new Building[10];
        int buildingCount = 0;

        boolean running = true;

        // Main program loop
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Switch-case for menu selection
            switch (choice) {
                case 1:
                    // Conditional check for array capacity
                    if (buildingCount < 10) {
                        buildings[buildingCount] = createBuilding(scanner);
                        buildingCount++;
                    } else {
                        System.out.println("\nCity is full! Cannot add more buildings.");
                    }
                    break;

                case 2:
                    displayAllBuildings(buildings, buildingCount);
                    break;

                case 3:
                    if (buildingCount == 0) {
                        System.out.println("\nNo buildings available!");
                    } else {
                        System.out.print("\nEnter building number (1-" + buildingCount + "): ");
                        int buildingNum = scanner.nextInt();

                        // Conditional validation
                        if (buildingNum > 0 && buildingNum <= buildingCount) {
                            System.out.print("Enter current occupancy: ");
                            int occupancy = scanner.nextInt();
                            buildings[buildingNum - 1].calculateEfficiency(occupancy);
                        } else {
                            System.out.println("Invalid building number!");
                        }
                    }
                    break;

                case 4:
                    if (buildingCount == 0) {
                        System.out.println("\nNo buildings available!");
                    } else {
                        System.out.print("\nEnter building number (1-" + buildingCount + "): ");
                        int buildingNum = scanner.nextInt();

                        // Conditional validation
                        if (buildingNum > 0 && buildingNum <= buildingCount) {
                            buildings[buildingNum - 1].performMaintenance();
                        } else {
                            System.out.println("Invalid building number!");
                        }
                    }
                    break;

                case 5:
                    calculateCityStats(buildings, buildingCount);
                    break;

                case 6:
                    System.out.println("\nThank you for using Smart City Management System!");
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}