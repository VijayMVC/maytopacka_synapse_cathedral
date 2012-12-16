/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import overallPOS.modules.share.utils.PoolConnection;
import p.mass.S1_mass;
import p.mass.S1_mass_templates;
import p.util.DateType;

/**
 *
 * @author Dummy
 */
public class TableAdapter_mass {

    public static String[] payroll_col_names(String name) {
//     
        String[] emps = {"ID", name, "AMOUNT"};

        String[] col_names = new String[emps.length];
        System.arraycopy(emps, 0, col_names, 0, emps.length);
//        System.arraycopy(ded_name, 0, col_names, emps.length, ded_name.length);
//        System.arraycopy(totals, 0, col_names, emps.length + ded_name.length, totals.length);
        return col_names;
    }

    public static List<String[]> date_data() {
        List<String[]> datas = new ArrayList();
        String[] new_data = {"", "", ""};

        int month = Integer.parseInt(DateType.m1.format(new Date()));
        int day = Integer.parseInt(DateType.d.format(new Date()));
        int year = Integer.parseInt(DateType.y.format(new Date()));
        int date = day;
        for (int i = 0; i < 20; i++) {
            if (date > 30) {
                if (month == 12) {
                    year++;
                }
                month++;
                date = 1;
            }
            String a = "" + month;
            if (a.length() == 0) {
                a = "0" + a;
            }
            new_data[0] = "";
            new_data[2] = "";
            new_data[1] = year + "-" + a + "-" + date;
            Date d = new Date();
            try {
                d = DateType.sf.parse(new_data[1]);

            } catch (Exception e) {
            }
            new_data[0] = "";
            new_data[1] = DateType.str.format(d);
            new_data[2] = "";
            String[] row_data = new String[new_data.length];
            System.arraycopy(new_data, 0, row_data, 0, new_data.length);
            datas.add(row_data);

            date++;
        }

        return datas;
    }

//    public static void main(String[] args) {
////        List<String> datas = new ArrayList();
////        datas.add("120");
////        datas.add("1000");
////        datas.add("1000");
////
////        double t = 200;
////        List<String> new_data = new ArrayList();
////
////        for (String s : datas) {
////            double ss = FitIn.toDouble(s);
////            double am = t - ss;
////            t -= ss;
////            if (t < 1) {
////                new_data.add("" + data(am));
////                t = 0;
////            } else {
////                if (am == t) {
////                    new_data.add("0.00");
////                } else {
////                    new_data.add("" + data(am));
////                }
////            }
////        }
//////
////        for (String s : new_data) {
////            System.out.println(s);
////        }
//
//    }
    public static String data(double str) {
        String strs = "" + str;
        strs = strs.replace("-", "");
        return strs;
    }

    public static List<String[]> time_data(String type) {
        List<String[]> datas = new ArrayList();
        String[] new_data = {"", "", ""};
        List<S1_mass.to_schedules> data = S1_mass.ret_scheds(type);
        for (S1_mass.to_schedules s : data) {
            new_data[0] = "";
            new_data[1] = s.scheduled_time;
            new_data[2] = "";
            String[] row_data = new String[new_data.length];
            System.arraycopy(new_data, 0, row_data, 0, new_data.length);
            datas.add(row_data);
        }
//        for (int i = 0; i < 20; i++) {
//        }
        return datas;
    }

    public static List<String[]> message_data(String type) {

        List<String> data = S1_mass_templates.ret_sched_str(type);

        List<String[]> datas = new ArrayList();
        String[] new_data = {"", "", ""};
        for (String s : data) {
            new_data[0] = "";
            new_data[1] = s;
            new_data[2] = "";
            String[] row_data = new String[new_data.length];
            System.arraycopy(new_data, 0, row_data, 0, new_data.length);
            datas.add(row_data);
        }
        return datas;
    }

    public static class f_receipts {

        public final String id;
        public final String name;
        public final String amount;

        public f_receipts(String id, String name, String amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }
    }

    public static List<String[]> sponsor_data(List<String> data) {

        List<String[]> datas = new ArrayList();
        String[] new_data = {"", "", ""};

        for (String s : data) {
            new_data[0] = "";
            new_data[1] = s;
            new_data[2] = "";
            String[] row_data = new String[new_data.length];
            System.arraycopy(new_data, 0, row_data, 0, new_data.length);
            datas.add(row_data);
        }
//        for (int i = 0; i < 20; i++) {
//        }
        return datas;
    }

    public static List<String[]> cert_data(List<f_receipts> data) {

        List<String[]> datas = new ArrayList();
        String[] new_data = {"", "", ""};

        for (f_receipts s : data) {
            new_data[0] = s.id;
            new_data[1] = s.name;
            new_data[2] = s.amount;
            String[] row_data = new String[new_data.length];
            System.arraycopy(new_data, 0, row_data, 0, new_data.length);
            datas.add(row_data);
        }
        return datas;
    }

    public static List<f_receipts> cert_data(String or_type) {

        List<f_receipts> datas = new ArrayList();

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select or_number,payor,amount_paid from db_bulletin.f_receipts where or_type='" + or_type + "' and status='" + "0" + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String amount = rs.getString(3);
                f_receipts f = new f_receipts(id, name, amount);
                datas.add(f);
            }
            return datas;
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<String[]> data_amount() {

        List<String[]> datas = new ArrayList();
        String[] new_data = {"", "", ""};

        double am = 50;
        for (int i = 0; i < 30; i++) {
            am += 50;
            new_data[0] = "";
            new_data[1] = "" + am;
            new_data[2] = "";
            String[] row_data = new String[new_data.length];
            System.arraycopy(new_data, 0, row_data, 0, new_data.length);
            datas.add(row_data);
        }
//        for (int i = 0; i < 20; i++) {
//        }
        return datas;
    }

    public static String add_string(List<String> sp) {
//        System.out.println(sp.size()+ " ---s");
        String aw = "";
        for (String s : sp) {
            aw = aw + ", " + s;
        }
        return aw;
    }

//    public static void main(String[] args) {
//
//        List<String[]> datas = new ArrayList();
//        String a = "a";
//        String b = ",b";
//        String c = ",c";
//        List<String> o = new ArrayList();
//        o.add(a);
//        o.add(", " + b);
//        o.add(", " + c);
//
//        String new_str = "ronald";
//        o.add("," + new_str);
//
//        for (String s : o) {
//
//            String[] q = {s};
//            datas.add(q);
//        }
//        System.out.println(Arrays.asList(datas));
//    }
    public static List<String[]> sponsor_data(String name, List<String> sp) {

        List<String[]> datas = new ArrayList();
        String[] new_data = {"", "", ""};

//        for (int i = 0; i < 20; i++) {
//         
//        }
        for (String s : sp) {
            new_data[0] = s;
            new_data[1] = "";
            new_data[2] = "";
            String[] row_data = new String[new_data.length];
            System.arraycopy(new_data, 0, row_data, 0, new_data.length);
            datas.add(row_data);
        }
        return datas;
    }

    public static void set_table(JTable table, String[] col_names, List<String[]> row_data, final int[] col_editable, int[] cols_to_center, int[] rows_to_right) {
        DefaultTableModel table_model = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                for (int e : col_editable) {
                    if (e == colIndex) {
                        return true;
                    }
                }
                return false;
            }
        };

        table.setModel(table_model);
        String[] col_holder = col_names;

        List<String[]> data_holder = row_data;
        table_model.setColumnIdentifiers(col_holder);

        for (String[] data : data_holder) {
            table_model.addRow(data);
        }
    }
}
