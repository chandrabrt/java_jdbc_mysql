package com.us.lot;

import com.us.lot.employee.salary.*;

import java.util.Scanner;

public class AddEmployee {
    private Scanner scanner = new Scanner(System.in);
    //create instances
    private Employee employee = new Employee();
    private ComissionEmployee comissionEmployee = new ComissionEmployee();
    private SalaryEmployee salaryEmployee = new SalaryEmployee();
    private BasicPlusCommission basicPlusCommission = new BasicPlusCommission();

    public AddEmployee addEmployee() {
        AddEmployee addEmployee = new AddEmployee();
        int choice = 0;
        do {
            System.out.println("1.Commission");
            System.out.println("2.salary");
            System.out.println("3.basic plus salary");
            System.out.println("4.Back to main");
            System.out.println("Enter the choices!!");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    InsertData.insertData(employee.addEmployee(),comissionEmployee.addEmployee());
                    break;

                case 2:
                    InsertData.insertSalary(employee.addEmployee(),salaryEmployee.addEmployee());

                    break;

                case 3:
                    InsertData.insertBasicPlusCommission(employee.addEmployee(),basicPlusCommission.addEmployee());

                    break;

                case 4:
                    System.out.println("Back to main!");
                    break;

                default:
                    System.out.println("Enter the valid choices!!");
            }
        } while (choice != 4);
        return addEmployee;
    }

}
