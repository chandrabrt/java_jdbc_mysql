package com.us.lot.employee.salary;

import java.util.Scanner;

public class SalaryEmployee extends Employee {
    private double basic_salary;
    private int eid;

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public SalaryEmployee addEmployee(){
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("basic salary");
        salaryEmployee.setBasic_salary(scanner.nextDouble());
        return salaryEmployee;
    }
}
