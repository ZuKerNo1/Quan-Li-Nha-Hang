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
import model.ThanhToan;

/**
 *
 * @author FSC
 */
public class ManagerThanhToan {
    public List<ThanhToan> getAllListThanhToan(int idHD, String idBA) throws SQLException {
        List<ThanhToan> listTTs = new ArrayList<ThanhToan>();
        String sql = "select cthd.idMonAn,ma.tenMonAn,ma.donGia,cthd.soLuong,format(sum(ma.donGia*cthd.soLuong),'##,#\\ VNĐ','es-ES') as 'tongTien'\n" +
"from HoaDon as hd, ChiTietHoaDon as cthd, MonAn as ma\n" +
"where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn and cthd.idHoaDon = ? and hd.idBA = '" + idBA + "'" + "\n" +
"group by cthd.idMonAn,ma.tenMonAn,ma.donGia,cthd.soLuong";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idHD);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThanhToan tt = new ThanhToan();
                tt.setIdMonAn_360(rs.getString("idMonAn"));
                tt.setTenMonAn_360(rs.getString("tenMonAn"));
                tt.setDonGia_360(rs.getDouble("donGia"));
                tt.setSoLuong_360(rs.getInt("soLuong"));
                tt.setTongTien_360(rs.getString("tongTien"));
                listTTs.add(tt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listTTs;
    }
}
