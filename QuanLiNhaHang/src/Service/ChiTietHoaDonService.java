/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerChiTietHoaDon;
<<<<<<< HEAD
<<<<<<< HEAD
import java.sql.ResultSet;
=======
>>>>>>> DatBan
=======
>>>>>>> DangNhap
import java.sql.SQLException;
import model.MonAn;

/**
 *
 * @author FSC
 */
public class ChiTietHoaDonService {
<<<<<<< HEAD
<<<<<<< HEAD
    private ManagerChiTietHoaDon chiTietHoaDonManager;
    
    public ChiTietHoaDonService() {
        chiTietHoaDonManager = new ManagerChiTietHoaDon();
    }
    
    public void addMonAnToChiTietHoaDon(int idHoaDon, String idMA, int soLuong) throws SQLException{
        chiTietHoaDonManager.addMonAnToChiTietHoaDon(idHoaDon, idMA, soLuong);
    }
    
    public void updateMonAnToChiTietHoaDon(int idHoaDon, String idMA, int soLuong) throws SQLException{
        chiTietHoaDonManager.updateMonAnToChiTietHoaDon(idHoaDon, idMA, soLuong);
    }
    
    public int checkIdMonAn(int idHoaDon,String idMonAn) throws SQLException{
        return chiTietHoaDonManager.checkIdMonAn(idHoaDon, idMonAn);
=======
=======
>>>>>>> DangNhap
    private ManagerChiTietHoaDon chonMonManager;
    
    public ChiTietHoaDonService() {
        chonMonManager = new ManagerChiTietHoaDon();
    }
    
    public void addMonAnToChiTietHoaDon(int idHoaDon, String idMA, int soLuong) throws SQLException{
        chonMonManager.addMonAnToChiTietHoaDon(idHoaDon, idMA, soLuong);
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
    }
}
