/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author FSC
 */
public class JDBCConnection {
    public static Connection JDBCConnection() throws SQLServerException, SQLException{
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123456");
        ds.setServerName("ADMIN");
        ds.setPortNumber(1433);
        ds.setDatabaseName("QuanLiNhaHang");
        ds.setTrustServerCertificate(false);
        Connection con = null;
        try {
            return ds.getConnection();
            
        }
            // Handle any errors that may have occurred.
            catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
