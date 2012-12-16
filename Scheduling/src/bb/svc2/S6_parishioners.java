/*
 * To change this templatepublic final String  choose Tools | Templates
 * and open the template in the editor.
 */
package bb.svc2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author dummy
 */
public class S6_parishioners {

    public static class to_parishioners {

        public final String ref_id;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String date_of_baptism;
        public final String date_of_birth;
        public final String place_of_birth;
        public final String address1;
        public final String address2;
        public final String city;
        public final String states;
        public final String zip_code;
        public final String father;
        public final String mother;
        public final String is_baptized;
        public final String is_comm;
        public final String is_confirm;
        public final String is_married;
        public final String is_2nd_married;
        public final String is_prof_faith;
        public final String is_acceptance;
        public final String is_death;
        public final String date_added;
        public final String gender;
        public final String bapt_place;
//         ,rite_name,"Book No","Page No","Index"
//                ,"Date of Birth","Place of Birth","Address","Father","Mother"
        public final String rite_name;
        public final String book_no;
        public final String page_no;
        public final String index;
        public final String date_of_births;
        public final String place_of_births;
        public final String addresss;
        public final String fathers;
        public final String mothers;

        public to_parishioners(String ref_id, String fname, String mi, String lname, String date_of_baptism, String date_of_birth, String place_of_birth, String address1, String address2, String city, String states, String zip_code, String father, String mother, String is_baptized, String is_comm, String is_confirm, String is_married, String is_2nd_married, String is_prof_faith, String is_acceptance, String is_death, String date_added, String gender, String bapt_place, String rite_name, String book_no, String page_no, String index, String date_of_births, String place_of_births, String addresss, String fathers, String mothers) {
            this.ref_id = ref_id;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.date_of_baptism = date_of_baptism;
            this.date_of_birth = date_of_birth;
            this.place_of_birth = place_of_birth;
            this.address1 = address1;
            this.address2 = address2;
            this.city = city;
            this.states = states;
            this.zip_code = zip_code;
            this.father = father;
            this.mother = mother;
            this.is_baptized = is_baptized;
            this.is_comm = is_comm;
            this.is_confirm = is_confirm;
            this.is_married = is_married;
            this.is_2nd_married = is_2nd_married;
            this.is_prof_faith = is_prof_faith;
            this.is_acceptance = is_acceptance;
            this.is_death = is_death;
            this.date_added = date_added;
            this.gender = gender;
            this.bapt_place = bapt_place;
            this.rite_name = rite_name;
            this.book_no = book_no;
            this.page_no = page_no;
            this.index = index;
            this.date_of_births = date_of_births;
            this.place_of_births = place_of_births;
            this.addresss = addresss;
            this.fathers = fathers;
            this.mothers = mothers;
        }
    }

    public static int get_ref_id() {
        int id = 0;
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select ref_id from db_bulletin.parishioners_1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
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

    public static void add_parishioner(to_parishioners to) {
//           

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into db_bulletin.parishioners_1(ref_id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",date_of_baptism"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",address1"
                    + ",address2"
                    + ",city"
                    + ",states"
                    + ",zip_code"
                    + ",father"
                    + ",mother"
                    + ",date_added"
                    + ",gender"
                    + ",bapt_place"
                    
                    + ",b_date"
                    + ",c_date"
                    + ",m_date"
                    + ",f_date"
                    
                    + ",b_book_no"
                    + ",c_book_no"
                    + ",m_book_no"
                    + ",f_book_no"
                    
                    + ",b_page_no"
                    + ",c_page_no"
                    + ",m_page_no"
                    + ",f_page_no"
                    
                    + ",b_index_no"
                    + ",c_index_no"
                    + ",m_index_no"
                    + ",f_index_no"
                    + ")values("
                    + "?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?,?,?"
                    + ",?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, to.ref_id);
            stmt.setString(2, to.fname);
            stmt.setString(3, to.mi);
            stmt.setString(4, to.lname);
            stmt.setString(5, to.date_of_baptism);
            stmt.setString(6, to.date_of_birth);

            stmt.setString(7, to.place_of_birth);
            stmt.setString(8, to.address1);
            stmt.setString(9, to.address2);
            stmt.setString(10, to.city);

            stmt.setString(11, to.states);
            stmt.setString(12, to.zip_code);
            stmt.setString(13, to.father);
            stmt.setString(14, to.mother);
            stmt.setString(15, to.date_added);

            stmt.setString(16, to.gender);
            stmt.setString(17, to.bapt_place);

            stmt.setString(18, "1500-01-01");
            stmt.setString(19, "1500-01-01");
            stmt.setString(20, "1500-01-01");
            stmt.setString(21, "1500-01-01");

            stmt.setString(22, "0");
            stmt.setString(23, "0");
            stmt.setString(24, "0");
            stmt.setString(25, "0");


            stmt.setString(26, "0");
            stmt.setString(27, "0");
            stmt.setString(28, "0");
            stmt.setString(29, "0");

            stmt.setString(30, "0");
            stmt.setString(31, "0");
            stmt.setString(32, "0");
            stmt.setString(33, "0");

            stmt.execute();

//          
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_parishioner(to_parishioners to, String ref_id) {
//           
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.parishioners_1 set fname='" + to.fname + "'"
                    + ",mi='" + to.mi + "'"
                    + ",lname='" + to.lname + "'"
                    + ",date_of_baptism='" + to.date_of_baptism + "'"
                    + ",date_of_birth='" + to.date_of_birth + "'"
                    + ",place_of_birth='" + to.place_of_birth + "'"
                    + ",address1='" + to.address1 + "'"
                    + ",address2='" + to.address2 + "'"
                    + ",city='" + to.city + "'"
                    + ",states='" + to.states + "'"
                    + ",zip_code='" + to.zip_code + "'"
                    + ",father='" + to.father + "'"
                    + ",mother='" + to.mother + "'"
                    + ",gender='" + to.gender + "'"
                    + ",bapt_place='" + to.bapt_place + "'"
                    + " where ref_id='" + ref_id + "'";

            PreparedStatement stmt = conn.prepareStatement(s0);

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static List<to_parishioners> ret_data(String name) {
        List<to_parishioners> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select ref_id,fname,mi,lname,date_of_baptism"
                    + ",date_of_birth,place_of_birth,address1,address2,city"
                    + ",states,zip_code,father,mother"
                    + ",is_baptized,is_comm,is_confirm,is_married,is_2nd_married,is_prof_faith,is_acceptance,is_death"
                    + ",date_added,gender,bapt_place from db_bulletin.parishioners_1"
                    + " where concat(fname,space(1),mi,space(1),lname) like '%" + name + "%' limit 300";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref_id = rs.getString(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String date_of_baptism = rs.getString(5);

                String date_of_birth = rs.getString(6);
                String place_of_birth = rs.getString(7);
                String address1 = rs.getString(8);
                String address2 = rs.getString(9);
                String city = rs.getString(10);

                String states = rs.getString(11);
                String zip_code = rs.getString(12);
                String father = rs.getString(13);
                String mother = rs.getString(14);

                String is_baptized = rs.getString(15);
                // <editor-fold defaultstate="collapsed" desc="1">
                if (is_baptized.equals("0")) {
                    is_baptized = "No Record";
                }
                if (is_baptized.equals("1")) {
                    is_baptized = "Waiting 4 App";
                }
                if (is_baptized.equals("2")) {
                    is_baptized = "Not Paid";
                }
                if (is_baptized.equals("3")) {
                    is_baptized = "Waiting 4 Con";
                }
                if (is_baptized.equals("4")) {
                    is_baptized = "OK";
                }
                // </editor-fold>
                String is_comm = rs.getString(16);
                // <editor-fold defaultstate="collapsed" desc="2">
                if (is_comm.equals("0")) {
                    is_comm = "No Record";
                }
                if (is_comm.equals("1")) {
                    is_comm = "Waiting 4 App";
                }
                if (is_comm.equals("2")) {
                    is_comm = "Not Paid";
                }
                if (is_comm.equals("3")) {
                    is_comm = "Waiting 4 Con";
                }
                if (is_comm.equals("4")) {
                    is_comm = "OK";
                }
                // </editor-fold>     
                String is_confirm = rs.getString(17);
                // <editor-fold defaultstate="collapsed" desc="3">
                if (is_confirm.equals("0")) {
                    is_confirm = "No Record";
                }
                if (is_confirm.equals("1")) {
                    is_confirm = "Waiting 4 App";
                }
                if (is_confirm.equals("2")) {
                    is_confirm = "Not Paid";
                }
                if (is_confirm.equals("3")) {
                    is_confirm = "Waiting 4 Con";
                }
                if (is_confirm.equals("4")) {
                    is_confirm = "OK";
                }
                // </editor-fold> 
                String is_married = rs.getString(18);
                // <editor-fold defaultstate="collapsed" desc="4">
                if (is_married.equals("0")) {
                    is_married = "No Record";
                }
                if (is_married.equals("1")) {
                    is_married = "Waiting 4 App";
                }
                if (is_married.equals("2")) {
                    is_married = "Not Paid";
                }
                if (is_married.equals("3")) {
                    is_married = "Waiting 4 Con";
                }
                if (is_married.equals("4")) {
                    is_married = "OK";
                }
                // </editor-fold> 
                String is_2nd_married = rs.getString(19);
                // <editor-fold defaultstate="collapsed" desc="5">
                if (is_2nd_married.equals("0")) {
                    is_2nd_married = "No Record";
                }
                if (is_2nd_married.equals("1")) {
                    is_2nd_married = "Waiting 4 App";
                }
                if (is_2nd_married.equals("2")) {
                    is_2nd_married = "Not Paid";
                }
                if (is_2nd_married.equals("3")) {
                    is_2nd_married = "Waiting 4 Con";
                }
                if (is_2nd_married.equals("4")) {
                    is_2nd_married = "OK";
                }
                // </editor-fold> 
                String is_prof_faith = rs.getString(20);
                // <editor-fold defaultstate="collapsed" desc="6">
                if (is_prof_faith.equals("0")) {
                    is_prof_faith = "No Record";
                }
                if (is_prof_faith.equals("1")) {
                    is_prof_faith = "Waiting 4 App";
                }
                if (is_prof_faith.equals("2")) {
                    is_prof_faith = "Not Paid";
                }
                if (is_prof_faith.equals("3")) {
                    is_prof_faith = "Waiting 4 Con";
                }
                if (is_prof_faith.equals("4")) {
                    is_prof_faith = "OK";
                }
                // </editor-fold> 
                String is_acceptance = rs.getString(21);
                // <editor-fold defaultstate="collapsed" desc="7">
                if (is_acceptance.equals("0")) {
                    is_acceptance = "No Record";
                }
                if (is_acceptance.equals("1")) {
                    is_acceptance = "Waiting 4 App";
                }
                if (is_acceptance.equals("2")) {
                    is_acceptance = "Not Paid";
                }
                if (is_acceptance.equals("3")) {
                    is_acceptance = "Waiting 4 Con";
                }
                if (is_acceptance.equals("4")) {
                    is_acceptance = "OK";
                }
                // </editor-fold> 
                String is_death = rs.getString(22);
                // <editor-fold defaultstate="collapsed" desc="8">
                if (is_death.equals("0")) {
                    is_death = "No Record";
                }
                if (is_death.equals("1")) {
                    is_death = "Waiting 4 App";
                }
                if (is_death.equals("2")) {
                    is_death = "Not Paid";
                }
                if (is_death.equals("3")) {
                    is_death = "Waiting 4 Con";
                }
                if (is_death.equals("4")) {
                    is_death = "OK";
                }
                // </editor-fold> 
                String date_added = rs.getString(23);
                String gender = rs.getString(24);
//                System.out.println(gender + " asdad");
                if (gender.equals("0")) {
                    gender = "Female";

                } else {
                    gender = "Male";
                }
                String bapt_place = rs.getString(25);
                to_parishioners to = new to_parishioners(ref_id, fname, mi, lname, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_place, "", "", "", "", "", "", "", "", "");
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Search by Baptism Date">
    public static List<to_parishioners> ret_data_baptism_date(String date_from, String date_to, String name) {
        List<to_parishioners> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select p.ref_id,p.fname,p.mi,p.lname,p.date_of_baptism"
                    + ",p.date_of_birth,p.place_of_birth,p.address1,p.address2,p.city"
                    + ",p.states,p.zip_code,p.father,p.mother"
                    + ",p.is_baptized,p.is_comm,p.is_confirm,p.is_married,p.is_2nd_married,p.is_prof_faith,p.is_acceptance,p.is_death"
                    + ",p.date_added,p.gender,p.bapt_place from db_bulletin.parishioners_1 p "
                    + "join db_bulletin.baptism2 b on p.ref_id=b.ref_no"
                    + " where concat(p.fname,space(1),p.mi,space(1),p.lname) like '%" + name + "%' "
                    + "and date(b.bapt_date) between '" + date_from + "' and '" + date_to + "' limit 300";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref_id = rs.getString(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String date_of_baptism = rs.getString(5);

                String date_of_birth = rs.getString(6);
                String place_of_birth = rs.getString(7);
                String address1 = rs.getString(8);
                String address2 = rs.getString(9);
                String city = rs.getString(10);

                String states = rs.getString(11);
                String zip_code = rs.getString(12);
                String father = rs.getString(13);
                String mother = rs.getString(14);

                String is_baptized = rs.getString(15);
                // <editor-fold defaultstate="collapsed" desc="1">
                if (is_baptized.equals("0")) {
                    is_baptized = "No Record";
                }
                if (is_baptized.equals("1")) {
                    is_baptized = "Waiting 4 App";
                }
                if (is_baptized.equals("2")) {
                    is_baptized = "Not Paid";
                }
                if (is_baptized.equals("3")) {
                    is_baptized = "Waiting 4 Con";
                }
                if (is_baptized.equals("4")) {
                    is_baptized = "OK";
                }
                // </editor-fold>
                String is_comm = rs.getString(16);
                // <editor-fold defaultstate="collapsed" desc="2">
                if (is_comm.equals("0")) {
                    is_comm = "No Record";
                }
                if (is_comm.equals("1")) {
                    is_comm = "Waiting 4 App";
                }
                if (is_comm.equals("2")) {
                    is_comm = "Not Paid";
                }
                if (is_comm.equals("3")) {
                    is_comm = "Waiting 4 Con";
                }
                if (is_comm.equals("4")) {
                    is_comm = "OK";
                }
                // </editor-fold>     
                String is_confirm = rs.getString(17);
                // <editor-fold defaultstate="collapsed" desc="3">
                if (is_confirm.equals("0")) {
                    is_confirm = "No Record";
                }
                if (is_confirm.equals("1")) {
                    is_confirm = "Waiting 4 App";
                }
                if (is_confirm.equals("2")) {
                    is_confirm = "Not Paid";
                }
                if (is_confirm.equals("3")) {
                    is_confirm = "Waiting 4 Con";
                }
                if (is_confirm.equals("4")) {
                    is_confirm = "OK";
                }
                // </editor-fold> 
                String is_married = rs.getString(18);
                // <editor-fold defaultstate="collapsed" desc="4">
                if (is_married.equals("0")) {
                    is_married = "No Record";
                }
                if (is_married.equals("1")) {
                    is_married = "Waiting 4 App";
                }
                if (is_married.equals("2")) {
                    is_married = "Not Paid";
                }
                if (is_married.equals("3")) {
                    is_married = "Waiting 4 Con";
                }
                if (is_married.equals("4")) {
                    is_married = "OK";
                }
                // </editor-fold> 
                String is_2nd_married = rs.getString(19);
                // <editor-fold defaultstate="collapsed" desc="5">
                if (is_2nd_married.equals("0")) {
                    is_2nd_married = "No Record";
                }
                if (is_2nd_married.equals("1")) {
                    is_2nd_married = "Waiting 4 App";
                }
                if (is_2nd_married.equals("2")) {
                    is_2nd_married = "Not Paid";
                }
                if (is_2nd_married.equals("3")) {
                    is_2nd_married = "Waiting 4 Con";
                }
                if (is_2nd_married.equals("4")) {
                    is_2nd_married = "OK";
                }
                // </editor-fold> 
                String is_prof_faith = rs.getString(20);
                // <editor-fold defaultstate="collapsed" desc="6">
                if (is_prof_faith.equals("0")) {
                    is_prof_faith = "No Record";
                }
                if (is_prof_faith.equals("1")) {
                    is_prof_faith = "Waiting 4 App";
                }
                if (is_prof_faith.equals("2")) {
                    is_prof_faith = "Not Paid";
                }
                if (is_prof_faith.equals("3")) {
                    is_prof_faith = "Waiting 4 Con";
                }
                if (is_prof_faith.equals("4")) {
                    is_prof_faith = "OK";
                }
                // </editor-fold> 
                String is_acceptance = rs.getString(21);
                // <editor-fold defaultstate="collapsed" desc="7">
                if (is_acceptance.equals("0")) {
                    is_acceptance = "No Record";
                }
                if (is_acceptance.equals("1")) {
                    is_acceptance = "Waiting 4 App";
                }
                if (is_acceptance.equals("2")) {
                    is_acceptance = "Not Paid";
                }
                if (is_acceptance.equals("3")) {
                    is_acceptance = "Waiting 4 Con";
                }
                if (is_acceptance.equals("4")) {
                    is_acceptance = "OK";
                }
                // </editor-fold> 
                String is_death = rs.getString(22);
                // <editor-fold defaultstate="collapsed" desc="8">
                if (is_death.equals("0")) {
                    is_death = "No Record";
                }
                if (is_death.equals("1")) {
                    is_death = "Waiting 4 App";
                }
                if (is_death.equals("2")) {
                    is_death = "Not Paid";
                }
                if (is_death.equals("3")) {
                    is_death = "Waiting 4 Con";
                }
                if (is_death.equals("4")) {
                    is_death = "OK";
                }
                // </editor-fold> 
                String date_added = rs.getString(23);
                String gender = rs.getString(24);
//                System.out.println(gender + " asdad");
                if (gender.equals("0")) {
                    gender = "Female";

                } else {
                    gender = "Male";
                }
                String bapt_place = rs.getString(25);
                to_parishioners to = new to_parishioners(ref_id, fname, mi, lname, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_place, "", "", "", "", "", "", "", "", "");
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Search by Baptism Archive">
    public static List<to_parishioners> ret_data_baptism_archive(String years, String book_no, String page_no, String num, String name) {
        List<to_parishioners> datas = new ArrayList();
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select p.ref_id,p.fname,p.mi,p.lname,p.date_of_baptism"
                    + ",p.date_of_birth,p.place_of_birth,p.address1,p.address2,p.city"
                    + ",p.states,p.zip_code,p.father,p.mother"
                    + ",p.is_baptized,p.is_comm,p.is_confirm,p.is_married,p.is_2nd_married,p.is_prof_faith,p.is_acceptance,p.is_death"
                    + ",p.date_added,p.gender,p.bapt_place from db_bulletin.parishioners_1 p "
                    + "join db_bulletin.baptism2 b on p.ref_id=b.ref_no limit 300"
                    + " where  "
                    + " b.years = '" + years + "'   "
                    + " or b.book_no like '%" + book_no + "%'  "
                    + " or b.page_no like '%" + page_no + "%'"
                    + " or b.num like '%" + num + "%'  ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String ref_id = rs.getString(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String date_of_baptism = rs.getString(5);

                String date_of_birth = rs.getString(6);
                String place_of_birth = rs.getString(7);
                String address1 = rs.getString(8);
                String address2 = rs.getString(9);
                String city = rs.getString(10);

                String states = rs.getString(11);
                String zip_code = rs.getString(12);
                String father = rs.getString(13);
                String mother = rs.getString(14);

                String is_baptized = rs.getString(15);
                // <editor-fold defaultstate="collapsed" desc="1">
                if (is_baptized.equals("0")) {
                    is_baptized = "No Record";
                }
                if (is_baptized.equals("1")) {
                    is_baptized = "Waiting 4 App";
                }
                if (is_baptized.equals("2")) {
                    is_baptized = "Not Paid";
                }
                if (is_baptized.equals("3")) {
                    is_baptized = "Waiting 4 Con";
                }
                if (is_baptized.equals("4")) {
                    is_baptized = "OK";
                }
                // </editor-fold>
                String is_comm = rs.getString(16);
                // <editor-fold defaultstate="collapsed" desc="2">
                if (is_comm.equals("0")) {
                    is_comm = "No Record";
                }
                if (is_comm.equals("1")) {
                    is_comm = "Waiting 4 App";
                }
                if (is_comm.equals("2")) {
                    is_comm = "Not Paid";
                }
                if (is_comm.equals("3")) {
                    is_comm = "Waiting 4 Con";
                }
                if (is_comm.equals("4")) {
                    is_comm = "OK";
                }
                // </editor-fold>     
                String is_confirm = rs.getString(17);
                // <editor-fold defaultstate="collapsed" desc="3">
                if (is_confirm.equals("0")) {
                    is_confirm = "No Record";
                }
                if (is_confirm.equals("1")) {
                    is_confirm = "Waiting 4 App";
                }
                if (is_confirm.equals("2")) {
                    is_confirm = "Not Paid";
                }
                if (is_confirm.equals("3")) {
                    is_confirm = "Waiting 4 Con";
                }
                if (is_confirm.equals("4")) {
                    is_confirm = "OK";
                }
                // </editor-fold> 
                String is_married = rs.getString(18);
                // <editor-fold defaultstate="collapsed" desc="4">
                if (is_married.equals("0")) {
                    is_married = "No Record";
                }
                if (is_married.equals("1")) {
                    is_married = "Waiting 4 App";
                }
                if (is_married.equals("2")) {
                    is_married = "Not Paid";
                }
                if (is_married.equals("3")) {
                    is_married = "Waiting 4 Con";
                }
                if (is_married.equals("4")) {
                    is_married = "OK";
                }
                // </editor-fold> 
                String is_2nd_married = rs.getString(19);
                // <editor-fold defaultstate="collapsed" desc="5">
                if (is_2nd_married.equals("0")) {
                    is_2nd_married = "No Record";
                }
                if (is_2nd_married.equals("1")) {
                    is_2nd_married = "Waiting 4 App";
                }
                if (is_2nd_married.equals("2")) {
                    is_2nd_married = "Not Paid";
                }
                if (is_2nd_married.equals("3")) {
                    is_2nd_married = "Waiting 4 Con";
                }
                if (is_2nd_married.equals("4")) {
                    is_2nd_married = "OK";
                }
                // </editor-fold> 
                String is_prof_faith = rs.getString(20);
                // <editor-fold defaultstate="collapsed" desc="6">
                if (is_prof_faith.equals("0")) {
                    is_prof_faith = "No Record";
                }
                if (is_prof_faith.equals("1")) {
                    is_prof_faith = "Waiting 4 App";
                }
                if (is_prof_faith.equals("2")) {
                    is_prof_faith = "Not Paid";
                }
                if (is_prof_faith.equals("3")) {
                    is_prof_faith = "Waiting 4 Con";
                }
                if (is_prof_faith.equals("4")) {
                    is_prof_faith = "OK";
                }
                // </editor-fold> 
                String is_acceptance = rs.getString(21);
                // <editor-fold defaultstate="collapsed" desc="7">
                if (is_acceptance.equals("0")) {
                    is_acceptance = "No Record";
                }
                if (is_acceptance.equals("1")) {
                    is_acceptance = "Waiting 4 App";
                }
                if (is_acceptance.equals("2")) {
                    is_acceptance = "Not Paid";
                }
                if (is_acceptance.equals("3")) {
                    is_acceptance = "Waiting 4 Con";
                }
                if (is_acceptance.equals("4")) {
                    is_acceptance = "OK";
                }
                // </editor-fold> 
                String is_death = rs.getString(22);
                // <editor-fold defaultstate="collapsed" desc="8">
                if (is_death.equals("0")) {
                    is_death = "No Record";
                }
                if (is_death.equals("1")) {
                    is_death = "Waiting 4 App";
                }
                if (is_death.equals("2")) {
                    is_death = "Not Paid";
                }
                if (is_death.equals("3")) {
                    is_death = "Waiting 4 Con";
                }
                if (is_death.equals("4")) {
                    is_death = "OK";
                }
                // </editor-fold> 
                String date_added = rs.getString(23);
                String gender = rs.getString(24);
//                System.out.println(gender + " asdad");
                if (gender.equals("0")) {
                    gender = "Female";

                } else {
                    gender = "Male";
                }
                String bapt_place = rs.getString(25);
                to_parishioners to = new to_parishioners(ref_id, fname, mi, lname, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_place, "date of", "book no", "page no", "index", "date of birth", "bapt place", "address", "father", "mother");
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    // </editor-fold>

    public static void delete_parishioner(String ref_id) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from db_bulletin.parishioners_1 where ref_id='" + ref_id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.baptism2 where ref_no='" + ref_id + "'";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();

            String s2 = "delete from db_bulletin.baptism2_sponsors where ref_no='" + ref_id + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            String s3 = "delete from db_bulletin.baptism2_marr_trib where ref_no='" + ref_id + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();

//            String s4 = "delete from db_bulletin.parishioners_1 where ref_id='" + ref_id + "'";
//            PreparedStatement stmt4 = conn.prepareStatement(s4);
//            stmt4.execute();


            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_parishioner_bap(String ref_id) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update db_bulletin.parishioners_1 set is_baptized='" + "0" + "'where ref_id='" + ref_id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s1 = "delete from db_bulletin.baptism2 where ref_no='" + ref_id + "'";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();

            String s2 = "delete from db_bulletin.baptism2_sponsors where ref_no='" + ref_id + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            String s3 = "delete from db_bulletin.baptism2_marr_trib where ref_no='" + ref_id + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();

//            String s4 = "delete from db_bulletin.parishioners_1 where ref_id='" + ref_id + "'";
//            PreparedStatement stmt4 = conn.prepareStatement(s4);
//            stmt4.execute();


            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
