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
public class S5_funeral {

    public static class to_funeral_1 {

        public final int id;
        public final int ref_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String bday;
        public final String place_of_birth;
        public final String bapt_date;
        public final String bapt_place;
        public final String father;
        public final String mother;
        public final String funeral_date;
        public final String funeral_time;
        public final String priest;
        public final String wife_husband;
        public final int w_ref_no;
        public final String sac_of_annointing;
        public final String presider;
        public final String remarks;
        public final String book_no;
        public final int page_no;
        public final int status;
        public final String date_added;
        public final String date_died;
        public final String place_buried;
        public final String cause_of_death;
        public final int index_no;

        public to_funeral_1(int id, int ref_no, String fname, String mi, String lname, String bday, String place_of_birth, String bapt_date, String bapt_place, String father, String mother, String funeral_date, String funeral_time, String priest, String wife_husband, int w_ref_no, String sac_of_annointing, String presider, String remarks, String book_no, int page_no, int status, String date_added, String date_died, String place_buried, String cause_of_death, int index_no) {
            this.id = id;
            this.ref_no = ref_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.bday = bday;
            this.place_of_birth = place_of_birth;
            this.bapt_date = bapt_date;
            this.bapt_place = bapt_place;
            this.father = father;
            this.mother = mother;
            this.funeral_date = funeral_date;
            this.funeral_time = funeral_time;
            this.priest = priest;
            this.wife_husband = wife_husband;
            this.w_ref_no = w_ref_no;
            this.sac_of_annointing = sac_of_annointing;
            this.presider = presider;
            this.remarks = remarks;
            this.book_no = book_no;
            this.page_no = page_no;
            this.status = status;
            this.date_added = date_added;
            this.date_died = date_died;
            this.place_buried = place_buried;
            this.cause_of_death = cause_of_death;
            this.index_no = index_no;
        }
    }

    public static void add_data(to_funeral_1 to_funeral_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into " + "db_bulletin" + ".funeral_1("
                        + "ref_no"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",bday"
                        + ",place_of_birth"
                        + ",bapt_date"
                        + ",bapt_place"
                        + ",father"
                        + ",mother"
                        + ",funeral_date"
                        + ",funeral_time"
                        + ",priest"
                        + ",wife_husband"
                        + ",w_ref_no"
                        + ",sac_of_annointing"
                        + ",presider"
                        + ",remarks"
                        + ",book_no"
                        + ",page_no"
                        + ",status"
                        + ",date_added"
                        + ",date_died"
                        + ",place_buried"
                        + ",cause_of_death"
                        + ",index_no"
                        + ")values("
                        + ":ref_no"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:bday"
                        + ",:place_of_birth"
                        + ",:bapt_date"
                        + ",:bapt_place"
                        + ",:father"
                        + ",:mother"
                        + ",:funeral_date"
                        + ",:funeral_time"
                        + ",:priest"
                        + ",:wife_husband"
                        + ",:w_ref_no"
                        + ",:sac_of_annointing"
                        + ",:presider"
                        + ",:remarks"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:status"
                        + ",:date_added"
                        + ",:date_died"
                        + ",:place_buried"
                        + ",:cause_of_death"
                        + ",:index_no"
                        + ")";

            s0 = SqlStringUtil.parse(s0).setNumber("ref_no", to_funeral_1.ref_no).setString("fname", to_funeral_1.fname).setString("mi", to_funeral_1.mi).setString("lname", to_funeral_1.lname).setString("bday", to_funeral_1.bday).setString("place_of_birth", to_funeral_1.place_of_birth).setString("bapt_date", to_funeral_1.bapt_date).setString("bapt_place", to_funeral_1.bapt_place).setString("father", to_funeral_1.father).setString("mother", to_funeral_1.mother).setString("funeral_date", to_funeral_1.funeral_date).setString("funeral_time", to_funeral_1.funeral_time).setString("priest", to_funeral_1.priest).setString("wife_husband", to_funeral_1.wife_husband).setNumber("w_ref_no", to_funeral_1.w_ref_no).setString("sac_of_annointing", to_funeral_1.sac_of_annointing).setString("presider", to_funeral_1.presider).setString("remarks", to_funeral_1.remarks).setString("book_no", to_funeral_1.book_no).setNumber("page_no", to_funeral_1.page_no).setNumber("status", to_funeral_1.status).setString("date_added", to_funeral_1.date_added).setString("date_died", to_funeral_1.date_died).setString("place_buried", to_funeral_1.place_buried).setString("cause_of_death", to_funeral_1.cause_of_death).setNumber("index_no", to_funeral_1.index_no).ok();
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S5_funeral.class, "Successfully Added funeral");

            if (to_funeral_1.w_ref_no != 0) {
                String s0_1 = "update db_bulletin.parishioners_1 "
                              + "set "
                              + "is_death='" + "4" + "'"
                              + ",f_date='" + to_funeral_1.funeral_date + "'"
                              + ",f_book_no='" + to_funeral_1.book_no + "'"
                              + ",f_page_no='" + to_funeral_1.page_no + "'"
                              + ",f_index_no='" + to_funeral_1.index_no + "'"
                              + "where ref_id='" + to_funeral_1.w_ref_no + "'";
                PreparedStatement stmt2 = conn.prepareStatement(s0_1);
                stmt2.execute();
                Lg.s(S5_funeral.class, "Successfully updated parishioner death");
            }
            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_death='" + "4" + "'"
                          + ",f_date='" + to_funeral_1.funeral_date + "'"
                          + ",f_book_no='" + to_funeral_1.book_no + "'"
                          + ",f_page_no='" + to_funeral_1.page_no + "'"
                          + ",f_index_no='" + to_funeral_1.index_no + "'"
                          + "where ref_id='" + to_funeral_1.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S5_funeral.class, "Successfully updated parishioner death");



        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_data(to_funeral_1 to_funeral_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update " + "db_bulletin" + ".funeral_1 set "
                        + "ref_no= '" + to_funeral_1.ref_no + "'"
                        + ",fname= '" + to_funeral_1.fname + "'"
                        + ",mi= '" + to_funeral_1.mi + "'"
                        + ",lname= '" + to_funeral_1.lname + "'"
                        + ",bday= '" + to_funeral_1.bday + "'"
                        + ",place_of_birth= '" + to_funeral_1.place_of_birth + "'"
                        + ",bapt_date= '" + to_funeral_1.bapt_date + "'"
                        + ",bapt_place= '" + to_funeral_1.bapt_place + "'"
                        + ",father= '" + to_funeral_1.father + "'"
                        + ",mother= '" + to_funeral_1.mother + "'"
                        + ",funeral_date= '" + to_funeral_1.funeral_date + "'"
                        + ",funeral_time= '" + to_funeral_1.funeral_time + "'"
                        + ",priest= '" + to_funeral_1.priest + "'"
                        + ",wife_husband= '" + to_funeral_1.wife_husband + "'"
                        + ",w_ref_no= '" + to_funeral_1.w_ref_no + "'"
                        + ",sac_of_annointing= '" + to_funeral_1.sac_of_annointing + "'"
                        + ",presider= '" + to_funeral_1.presider + "'"
                        + ",remarks= '" + to_funeral_1.remarks + "'"
                        + ",book_no= '" + to_funeral_1.book_no + "'"
                        + ",page_no= '" + to_funeral_1.page_no + "'"
                        + ",status= '" + to_funeral_1.status + "'"
                        + ",date_added= '" + to_funeral_1.date_added + "'"
                        + ",date_died= '" + to_funeral_1.date_died + "'"
                        + ",place_buried= '" + to_funeral_1.place_buried + "'"
                        + ",cause_of_death= '" + to_funeral_1.cause_of_death + "'"
                        + ",index_no= '" + to_funeral_1.index_no + "'"
                        + "where "
                        + " ref_no ='" + to_funeral_1.ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S5_funeral.class, "Successfully Updated funeral");

            if (to_funeral_1.w_ref_no != 0) {
                String s0_1 = "update db_bulletin.parishioners_1 "
                              + "set "
                              + "is_death='" + "4" + "'"
                              + ",f_date='" + to_funeral_1.funeral_date + "'"
                              + ",f_book_no='" + to_funeral_1.book_no + "'"
                              + ",f_page_no='" + to_funeral_1.page_no + "'"
                              + ",f_index_no='" + to_funeral_1.index_no + "'"
                              + "where ref_id='" + to_funeral_1.w_ref_no + "'";
                PreparedStatement stmt2 = conn.prepareStatement(s0_1);
                stmt2.execute();
                Lg.s(S5_funeral.class, "Successfully updated parishioner death");
            }

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_death='" + "4" + "'"
                          + ",f_date='" + to_funeral_1.funeral_date + "'"
                          + ",f_book_no='" + to_funeral_1.book_no + "'"
                          + ",f_page_no='" + to_funeral_1.page_no + "'"
                          + ",f_index_no='" + to_funeral_1.index_no + "'"
                          + "where ref_id='" + to_funeral_1.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S5_funeral.class, "Successfully updated parishioner death");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_data(to_funeral_1 to_funeral_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from " + "db_bulletin" + ".funeral_1 where "
                        + " ref_no ='" + to_funeral_1.ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S5_funeral.class, "Successfully Deleted");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_death='" + "0" + "'"
                          + ",f_date='" + "1500-01-01" + "'"
                          + ",f_book_no='" + "0" + "'"
                          + ",f_page_no='" + "0" + "'"
                          + ",f_index_no='" + "0" + "'"
                          + "where ref_id='" + to_funeral_1.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S5_funeral.class, "Successfully updated parishioner death");

            if (to_funeral_1.w_ref_no != 0) {
                String s0_2 = "update db_bulletin.parishioners_1 "
                              + "set "
                              + "is_death='" + "0" + "'"
                              + ",f_date='" + "1500-01-01" + "'"
                              + ",f_book_no='" + "0" + "'"
                              + ",f_page_no='" + "0" + "'"
                              + ",f_index_no='" + "0" + "'"
                              + "where ref_id='" + to_funeral_1.w_ref_no + "'";
                PreparedStatement stmt3 = conn.prepareStatement(s0_2);
                stmt3.execute();
                Lg.s(S5_funeral.class, "Successfully updated parishioner death");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
