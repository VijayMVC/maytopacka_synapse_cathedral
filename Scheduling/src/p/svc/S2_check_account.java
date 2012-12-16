/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author Dummy
 */
public class S2_check_account {
    
    public static Connection conn;
    public static String check_account(String user_name,String password){
        
        
        String type="none";
       
        try {
            Connection conn = PoolConnection.connect();
             String s0="select user_level from db_bulletin.users where user_name='"+user_name+"'and password='"+password+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                type=rs.getString(1);
            }
                       
            return type;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    
}
