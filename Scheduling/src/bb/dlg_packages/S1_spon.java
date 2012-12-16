/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bb.dlg_packages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author dummy
 */
public class S1_spon {

    public static List<String> parseSponsors(String name) {
        List<String> datas = new ArrayList();
        int limit = name.length();
        int start = 0;
        int stop = 0;
        int trap = 0;

        for (int i = 0; i < limit; i++) {
            String ch = "" + name.charAt(i);
            if (ch.equals(",")) {
                trap = 1;
                start = stop;
                stop = i;
                String holder = name.substring(start, stop);
                holder = holder.replace(",", "");
                datas.add(holder);
            }
        }

        if (trap == 0) {
            datas.add(name);
        } else {
            datas.add(name.substring(stop + 1, limit));
        }

        return datas;
    }

    public static class to_sp1 {

        public final String id;
        public final String ref_no;
        public final String names;

        public to_sp1(String id, String ref_no, String names) {
            this.id = id;
            this.ref_no = ref_no;
            this.names = names;
        }
    }

    public static List<to_sp1> ret_datas() {
        List<to_sp1> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select id,ref_no,sponsor from db_bulletin.baptism2_sponsors  where sponsor like '%"+""+"%' order by ref_no";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String ref_no = rs.getString(2);
                String name = rs.getString(3);
                to_sp1 to = new to_sp1(id, ref_no, name);
                datas.add(to);
            }

            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int ret_id() {
        int id = 0;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(id) from db_bulletin.baptism2_sponsors";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getInt(1);
            }
            id++;
            return id;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }

    }

    public static void update_sponsor(String id, String ref_no, String name) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.baptism2_sponsors where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "insert into db_bulletin.baptism2_sponsors(ref_no,sponsor)values(?,?)";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.setString(1, ref_no);
            stmt1.setString(2, name);
            stmt1.execute();
            System.out.println(ref_no + " " + name);
//            Lg.s(S1_spon.class, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void main(String[] args) {
//        List<String> datas = parseSponsors("ronamd,adad,weee,wewe");
//        for (String s : datas) {
//            System.out.println(s);
//        }
        System.out.println(ret_id());
    }
}
