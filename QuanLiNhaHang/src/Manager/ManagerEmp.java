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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void addEmployee_354(Employee employee_354) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "set dateformat dmy Insert into NhanVien(idNV, tenNV, ngaySinh, gioiTinh, SDT, diaChi, luong, tenCV, status)"
                + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee_354.getId_354());
            preparedStatement.setString(2, employee_354.getName_354());
            preparedStatement.setString(3, employee_354.getDob_354());
            preparedStatement.setString(4, employee_354.getGender_354());
            preparedStatement.setString(5, employee_354.getPhone_354());
            preparedStatement.setString(6, employee_354.getAddress_354());
            preparedStatement.setDouble(7, employee_354.getSalary_354());
            preparedStatement.setString(8, employee_354.getRole_354());
            preparedStatement.setString(9, employee_354.getStatus_354());
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
            preparedStatement.setString(1, employee_354.getName_354());
            preparedStatement.setString(2, employee_354.getAddress_354());
            preparedStatement.setString(3, employee_354.getDob_354());
            preparedStatement.setString(4, employee_354.getGender_354());
            preparedStatement.setString(5, employee_354.getPhone_354());
            preparedStatement.setDouble(6, employee_354.getSalary_354());
            preparedStatement.setString(7, employee_354.getRole_354());
            preparedStatement.setString(8, employee_354.getStatus_354());
            preparedStatement.setString(9, employee_354.getId_354());
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
    public List<Employee> findEmployee_354(String name_354) throws SQLException {
        List<Employee> employees_354 = new ArrayList<Employee>();
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from NhanVien where tenNV like N'%" + name_354 + "%'";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
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
                employees_354.add(employee_354);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(employees_354 != null){
            return employees_354;
        }else{
            return null;
        }
    }
}
