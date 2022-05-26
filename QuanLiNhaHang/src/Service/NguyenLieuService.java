/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.JDBCConnection;
import Manager.ManagerNguyenLieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.NguyenLieu;

/**
 *
 * @author FSC
 */
public class NguyenLieuService {
    private ManagerNguyenLieu nguyenLieuManager;
    public NguyenLieuService() {
        nguyenLieuManager = new ManagerNguyenLieu();
    }

    public  List<NguyenLieu> getAllListNguyenLieu() throws SQLException{
        return nguyenLieuManager.getAllListNguyenLieu();
    }
    
    public void addListNguyenLieu(NguyenLieu nguyenLieu) throws SQLException{
        nguyenLieuManager.addListNguyenLieu(nguyenLieu);
    }
    
    public void deleteNguyenLieu(String id) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "delete from NguyenLieu where idNL = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateNguyenLieu(NguyenLieu nguyenLieu) throws SQLException{
        nguyenLieuManager.updateListNguyenLieu(nguyenLieu);
    }
    public NguyenLieu getNguyenLieuById(String id) throws SQLException{
        return nguyenLieuManager.getNguyenLieuById(id);
    }
}
