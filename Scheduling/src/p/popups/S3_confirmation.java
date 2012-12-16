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
public class S3_confirmation {

    public static class to_confirmation_1 {

        public final int id;
        public final int ref_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String bday;
        public final String place_of_birth;
        public final String bapt_date;
        public final String bapt_place;
        public final String book_no;
        public final int page_no;
        public final String conf_date;
        public final String conf_time;
        public final String priest;
        public final String presider;
        public final String remarks;
        public final int status;
        public final String date_added;
        public final String father;
        public final String mother;
        public final int index_no;

        public to_confirmation_1(int id, int ref_no, String fname, String mi, String lname, String bday, String place_of_birth, String bapt_date, String bapt_place, String book_no, int page_no, String conf_date, String conf_time, String priest, String presider, String remarks, int status, String date_added, String father, String mother, int index_no) {
            this.id = id;
            this.ref_no = ref_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.bday = bday;
            this.place_of_birth = place_of_birth;
            this.bapt_date = bapt_date;
            this.bapt_place = bapt_place;
            this.book_no = book_no;
            this.page_no = page_no;
            this.conf_date = conf_date;
            this.conf_time = conf_time;
            this.priest = priest;
            this.presider = presider;
            this.remarks = remarks;
            this.status = status;
            this.date_added = date_added;
            this.father = father;
            this.mother = mother;
            this.index_no = index_no;
        }
    }

    public static class to_confirmation_1_sponsors {

        public final int id;
        public final int ref_no;
        public final String sponsor;

        public to_confirmation_1_sponsors(int id, int ref_no, String sponsor) {
            this.id = id;
            this.ref_no = ref_no;
            this.sponsor = sponsor;
        }
    }

    public static void add_data(to_confirmation_1 to_confirmation_1, to_confirmation_1_sponsors to_confirmation_1_sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into " + "db_bulletin" + ".confirmation_1("
                        + "ref_no"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",bday"
                        + ",place_of_birth"
                        + ",bapt_date"
                        + ",bapt_place"
                        + ",book_no"
                        + ",page_no"
                        + ",conf_date"
                        + ",conf_time"
                        + ",priest"
                        + ",presider"
                        + ",remarks"
                        + ",status"
                        + ",date_added"
                        + ",father"
                        + ",mother"
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
                        + ",:book_no"
                        + ",:page_no"
                        + ",:conf_date"
                        + ",:conf_time"
                        + ",:priest"
                        + ",:presider"
                        + ",:remarks"
                        + ",:status"
                        + ",:date_added"
                        + ",:father"
                        + ",:mother"
                        + ",:index_no"
                        + ")";

            s0 = SqlStringUtil.parse(s0).setNumber("ref_no", to_confirmation_1.ref_no).setString("fname", to_confirmation_1.fname).setString("mi", to_confirmation_1.mi).setString("lname", to_confirmation_1.lname).setString("bday", to_confirmation_1.bday).setString("place_of_birth", to_confirmation_1.place_of_birth).setString("bapt_date", to_confirmation_1.bapt_date).setString("bapt_place", to_confirmation_1.bapt_place).setString("book_no", to_confirmation_1.book_no).setNumber("page_no", to_confirmation_1.page_no).setString("conf_date", to_confirmation_1.conf_date).setString("conf_time", to_confirmation_1.conf_time).setString("priest", to_confirmation_1.priest).setString("presider", to_confirmation_1.presider).setString("remarks", to_confirmation_1.remarks).setNumber("status", to_confirmation_1.status).setString("date_added", to_confirmation_1.date_added).setString("father", to_confirmation_1.father).setString("mother", to_confirmation_1.mother).setNumber("index_no", to_confirmation_1.index_no).ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S3_confirmation.class, "Successfully Added");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_confirm='" + "4" + "'"
                          + ",c_date='" + to_confirmation_1.conf_date + "'"
                          + ",c_book_no='" + to_confirmation_1.book_no + "'"
                          + ",c_page_no='" + to_confirmation_1.page_no + "'"
                          + ",c_index_no='" + to_confirmation_1.index_no + "'"
                          + "where ref_id='" + to_confirmation_1.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S2_baptism.class, "Successfully updated confirmation");



            String s2 = "insert into " + "db_bulletin" + ".confirmation_1_sponsors("
                        + "ref_no"
                        + ",sponsor"
                        + ")values("
                        + ":ref_no"
                        + ",:sponsor"
                        + ")";
            s2 = SqlStringUtil.parse(s2).setNumber("ref_no", to_confirmation_1_sponsors.ref_no).setString("sponsor", to_confirmation_1_sponsors.sponsor).ok();
            PreparedStatement stmt3 = conn.prepareStatement(s2);
            stmt3.execute();
            Lg.s(S3_confirmation.class, "Successfully updated conf sponsor");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_data(to_confirmation_1 to_confirmation_1, to_confirmation_1_sponsors to_confirmation_1_sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update " + "db_bulletin" + ".confirmation_1 set "
                        + "ref_no= '" + to_confirmation_1.ref_no + "'"
                        + ",fname= '" + to_confirmation_1.fname + "'"
                        + ",mi= '" + to_confirmation_1.mi + "'"
                        + ",lname= '" + to_confirmation_1.lname + "'"
                        + ",bday= '" + to_confirmation_1.bday + "'"
                        + ",place_of_birth= '" + to_confirmation_1.place_of_birth + "'"
                        + ",bapt_date= '" + to_confirmation_1.bapt_date + "'"
                        + ",bapt_place= '" + to_confirmation_1.bapt_place + "'"
                        + ",book_no= '" + to_confirmation_1.book_no + "'"
                        + ",page_no= '" + to_confirmation_1.page_no + "'"
                        + ",conf_date= '" + to_confirmation_1.conf_date + "'"
                        + ",conf_time= '" + to_confirmation_1.conf_time + "'"
                        + ",priest= '" + to_confirmation_1.priest + "'"
                        + ",presider= '" + to_confirmation_1.presider + "'"
                        + ",remarks= '" + to_confirmation_1.remarks + "'"
                        + ",status= '" + to_confirmation_1.status + "'"
                        + ",date_added= '" + to_confirmation_1.date_added + "'"
                        + ",father= '" + to_confirmation_1.father + "'"
                        + ",mother= '" + to_confirmation_1.mother + "'"
                        + ",index_no= '" + to_confirmation_1.index_no + "'"
                        + "where "
                        + " ref_no ='" + to_confirmation_1.ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S3_confirmation.class, "Successfully Updated conf");


            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_confirm='" + "4" + "'"
                          + ",c_date='" + to_confirmation_1.conf_date + "'"
                          + ",c_book_no='" + to_confirmation_1.book_no + "'"
                          + ",c_page_no='" + to_confirmation_1.page_no + "'"
                          + ",c_index_no='" + to_confirmation_1.index_no + "'"
                          + "where ref_id='" + to_confirmation_1.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S3_confirmation.class, "Successfully updated confirmation");

            String s3 = "update " + "db_bulletin" + ".confirmation_1_sponsors set "
                        + "ref_no= '" + to_confirmation_1_sponsors.ref_no + "'"
                        + ",sponsor= '" + to_confirmation_1_sponsors.sponsor + "'"
                        + "where "
                        + " ref_no ='" + to_confirmation_1_sponsors.ref_no + "' "
                        + " ";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();
            Lg.s(S3_confirmation.class, "Successfully Updated sponsor");


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_data(to_confirmation_1 to_confirmation_1) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from " + "db_bulletin" + ".confirmation_1 where "
                        + " ref_no ='" + to_confirmation_1.ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S3_confirmation.class, "Successfully Deleted confirmation");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_confirm='" + "0" + "'"
                          + ",c_date='" + "1500-01-01" + "'"
                          + ",c_book_no='" + "0" + "'"
                          + ",c_page_no='" + "0" + "'"
                          + ",c_index_no='" + "0" + "'"
                          + " where ref_id='" + to_confirmation_1.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S2_baptism.class, "Successfully updated parishioner");

            String s3 = "delete from " + "db_bulletin" + ".confirmation_1_sponsors where "
                        + " ref_no ='" + to_confirmation_1.ref_no + "' "
                        + " ";
            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();
            Lg.s(S2_baptism.class, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
