/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Manager.ManagerDatBan;
import java.sql.SQLException;
import java.util.List;
import model.DatBan;

/**
 *
 * @author ACER
 */
public class DatBanService {
    private ManagerDatBan managerDatBan;
    public DatBanService(){
        managerDatBan = new ManagerDatBan();
    }
    public List<DatBan> getAllListDatBan_352() throws SQLException{
        return managerDatBan.getAllListDatBan_352();
    }
    public void addDatBan_352(DatBan datBan) throws SQLException{
        managerDatBan.addDatBan_352(datBan);
    }
    
//    public void updateDatBan_352(DatBan datBan) throws SQLException{
//        managerDatBan.updateDatBan_352(datBan);
//    }
    public void deleteDatBan_352(String id) throws SQLException{
        managerDatBan.deleteDatBan_352(id);
    }
    
}
