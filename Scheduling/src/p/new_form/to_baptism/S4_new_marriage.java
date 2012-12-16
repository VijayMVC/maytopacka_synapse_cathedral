/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form.to_baptism;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;
import p.new_form.Dlg_new_confirmation;
import p.new_form.Dlg_new_marriages;
import bb.svc2.S6_parishioners;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class S4_new_marriage {

    public static void add_marriage(Dlg_new_marriages.to_marriage to, List<Dlg_new_marriages.to_marriage_sponsors> sponsors) {


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.marriage_1("
                    + "g_ref_no"
                    + ",g_fname"
                    + ",g_mi"
                    + ",g_lname"
                    + ",g_bday"
                    + ",g_place_of_birth"
                    + ",g_bapt_date"
                    + ",g_bapt_place"
                    + ",g_disp_cult"
                    + ",g_disp_canonical"
                    + ",g_former_marr"
                    + ",g_father"
                    + ",g_mother"
                    + ",b_ref_no"
                    + ",b_fname"
                    + ",b_mi"
                    + ",b_lname"
                    + ",b_bday"
                    + ",b_place_of_birth"
                    + ",b_bapt_date"
                    + ",b_bapt_place"
                    + ",b_disp_cult"
                    + ",b_disp_canonical"
                    + ",b_former_marr"
                    + ",b_father"
                    + ",b_mother"
                    + ",book_no"
                    + ",page_no"
                    + ",marr_date"
                    + ",marr_time"
                    + ",priest"
                    + ",presider"
                    + ",remarks"
                    + ",status"
                    + ",date_added"
                    + ")values("
                    + "?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);


            String groom_ref_no = to.g_ref_no;
//            System.out.println(groom_ref_no);
            if (to.g_ref_no.equals("0")) {
                groom_ref_no = "" + S6_parishioners.get_ref_id();
                S6_parishioners.to_parishioners to1 = new S6_parishioners.to_parishioners(groom_ref_no, to.g_fname, to.g_mi, to.g_lname, to.g_bapt_date, to.g_bday, to.g_place_of_birth, "", "", "", "", "", "", "", "0", "0", "0", "1", "0", "0", "0", "0", to.date_added, "1"
                        , to.g_bapt_place,"","","","","","","","","");
                S6_parishioners.add_parishioner(to1);

                String s2 = "update db_bulletin.parishioners_1 set is_married='" + "1" + "'  "
 
                        + "where ref_id='" + groom_ref_no + "'";
                PreparedStatement stmt2 = conn.prepareStatement(s2);
                stmt2.execute();
            }
//            System.out.println(groom_ref_no);


            String bride_ref_no = to.b_ref_no;
//             System.out.println(groom_ref_no);
            if (to.b_ref_no.equals("0")) {
                bride_ref_no = "" + S6_parishioners.get_ref_id();
                S6_parishioners.to_parishioners to1 = new S6_parishioners.to_parishioners(bride_ref_no, to.b_fname, to.b_mi, to.b_lname
                        , to.b_bapt_date, to.b_bday, to.b_place_of_birth, "", "", "", "", "", "", "", "0", "0", "0", "1", "0", "0", "0", "0"
                        , to.date_added, "1", to.b_bapt_place,"","","","","","","","","");
                S6_parishioners.add_parishioner(to1);
                String s2 = "update db_bulletin.parishioners_1 set is_married='" + "1" + "'  where ref_id='" + bride_ref_no + "'";
                PreparedStatement stmt2 = conn.prepareStatement(s2);
                stmt2.execute();

            }



            stmt.setString(1, groom_ref_no);
            stmt.setString(2, to.g_fname);
            stmt.setString(3, to.g_mi);
            stmt.setString(4, to.g_lname);
            stmt.setString(5, to.g_bday);

            stmt.setString(6, to.g_place_of_birth);
            stmt.setString(7, to.g_bapt_date);
            stmt.setString(8, to.g_bapt_place);
            stmt.setString(9, to.g_disp_cult);
            stmt.setString(10, to.g_disp_canonical);


            stmt.setString(11, to.g_former_marr);
            stmt.setString(12, to.g_father);
            stmt.setString(13, to.g_mother);
            stmt.setString(14, bride_ref_no);
            stmt.setString(15, to.b_fname);


            stmt.setString(16, to.b_mi);
            stmt.setString(17, to.b_lname);
            stmt.setString(18, to.b_bday);
            stmt.setString(19, to.b_place_of_birth);
            stmt.setString(20, to.b_bapt_date);


            stmt.setString(21, to.b_bapt_place);
            stmt.setString(22, to.b_disp_cult);
            stmt.setString(23, to.b_disp_canonical);
            stmt.setString(24, to.b_former_marr);
            stmt.setString(25, to.b_father);


            stmt.setString(26, to.b_mother);
            stmt.setString(27, to.book_no);
            stmt.setString(28, to.page_no);
            stmt.setString(29, to.marr_date);
            stmt.setString(30, to.marr_time);

            stmt.setString(31, to.priest);
            stmt.setString(32, to.presider);
            stmt.setString(33, to.remarks);
            stmt.setString(34, "4");
            stmt.setString(35, to.date_added);

            stmt.execute();

            for (Dlg_new_marriages.to_marriage_sponsors to1 : sponsors) {
                String s1 = "insert into db_bulletin.marriage_1_sponsors(g_ref_no,b_ref_no,sponsor)values(?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, to.g_ref_no);
                stmt1.setString(2, to.b_ref_no);
                stmt1.setString(3, to1.name);
                stmt1.execute();
            }

              String stat = "1";
            String get = System.getProperty("app_all", "false");
            if (get.equals("true")) {
                stat = "4";
            }

            String s2 = "update db_bulletin.parishioners_1 set is_married='" + "1" + "' "
                          + ",m_date='"+to.marr_date+"', m_book_no='"+to.book_no+"',m_page_no='"+to.page_no+"',m_index_no='"+"1"+"'"
                    + " where ref_id='" + to.g_ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();


            String s3 = "update db_bulletin.parishioners_1 set is_married='" + "1" + "' "
                      + ",m_date='"+to.marr_date+"', m_book_no='"+to.book_no+"',m_page_no='"+to.page_no+"',m_index_no='"+"1"+"'"
                    + " where ref_id='" + to.b_ref_no + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();

            JOptionPane.showMessageDialog(null, "Successfully Added");

            JOptionPane.showMessageDialog(null, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void edit_marriage(Dlg_new_marriages.to_marriage to, List<Dlg_new_marriages.to_marriage_sponsors> sponsors) {


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update   db_bulletin.marriage_1 set g_ref_no = '" + to.g_ref_no + "'"
                    + ",g_fname = '" + to.g_fname + "'"
                    + ",g_mi = '" + to.g_mi + "'"
                    + ",g_lname = '" + to.g_lname + "'"
                    + ",g_bday = '" + to.g_bday + "'"
                    + ",g_place_of_birth = '" + to.g_place_of_birth + "'"
                    + ",g_bapt_date = '" + to.g_bapt_date + "'"
                    + ",g_bapt_place = '" + to.g_bapt_place + "'"
                    + ",g_disp_cult = '" + to.g_disp_cult + "'"
                    + ",g_disp_canonical = '" + to.g_disp_canonical + "'"
                    + ",g_former_marr = '" + to.g_former_marr + "'"
                    + ",g_father = '" + to.g_father + "'"
                    + ",g_mother = '" + to.g_mother + "'"
                    + ",b_ref_no = '" + to.b_ref_no + "'"
                    + ",b_fname = '" + to.b_fname + "'"
                    + ",b_mi = '" + to.b_mi + "'"
                    + ",b_lname = '" + to.b_lname + "'"
                    + ",b_bday = '" + to.b_bday + "'"
                    + ",b_place_of_birth = '" + to.b_place_of_birth + "'"
                    + ",b_bapt_date = '" + to.b_bapt_date + "'"
                    + ",b_bapt_place = '" + to.b_bapt_place + "'"
                    + ",b_disp_cult = '" + to.b_disp_cult + "'"
                    + ",b_disp_canonical = '" + to.b_disp_canonical + "'"
                    + ",b_former_marr = '" + to.b_former_marr + "'"
                    + ",b_father = '" + to.b_father + "'"
                    + ",b_mother = '" + to.b_mother + "'"
                    + ",book_no = '" + to.book_no + "'"
                    + ",page_no = '" + to.page_no + "'"
                    + ",marr_date = '" + to.marr_date + "'"
                    + ",marr_time = '" + to.marr_time + "'"
                    + ",priest = '" + to.priest + "'"
                    + ",presider = '" + to.presider + "'"
                    + "where g_ref_no = '" + to.g_ref_no + "' and b_ref_no = '" + to.b_ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);



            stmt.execute();

            String ss1 = "delete from db_bulletin.marriage_1_sponsors where g_ref_no = '" + to.g_ref_no + "' and b_ref_no = '" + to.b_ref_no + "'";
            PreparedStatement stmt11 = conn.prepareStatement(ss1);
            stmt11.execute();

            for (Dlg_new_marriages.to_marriage_sponsors to1 : sponsors) {
                String s1 = "insert into db_bulletin.marriage_1_sponsors(g_ref_no,b_ref_no,sponsor)values(?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, to.g_ref_no);
                stmt1.setString(2, to.b_ref_no);
                stmt1.setString(3, to1.name);
                stmt1.execute();
            }
               String s1="update db_bulletin.parishioners_1 set m_date ='" + to.marr_date + "'"
                    + ",m_book_no ='" + to.book_no + "'"
                    + ",m_page_no='" + to.page_no + "' "
                    + ",m_index_no ='" + "1" + "' where ref_id='"+to.g_ref_no+"'";
            PreparedStatement stm2 = conn.prepareStatement(s1);            
            stm2.execute();
            
              String s2="update db_bulletin.parishioners_1 set m_date ='" + to.marr_date + "'"
                    + ",m_book_no ='" + to.book_no + "'"
                    + ",m_page_no='" + to.page_no + "' "
                    + ",m_index_no ='" + "1" + "' where ref_id='"+to.b_ref_no+"'";
            PreparedStatement stm3 = conn.prepareStatement(s2);            
            stm3.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void delete(String g_ref_no, String b_ref_no) {
        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.marriage_1 where g_ref_no = '" + g_ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.marriage_1 where b_ref_no = '" + b_ref_no + "'";

            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();


            String s2 = "update db_bulletin.parishioners_1 set is_married='" + "0" + "' where ref_id='" + g_ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            String s3 = "update db_bulletin.parishioners_1 set is_married='" + "0" + "' where ref_id='" + b_ref_no + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static Dlg_new_marriages.to_marriage ret_details(String ref_n) {
        Dlg_new_marriages.to_marriage to = null;

        try {
            Connection conn = PoolConnection.connect();
            String s0 = " select "
                    + "g_ref_no"
                    + ",g_fname"
                    + ",g_mi"
                    + ",g_lname"
                    + ",g_bday"
                    + ",g_place_of_birth"
                    + ",g_bapt_date"
                    + ",g_bapt_place"
                    + ",g_disp_cult"
                    + ",g_disp_canonical"
                    + ",g_former_marr"
                    + ",g_father"
                    + ",g_mother"
                    + ",b_ref_no"
                    + ",b_fname"
                    + ",b_mi"
                    + ",b_lname"
                    + ",b_bday"
                    + ",b_place_of_birth"
                    + ",b_bapt_date"
                    + ",b_bapt_place"
                    + ",b_disp_cult"
                    + ",b_disp_canonical"
                    + ",b_former_marr"
                    + ",b_father"
                    + ",b_mother"
                    + ",book_no"
                    + ",page_no"
                    + ",marr_date"
                    + ",marr_time"
                    + ",priest"
                    + ",presider"
                    + ",remarks"
                    + ",status"
                    + ",date_added "
                    + "from db_bulletin.marriage_1 where g_ref_no='" + ref_n + "' or b_ref_no='" + ref_n + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                String g_ref_no = rs.getString(1);
                String g_fname = rs.getString(2);
                String g_mi = rs.getString(3);
                String g_lname = rs.getString(4);
                String g_bday = rs.getString(5);

                String g_place_of_birth = rs.getString(6);
                String g_bapt_date = rs.getString(7);
                String g_bapt_place = rs.getString(8);
                String g_disp_cult = rs.getString(9);
                String g_disp_canonical = rs.getString(10);

                String g_former_marr = rs.getString(11);
                String g_father = rs.getString(12);
                String g_mother = rs.getString(13);
                String b_ref_no = rs.getString(14);
                String b_fname = rs.getString(15);

                String b_mi = rs.getString(16);
                String b_lname = rs.getString(17);
                String b_bday = rs.getString(18);
                String b_place_of_birth = rs.getString(19);
                String b_bapt_date = rs.getString(20);

                String b_bapt_place = rs.getString(21);
                String b_disp_cult = rs.getString(22);
                String b_disp_canonical = rs.getString(23);
                String b_former_marr = rs.getString(24);
                String b_father = rs.getString(25);

                String b_mother = rs.getString(26);
                String book_no = rs.getString(27);
                String page_no = rs.getString(28);
                String marr_date = rs.getString(29);
                String marr_time = rs.getString(30);

                String priest = rs.getString(31);
                String presider = rs.getString(32);
                String remarks = rs.getString(33);
                String status = rs.getString(34);
                String date_added = rs.getString(35);

                to = new Dlg_new_marriages.to_marriage(g_ref_no, g_fname, g_mi, g_lname, g_bday, g_place_of_birth, g_bapt_date, g_bapt_place, g_disp_cult, g_disp_canonical, g_former_marr, g_father, g_mother, b_ref_no, b_fname, b_mi, b_lname, b_bday, b_place_of_birth, b_bapt_date, b_bapt_place, b_disp_cult, b_disp_canonical, b_former_marr, b_father, b_mother, book_no, page_no, marr_date, marr_time, priest, presider, remarks, status, date_added);
            }
            return to;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<Dlg_new_marriages.to_marriage_sponsors> ret_bap_sponsors(String g_ref_no) {

        List<Dlg_new_marriages.to_marriage_sponsors> datas = new ArrayList();

        try {

            String s0 = "select sponsor from db_bulletin.marriage_1_sponsors where g_ref_no='" + g_ref_no + "' or b_ref_no='" + g_ref_no + "'";
            Connection conn = PoolConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println(name);
                Dlg_new_marriages.to_marriage_sponsors to = new Dlg_new_marriages.to_marriage_sponsors(name);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }
}
