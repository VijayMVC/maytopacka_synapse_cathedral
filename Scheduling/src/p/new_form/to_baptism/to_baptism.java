/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form.to_baptism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dummy
 */
public class to_baptism {

    public static class to_marriage_tribunal {

        public  int marriage_no;
        public  String date_of_marriage;
        public  String Date_of_death_of_spouse;
        public  String decree_ordi_no;
        public  String case_no;
        public  String tribunal_no;

        public to_marriage_tribunal(int marriage_no, String date_of_marriage, String Date_of_death_of_spouse, String decree_ordi_no, String case_no, String tribunal_no) {
            this.marriage_no = marriage_no;
            this.date_of_marriage = date_of_marriage;
            this.Date_of_death_of_spouse = Date_of_death_of_spouse;
            this.decree_ordi_no = decree_ordi_no;
            this.case_no = case_no;
            this.tribunal_no = tribunal_no;
        }

        public String getDate_of_death_of_spouse() {
            return Date_of_death_of_spouse;
        }

        public void setDate_of_death_of_spouse(String Date_of_death_of_spouse) {
            this.Date_of_death_of_spouse = Date_of_death_of_spouse;
        }

        public String getCase_no() {
            return case_no;
        }

        public void setCase_no(String case_no) {
            this.case_no = case_no;
        }

        public String getDate_of_marriage() {
            return date_of_marriage;
        }

        public void setDate_of_marriage(String date_of_marriage) {
            this.date_of_marriage = date_of_marriage;
        }

        public String getDecree_ordi_no() {
            return decree_ordi_no;
        }

        public void setDecree_ordi_no(String decree_ordi_no) {
            this.decree_ordi_no = decree_ordi_no;
        }

        public int getMarriage_no() {
            return marriage_no;
        }

        public void setMarriage_no(int marriage_no) {
            this.marriage_no = marriage_no;
        }

        public String getTribunal_no() {
            return tribunal_no;
        }

        public void setTribunal_no(String tribunal_no) {
            this.tribunal_no = tribunal_no;
        }
        
    }

    public static List<to_marriage_tribunal> add_data(int m_no, String date_of_marriage, String date_of_death, String decree, String case_no, String tribunal_no) {

        List<to_marriage_tribunal> datas = new ArrayList();

        to_marriage_tribunal to = new to_marriage_tribunal(m_no, date_of_marriage, date_of_death, decree, case_no, tribunal_no);
        datas.add(to);
        return datas;

    }
}
