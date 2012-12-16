/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.popups;

import java.sql.Connection;
import java.sql.PreparedStatement;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;
import overallPOS.modules.share.utils.SqlStringUtil;

/**
 *
 * @author i1
 */
public class S4_marriage {

    public static class to_marriage_1 {

        public final int id;
        public final int g_ref_no;
        public final String g_fname;
        public final String g_mi;
        public final String g_lname;
        public final String g_bday;
        public final String g_place_of_birth;
        public final String g_bapt_date;
        public final String g_bapt_place;
        public final int g_disp_cult;
        public final int g_disp_canonical;
        public final int g_former_marr;
        public final String g_father;
        public final String g_mother;
        public final int b_ref_no;
        public final String b_fname;
        public final String b_mi;
        public final String b_lname;
        public final String b_bday;
        public final String b_place_of_birth;
        public final String b_bapt_date;
        public final String b_bapt_place;
        public final int b_disp_cult;
        public final int b_disp_canonical;
        public final int b_former_marr;
        public final String b_father;
        public final String b_mother;
        public final String book_no;
        public final int page_no;
        public final String marr_date;
        public final String marr_time;
        public final String priest;
        public final String presider;
        public final String remarks;
        public final int status;
        public final String date_added;
        public final int index_no;

        public to_marriage_1(int id, int g_ref_no, String g_fname, String g_mi, String g_lname, String g_bday, String g_place_of_birth, String g_bapt_date, String g_bapt_place, int g_disp_cult, int g_disp_canonical, int g_former_marr, String g_father, String g_mother, int b_ref_no, String b_fname, String b_mi, String b_lname, String b_bday, String b_place_of_birth, String b_bapt_date, String b_bapt_place, int b_disp_cult, int b_disp_canonical, int b_former_marr, String b_father, String b_mother, String book_no, int page_no, String marr_date, String marr_time, String priest, String presider, String remarks, int status, String date_added, int index_no) {
            this.id = id;
            this.g_ref_no = g_ref_no;
            this.g_fname = g_fname;
            this.g_mi = g_mi;
            this.g_lname = g_lname;
            this.g_bday = g_bday;
            this.g_place_of_birth = g_place_of_birth;
            this.g_bapt_date = g_bapt_date;
            this.g_bapt_place = g_bapt_place;
            this.g_disp_cult = g_disp_cult;
            this.g_disp_canonical = g_disp_canonical;
            this.g_former_marr = g_former_marr;
            this.g_father = g_father;
            this.g_mother = g_mother;
            this.b_ref_no = b_ref_no;
            this.b_fname = b_fname;
            this.b_mi = b_mi;
            this.b_lname = b_lname;
            this.b_bday = b_bday;
            this.b_place_of_birth = b_place_of_birth;
            this.b_bapt_date = b_bapt_date;
            this.b_bapt_place = b_bapt_place;
            this.b_disp_cult = b_disp_cult;
            this.b_disp_canonical = b_disp_canonical;
            this.b_former_marr = b_former_marr;
            this.b_father = b_father;
            this.b_mother = b_mother;
            this.book_no = book_no;
            this.page_no = page_no;
            this.marr_date = marr_date;
            this.marr_time = marr_time;
            this.priest = priest;
            this.presider = presider;
            this.remarks = remarks;
            this.status = status;
            this.date_added = date_added;
            this.index_no = index_no;
        }
    }

    public static class to_marriage_1_sponsors {

        public final int id;
        public final int g_ref_no;
        public final int b_ref_no;
        public final String sponsor;

        public to_marriage_1_sponsors(int id, int g_ref_no, int b_ref_no, String sponsor) {
            this.id = id;
            this.g_ref_no = g_ref_no;
            this.b_ref_no = b_ref_no;
            this.sponsor = sponsor;
        }
    }

    public static void add_data(to_marriage_1 to_marriage_1, to_marriage_1_sponsors to_marriage_1_sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into " + "db_bulletin" + ".marriage_1("
                        + "g_ref_no"
                        + ",g_fname"
                        + ",g_mi"
                        + ",g_lname"
                        + ",g_bday"
                        + ",g_place_of_birth"
                        + ",g_bapt_date"
                        + ",g_bapt_place"
                        + ",g_disp_cult"
                        + ",g_disp_canonical"
                        + ",g_former_marr"
                        + ",g_father"
                        + ",g_mother"
                        + ",b_ref_no"
                        + ",b_fname"
                        + ",b_mi"
                        + ",b_lname"
                        + ",b_bday"
                        + ",b_place_of_birth"
                        + ",b_bapt_date"
                        + ",b_bapt_place"
                        + ",b_disp_cult"
                        + ",b_disp_canonical"
                        + ",b_former_marr"
                        + ",b_father"
                        + ",b_mother"
                        + ",book_no"
                        + ",page_no"
                        + ",marr_date"
                        + ",marr_time"
                        + ",priest"
                        + ",presider"
                        + ",remarks"
                        + ",status"
                        + ",date_added"
                        + ",index_no"
                        + ")values("
                        + ":g_ref_no"
                        + ",:g_fname"
                        + ",:g_mi"
                        + ",:g_lname"
                        + ",:g_bday"
                        + ",:g_place_of_birth"
                        + ",:g_bapt_date"
                        + ",:g_bapt_place"
                        + ",:g_disp_cult"
                        + ",:g_disp_canonical"
                        + ",:g_former_marr"
                        + ",:g_father"
                        + ",:g_mother"
                        + ",:b_ref_no"
                        + ",:b_fname"
                        + ",:b_mi"
                        + ",:b_lname"
                        + ",:b_bday"
                        + ",:b_place_of_birth"
                        + ",:b_bapt_date"
                        + ",:b_bapt_place"
                        + ",:b_disp_cult"
                        + ",:b_disp_canonical"
                        + ",:b_former_marr"
                        + ",:b_father"
                        + ",:b_mother"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:marr_date"
                        + ",:marr_time"
                        + ",:priest"
                        + ",:presider"
                        + ",:remarks"
                        + ",:status"
                        + ",:date_added"
                        + ",:index_no"
                        + ")";

            s0 = SqlStringUtil.parse(s0).setNumber("g_ref_no", to_marriage_1.g_ref_no).setString("g_fname", to_marriage_1.g_fname).setString("g_mi", to_marriage_1.g_mi).setString("g_lname", to_marriage_1.g_lname).setString("g_bday", to_marriage_1.g_bday).setString("g_place_of_birth", to_marriage_1.g_place_of_birth).setString("g_bapt_date", to_marriage_1.g_bapt_date).setString("g_bapt_place", to_marriage_1.g_bapt_place).setNumber("g_disp_cult", to_marriage_1.g_disp_cult).setNumber("g_disp_canonical", to_marriage_1.g_disp_canonical).setNumber("g_former_marr", to_marriage_1.g_former_marr).setString("g_father", to_marriage_1.g_father).setString("g_mother", to_marriage_1.g_mother).setNumber("b_ref_no", to_marriage_1.b_ref_no).setString("b_fname", to_marriage_1.b_fname).setString("b_mi", to_marriage_1.b_mi).setString("b_lname", to_marriage_1.b_lname).setString("b_bday", to_marriage_1.b_bday).setString("b_place_of_birth", to_marriage_1.b_place_of_birth).setString("b_bapt_date", to_marriage_1.b_bapt_date).setString("b_bapt_place", to_marriage_1.b_bapt_place).setNumber("b_disp_cult", to_marriage_1.b_disp_cult).setNumber("b_disp_canonical", to_marriage_1.b_disp_canonical).setNumber("b_former_marr", to_marriage_1.b_former_marr).setString("b_father", to_marriage_1.b_father).setString("b_mother", to_marriage_1.b_mother).setString("book_no", to_marriage_1.book_no).setNumber("page_no", to_marriage_1.page_no).setString("marr_date", to_marriage_1.marr_date).setString("marr_time", to_marriage_1.marr_time).setString("priest", to_marriage_1.priest).setString("presider", to_marriage_1.presider).setString("remarks", to_marriage_1.remarks).setNumber("status", to_marriage_1.status).setString("date_added", to_marriage_1.date_added).setNumber("index_no", to_marriage_1.index_no).ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S4_marriage.class, "Successfully Added MARRIAGE");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_married='" + "4" + "'"
                          + ",m_date='" + to_marriage_1.marr_date + "'"
                          + ",m_book_no='" + to_marriage_1.book_no + "'"
                          + ",m_page_no='" + to_marriage_1.page_no + "'"
                          + ",m_index_no='" + to_marriage_1.index_no + "'"
                          + "where ref_id='" + to_marriage_1.g_ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S4_marriage.class, "Successfully updated marriage groom");

            String s0_2 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_married='" + "4" + "'"
                          + ",m_date='" + to_marriage_1.marr_date + "'"
                          + ",m_book_no='" + to_marriage_1.book_no + "'"
                          + ",m_page_no='" + to_marriage_1.page_no + "'"
                          + ",m_index_no='" + to_marriage_1.index_no + "'"
                          + "where ref_id='" + to_marriage_1.b_ref_no + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s0_2);
            stmt3.execute();
            Lg.s(S4_marriage.class, "Successfully updated marriage bride");


            String s4 = "insert into " + "db_bulletin" + ".marriage_1_sponsors("
                        + "g_ref_no"
                        + ",b_ref_no"
                        + ",sponsor"
                        + ")values("
                        + ":g_ref_no"
                        + ",:b_ref_no"
                        + ",:sponsor"
                        + ")";

            s4 = SqlStringUtil.parse(s4).setNumber("g_ref_no", to_marriage_1_sponsors.g_ref_no).setNumber("b_ref_no", to_marriage_1_sponsors.b_ref_no).setString("sponsor", to_marriage_1_sponsors.sponsor).ok();

            PreparedStatement stmt4 = conn.prepareStatement(s4);
            stmt4.execute();
            Lg.s(S4_marriage.class, "Successfully Added sponsor");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_data(to_marriage_1 to_marriage_1, to_marriage_1_sponsors to_marriage_1_sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update " + "db_bulletin" + ".marriage_1 set "
                        + "g_ref_no= '" + to_marriage_1.g_ref_no + "'"
                        + ",g_fname= '" + to_marriage_1.g_fname + "'"
                        + ",g_mi= '" + to_marriage_1.g_mi + "'"
                        + ",g_lname= '" + to_marriage_1.g_lname + "'"
                        + ",g_bday= '" + to_marriage_1.g_bday + "'"
                        + ",g_place_of_birth= '" + to_marriage_1.g_place_of_birth + "'"
                        + ",g_bapt_date= '" + to_marriage_1.g_bapt_date + "'"
                        + ",g_bapt_place= '" + to_marriage_1.g_bapt_place + "'"
                        + ",g_disp_cult= '" + to_marriage_1.g_disp_cult + "'"
                        + ",g_disp_canonical= '" + to_marriage_1.g_disp_canonical + "'"
                        + ",g_former_marr= '" + to_marriage_1.g_former_marr + "'"
                        + ",g_father= '" + to_marriage_1.g_father + "'"
                        + ",g_mother= '" + to_marriage_1.g_mother + "'"
                        + ",b_ref_no= '" + to_marriage_1.b_ref_no + "'"
                        + ",b_fname= '" + to_marriage_1.b_fname + "'"
                        + ",b_mi= '" + to_marriage_1.b_mi + "'"
                        + ",b_lname= '" + to_marriage_1.b_lname + "'"
                        + ",b_bday= '" + to_marriage_1.b_bday + "'"
                        + ",b_place_of_birth= '" + to_marriage_1.b_place_of_birth + "'"
                        + ",b_bapt_date= '" + to_marriage_1.b_bapt_date + "'"
                        + ",b_bapt_place= '" + to_marriage_1.b_bapt_place + "'"
                        + ",b_disp_cult= '" + to_marriage_1.b_disp_cult + "'"
                        + ",b_disp_canonical= '" + to_marriage_1.b_disp_canonical + "'"
                        + ",b_former_marr= '" + to_marriage_1.b_former_marr + "'"
                        + ",b_father= '" + to_marriage_1.b_father + "'"
                        + ",b_mother= '" + to_marriage_1.b_mother + "'"
                        + ",book_no= '" + to_marriage_1.book_no + "'"
                        + ",page_no= '" + to_marriage_1.page_no + "'"
                        + ",marr_date= '" + to_marriage_1.marr_date + "'"
                        + ",marr_time= '" + to_marriage_1.marr_time + "'"
                        + ",priest= '" + to_marriage_1.priest + "'"
                        + ",presider= '" + to_marriage_1.presider + "'"
                        + ",remarks= '" + to_marriage_1.remarks + "'"
                        + ",status= '" + to_marriage_1.status + "'"
                        + ",date_added= '" + to_marriage_1.date_added + "'"
                        + ",index_no= '" + to_marriage_1.index_no + "'"
                        + "where "
                        + " g_ref_no ='" + to_marriage_1.g_ref_no + "' "
                        + " and b_ref_no ='" + to_marriage_1.b_ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S4_marriage.class, "Successfully Updated marriage");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_married='" + "4" + "'"
                          + ",m_date='" + to_marriage_1.marr_date + "'"
                          + ",m_book_no='" + to_marriage_1.book_no + "'"
                          + ",m_page_no='" + to_marriage_1.page_no + "'"
                          + ",m_index_no='" + to_marriage_1.index_no + "'"
                          + "where ref_id='" + to_marriage_1.g_ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S4_marriage.class, "Successfully updated marriage groom");

            String s0_2 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_married='" + "4" + "'"
                          + ",m_date='" + to_marriage_1.marr_date + "'"
                          + ",m_book_no='" + to_marriage_1.book_no + "'"
                          + ",m_page_no='" + to_marriage_1.page_no + "'"
                          + ",m_index_no='" + to_marriage_1.index_no + "'"
                          + "where ref_id='" + to_marriage_1.b_ref_no + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s0_2);
            stmt3.execute();
            Lg.s(S4_marriage.class, "Successfully updated marriage bride");

            String s5 = "update " + "db_bulletin" + ".marriage_1_sponsors set "
                        + "sponsor= '" + to_marriage_1_sponsors.sponsor + "'"
                        + "where "
                        + " g_ref_no ='" + to_marriage_1_sponsors.g_ref_no + "' "
                        + " and b_ref_no ='" + to_marriage_1_sponsors.b_ref_no + "' "
                        + " ";

            PreparedStatement stmt5 = conn.prepareStatement(s5);
            stmt5.execute();
            Lg.s(S4_marriage.class, "Successfully Updated sponsors");



        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_data(to_marriage_1 to_marriage_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from " + "db_bulletin" + ".marriage_1 where "
                        + " g_ref_no ='" + to_marriage_1.g_ref_no + "' "
                        + " and b_ref_no ='" + to_marriage_1.b_ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S4_marriage.class, "Successfully Deleted marriage");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_married='" + "0" + "'"
                          + ",m_date='" + "1500-01-01" + "'"
                          + ",m_book_no='" + "0" + "'"
                          + ",m_page_no='" + "0" + "'"
                          + ",m_index_no='" + "0" + "'"
                          + "where ref_id='" + to_marriage_1.g_ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S4_marriage.class, "Successfully updated marriage groom");

            String s0_2 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_married='" + "4" + "'"
                          + ",m_date='" + "1500-01-01" + "'"
                          + ",m_book_no='" + "0" + "'"
                          + ",m_page_no='" + "0" + "'"
                          + ",m_index_no='" + "0" + "'"
                          + "where ref_id='" + to_marriage_1.b_ref_no + "'";
            PreparedStatement stmt3 = conn.prepareStatement(s0_2);
            stmt3.execute();
            Lg.s(S4_marriage.class, "Successfully updated marriage bride");


            String s5 = "delete from " + "db_bulletin" + ".marriage_1_sponsors where "
                        + " g_ref_no ='" + to_marriage_1.g_ref_no + "' "
                        + " and b_ref_no ='" + to_marriage_1.b_ref_no + "' "
                        + " ";

            PreparedStatement stmt5 = conn.prepareStatement(s5);
            stmt5.execute();
            Lg.s(S4_marriage.class, "Successfully Deleted sponsors");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
    
    
}
