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
import model.DoanhThuThang;

/**
 *
 * @author FSC
 */
public class ManagerDThuThang {
//    public List<DoanhThuThang> getAllListThang() throws SQLException {
//        List<DoanhThuThang> listDThus = new ArrayList<DoanhThuThang>();
//        
//        try {
//            Connection connection = JDBCConnection.JDBCConnection();
//            String sql = "select month(hd.ngayThanhToan) as 'Thang' , sum(ma.donGia*cthd.soLuong) as 'TongTien'\n" +
//"from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma\n" +
//"where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn  \n" +
//"group by month(hd.ngayThanhToan)";
//            //Hien thi doanh thu ra bang
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                DoanhThuThang listDThu = new DoanhThuThang();
//                listDThu.setThang_360(rs.getInt("Thang"));
//                listDThu.setDoanhThu_360(rs.getString("TongTien"));
//                listDThus.add(listDThu);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return listDThus;
//    }
    
    public List<DoanhThuThang> getAllListThang_byYear(int year) throws SQLException {
        List<DoanhThuThang> listDThus = new ArrayList<DoanhThuThang>();
        try{
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "select month(hd.ngayThanhToan) as 'Thang' , sum(ma.donGia*cthd.soLuong) as 'TongTien'\n" +
"from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma\n" +
"where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn and year(hd.ngayThanhToan) = ? \n" +
"group by month(hd.ngayThanhToan)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, year);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DoanhThuThang dthuThang = new DoanhThuThang();
                dthuThang.setThang_360(rs.getInt("Thang"));
                dthuThang.setDoanhThu_360(rs.getString("TongTien"));
                listDThus.add(dthuThang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDThus;
    }
    
    public String TongTien(int year){
        String tt = null;
        String sql = "select format(sum(ma.donGia*cthd.soLuong),'##,#\\ VNĐ','es-ES') as 'TongTien'\n" +
"from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma\n" +
"where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn and year(hd.ngayThanhToan) = ?";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, year);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tt = rs.getString("TongTien");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tt;
    }
    
    public List<Integer> getYearFromDB(){
        List<Integer> Years = new ArrayList<Integer>();
        try{
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "select year(hd.ngayThanhToan) as N'Nam' \n" +
            "from HoaDon as hd,ChiTietHoaDon as cthd\n" +
            "where hd.idHoaDon = cthd.idHoaDon \n" +
            "group by year(hd.ngayThanhToan)\n" +
            "order by year(hd.ngayThanhToan) desc";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int year;
                year = rs.getInt("Nam");
                Years.add(year);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Years;
    }
    
}
