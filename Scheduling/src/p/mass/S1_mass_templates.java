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

/**
 *
 * @author Dummy
 */
public class S1_mass_templates {

    public static void add_schedule(String template, String type) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.mass_templates(template,types)values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, template);
            stmt.setString(2, type);
            stmt.execute();

            Lg.s(S1_mass_templates.class, "Successfully Added");
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
            String s0 = "update db_bulletin.mass_templates set template='" + name + "' where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_mass_templates.class, "Successfully Updated");
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
            String s0 = "delete from db_bulletin.mass_templates where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_mass_templates.class, "Successfully Added");
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static class to_temp {

        public final String id;
        public final String template;
        public final String types;

        public to_temp(String id, String template, String types) {
            this.id = id;
            this.template = template;
            this.types = types;

        }
    }

    public static List<to_temp> ret_scheds(String type) {
        List<to_temp> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select id ,template,types from db_bulletin.mass_templates where types='" + type + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String template = rs.getString(2);
                String types = rs.getString(3);

                to_temp to = new to_temp(id, template, types);
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

    public static List<String> ret_sched_str(String type) {
        List<String> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select id ,template,types from db_bulletin.mass_templates where types='" + type + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {

                String template = rs.getString(2);
                datas.add(template);
            }
            return datas;

        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
