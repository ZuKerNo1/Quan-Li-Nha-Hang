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
import model.DoanhThuNam;

/**
 *
 * @author FSC
 */
public class ManagerDThuNam {
    public List<DoanhThuNam> getAllListNam() throws SQLException {
        List<DoanhThuNam> listDThus = new ArrayList<DoanhThuNam>();
        String sql = "select year(hd.ngayThanhToan) as 'Nam' , sum(ma.donGia*cthd.soLuong) as 'TongTien'\n" +
"from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma\n" +
"where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn \n" +
"group by year(hd.ngayThanhToan)";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DoanhThuNam listDThu = new DoanhThuNam();
                listDThu.setNam_360(rs.getInt("Nam"));
                listDThu.setDoanhThu_360(rs.getString("TongTien"));
                listDThus.add(listDThu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listDThus;
    }
    
    public String TongTien(){
        String tt = null;
        String sql = "select format(sum(ma.donGia*cthd.soLuong),'##,#\\ VNĐ','es-ES') as 'TongTien'\n" +
"from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma\n" +
"where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tt = rs.getString("TongTien");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tt;
    }
    
}
