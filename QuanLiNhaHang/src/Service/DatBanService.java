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
    public List<DatBan> getAllListDatBan() throws SQLException{
        return managerDatBan.getAllListDatBan();
    }
    public void addDatBan(DatBan datBan) throws SQLException{
        managerDatBan.addDatBan(datBan);
    }
}
