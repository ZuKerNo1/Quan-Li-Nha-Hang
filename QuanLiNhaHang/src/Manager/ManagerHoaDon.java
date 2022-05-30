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
import model.HoaDon;

/**
 *
 * @author DELL
 */
public class ManagerHoaDon {
    public void addHoaDon(String idBA, String idNV) throws SQLException {
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into HoaDon(ngayThanhToan, idBA, idNV, status) values (getdate(),?,?,N'Chưa thanh toán')";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, idBA);
            preparedStatement.setString(2, idNV);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getIDHoaDon(String idBA) throws SQLException{
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select idHoaDon from HoaDon where idBA = ? and status = N'Chưa thanh toán'";
        PreparedStatement preparedStatement = connection.prepareCall(sql);
        preparedStatement.setString(1, idBA);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            HoaDon hd = new HoaDon();
            hd.setIdHoaDon(rs.getInt("idHoaDon"));
            return hd.getIdHoaDon();
        }
        return 0;
    }
    
    public void chuyenTrangThai_HoaDon(String id) throws SQLException{
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "update HoaDon\n" +
        "set status = N'Đã thanh toán'\n" +
        "where idBA = ? and status = N'Chưa thanh toán'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
        }
    }
}

