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

//    public MonAn getMonAnByName(String tenMon) throws SQLException {
//        Connection connection = JDBCConnection.JDBCConnection();
//        String sql = "select idMonAn from MonAn where tenMonAn=?";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, tenMon);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                MonAn mon = new MonAn();
//                mon.setIdMon(rs.getString("idMonAn"));
//                mon.setTenMon(rs.getString("tenMonAn"));
//                mon.setDonGia(rs.getString("donGia"));
//                return mon;
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
    
    public void addMonAnToChiTietHoaDon(int idHoaDon, String idMA, int soLuong) throws SQLException {
        try{
                Connection connection = JDBCConnection.JDBCConnection();
                String sql = "insert into ChiTietHoaDon values (?,?,?)";
                PreparedStatement preparedStatement = connection.prepareCall(sql);
                preparedStatement.setInt(1, idHoaDon);
                preparedStatement.setString(2, idMA);
                preparedStatement.setInt(3, soLuong);
                ResultSet rs = preparedStatement.executeQuery();
                System.out.println(rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
