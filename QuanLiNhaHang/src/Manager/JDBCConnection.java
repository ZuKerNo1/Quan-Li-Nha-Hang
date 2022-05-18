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
<<<<<<< HEAD
        ds.setPassword("0934804796a");
        ds.setServerName("LAPTOP-9TCJRCKI\\KVU");
=======
        ds.setPassword("Trung@2305");
        ds.setServerName("DESKTOP-8GKPO1M\\SQLEXPRESS");
>>>>>>> DangNhap
        ds.setPortNumber(1433);
        ds.setDatabaseName("QuanLiNhaHang");
        ds.setEncrypt(false);
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
