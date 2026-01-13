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

# MODULE 3: Inheritance and Constructors

## Table of Contents
1. [Inheritance](#1-inheritance)
2. [Constructors](#2-constructors)
3. [Super Keyword](#3-super-keyword)
4. [Method Overriding](#4-method-overriding)
5. [Overloading vs Overriding](#5-overloading-vs-overriding)

---

## 1. INHERITANCE

### Concept
A class (child/subclass) can inherit attributes and methods from another class (parent/superclass). This promotes code reuse and establishes relationships between classes.

### Syntax
```java
public class Hospital extends Building {
    // Hospital inherits everything from Building
}
```

### In the Code

**PARENT CLASS (Base/Super class)**
```java
public class Building {
    protected String name;    // Available to child classes
    protected int floors;
    protected double area;
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Floors: " + floors);
    }
}
```

**CHILD CLASS (Derived/Sub class)**
```java
public class Hospital extends Building {
    // Inherits: name, floors, area, displayInfo()
    // Plus adds its own attributes:
    private int emergencyBeds;
    private int numberOfDoctors;
    
    // Plus adds its own methods:
    public void admitPatient(String patientName) {
        // Hospital-specific method
    }
}
```

### What Gets Inherited

```java
Hospital hospital = new Hospital();

// Can use inherited attributes (if accessible)
hospital.name = "City Hospital";      // From Building
hospital.floors = 5;                  // From Building
hospital.area = 1000.0;               // From Building

// Can use inherited methods
hospital.displayInfo();               // From Building

// Can use its own attributes
hospital.emergencyBeds = 20;          // Hospital-specific
hospital.numberOfDoctors = 15;        // Hospital-specific

// Can use its own methods
hospital.admitPatient("John Doe");    // Hospital-specific
```

### Inheritance Hierarchy
```
        Building (Parent)
           /  |  \
          /   |   \
    Hospital School Office Park
     (Child) (Child) (Child) (Child)
```

### Why Use Inheritance?

#### 1. Code Reuse
**WITHOUT Inheritance - REPETITION!**
```java
class Hospital {
    String name;      // Repeated
    int floors;       // Repeated
    double area;      // Repeated
    // ... plus hospital-specific fields
    int emergencyBeds;
    int numberOfDoctors;
}

class School {
    String name;      // SAME as Hospital!
    int floors;       // SAME as Hospital!
    double area;      // SAME as Hospital!
    // ... plus school-specific fields
    int numberOfClassrooms;
    int numberOfTeachers;
}
```

**WITH Inheritance - NO REPETITION!**
```java
class Building {
    String name;      // Define once
    int floors;       // Define once
    double area;      // Define once
}

class Hospital extends Building {
    // Inherits name, floors, area
    // Only add hospital-specific fields
    int emergencyBeds;
    int numberOfDoctors;
}

class School extends Building {
    // Inherits name, floors, area
    // Only add school-specific fields
    int numberOfClassrooms;
    int numberOfTeachers;
}
```

#### 2. Organization
Group related classes in logical hierarchy

#### 3. Polymorphism
Treat different types uniformly (covered in Module 4)

### Access Modifiers in Inheritance

| Modifier | Inherited? | Accessible in Subclass? |
|----------|-----------|------------------------|
| private | Yes (but not directly accessible) | No |
| protected | Yes | Yes |
| public | Yes | Yes |

```java
class Building {
    private String buildingId;      // Not accessible in Hospital
    protected String name;          // Accessible in Hospital
    public int floors;              // Accessible in Hospital
}

class Hospital extends Building {
    public void someMethod() {
        // System.out.println(buildingId);  // ✗ ERROR - private
        System.out.println(name);           // ✓ OK - protected
        System.out.println(floors);         // ✓ OK - public
    }
}
```

### Types of Inheritance in Java

**Single Inheritance** (Supported)
```java
class A { }
class B extends A { }  // B inherits from A
```

**Multilevel Inheritance** (Supported)
```java
class A { }
class B extends A { }
class C extends B { }  // C inherits from B, which inherits from A
```

**Multiple Inheritance** (NOT Supported with classes, but with interfaces)
```java
class A { }
class B { }
class C extends A, B { }  // ✗ ERROR! Java doesn't allow this

// But this is OK:
interface I1 { }
interface I2 { }
class C implements I1, I2 { }  // ✓ OK with interfaces
```

---

## 2. CONSTRUCTORS

### Concept
Special methods that initialize objects when created. Same name as class, no return type.

### Why Constructors?
```java
// WITHOUT constructor - manual initialization (tedious)
Hospital h = new Hospital();
h.name = "City Hospital";
h.floors = 5;
h.area = 1000.0;
h.emergencyBeds = 20;
h.numberOfDoctors = 15;

// WITH constructor - automatic initialization (easy)
Hospital h = new Hospital("City Hospital", 5, 1000.0, 20, 15);
```

### Types of Constructors

#### a) Default Constructor (No Parameters)
```java
public Hospital() {
    // Called when: new Hospital()
    this.type = "Hospital";
    this.emergencyBeds = 0;
    this.numberOfDoctors = 0;
    this.hasEmergencyRoom = false;
}

// Usage:
Hospital h = new Hospital();  // Uses default constructor
```

#### b) Parameterized Constructor
```java
public Hospital(String name, int floors, double area) {
    // Called when: new Hospital("City Hospital", 5, 1000.0)
    this.name = name;
    this.floors = floors;
    this.area = area;
}

// Usage:
Hospital h = new Hospital("City Hospital", 5, 1000.0);
```

#### c) Constructor with All Parameters
```java
public Hospital(String name, int floors, double area, int capacity,
                int emergencyBeds, int numberOfDoctors, String specialization) {
    this.name = name;
    this.floors = floors;
    this.area = area;
    this.capacity = capacity;
    this.emergencyBeds = emergencyBeds;
    this.numberOfDoctors = numberOfDoctors;
    this.specialization = specialization;
}

// Usage:
Hospital h = new Hospital("City Hospital", 5, 1000.0, 200, 20, 15, "General");
```

### Constructor Overloading
Multiple constructors with different parameters:

```java
public class Hospital extends Building {
    // Constructor 1
    public Hospital() {
        // No parameters
    }
    
    // Constructor 2
    public Hospital(String name, int floors, double area) {
        // Some parameters
    }
    
    // Constructor 3
    public Hospital(String name, int floors, double area, 
                    int capacity, int beds, int doctors, String spec) {
        // All parameters
    }
}

// Usage:
Hospital h1 = new Hospital();                          // Calls Constructor 1
Hospital h2 = new Hospital("CH", 5, 1000);             // Calls Constructor 2
Hospital h3 = new Hospital("CH", 5, 1000, 200, 
                          20, 15, "General");          // Calls Constructor 3
```

### Default Constructor Note
```java
// If you don't write ANY constructor, Java provides default:
public class Building {
    // Java automatically adds:
    // public Building() { }
}

// But if you write ANY constructor, Java doesn't provide default:
public class Building {
    public Building(String name) {
        this.name = name;
    }
    // Java does NOT add default constructor
}

// This would be an error:
Building b = new Building();  // ✗ ERROR! No default constructor
Building b = new Building("Hospital");  // ✓ OK
```

### The 'this' Keyword in Constructors
```java
public Hospital(String name, int floors) {
    this.name = name;      // 'this.name' = instance variable
    this.floors = floors;  // 'name' and 'floors' = parameters
}
```

---

## 3. SUPER Keyword

### Concept
Refers to the parent class. Used to:
1. Call parent class constructor
2. Access parent class methods/attributes

### a) Calling Parent Constructor

```java
public class Building {
    protected String name;
    protected String type;
    
    public Building() {
        System.out.println("Building default constructor");
    }
    
    public Building(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("Building parameterized constructor");
    }
}

public class Hospital extends Building {
    private int emergencyBeds;
    
    public Hospital(String name, int floors, double area) {
        super(name, "Hospital");  // Call parent constructor FIRST
        // After parent is initialized, initialize hospital-specific
        this.emergencyBeds = 20;
        System.out.println("Hospital constructor");
    }
}
```

### Constructor Chaining
```java
public class Building {
    public Building() {
        System.out.println("1. Building default constructor");
    }
    
    public Building(String name, String type) {
        this();  // Call Building's default constructor first
        System.out.println("2. Building(name, type) constructor");
        this.name = name;
        this.type = type;
    }
}

public class Hospital extends Building {
    public Hospital(String name, int floors, double area) {
        super(name, "Hospital");  // Call Building's constructor
        System.out.println("3. Hospital constructor");
    }
}

// Creating object:
Hospital h = new Hospital("City Hospital", 5, 1000);

// Output shows chain:
// 1. Building default constructor
// 2. Building(name, type) constructor
// 3. Hospital constructor
```

### Order of Execution
**Rule:** Parent constructor ALWAYS runs before child constructor

```java
class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    public Child() {
        // super() is called automatically if not written
        System.out.println("Child constructor");
    }
}

Child c = new Child();
// Output:
// Parent constructor
// Child constructor
```

### Important Rules for super()
1. Must be FIRST statement in constructor
2. Can only call one parent constructor
3. If not written, Java automatically calls `super()` (no-arg constructor)

```java
public Hospital(String name) {
    System.out.println("Starting");
    super(name, "Hospital");  // ✗ ERROR! Must be first statement
}

public Hospital(String name) {
    super(name, "Hospital");  // ✓ OK - First statement
    System.out.println("Hospital created");
}
```

### b) Calling Parent Methods

```java
public class Building {
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Floors: " + floors);
    }
}

public class Hospital extends Building {
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent's version first
        // Then add hospital-specific info
        System.out.println("=== Hospital Specific Info ===");
        System.out.println("Emergency Beds: " + emergencyBeds);
        System.out.println("Doctors: " + numberOfDoctors);
    }
}
```

### c) Accessing Parent Attributes

```java
public class Building {
    protected String name;
}

public class Hospital extends Building {
    public void printName() {
        System.out.println(super.name);  // Access parent's name
        System.out.println(this.name);   // Same thing (inherited)
        System.out.println(name);        // Same thing
    }
}
```

---

## 4. METHOD OVERRIDING

### Concept
Child class provides its own implementation of a parent's method.

### Basic Example

```java
// PARENT CLASS
public class Building {
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Floors: " + floors);
    }
}

// CHILD CLASS
public class Hospital extends Building {
    @Override  // Annotation (good practice)
    public void displayInfo() {
        // Completely different implementation
        System.out.println("=== HOSPITAL INFORMATION ===");
        System.out.println("Hospital Name: " + name);
        System.out.println("Number of Floors: " + floors);
        System.out.println("Emergency Beds: " + emergencyBeds);
        System.out.println("Medical Staff: " + numberOfDoctors);
    }
}
```

### @Override Annotation
```java
@Override
public void displayInfo() {
    // Implementation
}
```

**Benefits:**
- Tells compiler "I'm overriding a parent method"
- Compiler checks if parent method actually exists
- Prevents typos

```java
class Building {
    public void displayInfo() { }
}

class Hospital extends Building {
    @Override
    public void displayInf() { }  // ✗ ERROR! Typo detected by compiler
}
```

### Calling Parent Method from Override
```java
@Override
public void displayInfo() {
    super.displayInfo();  // Call parent version
    // Add additional information
    System.out.println("Emergency Beds: " + emergencyBeds);
}
```

### Rules for Overriding

1. **Same method signature**
```java
// Parent
public void displayInfo() { }

// Child - Must match exactly
@Override
public void displayInfo() { }  // ✓ OK
```

2. **Same or broader access modifier**
```java
// Parent
protected void method() { }

// Child - Can be same or broader
@Override
protected void method() { }  // ✓ OK - same
@Override
public void method() { }     // ✓ OK - broader

@Override
private void method() { }    // ✗ ERROR - more restrictive
```

3. **Same or compatible return type**
```java
// Parent
public Building getBuilding() { }

// Child
@Override
public Hospital getBuilding() { }  // ✓ OK - Hospital is a Building (covariant)
```

4. **Cannot override final methods**
```java
// Parent
public final void method() { }

// Child
@Override
public void method() { }  // ✗ ERROR - cannot override final
```

5. **Cannot override static methods** (but can hide them)
```java
// Parent
public static void staticMethod() { }

// Child
public static void staticMethod() { }  // Not overriding, hiding
```

### Example - Different Implementations

```java
public class Building {
    public void performMaintenance() {
        System.out.println("General building maintenance");
    }
}

public class Hospital extends Building {
    @Override
    public void performMaintenance() {
        System.out.println("=== Hospital Maintenance ===");
        System.out.println("- Checking medical equipment");
        System.out.println("- Sanitizing areas");
        System.out.println("- Testing emergency systems");
    }
}

public class School extends Building {
    @Override
    public void performMaintenance() {
        System.out.println("=== School Maintenance ===");
        System.out.println("- Inspecting classrooms");
        System.out.println("- Checking playground");
        System.out.println("- Testing fire alarms");
    }
}

// Usage:
Hospital h = new Hospital();
h.performMaintenance();  // Calls Hospital's version

School s = new School();
s.performMaintenance();  // Calls School's version
```

---

## 5. OVERLOADING vs OVERRIDING

### Quick Comparison Table

| Feature | Overloading | Overriding |
|---------|------------|------------|
| Location | Same class | Parent and child class |
| Method signature | Different parameters | Same parameters |
| Decision time | Compile time | Runtime |
| Purpose | Multiple versions of method | Change inherited behavior |
| Access modifier | Any | Same or broader |
| Keyword | - | @Override |

### OVERLOADING
Same class, same method name, **different parameters**

```java
class Calculator {
    // Different number of parameters
    int add(int a, int b) { 
        return a + b; 
    }
    
    int add(int a, int b, int c) { 
        return a + b + c; 
    }
    
    // Different type of parameters
    double add(double a, double b) { 
        return a + b; 
    }
}

Calculator calc = new Calculator();
calc.add(5, 10);        // Calls first method
calc.add(5, 10, 15);    // Calls second method
calc.add(5.5, 10.5);    // Calls third method
```

### OVERRIDING
Parent and child class, same method signature, **different implementation**

```java
class Building {
    void displayInfo() { 
        System.out.println("Basic building info");
    }
}

class Hospital extends Building {
    @Override
    void displayInfo() { 
        System.out.println("Hospital specific info");
    }
}

Building b = new Building();
b.displayInfo();  // "Basic building info"

Hospital h = new Hospital();
h.displayInfo();  // "Hospital specific info"
```

### Visual Comparison

**OVERLOADING:**
```
     Calculator
   /     |      \
add(int,int) add(int,int,int) add(double,double)
```

**OVERRIDING:**
```
Building → displayInfo() [parent implementation]
    ↓
Hospital → displayInfo() [overridden implementation]
```

### Can You Have Both?

**Yes!** A child class can override AND overload:

```java
class Building {
    // Parent method
    void displayInfo() {
        System.out.println("Basic info");
    }
}

class Hospital extends Building {
    // OVERRIDE parent method
    @Override
    void displayInfo() {
        System.out.println("Hospital basic info");
    }
    
    // OVERLOAD the overridden method
    void displayInfo(boolean detailed) {
        displayInfo();  // Call overridden version
        if (detailed) {
            System.out.println("Detailed hospital info");
        }
    }
    
    // OVERLOAD again
    void displayInfo(String section) {
        System.out.println(section + " information");
    }
}
```

---


## Common Mistakes to Avoid

### 1. Forgetting to call super()
```java
public class Hospital extends Building {
    public Hospital(String name) {
        // If Building has no default constructor, this will error
        this.name = name;  // ✗ Parent not initialized!
    }
    
    // CORRECT:
    public Hospital(String name) {
        super(name, "Hospital");  // ✓ Initialize parent first
        this.emergencyBeds = 20;
    }
}
```

### 2. Calling super() not as first statement
```java
public Hospital(String name) {
    this.emergencyBeds = 20;
    super(name, "Hospital");  // ✗ ERROR! Must be first
}
```

### 3. Trying to override private methods
```java
class Building {
    private void calculate() { }
}

class Hospital extends Building {
    @Override
    private void calculate() { }  // ✗ ERROR! Can't override private
}
```

### 4. Making overridden method more restrictive
```java
class Building {
    public void method() { }
}

class Hospital extends Building {
    @Override
    private void method() { }  // ✗ ERROR! Can't be more restrictive
}
```

### 5. Confusing overloading and overriding
```java
class Building {
    void method(int a) { }
}

class Hospital extends Building {
    void method(double a) { }  // This is OVERLOADING, not overriding!
}
```

---


# MODULE 4: Advanced OOP Concepts

## Table of Contents
1. [Final Keyword](#1-final-keyword)
2. [Enum](#2-enum)
3. [Abstract Class](#3-abstract-class)
4. [Interface](#4-interface)
5. [Polymorphism](#5-polymorphism)
6. [Upcasting and Downcasting](#6-upcasting-and-downcasting)

---

## 1. FINAL Keyword

### Concept
Prevents modification or extension. Can be applied to variables, methods, and classes.

### a) FINAL VARIABLE
Cannot be changed after initialization.

```java
protected final String constructionDate;

public AbstractBuilding(String name, BuildingType type) {
    this.constructionDate = java.time.LocalDate.now().toString();
    // Set ONCE in constructor
}

// Later:
building.constructionDate = "2025-01-01";  // ✗ ERROR! Cannot change
```

**Local Final Variable:**
```java
public void method() {
    final int MAX = 100;
    MAX = 200;  // ✗ ERROR! Cannot reassign final variable
}
```

**Instance Final Variable:**
```java
public class ModernHospital {
    private final int licenseNumber;  // Must be initialized
    
    public ModernHospital() {
        this.licenseNumber = generateLicense();  // Set once in constructor
    }
    
    // No setter - licenseNumber cannot change
    public int getLicenseNumber() {
        return licenseNumber;  // Only getter
    }
}
```

**Use Cases for Final Variables:**
- Constants
- Values that should never change (license numbers, IDs, dates)
- Immutable objects

### b) STATIC FINAL
Constants shared by all objects.

```java
protected static final String CITY_NAME = "Smart Metro City";
protected static final double MAINTENANCE_BASE_RATE = 0.5;

// Interface constants are automatically static final
interface Serviceable {
    int MAX_SERVICE_REQUESTS = 100;  // public static final by default
    double SERVICE_FEE_MULTIPLIER = 1.5;
}
```

**Naming Convention:** UPPERCASE_WITH_UNDERSCORES

```java
public static final double PI = 3.14159;
public static final int MAX_CAPACITY = 1000;
public static final String DEFAULT_COLOR = "WHITE";
```

### c) FINAL METHOD
Cannot be overridden by subclasses.

```java
public final class PublicPark {
    // This method cannot be overridden
    public final void openToPublic() {
        System.out.println("Park is OPEN!");
        // This critical logic cannot be changed by subclasses
    }
    
    public final void closeToPublic() {
        System.out.println("Park is CLOSED!");
        // This critical logic is protected
    }
}
```

**Why Make Methods Final?**
1. **Preserve critical functionality**: Ensure behavior doesn't change
2. **Security**: Prevent malicious overriding
3. **Design decision**: Method is complete and shouldn't be modified

**Example:**
```java
public class Building {
    // Final method - subclasses cannot override
    public final void recordConstruction() {
        // Critical logging that should never change
        System.out.println("Building constructed on: " + new Date());
    }
    
    // Non-final method - can be overridden
    public void displayInfo() {
        // Subclasses can override this
    }
}

public class Hospital extends Building {
    @Override
    public void recordConstruction() { }  // ✗ ERROR! Cannot override final method
    
    @Override
    public void displayInfo() { }  // ✓ OK - not final
}
```

### d) FINAL CLASS
Cannot be extended/inherited.

```java
public final class PublicPark extends AbstractBuilding {
    // PublicPark is final - no class can extend it
}

// This would be an ERROR:
public class SpecialPark extends PublicPark {  // ✗ ERROR!
    // Cannot extend final class
}
```

**Why Make a Class Final?**
1. **Security**: Prevent malicious extensions
2. **Design decision**: Class is complete, no extension needed
3. **Performance**: Compiler can optimize final classes
4. **Immutability**: Common with immutable classes

**Famous Examples:**
- `String` class in Java is final
- `Integer`, `Double`, etc. wrapper classes are final
- `Math` class is final

### Final Comparison Table

| Type | Can Change Value? | Can Override? | Can Extend? |
|------|------------------|---------------|-------------|
| final variable | ✗ | - | - |
| final method | - | ✗ | - |
| final class | - | - | ✗ |

---

## 2. ENUM (Enumeration)

### Concept
Special class for representing fixed set of constants. Type-safe way to represent a group of related constants.

### Basic Enum

```java
public enum BuildingStatus {
    OPERATIONAL,
    UNDER_MAINTENANCE,
    UNDER_CONSTRUCTION,
    CLOSED,
    EMERGENCY
}
```

### Why Use Enum Instead of Constants?

**BAD (Using String constants):**
```java
String status = "operational";  // Typo! No compile error
String status = "xyz";          // Invalid value, no error!
if (status == "OPERATIONAL") { } // Wrong comparison, won't work
```

**GOOD (Using Enum):**
```java
BuildingStatus status = BuildingStatus.OPERATIONAL;  // Type-safe
BuildingStatus status = BuildingStatus.XYZ;  // ✗ Compile error!
if (status == BuildingStatus.OPERATIONAL) { } // ✓ Correct comparison
```

### Enum with Attributes and Methods

```java
public enum BuildingStatus {
    // Each constant with its values
    OPERATIONAL("Operational", "Building is fully functional", 1.0),
    UNDER_MAINTENANCE("Under Maintenance", "Being maintained", 0.5),
    UNDER_CONSTRUCTION("Under Construction", "Being built", 0.0),
    CLOSED("Closed", "Building is closed", 0.0),
    EMERGENCY("Emergency", "Emergency mode", 0.8);
    
    // Attributes for each enum constant (final by default)
    private final String displayName;
    private final String description;
    private final double operationalLevel;
    
    // Constructor (always private or package-private)
    BuildingStatus(String displayName, String description, double level) {
        this.displayName = displayName;
        this.description = description;
        this.operationalLevel = level;
    }
    
    // Getter methods
    public String getDisplayName() {
        return displayName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getOperationalLevel() {
        return operationalLevel;
    }
    
    // Enum-specific methods
    public boolean isUsable() {
        return operationalLevel > 0.0;
    }
}
```

### Using Enum

```java
BuildingStatus status = BuildingStatus.OPERATIONAL;

// Access enum attributes
System.out.println(status.getDisplayName());    // "Operational"
System.out.println(status.getDescription());    // "Building is fully functional"
System.out.println(status.getOperationalLevel()); // 1.0

// Call enum methods
if (status.isUsable()) {
    System.out.println("Building can be used");
}

// Comparison
if (status == BuildingStatus.OPERATIONAL) {
    System.out.println("Building is operational");
}
```

### ENUM in SWITCH-CASE

```java
public void changeStatus(BuildingStatus newStatus) {
    switch (newStatus) {
        case OPERATIONAL:
            System.out.println("Building is now fully operational!");
            break;
        case UNDER_MAINTENANCE:
            System.out.println("Building maintenance has started.");
            break;
        case UNDER_CONSTRUCTION:
            System.out.println("Construction work in progress.");
            break;
        case CLOSED:
            System.out.println("Building has been closed.");
            break;
        case EMERGENCY:
            System.out.println("EMERGENCY MODE ACTIVATED!");
            break;
    }
}
```

**Advantages of Enum in Switch:**
- Compiler ensures all cases are covered (or default is provided)
- Type-safe (can't use invalid values)
- Better than string comparison
- No magic strings

### Enum Methods

```java
// Get all enum values
BuildingStatus[] allStatuses = BuildingStatus.values();
for (BuildingStatus status : allStatuses) {
    System.out.println(status);
}

// Convert string to enum
BuildingStatus status = BuildingStatus.valueOf("OPERATIONAL");

// Get enum name
String name = BuildingStatus.OPERATIONAL.name();  // "OPERATIONAL"

// Get enum ordinal (position)
int position = BuildingStatus.OPERATIONAL.ordinal();  // 0 (first position)
```

### Enum with Methods

```java
public enum BuildingStatus {
    OPERATIONAL("Operational", 1.0),
    CLOSED("Closed", 0.0);
    
    private final String displayName;
    private final double level;
    
    BuildingStatus(String displayName, double level) {
        this.displayName = displayName;
        this.level = level;
    }
    
    // Method using switch on enum itself
    public String getColorCode() {
        switch (this) {
            case OPERATIONAL:
                return "GREEN";
            case UNDER_MAINTENANCE:
                return "YELLOW";
            case CLOSED:
                return "RED";
            default:
                return "GRAY";
        }
    }
    
    // Method with logic
    public String getRecommendedAction() {
        switch (this) {
            case OPERATIONAL:
                return "Continue normal operations";
            case CLOSED:
                return "Review closure reasons and plan reopening";
            default:
                return "Review building status";
        }
    }
}
```

---

## 3. ABSTRACT CLASS

### Concept
A class that cannot be instantiated. Used as a base for other classes. Can have both abstract and concrete methods.

### Basic Structure

```java
public abstract class AbstractBuilding {
    // Can have regular attributes
    protected String name;
    protected int floors;
    
    // Can have constructor (for subclasses to call)
    public AbstractBuilding(String name, BuildingType type) {
        this.name = name;
        this.buildingType = type;
    }
    
    // ABSTRACT METHODS - subclasses MUST implement
    public abstract double calculateMaintenanceCost();
    public abstract void displaySpecificInfo();
    
    // CONCRETE METHODS - subclasses inherit as-is
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Floors: " + floors);
    }
}
```

### Cannot Instantiate Abstract Class

```java
AbstractBuilding building = new AbstractBuilding();  // ✗ ERROR!
// Cannot instantiate abstract class
```

### But Can Create Subclass Objects

```java
AbstractBuilding hospital = new ModernHospital();  // ✓ OK!
// ModernHospital is concrete, AbstractBuilding is reference type
```

### Abstract Methods
Methods declared without implementation. Subclasses MUST provide implementation.

```java
// In AbstractBuilding:
public abstract double calculateMaintenanceCost();
// No body! Just declaration

// In ModernHospital (must implement):
@Override
public double calculateMaintenanceCost() {
    double baseCost = calculateTotalArea() * 0.5;
    double emergencyCost = emergencyBeds * 50;
    return baseCost + emergencyCost;
}

// In ModernSchool (must implement differently):
@Override
public double calculateMaintenanceCost() {
    double baseCost = calculateTotalArea() * 0.5;
    double classroomCost = numberOfClassrooms * 30;
    return baseCost + classroomCost;
}
```

### Why Abstract Methods?
1. **Force implementation**: All subclasses MUST provide the method
2. **Define contract**: "All buildings MUST calculate maintenance, but HOW depends on type"
3. **Enable polymorphism**: Can call method on parent reference

### Concrete Methods in Abstract Class
Regular methods with implementation. Subclasses inherit them.

```java
public abstract class AbstractBuilding {
    // CONCRETE METHOD - has implementation
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Floors: " + floors);
    }
    
    // CONCRETE METHOD
    public void changeStatus(BuildingStatus newStatus) {
        this.status = newStatus;
        System.out.println("Status changed to: " + newStatus.getDisplayName());
    }
    
    // ABSTRACT METHOD - no implementation
    public abstract void displaySpecificInfo();
}

// Subclass automatically gets concrete methods
ModernHospital hospital = new ModernHospital();
hospital.displayBasicInfo();  // Inherited, works immediately
hospital.changeStatus(BuildingStatus.OPERATIONAL);  // Inherited
```

### Abstract Class vs Regular Class

| Feature | Abstract Class | Regular Class |
|---------|---------------|---------------|
| Can be instantiated | ✗ | ✓ |
| Can have abstract methods | ✓ | ✗ |
| Can have concrete methods | ✓ | ✓ |
| Can have constructors | ✓ | ✓ |
| Can have attributes | ✓ | ✓ |
| Must implement abstract methods | If extends abstract class | - |

### When to Use Abstract Class?
1. **Share code** among related classes
2. **Define template** for subclasses
3. **Force implementation** of certain methods
4. **Partial implementation**: Some methods implemented, some abstract

---

## 4. INTERFACE

### Concept
Contract that defines what a class must do, not how. A class can implement multiple interfaces.

### Basic Interface

```java
public interface Serviceable {
    // Constants (automatically public static final)
    int MAX_SERVICE_REQUESTS = 100;
    double SERVICE_FEE_MULTIPLIER = 1.5;
    
    // Abstract methods (automatically public abstract)
    void provideService(String serviceType);
    double calculateServiceCost();
    boolean isServiceAvailable(String serviceType);
    String[] getAvailableServices();
}
```

### Default Methods in Interface
Methods with implementation (Java 8+).

```java
public interface Serviceable {
    // Abstract methods
    void provideService(String serviceType);
    double calculateServiceCost();
    
    // Default method (has implementation)
    default void displayServiceInfo() {
        System.out.println("=== Service Information ===");
        System.out.println("Available Services:");
        String[] services = getAvailableServices();
        for (String service : services) {
            System.out.println("- " + service);
        }
    }
}
```

### Static Methods in Interface

```java
public interface Serviceable {
    // Static method
    static void displayInterfaceInfo() {
        System.out.println("Serviceable interface");
        System.out.println("Max requests: " + MAX_SERVICE_REQUESTS);
    }
}

// Call static method
Serviceable.displayInterfaceInfo();
```

### Implementing Interface

```java
public class ModernHospital extends AbstractBuilding 
                            implements Serviceable, Accessible {
    
    // Must implement ALL abstract methods from both interfaces
    
    // From Serviceable interface
    @Override
    public void provideService(String serviceType) {
        System.out.println("Providing service: " + serviceType);
    }
    
    @Override
    public double calculateServiceCost() {
        return 100.0 + (numberOfDoctors * 50.0);
    }
    
    @Override
    public boolean isServiceAvailable(String serviceType) {
        // Implementation
        return true;
    }
    
    @Override
    public String[] getAvailableServices() {
        return new String[]{"Emergency Care", "Surgery", "Consultation"};
    }
    
    // From Accessible interface
    @Override
    public boolean hasWheelchairAccess() {
        return true;
    }
    
    @Override
    public boolean hasElevator() {
        return true;
    }
    
    @Override
    public int getAccessibleParkingSpots() {
        return 10;
    }
}
```

### Multiple Interface Implementation

```java
// A class can extend ONE class but implement MULTIPLE interfaces
public class ModernHospital extends AbstractBuilding 
                            implements Serviceable, Accessible {
    // Implements methods from:
    // - AbstractBuilding (parent class) - abstract methods
    // - Serviceable (interface 1) - abstract methods
    // - Accessible (interface 2) - abstract methods
}
```

### Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| Methods | Abstract + Concrete | Abstract + Default + Static |
| Attributes | All types | Only constants (static final) |
| Constructor | Yes | No |
| Multiple inheritance | No (single) | Yes (multiple) |
| Access modifiers | All | Public only |
| When to use | IS-A relationship | CAN-DO relationship |

### When to Use Interface?

1. **Multiple "inheritance"**: Need behavior from multiple sources
2. **Contract**: Guarantee class has certain methods
3. **Loose coupling**: Define behavior without implementation
4. **Polymorphism**: Treat different classes uniformly

**Examples:**
```java
// IS-A relationship - use inheritance/abstract class
Hospital IS-A Building  → Hospital extends Building

// CAN-DO relationship - use interface
Hospital CAN provide services  → Hospital implements Serviceable
School CAN provide services    → School implements Serviceable
Hospital CAN be accessible     → Hospital implements Accessible
```

---

## 5. POLYMORPHISM

### Concept
"Many forms" - One reference type can refer to objects of different types. Core principle of OOP.

### Reference Polymorphism

```java
// AbstractBuilding reference can hold any subclass object
AbstractBuilding building1 = new ModernHospital();
AbstractBuilding building2 = new ModernSchool();
AbstractBuilding building3 = new ModernOffice();
AbstractBuilding building4 = new PublicPark();

// Array of AbstractBuilding can hold different types
AbstractBuilding[] buildings = new AbstractBuilding[4];
buildings[0] = new ModernHospital();   // Hospital object
buildings[1] = new ModernSchool();     // School object
buildings[2] = new ModernOffice();     // Office object
buildings[3] = new PublicPark();       // Park object
```

### Method Polymorphism
Same method call, different behavior based on actual type.

```java
// Loop through different building types
for (AbstractBuilding building : buildings) {
    building.displaySpecificInfo();  // Calls appropriate version
    building.calculateMaintenanceCost();  // Different calculation each time
}

// When building is ModernHospital → Hospital version runs
// When building is ModernSchool → School version runs
// When building is ModernOffice → Office version runs
// When building is PublicPark → Park version runs
```

### Why Polymorphism?

**WITHOUT Polymorphism - Messy!**
```java
ModernHospital[] hospitals = new ModernHospital[10];
ModernSchool[] schools = new ModernSchool[10];
ModernOffice[] offices = new ModernOffice[10];
PublicPark[] parks = new PublicPark[10];

// Need separate code for each type
for (ModernHospital h : hospitals) {
    h.displaySpecificInfo();
}
for (ModernSchool s : schools) {
    s.displaySpecificInfo();
}
for (ModernOffice o : offices) {
    o.displaySpecificInfo();
}
for (PublicPark p : parks) {
    p.displaySpecificInfo();
}
```

**WITH Polymorphism - Clean!**
```java
AbstractBuilding[] buildings = new AbstractBuilding[40];
// Can hold ALL types in ONE array

// Single loop handles all types
for (AbstractBuilding building : buildings) {
    building.displaySpecificInfo();  // Works for all!
    building.calculateMaintenanceCost();  // Each calculates differently
}
```

### Interface Polymorphism

```java
// Reference to interface type
Serviceable service = new ModernHospital();
service.provideService("Emergency Care");

service = new ModernSchool();  // Change to different type
service.provideService("Education");

service = new ModernOffice();  // Change again
service.provideService("Business Consulting");

// Same reference variable, different objects!
```

### Real-World Example

```java
public void provideServiceToAll(Serviceable[] serviceProviders) {
    for (Serviceable provider : serviceProviders) {
        provider.displayServiceInfo();  // Polymorphic call
        System.out.println("Cost: $" + provider.calculateServiceCost());
    }
}

// Can pass array of ANY classes that implement Serviceable
Serviceable[] providers = new Serviceable[3];
providers[0] = new ModernHospital();  // Hospital is Serviceable
providers[1] = new ModernSchool();    // School is Serviceable
providers[2] = new ModernOffice();    // Office is Serviceable

provideServiceToAll(providers);  // Works with all types!
```

### Benefits of Polymorphism

1. **Flexibility**: Write code that works with multiple types
2. **Extensibility**: Add new types without changing existing code
3. **Maintainability**: Change implementation without affecting users
4. **Simplicity**: Treat different objects uniformly

---

## 6. UPCASTING and DOWNCASTING

### UPCASTING
Automatically converting subclass reference to superclass reference. Always safe.

```java
// Creating ModernHospital object
ModernHospital hospital = new ModernHospital("City Hospital", 5, 1000, 200);

// UPCASTING - ModernHospital → AbstractBuilding (automatic)
AbstractBuilding building = hospital;

// OR directly:
AbstractBuilding building = new ModernHospital(...);  // Upcasting happens here
```

### What Can You Access After Upcasting?

```java
ModernHospital hospital = new ModernHospital();
AbstractBuilding building = hospital;  // UPCAST

// Can access AbstractBuilding methods ✓
building.displayBasicInfo();
building.calculateMaintenanceCost();
building.changeStatus(BuildingStatus.OPERATIONAL);

// Cannot access ModernHospital-specific methods ✗
building.admitPatient("John");  // ✗ ERROR! 
// AbstractBuilding doesn't have this method
// Even though the actual object IS a ModernHospital!
```

### Memory Reality

```
AbstractBuilding building = new ModernHospital();

Memory: [ModernHospital object with all hospital data]
        name, floors, emergencyBeds, numberOfDoctors, etc.

Reference type: AbstractBuilding 
                (can only see AbstractBuilding methods)

Actual type: ModernHospital 
             (the real object in memory)
```

### Interface Upcasting

```java
ModernHospital hospital = new ModernHospital();

// Upcast to interface
Serviceable service = hospital;  // ModernHospital → Serviceable
Accessible access = hospital;    // ModernHospital → Accessible
```

### DOWNCASTING
Explicitly converting superclass reference back to subclass reference. Requires type checking.

```java
AbstractBuilding building = buildings[0];  // Might be any type

// Check type first (IMPORTANT!)
if (building instanceof ModernHospital) {
    // DOWNCAST - AbstractBuilding → ModernHospital (explicit)
    ModernHospital hospital = (ModernHospital) building;
    
    // Now can access hospital-specific methods
    hospital.admitPatient("John", true);
    hospital.assignDoctor("John", "Dr. Smith");
    System.out.println("Doctors: " + hospital.getNumberOfDoctors());
}
```

### Why Check with instanceof?

```java
AbstractBuilding building = new ModernSchool();  // Actually a school

// BAD - No check, will crash!
ModernHospital hospital = (ModernHospital) building;  
// ✗ ClassCastException at runtime!

// GOOD - Check first
if (building instanceof ModernHospital) {
    ModernHospital hospital = (ModernHospital) building;
    // Safe to use hospital-specific methods
} else if (building instanceof ModernSchool) {
    ModernSchool school = (ModernSchool) building;  // ✓ Safe
    // Safe to use school-specific methods
}
```

### Complete Downcasting Example

```java
public void performTypeSpecificOperation(AbstractBuilding building) {
    // DOWNCASTING based on actual type
    
    if (building instanceof ModernHospital) {
        ModernHospital hospital = (ModernHospital) building;  // Downcast
        System.out.println("=== Hospital Operations ===");
        System.out.println("Emergency beds: " + hospital.getEmergencyBeds());
        System.out.println("License: " + hospital.getLicenseNumber());
        hospital.admitPatient("Patient", true);
        
    } else if (building instanceof ModernSchool) {
        ModernSchool school = (ModernSchool) building;  // Downcast
        System.out.println("=== School Operations ===");
        System.out.println("Classrooms: " + school.getNumberOfClassrooms());
        System.out.println("Accreditation: " + school.getAccreditationId());
        school.enrollStudent("Student", "Grade 1");
        
    } else if (building instanceof PublicPark) {
        PublicPark park = (PublicPark) building;  // Downcast
        System.out.println("=== Park Operations ===");
        park.organizeEvent("Festival", 500);
        park.openToPublic();  // Final method specific to PublicPark
        
    } else {
        System.out.println("Unknown building type");
    }
}
```

### Upcasting vs Downcasting Summary

```
UPCASTING (Automatic):
┌──────────────┐
│ModernHospital│ (Specific)
└──────┬───────┘
       ↓ Automatic
┌──────────────┐
│AbstractBuild.│ (General)
└──────────────┘

- Always safe ✓
- Automatic (no cast needed)
- Loses access to specific methods
- Syntax: AbstractBuilding b = new ModernHospital();

DOWNCASTING (Manual):
┌──────────────┐
│AbstractBuild.│ (General)
└──────┬───────┘
       ↓ Manual (Type Cast)
┌──────────────┐
│ModernHospital│ (Specific)
└──────────────┘

- Needs type checking (instanceof)
- Manual (explicit cast required)
- Gains access to specific methods
- Can fail if wrong type ✗
- Syntax: ModernHospital h = (ModernHospital) building;
```

### Real-World Analogy

```
Upcasting:
"This German Shepherd is a Dog" ✓ (always true)
GermanShepherd gs = new GermanShepherd();
Dog dog = gs;  // Automatic upcasting

Downcasting:
"This Dog is a German Shepherd" (maybe true, need to check!)
Dog dog = getRandomDog();
if (dog instanceof GermanShepherd) {
    GermanShepherd gs = (GermanShepherd) dog;  // Safe downcasting
}
```


## Common Mistakes to Avoid

### 1. Trying to instantiate abstract class or interface
```java
AbstractBuilding b = new AbstractBuilding();  // ✗ ERROR!
Serviceable s = new Serviceable();  // ✗ ERROR!
```

### 2. Not implementing all interface methods
```java
public class Hospital implements Serviceable {
    // ✗ ERROR! Must implement ALL methods from Serviceable
    @Override
    public void provideService(String type) { }
    // Missing other required methods!
}
```

### 3. Downcasting without instanceof check
```java
AbstractBuilding building = getBuilding();
ModernHospital hospital = (ModernHospital) building;  // ✗ Dangerous!
// What if building is actually a School?
```

### 4. Confusing abstract class and interface
```java
// ✗ Wrong - trying to use interface like abstract class
public interface MyInterface {
    private String name;  // ✗ ERROR! Interfaces can't have instance variables
    public MyInterface() { }  // ✗ ERROR! Interfaces can't have constructors
}
```

---

# MODULE 5: Exception Handling and ArrayList

## Table of Contents
1. [Exception Handling Overview](#1-exception-handling-overview)
2. [Try-Catch Block](#2-try-catch-block)
3. [Multiple Catch Blocks](#3-multiple-catch-blocks)
4. [Custom Exceptions](#4-custom-exceptions)
5. [Throwing Exceptions](#5-throwing-exceptions)
6. [Finally Block](#6-finally-block)
7. [ArrayList](#7-arraylist)
8. [ArrayList Methods](#8-arraylist-methods)
9. [Iterator](#9-iterator)
10. [Enhanced For Loop](#10-enhanced-for-loop)

---

## 1. EXCEPTION HANDLING Overview

### Concept
Handle errors gracefully instead of crashing the program. Exceptions are events that disrupt normal program flow.

### Without Exception Handling - Program Crashes
```java
public static void main(String[] args) {
    int result = 10 / 0;  // ArithmeticException - CRASH!
    System.out.println("This never executes");  // Never reached
}

// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// Program terminates
```

### With Exception Handling - Program Continues
```java
public static void main(String[] args) {
    try {
        int result = 10 / 0;  // Error occurs
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero!");  // Handle error
    }
    System.out.println("Program continues");  // ✓ This executes
}

// Output:
// Cannot divide by zero!
// Program continues
```

### Why Exception Handling?
1. **Prevent crashes**: Program keeps running
2. **User-friendly**: Show meaningful error messages
3. **Debugging**: Easier to find and fix problems
4. **Recovery**: Attempt alternative actions
5. **Resource cleanup**: Ensure resources are closed properly

### Exception Hierarchy
```
Throwable
├── Error (Serious problems, usually can't handle)
│   ├── OutOfMemoryError
│   └── StackOverflowError
└── Exception (Problems we can handle)
    ├── IOException
    │   └── FileNotFoundException
    ├── SQLException
    └── RuntimeException (Unchecked)
        ├── NullPointerException
        ├── ArrayIndexOutOfBoundsException
        ├── ArithmeticException
        └── InputMismatchException
```

---

## 2. TRY-CATCH Block

### Syntax
```java
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}
```

### Basic Example
```java
try {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();  // Might throw InputMismatchException
    System.out.println("You entered: " + number);
} catch (InputMismatchException e) {
    System.out.println("That's not a valid number!");
}
```

### In the Code
```java
private static void addHospital() throws CityCapacityException {
    try {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        // Validation that might throw exception
        if (name.isEmpty()) {
            throw new InvalidBuildingDataException("Name cannot be empty", "name");
        }
        
        System.out.print("Enter floors: ");
        int floors = scanner.nextInt();  // Might throw InputMismatchException
        
        ModernHospital hospital = new ModernHospital(name, floors, area, capacity);
        buildingManager.addBuilding(hospital);  // Might throw CityCapacityException
        
    } catch (InvalidBuildingDataException e) {
        System.err.println("Invalid data: " + e.getMessage());
    } catch (InputMismatchException e) {
        scanner.nextLine();  // Clear buffer
        System.err.println("Please enter valid numbers!");
    } catch (CityCapacityException e) {
        throw e;  // Re-throw to be handled by caller
    }
}
```

### How It Works

**Flow Diagram:**
```
┌─────────────┐
│  try block  │
│ line 1 ✓    │ Executes
│ line 2 ✗    │ Exception occurs → Jump to catch
│ line 3      │ Skipped
└─────────────┘
       ↓
┌─────────────┐
│ catch block │
│ Handle error│ Executes
└─────────────┘
       ↓
┌─────────────┐
│ After try   │
│ Continue... │ Executes
└─────────────┘
```

**Code Example:**
```java
try {
    System.out.println("Line 1");  // ✓ Executes
    int x = 10 / 0;                // ✗ Exception! Jump to catch
    System.out.println("Line 2");  // Skipped
} catch (ArithmeticException e) {
    System.out.println("Error!");  // ✓ Executes
}
System.out.println("After");       // ✓ Executes

// Output:
// Line 1
// Error!
// After
```

### Exception Object Methods
```java
catch (Exception e) {
    e.getMessage();       // Get error message
    e.toString();         // Get exception class and message
    e.printStackTrace();  // Print full stack trace (for debugging)
}
```

---

## 3. MULTIPLE CATCH Blocks

### Concept
Handle different types of exceptions differently.

### Syntax
```java
try {
    // Code that might throw different exceptions
} catch (SpecificException1 e) {
    // Handle specific exception 1
} catch (SpecificException2 e) {
    // Handle specific exception 2
} catch (Exception e) {
    // Handle any other exception
}
```

### In the Code
```java
try {
    buildingManager.addBuilding(hospital);
    
} catch (CityCapacityException e) {
    // Handle city full error
    System.err.println("❌ CITY CAPACITY ERROR:");
    System.err.println(e.getDetailedMessage());
    
} catch (BuildingNotFoundException e) {
    // Handle building not found
    System.err.println("❌ BUILDING NOT FOUND:");
    System.err.println(e.getDetailedMessage());
    
} catch (InvalidBuildingStatusException e) {
    // Handle status error
    System.err.println("❌ INVALID STATUS ERROR:");
    System.err.println(e.getDetailedMessage());
    
} catch (BuildingCapacityException e) {
    // Handle capacity error
    System.err.println("❌ CAPACITY ERROR:");
    System.err.println(e.getDetailedMessage());
    
} catch (Exception e) {
    // Catch any other exception
    System.err.println("❌ UNEXPECTED ERROR: " + e.getMessage());
}
```

### Order Matters - Specific to General
```java
// ✗ WRONG - More general exception before more specific
try {
    // code
} catch (Exception e) {          // Catches everything
    // This catch will handle ALL exceptions
} catch (CityCapacityException e) {  // ✗ Never reached!
    // This code is unreachable
}

// ✓ CORRECT - More specific first
try {
    // code
} catch (CityCapacityException e) {   // Specific first
    // Handle specific exception
} catch (BuildingNotFoundException e) {  // Specific
    // Handle specific exception
} catch (Exception e) {                  // General last
    // Handle any other exception
}
```

### Why Multiple Catch Blocks?
```java
try {
    String name = scanner.nextLine();
    int age = scanner.nextInt();
    int result = 100 / age;
    
} catch (InputMismatchException e) {
    System.out.println("Age must be a number!");
} catch (ArithmeticException e) {
    System.out.println("Age cannot be zero!");
} catch (Exception e) {
    System.out.println("Something went wrong!");
}
```

### Multi-Catch (Java 7+)
```java
// Catch multiple exceptions in one block (if handling same way)
try {
    // code
} catch (IOException | SQLException e) {
    System.out.println("Database or file error: " + e.getMessage());
}
```

---

## 4. CUSTOM EXCEPTIONS

### Concept
Create your own exception types for specific error conditions in your application.

### Creating Custom Exception

**Step 1: Extend Exception class**
```java
public class BuildingCapacityException extends Exception {
    // Your exception class
}
```

**Step 2: Add constructors and attributes**
```java
public class BuildingCapacityException extends Exception {
    private int currentOccupancy;
    private int maxCapacity;
    
    // Constructor with message only
    public BuildingCapacityException(String message) {
        super(message);  // Call parent constructor
    }
    
    // Constructor with message and details
    public BuildingCapacityException(String message, int current, int max) {
        super(message);
        this.currentOccupancy = current;
        this.maxCapacity = max;
    }
    
    // Method to get detailed error information
    public String getDetailedMessage() {
        return super.getMessage() + 
               "\nCurrent Occupancy: " + currentOccupancy + 
               "\nMaximum Capacity: " + maxCapacity +
               "\nOvercapacity: " + (currentOccupancy - maxCapacity);
    }
    
    // Getters
    public int getCurrentOccupancy() { return currentOccupancy; }
    public int getMaxCapacity() { return maxCapacity; }
}
```

### In the Code - Multiple Custom Exceptions

**1. BuildingCapacityException**
```java
class BuildingCapacityException extends Exception {
    private int currentOccupancy;
    private int maxCapacity;
    
    public BuildingCapacityException(String message, int current, int max) {
        super(message);
        this.currentOccupancy = current;
        this.maxCapacity = max;
    }
    
    public String getDetailedMessage() {
        return super.getMessage() + 
               "\nCurrent: " + currentOccupancy + 
               "\nMaximum: " + maxCapacity;
    }
}
```

**2. InvalidBuildingDataException**
```java
class InvalidBuildingDataException extends Exception {
    private String fieldName;
    private Object invalidValue;
    
    public InvalidBuildingDataException(String message, String fieldName) {
        super(message);
        this.fieldName = fieldName;
    }
    
    public InvalidBuildingDataException(String message, String field, Object value) {
        super(message);
        this.fieldName = field;
        this.invalidValue = value;
    }
    
    public String getDetailedMessage() {
        String msg = super.getMessage() + "\nField: " + fieldName;
        if (invalidValue != null) {
            msg += "\nInvalid Value: " + invalidValue;
        }
        return msg;
    }
}
```

**3. ServiceUnavailableException**
```java
class ServiceUnavailableException extends Exception {
    private String serviceName;
    private String buildingName;
    
    public ServiceUnavailableException(String msg, String service, String building) {
        super(msg);
        this.serviceName = service;
        this.buildingName = building;
    }
    
    public String getDetailedMessage() {
        return super.getMessage() +
               "\nService: " + serviceName +
               "\nBuilding: " + buildingName;
    }
}
```

### Using Custom Exceptions
```java
public void validateOccupancy(Building building, int occupancy) 
        throws BuildingCapacityException {
    
    if (occupancy > building.getCapacity()) {
        // THROW custom exception
        throw new BuildingCapacityException(
            "Building is overcrowded!",
            occupancy,
            building.getCapacity()
        );
    }
}

// Calling code:
try {
    validateOccupancy(hospital, 300);
} catch (BuildingCapacityException e) {
    System.err.println(e.getDetailedMessage());
    // Output:
    // Building is overcrowded!
    // Current Occupancy: 300
    // Maximum Capacity: 200
    // Overcapacity: 100
}
```

### Why Create Custom Exceptions?
1. **Specific error information**: Store relevant data (occupancy, capacity, etc.)
2. **Clear error handling**: Catch specific problems
3. **Better debugging**: Know exactly what went wrong
4. **Meaningful names**: `BuildingCapacityException` vs generic `Exception`
5. **Domain-specific**: Matches your application's logic

---

## 5. THROWING EXCEPTIONS

### Concept
Manually create and throw an exception when an error condition is detected.

### Syntax
```java
throw new ExceptionType("Error message");
```

### In the Code
```java
public void addBuilding(AbstractBuilding building) 
        throws CityCapacityException {
    
    // Check condition
    if (buildings.size() >= MAX_BUILDINGS) {
        // THROW exception
        throw new CityCapacityException(
            "Cannot add building - City is full!",
            buildings.size(),
            MAX_BUILDINGS
        );
    }
    
    // If no exception, continue normally
    buildings.add(building);
}
```

### throws vs throw

**"throws" - in method signature (declares)**
```java
public void method() throws IOException {
    // This method MIGHT throw IOException
}
```

**"throw" - in code (actually throws)**
```java
public void method() throws IOException {
    if (error) {
        throw new IOException("Error!");  // Actually throw
    }
}
```

### Complete Example
```java
public void setFloors(int floors) throws InvalidBuildingDataException {
    if (floors <= 0) {
        // THROW exception
        throw new InvalidBuildingDataException(
            "Floors must be positive",
            "floors",
            floors
        );
    }
    this.floors = floors;
}

// Usage:
try {
    building.setFloors(-5);  // Will throw exception
} catch (InvalidBuildingDataException e) {
    System.err.println(e.getDetailedMessage());
    // Output:
    // Floors must be positive
    // Field: floors
    // Invalid Value: -5
}
```

### Checked vs Unchecked Exceptions

**CHECKED (Must handle or declare)**
```java
// Must either:
// 1. Catch it
public void method1() {
    try {
        method2();  // Might throw checked exception
    } catch (IOException e) {
        // Handle
    }
}

// 2. Or declare it
public void method2() throws IOException {
    throw new IOException("Error");
}
```

**UNCHECKED (Don't have to handle)**
```java
// Runtime exceptions - don't need try-catch or throws
public void method() {
    int x = 10 / 0;  // ArithmeticException - no try-catch required
    // But program will crash if not handled
}
```

### Re-throwing Exceptions
```java
public void outerMethod() throws CityCapacityException {
    try {
        innerMethod();
    } catch (CityCapacityException e) {
        System.err.println("Error occurred!");
        throw e;  // Re-throw to caller
    }
}
```

---

## 6. FINALLY Block

### Concept
Code that ALWAYS executes, whether exception occurs or not. Used for cleanup (closing files, releasing resources).

### Syntax
```java
try {
    // Might throw exception
} catch (Exception e) {
    // Handle exception
} finally {
    // ALWAYS executes
    // Close resources, cleanup, etc.
}
```

### Example
```java
Scanner scanner = new Scanner(System.in);
try {
    int number = scanner.nextInt();
    System.out.println("Number: " + number);
} catch (InputMismatchException e) {
    System.err.println("Invalid input!");
} finally {
    scanner.close();  // ALWAYS close, even if error
    System.out.println("Scanner closed");
}
```

### When Finally Executes

**Case 1: No exception**
```java
try {
    System.out.println("A");  // ✓ Executes
} finally {
    System.out.println("B");  // ✓ Executes
}
// Output: A B
```

**Case 2: Exception caught**
```java
try {
    System.out.println("A");      // ✓ Executes
    throw new Exception();
    System.out.println("C");      // Skipped
} catch (Exception e) {
    System.out.println("D");      // ✓ Executes
} finally {
    System.out.println("E");      // ✓ Executes
}
// Output: A D E
```

**Case 3: Exception not caught**
```java
try {
    throw new RuntimeException();
} finally {
    System.out.println("F");  // ✓ Still executes!
}
// Output: F (then program crashes)
```

### Try-With-Resources (Java 7+)
Auto-closes resources without finally block:
```java
// Old way - with finally
Scanner scanner = null;
try {
    scanner = new Scanner(System.in);
    // use scanner
} catch (Exception e) {
    // handle
} finally {
    if (scanner != null) {
        scanner.close();
    }
}

// New way - try-with-resources (auto-closes)
try (Scanner scanner = new Scanner(System.in)) {
    // use scanner
} catch (Exception e) {
    // handle
}
// scanner automatically closed
```

---

## 7. ARRAYLIST

### Concept
Dynamic array that can grow/shrink automatically. Part of Java Collections Framework.

### vs Regular Array

**Regular Array - Fixed size**
```java
Building[] buildings = new Building[10];  // Fixed at 10
buildings[0] = new Building();
buildings[1] = new Building();
// Can't change size
// buildings[10] = ...  // ✗ ERROR! Out of bounds
```

**ArrayList - Dynamic size**
```java
ArrayList<Building> buildings = new ArrayList<>();  // Starts empty
buildings.add(new Building());  // Size = 1
buildings.add(new Building());  // Size = 2
buildings.add(new Building());  // Size = 3
buildings.add(new Building());  // Size = 4
// Can keep adding - no size limit!
```

### Creating ArrayList

```java
import java.util.ArrayList;

// Create empty ArrayList
ArrayList<AbstractBuilding> buildings = new ArrayList<>();

// Create with initial capacity (optimization)
ArrayList<AbstractBuilding> buildings = new ArrayList<>(100);

// Create from another collection
ArrayList<AbstractBuilding> copy = new ArrayList<>(existingList);
```

### Generic Type
```java
ArrayList<AbstractBuilding> buildings = new ArrayList<>();
//       ^^^^^^^^^^^^^^^^
//       Type of objects to store

// Can only add AbstractBuilding (or subclass) objects
buildings.add(new ModernHospital());  // ✓ OK
buildings.add(new ModernSchool());    // ✓ OK
buildings.add("String");              // ✗ ERROR! Wrong type
buildings.add(123);                   // ✗ ERROR! Wrong type
```

### In the Code
```java
import java.util.ArrayList;

public class BuildingManager {
    // ARRAYLIST to store buildings (dynamic size)
    private ArrayList<AbstractBuilding> buildings;
    
    public BuildingManager() {
        buildings = new ArrayList<>();  // Create empty ArrayList
    }
}
```

---

## 8. ARRAYLIST Methods

### a) ADD Method
Add element to the list.

**Add at end:**
```java
ArrayList<String> list = new ArrayList<>();

list.add("A");    // ["A"]
list.add("B");    // ["A", "B"]
list.add("C");    // ["A", "B", "C"]
```

**Add at specific index:**
```java
list.add(1, "X");  // ["A", "X", "B", "C"]
// Inserts at index 1, shifts others right
```

**In the Code:**
```java
public void addBuilding(AbstractBuilding building) 
        throws CityCapacityException {
    if (buildings.size() >= MAX_BUILDINGS) {
        throw new CityCapacityException(...);
    }
    buildings.add(building);  // ADD method - adds at end
}
```

### b) GET Method
Retrieve element by index.

```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

String first = list.get(0);   // "A"
String second = list.get(1);  // "B"
String third = list.get(2);   // "C"
```

**In the Code:**
```java
public AbstractBuilding getBuilding(int index) 
        throws BuildingNotFoundException {
    if (index < 0 || index >= buildings.size()) {
        throw new BuildingNotFoundException(...);
    }
    return buildings.get(index);  // GET method
}
```

### c) SET Method
Replace element at index.

```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
// ["A", "B", "C"]

list.set(1, "X");  // Replace "B" with "X"
// ["A", "X", "C"]
```

**In the Code:**
```java
public void updateBuilding(int index, AbstractBuilding newBuilding) 
        throws BuildingNotFoundException {
    if (index < 0 || index >= buildings.size()) {
        throw new BuildingNotFoundException(...);
    }
    AbstractBuilding old = buildings.set(index, newBuilding);  // SET method
    System.out.println("Updated: " + old.getName() + " → " + newBuilding.getName());
}
```

### d) REMOVE Method

**Remove by index:**
```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
// ["A", "B", "C"]

list.remove(1);  // Remove at index 1
// ["A", "C"]  (size decreased by 1)
```

**Remove by object:**
```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

list.remove("B");  // Remove specific object
// ["A", "C"]
```

**In the Code:**
```java
public void removeBuilding(int index) 
        throws BuildingNotFoundException {
    if (index < 0 || index >= buildings.size()) {
        throw new BuildingNotFoundException(...);
    }
    AbstractBuilding removed = buildings.remove(index);  // REMOVE method
    System.out.println("Removed: " + removed.getName());
}
```

### e) SIZE Method
Get number of elements.

```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

int count = list.size();  // 3
```

**In the Code:**
```java
public int getBuildingCount() {
    return buildings.size();  // SIZE method
}

// Use in loops
for (int i = 0; i < buildings.size(); i++) {
    AbstractBuilding b = buildings.get(i);
    // Process building
}
```

### f) ISEMPTY Method
Check if ArrayList is empty.

```java
ArrayList<String> list = new ArrayList<>();

if (list.isEmpty()) {  // true
    System.out.println("List is empty!");
}

list.add("A");

if (list.isEmpty()) {  // false
    System.out.println("List is empty!");
}
```

**In the Code:**
```java
public void displayAllBuildings() {
    if (buildings.isEmpty()) {  // ISEMPTY method
        System.out.println("No buildings!");
        return;
    }
    // Display buildings...
}
```

### ArrayList Methods Summary Table

| Method | Description | Example |
|--------|-------------|---------|
| add(E) | Add at end | list.add("A") |
| add(index, E) | Add at index | list.add(1, "B") |
| get(index) | Get element | list.get(0) |
| set(index, E) | Replace element | list.set(0, "X") |
| remove(index) | Remove by index | list.remove(1) |
| remove(Object) | Remove by object | list.remove("A") |
| size() | Get size | list.size() |
| isEmpty() | Check if empty | list.isEmpty() |
| clear() | Remove all | list.clear() |
| contains(Object) | Check if exists | list.contains("A") |

---

## 9. ITERATOR

### Concept
Object that allows traversing through a collection sequentially.

### Getting Iterator
```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

Iterator<String> iterator = list.iterator();  // Get iterator
```

### Using Iterator
```java
while (iterator.hasNext()) {     // Check if more elements
    String element = iterator.next();  // Get next element
    System.out.println(element);
}

// Output:
// A
// B
// C
```

### In the Code
```java
public void displayBuildingsWithIterator() {
    if (buildings.isEmpty()) {
        return;
    }
    
    // Get ITERATOR from ArrayList
    Iterator<AbstractBuilding> iterator = buildings.iterator();
    
    int count = 1;
    // Use ITERATOR to traverse
    while (iterator.hasNext()) {  // Check if more elements exist
        AbstractBuilding building = iterator.next();  // Get next element
        System.out.println(count + ". " + building.getName());
        count++;
    }
}
```

### Iterator Methods

**hasNext()** - Returns true if more elements exist
```java
if (iterator.hasNext()) {
    // More elements available
}
```

**next()** - Returns next element and moves forward
```java
String element = iterator.next();
```

**remove()** - Removes last element returned by next()
```java
while (iterator.hasNext()) {
    String element = iterator.next();
    if (element.equals("B")) {
        iterator.remove();  // Remove "B"
    }
}
```

### Complete Iterator Example
```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

Iterator<String> it = list.iterator();

// First iteration
it.hasNext();          // true (has "A")
String s1 = it.next(); // Returns "A", moves to next

// Second iteration
it.hasNext();          // true (has "B")
String s2 = it.next(); // Returns "B", moves to next

// Third iteration
it.hasNext();          // true (has "C")
String s3 = it.next(); // Returns "C", moves to end

// No more elements
it.hasNext();  // false
it.next();     // ✗ ERROR! NoSuchElementException
```

### Why Use Iterator?
1. **Safe removal**: Can remove while iterating
2. **Standard way**: Works with all collections
3. **Abstraction**: Don't need to know internal structure
4. **Forward traversal**: Consistent way to go through elements

---

## 10. ENHANCED FOR LOOP (For-Each)

### Concept
Simplified loop syntax for traversing collections/arrays. Cleaner and more readable.

### Syntax
```java
for (Type variable : collection) {
    // Use variable
}
```

### Basic Example
```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

// Enhanced for loop
for (String name : names) {
    System.out.println(name);
}

// Output:
// Alice
// Bob
// Charlie
```

### In the Code
```java
public void displayAllBuildings() {
    // ENHANCED FOR LOOP
    for (AbstractBuilding building : buildings) {
        building.displayBasicInfo();
    }
}

public ArrayList<AbstractBuilding> findBuildingsByType(BuildingType type) {
    ArrayList<AbstractBuilding> result = new ArrayList<>();
    
    // ENHANCED FOR LOOP to filter
    for (AbstractBuilding building : buildings) {
        if (building.getBuildingType() == type) {
            result.add(building);
        }
    }
    
    return result;
}
```

### Equivalent Traditional Loop
```java
// Enhanced for loop:
for (String name : names) {
    System.out.println(name);
}

// Is equivalent to:
for (int i = 0; i < names.size(); i++) {
    String name = names.get(i);
    System.out.println(name);
}
```

### Works with Arrays Too
```java
String[] array = {"A", "B", "C"};

// Enhanced for loop with array
for (String s : array) {
    System.out.println(s);
}
```

### Filtering Example
```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(25);
numbers.add(30);
numbers.add(15);

// Find all numbers greater than 20
for (int num : numbers) {
    if (num > 20) {
        System.out.println(num);
    }
}
// Output: 25, 30
```

### Advantages
1. **Cleaner syntax**: Less code to write
2. **No index errors**: Can't go out of bounds
3. **Readable**: Clear what you're iterating over
4. **Type-safe**: Compiler knows element type

### Limitations
1. **Can't modify collection**: Can't add/remove while iterating
2. **No index**: Don't know current position
3. **Forward only**: Can't go backwards
4. **No modification of element**: Can't change the element itself in the collection

### When to Use What

**Enhanced For Loop:**
```java
// When: Just need to read each element
for (AbstractBuilding building : buildings) {
    System.out.println(building.getName());  // Just reading
}
```

**Traditional For Loop:**
```java
// When: Need index or want to modify collection
for (int i = 0; i < buildings.size(); i++) {
    System.out.println("Building " + i + ": " + buildings.get(i).getName());
}
```

**Iterator:**
```java
// When: Need to remove while iterating
Iterator<AbstractBuilding> it = buildings.iterator();
while (it.hasNext()) {
    AbstractBuilding b = it.next();
    if (b.shouldRemove()) {
        it.remove();  // Safe removal with iterator
    }
}
```

---


## Common Mistakes to Avoid

### 1. Not handling exceptions at all
```java
// BAD - Program crashes
int result = 10 / 0;  // ArithmeticException!

// GOOD - Program continues
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

### 2. Catching Exception too broadly
```java
// BAD - Catches everything, can't handle specifically
try {
    // code
} catch (Exception e) {
    System.out.println("Error!");  // What error?
}

// GOOD - Specific exceptions first
try {
    // code
} catch (FileNotFoundException e) {
    System.out.println("File not found!");
} catch (IOException e) {
    System.out.println("IO error!");
}
```

### 3. Empty catch block
```java
// VERY BAD - Silently swallows errors
try {
    // code
} catch (Exception e) {
    // Do nothing - error is hidden!
}

// GOOD - At least log the error
try {
    // code
} catch (Exception e) {
    System.err.println("Error: " + e.getMessage());
    e.printStackTrace();
}
```

### 4. Modifying ArrayList while using enhanced for loop
```java
// BAD - Will throw ConcurrentModificationException
for (Building b : buildings) {
    if (b.isOld()) {
        buildings.remove(b);  // ✗ ERROR!
    }
}

// GOOD - Use iterator
Iterator<Building> it = buildings.iterator();
while (it.hasNext()) {
    Building b = it.next();
    if (b.isOld()) {
        it.remove();  // ✓ OK
    }
}
```

### 5. Using get() with wrong index
```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");

String s = list.get(5);  // ✗ ERROR! IndexOutOfBoundsException

// GOOD - Check size first
if (index >= 0 && index < list.size()) {
    String s = list.get(index);
}
```

### 6. Forgetting to clear scanner buffer
```java
// BAD
int number = scanner.nextInt();
String text = scanner.nextLine();  // Gets empty string!

// GOOD
int number = scanner.nextInt();
scanner.nextLine();  // Clear buffer
String text = scanner.nextLine();  // Now works correctly
```

---


**Complete Exception Handling Pattern:**
```java
try {
    // Code that might throw exception
    buildings.add(building);
} catch (SpecificException1 e) {
    // Handle specific case
} catch (SpecificException2 e) {
    // Handle another specific case
} catch (Exception e) {
    // Handle any other case
} finally {
    // Cleanup code (optional)
}
```

**ArrayList vs Array:**
```
Array:
- Fixed size
- buildings[0], buildings[1]
- Can't grow
- Simpler, faster

ArrayList:
- Dynamic size
- buildings.get(0), buildings.add()
- Grows automatically
- More flexible, more features
```


