# MODULE 1: Foundation - Basic Object-Oriented Programming

## Table of Contents
1. [Class and Object](#1-class-and-object)
2. [Attributes](#2-attributes)
3. [Methods](#3-methods)
4. [Data Types](#4-data-types)
5. [Conditional Statements](#5-conditional-statements)
6. [Switch-Case](#6-switch-case)
7. [Loops](#7-loops)
8. [Input/Output](#8-input-output)

---

## 1. CLASS and OBJECT

### Concept
A **class** is a blueprint or template for creating objects. An **object** is an instance of a class with actual data.

### In the Code
```java
// Class definition - blueprint for Building
class Building {
    String name;           // Attributes
    String type;
    int floors;
    // ... methods
}

// Creating objects (instances)
Building hospital = new Building();  // Object 1
Building school = new Building();    // Object 2
```

### Real-World Analogy
- **Class** = House blueprint
- **Object** = Actual houses built from the blueprint
- Each house (object) has its own color, size, etc. (attributes)

### Key Points
- A class is a template
- An object is a concrete instance
- You can create multiple objects from one class
- Each object has its own data

---

## 2. ATTRIBUTES (Instance Variables)

### Concept
Attributes are variables that belong to an object. Each object has its own copy.

### In the Code
```java
class Building {
    String name;           // Each building has its own name
    int floors;            // Each building has its own floor count
    double area;           // Each building has its own area
    boolean isOperational; // Each building has its own status
}
```

### Example
```java
Building hospital = new Building();
hospital.name = "City Hospital";
hospital.floors = 5;

Building school = new Building();
school.name = "Primary School";
school.floors = 3;
// hospital and school have different values for the same attributes
```

### Key Points
- Attributes define the state/properties of an object
- Each object has its own copy of attributes
- Attributes can be different data types

---

## 3. METHODS

### Concept
Methods are functions that belong to a class. They define what objects can do.

### Types of Methods

#### a) Method without parameters and return value
```java
void displayInfo() {
    System.out.println("Name: " + name);
}
```

#### b) Method with parameters
```java
void calculateEfficiency(int currentOccupancy) {
    // Uses the parameter to calculate something
    double efficiency = (currentOccupancy * 100.0) / capacity;
}
```

#### c) Method with return value
```java
double calculateTotalArea() {
    return area * floors;  // Returns a value
}
```

### When to use what
- **No parameters + no return**: Just performing an action (like printing)
- **Parameters + no return**: Performing an action with input data
- **Parameters + return**: Calculating and giving back a result

### Key Points
- Methods define behavior/actions
- Can accept input (parameters)
- Can return output (return value)
- Called using dot notation: `object.methodName()`

---

## 4. DATA TYPES

### In the Code
```java
String name;           // String - text data
int floors;            // int - whole numbers
double area;           // double - decimal numbers
boolean isOperational; // boolean - true/false
```

### Why different types?
- `int`: When you need whole numbers (floors can't be 2.5)
- `double`: When you need decimals (area can be 150.75 sq meters)
- `boolean`: When you need yes/no, true/false
- `String`: When you need text

### Primitive vs Reference Types
**Primitive Types:**
- `int`, `double`, `boolean`, `char`, `byte`, `short`, `long`, `float`
- Store actual values
- Lowercase names

**Reference Types:**
- `String`, `Building`, Arrays, etc.
- Store reference to object
- Uppercase names (by convention)

---

## 5. CONDITIONAL STATEMENTS (if-else)

### Concept
Make decisions in your code based on conditions.

### In the Code
```java
void calculateEfficiency(int currentOccupancy) {
    if (currentOccupancy > capacity) {
        System.out.println("WARNING: Building is overcrowded!");
    } else if (currentOccupancy == 0) {
        System.out.println("Building is empty.");
    } else {
        double efficiency = (currentOccupancy * 100.0) / capacity;
        System.out.println("Building Efficiency: " + efficiency + "%");
    }
}
```

### Flow Diagram
```
Start
  ↓
Is occupancy > capacity? → YES → Print warning → END
  ↓ NO
Is occupancy == 0? → YES → Print "empty" → END
  ↓ NO
Calculate efficiency → Print efficiency → END
```

### Comparison Operators
- `==` equals
- `!=` not equals
- `>` greater than
- `<` less than
- `>=` greater than or equal
- `<=` less than or equal

### Logical Operators
- `&&` AND (both conditions must be true)
- `||` OR (at least one condition must be true)
- `!` NOT (negates condition)

---

## 6. SWITCH-CASE

### Concept
Choose one option from multiple possibilities. Cleaner than many if-else statements.

### In the Code
```java
void performMaintenance() {
    switch (type.toLowerCase()) {
        case "hospital":
            System.out.println("- Checking medical equipment");
            System.out.println("- Sanitizing all areas");
            break;  // Important! Stops execution
        case "school":
            System.out.println("- Inspecting classrooms");
            break;
        case "office":
            System.out.println("- Checking HVAC systems");
            break;
        default:  // If no case matches
            System.out.println("- General building inspection");
            break;
    }
}
```

### Key Points
- Each `case` is one possible value
- `break` prevents fall-through to next case
- `default` is executed if nothing matches
- More readable than multiple if-else for same variable

### When to Use
- **Switch**: Checking one variable against multiple values
- **If-else**: Complex conditions, ranges, multiple variables

---

## 7. LOOPS

### Concept
Repeat code multiple times.

### a) FOR LOOP
**Use when:** You know how many times to repeat

```java
for (int i = 0; i < count; i++) {
    System.out.println("\n--- Building " + (i + 1) + " ---");
    buildings[i].displayInfo();
}
```

**How it works:**
1. `int i = 0` - Initialize (start at 0)
2. `i < count` - Condition (continue while true)
3. `i++` - Increment (add 1 after each iteration)

**Example:** If count = 3:
```
i = 0: Display Building 1
i = 1: Display Building 2
i = 2: Display Building 3
i = 3: Stop (not < 3)
```

### b) WHILE LOOP
**Use when:** You don't know how many times, but have a condition

```java
int index = 0;
while (index < count) {
    totalFloors += buildings[index].floors;
    index++;
}
```

**How it works:**
1. Check condition before each iteration
2. If true → execute body
3. If false → exit loop

### c) DO-WHILE LOOP
**Use when:** Must execute at least once

```java
double averageArea = 0;
int i = 0;
do {
    averageArea += buildings[i].calculateTotalArea();
    i++;
} while (i < count);
```

**Difference from while:**
- `while`: Check → Execute
- `do-while`: Execute → Check (guarantees at least one execution)

### Comparison Table
| Loop Type | When to Use | Checks Condition |
|-----------|-------------|------------------|
| for | Known iterations | Before each iteration |
| while | Unknown iterations | Before each iteration |
| do-while | At least once | After each iteration |

---

## 8. INPUT/OUTPUT

### Input (Reading from user)
```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter building name: ");
String name = scanner.nextLine();  // Read text

System.out.print("Enter number of floors: ");
int floors = scanner.nextInt();    // Read integer

System.out.print("Enter area: ");
double area = scanner.nextDouble(); // Read decimal

System.out.print("Is operational? (true/false): ");
boolean operational = scanner.nextBoolean(); // Read boolean
```

### Output (Printing to console)
```java
System.out.println("Name: " + name);  // Print with new line
System.out.print("Enter choice: ");    // Print without new line
```

### Important Scanner Methods
- `nextLine()` - Read entire line of text
- `nextInt()` - Read integer
- `nextDouble()` - Read decimal number
- `nextBoolean()` - Read true/false
- `next()` - Read single word

### Common Issue - Buffer Problem
```java
int number = scanner.nextInt();
scanner.nextLine();  // Clear the newline character
String text = scanner.nextLine();  // Now works correctly
```

---

## Common Mistakes to Avoid

1. **Forgetting to initialize objects**
   ```java
   Building b;  // Not initialized!
   b.name = "Hospital";  // NullPointerException!
   
   // Correct:
   Building b = new Building();
   b.name = "Hospital";
   ```

2. **Infinite loops**
   ```java
   int i = 0;
   while (i < 10) {
       System.out.println(i);
       // Forgot i++; - infinite loop!
   }
   ```

3. **Forgetting break in switch**
   ```java
   switch (type) {
       case "hospital":
           System.out.println("Hospital");
           // No break - falls through!
       case "school":
           System.out.println("School");
   }
   ```

4. **Using == for String comparison**
   ```java
   if (name == "Hospital") { }  // Wrong!
   if (name.equals("Hospital")) { }  // Correct!
   ```

---

# MODULE 2: Encapsulation and Static Members

## Table of Contents
1. [Encapsulation](#1-encapsulation)
2. [Getter and Setter Methods](#2-getter-and-setter-methods)
3. [Method Overloading](#3-method-overloading)
4. [Static Members](#4-static-members)
5. [Static Final](#5-static-final)

---

## 1. ENCAPSULATION

### Concept
Hide internal details and control access to data using access modifiers. This is one of the four pillars of OOP.

### Access Modifiers

#### PRIVATE - Only accessible within the same class
```java
private String name;  // Cannot access from outside the class
```

#### PUBLIC - Accessible from anywhere
```java
public void displayInfo() {  // Can call from anywhere
    // code
}
```

#### PROTECTED - Accessible in same package and subclasses
```java
protected double maintenanceCost;  // Subclasses can access
```

### Why Encapsulation?

**WITHOUT encapsulation:**
```java
Building building = new Building();
building.floors = -5;  // ERROR! Negative floors don't make sense!
// No validation, anyone can set invalid data
```

**WITH encapsulation:**
```java
Building building = new Building();
building.setFloors(-5);  // Setter validates and rejects invalid data

public void setFloors(int floors) {
    if (floors > 0) {
        this.floors = floors;
    } else {
        System.out.println("Floors must be greater than 0!");
    }
}
```

### Benefits of Encapsulation
1. **Data Protection**: Prevent invalid data
2. **Flexibility**: Change internal implementation without affecting external code
3. **Control**: Decide what can be read/modified
4. **Maintainability**: Easier to debug and modify

### Access Modifier Comparison Table
| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|-----------|--------------|----------|---------------|
| private | ✓ | ✗ | ✗ | ✗ |
| (default) | ✓ | ✓ | ✗ | ✗ |
| protected | ✓ | ✓ | ✓ | ✗ |
| public | ✓ | ✓ | ✓ | ✓ |

---

## 2. GETTER and SETTER Methods

### Concept
Provide controlled access to private attributes.

### GETTER - Read the value
```java
public String getName() {
    return name;  // Just return the value
}

public int getFloors() {
    return floors;
}

public boolean isOperational() {  // boolean getters often use 'is'
    return isOperational;
}
```

### SETTER - Write/modify the value with validation
```java
public void setFloors(int floors) {
    if (floors > 0) {  // VALIDATION
        this.floors = floors;  // Only set if valid
    } else {
        System.out.println("Floors must be greater than 0!");
    }
}

public void setName(String name) {
    if (name != null && !name.trim().isEmpty()) {
        this.name = name;
    } else {
        System.out.println("Name cannot be empty!");
    }
}
```

### Why use getters/setters instead of public attributes?

1. **Validation**: Check data before storing
```java
public void setCapacity(int capacity) {
    if (capacity > 0 && capacity < 10000) {
        this.capacity = capacity;
    } else {
        throw new IllegalArgumentException("Invalid capacity");
    }
}
```

2. **Read-only**: Provide getter without setter
```java
private String buildingId;

public String getBuildingId() {
    return buildingId;  // Can read
}
// No setter - cannot modify after creation
```

3. **Calculated values**: Return computed values
```java
public double getTotalArea() {
    return area * floors;  // Calculated, not stored
}
```

4. **Future changes**: Can modify internal behavior without changing interface
```java
// Version 1
private String name;
public String getName() {
    return name;
}

// Version 2 - changed implementation, same interface
private String firstName;
private String lastName;
public String getName() {
    return firstName + " " + lastName;  // Different implementation
}
// External code doesn't need to change!
```

### Usage Example
```java
// Using setter with validation
Building building = new Building();
building.setFloors(5);   // ✓ Valid - sets floors to 5
building.setFloors(-2);  // ✗ Invalid - prints error, doesn't change value

// Using getter
int floors = building.getFloors();  // Read the value
System.out.println("Floors: " + floors);
```

### Naming Convention
- Getter: `get` + AttributeName (camelCase)
- Setter: `set` + AttributeName (camelCase)
- Boolean getter: `is` + AttributeName

```java
private boolean operational;

public boolean isOperational() {  // 'is' prefix for boolean
    return operational;
}

public void setOperational(boolean operational) {
    this.operational = operational;
}
```

---

## 3. METHOD OVERLOADING

### Concept
Same method name, different parameters (number, type, or order). Also called compile-time polymorphism.

### In the Code - displayInfo() Overloaded 3 Times

#### Version 1: Display basic info
```java
public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Floors: " + floors);
}
```

#### Version 2: Display with detailed flag (OVERLOADED)
```java
public void displayInfo(boolean showDetailed) {
    displayInfo();  // Call version 1
    if (showDetailed) {
        System.out.println("Total Area: " + calculateTotalArea());
        System.out.println("Maintenance Cost: $" + maintenanceCost);
    }
}
```

#### Version 3: Display with custom header (OVERLOADED)
```java
public void displayInfo(String customHeader) {
    System.out.println("=== " + customHeader + " ===");
    System.out.println("Name: " + name);
    System.out.println("Floors: " + floors);
}
```

### How Java Chooses Which Method
```java
building.displayInfo();           // Calls version 1 (no parameters)
building.displayInfo(true);       // Calls version 2 (boolean parameter)
building.displayInfo("My Header"); // Calls version 3 (String parameter)
```

### Another Example - calculateEfficiency()
```java
// Version 1: Basic calculation
public void calculateEfficiency(int occupancy) {
    double efficiency = (occupancy * 100.0) / capacity;
    System.out.println("Efficiency: " + efficiency + "%");
}

// Version 2: Calculation + recommendation
public void calculateEfficiency(int occupancy, boolean showRecommendation) {
    calculateEfficiency(occupancy);  // Call version 1
    if (showRecommendation) {
        // Show recommendation based on efficiency
    }
}

// Version 3: Calculation for specific floor
public void calculateEfficiency(int occupancy, int floorNumber) {
    int floorCapacity = capacity / floors;
    double efficiency = (occupancy * 100.0) / floorCapacity;
    System.out.println("Floor " + floorNumber + " Efficiency: " + efficiency + "%");
}

// Usage:
building.calculateEfficiency(100);          // Version 1
building.calculateEfficiency(100, true);    // Version 2
building.calculateEfficiency(50, 3);        // Version 3
```

### Rules for Method Overloading
1. ✓ Same method name
2. ✓ Different parameter list (number, type, or order)
3. ✗ Return type alone is NOT enough
4. ✓ Can have different return types (but must also have different parameters)

### Valid Overloading Examples
```java
void method(int a) { }
void method(double a) { }              // ✓ Different type
void method(int a, int b) { }          // ✓ Different number
void method(String a, int b) { }       // ✓ Different types
int method(int a, String b) { }        // ✓ Different order
```

### Invalid Overloading Examples
```java
void method(int a) { }
int method(int a) { }                  // ✗ Only return type different
void method(int x) { }                 // ✗ Only parameter name different
```

### Benefits of Method Overloading
1. **Convenience**: Same operation, flexible parameters
2. **Readability**: Clear what the method does
3. **Flexibility**: Users can call with different arguments

---

## 4. STATIC Members

### Concept
Belong to the CLASS, not to individual objects. Shared by all instances.

### STATIC ATTRIBUTES

#### In the Code
```java
private static int totalBuildingsCreated = 0;
private static final String CITY_NAME = "Smart Metro City";
```

### Understanding Static

**NON-STATIC (each object has its own)**
```java
private String name;

Building b1 = new Building();
b1.name = "Hospital";

Building b2 = new Building();
b2.name = "School";
// b1.name and b2.name are DIFFERENT
```

**STATIC (shared by all objects)**
```java
private static int totalBuildingsCreated = 0;

Building b1 = new Building();  // totalBuildingsCreated = 1
Building b2 = new Building();  // totalBuildingsCreated = 2
Building b3 = new Building();  // totalBuildingsCreated = 3
// ALL objects share the SAME counter
```

### Memory Visualization
```
NON-STATIC:
┌─────────────┐
│  Building 1 │ → name: "Hospital"
└─────────────┘

┌─────────────┐
│  Building 2 │ → name: "School"
└─────────────┘
(Each object has separate memory)

STATIC:
       totalBuildingsCreated: 3
              ↑      ↑      ↑
         Building1  B2     B3
(All objects share same memory location)
```

### STATIC METHODS

```java
public static int getTotalBuildingsCreated() {
    return totalBuildingsCreated;
}

public static String getCityName() {
    return CITY_NAME;
}
```

### Calling Static Methods
```java
// Call using CLASS NAME (don't need object)
int total = Building.getTotalBuildingsCreated();
String city = Building.getCityName();

// vs NON-STATIC methods (need object)
Building b = new Building();
b.displayInfo();  // Need object 'b'
```

### Rules for Static Methods
✓ Can access static variables  
✓ Can call other static methods  
✗ Cannot access non-static variables  
✗ Cannot call non-static methods directly  
✗ Cannot use 'this' keyword

**Why?** Static methods don't belong to any specific object, so they can't access object-specific data.

### Example - Valid and Invalid
```java
public class Building {
    private static int counter = 0;
    private String name;
    
    // VALID - static method accessing static variable
    public static int getCounter() {
        return counter;  // ✓ OK
    }
    
    // INVALID - static method accessing non-static variable
    public static String getName() {
        return name;  // ✗ ERROR! Can't access non-static from static
    }
    
    // VALID - non-static method accessing both
    public void displayInfo() {
        System.out.println(name);     // ✓ OK - non-static
        System.out.println(counter);  // ✓ OK - static (can access from non-static)
    }
}
```

### When to Use Static
- **Constants**: Values that don't change (MAX_SIZE, PI)
- **Utility methods**: Don't need object state (Math.sqrt())
- **Counters**: Track total instances
- **Shared resources**: Database connections, configuration

---

## 5. STATIC FINAL

### Concept
Constants that never change and are shared by all objects.

### In the Code
```java
private static final String CITY_NAME = "Smart Metro City";
private static final int MAX_BUILDINGS = 10;
private static final double MAINTENANCE_BASE_RATE = 0.5;
```

### Breakdown
- `static` = Shared by all objects
- `final` = Cannot be changed
- Together = A constant value used throughout the class

### Naming Convention
Static final constants are usually **UPPERCASE_WITH_UNDERSCORES**

```java
public static final int MAX_CAPACITY = 1000;
public static final double PI = 3.14159;
public static final String DEFAULT_STATUS = "OPERATIONAL";
```

### Usage Example
```java
public class Config {
    public static final int MAX_USERS = 100;
    public static final String APP_NAME = "Smart City";
    public static final double TAX_RATE = 0.15;
}

// Access from anywhere
System.out.println(Config.APP_NAME);
if (users > Config.MAX_USERS) {
    // handle
}
```

### Benefits
1. **Readability**: `MAX_BUILDINGS` is clearer than `10`
2. **Maintainability**: Change in one place
3. **Type safety**: Compiler checks type
4. **Prevention**: Cannot be accidentally modified

### Comparison
```java
// BAD - Magic numbers
if (count > 10) { }
double cost = area * 0.5;

// GOOD - Named constants
if (count > MAX_BUILDINGS) { }
double cost = area * MAINTENANCE_BASE_RATE;
```

---


## Common Mistakes to Avoid

### 1. Making everything public
```java
// BAD
public class Building {
    public String name;
    public int floors;
}

// GOOD
public class Building {
    private String name;
    private int floors;
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
```

### 2. Forgetting validation in setters
```java
// BAD - No validation
public void setFloors(int floors) {
    this.floors = floors;  // Can be negative!
}

// GOOD - With validation
public void setFloors(int floors) {
    if (floors > 0) {
        this.floors = floors;
    }
}
```

### 3. Accessing non-static from static
```java
public class Building {
    private String name;
    
    public static void printName() {
        System.out.println(name);  // ✗ ERROR!
    }
}
```

### 4. Not using static for constants
```java
// BAD - Each object has its own copy
private final String CITY_NAME = "Smart City";

// GOOD - Shared by all
private static final String CITY_NAME = "Smart City";
```

---



