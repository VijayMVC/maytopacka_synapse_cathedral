/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.mass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;
import overallPOS.modules.share.utils.ReceiptIncrementor;

/**
 *
 * @author Dummy
 */
public class S1_mass {

    public static void add_schedule(String time, String type) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.mass_schedules(scheduled_time,mass_type)values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, time);
            stmt.setString(2, type);
            stmt.execute();

            Lg.s(S1_mass.class, "Successfully Added");
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_schedule(String id, String name) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.mass_schedules set scheduled_time='" + name + "' where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_mass.class, "Successfully Updated");
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_schedule(String id) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.mass_schedules where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_mass.class, "Successfully Added");
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static class to_schedules {

        public final String id;
        public final String mass_sched_number;
        public final String mass_type;
        public final String scheduled_time;
        public final String scheduled_date;
        public final String priest_number;
        public final String priest;
        public final String choir;

        public to_schedules(String id, String mass_sched_number, String mass_type, String scheduled_time, String scheduled_date, String priest_number, String priest, String choir) {
            this.id = id;
            this.mass_sched_number = mass_sched_number;
            this.mass_type = mass_type;
            this.scheduled_time = scheduled_time;
            this.scheduled_date = scheduled_date;
            this.priest_number = priest_number;
            this.priest = priest;
            this.choir = choir;
        }
    }

    public static List<to_schedules> ret_scheds(String type) {
        List<to_schedules> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select id ,mass_sched_number,mass_type,scheduled_time,scheduled_date,priest_number,priest,choir from db_bulletin.mass_schedules where mass_type='" + type + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String mass_sched_number = rs.getString(2);
                String mass_type = rs.getString(3);
                String scheduled_time = rs.getString(4);
                String scheduled_date = rs.getString(5);
                String priest_number = rs.getString(6);
                String priest = rs.getString(7);
                String choir = rs.getString(8);
                to_schedules to = new to_schedules(id, mass_sched_number, mass_type, scheduled_time, scheduled_date, priest_number, priest, choir);
                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void main(String[] args) {
        try {
            Connection conn = PoolConnection.connect();
            String number = "000000000000000";
            String s0 = "select o.reference_number from db_bulletin.mass_intention o order by o.id desc limit 1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getString(1);
            }
            
            number = ReceiptIncrementor.increment(number);
            System.out.println(number);
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
