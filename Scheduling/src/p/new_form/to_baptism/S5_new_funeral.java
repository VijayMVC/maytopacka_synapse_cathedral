/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form.to_baptism;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;
import p.new_form.Dlg_new_death;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class S5_new_funeral {

    public static void add(Dlg_new_death.to_funeral to, String ref_no) {
        try {
            Connection conn = PoolConnection.connect();


            String s0 = "insert into db_bulletin.funeral_1(fname"
                    + ",mi "
                    + ",lname "
                    + ",bday"
                    + ",place_of_birth"
                    + ",bapt_date "
                    + ",bapt_place"
                    + ",father"
                    + ",mother "
                    + ",funeral_date"
                    + ",funeral_time "
                    + ",priest"
                    + ",wife_husband "
                    + ",w_ref_no"
                    + ",sac_of_annointing"
                    + ",presider "
                    + ",remarks"
                    + ",book_no "
                    + ",page_no "
                    + ",status "
                    + ",date_added "
                    + ",date_died "
                    + ",place_buried"
                    + ",ref_no"
                    + ",cause_of_death"
                    + ")values ("
                    + "?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, to.fname);
            stmt.setString(2, to.mi);
            stmt.setString(3, to.lname);
            stmt.setString(4, to.bday);
            stmt.setString(5, to.place_of_birth);

            stmt.setString(6, to.bapt_date);
            stmt.setString(7, to.bapt_place);
            stmt.setString(8, to.father);
            stmt.setString(9, to.mother);
            stmt.setString(10, to.funeral_date);

            stmt.setString(11, to.funeral_time);
            stmt.setString(12, to.priest);
            stmt.setString(13, to.wife_husband);
            stmt.setString(14, to.w_ref_no);
            stmt.setString(15, to.sac_of_annointing);

            stmt.setString(16, to.presider);
            stmt.setString(17, to.remarks);
            stmt.setString(18, to.book_no);
            stmt.setString(19, to.page_no);
            stmt.setString(20,"4");

            stmt.setString(21, to.date_added);
            stmt.setString(22, to.date_died);
            stmt.setString(23, to.place_buried);
            stmt.setString(24, ref_no);
            stmt.setString(25, to.cause_of_death);
            stmt.execute();

            String s2 = "update db_bulletin.parishioners_1 set is_death='" + "1" + "'  "
                      + ",f_date='"+to.funeral_date+"', f_book_no='"+to.book_no+"',f_page_no='"+to.page_no+"',f_index_no='"+"1"+"'"
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

    public static void edit(Dlg_new_death.to_funeral to, String ref_no) {
        try {
            Connection conn = PoolConnection.connect();


            String s0 = "update  db_bulletin.funeral_1 set fname ='" + to.fname + "'"
                    + ",mi ='" + to.mi + "'"
                    + ",lname='" + to.lname + "' "
                    + ",bday='" + to.bday + "'"
                    + ",place_of_birth='" + to.place_of_birth + "'"
                    + ",bapt_date='" + to.bapt_date + "' "
                    + ",bapt_place='" + to.bapt_place + "'"
                    + ",father='" + to.father + "'"
                    + ",mother ='" + to.mother + "'"
                    + ",funeral_date='" + to.funeral_date + "'"
                    + ",funeral_time ='" + to.funeral_time + "'"
                    + ",priest='" + to.priest + "'"
                    + ",wife_husband ='" + to.wife_husband + "'"
                    + ",w_ref_no='" + to.w_ref_no + "'"
                    + ",sac_of_annointing='" + to.sac_of_annointing + "'"
                    + ",presider='" + to.presider + "' "
                    + ",remarks='" + to.remarks + "'"
                    + ",book_no ='" + to.book_no + "'"
                    + ",page_no ='" + to.page_no + "'"
                    + ",status ='" + to.status + "'"
                    + ",date_added ='" + to.date_added + "'"
                    + ",date_died='" + to.date_died + "' "
                    + ",place_buried ='" + to.date_died + "'"                 
                    + " where ref_no='" + ref_no + "' ";
           
           
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            
             String s1="update db_bulletin.parishioners_1 set f_date ='" + to.funeral_date + "'"
                    + ",f_book_no ='" + to.book_no + "'"
                    + ",f_page_no='" + to.page_no + "' "
                    + ",f_index_no ='" + "1" + "' where ref_id='"+ref_no+"'";
            PreparedStatement stm2 = conn.prepareStatement(s1);            
            stm2.execute();
            

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


            String s1 = "delete from db_bulletin.funeral_1 where ref_no = '" + ref_no + "'";

            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();


            String s2 = "update db_bulletin.parishioners_1 set is_death='" + "0" + "' where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();



            JOptionPane.showMessageDialog(null, "Successfully Deleted");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static Dlg_new_death.to_funeral ret_data(String ref_no) {
        Dlg_new_death.to_funeral tp = null;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select fname"
                    + ",mi "
                    + ",lname "
                    + ",bday"
                    + ",place_of_birth"
                    + ",bapt_date "
                    + ",bapt_place"
                    + ",father"
                    + ",mother "
                    + ",funeral_date"
                    + ",funeral_time "
                    + ",priest"
                    + ",wife_husband "
                    + ",w_ref_no"
                    + ",sac_of_annointing"
                    + ",presider "
                    + ",remarks"
                    + ",book_no "
                    + ",page_no "
                    + ",status "
                    + ",date_added "
                    + ",date_died "
                    + ",place_buried "
                    + ",cause_of_death "
                    + "from db_bulletin.funeral_1 where ref_no='" + ref_no + "'";
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
                String father = rs.getString(8);
                String mother = rs.getString(9);
                String funeral_date = rs.getString(10);

                String funeral_time = rs.getString(11);
                String priest = rs.getString(12);
                String wife_husband = rs.getString(13);
                String w_ref_no = rs.getString(14);
                String sac_of_annointing = rs.getString(15);

                String presider = rs.getString(16);
                String remarks = rs.getString(17);
                String book_no = rs.getString(18);
                String page_no = rs.getString(19);
                String status = rs.getString(20);

                String date_added = rs.getString(21);
                String date_died = rs.getString(22);
                String place_buried = rs.getString(23);
                String cause_of_death = rs.getString(24);


                tp = new Dlg_new_death.to_funeral(fname, mi, lname, bday, place_of_birth, bapt_date, bapt_place, father, mother, funeral_date, funeral_time, priest, wife_husband, w_ref_no, sac_of_annointing, presider, remarks, book_no, page_no, status, date_added, date_died, place_buried, cause_of_death);
            }
            return tp;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
