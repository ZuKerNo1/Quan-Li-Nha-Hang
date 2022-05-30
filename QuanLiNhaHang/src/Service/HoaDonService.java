/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerHoaDon;
import java.sql.SQLException;
import model.HoaDon;

/**
 *
 * @author DELL
 */
public class HoaDonService {
    private ManagerHoaDon hoaDonManager;
    public HoaDonService() {
        hoaDonManager = new ManagerHoaDon();
    }
    public void addHoaDon(String idBA, String idNV) throws SQLException{
        hoaDonManager.addHoaDon(idBA, idNV);
    }
    public int getIdHoaDon(String idBA) throws SQLException{
        return hoaDonManager.getIDHoaDon(idBA);
    }
    
    public void chuyenTrangThai_HoaDon(String id) throws SQLException{
        hoaDonManager.chuyenTrangThai_HoaDon(id);
    }
}
