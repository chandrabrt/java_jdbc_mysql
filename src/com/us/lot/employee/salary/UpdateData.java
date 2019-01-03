package com.us.lot.employee.salary;

import com.us.lot.Jdbc_Connection.Database_Conectivity;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateData {

    public static boolean updateCommissionEmployee(Employee employee, ComissionEmployee comissionEmployee,int id) {
        String sql1 = "update employee set name=?,adreess=?,department=? where id=?";
        String sql2 = "update commission_employees set sales=?,rate=? where eid =?";
        Database_Conectivity connection =new Database_Conectivity();
        PreparedStatement ps;
        try{
            ps = connection.getConnection().prepareStatement(sql1);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getAddress());
            ps.setString(3,employee.getDepartment());
            ps.setInt(4,id);
            ps.executeUpdate();

            ps = connection.getConnection().prepareStatement(sql2);
            ps.setInt(1,comissionEmployee.getTotalSales());
            ps.setFloat(2,comissionEmployee.getRate());
            ps.setInt(3,id);

            int i2 = ps.executeUpdate();
            if (i2 != 0) {
                System.out.println("updated into commission table");
            } else {
                System.out.println("not Updated");
            }
            return true;
        }catch (SQLException e){
            System.out.println("Update fails");
        }
        return false;
    }


    public static boolean updateSalary(Employee employee, SalaryEmployee salaryEmployee,int id) {
        String sql1 = "update employee set name=?,adreess=?,department=? where id=?";
        String sql2 = "update salary_employee set basic_salary=? where eid =?";
        Database_Conectivity connection =new Database_Conectivity();
        PreparedStatement ps;
        try{
            ps = connection.getConnection().prepareStatement(sql1);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getAddress());
            ps.setString(3,employee.getDepartment());
            ps.setInt(4,id);
            ps.executeUpdate();

            ps = connection.getConnection().prepareStatement(sql2);
            ps.setDouble(1,salaryEmployee.getBasic_salary());
            ps.setInt(2,id);

            int i2 = ps.executeUpdate();
            if (i2 != 0) {
                System.out.println("updated into salary table");
            } else {
                System.out.println("not Updated");
            }
            return true;
        }catch (SQLException e){
            System.out.println("Update fails");
        }
        return false;
    }


    public static boolean updateBasicPlusCommissionEmployee(Employee employee, BasicPlusCommission basicPlusCommission,int id) {
        String sql1 = "update employee set name=?,adreess=?,department=?,type=? where id=?";
        String sql2 = "update basic_pulse_commission_employee set salary=? where eid=?";
        Database_Conectivity connection =new Database_Conectivity();
        PreparedStatement ps;
        try{
            ps = connection.getConnection().prepareStatement(sql1);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getAddress());
            ps.setString(3,employee.getDepartment());
            ps.setInt(4,id);
            ps.executeUpdate();

            ps = connection.getConnection().prepareStatement(sql2);
            ps.setDouble(1,basicPlusCommission.getBasicSalary());
            ps.setInt(2,id);

            int i2 = ps.executeUpdate();
            if (i2 != 0) {
                System.out.println("updated into basic plus commission table");
            } else {
                System.out.println("not Updated");
            }
            return true;
        }catch (SQLException e){
            System.out.println("Update fails");
        }
        return false;
    }
}
