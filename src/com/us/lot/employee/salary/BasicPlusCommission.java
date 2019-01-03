package com.us.lot.employee.salary;

import java.util.Scanner;

public class BasicPlusCommission extends ComissionEmployee {

    private double basicSalary;



    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalry) {
        this.basicSalary = basicSalry;
    }

    @Override
    public BasicPlusCommission addEmployee(){
        BasicPlusCommission basicPlusCommission = new BasicPlusCommission();
        Scanner scanner = new Scanner(System.in);
        System.out.println("salary:");
        basicPlusCommission.setBasicSalary(scanner.nextDouble());
        return basicPlusCommission;
    }

    @Override
    public double totalSalary(){
        return this.basicSalary+ super.totalSalary();
    }

    @Override
    public String toString(){
        return super.toString()+"\n"
                +" Basic Salary: "
                +this.basicSalary;

    }
}
