package com.us.lot.employee.salary;

import java.util.Scanner;

public class Employee {
    private String name;
    private int ID;
    private String address;
    private String department;
    private int salary_type;

    public int getSalary_type() {
        return salary_type;
    }

    public void setSalary_type(int salary_type) {
        this.salary_type = salary_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee addEmployee(){
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("name:");
        employee.setName(scanner.next());

        System.out.println("address: ");
        employee.setAddress(scanner.next());

        System.out.println("department:");
        employee.setDepartment(scanner.next());

        return employee;
    }

    @Override
    public String toString() {
        return "name: "
                + this.getName()
                + " ID:: "
                + this.getID()
                + " Addres:: "
                + this.getAddress()
                + " Department:: "
                +this.getDepartment();

    }
}