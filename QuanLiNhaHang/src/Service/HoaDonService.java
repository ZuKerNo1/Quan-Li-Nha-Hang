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
    public void addHoaDon() throws SQLException{
        hoaDonManager.addHoaDon();
    }
}
