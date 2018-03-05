
package DatabaseConnection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
     private static java.sql.Connection conn;
    
    private static ResultSet rs;
    
    public static java.sql.Connection getConnection(){
                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile web shop?user=root&password=12345");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    
}
    
     public static ResultSet executeQuery(PreparedStatement preStmt,List<Object> params){
        
        try {
            for(int i=0;i<params.size();i++){
                preStmt.setObject(i+1, params.get(i));
            }
            rs=preStmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;        
    }
     
     
        public static void executeNonQuery(PreparedStatement preStmt,List<Object> params){
        
        try {
            for(int i=0;i<params.size();i++){
                preStmt.setObject(i+1, params.get(i));
            }
            preStmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
