/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpt_receipts;

import java.sql.Connection;
import java.util.Date;
import overallPOS.modules.share.utils.JasperUtil;
import overallPOS.modules.share.utils.PoolConnection;
import p.svc.S10_Daily_Summary.to_summary;

/**
 *
 * @author i1
 */
public class rpt_cash_reports {

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

     public static class to_date_to_path{

        public final Date date_from;
        public final Date date_to;
        public final String printed_by;
        public final String path;

        public to_date_to_path(Date date_from, Date date_to, String printed_by, String path) {
            this.date_from = date_from;
            this.date_to = date_to;
            this.printed_by = printed_by;
            this.path = path;
        }

      
    }

    public static class to_wala {

        public final String printed_by;

        public to_wala(String printed_by) {
            this.printed_by = printed_by;
        }
    }

    public static void pdf_viewer_date_to(to_date_to_path to, String template) {
        Connection conn = null;

        try {
            conn = PoolConnection.connect();
            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_cash_reports.class, template),
                    JasperUtil.setParameter(to),
                    conn);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }
    public static void pdf_viewer_summary(to_summary to, String template) {
        Connection conn = null;

        try {
            conn = PoolConnection.connect();
            JasperUtil.pdfViewer(
                    JasperUtil.compileJasper(rpt_cash_reports.class, template),
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
                    JasperUtil.compileJasper(rpt_cash_reports.class, template),
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
                    JasperUtil.compileJasper(rpt_cash_reports.class, template),
                    JasperUtil.setParameter(to),
                    JasperUtil.emptyDatasource());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            PoolConnection.close();
        }

    }
}
