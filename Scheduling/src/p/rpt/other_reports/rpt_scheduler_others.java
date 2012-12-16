/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.rpt.other_reports;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import overallPOS.modules.share.utils.JasperUtil;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author i1
 */
public class rpt_scheduler_others {

    public static class to_date_from {

        public final Date date_from;
        public final String printed_by;

        public to_date_from(Date date_from, String printed_by) {
            this.date_from = date_from;
            this.printed_by = printed_by;
        }
    }

    public static class to_cert_marriage{
       public final String day;
       public final String month;
       public final String year;
       public final String priest;
       public final String asst_priest;
       public final String series_of;
       public final String g_ref_no;
       public final String b_ref_no;
       public final String g_address;
       public final String b_address;
       public final String path;

        public to_cert_marriage(String day, String month, String year, String priest, String asst_priest, String series_of, String g_ref_no, String b_ref_no, String g_address, String b_address,String path) {
            this.day = day;
            this.month = month;
            this.year = year;
            this.priest = priest;
            this.asst_priest = asst_priest;
            this.series_of = series_of;
            this.g_ref_no = g_ref_no;
            this.b_ref_no = b_ref_no;
            this.g_address = g_address;
            this.b_address = b_address;
            this.path=path;
        }
       
    }
    public static class to_date_to {

        public final Date date_from;
        public final Date date_to;
        public final String printed_by;

        public to_date_to(Date date_from, Date date_to, String printed_by) {
            this.date_from = date_from;
            this.date_to = date_to;
            this.printed_by = printed_by;
        }
    }

    public static class to_date_to_time {

        public final Date date_from;
        public final Date date_to;
        public final String printed_by;
        public final String time;
        public final String priest;
        public final String path;

        public to_date_to_time(Date date_from, Date date_to, String printed_by, String time, String priest, String path) {
            this.date_from = date_from;
            this.date_to = date_to;
            this.printed_by = printed_by;
            this.time = time;
            this.priest = priest;
            this.path = path;
        }
    }

    public static class to_wala {

        public final String printed_by;

        public to_wala(String printed_by) {
            this.printed_by = printed_by;
        }
    }

    public static class to_cert {

        public final String num;
        public final String day;
        public final String month;
        public final String year;
        public final String priest;
        public final String asst_priest;
        public final String series_of;
        public final String path;

        public to_cert(String num, String day, String month, String year, String priest, String asst_priest, String series_of, String path) {
            this.num = num;
            this.day = day;
            this.month = month;
            this.year = year;
            this.priest = priest;
            this.asst_priest = asst_priest;
            this.series_of = series_of;
            this.path = path;
        }
    }

    public static void pdf_viewer_cert(to_cert to, String template) {
        Connection conn = null;

        try {
            conn = PoolConnection.connect();
            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_scheduler_others.class, template),
                    JasperUtil.setParameter(to),
                    conn);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }

      public static void pdf_viewer_cert_marriage(to_cert_marriage to, String template) {
        Connection conn = null;

        try {
            conn = PoolConnection.connect();
            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_scheduler_others.class, template),
                    JasperUtil.setParameter(to),
                    conn);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }

    public static void pdf_viewer_date_to(to_date_to to, String template) {
        Connection conn = null;

        try {
            conn = PoolConnection.connect();
            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_scheduler_others.class, template),
                    JasperUtil.setParameter(to),
                    conn);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }

    public static void pdf_viewer_date_to_time(to_date_to_time to, String template) {
        Connection conn = null;

        try {
            conn = PoolConnection.connect();
            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_scheduler_others.class, template),
                    JasperUtil.setParameter(to),
                    conn);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }

    public static void pdf_viewer_date_from(to_date_from to, String template) {

        Connection conn = null;
        try {

            conn = PoolConnection.connect();


            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_scheduler_others.class, template),
                    JasperUtil.setParameter(to),
                    JasperUtil.emptyDatasource());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }

    public static void pdf_viewer_date_wala(to_wala to, String template) {

        Connection conn = null;
        try {

            conn = PoolConnection.connect();


            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_scheduler_others.class, template),
                    JasperUtil.setParameter(to),
                    JasperUtil.emptyDatasource());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }

    public static String get_priest(String time, String date) {

        String priest = "";
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select priest from db_bulletin.mass_schedules where scheduled_time='" + time + "' and date(scheduled_date)= date('" + date + "') ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                priest = rs.getString(1);
            }
            return priest;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static  String get_b_ref_no(String g_ref_no) {
        String ref_no = "";
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select b_ref_no from db_bulletin.marriage_1 where g_ref_no='" + g_ref_no + "' and status<>5";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
               ref_no = rs.getString(1);
            }
            return ref_no;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }
     public static  String get_g_ref_no(String b_ref_no) {
        String ref_no = "";
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select g_ref_no from db_bulletin.marriage_1 where g_ref_no='" + b_ref_no + "' and status<>5";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
               ref_no = rs.getString(1);
            }
            return ref_no;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }
      public static  String get_p_address(String ref_id) {
        String ref_no = "";
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select address1 from db_bulletin.parishioners_1 where ref_id='" + ref_id + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
               ref_no = rs.getString(1);
            }
            return ref_no;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }


    public static void main(String[] args) {
        System.out.println(get_priest("9:30 am - 11:00 am", "2012-07-15"));
    }
}
