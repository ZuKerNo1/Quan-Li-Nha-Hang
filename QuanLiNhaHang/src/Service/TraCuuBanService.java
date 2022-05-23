/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Manager.ManagerTraCuuBan;
<<<<<<< HEAD
import Model.Table;
import View.TraCuuBan;
=======
import model.Table;
import View.DatBan.TraCuuBan;
>>>>>>> DatBan
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author FSC
 */
public class TraCuuBanService {
    private ManagerTraCuuBan traCuuBanManager;
    public TraCuuBanService() {
        traCuuBanManager = new ManagerTraCuuBan();
    }

    public  List<Table> getAllListTraCuuBan() throws SQLException{
        return traCuuBanManager.getAllListTable();
    }
    
    public String getIdTabel(String id) throws SQLException {
        return traCuuBanManager.getIdTable(id);
    }
}
