package com.us.lot;

import com.us.lot.employee.salary.DeleteData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.UPDATE");
            System.out.println("3.DELETE");
            System.out.println("4.DISPLAY ALL");
            System.out.println("5.DISPLAY BY ID");
            System.out.println("6.Back to main");
            System.out.println("Enter the choices!!");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    AddEmployee addEmployee = new AddEmployee();
                    addEmployee.addEmployee();

                    break;

                case 2:
                    UpdateEmployee updateEmployee = new UpdateEmployee();
                    updateEmployee.updateEmployee();
                    break;

                case 3:
                    System.out.println("Enter  the id of employee you want to delete ");
                    int id = scanner.nextInt();
                    DeleteData.deleteCommissionEmployee(id);
                    break;
                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Back to main!");
                    break;

                    default:
                        System.out.println("Enter the valid choices!!");
            }
        }while (choice!=6);

    }
}