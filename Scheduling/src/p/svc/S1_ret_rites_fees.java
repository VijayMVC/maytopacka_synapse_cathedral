/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import bb.dlg2.dlg_rites1.Data;
import com.jgoodies.binding.list.ArrayListModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;
import p.to.to_rites_fees;

/**
 *
 * @author Dummy
 */
public class S1_ret_rites_fees {

    public static List<to_rites_fees> ret_rate(String rite, String stat) {




        try {
            Connection conn = PoolConnection.connect();
            List<to_rites_fees> datas = new ArrayList();
            String s0 = "select name,rate,states,id from db_bulletin.fees where fee_type='" + rite + "' and states='" + stat + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                double rate = rs.getDouble(2);
                String states = rs.getString(3);
                String id= rs.getString(4);
                to_rites_fees to = new to_rites_fees(name, rate, states,id,true);
                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

//    public static List<to_rites_fees> add(ArrayListModel tbl_employee_payroll_ALM, String name, double rate, String type) {
//        List<to_rites_fees> datas = new ArrayList();
//
//        to_rites_fees to = new to_rites_fees(name, rate, type);
//        datas.add(to);
//        return datas;
//    }

    public static void do_save_fees(ArrayListModel tbl_employee_payroll_ALM, String type, String stat) {

        try {
            Connection conn = PoolConnection.connect();

            List<to_rites_fees> datas = tbl_employee_payroll_ALM;

            String s1 = "delete from db_bulletin.fees where fee_type='" + type + "' and states='" + stat + "'";

            PreparedStatement psm1 = conn.prepareStatement(s1);
            psm1.execute();


            String s0 = "insert into db_bulletin.fees(name,rate,fee_type,states)values(?,?,?,?)";

            PreparedStatement psmt = conn.prepareStatement(s0);
            for (to_rites_fees to : datas) {
                psmt.setString(1, to.name);
                psmt.setDouble(2, to.rate);
                psmt.setString(3, type);
                psmt.setString(4, stat);
                psmt.execute();
            }

            JOptionPane.showMessageDialog(null, "Succesfully Saved");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void save_fees(String name, double rate, String type, String stat) {

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.fees(name,rate,fee_type,states)values(?,?,?,?)";

            PreparedStatement psmt = conn.prepareStatement(s0);

            psmt.setString(1, name);
            psmt.setDouble(2, rate);
            psmt.setString(3, type);
            psmt.setString(4, stat);
            psmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Saved");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void do_delete(String name, String stat, String toString) {

        try {
            Connection conn = PoolConnection.connect();


            String s0 = "delete from db_bulletin.fees where name='" + name + "' and fee_type='" + toString + "' and states='" + stat + "'";
            PreparedStatement psmt = conn.prepareStatement(s0);
            psmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Deleted ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit(Data data, String id) {
        try {
            Connection conn = PoolConnection.connect();
            String s0="update db_bulletin.fees set name='"+data.name+"',rate='"+data.rate+"' ,states='"+data.state+"' where id='"+id+"'";
            PreparedStatement stmt = conn.prepareStatement(s0);            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    
    public static class to_fees{
        
        public final String name;
        public final double amount;
        public  boolean stmt;

        public to_fees(String name, double amount, boolean stmt) {
            this.name = name;
            this.amount = amount;
            this.stmt = stmt;
        }

        public boolean isStmt() {
            return stmt;
        }

        public void setStmt(boolean stmt) {
            this.stmt = stmt;
        }
        

    }
  
    
}
