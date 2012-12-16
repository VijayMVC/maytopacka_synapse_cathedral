/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpt_scheduler_intentionss;

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
public class rpt_scheduler_intentions {

    public static class to_date_from {

        public final Date date_from;
        public final String printed_by;

        public to_date_from(Date date_from, String printed_by) {
            this.date_from = date_from;
            this.printed_by = printed_by;
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

        public to_date_to_time(Date date_from, Date date_to, String printed_by, String time,String priest) {
            this.date_from = date_from;
            this.date_to = date_to;
            this.printed_by = printed_by;
            this.time = time;
            this.priest=priest;
        }
    }

    public static class to_wala {

        public final String printed_by;

        public to_wala(String printed_by) {
            this.printed_by = printed_by;
        }
    }

    public static void pdf_viewer_date_to(to_date_to to, String template) {
        Connection conn = null;

        try {
            conn = PoolConnection.connect();
            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_scheduler_intentions.class, template),
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
                    JasperUtil.compileJasper(rpt_scheduler_intentions.class, template),
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
                    JasperUtil.compileJasper(rpt_scheduler_intentions.class, template),
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
                    JasperUtil.compileJasper(rpt_scheduler_intentions.class, template),
                    JasperUtil.setParameter(to),
                    JasperUtil.emptyDatasource());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }
    
    public static String get_priest(String time,String date){
      
        String priest="";
        try {
            Connection conn = PoolConnection.connect();
              String s0="select priest from db_bulletin.mass_schedules where scheduled_time='"+time+"' and date(scheduled_date)= date('"+date+"') ";
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
    
    public static void main(String[] args) {
        System.out.println(get_priest("9:30 am - 11:00 am","2012-07-15"));
    }
    
}
