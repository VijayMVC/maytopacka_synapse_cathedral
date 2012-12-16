/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;
import overallPOS.modules.share.utils.SqlStringUtil;
import p.util.DateType;

/**
 *
 * @author Dummy
 */
public class S5_save_new_mass_schedule {


    public static void save_new_mass_schedule(
            String mass_sched_number, String mass_type, String scheduled_time, Date scheduled_date, String priest_number, String priest, String choir) {

        String date=DateType.sf.format(scheduled_date);

//        ,mass_sched_number int
//	,mass_type varchar(100)
//	,scheduled_time varchar(100)
//	,scheduled_date date
//	,priest_number int
//	,priest varchar(100)
//	,choir varchar(100)
        
        try {
             Connection conn=PoolConnection.connect();
             String s1="insert into "
                     + "db_bulletin.mass_schedules("
                     + "mass_sched_number"
                     + ",mass_type"
                     + ",scheduled_time"
                     + ",scheduled_date"
                     + ",priest_number"
                     + ",priest"
                     + ",choir)values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s1);    
            stmt.setString(1,mass_sched_number);
            stmt.setString(2,mass_type);
            stmt.setString(3,scheduled_time);
            stmt.setString(4,date);
            stmt.setString(5,priest_number);
            stmt.setString(6,priest);
            stmt.setString(7,choir);
            stmt.execute();
           
//            String s0 = "call pb_bulletin.save_regular_mass_schedule( "
//                    + ":a_mass_sched_number "
//                    + ",:a_mass_type "
//                    + ",:a_scheduled_time "
//                    + ",:a_scheduled_date "
//                    + ",:a_priest_number "
//                    
//                    + ",:a_priest "
//                    + ",:a_choir "
//                    + "); ";
//            s0 = SqlStringUtil.parse(s0)
//                    .setString("a_mass_sched_number", mass_sched_number)
//                    .setString("a_mass_type", mass_type)
//                    .setString("a_scheduled_time", scheduled_time)
//                    .setString("a_scheduled_date",DateType.sf.format( scheduled_date))
//                    .setString("a_priest_number", priest_number)
//                    
//                    .setString("a_priest", priest)
//                    .setString("a_choir", choir)
//                    .ok();
//            
//            PreparedStatement psmt = conn.prepareStatement(s0);
//            psmt.execute();
            
            JOptionPane.showMessageDialog(null,"Successfully Added");
            
        } catch (Exception e) {
//            prompt.show("Failed To Add");
            throw new RuntimeException(e);
        } finally {
           PoolConnection.close();
        }

    }

   public static void delete(String id) {
        try {
           Connection conn = PoolConnection.connect();
           String s0="delete from db_bulletin.mass_schedules where mass_sched_number='"+id+"'";
            PreparedStatement stmt = conn.prepareStatement(s0);            
            stmt.execute();
            
       } catch (Exception e) {
           throw new RuntimeException(e);
       } finally {
           PoolConnection.close();
       }
    }
}
