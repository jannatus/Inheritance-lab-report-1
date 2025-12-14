// File: Main.java

class Employee {
    protected String name;
    protected int id;
    protected double basicSalary;

    // Constructor
    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Displays employee info
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int id, double basicSalary, String department) {
        super(name, id, basicSalary);
        this.department = department;
    }

    // Overridden method
    @Override
    public void displayInfo() {
        super.displayInfo();  // prints inherited fields
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        // Employee object
        Employee emp = new Employee("chowa", 242002042, 50000);
        System.out.println("=== Employee Info ===");
        emp.displayInfo();

        System.out.println();

        // Manager object
        Manager mgr = new Manager("Bobi", 242002054, 75000, "HR");
        System.out.println("=== Manager Info ===");
        mgr.displayInfo();  // shows overridden behavior
    }
}