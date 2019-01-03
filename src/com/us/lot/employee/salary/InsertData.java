package com.us.lot.employee.salary;

import com.us.lot.Jdbc_Connection.Database_Conectivity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

    public static boolean insertData(Employee employee, ComissionEmployee comissionEmployee){

        String sql1 = "insert into employee(name,adreess,department,type) values(?,?,?,?)";
        String sql2 = "insert into commission_employees(sales,rate,eid) values(?,?,?)";
        Database_Conectivity connection =new Database_Conectivity();
        PreparedStatement ps;
        ResultSet rs = null;

        try{
//            connection.getConnection().setAutoCommit(false);
            ps = connection.getConnection().prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getAddress());
            ps.setString(3,employee.getDepartment());
            ps.setInt(4,Salary.Commission_employee.ordinal());


            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs != null && rs.next()){
                int id =rs.getInt(1);
                employee.setID(id);
            }

            ps = connection.getConnection().prepareStatement(sql2);
            ps.setInt(1,comissionEmployee.getTotalSales());
            ps.setFloat(2,comissionEmployee.getRate());
            ps.setInt(3,employee.getID());

            int i2 = ps.executeUpdate();
            if (i2 != 0) {
                System.out.println("Inserted into commission table");
            } else {
                System.out.println("no t Inserted");
            }

            return true;
        }catch (SQLException e){
            System.out.println("update not found");
        }

    return false;
    }

    //insert data into Salary Employee

    public static boolean insertSalary(Employee employee, SalaryEmployee salaryEmployee){
        String sql1 = "insert into employee(name,adreess,department,type) values(?,?,?,?)";
        String sql2 = "insert into salary_employee(basic_salary,eid) values(?,?)";
        Database_Conectivity connection =new Database_Conectivity();
        PreparedStatement ps;
        ResultSet rs = null;
        try{
            ps = connection.getConnection().prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getAddress());
            ps.setString(3,employee.getDepartment());
            ps.setInt(4,Salary.SALARY_employee.ordinal());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs != null && rs.next()){
                int id =rs.getInt(1);
                System.out.println(id);
                employee.setID(id);
            }

            ps = connection.getConnection().prepareStatement(sql2);
            ps.setDouble(1,salaryEmployee.getBasic_salary());
            ps.setInt(2,employee.getID());

            int i2 = ps.executeUpdate();
            if (i2 != 0) {
                System.out.println(" Inserted into salary table");
            } else {
                System.out.println("no t Inserted");
            }

            return true;
        }catch (SQLException e){
            System.out.println("update not found");
        }

        return false;
    }

    //insert basic plus commission data
    public static boolean insertBasicPlusCommission(Employee employee, BasicPlusCommission basicPlusCommission){
        String sql1 = "insert into employee(name,adreess,department,type) values(?,?,?,?)";
        String sql2 = "insert into basic_pulse_commission_employee(salary,eid) values(?,?)";
        Database_Conectivity connection =new Database_Conectivity();
        PreparedStatement ps;
        ResultSet rs = null;
        try{
            ps = connection.getConnection().prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getAddress());
            ps.setString(3,employee.getDepartment());
            ps.setInt(4,Salary.Basic_plus_salary.ordinal());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs != null && rs.next()){
                int id =rs.getInt(1);
                System.out.println(id);
                employee.setID(id);
            }

            ps = connection.getConnection().prepareStatement(sql2);
            ps.setDouble(1,basicPlusCommission.getBasicSalary());
            ps.setInt(2,employee.getID());

            int i2 = ps.executeUpdate();
            if (i2 != 0) {
                System.out.println(" Inserted base plus commission table");
            } else {
                System.out.println("no t Inserted");
            }

            return true;
        }catch (SQLException e){
            System.out.println("update not found");
        }

        return false;
    }


}
