/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form.to_baptism;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import overallPOS.modules.share.utils.PoolConnection;
import p.rpt.other_reports.rpt_scheduler_others;

/**
 *
 * @author dummy
 */
public class S7_approval {

    public static void do_approved(List<String> details, String ref_no, String gender) {

        try {
            Connection conn = PoolConnection.connect();

//        
            for (String r : details) {

                if (r.equals("Baptism")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_baptized='" + 2 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();

                }
                if (r.equals("Communion")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_comm='" + 2 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Confirmation")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_confirm='" + 2 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }

                if (r.equals("Matrimony")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_married='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();

                    String n_ref_id = "";
                    if (gender.equals("Male")) {
                        n_ref_id = rpt_scheduler_others.get_b_ref_no(ref_no);

                    } else {

                        n_ref_id = rpt_scheduler_others.get_g_ref_no(ref_no);
                    }

                    String s1 = "update db_bulletin.parishioners_1 set is_married='" + 4 + "' where ref_id='" + n_ref_id + "'";
                    PreparedStatement stmt1 = conn.prepareStatement(s1);
                    stmt1.execute();
                }
                if (r.equals("2nd Matrimony")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_2nd_married='" + 2 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Prof of Faith")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_prof_faith='" + 2 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Acceptance")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_acceptance='" + 2 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Funeral")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_death='" + 2 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }


            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_confirm(List<String> details, String ref_no, String gender) {

        try {
            Connection conn = PoolConnection.connect();

//        
            for (String r : details) {

                if (r.equals("Baptism")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_baptized='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();

                }
                if (r.equals("Communion")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_comm='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Confirmation")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_confirm='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }

                if (r.equals("Matrimony")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_married='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();

                    String n_ref_id = "";
                    if (gender.equals("Male")) {
                        n_ref_id = rpt_scheduler_others.get_b_ref_no(ref_no);

                    } else {

                        n_ref_id = rpt_scheduler_others.get_g_ref_no(ref_no);
                    }

                    String s1 = "update db_bulletin.parishioners_1 set is_married='" + 4 + "' where ref_id='" + n_ref_id + "'";
                    PreparedStatement stmt1 = conn.prepareStatement(s1);
                    stmt1.execute();
                }
                if (r.equals("2nd Matrimony")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_2nd_married='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Prof of Faith")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_prof_faith='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Acceptance")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_acceptance='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }
                if (r.equals("Funeral")) {
                    String s0 = "update db_bulletin.parishioners_1 set is_death='" + 4 + "' where ref_id='" + ref_no + "'";
                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                }


            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
