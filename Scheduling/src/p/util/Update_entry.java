/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author Dummy
 */
public class Update_entry {
    public static void main(String[] args) {
        try {
            Connection conn = PoolConnection.connect();
//            String s0="select ref_no from db_bulletin.baptism2_sponsors where ref_no='"+"6511"+"'";
            int i=6956; //6956
            int i2=7197; //7197
            String s0="select ref_no from db_bulletin.baptism2 where ref_no between '"+i+"' and '"+i2+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int new_id=id+1;
                
//                String s1="select sponsor from db_bulletin.baptism2_sponsors where ref_no='"+(id+1)+"'";
//                Statement stmt2 = conn.createStatement();
//                ResultSet rs2 = stmt2.executeQuery(s1);
//                while (rs2.next()) {
//                    String num = rs2.getString(1);
//                    System.out.println(num+ " ---");
//                }
                
                String s1="update db_bulletin.baptism2_sponsors set ref_no='"+new_id+"' where ref_no='"+id+"' ";
                PreparedStatement stmt1 = conn.prepareStatement(s1);                
                stmt1.execute();
                
                System.out.println("Updated" + " "+id + " - "+new_id);
            }
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
