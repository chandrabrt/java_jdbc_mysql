package com.us.lot;

import com.us.lot.employee.salary.*;

import java.util.Scanner;

public class UpdateEmployee {
    private Scanner scanner = new Scanner(System.in);
    //create instances
    private Employee employee = new Employee();
    private ComissionEmployee comissionEmployee = new ComissionEmployee();
    private SalaryEmployee salaryEmployee = new SalaryEmployee();
    private BasicPlusCommission basicPlusCommission = new BasicPlusCommission();

    public UpdateEmployee updateEmployee() {
        UpdateEmployee updateEmployee = new UpdateEmployee();
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
                    System.out.println("Enter the id ");
                    int id = scanner.nextInt();
                    UpdateData.updateCommissionEmployee(employee.addEmployee(),comissionEmployee.addEmployee(),id);
                    break;

                case 2:
                    System.out.println("Enter the id ");
                    int id1 = scanner.nextInt();
                    UpdateData.updateSalary(employee.addEmployee(),salaryEmployee.addEmployee(),id1);
                    break;

                case 3:
                    System.out.println("Enter the id ");
                    int id2 = scanner.nextInt();
                    UpdateData.updateBasicPlusCommissionEmployee(employee.addEmployee(),basicPlusCommission.addEmployee(),id2);
                    break;

                case 4:
                    System.out.println("Back to main!");
                    break;

                default:
                    System.out.println("Enter the valid choices!!");
            }
        } while (choice != 4);
        return updateEmployee;
    }

}
