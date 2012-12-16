/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;
import p.to.to_rites_fees;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class S9_payments {

    public static void do_pay_marriage(String ref_no, String or_no, List<to_rites_fees> t, String name) {
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "update db_bulletin.parishioners_1 set is_married='" + 3 + "' where ref_id='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            List<to_rites_fees> datas = t;
            double amount = 0;
            for (to_rites_fees f : t) {
                amount += f.rate;
                String s2 = "insert into db_bulletin.wedding_fee_details(marriage_number,name,rate)values(?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s2);
                stmt1.setString(1, ref_no);
                stmt1.setString(2, f.name);
                stmt1.setDouble(3, f.rate);
                stmt1.execute();
            }


            String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type,reference_number) values(?,?,?,?,?,?,?)";


            PreparedStatement psmt1 = conn.prepareStatement(s1);
            String date = DateType.datetime.format(new Date());
//
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, "Matrimony");
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);

            psmt1.execute();
            JOptionPane.showMessageDialog(null, "Payed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_pay_other_rites(String ref_no, String or_no, double amount, String name, String type) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.marriage set is_payed='yes' where marriage_number='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();




            String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type,reference_number) values(?,?,?,?,?,?,?)";


            PreparedStatement psmt1 = conn.prepareStatement(s1);
            String date = DateType.datetime.format(new Date());
//
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, "Matrimony");
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);

            psmt1.execute();
            JOptionPane.showMessageDialog(null, "Payed");;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_pay_other_funeral(String ref_no, String or_no, double amount, String name, String type) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.burial_mass set is_payed='yes' where burial_mass_number='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();




            String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type,reference_number) values(?,?,?,?,?,?,?)";


            PreparedStatement psmt1 = conn.prepareStatement(s1);
            String date = DateType.datetime.format(new Date());
//
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, "Funeral");
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);

            psmt1.execute();
            JOptionPane.showMessageDialog(null, "Payed");;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_pay_other_confirmation(String ref_no, String or_no, double amount, String name, String type) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.confirmation set is_payed='yes' where confirmation_number='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();




            String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type,reference_number) values(?,?,?,?,?,?,?)";


            PreparedStatement psmt1 = conn.prepareStatement(s1);
            String date = DateType.datetime.format(new Date());
//
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, "Confirmation");
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);

            psmt1.execute();
            JOptionPane.showMessageDialog(null, "Payed");;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_pay_other_baptism(String ref_no, String or_no, double amount, String name, String type) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.baptism set is_payed='yes' where baptismal_number='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();




            String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type,reference_number) values(?,?,?,?,?,?,?)";


            PreparedStatement psmt1 = conn.prepareStatement(s1);
            String date = DateType.datetime.format(new Date());
//
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, "Baptism");
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);

            psmt1.execute();
            JOptionPane.showMessageDialog(null, "Payed");;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_others(String ref_no, String or_no, double amount, String name, String type) {
        try {
            Connection conn = PoolConnection.connect();

            if (type.equals("Baptism")) {
                String s0 = "update db_bulletin.parishioners_1 set is_baptized='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();

            }
            if (type.equals("Communion")) {
                String s0 = "update db_bulletin.parishioners_1 set is_comm='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }
            if (type.equals("Confirmation")) {
                String s0 = "update db_bulletin.parishioners_1 set is_confirm='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }

            if (type.equals("Matrimony")) {
                String s0 = "update db_bulletin.parishioners_1 set is_married='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }
            if (type.equals("2nd Matrimony")) {
                String s0 = "update db_bulletin.parishioners_1 set is_2nd_married='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }
            if (type.equals("Prof of Faith")) {
                String s0 = "update db_bulletin.parishioners_1 set is_prof_faith='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }
            if (type.equals("Acceptance")) {
                String s0 = "update db_bulletin.parishioners_1 set is_acceptance='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }
            if (type.equals("Funeral")) {
                String s0 = "update db_bulletin.parishioners_1 set is_death='" + 3 + "' where ref_id='" + ref_no + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }






            String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type,reference_number) values(?,?,?,?,?,?,?)";


            PreparedStatement psmt1 = conn.prepareStatement(s1);
            String date = DateType.datetime.format(new Date());
//
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, type);
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);

            psmt1.execute();
            JOptionPane.showMessageDialog(null, "Payed");;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
