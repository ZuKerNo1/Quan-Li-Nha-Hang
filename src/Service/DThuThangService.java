/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerDThuThang;
import java.sql.SQLException;
import java.util.List;
import model.DoanhThuThang;

/**
 *
 * @author FSC
 */
public class DThuThangService {
    private ManagerDThuThang dThuThangManager_360;
    public DThuThangService() {
        dThuThangManager_360 = new ManagerDThuThang();
    }

    public  List<DoanhThuThang> getAllListDThu() throws SQLException{
        return dThuThangManager_360.getAllListThang();
    }
    
    public String TongTien(){
        return dThuThangManager_360.TongTien();
    }
}
