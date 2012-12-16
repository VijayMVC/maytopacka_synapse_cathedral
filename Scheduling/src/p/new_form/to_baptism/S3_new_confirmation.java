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
import p.baptism.S8_baptism;
import p.confirmation.Dlg_confirmation;
import p.new_form.Dlg_new_confirmation;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class S3_new_confirmation {

    public static void add(Dlg_new_confirmation.to_confirmation to_conf, String ref_no, List<Dlg_new_confirmation.to_conf_sponsors> sponsors) {
        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.confirmation_1("
                    + "ref_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",bday"
                    + ",place_of_birth"
                    + ",bapt_date"
                    + ",bapt_place"
                    + ",book_no"
                    + ",page_no"
                    + ",conf_date"
                    + ",conf_time"
                    + ",priest"
                    + ",presider"
                    + ",remarks"
                    + ",status"
                    + ",date_added"
                    + ",father"
                    + ",mother"
                    + ")values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, ref_no);
            stmt.setString(2, to_conf.fname);
            stmt.setString(3, to_conf.mi);
            stmt.setString(4, to_conf.lname);
            stmt.setString(5, to_conf.bday);

            stmt.setString(6, to_conf.place_of_birth);
            stmt.setString(7, to_conf.bapt_date);
            stmt.setString(8, to_conf.bapt_place);
            stmt.setString(9, to_conf.book_no);
            stmt.setString(10, to_conf.page_no);

            stmt.setString(11, to_conf.conf_date);
            stmt.setString(12, to_conf.time);
            stmt.setString(13, to_conf.priest);
            stmt.setString(14, to_conf.presider);
            stmt.setString(15, to_conf.remarks);

            stmt.setString(16, "4");
            stmt.setString(17, date_added);
            stmt.setString(18, to_conf.father);
            stmt.setString(19, to_conf.mother);
            stmt.execute();

            for (Dlg_new_confirmation.to_conf_sponsors to : sponsors) {
                String s1 = "insert into db_bulletin.confirmation_1_sponsors(ref_no,sponsor)values(?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setString(2, to.name);
                stmt1.execute();
            }

            String stat = "1";
            String get = System.getProperty("app_all", "false");
            if (get.equals("true")) {
                stat = "4";
            }

            String s2 = "update db_bulletin.parishioners_1 set is_confirm='" +stat + "' "
                     + ",c_date='"+to_conf.conf_date+"', c_book_no='"+to_conf.book_no+"',c_page_no='"+to_conf.page_no+"',c_index_no='"+"1"+"'"
                    + "where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit(Dlg_new_confirmation.to_confirmation to_conf, String ref_no, List<Dlg_new_confirmation.to_conf_sponsors> sponsors) {
        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.confirmation_1 set "
                    + "fname = '" + to_conf.fname + "'"
                    + ",mi = '" + to_conf.mi + "'"
                    + ",lname = '" + to_conf.lname + "'"
                    + ",bday = '" + to_conf.bday + "'"
                    + ",place_of_birth = '" + to_conf.place_of_birth + "'"
                    + ",bapt_date = '" + to_conf.bapt_date + "'"
                    + ",bapt_place = '" + to_conf.bapt_place + "'"
                    + ",book_no = '" + to_conf.book_no + "'"
                    + ",page_no = '" + to_conf.page_no + "'"
                    + ",conf_date = '" + to_conf.conf_date + "'"
                    + ",conf_time = '" + to_conf.time + "'"
                    + ",priest = '" + to_conf.priest + "'"
                    + ",presider = '" + to_conf.presider + "'"
                    + ",remarks = '" + to_conf.remarks + "'"
                    + ",father = '" + to_conf.father + "'"
                    + ",mother = '" + to_conf.mother + "'"
                  
                    + "where ref_no = '" + ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();


            List<Dlg_new_confirmation.to_conf_sponsors> sponsor = sponsors;

            String ss1 = "delete from db_bulletin.confirmation_1_sponsors where ref_no='" + ref_no + "' ";
            PreparedStatement stmt11 = conn.prepareStatement(ss1);
            stmt11.execute();

            for (Dlg_new_confirmation.to_conf_sponsors t : sponsor) {
                String s1 = "insert into db_bulletin.confirmation_1_sponsors(ref_no,sponsor)values(?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setString(2, t.name);
                stmt1.execute();

            }

              String s2="update db_bulletin.parishioners_1 set c_date ='" + to_conf.conf_date + "'"
                    + ",c_book_no ='" + to_conf.book_no + "'"
                    + ",c_page_no='" + to_conf.page_no + "' "
                    + ",c_index_no ='" + "1" + "' where ref_id='"+ref_no+"'";
            PreparedStatement stm3 = conn.prepareStatement(s2);            
            stm3.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete(String ref_no) {
        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.confirmation_1 where ref_no = '" + ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();


            String s2 = "update db_bulletin.parishioners_1 set is_confirm='" + "0" + "' where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static Dlg_new_confirmation.to_confirmation get_details(String ref_no) {

        Dlg_new_confirmation.to_confirmation to = null;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select fname "
                    + ",mi"
                    + ",lname"
                    + ",bday"
                    + ",place_of_birth"
                    + ",bapt_date"
                    + ",bapt_place"
                    + ",book_no"
                    + ",page_no"
                    + ",conf_date"
                    + ",conf_time"
                    + ",priest"
                    + ",presider"
                    + ",remarks"
                    + ",father"
                    + ",mother"
                    + " from db_bulletin.confirmation_1 where ref_no='" + ref_no + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                String fname = rs.getString(1);
                String mi = rs.getString(2);
                String lname = rs.getString(3);
                String bday = rs.getString(4);
                String place_of_birth = rs.getString(5);

                String bapt_date = rs.getString(6);
                String bapt_place = rs.getString(7);
                String book_no = rs.getString(8);
                String page_no = rs.getString(9);
                String comm_date = rs.getString(10);

                String time = rs.getString(11);
                String priest = rs.getString(12);
                String presider = rs.getString(13);
                String remarks = rs.getString(14);
                String father = rs.getString(15);

                String mother = rs.getString(16);
                to = new Dlg_new_confirmation.to_confirmation(
                        fname, mi, lname, bday, place_of_birth, bapt_date, bapt_place, book_no, page_no, comm_date, time, priest, presider, remarks, father, mother);
            }
            return to;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<Dlg_new_confirmation.to_conf_sponsors> ret_bap_sponsors(String ref_no) {

        List<Dlg_new_confirmation.to_conf_sponsors> datas = new ArrayList();

        try {

            String s0 = "select sponsor from db_bulletin.confirmation_1_sponsors where ref_no='" + ref_no + "'";
            Connection conn = PoolConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println(name);
                Dlg_new_confirmation.to_conf_sponsors to = new Dlg_new_confirmation.to_conf_sponsors(name);
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
