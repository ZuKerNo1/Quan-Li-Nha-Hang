/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.DatBan;
import model.Employee;
import model.Table;

/**
 *
 * @author ACER
 */
public class ManagerDatBan {
    public List<DatBan> getAllListDatBan_352() throws SQLException {
        List<DatBan> listDatBans = new ArrayList<DatBan>();
        String sql = "select * from DatBan";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DatBan listDatBan = new DatBan();
                listDatBan.setPhone_352(rs.getString("SĐT"));
                listDatBan.setName_352(rs.getString("Họ tên")); 
                listDatBan.setRole_352(rs.getString("Tên nhân viên"));
                listDatBan.setAddress_352(rs.getString("Địa chỉ"));
                listDatBan.setDayDat_352(rs.getString("Ngày đặt"));
                listDatBan.setRequest_352(rs.getString("Yêu cầu đặc biệt"));
                listDatBan.setGender_352(rs.getString("Giới tính"));
                listDatBan.setIdBA_352(rs.getString("IDBA"));
                listDatBans.add(listDatBan);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listDatBans;
    }
  
    
    public void addDatBan_352(DatBan datban) throws SQLException {
        Connection connection =  JDBCConnection.JDBCConnection();
        String sql = "Insert into Datban(SDT, tenKH,  tenNVPT, diaChi, ngayDat, yeuCau, gioiTinh, idBA)"
                + "Values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, datban.getPhone_352());
                preparedStatement.setString(2, datban.getName_352());               
                preparedStatement.setString(3, datban.getRole_352());
                preparedStatement.setString(4, datban.getAddress_352());
                preparedStatement.setString(5, datban.getDayDat_352());
                preparedStatement.setString(6, datban.getRequest_352());
                preparedStatement.setString(7, datban.getGender_352());
                preparedStatement.setString(8, datban.getIdBA_352());
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   /* public void updateDatBan(DatBan datban) throws SQLException{
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update DatBan set tenKH = ?, SDT = ?, tenNVPT = ?, diaChi = ?, ngayDat = ?, yeuCau = ? gioiTinh = ? Where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, datban.getName_352());
            preparedStatement.setString(2, datban.getPhone_352());
            preparedStatement.setString(3, datban.getRole_352());
            preparedStatement.setString(4, datban.getAddress_352());
            preparedStatement.setString(5, datban.getDob_352());
            preparedStatement.setString(6, datban.getRequest_352());
            preparedStatement.setString(7, datban.getGender_352());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    public void deleteDatBan_352(String id) throws SQLException{
       Connection connection = JDBCConnection.JDBCConnection();
       String sql = "delete from DatBan where idBA= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
        }
    }
    
    public void chuyenTrangThai_DatBan(String id) throws SQLException{
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "update BanAn\n" +
        "set trangThaiBan = N'Đã đặt bàn'\n" +
        "where idBA = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
        }
    }

}