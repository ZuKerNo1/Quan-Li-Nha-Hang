/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerChiTietHoaDon;
import java.sql.SQLException;
import model.MonAn;

/**
 *
 * @author FSC
 */
public class ChiTietHoaDonService {
    private ManagerChiTietHoaDon chonMonManager;
    
    public ChiTietHoaDonService() {
        chonMonManager = new ManagerChiTietHoaDon();
    }
    
    public void addMonAnToChiTietHoaDon(int idHoaDon, String idMA, int soLuong) throws SQLException{
        chonMonManager.addMonAnToChiTietHoaDon(idHoaDon, idMA, soLuong);
    }
}
