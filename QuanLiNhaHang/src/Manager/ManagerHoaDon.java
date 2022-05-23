/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.HoaDon;

/**
 *
 * @author DELL
 */
public class ManagerHoaDon {
    public void addHoaDon() throws SQLException { 
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into HoaDon(ngayThanhToan) values (getdate())";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

