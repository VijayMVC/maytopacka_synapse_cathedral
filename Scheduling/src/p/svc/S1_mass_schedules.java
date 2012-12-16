/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;
import overallPOS.modules.share.utils.ReceiptIncrementor;
import p.to.to_regular_mass;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class S1_mass_schedules {

    public static class to_name {

        public String name;

        public to_name(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class to_payment {

        public final String or_no;
        public final String reference_number;
        public final double amount;
        public final String or_type;
        public final String date_added;
        public final String payment_type;
        public final String name;

        public to_payment(String or_no, String reference_number, double amount, String or_type, String date_added, String payment_type, String name) {
            this.or_no = or_no;
            this.reference_number = reference_number;
            this.amount = amount;
            this.or_type = or_type;
            this.date_added = date_added;
            this.payment_type = payment_type;
            this.name = name;
        }
    }

    public static class to_mass_time {

        public final String mass_time;
        public final String id;

        public to_mass_time(String mass_time, String id) {
            this.mass_time = mass_time;
            this.id = id;
        }
    }

    public static class to_intention_records {

        public final String ref_num;
        public final String date;
        public final String time;
        public final String name;
        public final String contact;
        public final String mass_type;
        public final String message;
        public final String priest;

        public to_intention_records(String ref_num, String date, String time, String name, String contact, String mass_type, String message, String priest) {
            this.ref_num = ref_num;
            this.date = date;
            this.time = time;
            this.name = name;
            this.contact = contact;
            this.mass_type = mass_type;
            this.message = message;
            this.priest = priest;
        }
    }

    public static List<to_name> set_data(String name) {
        List<to_name> datas = new ArrayList();
        to_name to = new to_name(name);
        datas.add(to);
        return datas;
    }

    public static List<to_name> set_data2(String ref_no) {
        List<to_name> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select name from db_bulletin.souls_of where reference_number='" + ref_no + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                to_name to = new to_name(name);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<to_intention_records> ret_intentions(String date, String time, String type) {
        List<to_intention_records> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select "
                    + "reference_number"
                    + ",mass_intention_date"
                    + ",mass_intention_time"
                    + ",parishioner_name"
                    + ",contact_number"
                    + ",mass_type"
                    + ",message"
                    + ",priest"
                    + " from db_bulletin.mass_intention where "
                    + " date(mass_intention_date)='" + date + "'"
                    + " and is_payed='" + "no" + "' "
                    + "and mass_type='" + type + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String reference_number = rs.getString(1);
                String mass_intention_date = rs.getString(2);
                String mass_intention_time = rs.getString(3);
                String parishioner_name = rs.getString(4);
                String contact_number = rs.getString(5);
                String mass_type = rs.getString(6);
                String message = rs.getString(7);
                String priest = rs.getString(8);
                to_intention_records to = new to_intention_records(reference_number, mass_intention_date, mass_intention_time, parishioner_name, contact_number, mass_type, message, priest);
                datas.add(to);

            }

            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<to_intention_records> ret_intentions_payment(String ref, String type) {
        List<to_intention_records> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select "
                    + "reference_number"
                    + ",mass_intention_date"
                    + ",mass_intention_time"
                    + ",parishioner_name"
                    + ",contact_number"
                    + ",mass_type"
                    + ",message"
                    + ",priest"
                    + " from db_bulletin.mass_intention where "
                    + " is_payed='" + "no" + "' "
                    + "and mass_type='" + type + "'"
                    + "and reference_number like '" + ref + "%'"
                    + "";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String reference_number = rs.getString(1);
                String mass_intention_date = rs.getString(2);
                String mass_intention_time = rs.getString(3);
                String parishioner_name = rs.getString(4);
                String contact_number = rs.getString(5);
                String mass_type = rs.getString(6);
                String message = rs.getString(7);
                String priest = rs.getString(8);
                to_intention_records to = new to_intention_records(reference_number, mass_intention_date, mass_intention_time, parishioner_name, contact_number, mass_type, message, priest);
                datas.add(to);

            }

            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static List<to_regular_mass> get_scheds(Date d) {
        List<to_regular_mass> datas = new ArrayList();

        String date = DateType.sf.format(d);
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select"
                    + " scheduled_time"
                    + ",priest"
                    + ",choir"
                    + ",mass_sched_number "
                    + "from db_bulletin.mass_schedules ";
//                    + "where"
//                    + " date(scheduled_date)=date('" + date + "')";

//            s0 = SqlStringUtil.parse(s0).setString("a_scheduled_date", date).setString("a_mass_type", type).ok();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String time = rs.getString(1);
                String priest = rs.getString(2);
                String choir = rs.getString(3);
                String number = rs.getString(4);


                to_regular_mass to = new to_regular_mass(number, time, priest, choir);
                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void add(String name, String type) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.mass_time(time_interval,type)values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, name);
            stmt.setString(2, type);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<S1_mass_schedules.to_mass_time> get_data(String type,String search) {
        List<S1_mass_schedules.to_mass_time> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();

            String s0 = "select time_interval,id from db_bulletin.mass_time where type='" + type + "' and time_interval like '%"+search+"%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String time = rs.getString(1);
                String id = rs.getString(2);
                S1_mass_schedules.to_mass_time to = new S1_mass_schedules.to_mass_time(time, id);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit(String id, String name) {

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.mass_time set time_interval='" + name + "' where id='+id+' ";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void delete(String id) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.mass_time where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_schedule(String id, String time, String priest) {

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.mass_schedules set "
                    + "scheduled_time ='" + time + "'"
                    + ", priest='" + priest + "' "
                    + "where mass_sched_number='" + id + "' ";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void delete_schedule(String id) {
        S5_save_new_mass_schedule.delete(id);
    }

    public static String get_ref_number() {

        try {
            Connection conn = PoolConnection.connect();
            String number = "000000000000000";
            String s0 = "select o.reference_number from db_bulletin.mass_intention o order by o.id desc limit 1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getString(1);
            }
            number = ReceiptIncrementor.increment(number);
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static String get_receipt_no() {

        try {
            Connection conn = PoolConnection.connect();
            String number = "00000000000000";
            String s0 = "select r.or_number from db_bulletin.receipts r  order by r.id desc limit 1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getString(1);
            }
            number = ReceiptIncrementor.increment(number);
//            number++;
//            System.out.println(number);
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static String get_f_receipt_no() {

        try {
            Connection conn = PoolConnection.connect();
            String number = "00000000000000";
            String s0 = "select r.or_number from db_bulletin.f_receipts r  order by r.id desc limit 1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getString(1);
            }
            number = ReceiptIncrementor.increment(number);
//            number++;
//            System.out.println(number);
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int get_ref_number_marriage() {

        try {
            Connection conn = PoolConnection.connect();
            int number = 0;
            String s0 = "select max(o.marriage_number) from db_bulletin.marriage o";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int get_ref_number_baptism() {

        try {
            Connection conn = PoolConnection.connect();
            int number = 0;
            String s0 = "select max(o.baptismal_number) from db_bulletin.baptism o";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int get_ref_number_confirmation() {

        try {
            Connection conn = PoolConnection.connect();
            int number = 0;
            String s0 = "select max(o.confirmation_number) from db_bulletin.confirmation o";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int get_ref_number_funeral() {

        try {
            Connection conn = PoolConnection.connect();
            int number = 0;
            String s0 = "select max(o.burial_mass_number) from db_bulletin.burial_mass o";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int get_or_no() {

        try {
            Connection conn = PoolConnection.connect();
            int number = 0;
            String s0 = "select max(o.or_number) from db_bulletin.receipts o";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void add_intention(String time, String priest, String parishioner, String contact, String message, String type, String ref_no, String tg_date, String or_no, double amount, String terminal_id, String user_id, String user_name) {

        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "insert into db_bulletin.mass_intention("
                    + "reference_number"
                    + ",mass_intention_date"
                    + ",mass_intention_time"
                    + ",parishioner_name"
                    + ",contact_number"
                    + ",mass_type"
                    + ",is_payed"
                    + ",message"
                    + ",priest"
                    + ",date_added"
                    + ",terminal_id"
                    + ",user_id"
                    + ",user_name,status,remarks)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, ref_no);
            stmt.setString(2, tg_date);
            stmt.setString(3, time);
            stmt.setString(4, parishioner);
            stmt.setString(5, contact);
            stmt.setString(6, type);
            stmt.setString(7, "yes");
            stmt.setString(8, message);
            stmt.setString(9, priest);
            stmt.setString(10, date_added);
            stmt.setString(11, terminal_id);
            stmt.setString(12, user_id);
            stmt.setString(13, user_name);
            stmt.setString(14, "1");
            stmt.setString(15, "");
            stmt.execute();
//
            String s1 = "insert into db_bulletin.receipts(or_number"
                    + ",payor"
                    + ",amount_paid"
                    + ",date_added"
                    + ",or_type"
                    + ",payment_type"
                    + ",reference_number"
                    + ",terminal_id"
                    + ",user_id"
                    + ",user_name"
                    + ",status"
                    + ",remarks) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psmt1 = conn.prepareStatement(s1);
            psmt1.setString(1, or_no);
            psmt1.setString(2, parishioner);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date_added);
            psmt1.setString(5, type);
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);
            psmt1.setString(8, terminal_id);
            psmt1.setString(9, user_id);
            psmt1.setString(10, user_name);
            psmt1.setString(11, "1");
            psmt1.setString(12, "");

            psmt1.execute();
            Lg.s(S1_mass_schedules.class, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void add_intention_requiem(String time, String priest, String name, String contact, String souls, String requiem_Mass, String ref_no, String tg_date, List<String> names, String or_no, double amount, String terminal_id, String user_id, String user_name) {
        String date_added = DateType.datetime.format(new Date());
        try {
            Connection conn = PoolConnection.connect();

            String s0 = "insert into db_bulletin.mass_intention("
                    + "reference_number"
                    + ",mass_intention_date"
                    + ",mass_intention_time"
                    + ",parishioner_name"
                    + ",contact_number"
                    + ",mass_type"
                    + ",is_payed"
                    + ",message"
                    + ",priest"
                    + ",date_added"
                    + ",terminal_id"
                    + ",user_id"
                    + ",user_name"
                    + ",status"
                    + ",remarks)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, ref_no);
            stmt.setString(2, tg_date);
            stmt.setString(3, time);
            stmt.setString(4, name);
            stmt.setString(5, contact);
            stmt.setString(6, requiem_Mass);
            stmt.setString(7, "no");
            stmt.setString(8, "");
            stmt.setString(9, priest);
            stmt.setString(10, date_added);
            stmt.setString(11, terminal_id);
            stmt.setString(12, user_id);
            stmt.setString(13, user_name);
            stmt.setString(14, "1");
            stmt.setString(15, "");
            stmt.execute();

            for (String n : names) {
                String s1 = "insert into db_bulletin.souls_of(reference_number,name)values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(s1);
                stmt2.setString(1, ref_no);
                stmt2.setString(2, n);
                stmt2.execute();

            }


            String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type"
                    + ",reference_number,terminal_id,user_id,user_name,status,remarks) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psmt1 = conn.prepareStatement(s1);
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date_added);
            psmt1.setString(5, "Requiem Mass");
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);
            psmt1.setString(8, terminal_id);
            psmt1.setString(9, user_id);
            psmt1.setString(10, user_name);
            psmt1.setString(11, "1");
            psmt1.setString(12, "");
            psmt1.execute();
//            JOptionPane.showMessageDialog(null, "Successfully Added");
            Lg.s(S1_mass_schedules.class, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }

//
    public static void pay(String or_no, List<to_payment> datas) {
        try {
            Connection conn = PoolConnection.connect();


            for (S1_mass_schedules.to_payment aw : datas) {
                String s0 = "update db_bulletin.mass_intention set is_payed='" + "yes" + "' where reference_number='" + aw.reference_number + "'";
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();


                String s1 = "insert into db_bulletin.receipts(or_number,payor,amount_paid,date_added,or_type,payment_type,reference_number) values(?,?,?,?,?,?,?)";
                PreparedStatement psmt1 = conn.prepareStatement(s1);
                psmt1.setString(1, or_no);
                psmt1.setString(2, aw.name);
                psmt1.setDouble(3, aw.amount);
                psmt1.setString(4, aw.date_added);
                psmt1.setString(5, aw.or_type);
                psmt1.setString(6, "Cash");
                psmt1.setString(7, aw.reference_number);

                psmt1.execute();

            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_pay_donation(String name, double amount, String or_no, String type,String ref_no,String terminal_id,String user_id,String user_name) {
        try {
            Connection conn = PoolConnection.connect();
            String date = DateType.datetime.format(new Date());
// 
            String s1 = "insert into db_bulletin.receipts(or_number"
                    + ",payor"
                    + ",amount_paid"
                    + ",date_added"
                    + ",or_type"
                    + ",payment_type"
                    + ",reference_number"
                    + ",terminal_id"
                    + ",user_id"
                    + ",user_name"
                    + ",status"
                    + ",remarks) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psmt1 = conn.prepareStatement(s1);
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, type);
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);
            psmt1.setString(8, terminal_id);
            psmt1.setString(9, user_id);
            psmt1.setString(10, user_name);
            psmt1.setString(11, "1");
            psmt1.setString(12, "");

            psmt1.execute();
            Lg.s(S1_mass_schedules.class, "Successfully Added");

//            JOptionPane.showMessageDialog(null, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    public static void do_pay_cert(String name, double amount, String or_no, String type,String ref_no,String terminal_id,String user_id,String user_name,String ref_id) {
        try {
            Connection conn = PoolConnection.connect();
            String date = DateType.datetime.format(new Date());
// 
            String s1 = "insert into db_bulletin.receipts(or_number"
                    + ",payor"
                    + ",amount_paid"
                    + ",date_added"
                    + ",or_type"
                    + ",payment_type"
                    + ",reference_number"
                    + ",terminal_id"
                    + ",user_id"
                    + ",user_name"
                    + ",status"
                    + ",remarks) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psmt1 = conn.prepareStatement(s1);
            psmt1.setString(1, or_no);
            psmt1.setString(2, name);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date);
            psmt1.setString(5, type);
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);
            psmt1.setString(8, terminal_id);
            psmt1.setString(9, user_id);
            psmt1.setString(10, user_name);
            psmt1.setString(11, "1");
            psmt1.setString(12, "");

            psmt1.execute();
//            JOptionPane.showMessageDialog(null, ref_id);
            String s0="update db_bulletin.f_receipts set status='"+"1"+"' where or_number='"+ref_id+"'";
            PreparedStatement stmt = conn.prepareStatement(s0);            
            stmt.execute();
            
            Lg.s(S1_mass_schedules.class, "Successfully Added");

//            JOptionPane.showMessageDialog(null, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
   
    public static void add_receipt_certificate(String or_no, String parishioner, double amount, String type, String ref_no, String terminal_id, String user_id, String user_name) {
        String date_added = DateType.datetime.format(new Date());
        try {

            Connection conn = PoolConnection.connect();
            if (type.equals("Cert_Baptism")) {
                String ss = "select sum(rate) from db_bulletin.fees where fee_type='" + "Baptism" + "'";
                Statement stmt = conn.createStatement();
                ResultSet rs1 = stmt.executeQuery(ss);
                if (rs1.next()) {
                    amount = rs1.getDouble(1);
                }
            }
            if (type.equals("Cert_Confirmation")) {
                amount = 100;

            }
            if (type.equals("Cert_Marriage")) {
                amount = 100;
            }
            if (type.equals("Cert_Funeral")) {
                amount = 100;
            }
            String s1 = "insert into db_bulletin.f_receipts(or_number"
                    + ",payor"
                    + ",amount_paid"
                    + ",date_added"
                    + ",or_type"
                    + ",payment_type"
                    + ",reference_number"
                    + ",terminal_id"
                    + ",user_id"
                    + ",user_name"
                    + ",status"
                    + ",remarks) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psmt1 = conn.prepareStatement(s1);
            psmt1.setString(1, or_no);
            psmt1.setString(2, parishioner);
            psmt1.setDouble(3, amount);
            psmt1.setString(4, date_added);
            psmt1.setString(5, type);
            psmt1.setString(6, "Cash");
            psmt1.setString(7, ref_no);
            psmt1.setString(8, terminal_id);
            psmt1.setString(9, user_id);
            psmt1.setString(10, user_name);
            psmt1.setString(11, "0");
            psmt1.setString(12, "");
            psmt1.execute();
            Lg.s(S1_mass_schedules.class, "Successfully Added");
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_intention(String ref_no, String name, String contact, String message) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.mass_intention set "
                    + "parishioner_name='" + name + "' "
                    + ",contact_number='" + contact + "'"
                    + ",message='" + message + "' where reference_number ='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
//            JOptionPane.showMessageDialog(null, "Successfully Updated");
            Lg.s(S1_mass_schedules.class, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_intention_requiem(String ref_no, String name, String contact, List<to_name> to_name) {
        List<S1_mass_schedules.to_name> to = to_name;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.mass_intention set "
                    + "parishioner_name='" + name + "' "
                    + ",contact_number='" + contact + "'"
                    + ",message='" + "" + "' where reference_number ='" + ref_no + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.souls_of where reference_number='" + ref_no + "'";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();

            for (S1_mass_schedules.to_name t : to) {
                String s2 = "insert into db_bulletin.souls_of(reference_number,name)values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(s2);
                stmt2.setString(1, ref_no);
                stmt2.setString(2, t.name);
                stmt2.execute();
            }


//            JOptionPane.showMessageDialog(null, "Successfully Updated");
            Lg.s(S1_mass_schedules.class, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_intention(String ref) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.mass_intention where reference_number='" + ref + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

//            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            Lg.s(S1_mass_schedules.class, "Successfully Deleted");


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
