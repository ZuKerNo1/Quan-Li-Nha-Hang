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
import java.util.List;
import model.Customer;

/**
 *
 * @author AD
 */
public class ManagerCus {
    public List<Customer> getAllCustomers_354() throws SQLException{
        List<Customer> customers_354 = new ArrayList<Customer>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from KhachHang";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Customer customer_354 = new Customer();
                customer_354.setName_354(rs.getString("tenKH"));
                customer_354.setDob_354(rs.getString("ngaySinh"));
                customer_354.setGender_354(rs.getString("gioiTinh"));
                customer_354.setPhone_354(rs.getString("SDT"));         
                customer_354.setAddress_354(rs.getString("diaChi"));
                customers_354.add(customer_354);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers_354;
    }
    
    public void addCustomer_354(Customer customer_354) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "set dateformat dmy Insert into KhachHang(tenKH, ngaySinh, gioiTinh, SDT, diaChi)"
                + "Values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer_354.getName_354());
            preparedStatement.setString(2, customer_354.getDob_354());
            preparedStatement.setString(3, customer_354.getGender_354());
            preparedStatement.setString(4, customer_354.getPhone_354());
            preparedStatement.setString(5, customer_354.getAddress_354());
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Customer getCustomerById_354(String sdt) throws SQLException {

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from KhachHang where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sdt);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Customer customer_354 = new Customer();
                customer_354.setPhone_354(rs.getString("SDT"));
                customer_354.setName_354(rs.getString("tenKH"));
                customer_354.setAddress_354(rs.getString("diaChi")); 
                customer_354.setDob_354(rs.getString("ngaySinh"));
                customer_354.setGender_354(rs.getString("gioiTinh"));
                return customer_354;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }  
    public void updateCustomer_354(Customer customer_354) throws SQLException{
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update KhachHang set tenKH = ?, diaChi = ?, ngaySinh = ?, gioiTinh = ? Where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer_354.getName_354());
            preparedStatement.setString(2, customer_354.getAddress_354());
            preparedStatement.setString(3, customer_354.getDob_354());
            preparedStatement.setString(4, customer_354.getGender_354());
            preparedStatement.setString(5, customer_354.getPhone_354());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteCustomer_354(String id) throws SQLException{
       Connection connection = JDBCConnection.JDBCConnection();
       String sql = "delete from KhachHang where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // public Customer findCustomer_354(String find) throws SQLException {
    //     Connection connection = JDBCConnection.JDBCConnection();
    //     String sql = "select * from KhachHang where tenKH like N'%" + find + "%' or diaChi like N'%" 
    //             + find + "%' or ngaySinh like N'%" + find + "%' or gioiTinh like N'%" + find + "%' or SDT like '%" + find + "%'";
    //     try{
    //         PreparedStatement preparedStatement = connection.prepareStatement(sql);
    //         ResultSet rs = preparedStatement.executeQuery();
    //         while (rs.next()) {
    //             Customer customer_354 = new Customer();
    //             customer_354.setName_354(rs.getString("tenKH"));
    //             customer_354.setAddress_354(rs.getString("diaChi"));
    //             customer_354.setDob_354(rs.getString("ngaySinh"));
    //             customer_354.setGender_354(rs.getString("gioiTinh"));
    //             customer_354.setPhone_354(rs.getString("SDT"));
    //             return customer_354;
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     return null;
    // }
}
