/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpt_main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author i1
 */
public class S1_get_certificates {

    public static class to_certificates {

        public final String ref_no;
        public final String name;
        public final String date;
        public final String time;

        public to_certificates(String ref_no, String name, String date, String time) {
            this.ref_no = ref_no;
            this.name = name;
            this.date = date;
            this.time = time;
        }
    }

    public static List<to_certificates> do_matrimony(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "marriage_number"
                    + ",concat(groom_fname,space(2),groom_mname,space(2),groom_lname,space(2),' & ',bride_fname,space(2), bride_mname,space(2),bride_lname) as groom"
                    + ",date_of_marriage,time_of_marriage "
                    + "from db_bulletin.marriage where marriage_number "
                    + "like '" + search + "%' and is_married='" + "yes" + "'"
                    + " or groom_lname like '" + search + "%' and is_married='" + "yes" + "'"
                    + " or bride_lname like '" + search + "%' and is_married='" + "yes" + "'"
                    + "";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<to_certificates> do_matrimony_date(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "marriage_number"
                    + ",concat(groom_fname,space(2),groom_mname,space(2),groom_lname,space(2),' & ',bride_fname,space(2), bride_mname,space(2),bride_lname) as groom"
                    + ",date_of_marriage,time_of_marriage "
                    + "from db_bulletin.marriage where date(date_of_marriage)=date('" + search + "') "
                    + "and is_married='" + "yes" + "' ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<to_certificates> do_baptism(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "baptismal_number"
                    + ",concat(child_fname,space(2),child_mi,space(2),child_lname) as name"
                    + ",date_of_baptism,time_of_baptism "
                    + "from db_bulletin.baptism where baptismal_number "
                    + "like '" + search + "%' and is_baptized='" + "yes" + "' "
                    + " or child_lname like '" + search + "%' and is_baptized='" + "yes" + "' "
                    + "";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }
     public static List<to_certificates> do_baptism_date(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "baptismal_number"
                    + ",concat(child_fname,space(2),child_mi,space(2),child_lname) as name"
                    + ",date_of_baptism,time_of_baptism "
                    + "from db_bulletin.baptism where date(date_of_baptism)=date('"+search+"') "
                    + "and is_baptized='" + "yes" + "' ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }


    public static List<to_certificates> do_confirmation(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "confirmation_number"
                    + ",concat(confirmand_fname,space(2),confirmand_mi,space(2),confirmand_lname) as name"
                    + ",date_of_confirmation,place_of_confirmation "
                    + "from db_bulletin.confirmation where confirmation_number "
                    + "like '" + search + "%' and is_confirmed='" + "yes" + "' "
                    + " or confirmand_lname like '" + search + "%' and is_confirmed='" + "yes" + "' "
                    + "";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
      public static List<to_certificates> do_confirmation_date(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "confirmation_number"
                    + ",concat(confirmand_fname,space(2),confirmand_mi,space(2),confirmand_lname) as name"
                    + ",date_of_confirmation,place_of_confirmation "
                    + "from db_bulletin.confirmation where date(date_of_confirmation)=date('"+search+"') "
                    + "and is_confirmed='" + "yes" + "' ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<to_certificates> do_funeral(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "burial_mass_number"
                    + ",concat(f_name,space(2),mi,space(2),l_name) as name"
                    + ",scheduled_date,scheduled_time "
                    + "from db_bulletin.burial_mass where burial_mass_number "
                    + "like '" + search + "%' and is_confirm='" + "yes" + "' "
                    + " or l_name like '" + search + "%' and is_confirm='" + "yes" + "' "
                    + "";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    public static List<to_certificates> do_funeral_date(String search) {
        List<to_certificates> data = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "burial_mass_number"
                    + ",concat(f_name,space(2),mi,space(2),l_name) as name"
                    + ",scheduled_date,scheduled_time "
                    + "from db_bulletin.burial_mass where date(scheduled_date)=date('"+search+"') "
                    + "and is_confirm='" + "yes" + "' ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref = rs.getString(1);
                String name = rs.getString(2);
                String date = rs.getString(3);
                String time = rs.getString(4);
                to_certificates to = new to_certificates(ref, name, date, time);
                data.add(to);
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
