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
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class S7_marriage {

    public static class to_witnesses {

        public final String id;
        public final String marriage_number;
        public String name;

        public to_witnesses(String id, String marriage_number, String name) {
            this.id = id;
            this.marriage_number = marriage_number;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class to_marriage_details {

        public final String marriage_number;
        public final String series_of;
        public final String groom_fname;
        public final String groom_lname;
        public final String groom_mname;
        public final String groom_father;
        public final String groom_mother;
        public final String groom_address;
        public final String bride_fname;
        public final String bride_lname;
        public final String bride_mname;
        public final String bride_father;
        public final String bride_mother;
        public final String bride_address;
        public final String date_of_marriage;
        public final String time_of_marriage;
        public final String solemnized_by;
        public final String book_number;
        public final String page_number;
        public final String date_added;
        public final String g_contact;
        public final String b_contact;
        public final String wedding_type;

        public to_marriage_details(String marriage_number, String series_of, String groom_fname, String groom_lname, String groom_mname, String groom_father, String groom_mother, String groom_address, String bride_fname, String bride_lname, String bride_mname, String bride_father, String bride_mother, String bride_address, String date_of_marriage, String time_of_marriage, String solemnized_by, String book_number, String page_number, String date_added, String g_contact, String b_contact, String wedding_type) {
            this.marriage_number = marriage_number;
            this.series_of = series_of;

            this.groom_fname = groom_fname;
            this.groom_lname = groom_lname;
            this.groom_mname = groom_mname;
            this.groom_father = groom_father;
            this.groom_mother = groom_mother;
            this.groom_address = groom_address;

            this.bride_fname = bride_fname;
            this.bride_lname = bride_lname;
            this.bride_mname = bride_mname;
            this.bride_father = bride_father;
            this.bride_mother = bride_mother;
            this.bride_address = bride_address;

            this.date_of_marriage = date_of_marriage;
            this.time_of_marriage = time_of_marriage;

            this.solemnized_by = solemnized_by;
            this.book_number = book_number;
            this.page_number = page_number;

            this.date_added = date_added;
            this.g_contact = g_contact;
            this.b_contact = b_contact;
            this.wedding_type = wedding_type;
        }
    }

    public static class to_edit_marriage {

        public final String wedding_type;
        public final String g_fname;
        public final String g_mi;
        public final String g_lname;
        public final String g_moname;
        public final String g_faname;
        public final String b_fname;
        public final String b_mi;
        public final String b_lname;
        public final String b_moname;
        public final String b_faname;
        public final String ref_no;
        public final String g_contact;
        public final String g_address;
        public final String b_contact;
        public final String b_address;
        public final String priest;
        public final Date date_added;
        public final String time;

        public to_edit_marriage(String wedding_type, String g_fname, String g_mi, String g_lname, String g_moname, String g_faname, String b_fname, String b_mi, String b_lname, String b_moname, String b_faname, String ref_no, String g_contact, String g_address, String b_contact, String b_address, String priest, Date date_added, String time) {
            this.wedding_type = wedding_type;
            this.g_fname = g_fname;
            this.g_mi = g_mi;
            this.g_lname = g_lname;
            this.g_moname = g_moname;
            this.g_faname = g_faname;
            this.b_fname = b_fname;
            this.b_mi = b_mi;
            this.b_lname = b_lname;
            this.b_moname = b_moname;
            this.b_faname = b_faname;
            this.ref_no = ref_no;
            this.g_contact = g_contact;
            this.g_address = g_address;
            this.b_contact = b_contact;
            this.b_address = b_address;
            this.priest = priest;
            this.date_added = date_added;
            this.time = time;
        }
    }

    public static List<to_witnesses> add_witnesses(String id, String mar_num, String name) {
        List<to_witnesses> datas = new ArrayList();
        to_witnesses to = new to_witnesses(id, mar_num, name);
        datas.add(to);
        return datas;
    }


    public static List<to_witnesses> ret_witnesses(String marriage_numer) {
        List<to_witnesses> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select id, marriage_number,name from db_bulletin.marriage_witnesses where marriage_number='" + marriage_numer + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String marriage_number = rs.getString(2);
                String name = rs.getString(3);
                to_witnesses to = new to_witnesses(id, marriage_number, name);
                datas.add(to);
            }

            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_add_marriage(S7_marriage.to_marriage_details data, List<S7_marriage.to_witnesses> wit) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "insert into db_bulletin.marriage("
                    + "marriage_number"
                    + ",series_of"
                    + ",groom_fname,groom_lname,groom_mname,groom_father,groom_mother,groom_address,groom_contact"
                    + ",bride_fname,bride_lname,bride_mname,bride_father,bride_mother,bride_address,bride_contact"
                    + ",date_of_marriage"
                    + ",time_of_marriage"
                    + ",solemnized_by"
                    + ",book_number"
                    + ",page_number"
                    + ",date_added,is_approved,is_payed,is_married,wedding_type,date_modified)"
                    + "values(?,?"
                    + ",?,?,?,?,?,?,?"
                    + ",?,?,?,?,?,?,?"
                    + ",?,?,?,?,?,?,?,?,?,?,?)";

              String d=DateType.datetime.format(new Date());
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, data.marriage_number);
            stmt.setString(2, data.series_of);

            stmt.setString(3, data.groom_fname);
            stmt.setString(4, data.groom_lname);
            stmt.setString(5, data.groom_mname);
            stmt.setString(6, data.groom_father);
            stmt.setString(7, data.groom_mother);
            stmt.setString(8, data.groom_address);
            stmt.setString(9, data.g_contact);

            stmt.setString(10, data.bride_fname);
            stmt.setString(11, data.bride_lname);
            stmt.setString(12, data.bride_mname);
            stmt.setString(13, data.bride_father);
            stmt.setString(14, data.bride_mother);
            stmt.setString(15, data.bride_address);
            stmt.setString(16, data.b_contact);

            stmt.setString(17, data.date_of_marriage);
            stmt.setString(18, data.time_of_marriage);
            stmt.setString(19, data.solemnized_by);
            stmt.setString(20, data.book_number);
            stmt.setString(21, data.page_number);
            stmt.setString(22, data.date_added);

            stmt.setString(23, "no");
            stmt.setString(24, "no");
            stmt.setString(25, "no");
            stmt.setString(26, data.wedding_type);
            stmt.setString(27, d);

            stmt.execute();

         
            List<S7_marriage.to_witnesses> datas = wit;

            for (to_witnesses ta : datas) {
                String s1 = "insert into db_bulletin.marriage_witnesses(marriage_number,name)values(?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, data.marriage_number);
                stmt1.setString(2, ta.name);
                stmt1.execute();

            }



            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_marriage(to_edit_marriage to, List<S7_marriage.to_witnesses> wit) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "update db_bulletin.marriage set "
                    //               + "marriage_number"
                    //                    + ",series_of"
                    + "groom_fname = '" + to.g_fname + "'"
                    + ",groom_lname= '" + to.g_lname + "'"
                    + ",groom_mname= '" + to.g_mi + "'"
                    + ",groom_father= '" + to.g_faname + "'"
                    + ",groom_mother= '" + to.g_moname + "'"
                    + ",groom_address= '" + to.g_address + "'"
                    + ",groom_contact= '" + to.g_contact + "'"
                    + ""
                    + ",bride_fname= '" + to.b_fname + "'"
                    + ",bride_lname= '" + to.b_lname + "'"
                    + ",bride_mname= '" + to.b_mi + "'"
                    + ",bride_father= '" + to.b_faname + "'"
                    + ",bride_mother= '" + to.b_moname + "'"
                    + ",bride_address= '" + to.b_address + "'"
                    + ",bride_contact= '" + to.b_contact + "'"
                    + ""
                    + ",date_of_marriage= '" + DateType.datetime.format(to.date_added) + "'"
                    + ",time_of_marriage= '" + to.time + "'"
                    + ",solemnized_by= '" + to.priest + "'"
                    + ",wedding_type= '" + to.wedding_type + "' where marriage_number='" + to.ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.marriage_witnesses where marriage_number='" + to.ref_no + "'";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();



            List<S7_marriage.to_witnesses> datas = wit;

            for (to_witnesses ta : datas) {
                String s2 = "insert into db_bulletin.marriage_witnesses(marriage_number,name)values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(s2);
                stmt2.setString(1, to.ref_no);
                stmt2.setString(2, ta.name);
                stmt2.execute();

            }


            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<S7_marriage.to_marriage_details> ret_data(String is_approved, String is_payed, String is_married, String search) {
        List<S7_marriage.to_marriage_details> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "marriage_number"
                    + ",series_of"
                    + ",groom_fname"
                    + ",groom_lname"
                    + ",groom_mname"
                    + ",groom_father"
                    + ",groom_mother"
                    + ",groom_address"
                    + ",groom_contact"
                    + ""
                    + ",bride_fname"
                    + ",bride_lname"
                    + ",bride_mname"
                    + ",bride_father"
                    + ",bride_mother"
                    + ",bride_address"
                    + ",bride_contact"
                    + ""
                    + ",date(date_of_marriage)"
                    + ",time_of_marriage"
                    + ",solemnized_by"
                    + ",book_number"
                    + ",page_number"
                    + ",date_added "
                    + ",wedding_type "
                    + "from db_bulletin.marriage where "
                    + "is_approved='" + is_approved + "' and is_payed='" + is_payed + "' and is_married='" + is_married + "' and marriage_number like '" + search + "%' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String marriage_number = rs.getString(1);
                String series_of = rs.getString(2);

                String groom_fname = rs.getString(3);
                String groom_lname = rs.getString(4);
                String groom_mname = rs.getString(5);
                String groom_father = rs.getString(6);
                String groom_mother = rs.getString(7);
                String groom_address = rs.getString(8);
                String groom_contact = rs.getString(9);

                String bride_fname = rs.getString(10);
                String bride_lname = rs.getString(11);
                String bride_mname = rs.getString(12);
                String bride_father = rs.getString(13);
                String bride_mother = rs.getString(14);
                String bride_address = rs.getString(15);
                String bride_contact = rs.getString(16);

                String date_of_marriage = rs.getString(17);
                String time_of_marriage = rs.getString(18);
                String solemnized_by = rs.getString(19);
                String book_number = rs.getString(20);
                String page_number = rs.getString(21);
                String date_added = rs.getString(22);

                String wedding_type = rs.getString(23);
                S7_marriage.to_marriage_details to = new to_marriage_details(marriage_number, series_of, groom_fname, groom_lname, groom_mname, groom_father, groom_mother, groom_address, bride_fname, bride_lname, bride_mname, bride_father, bride_mother, bride_address, date_of_marriage, time_of_marriage, solemnized_by, book_number, page_number, date_added, groom_contact, bride_contact, wedding_type);

                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<S7_marriage.to_marriage_details> ret_data_by_date(String is_approved, String is_payed, String is_married, String search, String date, String time) {
      
        String dd=date;
        List<S7_marriage.to_marriage_details> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select "
                    + "marriage_number"
                    + ",series_of"
                    + ",groom_fname"
                    + ",groom_lname"
                    + ",groom_mname"
                    + ",groom_father"
                    + ",groom_mother"
                    + ",groom_address"
                    + ",groom_contact"
                    + ""
                    + ",bride_fname"
                    + ",bride_lname"
                    + ",bride_mname"
                    + ",bride_father"
                    + ",bride_mother"
                    + ",bride_address"
                    + ",bride_contact"
                    + ""
                    + ",date(date_of_marriage)"
                    + ",time_of_marriage"
                    + ",solemnized_by"
                    + ",book_number"
                    + ",page_number"
                    + ",date_added "
                    + ",wedding_type "
                    + "from db_bulletin.marriage where "
                    
                    + " is_married='" + is_married + "' and is_approved='" + is_approved + "' and is_payed='" + is_payed + "'  and date(date_of_marriage)=date('" + dd + "') and time_of_marriage='" + time + "' and marriage_number like '" + search + "%'";

            //                 and
//            System.out.println(is_married);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String marriage_number = rs.getString(1);
                String series_of = rs.getString(2);

                String groom_fname = rs.getString(3);
                String groom_lname = rs.getString(4);
                String groom_mname = rs.getString(5);
                String groom_father = rs.getString(6);
                String groom_mother = rs.getString(7);
                String groom_address = rs.getString(8);
                String groom_contact = rs.getString(9);

                String bride_fname = rs.getString(10);
                String bride_lname = rs.getString(11);
                String bride_mname = rs.getString(12);
                String bride_father = rs.getString(13);
                String bride_mother = rs.getString(14);
                String bride_address = rs.getString(15);
                String bride_contact = rs.getString(16);

                String date_of_marriage = rs.getString(17);
                String time_of_marriage = rs.getString(18);
                String solemnized_by = rs.getString(19);
                String book_number = rs.getString(20);
                String page_number = rs.getString(21);
                String date_added = rs.getString(22);

                String wedding_type = rs.getString(23);
                S7_marriage.to_marriage_details to = new to_marriage_details(marriage_number, series_of, groom_fname, groom_lname, groom_mname, groom_father, groom_mother, groom_address, bride_fname, bride_lname, bride_mname, bride_father, bride_mother, bride_address, date_of_marriage, time_of_marriage, solemnized_by, book_number, page_number, date_added, groom_contact, bride_contact, wedding_type);

                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void delete_marriage(String ref_no) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.marriage where marriage_number='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.marriage_witnesses where marriage_number='" + ref_no + "'";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();
//            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void approve_marriage(String ref_no) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update  db_bulletin.marriage set is_approved='" + "yes" + "'where marriage_number='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
//            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void confirm_marriage(String ref_no) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update  db_bulletin.marriage set is_married='" + "yes" + "'where marriage_number='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
//            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
