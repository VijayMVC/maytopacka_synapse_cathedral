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
import p.new_form.Dlg_new_acceptance;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class S6_new_acceptance {

    public static void add(Dlg_new_acceptance.to_acceptance to, String ref_no,List<S8_baptism.to_sponsors> sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.acceptance(ref_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",bday"
                    + ",place_of_birth"
                    + ",bapt_date"
                    + ",bapt_place"
                    + ",book_no"
                    + ",page_no"
                    + ",acceptance_date"
                    + ",acceptance_time"
                    + ",priest"
                    + ",presider"
                    + ",remarks"
                    + ",status"
                    + ",date_added"
                    + ",father"
                    + ",mother"
                    + ",is_acc"
                    + ",acc_date"
                    + ",is_elected"
                    + ",elected_date"
                    + ",is_scrunity1"
                    + ",scrunity1_date"
                    + ",is_present"
                    + ",present_date"
                    + ",is_scrunity2"
                    + ",scrunity2_date"
                    + ",is_scrunity3"
                    + ",scrunity3_date"
                    + ",is_present_l"
                    + ",present_l_date"
                    + ",is_recit"
                    + ",recit_date"
                    + ",is_ephepheta"
                    + ",ephepheta_date"
                    + ")values("
                    + "?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);

            stmt.setString(1, ref_no);
            stmt.setString(2, to.fname);
            stmt.setString(3, to.mi);
            stmt.setString(4, to.lname);
            stmt.setString(5, to.bday);

            stmt.setString(6, to.place_of_birth);
            stmt.setString(7, to.bapt_date);
            stmt.setString(8, to.bapt_place);
            stmt.setString(9, to.book_no);
            stmt.setString(10, to.page_no);


            stmt.setString(11, to.acceptance_date);
            stmt.setString(12, to.acceptance_time);
            stmt.setString(13, to.priest);
            stmt.setString(14, to.presider);
            stmt.setString(15, to.remarks);


            stmt.setString(16, to.status);
            stmt.setString(17, to.date_added);
            stmt.setString(18, to.father);
            stmt.setString(19, to.mother);
            stmt.setString(20, to.is_acc);

            stmt.setString(21, to.acc_date);
            stmt.setString(22, to.is_elected);
            stmt.setString(23, to.elected_date);
            stmt.setString(24, to.is_scrunity1);
            stmt.setString(25, to.scrunity1_date);


            stmt.setString(26, to.is_present);
            stmt.setString(27, to.present_date);
            stmt.setString(28, to.is_scrunity2);
            stmt.setString(29, to.scrunity2_date);
            stmt.setString(30, to.is_scrunity3);


            stmt.setString(31, to.scrunity3_date);
            stmt.setString(32, to.is_present_l);
            stmt.setString(33, to.present_l_date);
            stmt.setString(34, to.is_recit);
            stmt.setString(35, to.recit_date);

            stmt.setString(36, to.is_ephepheta);
            stmt.setString(37, to.ephepheta_date);

            stmt.execute();

            String s2 = "update db_bulletin.parishioners_1 set is_acceptance='" + "1" + "'  where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

             for (S8_baptism.to_sponsors t : sponsors) {
                String s1 = "insert into db_bulletin.acceptance_sponsors(ref_no,sponsor)values(?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setString(2, t.name);
                stmt1.execute();

            }

            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit(Dlg_new_acceptance.to_acceptance to, String ref_no,List<S8_baptism.to_sponsors> sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update  db_bulletin.acceptance  set "
                    + "  ref_no = '" + ref_no + "'"
                    + ", fname= '" + to.fname + "'"
                    + ", mi= '" + to.mi + "'"
                    + ", lname= '" + to.lname + "'"
                    + ", bday= '" + to.bday + "'"
                    + ", place_of_birth= '" + to.place_of_birth + "'"
                    + ", bapt_date= '" + to.bapt_date + "'"
                    + ", bapt_place= '" + to.bapt_place + "'"
                    + ", book_no= '" + to.book_no + "'"
                    + ", page_no= '" + to.page_no + "'"
                    + ", acceptance_date= '" + to.acceptance_date + "'"
                    + ", acceptance_time= '" + to.acceptance_time + "'"
                    + ", priest= '" + to.priest + "'"
                    + ", presider= '" + to.presider + "'"
                    + ", remarks= '" + to.remarks + "'"
                    + ", status= '" + to.status + "'"
                    + ", date_added= '" + to.date_added + "'"
                    + ", father= '" + to.father + "'"
                    + ", mother= '" + to.mother + "'"
                    + ", is_acc= '" + to.is_acc + "'"
                    + ", acc_date= '" + to.acc_date + "'"
                    + ", is_elected= '" + to.is_elected + "'"
                    + ", elected_date= '" + to.elected_date + "'"
                    + ", is_scrunity1= '" + to.is_scrunity1 + "'"
                    + ", scrunity1_date= '" + to.scrunity1_date + "'"
                    + ", is_present= '" + to.is_present + "'"
                    + ", present_date= '" + to.present_date + "'"
                    + ", is_scrunity2= '" + to.is_scrunity2 + "'"
                    + ", scrunity2_date= '" + to.scrunity2_date + "'"
                    + ", is_scrunity3= '" + to.is_scrunity3 + "'"
                    + ", scrunity3_date= '" + to.scrunity3_date + "'"
                    + ", is_present_l= '" + to.is_present_l + "'"
                    + ", present_l_date= '" + to.present_l_date + "'"
                    + ", is_recit= '" + to.is_recit + "'"
                    + ", recit_date= '" + to.recit_date + "'"
                    + ", is_ephepheta= '" + to.is_ephepheta + "'"
                    + ", ephepheta_date= '" + to.ephepheta_date + "' where ref_no='" + ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);

            stmt.execute();

             List<S8_baptism.to_sponsors> sponsor = sponsors;

            String ss1 = "delete from db_bulletin.acceptance_sponsors where ref_no='" + ref_no + "' ";
            PreparedStatement stmt11 = conn.prepareStatement(ss1);
            stmt11.execute();
            
            for (S8_baptism.to_sponsors t : sponsors) {
                String s1 = "insert into db_bulletin.acceptance_sponsors(ref_no,sponsor)values(?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setString(2, t.name);
                stmt1.execute();

            }
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


            String s1 = "delete from db_bulletin.acceptance where ref_no = '" + ref_no + "'";

            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();


            String s2 = "update db_bulletin.parishioners_1 set is_acceptance='" + "0" + "' where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();



            JOptionPane.showMessageDialog(null, "Successfully Deleted");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static Dlg_new_acceptance.to_acceptance ret_data(String ref_nos) {
        Dlg_new_acceptance.to_acceptance to = null;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select  "
                    + " ref_no"
                    + ", fname"
                    + ", mi"
                    + ", lname"
                    + ", bday"
                    + ", place_of_birth"
                    + ", bapt_date"
                    + ", bapt_place"
                    + ", book_no"
                    + ", page_no"
                    + ", acceptance_date"
                    + ", acceptance_time"
                    + ", priest"
                    + ", presider"
                    + ", remarks"
                    + ", status"
                    + ", date_added"
                    + ", father"
                    + ", mother"
                    + ", is_acc"
                    + ", acc_date"
                    + ", is_elected"
                    + ", elected_date"
                    + ", is_scrunity1"
                    + ", scrunity1_date"
                    + ", is_present"
                    + ", present_date"
                    + ", is_scrunity2"
                    + ", scrunity2_date"
                    + ", is_scrunity3"
                    + ", scrunity3_date"
                    + ", is_present_l"
                    + ", present_l_date"
                    + ", is_recit"
                    + ", recit_date"
                    + ", is_ephepheta"
                    + ", ephepheta_date from db_bulletin.acceptance where ref_no='" + ref_nos + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref_no = rs.getString(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String bday = rs.getString(5);
                String place_of_birth = rs.getString(6);
                String bapt_date = rs.getString(7);
                String bapt_place = rs.getString(8);
                String book_no = rs.getString(9);
                String page_no = rs.getString(10);
                String acceptance_date = rs.getString(11);
                String acceptance_time = rs.getString(12);
                String priest = rs.getString(13);
                String presider = rs.getString(14);
                String remarks = rs.getString(15);
                String status = rs.getString(16);
                String date_added = rs.getString(17);
                String father = rs.getString(18);
                String mother = rs.getString(19);
                String is_acc = rs.getString(20);
                String acc_date = rs.getString(21);
                String is_elected = rs.getString(22);
                String elected_date = rs.getString(23);
                String is_scrunity1 = rs.getString(24);
                String scrunity1_date = rs.getString(25);
                String is_present = rs.getString(26);
                String present_date = rs.getString(27);
                String is_scrunity2 = rs.getString(28);
                String scrunity2_date = rs.getString(29);
                String is_scrunity3 = rs.getString(30);
                String scrunity3_date = rs.getString(31);
                String is_present_l = rs.getString(32);
                String present_l_date = rs.getString(33);
                String is_recit = rs.getString(34);
                String recit_date = rs.getString(35);
                String is_ephepheta = rs.getString(36);
                String ephepheta_date = rs.getString(37);
                
                to=new Dlg_new_acceptance.to_acceptance(ref_no, fname, mi, lname, bday, place_of_birth, bapt_date, bapt_place, book_no, page_no, acceptance_date, acceptance_time, priest, presider, remarks, status, date_added, father, mother, is_acc, acc_date, is_elected, elected_date, is_scrunity1, scrunity1_date, is_present, present_date, is_scrunity2, scrunity2_date, is_scrunity3, scrunity3_date, is_present_l, present_l_date, is_recit, recit_date, is_ephepheta, ephepheta_date);
                
            }
            return to;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
     public static List<S8_baptism.to_sponsors> ret_bap_sponsors(String ref_no) {

        List<S8_baptism.to_sponsors> datas = new ArrayList();

        try {

            String s0 = "select sponsor from db_bulletin.acceptance_sponsors where ref_no='" + ref_no + "'";
            Connection conn = PoolConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println(name);
                S8_baptism.to_sponsors to = new S8_baptism.to_sponsors(name, ref_no);
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
