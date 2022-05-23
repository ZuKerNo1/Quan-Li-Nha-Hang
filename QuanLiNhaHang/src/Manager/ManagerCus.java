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
    public List<Customer> getAllCustomers() throws SQLException{
        List<Customer> customers = new ArrayList<Customer>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from KhachHang";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setName_354(rs.getString("tenKH"));
                customer.setDob_354(rs.getString("ngaySinh"));
                customer.setGender_354(rs.getString("gioiTinh"));
                customer.setPhone_354(rs.getString("SDT"));         
                customer.setAddress_354(rs.getString("diaChi"));
                customers.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }
    
    public Customer getCustomerById(String sdt) throws SQLException {

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from KhachHang where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sdt);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setPhone_354(rs.getString("SDT"));
                customer.setName_354(rs.getString("tenKH"));
                customer.setAddress_354(rs.getString("diaChi")); 
                customer.setDob_354(rs.getString("ngaySinh"));
                customer.setGender_354(rs.getString("gioiTinh"));
                return customer;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }  
    public void updateCustomer(Customer customer) throws SQLException{
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update KhachHang set tenKH = ?, diaChi = ?, ngaySinh = ?, gioiTinh = ? Where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.getName_354());
            preparedStatement.setString(2, customer.getAddress_354());
            preparedStatement.setString(3, customer.getDob_354());
            preparedStatement.setString(4, customer.getGender_354());
            preparedStatement.setString(5, customer.getPhone_354());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteCustomer(String id) throws SQLException{
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
    public Customer findCustomer(Customer customer) throws SQLException {
        List<Customer> listcustomer = new ArrayList<>();
        listcustomer = getAllCustomers();
        for (Customer s : listcustomer) {
            if (customer.getName_354().equals(s.getName_354())) {
                return s;
            }
        }
        return null;
    }
}
