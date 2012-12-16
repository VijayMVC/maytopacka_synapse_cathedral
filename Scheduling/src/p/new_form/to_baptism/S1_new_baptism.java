/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form.to_baptism;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;
import p.baptism.S8_baptism.to_sponsors;
import p.new_form.Dlg_new_baptism.to_2nd_details;
import p.new_form.Dlg_new_baptism.to_basic_info;
import p.new_form.to_baptism.to_baptism.to_marriage_tribunal;

/**
 *
 * @author dummy
 */
public class S1_new_baptism {

    public static void add(to_2nd_details to_2nd_info, to_basic_info to_basic, List<to_marriage_tribunal> to_marriage_trib, List<to_sponsors> to_spon, String ref_no) {

        try {
            Connection conn = PoolConnection.connect();

            String s0 = "insert into db_bulletin.baptism2("
                    + "ref_no,fname,mi,lname,date_of_birth"
                    + ",place_of_birth,father,mother,godfather,p_godfather"
                    + ",godmother,p_godmother,presider,bapt_date,bapt_time"
                    + ",bapt_church,priest,book_no,page_no,f_comm_date"
                    + ",f_comm_church,f_conf_date,f_conf_church,is_diaconate,diconate_date"
                    + ",is_religious_prof,religious_prof_date,remarks,status,years,num)values"
                    + "(?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, ref_no);
            stmt.setString(2, to_basic.fname);
            stmt.setString(3, to_basic.mi);
            stmt.setString(4, to_basic.lname);
            stmt.setString(5, to_basic.bday);

            stmt.setString(6, to_basic.bday_place);
            stmt.setString(7, to_basic.father);
            stmt.setString(8, to_basic.mother);
            stmt.setString(9, to_basic.godfather);
            stmt.setString(10, to_basic.proxy_godfather);

            stmt.setString(11, to_basic.godmother);
            stmt.setString(12, to_basic.proxy_godmother);
            stmt.setString(13, to_basic.presider);
            stmt.setString(14, to_basic.date_of_baptism);
            stmt.setString(15, to_basic.time);

            stmt.setString(16, to_basic.bap_church);
            stmt.setString(17, to_basic.priest);
            stmt.setString(18, to_2nd_info.book_no);
            stmt.setString(19, to_2nd_info.page_no);
            stmt.setString(20, to_2nd_info.f_comm_date);

            stmt.setString(21, to_2nd_info.f_comm_church);
            stmt.setString(22, to_2nd_info.f_confirmation_date);
            stmt.setString(23, to_2nd_info.f_confirmation_church);
            stmt.setString(24, to_2nd_info.is_diaconate);
            stmt.setString(25, to_2nd_info.diaconate_date);

            stmt.setString(26, to_2nd_info.is_rel_profession);
            stmt.setString(27, to_2nd_info.rel_prof_date);
            stmt.setString(28, to_2nd_info.remarks);
            stmt.setString(29, "4"); //status
            stmt.setString(30, to_2nd_info.years);
            stmt.setString(31, to_2nd_info.num); //status

            stmt.execute();

            List<to_sponsors> sponsors = to_spon;


            for (to_sponsors t : sponsors) {
                String s1 = "insert into db_bulletin.baptism2_sponsors(ref_no,sponsor)values(?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setString(2, t.name);
                stmt1.execute();

            }

            List<to_marriage_tribunal> to_ma = to_marriage_trib;

            for (to_marriage_tribunal t : to_ma) {
                String s1 = "insert into db_bulletin.baptism2_marr_trib(ref_no,marriage_no,date_of_marriage,date_of_death_spouse,ord_no,case_no,tribunal_no)values(?,?,?,?,?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setInt(2, t.marriage_no);
                stmt1.setString(3, t.date_of_marriage);
                stmt1.setString(4, t.Date_of_death_of_spouse);
                stmt1.setString(5, t.decree_ordi_no);
                stmt1.setString(6, t.case_no);
                stmt1.setString(7, t.tribunal_no);
                stmt1.execute();

            }

            String stat = "1";
            String get = System.getProperty("app_all", "false");
            if (get.equals("true")) {
                stat = "4";
            }
            
            String s3 = "update db_bulletin.parishioners_1 set is_baptized='" + stat+ "' where ref_id='" + ref_no + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();

//            JOptionPane.showMessageDialog(null,get + " "+stat);
//            String s2 = "update db_bulletin.parishioners_1 set is_baptized='" + stat + "',date_of_baptism='" + to_basic.date_of_baptism + "' where ref_id='" + ref_no + "'";
//            PreparedStatement stmt2 = conn.prepareStatement(s2);
//            stmt2.execute();

            Lg.i(S1_new_baptism.class, "Successfully Added");
            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void update_parishioner_baptism(String date_of_baptism, String ref_no,String b_book_no,String page_no,String index) {
        try {
            Connection conn = PoolConnection.connect();

            String s2 = "update db_bulletin.parishioners_1 set "
                    + "is_baptized='" + "4" + "',date_of_baptism='" + date_of_baptism + "'"
                    + ",b_date='"+date_of_baptism+"', b_book_no='"+b_book_no+"',b_page_no='"+page_no+"',b_index_no='"+index+"'"
                    + "where ref_id='" + ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            Lg.i(S1_new_baptism.class, "Successfully Added");
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit(to_2nd_details to_2nd_info, to_basic_info to_basic, List<to_marriage_tribunal> to_marriage_trib, List<to_sponsors> to_spon, String ref_no) {

        try {
            Connection conn = PoolConnection.connect();

            String s0 = "update  db_bulletin.baptism2 set fname ='" + to_basic.fname + "'"
                    + ",mi ='" + to_basic.mi + "'"
                    + ",lname ='" + to_basic.lname + "'"
                    + ",date_of_birth ='" + to_basic.bday + "'"
                    + ",place_of_birth ='" + to_basic.bday_place + "'"
                    + ",father ='" + to_basic.father + "'"
                    + ",mother ='" + to_basic.mother + "'"
                    + ",godfather ='" + to_basic.godfather + "'"
                    + ",p_godfather ='" + to_basic.proxy_godfather + "'"
                    + ",godmother ='" + to_basic.godmother + "'"
                    + ",p_godmother ='" + to_basic.proxy_godmother + "'"
                    + ",presider ='" + to_basic.presider + "'"
                    + ",bapt_date ='" + to_basic.date_of_baptism + "'"
                    + ",bapt_time ='" + to_basic.time + "'"
                    + ",bapt_church ='" + to_basic.bap_church + "'"
                    + ",priest ='" + to_basic.priest + "'"
                    + ",book_no ='" + to_2nd_info.book_no + "'"
                    + ",page_no ='" + to_2nd_info.page_no + "'"
                    + ",f_comm_date ='" + to_2nd_info.f_comm_date + "'"
                    + ",f_comm_church ='" + to_2nd_info.f_comm_church + "'"
                    + ",f_conf_date ='" + to_2nd_info.f_confirmation_date + "'"
                    + ",f_conf_church ='" + to_2nd_info.f_confirmation_church + "'"
                    + ",is_diaconate ='" + to_2nd_info.is_diaconate + "'"
                    + ",diconate_date ='" + to_2nd_info.diaconate_date + "'"
                    + ",is_religious_prof ='" + to_2nd_info.is_rel_profession + "'"
                    + ",religious_prof_date ='" + to_2nd_info.rel_prof_date + "'"
                    + ",remarks ='" + to_2nd_info.remarks + "'"
                    + ",years ='" + to_2nd_info.years + "'"
                    + ",num ='" + to_2nd_info.num + "'"
                  
                    //                    + ",status ='"+to_2nd_info.fname+"'"
                    + " where ref_no='" + ref_no + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            List<to_sponsors> sponsors = to_spon;

            String ss1 = "delete from db_bulletin.baptism2_sponsors where ref_no='" + ref_no + "' ";
            PreparedStatement stmt11 = conn.prepareStatement(ss1);
            stmt11.execute();

            for (to_sponsors t : sponsors) {
                String s1 = "insert into db_bulletin.baptism2_sponsors(ref_no,sponsor)values(?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setString(2, t.name);
                stmt1.execute();
            }

            List<to_marriage_tribunal> to_ma = to_marriage_trib;

            String ss2 = "delete from db_bulletin.baptism2_marr_trib where ref_no='" + ref_no + "' ";
            PreparedStatement stmt22 = conn.prepareStatement(ss2);
            stmt22.execute();

            for (to_marriage_tribunal t : to_ma) {
                String s1 = "insert into db_bulletin.baptism2_marr_trib(ref_no,marriage_no,date_of_marriage,date_of_death_spouse,ord_no,case_no,tribunal_no)values(?,?,?,?,?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, ref_no);
                stmt1.setInt(2, t.marriage_no);
                stmt1.setString(3, t.date_of_marriage);
                stmt1.setString(4, t.Date_of_death_of_spouse);
                stmt1.setString(5, t.decree_ordi_no);
                stmt1.setString(6, t.case_no);
                stmt1.setString(7, t.tribunal_no);
                stmt1.execute();

            }

//            String s2 = "update db_bulletin.parishioners_1 set is_baptized='" + "1" + "',date_of_baptism='" + to_basic.date_of_baptism + "' where ref_id='" + ref_no + "'";
//            PreparedStatement stmt2 = conn.prepareStatement(s2);
//            stmt2.execute();
            
              String s2="update db_bulletin.parishioners_1 set b_date ='" + to_basic.date_of_baptism + "'"
                    + ",b_book_no ='" + to_2nd_info.book_no + "'"
                    + ",b_page_no='" + to_2nd_info.page_no + "' "
                    + ",b_index_no ='" + to_2nd_info.num+ "' where ref_id='"+ref_no+"'";
            PreparedStatement stm3 = conn.prepareStatement(s2);            
            stm3.execute();


            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static to_basic_info ret_bap_basic_info(String ref_no) {

        to_basic_info to = null;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select  ref_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",father"
                    + ",mother"
                    + ",godfather"
                    + ",p_godfather"
                    + ",godmother"
                    + ",p_godmother"
                    + ",presider"
                    + ",bapt_date"
                    + ",bapt_time"
                    + ",bapt_church"
                    + ",priest "
                    + "from db_bulletin.baptism2 where ref_no='" + ref_no + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                String ref_nos = rs.getString(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String date_of_birth = rs.getString(5);

                String place_of_birth = rs.getString(6);
                String father = rs.getString(7);
                String mother = rs.getString(8);
                String godfather = rs.getString(9);
                String p_godfather = rs.getString(10);

                String godmother = rs.getString(11);
                String p_godmother = rs.getString(12);
                String presider = rs.getString(13);
                String bapt_date = rs.getString(14);
                String bapt_time = rs.getString(15);

                String bapt_church = rs.getString(16);
                String priest = rs.getString(17);

                to = new to_basic_info(
                        fname, mi, lname, date_of_birth, place_of_birth, father, mother, godfather, p_godfather, godmother, p_godmother, presider, bapt_date, bapt_time, bapt_church, priest);
            }

            return to;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static to_2nd_details ret_baptism_2nd_info(String ref_no) {
        to_2nd_details to = null;


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select book_no,page_no,f_comm_date"
                    + ",f_comm_church,f_conf_date,f_conf_church,is_diaconate,diconate_date"
                    + ",is_religious_prof,religious_prof_date,remarks,years,num from db_bulletin.baptism2 where ref_no='" + ref_no + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                String book_no = rs.getString(1);
                String page_no = rs.getString(2);
                String f_comm_date = rs.getString(3);
                String f_comm_church = rs.getString(4);
                String f_conf_date = rs.getString(5);
                String f_conf_church = rs.getString(6);
                String is_diaconate = rs.getString(7);
                String diconate_date = rs.getString(8);;
                String is_religious_prof = rs.getString(9);
                String religious_prof_date = rs.getString(10);
                String remarks = rs.getString(11);
                String years = rs.getString(12);
                String num = rs.getString(13);

                to = new to_2nd_details(book_no, page_no, f_comm_date, f_comm_church, f_conf_date, f_conf_church, is_diaconate, diconate_date, is_religious_prof, religious_prof_date, remarks, years, num);

            }
            return to;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<to_marriage_tribunal> ret_bap_marr(String ref_no) {

        List<to_marriage_tribunal> datas = new ArrayList();


        try {

            String s0 = "select marriage_no,date_of_marriage,date_of_death_spouse,ord_no,case_no,tribunal_no from db_bulletin.baptism2_marr_trib where ref_no='" + ref_no + "'";
            Connection conn = PoolConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int marriage_no = rs.getInt(1);
                String date_of_marriage = rs.getString(2);
                String date_of_death_spouse = rs.getString(3);
                String ord_no = rs.getString(4);
                String case_no = rs.getString(5);
                String tribunal_no = rs.getString(6);
                to_marriage_tribunal to = new to_marriage_tribunal(marriage_no, date_of_marriage, date_of_death_spouse, ord_no, case_no, tribunal_no);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }

    public static List<to_sponsors> ret_bap_sponsors(String ref_no) {

        List<to_sponsors> datas = new ArrayList();

        try {

            String s0 = "select sponsor from db_bulletin.baptism2_sponsors where ref_no='" + ref_no + "'";
            Connection conn = PoolConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println(name);
                to_sponsors to = new to_sponsors(name, ref_no);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }


    }

    public static void main(String[] args) {
        System.out.println(Arrays.asList(ret_bap_sponsors("3")));
    }
}
