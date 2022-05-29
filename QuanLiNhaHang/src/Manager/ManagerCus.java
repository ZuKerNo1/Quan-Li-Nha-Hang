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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public List<Customer> getAllCustomers_354() throws SQLException{
        List<Customer> customers_354 = new ArrayList<Customer>();
=======
    public List<Customer> getAllCustomers() throws SQLException{
        List<Customer> customers = new ArrayList<Customer>();
>>>>>>> DatBan
=======
    public List<Customer> getAllCustomers() throws SQLException{
        List<Customer> customers = new ArrayList<Customer>();
>>>>>>> DangNhap
=======
    public List<Customer> getAllCustomers() throws SQLException{
        List<Customer> customers = new ArrayList<Customer>();
>>>>>>> ThongKe

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from KhachHang";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                Customer customer_354 = new Customer();
                customer_354.setName_354(rs.getString("tenKH"));
                customer_354.setDob_354(rs.getString("ngaySinh"));
                customer_354.setGender_354(rs.getString("gioiTinh"));
                customer_354.setPhone_354(rs.getString("SDT"));         
                customer_354.setAddress_354(rs.getString("diaChi"));
                customers_354.add(customer_354);
=======
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
                Customer customer = new Customer();
                customer.setName_354(rs.getString("tenKH"));
                customer.setDob_354(rs.getString("ngaySinh"));
                customer.setGender_354(rs.getString("gioiTinh"));
                customer.setPhone_354(rs.getString("SDT"));         
                customer.setAddress_354(rs.getString("diaChi"));
                customers.add(customer);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
        return customers;
    }
    
    public void addCustomer(Customer customer) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Insert into KhachHang( tenKH, ngaySinh, gioiTinh, SDT, diaChi)"
                + "Values( ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            

            preparedStatement.setString(1, customer.getName_354());
            preparedStatement.setString(2, customer.getDob_354());
            preparedStatement.setString(3, customer.getGender_354());
            preparedStatement.setString(4, customer.getPhone_354());
            preparedStatement.setString(5, customer.getAddress_354());
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public Customer getCustomerById_354(String sdt) throws SQLException {
=======
    public Customer getCustomerById(String sdt) throws SQLException {
>>>>>>> DatBan
=======
    public Customer getCustomerById(String sdt) throws SQLException {
>>>>>>> DangNhap
=======
    public Customer getCustomerById(String sdt) throws SQLException {
>>>>>>> ThongKe

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from KhachHang where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sdt);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                Customer customer_354 = new Customer();
                customer_354.setPhone_354(rs.getString("SDT"));
                customer_354.setName_354(rs.getString("tenKH"));
                customer_354.setAddress_354(rs.getString("diaChi")); 
                customer_354.setDob_354(rs.getString("ngaySinh"));
                customer_354.setGender_354(rs.getString("gioiTinh"));
                return customer_354;
=======
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
                Customer customer = new Customer();
                customer.setPhone_354(rs.getString("SDT"));
                customer.setName_354(rs.getString("tenKH"));
                customer.setAddress_354(rs.getString("diaChi")); 
                customer.setDob_354(rs.getString("ngaySinh"));
                customer.setGender_354(rs.getString("gioiTinh"));
                return customer;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }  
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public void updateCustomer_354(Customer customer_354) throws SQLException{
=======
    public void updateCustomer(Customer customer) throws SQLException{
>>>>>>> DatBan
=======
    public void updateCustomer(Customer customer) throws SQLException{
>>>>>>> DangNhap
=======
    public void updateCustomer(Customer customer) throws SQLException{
>>>>>>> ThongKe
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update KhachHang set tenKH = ?, diaChi = ?, ngaySinh = ?, gioiTinh = ? Where SDT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            preparedStatement.setString(1, customer_354.getName_354());
            preparedStatement.setString(2, customer_354.getAddress_354());
            preparedStatement.setString(3, customer_354.getDob_354());
            preparedStatement.setString(4, customer_354.getGender_354());
            preparedStatement.setString(5, customer_354.getPhone_354());
=======
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
            preparedStatement.setString(1, customer.getName_354());
            preparedStatement.setString(2, customer.getAddress_354());
            preparedStatement.setString(3, customer.getDob_354());
            preparedStatement.setString(4, customer.getGender_354());
            preparedStatement.setString(5, customer.getPhone_354());
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public void deleteCustomer_354(String id) throws SQLException{
=======
    public void deleteCustomer(String id) throws SQLException{
>>>>>>> DatBan
=======
    public void deleteCustomer(String id) throws SQLException{
>>>>>>> DangNhap
=======
    public void deleteCustomer(String id) throws SQLException{
>>>>>>> ThongKe
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public Customer findCustomer_354(String find) throws SQLException {
=======
    public Customer findBook(String find) throws SQLException {
>>>>>>> DatBan
=======
    public Customer findBook(String find) throws SQLException {
>>>>>>> DangNhap
=======
    public Customer findBook(String find) throws SQLException {
>>>>>>> ThongKe
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from KhachHang where tenKH like N'%" + find + "%' or diaChi like N'%" 
                + find + "%' or ngaySinh like N'%" + find + "%' or gioiTinh like N'%" + find + "%' or SDT like '%" + find + "%'";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                Customer customer_354 = new Customer();
                customer_354.setName_354(rs.getString("tenKH"));
                customer_354.setAddress_354(rs.getString("diaChi"));
                customer_354.setDob_354(rs.getString("ngaySinh"));
                customer_354.setGender_354(rs.getString("gioiTinh"));
                customer_354.setPhone_354(rs.getString("SDT"));
                return customer_354;
=======
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
                Customer customer = new Customer();
                customer.setName_354(rs.getString("tenKH"));
                customer.setAddress_354(rs.getString("diaChi"));
                customer.setDob_354(rs.getString("ngaySinh"));
                customer.setGender_354(rs.getString("gioiTinh"));
                customer.setPhone_354(rs.getString("SDT"));
                return customer;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
