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

    public  List<Table> getAllListTraCuuBan() throws SQLException{
        return traCuuBanManager.getAllListTable();
    }
    
    public String getIdTabel(String id) throws SQLException {
        return traCuuBanManager.getIdTable(id);
    }

    public String getIdTabel(HTML.Attribute ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
