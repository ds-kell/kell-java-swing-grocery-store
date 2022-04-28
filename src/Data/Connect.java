package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kell
 */
public class Connect {
    private  static Connection connection;
    
    public static Connection getConnect(){
       try
        {
            String tmp = "jdbc:sqlserver://"
                    + "WIBU\\KELL"
                    + ":1433;DatabaseName=CuaHangSach;Username=sa;Password=8888;"
                    + "encrypt=true;trustServerCertificate=true";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(tmp);
        } catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
    public static String testConnect() {
        try{
            connection = Connect.getConnect();
            return "Kết nối thành công";
        }
        catch(Exception e) {
            return "Kết nối thất bại";
        }
    } 
    public static void main(String[] args) {
        System.out.println(testConnect());
    }
}
