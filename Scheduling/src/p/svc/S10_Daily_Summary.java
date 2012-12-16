/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author Dummy
 */
public class S10_Daily_Summary {

    public static class to_summary {

        public final double thanks_giving;
        public final double common;
        public final double petition_mass;
        public final double requiem_mass;
        public final double transfer;
        public final double donations;
        public final double baptism;
        public final double confirmation;
        public final double marriage;
        public final double funeral;
        public final Date date_from;
        public final Date date_to;
        public final String printed_by;
        public final String path;
        public final double total_in;
        public final double total_sched;
        public final double total_cert;
        public final double summary;

        public to_summary(double thanks_giving, double common, double petition_mass, double requiem_mass, double transfer, double donations, double baptism, double confirmation, double marriage, double funeral, Date date_from, Date date_to, String printed_by, String path, double total_in, double total_sched, double total_cert, double summary) {
            this.thanks_giving = thanks_giving;
            this.common = common;
            this.petition_mass = petition_mass;
            this.requiem_mass = requiem_mass;
            this.transfer = transfer;
            this.donations = donations;
            this.baptism = baptism;
            this.confirmation = confirmation;
            this.marriage = marriage;
            this.funeral = funeral;
            this.date_from = date_from;
            this.date_to = date_to;
            this.printed_by = printed_by;
            this.path = path;
            this.total_in = total_in;
            this.total_sched = total_sched;
            this.total_cert = total_cert;
            this.summary = summary;
        }

        
        
       
    }

    public static to_summary ret_summary(String date_from, String date_to,String printed_by,String path,Date d,Date d2) {
        to_summary to = new to_summary(0, 0, 0, 0, 0, 0, 0, 0, 0, 0,d,d2,"","",0,0,0,0);
        try {
            Connection conn = PoolConnection.connect();
            double thanks_giving = 0;
            double common = 0;
            double petition_mass = 0;
            double requiem_mass = 0;
            double transfer = 0;
            double donations = 0;
            double baptism = 0;
            double confirmation = 0;
            double marriage = 0;
            double funeral = 0;
            String s0 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Thanks Giving" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                thanks_giving = rs.getDouble(1);
            }

            String s1 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Common" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery(s1);
            if (rs1.next()) {
                common = rs1.getDouble(1);
            }

            String s2 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Petition Mass" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);
            if (rs2.next()) {
                petition_mass = rs2.getDouble(1);
            }


            String s3 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Requiem Mass" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt3 = conn.createStatement();
            ResultSet rs3 = stmt3.executeQuery(s3);
            if (rs3.next()) {
                requiem_mass = rs3.getDouble(1);
            }

            String s4 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Transfer" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt4 = conn.createStatement();
            ResultSet rs4 = stmt4.executeQuery(s4);
            if (rs4.next()) {
                transfer = rs4.getDouble(1);
            }

            String s5 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Donation" + "' and Date(date_added) between ('"+date_from+"')  and ('"+date_to+"') ";
            Statement stmt5 = conn.createStatement();
            ResultSet rs5 = stmt5.executeQuery(s5);
            if (rs5.next()) {
                donations = rs5.getDouble(1);
            }

            String s6 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Cert_Baptism" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt6 = conn.createStatement();
            ResultSet rs6 = stmt6.executeQuery(s6);
            if (rs6.next()) {
                baptism = rs6.getDouble(1);
            }
            String s7 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Cert_Confirmation" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt7 = conn.createStatement();
            ResultSet rs7 = stmt7.executeQuery(s7);
            if (rs7.next()) {
                confirmation = rs7.getDouble(1);
            }

            String s8 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Cert_Marriage" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt8 = conn.createStatement();
            ResultSet rs8 = stmt8.executeQuery(s8);
            if (rs8.next()) {
                marriage = rs8.getDouble(1);
            }

            String s9 = "select sum(amount_paid) from db_bulletin.receipts where or_type='" + "Cert_Funeral" + "' and Date(date_added) between (' " + date_from + " ')  and (' " + date_to + " ') ";
            Statement stmt9 = conn.createStatement();
            ResultSet rs9 = stmt9.executeQuery(s9);
            if (rs9.next()) {
                funeral = rs9.getDouble(1);
            }

            double total_in=thanks_giving+common+petition_mass+requiem_mass+transfer+donations;
            double total_sched=0;
            double total_cert=baptism+confirmation+marriage+funeral;
            double summary=total_in+total_sched+total_cert;
            to = new to_summary(thanks_giving, common, petition_mass, requiem_mass, transfer, donations, baptism, confirmation, marriage, funeral,d,d2,printed_by,path,total_in,total_sched,total_cert,summary);
            return to;


        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void main(String[] args) {
//        String d="2012-10-29";
//        String d2="2012-10-29";
//        to_summary to = ret_summary(d, d2,"","");
//        
//        System.out.println(to.donations);
    }
}
