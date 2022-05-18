/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerEmployee;

import ManagerCustomer.ConnectDatabase;
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
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<Employee>();

        Connection connection = ConnectDatabase.getConnectionDatabase();
        String sql = "select * from NhanVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId_354(rs.getString("idNV"));
                employee.setName_354(rs.getString("tenNV"));
                employee.setDob_354(rs.getString("ngaySinh"));
                employee.setGender_354(rs.getString("gioiTinh"));
                employee.setPhone_354(rs.getString("SDT"));         
                employee.setAddress_354(rs.getString("diaChi"));          
                employee.setRole_354(rs.getString("tenCV"));
                employee.setSalary_354(rs.getDouble("luong"));
                employee.setStatus_354(rs.getString("status"));
                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
    
    public Employee getEmployeeById(String id) throws SQLException {

        Connection connection = ConnectDatabase.getConnectionDatabase();
        String sql = "select * from NhanVien where idNV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId_354(rs.getString("idNV"));
                employee.setPhone_354(rs.getString("SDT"));
                employee.setName_354(rs.getString("tenNV"));
                employee.setAddress_354(rs.getString("diaChi")); 
                employee.setDob_354(rs.getString("ngaySinh"));
                employee.setGender_354(rs.getString("gioiTinh"));
                employee.setSalary_354(rs.getDouble("luong"));
                employee.setRole_354(rs.getString("tenCV"));
                return employee;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void addEmployee(Employee employee) throws SQLException {
        Connection connection =  ConnectDatabase.getConnectionDatabase();
        String sql = "Insert into NhanVien(idNV, tenNV, ngaySinh, gioiTinh, SDT, diaChi, luong, tenCV)"
                + "Values(?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getId_354());
            preparedStatement.setString(2, employee.getName_354());
            preparedStatement.setString(3, employee.getDob_354());
            preparedStatement.setString(4, employee.getGender_354());
            preparedStatement.setString(5, employee.getPhone_354());
            preparedStatement.setString(6, employee.getAddress_354());
            preparedStatement.setDouble(7, employee.getSalary_354());
            preparedStatement.setString(8, employee.getRole_354());
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateEmployee(Employee customer) throws SQLException{
        Connection connection = ConnectDatabase.getConnectionDatabase();
        String sql = "Update NhanVien set tenNV = ?, diaChi = ?, ngaySinh = ?, gioiTinh = ?, SDT = ?, luong = ? Where idNV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.getName_354());
            preparedStatement.setString(2, customer.getAddress_354());
            preparedStatement.setString(3, customer.getDob_354());
            preparedStatement.setString(4, customer.getGender_354());
            preparedStatement.setString(5, customer.getPhone_354());
            preparedStatement.setDouble(6, customer.getSalary_354());
            preparedStatement.setString(7, customer.getId_354());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteEmployee(String id) throws SQLException{
       Connection connection = ConnectDatabase.getConnectionDatabase();
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
    }
}
