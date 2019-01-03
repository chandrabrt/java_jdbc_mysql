package com.us.lot.employee.salary;

import com.us.lot.Jdbc_Connection.Database_Conectivity;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

    public static boolean deleteCommissionEmployee(int id) {
        String sql1 = "delete from employee where id=?";
        String sql2 = "delete from commission_employees where eid =?";
        String sql3 = "delete from salary_employee where eid =?";
        String sql4 = "delete from basic_pulse_commission_employee where eid=?";

        Database_Conectivity connection =new Database_Conectivity();
        PreparedStatement ps;
        try{
            //delete from table employee
            ps = connection.getConnection().prepareStatement(sql1);
            ps.setInt(1,id);
            int i1 = ps.executeUpdate();

            //for table commission employee
            ps = connection.getConnection().prepareStatement(sql2);
            ps.setInt(1,id);
            ps.executeUpdate();


            //delete from table salary employee
            ps = connection.getConnection().prepareStatement(sql3);
            ps.setInt(1,id);
            ps.executeUpdate();

            //delete from table basic plus commission
            ps = connection.getConnection().prepareStatement(sql4);
            ps.setInt(1,id);

            int i2 = ps.executeUpdate();
            if (i2 != 0) {
                System.out.println("deleted records from commission table");
            }
            return true;
        }catch (SQLException e){
            System.out.println("Update fails");
        }
        return false;
    }

}
