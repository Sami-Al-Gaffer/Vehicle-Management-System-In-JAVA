
package vsms.folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class MyFunction {
    
    public static int countData(String tableName){
    int total = 0;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    try{
        conn = MySqlConnect.ConnectDB();
        String query = "SELECT COUNT(id) FROM "+tableName;
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
        while(rs.next()){
            total = rs.getInt(1);
        }
        
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    return total;
        
    }
    
    public static int countVehileData(String tableName){
    int total = 0;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    try{
        conn = MySqlConnect.ConnectDB();
        String query = "SELECT COUNT(vehicle_id) FROM "+tableName;
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
        while(rs.next()){
            total = rs.getInt(1);
        }
        
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    return total;
        
    }
    
}
