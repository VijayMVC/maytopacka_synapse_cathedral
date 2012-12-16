/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.rpt;

import java.io.InputStream;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import overallPOS.modules.share.utils.JasperUtil;
import overallPOS.modules.share.utils.PoolConnection;
import p.pnl.Dashboard;

/**
 *
 * @author Dummy
 */
public class Reference_number {

    public static class to_receipt {

        public final String date;
        public final String name;
        public final String words;
        public final String type;
        public final String mode;
        public final String amount;
        public final String or;
        public final String received_by;
        public final String path;

        public to_receipt(String date, String name, String words, String type, String mode, String amount, String or, String received_by,String path) {
            this.date = date;
            this.name = name;
            this.words = words;
            this.type = type;
            this.mode = mode;
            this.amount = amount;
            this.or = or;
            this.received_by = received_by;
            this.path=path;
        }
    }

    public static void main(String[] args) {
//      

        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());
//        String name = "Ronald Pascua";
//        String words = "hundred";
//        String type = "Intention";
//        String mode = "Cash & Check";
//        String amount = "100";
//        String or = "001";
//        String received_by = "Cashier";
        try {


            JasperReport jasperReport;
            JasperPrint jasperPrint;
            to_receipt to = new to_receipt(date, "adad", "adad", "adad", "adad", "1212", "adad", "adad","");


            Connection conn = PoolConnection.connect();

            String l = "/p/rpt/receipt.jrxml";
            InputStream is = Dashboard.class.getResourceAsStream(l);
            jasperReport = JasperCompileManager.compileReport(is);

            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.setParameter(to), new JREmptyDataSource());
//
//
            JasperPrintManager.printPage(jasperPrint, 0, false);
        } catch (Exception e) {

            throw new RuntimeException(e);
        }

//          public final String date;
//        public final String name;
//        public final String words;
//        public final String type;
//        public final String mode;
//        public final String amount;
//        public final String or;
//        public final String received_by;
    }

    public static void print_receipt(to_receipt to) {
        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());

        try {


            JasperReport jasperReport;
            JasperPrint jasperPrint;
//            to_receipt to = new to_receipt(date, "adad", "adad", "adad", "adad", "1212", "adad", "adad");


            Connection conn = PoolConnection.connect();

            String l = "/p/rpt/receipt_4_1.jrxml";
            InputStream is = Dashboard.class.getResourceAsStream(l);
            jasperReport = JasperCompileManager.compileReport(is);

            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.setParameter(to), new JREmptyDataSource());
//
//
            JasperPrintManager.printPage(jasperPrint, 0, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed To Print, Please Check the Printer");
//         throw new RuntimeException(e);
        }
    }
}
