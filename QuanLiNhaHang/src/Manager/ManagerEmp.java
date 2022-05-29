/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AD
 */
public class ManagerEmp {
    public List<Employee> getAllEmployees_354() throws SQLException{
        List<Employee> employees_354 = new ArrayList<Employee>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from NhanVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Employee employee_354 = new Employee();
                employee_354.setId_354(rs.getString("idNV"));
                employee_354.setName_354(rs.getString("tenNV"));
                employee_354.setDob_354(rs.getString("ngaySinh"));
                employee_354.setGender_354(rs.getString("gioiTinh"));
                employee_354.setPhone_354(rs.getString("SDT"));         
                employee_354.setAddress_354(rs.getString("diaChi"));          
                employee_354.setRole_354(rs.getString("tenCV"));
                employee_354.setSalary_354(rs.getDouble("luong"));
                employee_354.setStatus_354(rs.getString("status"));
                employees_354.add(employee_354);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees_354;
    }
    
    public Employee getEmployeeById_354(String id_354) throws SQLException {

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from NhanVien where idNV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id_354);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
<<<<<<< HEAD
                Employee employee_354 = new Employee();
                employee_354.setId_354(rs.getString("idNV"));
                employee_354.setPhone_354(rs.getString("SDT"));
                employee_354.setName_354(rs.getString("tenNV"));
                employee_354.setAddress_354(rs.getString("diaChi")); 
                employee_354.setDob_354(rs.getString("ngaySinh"));
                employee_354.setGender_354(rs.getString("gioiTinh"));
                employee_354.setSalary_354(rs.getDouble("luong"));
                employee_354.setRole_354(rs.getString("tenCV"));
                employee_354.setStatus_354(rs.getString("status"));
                return employee_354;
=======
                Employee employee = new Employee();
                employee.setId_354(rs.getString("idNV"));
                employee.setPhone_354(rs.getString("SDT"));
                employee.setName_354(rs.getString("tenNV"));
                employee.setAddress_354(rs.getString("diaChi")); 
                employee.setDob_354(rs.getString("ngaySinh"));
                employee.setGender_354(rs.getString("gioiTinh"));
                employee.setSalary_354(rs.getDouble("luong"));
                employee.setRole_354(rs.getString("tenCV"));
                employee.setStatus_354(rs.getString("status"));
                return employee;
>>>>>>> DatBan
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
<<<<<<< HEAD
    public void addEmployee_354(Employee employee_354) throws SQLException {
=======
    public void addEmployee(Employee employee) throws SQLException {
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "set dateformat dmy Insert into NhanVien(idNV, tenNV, ngaySinh, gioiTinh, SDT, diaChi, luong, tenCV, status)"
                + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
<<<<<<< HEAD
            preparedStatement.setString(1, employee_354.getId_354());
            preparedStatement.setString(2, employee_354.getName_354());
            preparedStatement.setString(3, employee_354.getDob_354());
            preparedStatement.setString(4, employee_354.getGender_354());
            preparedStatement.setString(5, employee_354.getPhone_354());
            preparedStatement.setString(6, employee_354.getAddress_354());
            preparedStatement.setDouble(7, employee_354.getSalary_354());
            preparedStatement.setString(8, employee_354.getRole_354());
            preparedStatement.setString(9, employee_354.getStatus_354());
=======
            preparedStatement.setString(1, employee.getId_354());
            preparedStatement.setString(2, employee.getName_354());
            preparedStatement.setString(3, employee.getDob_354());
            preparedStatement.setString(4, employee.getGender_354());
            preparedStatement.setString(5, employee.getPhone_354());
            preparedStatement.setString(6, employee.getAddress_354());
            preparedStatement.setDouble(7, employee.getSalary_354());
            preparedStatement.setString(8, employee.getRole_354());
            preparedStatement.setString(9, employee.getStatus_354());
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateEmployee_354(Employee employee_354) throws SQLException{
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update NhanVien set tenNV = ?, diaChi = ?, ngaySinh = ?, gioiTinh = ?, SDT = ?, luong = ?, tenCV = ? , status = ? Where idNV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
<<<<<<< HEAD
            preparedStatement.setString(1, employee_354.getName_354());
            preparedStatement.setString(2, employee_354.getAddress_354());
            preparedStatement.setString(3, employee_354.getDob_354());
            preparedStatement.setString(4, employee_354.getGender_354());
            preparedStatement.setString(5, employee_354.getPhone_354());
            preparedStatement.setDouble(6, employee_354.getSalary_354());
            preparedStatement.setString(7, employee_354.getRole_354());
            preparedStatement.setString(8, employee_354.getStatus_354());
            preparedStatement.setString(9, employee_354.getId_354());
=======
            preparedStatement.setString(1, customer.getName_354());
            preparedStatement.setString(2, customer.getAddress_354());
            preparedStatement.setString(3, customer.getDob_354());
            preparedStatement.setString(4, customer.getGender_354());
            preparedStatement.setString(5, customer.getPhone_354());
            preparedStatement.setDouble(6, customer.getSalary_354());
            preparedStatement.setString(7, customer.getRole_354());
            preparedStatement.setString(8, customer.getStatus_354());
            preparedStatement.setString(9, customer.getId_354());
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteEmployee_354(String id_354) throws SQLException{
       Connection connection = JDBCConnection.JDBCConnection();
       String sql = "delete from NhanVien where idNV= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id_354);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
    public Employee findEmployee_354(String name_354) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from NhanVien where tenNV like N'%" + name_354 + "%'";
=======
    public Employee findBook(String name) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from NhanVien where tenNV like N'%" + name + "%'";
>>>>>>> DatBan
=======
    public Employee findBook(String name) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from NhanVien where tenNV like N'%" + name + "%'";
>>>>>>> DangNhap
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
<<<<<<< HEAD
<<<<<<< HEAD
                Employee employee_354 = new Employee();
                employee_354.setId_354(rs.getString("idNV"));
                employee_354.setName_354(rs.getString("tenNV"));
                employee_354.setAddress_354(rs.getString("diaChi"));
                employee_354.setDob_354(rs.getString("ngaySinh"));
                employee_354.setGender_354(rs.getString("gioiTinh"));
                employee_354.setPhone_354(rs.getString("SDT"));
                employee_354.setRole_354(rs.getString("tenCV"));
                employee_354.setSalary_354(rs.getDouble("luong"));
                employee_354.setStatus_354(rs.getString("status"));
                return employee_354;
=======
=======
>>>>>>> DangNhap
                Employee employee = new Employee();
                employee.setId_354(rs.getString("idNV"));
                employee.setName_354(rs.getString("tenNV"));
                employee.setAddress_354(rs.getString("diaChi"));
                employee.setDob_354(rs.getString("ngaySinh"));
                employee.setGender_354(rs.getString("gioiTinh"));
                employee.setPhone_354(rs.getString("SDT"));
                employee.setRole_354(rs.getString("tenCV"));
                employee.setSalary_354(rs.getDouble("luong"));
                employee.setStatus_354(rs.getString("status"));
                return employee;
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
