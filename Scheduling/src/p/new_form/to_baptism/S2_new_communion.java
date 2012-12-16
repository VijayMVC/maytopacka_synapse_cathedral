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
import p.new_form.Dlg_new_communion.to_communion;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class S2_new_communion {

    public static void add(to_communion to_comm, String ref_no) {
        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.communion("
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
                    + ",comm_date"
                    + ",comm_time"
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
            stmt.setString(2, to_comm.fname);
            stmt.setString(3, to_comm.mi);
            stmt.setString(4, to_comm.lname);
            stmt.setString(5, to_comm.bday);

            stmt.setString(6, to_comm.place_of_birth);
            stmt.setString(7, to_comm.bapt_date);
            stmt.setString(8, to_comm.bapt_place);
            stmt.setString(9, to_comm.book_no);
            stmt.setString(10, to_comm.page_no);

            stmt.setString(11, to_comm.comm_date);
            stmt.setString(12, to_comm.time);
            stmt.setString(13, to_comm.priest);
            stmt.setString(14, to_comm.presider);
            stmt.setString(15, to_comm.remarks);

            stmt.setString(16, "4");
            stmt.setString(17, date_added);
            stmt.setString(18, to_comm.father);
            stmt.setString(19, to_comm.mother);
            stmt.execute();


            String s2 = "update db_bulletin.parishioners_1 set is_comm='" + "1" + "',date_of_baptism='" + to_comm.bapt_date + "' where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit(to_communion to_comm, String ref_no) {
        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.communion set "
                    + "fname = '" + to_comm.fname + "'"
                    + ",mi = '" + to_comm.mi + "'"
                    + ",lname = '" + to_comm.lname + "'"
                    + ",bday = '" + to_comm.bday + "'"
                    + ",place_of_birth = '" + to_comm.place_of_birth + "'"
                    + ",bapt_date = '" + to_comm.bapt_date + "'"
                    + ",bapt_place = '" + to_comm.bapt_place + "'"
                    + ",book_no = '" + to_comm.book_no + "'"
                    + ",page_no = '" + to_comm.page_no + "'"
                    + ",comm_date = '" + to_comm.comm_date + "'"
                    + ",comm_time = '" + to_comm.time + "'"
                    + ",priest = '" + to_comm.priest + "'"
                    + ",presider = '" + to_comm.presider + "'"
                    + ",remarks = '" + to_comm.remarks + "'"
                    + ",father = '" + to_comm.father + "'"
                    + ",mother = '" + to_comm.mother + "'"
                    + "where ref_no = '" + ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

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
            String s0 = "delete from db_bulletin.communion where ref_no = '" + ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();


            String s2 = "update db_bulletin.parishioners_1 set is_comm='" + "0" + "' where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static to_communion get_details(String ref_no) {

        to_communion to = null;
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
                    + ",comm_date"
                    + ",comm_time"
                    + ",priest"
                    + ",presider"
                    + ",remarks"
                    + ",father"
                    + ",mother"
                    + " from db_bulletin.communion where ref_no='" + ref_no + "'";

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
                to = new to_communion(fname, mi, lname, bday, place_of_birth, bapt_date, bapt_place, book_no, page_no, comm_date, time, priest, presider, remarks, father, mother);
            }
            return to;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
