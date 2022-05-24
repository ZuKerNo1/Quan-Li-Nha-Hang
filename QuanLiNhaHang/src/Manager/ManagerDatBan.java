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


/**
 *
 * @author ACER
 */
public class ManagerDatBan {
    public List<DatBan> getAllListDatBan() throws SQLException {
        List<DatBan> listDatBans = new ArrayList<DatBan>();
        String sql = "select * from DatBan";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DatBan listDatBan = new DatBan();
                listDatBan.setName_352(rs.getString("Họ tên"));
                listDatBan.setPhone_352(rs.getString("SĐT"));
                listDatBan.setRole_352(rs.getString("Tên nhân viên"));
                listDatBan.setAddress_352(rs.getString("Địa chỉ"));
                listDatBan.setDob_352(rs.getString("Ngày đặt"));
                listDatBan.setRequest_352(rs.getString("Yêu cầu đặc biệt"));
                listDatBan.setGender_352(rs.getString("Giới tính"));
                
                listDatBans.add(listDatBan);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listDatBans;
    }
  
    
    public void addDatBan(DatBan datban) throws SQLException {
        Connection connection =  JDBCConnection.JDBCConnection();
        String sql = "Insert into Datban(tenKH, SDT, tenNVPT, diaChi, ngayDat, yeuCau, gioiTinh)"
                + "Values(?, ?, ?, ?, ?, ?, ?)";
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateDatBan(DatBan datban) throws SQLException{
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
    }
    
    /*public void deleteEmployee(String id) throws SQLException{
       Connection connection = JDBCConnection.JDBCConnection();
       String sql = "delete from NhanVien where idNV= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Employee findEmployee(Employee employee) throws SQLException {
        List<Employee> listemployee = new ArrayList<>();
        listemployee = getAllEmployees();
        for (Employee s : listemployee) {
            if (employee.getId_354().equals(s.getId_354())) {
                return s;
            }
        }
        return null;
    }*/

}
