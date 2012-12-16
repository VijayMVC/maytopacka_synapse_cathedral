/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author i1
 */
public class S6_rates {
    
    
    
    public static double get_intention_rate(String name){
        double rate=0;
        try {
            Connection conn = PoolConnection.connect();
            String s0="select rate from db_bulletin.intention_rates where name='"+name+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                rate = rs.getDouble(1);
            }
            return rate;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    public static void do_update_rate(String name,double rate){
        try {
            Connection conn = PoolConnection.connect();
            
            String s0="update db_bulletin.intention_rates set rate='"+rate+"' where name='"+name+"'";
            PreparedStatement stmt = conn.prepareStatement(s0);            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    public static void main(String[] args) {
        System.out.println(get_intention_rate("Thanks Giving"));
    }
}
