/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.popups;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;
import overallPOS.modules.share.utils.ReceiptIncrementor;
import overallPOS.modules.share.utils.SqlStringUtil;

/**
 *
 * @author i1
 */
public class S1_parishioners {

    public static class to_parishioners_1 {

        public final int id;
        public final int ref_id;
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
        public final int is_baptized;
        public final int is_comm;
        public final int is_confirm;
        public final int is_married;
        public final int is_2nd_married;
        public final int is_prof_faith;
        public final int is_acceptance;
        public final int is_death;
        public final String date_added;
        public final int gender;
        public final String bapt_place;
        public final String b_date;
        public final String b_book_no;
        public final int b_page_no;
        public final int b_index_no;
        public final String c_date;
        public final String c_book_no;
        public final int c_page_no;
        public final int c_index_no;
        public final String m_date;
        public final String m_book_no;
        public final int m_page_no;
        public final int m_index_no;
        public final String f_date;
        public final String f_book_no;
        public final int f_page_no;
        public final int f_index_no;

        public to_parishioners_1(int id, int ref_id, String fname, String mi, String lname, String date_of_baptism, String date_of_birth, String place_of_birth, String address1, String address2, String city, String states, String zip_code, String father, String mother, int is_baptized, int is_comm, int is_confirm, int is_married, int is_2nd_married, int is_prof_faith, int is_acceptance, int is_death, String date_added, int gender, String bapt_place, String b_date, String b_book_no, int b_page_no, int b_index_no, String c_date, String c_book_no, int c_page_no, int c_index_no, String m_date, String m_book_no, int m_page_no, int m_index_no, String f_date, String f_book_no, int f_page_no, int f_index_no) {
            this.id = id;
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
            this.b_date = b_date;
            this.b_book_no = b_book_no;
            this.b_page_no = b_page_no;
            this.b_index_no = b_index_no;
            this.c_date = c_date;
            this.c_book_no = c_book_no;
            this.c_page_no = c_page_no;
            this.c_index_no = c_index_no;
            this.m_date = m_date;
            this.m_book_no = m_book_no;
            this.m_page_no = m_page_no;
            this.m_index_no = m_index_no;
            this.f_date = f_date;
            this.f_book_no = f_book_no;
            this.f_page_no = f_page_no;
            this.f_index_no = f_index_no;
        }
    }

    public static String increment_id() {
        String id = "0";
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(id) from " + "db_bulletin" + ".parishioners_1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void add_data(to_parishioners_1 to_parishioners_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into " + "db_bulletin" + ".parishioners_1("
                        + "ref_id"
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
                        + ",is_baptized"
                        + ",is_comm"
                        + ",is_confirm"
                        + ",is_married"
                        + ",is_2nd_married"
                        + ",is_prof_faith"
                        + ",is_acceptance"
                        + ",is_death"
                        + ",date_added"
                        + ",gender"
                        + ",bapt_place"
                        + ",b_date"
                        + ",b_book_no"
                        + ",b_page_no"
                        + ",b_index_no"
                        + ",c_date"
                        + ",c_book_no"
                        + ",c_page_no"
                        + ",c_index_no"
                        + ",m_date"
                        + ",m_book_no"
                        + ",m_page_no"
                        + ",m_index_no"
                        + ",f_date"
                        + ",f_book_no"
                        + ",f_page_no"
                        + ",f_index_no"
                        + ")values("
                        + ":ref_id"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:date_of_baptism"
                        + ",:date_of_birth"
                        + ",:place_of_birth"
                        + ",:address1"
                        + ",:address2"
                        + ",:city"
                        + ",:states"
                        + ",:zip_code"
                        + ",:father"
                        + ",:mother"
                        + ",:is_baptized"
                        + ",:is_comm"
                        + ",:is_confirm"
                        + ",:is_married"
                        + ",:is_2nd_married"
                        + ",:is_prof_faith"
                        + ",:is_acceptance"
                        + ",:is_death"
                        + ",:date_added"
                        + ",:gender"
                        + ",:bapt_place"
                        + ",:b_date"
                        + ",:b_book_no"
                        + ",:b_page_no"
                        + ",:b_index_no"
                        + ",:c_date"
                        + ",:c_book_no"
                        + ",:c_page_no"
                        + ",:c_index_no"
                        + ",:m_date"
                        + ",:m_book_no"
                        + ",:m_page_no"
                        + ",:m_index_no"
                        + ",:f_date"
                        + ",:f_book_no"
                        + ",:f_page_no"
                        + ",:f_index_no"
                        + ")";

            s0 = SqlStringUtil.parse(s0).setNumber("ref_id", to_parishioners_1.ref_id).setString("fname", to_parishioners_1.fname).setString("mi", to_parishioners_1.mi).setString("lname", to_parishioners_1.lname).setString("date_of_baptism", to_parishioners_1.date_of_baptism).setString("date_of_birth", to_parishioners_1.date_of_birth).setString("place_of_birth", to_parishioners_1.place_of_birth).setString("address1", to_parishioners_1.address1).setString("address2", to_parishioners_1.address2).setString("city", to_parishioners_1.city).setString("states", to_parishioners_1.states).setString("zip_code", to_parishioners_1.zip_code).setString("father", to_parishioners_1.father).setString("mother", to_parishioners_1.mother).setNumber("is_baptized", to_parishioners_1.is_baptized).setNumber("is_comm", to_parishioners_1.is_comm).setNumber("is_confirm", to_parishioners_1.is_confirm).setNumber("is_married", to_parishioners_1.is_married).setNumber("is_2nd_married", to_parishioners_1.is_2nd_married).setNumber("is_prof_faith", to_parishioners_1.is_prof_faith).setNumber("is_acceptance", to_parishioners_1.is_acceptance).setNumber("is_death", to_parishioners_1.is_death).setString("date_added", to_parishioners_1.date_added).setNumber("gender", to_parishioners_1.gender).setString("bapt_place", to_parishioners_1.bapt_place).setString("b_date", to_parishioners_1.b_date).setString("b_book_no", to_parishioners_1.b_book_no).setNumber("b_page_no", to_parishioners_1.b_page_no).setNumber("b_index_no", to_parishioners_1.b_index_no).setString("c_date", to_parishioners_1.c_date).setString("c_book_no", to_parishioners_1.c_book_no).setNumber("c_page_no", to_parishioners_1.c_page_no).setNumber("c_index_no", to_parishioners_1.c_index_no).setString("m_date", to_parishioners_1.m_date).setString("m_book_no", to_parishioners_1.m_book_no).setNumber("m_page_no", to_parishioners_1.m_page_no).setNumber("m_index_no", to_parishioners_1.m_index_no).setString("f_date", to_parishioners_1.f_date).setString("f_book_no", to_parishioners_1.f_book_no).setNumber("f_page_no", to_parishioners_1.f_page_no).setNumber("f_index_no", to_parishioners_1.f_index_no).ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_parishioners.class, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_data(to_parishioners_1 to_parishioners_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update " + "db_bulletin" + ".parishioners_1 set "
                        + "ref_id= '" + to_parishioners_1.ref_id + "'"
                        + ",fname= '" + to_parishioners_1.fname + "'"
                        + ",mi= '" + to_parishioners_1.mi + "'"
                        + ",lname= '" + to_parishioners_1.lname + "'"
                        + ",date_of_birth= '" + to_parishioners_1.date_of_birth + "'"
                        + ",place_of_birth= '" + to_parishioners_1.place_of_birth + "'"
                        + ",address1= '" + to_parishioners_1.address1 + "'"
                        + ",address2= '" + to_parishioners_1.address2 + "'"
                        + ",city= '" + to_parishioners_1.city + "'"
                        + ",states= '" + to_parishioners_1.states + "'"
                        + ",zip_code= '" + to_parishioners_1.zip_code + "'"
                        + ",father= '" + to_parishioners_1.father + "'"
                        + ",mother= '" + to_parishioners_1.mother + "'"
                        + ",gender= '" + to_parishioners_1.gender + "'"
                        + "where "
                        + " ref_id ='" + to_parishioners_1.ref_id + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_parishioners.class, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_data(to_parishioners_1 to_parishioners_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from " + "db_bulletin" + ".parishioners_1 where "
                        + " ref_id ='" + to_parishioners_1.ref_id + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_parishioners.class, "Successfully Deleted parishioners");

            String s1 = "delete from " + "db_bulletin" + ".baptism2 where "
                        + " ref_no ='" + to_parishioners_1.ref_id + "' "
                        + " ";
            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();
            Lg.s(S1_parishioners.class, "Successfully Deleted baptism");

            String s2 = "delete from " + "db_bulletin" + ".confirmation_1 where "
                        + " ref_no ='" + to_parishioners_1.ref_id + "' "
                        + " ";
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(S1_parishioners.class, "Successfully Deleted confirmation");


            String s3 = "delete from " + "db_bulletin" + ".marriage_1 where "
                        + " g_ref_no ='" + to_parishioners_1.ref_id + "' "
                        + " or b_ref_no ='" + to_parishioners_1.ref_id + "' "
                        + " ";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();
            Lg.s(S1_parishioners.class, "Successfully Deleted marriage");

            String s4 = "delete from " + "db_bulletin" + ".funeral_1 where "
                        + " ref_no ='" + to_parishioners_1.ref_id + "' "
                        + " ";

            PreparedStatement stmt4 = conn.prepareStatement(s4);
            stmt4.execute();
            Lg.s(S1_parishioners.class, "Successfully Deleted funeral");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
