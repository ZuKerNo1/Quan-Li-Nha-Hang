/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerThanhToan;
import java.sql.SQLException;
import java.util.List;
import model.Customer;
import model.ThanhToan;

/**
 *
 * @author FSC
 */
public class ThanhToanService {
    ManagerThanhToan managerThanhToan = new ManagerThanhToan();
    
    public List<ThanhToan> getAllListThanhToan(int idHD, String idBA) throws SQLException {
        return managerThanhToan.getAllListThanhToan(idHD, idBA);
    }
    
//    public String getIdTable_352(String id) throws SQLException {
//        return traCuuBanManager.getIdTable_352(id);
//    }
    
    public String getNameCus(String idBA) throws SQLException {
        return managerThanhToan.getNameCus(idBA);
    }
    
    public String getSDTCus(String idBA) throws SQLException{
        return managerThanhToan.getSDTCus(idBA);
    }
    
    public String TongTien(int idHD, String idBA){
        return managerThanhToan.TongTien(idHD, idBA);
    }
}
