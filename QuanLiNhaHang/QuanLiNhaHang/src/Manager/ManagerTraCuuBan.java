/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import model.Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FSC
 */
public class ManagerTraCuuBan {
    public List<Table> getAllListTable() throws SQLException {
        List<Table> listTables = new ArrayList<Table>();
        String sql = "select * from BanAn";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Table listTable = new Table();
                listTable.setIdTable_352(rs.getString("idBA"));
                listTable.setStatusTable_352(rs.getString("trangThaiBan"));
                listTables.add(listTable);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listTables;
    }
    
    public String getIdTable(String id) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from BanAn where idBA=?";
        String idBanAn;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            idBanAn = id;
            return idBanAn;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
