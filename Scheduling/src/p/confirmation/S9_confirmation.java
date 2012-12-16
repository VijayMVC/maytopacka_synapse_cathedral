/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.confirmation;

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
import p.baptism.S8_baptism.to_baptism;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class S9_confirmation {

    public static class to_sponsors {

        public String name;
        public final String id;

        public to_sponsors(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class to_confirmation {

        public final String confirmation_no;
        public final String child_fname;
        public final String child_lname;
        public final String child_mi;
        public final String father;
        public final String mother;
        public final String date_of_confirmation;
        public final String place_of_confirmation;
        public final String date_added;
        public final String time;
        public final String book_no;
        public final String page_no;
        public final String confirmed_by;

        public to_confirmation(String confirmation_no, String child_fname, String child_lname, String child_mi, String father, String mother, String date_of_confirmation, String place_of_confirmation, String date_added, String time, String book_no, String page_no, String confirmed_by) {
            this.confirmation_no = confirmation_no;
            this.child_fname = child_fname;
            this.child_lname = child_lname;
            this.child_mi = child_mi;
            this.father = father;
            this.mother = mother;
            this.date_of_confirmation = date_of_confirmation;
            this.place_of_confirmation = place_of_confirmation;
            this.date_added = date_added;
            this.time = time;
            this.book_no = book_no;
            this.page_no = page_no;
            this.confirmed_by = confirmed_by;
        }
    }

    public static List<S9_confirmation.to_sponsors> ret_data(String bapt_num) {
        List<S9_confirmation.to_sponsors> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select sponsor_name,id from db_bulletin.confirmand_sponsors where confirmation_number ='" + bapt_num + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                String id = rs.getString(2);
                to_sponsors to = new to_sponsors(name, id);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<to_confirmation> do_ret_confirmation(String is_approved, String is_payed, String is_married, String search) {
        List<to_confirmation> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = " select confirmation_number"
                    + ",confirmand_fname"
                    + ",confirmand_lname"
                    + ",confirmand_mi"
                    + ",father"
                    + ",mother"
                    + ",date_of_confirmation"
                    + ",place_of_confirmation"
                    + ",date_added"
                    + ",time"
                    + ",book_no"
                    + ",page_no"
                    + ",confirmed_by from db_bulletin.confirmation where "
                    + "is_approved='" + is_approved + "' and is_payed='" + is_payed + "' and is_confirmed='" + is_married + "' and confirmation_number like '" + search + "%' ";


            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String confirmation_no = rs.getString(1);
                String child_fname = rs.getString(2);
                String child_lname = rs.getString(3);
                String child_mi = rs.getString(4);
                String father = rs.getString(5);
                String mother = rs.getString(6);
                String date_of_confirmation = rs.getString(7);
                String place_of_confirmation = rs.getString(8);
                String date_added = rs.getString(9);
                String time = rs.getString(10);
                String book_no = rs.getString(11);
                String page_no = rs.getString(12);
                String confirmed_by = rs.getString(13);


                to_confirmation to = new to_confirmation(confirmation_no, child_fname, child_lname, child_mi, father, mother, date_of_confirmation, place_of_confirmation, date_added, time, book_no, page_no, confirmed_by);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

     public static List<to_confirmation> do_ret_confirmation_by_date(String is_approved, String is_payed, String is_married, String search,String date,String times) {
        List<to_confirmation> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = " select confirmation_number"
                    + ",confirmand_fname"
                    + ",confirmand_lname"
                    + ",confirmand_mi"
                    + ",father"
                    + ",mother"
                    + ",date_of_confirmation"
                    + ",place_of_confirmation"
                    + ",date_added"
                    + ",time"
                    + ",book_no"
                    + ",page_no"
                    + ",confirmed_by from db_bulletin.confirmation where "
                    + " is_confirmed='" + is_married + "' and is_approved='" + is_approved + "' and is_payed='" + is_payed + "'  and date(date_of_confirmation)=date('" + date + "') and time='" + times + "' and confirmation_number like '" + search + "%' ";


            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String confirmation_no = rs.getString(1);
                String child_fname = rs.getString(2);
                String child_lname = rs.getString(3);
                String child_mi = rs.getString(4);
                String father = rs.getString(5);
                String mother = rs.getString(6);
                String date_of_confirmation = rs.getString(7);
                String place_of_confirmation = rs.getString(8);
                String date_added = rs.getString(9);
                String time = rs.getString(10);
                String book_no = rs.getString(11);
                String page_no = rs.getString(12);
                String confirmed_by = rs.getString(13);


                to_confirmation to = new to_confirmation(confirmation_no, child_fname, child_lname, child_mi, father, mother, date_of_confirmation, place_of_confirmation, date_added, time, book_no, page_no, confirmed_by);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void do_add(to_confirmation data, ArrayListModel l) {


        List<S9_confirmation.to_sponsors> datas = l;

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.confirmation("
                    + "confirmation_number"
                    + ",confirmand_fname"
                    + ",confirmand_lname"
                    + ",confirmand_mi"
                    + ",father"
                    + ",mother"
                    + ",date_of_confirmation"
                    + ",place_of_confirmation"
                    + ",date_added"
                    + ",time"
                    + ",date_modified"
                    + ",is_approved"
                    + ",is_confirmed"
                    + ",book_no"
                    + ",page_no"
                    + ",is_payed"
                    + ",confirmed_by"
                    + ")values("
                    + "?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?,?,?) ";
            String date = DateType.datetime.format(new Date());
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, data.confirmation_no);
            stmt.setString(2, data.child_fname);
            stmt.setString(3, data.child_lname);
            stmt.setString(4, data.child_mi);
            stmt.setString(5, data.father);

            stmt.setString(6, data.mother);
            stmt.setString(7, data.date_of_confirmation);
            stmt.setString(8, data.place_of_confirmation);
            stmt.setString(9, date);
            stmt.setString(10, data.time);

            stmt.setString(11, date);
            stmt.setString(12, "no");
            stmt.setString(13, "no");
            stmt.setString(14, data.book_no);
            stmt.setString(15, data.page_no);

            stmt.setString(16, "no");
            stmt.setString(17, data.confirmed_by);
            stmt.execute();

            for (S9_confirmation.to_sponsors tt : datas) {
                String s1 = "insert into db_bulletin.confirmand_sponsors(confirmation_number,sponsor_name)values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(s1);
                stmt2.setString(1, data.confirmation_no);
                stmt2.setString(2, tt.name);
                stmt2.execute();

            }
            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }

    public static void edit_confirmation(to_confirmation data, ArrayListModel l) {

        String date = DateType.datetime.format(new Date());
        List<S9_confirmation.to_sponsors> datas = l;
        try {
            Connection conn = PoolConnection.connect();
            String s0 =
                    "update db_bulletin.confirmation set confirmand_fname ='" + data.child_fname + "'"
                    + ",confirmand_lname ='" + data.child_lname + "'"
                    + ",confirmand_mi ='" + data.child_mi + "'"
                    + ",father ='" + data.father + "'"
                    + ",mother ='" + data.mother + "'"
                    + ",date_of_confirmation ='" + data.date_of_confirmation + "'"
                    + ",place_of_confirmation ='" + data.place_of_confirmation + "'"
                    + ",time ='" + data.time + "'"
                    + ",date_modified ='" + date + "'"
                    + ",book_no ='" + data.book_no + "'"
                    + ",page_no ='" + data.page_no + "'"
                    + ",confirmed_by ='" + data.confirmed_by + "'"
                    + "where   confirmation_number ='" + data.confirmation_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s2 = "delete from db_bulletin.confirmand_sponsors where confirmation_number='" + data.confirmation_no + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s2);
            stmt3.execute();

            for (S9_confirmation.to_sponsors tt : datas) {
                String s1 = "insert into db_bulletin.confirmand_sponsors(confirmation_number,sponsor_name )values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(s1);
                stmt2.setString(1, data.confirmation_no);
                stmt2.setString(2, tt.name);
                stmt2.execute();

            }
            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }

    public static void approve_confirmation(String confirmation_no) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "update db_bulletin.confirmation set is_approved='" + "yes" + "' where  confirmation_number='" + confirmation_no + "' ";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void confirm_confirmation(String confirmation_no) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "update db_bulletin.confirmation set is_confirmed='" + "yes" + "' where  confirmation_number='" + confirmation_no + "' ";
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
            String s0 = "delete from db_bulletin.confirmation where  confirmation_number='" + t + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.confirmand_sponsors where  confirmation_number='" + t + "'";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
