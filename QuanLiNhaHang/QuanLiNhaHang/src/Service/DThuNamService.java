/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerDThuNam;
import java.sql.SQLException;
import java.util.List;
import model.DoanhThuNam;

/**
 *
 * @author FSC
 */
public class DThuNamService {
    private ManagerDThuNam dThuNamManager;
    public DThuNamService() {
        dThuNamManager = new ManagerDThuNam();
    }
    public  List<DoanhThuNam> getAllListDThu() throws SQLException{
        return dThuNamManager.getAllListNam();
    }
}
