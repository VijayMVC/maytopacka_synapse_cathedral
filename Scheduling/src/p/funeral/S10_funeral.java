/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.funeral;

import p.baptism.*;
import com.jgoodies.binding.list.ArrayListModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class S10_funeral {

    public static class to_funeral {

        public final String burial_mass_number;
        public final String f_name;
        public final String l_name;
        public final String mi;
        public final String contact_number;
        public final String address;
        public final String cause_of_death;
        public final String date_buried;
        public final String buried_at;
        public final String scheduled_time;
        public final String scheduled_date;
        public final String priest;
        public final String book_no;
        public final String page_no;

        public to_funeral(String burial_mass_number, String f_name, String l_name, String mi, String contact_number, String address, String cause_of_death, String date_buried, String buried_at, String scheduled_time, String scheduled_date, String priest, String book_no, String page_no) {
            this.burial_mass_number = burial_mass_number;
            this.f_name = f_name;
            this.l_name = l_name;
            this.mi = mi;
            this.contact_number = contact_number;
            this.address = address;
            this.cause_of_death = cause_of_death;
            this.date_buried = date_buried;
            this.buried_at = buried_at;
            this.scheduled_time = scheduled_time;
            this.scheduled_date = scheduled_date;
            this.priest = priest;
            this.book_no = book_no;
            this.page_no = page_no;
        }
    }

    public static List<to_funeral> do_ret_funeral(String is_approved, String is_payed, String is_married, String name) {
        List<to_funeral> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select burial_mass_number"
                    + ",f_name"
                    + ",l_name"
                    + ",mi"
                    + ",contact_number"
                    + ",address"
                    + ",cause_of_death"
                    + ",date_buried"
                    + ",buried_at"
                    + ",scheduled_time"
                    + ",scheduled_date"
                    + ",priest"
                    + ",book_no"
                    + ",page_no from db_bulletin.burial_mass where "
                    + "is_approved='" + is_approved + "' and is_payed='" + is_payed + "' and is_confirm='" + is_married + "' and burial_mass_number like '" + name + "%' ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String burial_mass_number = rs.getString(1);
                String f_name = rs.getString(2);
                String l_name = rs.getString(3);
                String mi = rs.getString(4);
                String contact_number = rs.getString(5);
                String address = rs.getString(6);
                String cause_of_death = rs.getString(7);
                String date_buried = rs.getString(8);
                String buried_at = rs.getString(9);
                String scheduled_time = rs.getString(10);
                String scheduled_date = rs.getString(11);
                String priest = rs.getString(12);
                String book_no = rs.getString(13);
                String page_no = rs.getString(14);
                to_funeral to = new to_funeral(burial_mass_number, f_name, l_name, mi, contact_number, address, cause_of_death, date_buried, buried_at, scheduled_time, scheduled_date, priest, book_no, page_no);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }
    public static List<to_funeral> do_ret_funeral_by_date(String is_approved, String is_payed, String is_married, String name,String date,String time) {
        List<to_funeral> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select burial_mass_number"
                    + ",f_name"
                    + ",l_name"
                    + ",mi"
                    + ",contact_number"
                    + ",address"
                    + ",cause_of_death"
                    + ",date_buried"
                    + ",buried_at"
                    + ",scheduled_time"
                    + ",scheduled_date"
                    + ",priest"
                    + ",book_no"
                    + ",page_no from db_bulletin.burial_mass where "
                    + "  is_confirm='" + is_married + "' and is_approved='" + is_approved + "' and is_payed='" + is_payed + "'  and  date(scheduled_date)=date('" + date + "') and scheduled_time='" + time + "' and burial_mass_number like '" + name + "%'";
//           
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String burial_mass_number = rs.getString(1);
                String f_name = rs.getString(2);
                String l_name = rs.getString(3);
                String mi = rs.getString(4);
                String contact_number = rs.getString(5);
                String address = rs.getString(6);
                String cause_of_death = rs.getString(7);
                String date_buried = rs.getString(8);
                String buried_at = rs.getString(9);
                String scheduled_time = rs.getString(10);
                String scheduled_date = rs.getString(11);
                String priest = rs.getString(12);
                String book_no = rs.getString(13);
                String page_no = rs.getString(14);
                to_funeral to = new to_funeral(burial_mass_number, f_name, l_name, mi, contact_number, address, cause_of_death, date_buried, buried_at, scheduled_time, scheduled_date, priest, book_no, page_no);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }


    public static List<to_funeral> do_ret_funeral_payment(String is_approved, String is_payed, String is_confirm) {
        List<to_funeral> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select burial_mass_number"
                    + ",f_name"
                    + ",l_name"
                    + ",mi"
                    + ",contact_number"
                    + ",address"
                    + ",cause_of_death"
                    + ",date_buried"
                    + ",buried_at"
                    + ",scheduled_time"
                    + ",scheduled_date"
                    + ",priest"
                    + ",book_no"
                    + ",page_no from db_bulletin.burial_mass where is_approved='" + is_approved + "' and is_payed='" + is_payed + "' and is_confirm='" + is_confirm + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String burial_mass_number = rs.getString(1);
                String f_name = rs.getString(2);
                String l_name = rs.getString(3);
                String mi = rs.getString(4);
                String contact_number = rs.getString(5);
                String address = rs.getString(6);
                String cause_of_death = rs.getString(7);
                String date_buried = rs.getString(8);
                String buried_at = rs.getString(9);
                String scheduled_time = rs.getString(10);
                String scheduled_date = rs.getString(11);
                String priest = rs.getString(12);
                String book_no = rs.getString(13);
                String page_no = rs.getString(14);
                to_funeral to = new to_funeral(burial_mass_number, f_name, l_name, mi, contact_number, address, cause_of_death, date_buried, buried_at, scheduled_time, scheduled_date, priest, book_no, page_no);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void do_add(to_funeral data) {

        String date = DateType.datetime.format(new Date());

        try {


            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.burial_mass("
                    + "burial_mass_number"
                    + ",f_name"
                    + ",l_name"
                    + ",mi"
                    + ",contact_number"
                    + ",address"
                    + ",cause_of_death"
                    + ",date_buried"
                    + ",buried_at"
                    + ",scheduled_time"
                    + ",scheduled_date"
                    + ",priest"
                    + ",is_approved"
                    + ",is_confirm"
                    + ",is_payed"
                    + ",date_added"
                    + ",series_of"
                    + ",date_modified"
                    + ",book_no"
                    + ",page_no"
                    + ")values(?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?) ";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, data.burial_mass_number);
            stmt.setString(2, data.f_name);
            stmt.setString(3, data.l_name);
            stmt.setString(4, data.mi);
            stmt.setString(5, data.contact_number);

            stmt.setString(6, data.address);
            stmt.setString(7, data.cause_of_death);
            stmt.setString(8, data.date_buried);
            stmt.setString(9, data.buried_at);
            stmt.setString(10, data.scheduled_time);

            stmt.setString(11, data.scheduled_date);
            stmt.setString(12, data.priest);
            stmt.setString(13, "no");
            stmt.setString(14, "no");
            stmt.setString(15, "no");
            String dates = DateType.datetime.format(new Date());
            stmt.setString(16, dates);
            stmt.setString(17, "");
            stmt.setString(18, dates);
            stmt.setString(19, data.book_no);
            stmt.setString(20, data.page_no);
            stmt.execute();


            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }

    public static void edit_baptism(to_funeral data) {

        String date = DateType.datetime.format(new Date());

        try {
            Connection conn = PoolConnection.connect();
            String s0 =
                    "update db_bulletin.burial_mass set f_name ='" + data.f_name + "'"
                    + ",l_name='" + data.l_name + "'"
                    + ",mi='" + data.mi + "'"
                    + ",contact_number='" + data.contact_number + "'"
                    + ",address='" + data.address + "'"
                    + ",cause_of_death='" + data.cause_of_death + "'"
                    + ",date_buried='" + data.date_buried + "'"
                    + ",buried_at='" + data.buried_at + "'"
                    + ",scheduled_time='" + data.scheduled_time + "'"
                    + ",scheduled_date='" + data.scheduled_date + "'"
                    + ",priest='" + data.priest + "'"
                    //                    + ",series_of='" + data.f_name + "'"
                    + ",date_modified='" + date + "'"
                    + ",book_no='" + data.book_no + "'"
                    + ",page_no='" + data.page_no + "'"
                    + "where   burial_mass_number ='" + data.burial_mass_number + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();


            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }

    public static void approve_funeral(String burial_mass_number) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.burial_mass set is_approved='" + "yes" + "' where burial_mass_number='" + burial_mass_number + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void confirm_funeral(String burial_mass_number) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.burial_mass set is_confirm='" + "yes" + "' where burial_mass_number='" + burial_mass_number + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void payed_funeral(String burial_mass_number) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.burial_mass set is_payed='" + "yes" + "' where burial_mass_number='" + burial_mass_number + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_baptism(String t) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.burial_mass where  burial_mass_number='" + t + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();



        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
