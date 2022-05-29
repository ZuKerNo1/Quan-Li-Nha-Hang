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
import java.util.ArrayList;
import java.util.List;
import model.NguyenLieu;

/**
 *
 * @author FSC
 */
public class ManagerNguyenLieu {
    public List<NguyenLieu> getAllListNguyenLieu() throws SQLException {
        List<NguyenLieu> listNguyenLieus = new ArrayList<NguyenLieu>();
        String sql = "select * from NguyenLieu";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                NguyenLieu listNguyenLieu = new NguyenLieu();
                listNguyenLieu.setIdNL_360(rs.getString("idNL"));
                listNguyenLieu.setNameNL_360(rs.getString("tenNguyenLieu"));
                listNguyenLieu.setSoLuong_360(rs.getInt("soLuong"));
                listNguyenLieu.setDonVi_360(rs.getString("donVi"));
                listNguyenLieu.setNhanVienCapNhap_360(rs.getString("nvCapNhap"));
                listNguyenLieus.add(listNguyenLieu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listNguyenLieus;
    }

    public void addListNguyenLieu(NguyenLieu nguyenLieu) throws SQLException {

        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into NguyenLieu values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, nguyenLieu.getIdNL_360());
            preparedStatement.setString(2, nguyenLieu.getNameNL_360());
            preparedStatement.setInt(3, nguyenLieu.getSoLuong_360());
            preparedStatement.setString(4, nguyenLieu.getDonVi_360());
            preparedStatement.setString(5, nguyenLieu.getNhanVienCapNhap_360());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateListNguyenLieu(NguyenLieu nguyenLieu) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update NguyenLieu set tenNguyenLieu = ? , soLuong = ? , donVi = ?, nvCapNhap = ? where idNL=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nguyenLieu.getNameNL_360());
            preparedStatement.setInt(2, nguyenLieu.getSoLuong_360());
            preparedStatement.setString(3, nguyenLieu.getDonVi_360());
            preparedStatement.setString(4, nguyenLieu.getNhanVienCapNhap_360());
            preparedStatement.setString(5, nguyenLieu.getIdNL_360());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public NguyenLieu getNguyenLieuById(String id) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from NguyenLieu where idNL=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                NguyenLieu listNguyenLieu = new NguyenLieu();
                listNguyenLieu.setIdNL_360(rs.getString("idNL"));
                listNguyenLieu.setNameNL_360(rs.getString("tenNguyenLieu"));
                listNguyenLieu.setSoLuong_360(rs.getInt("soLuong"));
                listNguyenLieu.setDonVi_360(rs.getString("donVi"));
                listNguyenLieu.setNhanVienCapNhap_360(rs.getString("nvCapNhap"));
                
                return listNguyenLieu;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
