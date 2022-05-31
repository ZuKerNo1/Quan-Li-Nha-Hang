/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerTraCuuBan;
import model.Table;
import java.sql.SQLException;
import java.util.List;
import javax.swing.text.html.HTML;

/**
 *
 * @author FSC
 */
public class TraCuuBanService {
    private ManagerTraCuuBan traCuuBanManager;
    public TraCuuBanService() {
        traCuuBanManager = new ManagerTraCuuBan();
    }

    public  List<Table> getAllListTable_352() throws SQLException{
        return traCuuBanManager.getAllListTable_352();
    }
    
    public String getIdTable_352(String id) throws SQLException {
        return traCuuBanManager.getIdTable_352(id);
    }

    

    public void chuyenTrangThai_BanAn(String id) throws SQLException{
        traCuuBanManager.chuyenTrangThai_BanAn(id);
    }
    
    public String getstatus_352(String status) throws SQLException {
        return traCuuBanManager.getIdTable_352(status);
    }
    
    public void chuyenTrangThai_BanAn_DangSuDung(String id) throws SQLException{
        traCuuBanManager.chuyenTrangThai_BanAn_DangSuDung(id);
    }
}
