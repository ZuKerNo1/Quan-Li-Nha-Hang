/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import View.ChonMon.ChonMonFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.HoaDon;
import model.MonAn;

/**
 *
 * @author DELL
 */
public class ManagerChiTietHoaDon {

    HoaDon hoaDon;
    ChonMonFrame chonMonFrame ;

    
    public void addMonAnToChiTietHoaDon(int idHoaDon, String idMA, int soLuong) throws SQLException {
        try{
                Connection connection = JDBCConnection.JDBCConnection();
                String sql = "insert into ChiTietHoaDon values (?,?,?)";
                PreparedStatement preparedStatement = connection.prepareCall(sql);
                preparedStatement.setInt(1, idHoaDon);
                preparedStatement.setString(2, idMA);
                preparedStatement.setInt(3, soLuong);
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
