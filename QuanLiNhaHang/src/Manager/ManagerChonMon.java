/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MonAn;

/**
 *
 * @author DELL
 */
public class ManagerChonMon {
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
//                
//                return mon;
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
//    
//    public void addMonAn(MonAn mon) throws SQLException {
////        for()
//        try {
//            Connection connection = JDBCConnection.JDBCConnection();
//            String sql = "insert into ChiTietHoaDon values (?,?,?,?)";
//            PreparedStatement preparedStatement = connection.prepareCall(sql);
//            preparedStatement.setString(1, nguyenLieu.getIdNL_360());
//            preparedStatement.setString(2, nguyenLieu.getNameNL_360());
//            preparedStatement.setInt(3, nguyenLieu.getSoLuong_360());
//            preparedStatement.setString(4, nguyenLieu.getDonVi_360());
//            preparedStatement.setString(5, nguyenLieu.getNhanVienCapNhap_360());
//            int rs = preparedStatement.executeUpdate();
//            System.out.println(rs);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
