/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import bb.svc2.S6_parishioners;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import overallPOS.modules.share.utils.Executor;
import overallPOS.modules.share.utils.Lg;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author Dummy
 */
public class Set_table_search {

    public static String[] set_table_header(String rite_name) {

        String[] names = {"Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "Baptism", "Communion", "Confirmation", "Marriage", "2nd Marriage", "Prof of Faith", "Acceptance", "Death", "Date Added", "Gender", "Place of Baptism", rite_name, "Book No", "Page No", "Index", "Date of Birth", "Place of Birth", "Address", "Father", "Mother"
        };
        return names;

    }

    public static void set_table(JTable table, String[] col_names, List<String[]> row_data, final int[] col_editable, int[] cols_to_center, int[] rows_to_right) {
        DefaultTableModel table_model = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                for (int i : col_editable) {
                    if (i == colIndex) {
                        return true;
                    }
                }
                return false;
            }
        };

        table.setModel(table_model);
        String[] col_holder = col_names;
        table_model.setColumnIdentifiers(col_holder);

        List<String[]> data_holder = row_data;


        for (String[] data : data_holder) {
            table_model.addRow(data);
        }
    }

    public static List<String[]> ret_data(String name, String rite_name, String book_no, String page_no, String index_no, String date_from, String date_to, String genders, String ref_no, String marr_status) {
        List<S6_parishioners.to_parishioners> datas = new ArrayList();
        List<String[]> my_data = new ArrayList();
        String date_of = "NO DATA";
        String book = "NO DATA";
        String page = "NO DATA";
        String index = "NO DATA";
        String s0 = "";
        try {
            Connection conn = PoolConnection.connect();
            if (rite_name.equals("Date of Baptism")) {
                s0 = "select ref_id,fname,mi,lname,date_of_baptism"
                     + ",date_of_birth,place_of_birth,address1,address2,city"
                     + ",states,zip_code,father,mother"
                     + ",is_baptized,is_comm,is_confirm,is_married,is_2nd_married,is_prof_faith,is_acceptance,is_death"
                     + ",date_added,gender,bapt_place"
                     + ",b_date,b_book_no,b_page_no,b_index_no"
                     + " from db_bulletin.parishioners_1"
                     + " where"
                     + " concat(fname,space(1),mi,space(1),lname) like '%" + name + "%' and b_book_no like '%" + book_no + "%'  and b_page_no like '%" + page_no + "%'  and b_index_no like '%" + index_no + "%' "
                     + " and date(b_date) between date('" + date_from + "') and date('" + date_to + "') and gender like '%" + genders + "%' and ref_id<>'" + ref_no + "' and is_married<>'" + marr_status + "'"
                     + "limit 200";
            }
            if (rite_name.equals("Date of Confirmation")) {
                s0 = "select ref_id,fname,mi,lname,date_of_baptism"
                     + ",date_of_birth,place_of_birth,address1,address2,city"
                     + ",states,zip_code,father,mother"
                     + ",is_baptized,is_comm,is_confirm,is_married,is_2nd_married,is_prof_faith,is_acceptance,is_death"
                     + ",date_added,gender,bapt_place"
                     + ",c_date,c_book_no,c_page_no,c_index_no"
                     + " from db_bulletin.parishioners_1"
                     + " where concat(fname,space(1),mi,space(1),lname) like '%" + name + "%' and c_book_no like '%" + book_no + "%'  and c_page_no like '%" + page_no + "%'  and c_index_no like '%" + index_no + "%' "
                     + " and date(c_date) between date('" + date_from + "') and date('" + date_to + "') and gender like '%" + genders + "%' and ref_id<>'" + ref_no + "' and is_married<>'" + marr_status + "'"
                     + "limit 200";
            }
            if (rite_name.equals("Date of Marriage")) {
                s0 = "select ref_id,fname,mi,lname,date_of_baptism"
                     + ",date_of_birth,place_of_birth,address1,address2,city"
                     + ",states,zip_code,father,mother"
                     + ",is_baptized,is_comm,is_confirm,is_married,is_2nd_married,is_prof_faith,is_acceptance,is_death"
                     + ",date_added,gender,bapt_place"
                     + ",m_date,m_book_no,m_page_no,m_index_no"
                     + " from db_bulletin.parishioners_1"
                     + " where concat(fname,space(1),mi,space(1),lname) like '%" + name + "%' and m_book_no like '%" + book_no + "%'  and m_page_no like '%" + page_no + "%'  and m_index_no like '%" + index_no + "%'"
                     + " and date(m_date) between date('" + date_from + "') and date('" + date_to + "') and gender like '%" + genders + "%' and ref_id<>'" + ref_no + "' and is_married<>'" + marr_status + "'"
                     + "limit 200";
            }
            if (rite_name.equals("Date of Funeral")) {
                s0 = "select ref_id,fname,mi,lname,date_of_baptism"
                     + ",date_of_birth,place_of_birth,address1,address2,city"
                     + ",states,zip_code,father,mother"
                     + ",is_baptized,is_comm,is_confirm,is_married,is_2nd_married,is_prof_faith,is_acceptance,is_death"
                     + ",date_added,gender,bapt_place"
                     + ",f_date,f_book_no,f_page_no,f_index_no"
                     + " from db_bulletin.parishioners_1"
                     + " where concat(fname,space(1),mi,space(1),lname) like '%" + name + "%' and f_book_no like '%" + book_no + "%'  and f_page_no like '%" + page_no + "%'  and f_index_no like '%" + index_no + "%'"
                     + " and date(f_date) between date('" + date_from + "') and date('" + date_to + "') and gender like '" + genders + "' and ref_id<>'" + ref_no + "' and is_married<>'" + marr_status + "'"
                     + "limit 200";
            }

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
                date_of = rs.getString(26);
                book = rs.getString(27);
                page = rs.getString(28);
                index = rs.getString(29);

                if (date_of.equals("1500-01-01")) {
                    date_of = "No Data";
                }

                if (book.equals("0")) {
                    book = "No Data";
                }

                if (page.equals("0")) {
                    page = "No Data";
                }

                if (index.equals("0")) {
                    index = "No Data";
                }
//                S6_parishioners.to_parishioners to = new S6_parishioners.to_parishioners(ref_id, fname, mi, lname, date_of_baptism
//                        , date_of_birth, place_of_birth, address1, address2, city, states, zip_code
//                        , father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married
//                        , is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_place,"date of","book no","page no","index","date of birth","bapt place","address","father","mother");


                String[] get = {ref_id, fname, mi, lname, gender, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_place, date_of, book, page, index, date_of_birth, place_of_birth, address1, father, mother};

                my_data.add(get);
            }
            return my_data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void main(String[] args) {
        try {
            Connection conn = PoolConnection.connect();
            String s0 = " select book_no from db_bulletin.baptism2 group by book_no";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String num = rs.getString(1);
                System.out.println(num);
            }
        } catch (Exception e) {
            PoolConnection.close();
            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }
}
