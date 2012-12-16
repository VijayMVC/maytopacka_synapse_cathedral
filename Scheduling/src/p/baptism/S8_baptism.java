/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.baptism;

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
public class S8_baptism {

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

    public static class to_baptism {

        public final String baptismal_number;
        public final String child_fname;
        public final String child_lname;
        public final String child_mi;
        public final String father;
        public final String mother;
        public final String place_of_birth;
        public final String date_of_birth;
        public final String date_of_baptism;
        public final String time_of_baptism;
        public final String baptized_by;
        public final String book_number;
        public final String page_number;
        public final String date_added;
        public final String date_modified;

        public to_baptism(String baptismal_number, String child_fname, String child_lname, String child_mi, String father, String mother, String place_of_birth, String date_of_birth, String date_of_baptism, String time_of_baptism, String baptized_by, String book_number, String page_number, String date_added, String date_modified) {
            this.baptismal_number = baptismal_number;
            this.child_fname = child_fname;
            this.child_lname = child_lname;
            this.child_mi = child_mi;
            this.father = father;
            this.mother = mother;
            this.place_of_birth = place_of_birth;
            this.date_of_birth = date_of_birth;
            this.date_of_baptism = date_of_baptism;
            this.time_of_baptism = time_of_baptism;
            this.baptized_by = baptized_by;
            this.book_number = book_number;
            this.page_number = page_number;
            this.date_added = date_added;
            this.date_modified = date_modified;
        }
    }

    public static List<S8_baptism.to_sponsors> ret_data(String bapt_num) {
        List<S8_baptism.to_sponsors> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select sponsors,id from db_bulletin.baptism_sponsors where baptismal_number='" + bapt_num + "'";
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

    public static List<to_baptism> do_ret_baptized(String is_approved, String is_payed, String is_married, String search) {
        List<to_baptism> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 =
                    " select "
                    + "baptismal_number"
                    + ",child_fname"
                    + ",child_lname"
                    + ",child_mi"
                    + ",father"
                    + ",mother"
                    + ",place_of_birth"
                    + ",date_of_birth"
                    + ",date_of_baptism"
                    + ",time_of_baptism"
                    + ",baptized_by"
                    + ",book_number"
                    + ",page_number"
                    + ",date_added"
                    + ",date_modified "
                    + "from db_bulletin.baptism where is_approved='" + is_approved + "' and is_payed='" + is_payed + "' and is_baptized='" + is_married + "' and baptismal_number like '" + search + "%'"
                    + "";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String baptismal_number = rs.getString(1);
                String child_fname = rs.getString(2);
                String child_lname = rs.getString(3);
                String child_mi = rs.getString(4);
                String father = rs.getString(5);
                String mother = rs.getString(6);
                String place_of_birth = rs.getString(7);
                String date_of_birth = rs.getString(8);
                String date_of_baptism = rs.getString(9);
                String time_of_baptism = rs.getString(10);
                String baptized_by = rs.getString(11);
                String book_number = rs.getString(12);
                String page_number = rs.getString(13);
                String date_added = rs.getString(14);
                String date_modified = rs.getString(15);

                to_baptism to = new to_baptism(baptismal_number, child_fname, child_lname, child_mi, father, mother, place_of_birth, date_of_birth, date_of_baptism, time_of_baptism, baptized_by, book_number, page_number, date_added, date_modified);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<to_baptism> do_ret_baptized_by_date(String is_approved, String is_payed, String is_married, String search, String date, String times) {
        List<to_baptism> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 =
                    " select "
                    + "baptismal_number"
                    + ",child_fname"
                    + ",child_lname"
                    + ",child_mi"
                    + ",father"
                    + ",mother"
                    + ",place_of_birth"
                    + ",date_of_birth"
                    + ",date_of_baptism"
                    + ",time_of_baptism"
                    + ",baptized_by"
                    + ",book_number"
                    + ",page_number"
                    + ",date_added"
                    + ",date_modified "
                    + "from db_bulletin.baptism where "
                    + " is_baptized='" + is_married + "' and is_approved='" + is_approved + "' and is_payed='" + is_payed + "'  and date(date_of_baptism)=date('" + date + "') and time_of_baptism='" + times + "' and baptismal_number like '" + search + "%'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String baptismal_number = rs.getString(1);
                String child_fname = rs.getString(2);
                String child_lname = rs.getString(3);
                String child_mi = rs.getString(4);
                String father = rs.getString(5);
                String mother = rs.getString(6);
                String place_of_birth = rs.getString(7);
                String date_of_birth = rs.getString(8);
                String date_of_baptism = rs.getString(9);
                String time_of_baptism = rs.getString(10);
                String baptized_by = rs.getString(11);
                String book_number = rs.getString(12);
                String page_number = rs.getString(13);
                String date_added = rs.getString(14);
                String date_modified = rs.getString(15);

                to_baptism to = new to_baptism(baptismal_number, child_fname, child_lname, child_mi, father, mother, place_of_birth, date_of_birth, date_of_baptism, time_of_baptism, baptized_by, book_number, page_number, date_added, date_modified);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<to_baptism> do_ret_baptized_for_payment(String is_approved, String is_payed, String is_confirm) {

        List<to_baptism> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 =
                    " select "
                    + "baptismal_number"
                    + ",child_fname"
                    + ",child_lname"
                    + ",child_mi"
                    + ",father"
                    + ",mother"
                    + ",place_of_birth"
                    + ",date_of_birth"
                    + ",date_of_baptism"
                    + ",time_of_baptism"
                    + ",baptized_by"
                    + ",book_number"
                    + ",page_number"
                    + ",date_added"
                    + ",date_modified "
                    + "from db_bulletin.baptism where is_approved='" + is_approved + "' and is_payed='" + is_payed + "' and is_baptized='" + is_confirm + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String baptismal_number = rs.getString(1);
                String child_fname = rs.getString(2);
                String child_lname = rs.getString(3);
                String child_mi = rs.getString(4);
                String father = rs.getString(5);
                String mother = rs.getString(6);
                String place_of_birth = rs.getString(7);
                String date_of_birth = rs.getString(8);
                String date_of_baptism = rs.getString(9);
                String time_of_baptism = rs.getString(10);
                String baptized_by = rs.getString(11);
                String book_number = rs.getString(12);
                String page_number = rs.getString(13);
                String date_added = rs.getString(14);
                String date_modified = rs.getString(15);

                to_baptism to = new to_baptism(baptismal_number, child_fname, child_lname, child_mi, father, mother, place_of_birth, date_of_birth, date_of_baptism, time_of_baptism, baptized_by, book_number, page_number, date_added, date_modified);

                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void do_add(to_baptism data, ArrayListModel l) {

        String date = DateType.datetime.format(new Date());
        List<S8_baptism.to_sponsors> datas = l;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.baptism("
                    + "baptismal_number"
                    + ",child_fname"
                    + ",child_lname"
                    + ",child_mi"
                    + ",father"
                    + ",mother"
                    + ",place_of_birth"
                    + ",date_of_birth"
                    + ",date_of_baptism"
                    + ",time_of_baptism"
                    + ",baptized_by"
                    + ",book_number"
                    + ",page_number"
                    + ",date_added"
                    + ",date_modified"
                    + ",is_approved"
                    + ",is_baptized "
                    + ",is_payed"
                    + ")values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, data.baptismal_number);
            stmt.setString(2, data.child_fname);
            stmt.setString(3, data.child_lname);
            stmt.setString(4, data.child_mi);
            stmt.setString(5, data.father);

            stmt.setString(6, data.mother);
            stmt.setString(7, data.place_of_birth);
            stmt.setString(8, data.date_of_birth);
            stmt.setString(9, data.date_of_baptism);
            stmt.setString(10, data.time_of_baptism);

            stmt.setString(11, data.baptized_by);
            stmt.setString(12, data.book_number);
            stmt.setString(13, data.page_number);
            stmt.setString(14, date);
            stmt.setString(15, date);
            stmt.setString(16, "no");
            stmt.setString(17, "no");
            stmt.setString(18, "no");
            stmt.execute();

            for (S8_baptism.to_sponsors tt : datas) {
                String s1 = "insert into db_bulletin.baptism_sponsors(baptismal_number,sponsors)values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(s1);
                stmt2.setString(1, data.baptismal_number);
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

    public static void edit_baptism(to_baptism data, ArrayListModel l) {

        String date = DateType.datetime.format(new Date());
        List<S8_baptism.to_sponsors> datas = l;
        try {
            Connection conn = PoolConnection.connect();
            String s0 =
                    "update db_bulletin.baptism set child_fname ='" + data.child_fname + "'"
                    + ",child_lname ='" + data.child_lname + "'"
                    + ",child_mi ='" + data.child_mi + "'"
                    + ",father ='" + data.father + "'"
                    + ",mother ='" + data.mother + "'"
                    + ",place_of_birth ='" + data.place_of_birth + "'"
                    + ",date_of_birth ='" + data.date_of_birth + "'"
                    + ",date_of_baptism ='" + data.date_of_baptism + "'"
                    + ",time_of_baptism ='" + data.time_of_baptism + "'"
                    + ",baptized_by ='" + data.baptized_by + "'"
                    + ",book_number ='" + data.book_number + "'"
                    + ",page_number ='" + data.page_number + "'"
                    + ",date_modified ='" + date + "' "
                    + "where   baptismal_number ='" + data.baptismal_number + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s2 = "delete from db_bulletin.baptism_sponsors where baptismal_number='" + data.baptismal_number + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s2);
            stmt3.execute();

            for (S8_baptism.to_sponsors tt : datas) {
                String s1 = "insert into db_bulletin.baptism_sponsors(baptismal_number,sponsors)values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(s1);
                stmt2.setString(1, data.baptismal_number);
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

    public static void approve_baptism(String baptimal_number) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.baptism set is_approved='" + "yes" + "' where baptismal_number='" + baptimal_number + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void confirm_baptism(String baptimal_number) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.baptism set is_baptized='" + "yes" + "' where baptismal_number='" + baptimal_number + "'";
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
            String s0 = "delete from db_bulletin.baptism where  baptismal_number='" + t + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.baptism_sponsors where  baptismal_number='" + t + "'";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
