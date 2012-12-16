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
public class S2_baptism {

    public static class to_baptism2 {

        public final int id;
        public final int ref_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String date_of_birth;
        public final String place_of_birth;
        public final String father;
        public final String mother;
        public final String godfather;
        public final String p_godfather;
        public final String godmother;
        public final String p_godmother;
        public final String presider;
        public final String bapt_date;
        public final String bapt_time;
        public final String bapt_church;
        public final String priest;
        public final String book_no;
        public final int page_no;
        public final String f_comm_date;
        public final String f_comm_church;
        public final String f_conf_date;
        public final String f_conf_church;
        public final int is_diaconate;
        public final String diconate_date;
        public final int is_religious_prof;
        public final String religious_prof_date;
        public final String remarks;
        public final int status;
        public final String years;
        public final int num;

        public to_baptism2(int id, int ref_no, String fname, String mi, String lname, String date_of_birth, String place_of_birth, String father, String mother, String godfather, String p_godfather, String godmother, String p_godmother, String presider, String bapt_date, String bapt_time, String bapt_church, String priest, String book_no, int page_no, String f_comm_date, String f_comm_church, String f_conf_date, String f_conf_church, int is_diaconate, String diconate_date, int is_religious_prof, String religious_prof_date, String remarks, int status, String years, int num) {
            this.id = id;
            this.ref_no = ref_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.date_of_birth = date_of_birth;
            this.place_of_birth = place_of_birth;
            this.father = father;
            this.mother = mother;
            this.godfather = godfather;
            this.p_godfather = p_godfather;
            this.godmother = godmother;
            this.p_godmother = p_godmother;
            this.presider = presider;
            this.bapt_date = bapt_date;
            this.bapt_time = bapt_time;
            this.bapt_church = bapt_church;
            this.priest = priest;
            this.book_no = book_no;
            this.page_no = page_no;
            this.f_comm_date = f_comm_date;
            this.f_comm_church = f_comm_church;
            this.f_conf_date = f_conf_date;
            this.f_conf_church = f_conf_church;
            this.is_diaconate = is_diaconate;
            this.diconate_date = diconate_date;
            this.is_religious_prof = is_religious_prof;
            this.religious_prof_date = religious_prof_date;
            this.remarks = remarks;
            this.status = status;
            this.years = years;
            this.num = num;
        }
    }

    public static class to_baptism2_sponsors {

        public final int id;
        public final int ref_no;
        public final String sponsor;

        public to_baptism2_sponsors(int id, int ref_no, String sponsor) {
            this.id = id;
            this.ref_no = ref_no;
            this.sponsor = sponsor;
        }
    }

    public static void add_data(to_baptism2 to_baptism2, to_baptism2_sponsors to_baptism2_sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "insert into " + "db_bulletin" + ".baptism2("
                        + "ref_no"
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
                        + ",priest"
                        + ",book_no"
                        + ",page_no"
                        + ",f_comm_date"
                        + ",f_comm_church"
                        + ",f_conf_date"
                        + ",f_conf_church"
                        + ",is_diaconate"
                        + ",diconate_date"
                        + ",is_religious_prof"
                        + ",religious_prof_date"
                        + ",remarks"
                        + ",status"
                        + ",years"
                        + ",num"
                        + ")values("
                        + ":ref_no"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:date_of_birth"
                        + ",:place_of_birth"
                        + ",:father"
                        + ",:mother"
                        + ",:godfather"
                        + ",:p_godfather"
                        + ",:godmother"
                        + ",:p_godmother"
                        + ",:presider"
                        + ",:bapt_date"
                        + ",:bapt_time"
                        + ",:bapt_church"
                        + ",:priest"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:f_comm_date"
                        + ",:f_comm_church"
                        + ",:f_conf_date"
                        + ",:f_conf_church"
                        + ",:is_diaconate"
                        + ",:diconate_date"
                        + ",:is_religious_prof"
                        + ",:religious_prof_date"
                        + ",:remarks"
                        + ",:status"
                        + ",:years"
                        + ",:num"
                        + ")";

            s0 = SqlStringUtil.parse(s0).setNumber("ref_no", to_baptism2.ref_no).setString("fname", to_baptism2.fname).setString("mi", to_baptism2.mi).setString("lname", to_baptism2.lname).setString("date_of_birth", to_baptism2.date_of_birth).setString("place_of_birth", to_baptism2.place_of_birth).setString("father", to_baptism2.father).setString("mother", to_baptism2.mother).setString("godfather", to_baptism2.godfather).setString("p_godfather", to_baptism2.p_godfather).setString("godmother", to_baptism2.godmother).setString("p_godmother", to_baptism2.p_godmother).setString("presider", to_baptism2.presider).setString("bapt_date", to_baptism2.bapt_date).setString("bapt_time", to_baptism2.bapt_time).setString("bapt_church", to_baptism2.bapt_church).setString("priest", to_baptism2.priest).setString("book_no", to_baptism2.book_no).setNumber("page_no", to_baptism2.page_no).setString("f_comm_date", to_baptism2.f_comm_date).setString("f_comm_church", to_baptism2.f_comm_church).setString("f_conf_date", to_baptism2.f_conf_date).setString("f_conf_church", to_baptism2.f_conf_church).setNumber("is_diaconate", to_baptism2.is_diaconate).setString("diconate_date", to_baptism2.diconate_date).setNumber("is_religious_prof", to_baptism2.is_religious_prof).setString("religious_prof_date", to_baptism2.religious_prof_date).setString("remarks", to_baptism2.remarks).setNumber("status", to_baptism2.status).setString("years", to_baptism2.years).setNumber("num", to_baptism2.num).ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S2_baptism.class, "Successfully Added");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_baptized='" + "4" + "'"
                          + ",b_date='" + to_baptism2.bapt_date + "'"
                          + ",b_book_no='" + to_baptism2.book_no + "'"
                          + ",b_page_no='" + to_baptism2.page_no + "'"
                          + ",b_page_no='" + to_baptism2.num + "'"
                          + ",date_of_baptism='" + to_baptism2.bapt_date + "' where ref_id='" + to_baptism2.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S2_baptism.class, "Successfully updated baptism");

            String s3 = "insert into " + "db_bulletin" + ".baptism2_sponsors("
                        + "ref_no"
                        + ",sponsor"
                        + ")values("
                        + ":ref_no"
                        + ",:sponsor"
                        + ")";

            s3 = SqlStringUtil.parse(s3).setNumber("ref_no", to_baptism2_sponsors.ref_no).setString("sponsor", to_baptism2_sponsors.sponsor).ok();

            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();

            Lg.s(S2_baptism.class, "Successfully updated baptism2_sponsors");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void edit_data(to_baptism2 to_baptism2, to_baptism2_sponsors to_baptism2_sponsors) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "update " + "db_bulletin" + ".baptism2 set "
                        + "ref_no= '" + to_baptism2.ref_no + "'"
                        + ",fname= '" + to_baptism2.fname + "'"
                        + ",mi= '" + to_baptism2.mi + "'"
                        + ",lname= '" + to_baptism2.lname + "'"
                        + ",date_of_birth= '" + to_baptism2.date_of_birth + "'"
                        + ",place_of_birth= '" + to_baptism2.place_of_birth + "'"
                        + ",father= '" + to_baptism2.father + "'"
                        + ",mother= '" + to_baptism2.mother + "'"
                        + ",godfather= '" + to_baptism2.godfather + "'"
                        + ",p_godfather= '" + to_baptism2.p_godfather + "'"
                        + ",godmother= '" + to_baptism2.godmother + "'"
                        + ",p_godmother= '" + to_baptism2.p_godmother + "'"
                        + ",presider= '" + to_baptism2.presider + "'"
                        + ",bapt_date= '" + to_baptism2.bapt_date + "'"
                        + ",bapt_time= '" + to_baptism2.bapt_time + "'"
                        + ",bapt_church= '" + to_baptism2.bapt_church + "'"
                        + ",priest= '" + to_baptism2.priest + "'"
                        + ",book_no= '" + to_baptism2.book_no + "'"
                        + ",page_no= '" + to_baptism2.page_no + "'"
                        + ",f_comm_date= '" + to_baptism2.f_comm_date + "'"
                        + ",f_comm_church= '" + to_baptism2.f_comm_church + "'"
                        + ",f_conf_date= '" + to_baptism2.f_conf_date + "'"
                        + ",f_conf_church= '" + to_baptism2.f_conf_church + "'"
                        + ",is_diaconate= '" + to_baptism2.is_diaconate + "'"
                        + ",diconate_date= '" + to_baptism2.diconate_date + "'"
                        + ",is_religious_prof= '" + to_baptism2.is_religious_prof + "'"
                        + ",religious_prof_date= '" + to_baptism2.religious_prof_date + "'"
                        + ",remarks= '" + to_baptism2.remarks + "'"
                        + ",status= '" + to_baptism2.status + "'"
                        + ",years= '" + to_baptism2.years + "'"
                        + ",num= '" + to_baptism2.num + "'"
                        + "where "
                        + " ref_no ='" + to_baptism2.ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S2_baptism.class, "Successfully Updated");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_baptized='" + "4" + "'"
                          + ",b_date='" + to_baptism2.bapt_date + "'"
                          + ",b_book_no='" + to_baptism2.book_no + "'"
                          + ",b_page_no='" + to_baptism2.page_no + "'"
                          + ",b_page_no='" + to_baptism2.num + "'"
                          + ",date_of_baptism='" + to_baptism2.bapt_date + "' where ref_id='" + to_baptism2.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S2_baptism.class, "Successfully updated parishioner");


            String s3 = "update " + "db_bulletin" + ".baptism2_sponsors set "
                        + "ref_no= '" + to_baptism2_sponsors.ref_no + "'"
                        + ",sponsor= '" + to_baptism2_sponsors.sponsor + "'"
                        + "where "
                        + " ref_no ='" + to_baptism2_sponsors.ref_no + "' "
                        + " ";

            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();
            Lg.s(S2_baptism.class, "Successfully Updated baptism sponsor");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void delete_data(to_baptism2 to_baptism2) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = "delete from " + "db_bulletin" + ".baptism2 where "
                        + " ref_no ='" + to_baptism2.ref_no + "' "
                        + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S2_baptism.class, "Successfully Deleted baptism");

            String s0_1 = "update db_bulletin.parishioners_1 "
                          + "set "
                          + "is_baptized='" + "0" + "'"
                          + ",b_date='" + "1500-01-01" + "'"
                          + ",b_book_no='" + "0" + "'"
                          + ",b_page_no='" + "0" + "'"
                          + ",b_page_no='" + "0" + "'"
                          + ",date_of_baptism='" + "1500-01-01" + "' where ref_id='" + to_baptism2.ref_no + "'";
            PreparedStatement stmt2 = conn.prepareStatement(s0_1);
            stmt2.execute();
            Lg.s(S2_baptism.class, "Successfully updated parishioner");

            String s3 = "delete from " + "db_bulletin" + ".baptism2_sponsors where "
                        + " ref_no ='" + to_baptism2.ref_no + "' "
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
