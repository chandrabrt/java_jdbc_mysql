package com.us.lot.employee.salary;


import java.util.Scanner;

public class ComissionEmployee extends Employee{

    private int totalSales;
    private float rate;
    private Employee employee;
    private int eid;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double totalSalary(){
        return this.totalSales * this.rate;
    }

    @Override
    public ComissionEmployee addEmployee(){
        ComissionEmployee commissionEmployee = new ComissionEmployee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("totalSales:");
        commissionEmployee.setTotalSales(scanner.nextInt());

        System.out.println("rate::");
        commissionEmployee.setRate(scanner.nextFloat());
        return commissionEmployee;
    }

    @Override
    public String toString(){
        return super.toString()
                +"\n"
                +" Total sales:: "
                +this.getTotalSales()
                +" Rate:: "
                +this.getRate();
    }
}
