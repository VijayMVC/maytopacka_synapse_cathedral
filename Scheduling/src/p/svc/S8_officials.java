/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author dummy
 */
public class S8_officials {

    public static class to_designation {

        public final String name;
        public final String id;

        public to_designation(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }

    public static class to_official {

        public final String name;
        public final String contact;
        public final String id;
        public final String is_manager;

        public to_official(String name, String contact, String id, String is_manager) {
            this.name = name;
            this.contact = contact;
            this.id = id;
            this.is_manager = is_manager;
        }
    }

    public static List<to_designation> ret_data() {
        List<to_designation> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select name,id from db_bulletin.designations";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                String id = rs.getString(2);
                to_designation to = new to_designation(name, id);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void add_designation(String name) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "insert into db_bulletin.designations (name)values(?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, name);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_designation(String name, String id) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "update db_bulletin.designations set name='" + name + "' where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_designation(String id) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "delete from db_bulletin.designations where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<String> get_designations() {
        List<String> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select name from db_bulletin.officials";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                datas.add(name);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<to_official> ret_datas(String designation, String names) {
        List<to_official> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select name,contact,id ,is_manager from db_bulletin.officials where designation='" + designation + "' and name like '%" + names + "%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                String contact = rs.getString(2);
                String id = rs.getString(3);
                String is_manager = rs.getString(4);
                to_official to = new to_official(name, contact, id, is_manager);
                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void add_official(String name, String contact, String designation, String is_manager) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.officials(name,contact,designation,is_manager)values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, name);
            stmt.setString(2, contact);
            stmt.setString(3, designation);
            stmt.setString(4, is_manager);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_official(String name, String contact, String designation, String id, String is_manager) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.officials set "
                        + "name='" + name + "' "
                        + ", contact='" + contact + "' "
                        + ", designation='" + designation + "'"
                        + ", is_manager='" + is_manager + "'"
                        + " where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_official(String id) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.officials where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Deleted");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void main(String[] args) {
        try {
            Connection conn = PoolConnection.connect();

            List<String> datas = new ArrayList();

            String s0 = "select priest from db_bulletin.baptism2 group by priest";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
//                   System.out.println(name);
                datas.add(name);
            }


            for (String s : datas) {
                String s1 = "insert into db_bulletin.officials(name,designation,contact,is_manager)values(?,?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, s);
                stmt1.setString(2, "Priest");
                stmt1.setString(3, "");
                stmt1.setString(4, "0");
                stmt1.execute();
                Lg.s(S8_officials.class, "Successfully Added");
            }
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
