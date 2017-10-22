
package sem2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VoDepTrai
 */
public class connection {
   public static Connection getconnect()
   {
       Connection conn = null;
        try{
            String url = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(url);
            String dbUrl="jdbc:sqlserver://172.16.62.128:1433;database=pro2db";
            
            
            conn = DriverManager.getConnection(dbUrl,"sa", "123456" );
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
   }
    
}
