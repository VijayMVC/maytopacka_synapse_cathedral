/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.confirmation;

import p.baptism.*;
import bb.dlg.Dlg_confirm;
import bb.dlg.Dlg_mass_time;
import bb.dlg.Dlg_pay_rites;
import bb.dlg2.dlg_rite_fees_settings;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.S8_baptism.to_baptism;
import p.rpt.Reference_number;
import p.svc.S3_cb_convenience;
import p.svc.S9_payments;

/**
 *
 * @author dummy
 */
public class Dlg_confirmation_payment extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_baptism
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;


    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_confirmation_payment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_confirmation_payment(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_confirmation_payment() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_confirmation_payment myRef;

    private void setThisRef(Dlg_confirmation_payment myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_confirmation_payment> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_confirmation_payment create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_confirmation_payment create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_confirmation_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_confirmation_payment((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_confirmation_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_confirmation_payment((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Dlg_confirmation_payment dialog = Dlg_confirmation_payment.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }


    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_pop = new javax.swing.JPopupMenu();
        edit = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_confirmation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        pm_pop.add(edit);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        pm_pop.add(delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_confirmation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_confirmation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_confirmationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_confirmationMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_confirmation);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 161, 1302, 570));

        jLabel1.setText("STATUS:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 78, -1));

        cb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APPROVED", "PAYED" }));
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
            }
        });
        jPanel1.add(cb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 64, 225, 30));

        jLabel3.setText("SEARCH NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 123, -1));

        tf_search.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });
        jPanel1.add(tf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 554, 36));

        jButton1.setText("VIEW FEES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 110, 130, 40));

        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 110, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        do_edit_baptism();
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        do_remove();
    }//GEN-LAST:event_deleteActionPerformed

    private void tbl_confirmationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_confirmationMousePressed
        // TODO add your handling code here:
//        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_confirmationMousePressed

    private void tbl_confirmationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_confirmationMouseReleased
        // TODO add your handling code here:
//        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_confirmationMouseReleased

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        // TODO add your handling code here:
        set_bnt();
        data_bap();
    }//GEN-LAST:event_cb_statusActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
        data_bap();
    }//GEN-LAST:event_tf_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        do_fees();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        do_pay();
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_status;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTable tbl_confirmation;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
//        dp_date.setDate(new Date());
        init_key();
        init_tbl_baptism();
        data_bap();

    }

    private void set_bnt() {
        if (cb_status.getSelectedIndex() == 0) {
            jButton2.setText("PAY");
        } else {
            jButton2.setText("CANCEl");
        }
    }

    private void do_fees() {
        Window p = (Window) this;
        dlg_rite_fees_settings nd = dlg_rite_fees_settings.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new dlg_rite_fees_settings.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, dlg_rite_fees_settings.Data data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_mass_time() {

        Window p = (Window) this;
        Dlg_mass_time nd = Dlg_mass_time.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_mass_time.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_time.OutputData data) {
//                closeDialog.ok();
//                init_time();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    public void do_pass() {
    }
    // <editor-fold defaultstate="collapsed" desc="Key">

    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_baptism() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_confirmation.setModel(tbl_employee_payroll_M);
        tbl_confirmation.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_confirmation.setRowHeight(25);

//        tbl_baptism.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 200, 0, 0, 0, 100, 100, 100, 0, 0, 100, 0, 0, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_confirmation, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_confirmation.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_confirmation.setRowHeight(35);
        tbl_confirmation.setFont(new java.awt.Font("Arial", 1, 12));
    }

    private void loadData_baptism(List<S9_confirmation.to_confirmation> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            //            "Ref #", "NAME", " child_fname", " child_lname", " child_mi", " father", " mother", "PLACE OF BIRTH", " DATE OF BIRTH", " DATE OF BAPTISM", "TIME", " PRIEST", " book_number", "page_number", " date_added", " date_modified"
            "REF # ", "NAME", "child_fname ", "child_lname ", "child_mi ", "FATHER ", "MOTHER ", "DATE ", "PLACE ", "date_added ", "TIME ", "book_no ", "page_no ", "CONFIRMED BY "
        };

        public TblInvoicesModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
//           
//            if (column == 1) {
//                return true;
//            }

            return false;
        }

        @Override
        public Class getColumnClass(int col) {

            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            S9_confirmation.to_confirmation tt = (S9_confirmation.to_confirmation) getRow(row);
//              "confirmation_no ","name",  "child_fname ",  "child_lname ",  "child_mi ",  "father ",  "mother ",  "date_of_confirmation ",  "place_of_confirmation ",  "date_added ",  "time ",  "book_no ",  "page_no ",  "confirmed_by "

            switch (col) {

                case 0:
                    return tt.confirmation_no;
                case 1:
                    return tt.child_fname + " " + tt.child_mi + " " + tt.child_lname;
                case 2:
                    return tt.child_fname;
                case 3:
                    return tt.child_lname;
                case 4:
                    return tt.child_mi;
                case 5:
                    return tt.father;
                case 6:
                    return tt.mother;
                case 7:
                    return tt.date_of_confirmation;
                case 8:
                    return tt.place_of_confirmation;
                case 9:
                    return tt.date_added;
                case 10:
                    return tt.time;
                case 11:
                    return tt.book_no;
                case 12:
                    return tt.page_no;
                default:
                    return tt.confirmed_by;
            }
        }
    }

    private void data_bap() {
        String is_approved = "";
        String is_payed = "";
        String is_married = "";
        if (cb_status.getSelectedIndex() == 0) {
            is_approved = "yes";
            is_payed = "no";
            is_married = "no";
        }
        if (cb_status.getSelectedIndex() == 1) {
            is_approved = "yes";
            is_payed = "yes";
            is_married = "no";
        }

        String search = tf_search.getText();
//        String date = lb_date_baptism.getText();
//        String name = tf_searc.getText();
        loadData_baptism(S9_confirmation.do_ret_confirmation(is_approved,is_payed,is_married,search));
    }

    private void do_add_baptism() {
        Window p = (Window) this;
        Dlg_add_confirmation nd = Dlg_add_confirmation.create(p, true);
        nd.setTitle("");
//        S9_confirmation.to_confirmation to = new S9_confirmation.to_confirmation("", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

//        nd.do_pass(new  S9_confirmation.to_confirmation);
        nd.setCallback(new Dlg_add_confirmation.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_confirmation.OutputData data) {
                closeDialog.ok();
                add_baptism(data.data, data.l);
                data_bap();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void pm_tbl_users(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void add_baptism(S9_confirmation.to_confirmation data, ArrayListModel l) {
        S9_confirmation.do_add(data, l);
        data_bap();
    }

    private void do_edit_baptism() {
//          "baptismal_number","name1"
//            ," child_fname2"," child_lname2"," child_mi2"
//                ," father"," mother","place_of_birth"," date_of_birth"
//                ," date_of_baptism","time_of_baptism"," baptized_by"
//                ," book_number","page_number"," date_added"," date_modified"
        int row = tbl_confirmation.getSelectedRow();
        if (row < 0) {
            return;
        }

//     "confirmation_no ","name",  "child_fname ",  "child_lname ",  "child_mi ",  "father ",  "mother "
//,  "date_of_confirmation ",  "place_of_confirmation ",  "date_added ",  "time ",  "book_no ",  "page_no ",  "confirmed_by "

        final String confirmation_no = tbl_confirmation.getModel().getValueAt(row, 0).toString();
        String child_fname = tbl_confirmation.getModel().getValueAt(row, 2).toString();
        String child_lname = tbl_confirmation.getModel().getValueAt(row, 3).toString();
        String child_mi = tbl_confirmation.getModel().getValueAt(row, 4).toString();
        String father = tbl_confirmation.getModel().getValueAt(row, 5).toString();

        String mother = tbl_confirmation.getModel().getValueAt(row, 6).toString();
        String date_of_confirmation = tbl_confirmation.getModel().getValueAt(row, 7).toString();
        String place_of_confirmation = tbl_confirmation.getModel().getValueAt(row, 8).toString();
        String date_added = tbl_confirmation.getModel().getValueAt(row, 9).toString();
        String book_no = tbl_confirmation.getModel().getValueAt(row, 11).toString();

        String page_no = tbl_confirmation.getModel().getValueAt(row, 12).toString();
        String confirmed_by = tbl_confirmation.getModel().getValueAt(row, 12).toString();


        S9_confirmation.to_confirmation to = new S9_confirmation.to_confirmation(confirmation_no, child_fname, child_lname, child_mi, father, mother, date_of_confirmation, place_of_confirmation, date_added, mother, book_no, page_no, confirmed_by);

        Window p = (Window) this;
        Dlg_add_confirmation nd = Dlg_add_confirmation.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_add_confirmation.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_confirmation.OutputData data) {
                closeDialog.ok();
                edit_baptism(data.data, data.l);
                data_bap();

            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void edit_baptism(S9_confirmation.to_confirmation data, ArrayListModel l) {
        S9_confirmation.edit_confirmation(data, l);
    }

    private void do_remove() {
        int[] idx = tbl_confirmation.getSelectedRows();

        final List<String> rem = new ArrayList();
        for (int ix : idx) {
            if (tbl_confirmation.isRowSelected(ix)) {
//                int mx = tbl_marriage.convertRowIndexToModel(ix);
                String ref_no = tbl_confirmation.getModel().getValueAt(ix, 0).toString();
                rem.add(ref_no);
            }
        }

        tbl_employee_payroll_ALM.removeAll(rem);
        tbl_employee_payroll_M.fireTableDataChanged();
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                remove(rem);
                data_bap();


            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void remove(List<String> datas) {
        for (String t : datas) {
            S9_confirmation.delete_baptism(t);
        }
        JOptionPane.showMessageDialog(null, "Successfully Deleted");
    }

    private void do_pay() {
        int row = tbl_confirmation.getSelectedRow();
        if (row < 0) {
            return;
        }
        final String ref_no = tbl_confirmation.getModel().getValueAt(row, 0).toString();
        final String f_name = tbl_confirmation.getModel().getValueAt(row, 1).toString();
//        String b_name = tbl_baptism.getModel().getValueAt(row, 9).toString();
//        String type = tbl_baptism.getModel().getValueAt(row, 25).toString();
//        final String name = g_name + " / " + b_name;
        Window p = (Window) this;
        Dlg_pay_rites nd = Dlg_pay_rites.create(p, true);
        nd.setTitle("");
        nd.do_pass("Confirmation");
        nd.do_pass2("Ordinary");

        nd.setCallback(new Dlg_pay_rites.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_pay_rites.OutputData data) {
                closeDialog.ok();
                do_pay_confirmation(ref_no, ref_no, data.amount, f_name);
                data_bap();
            }

            @Override
            public void matrimony(CloseDialog closeDialog, Dlg_pay_rites.OutputData2 data) {
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_pay_confirmation(String ref_no, String or_no, double amount, String name) {

        S9_payments.do_pay_other_confirmation(ref_no, or_no, amount, name, "Confirmation");


        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());


        String words = DigitToWord.convertToWordsIn(amount);
        String am = FitIn.fmt_wc_0(amount);
//
//        Reference_number.to_receipt to = new Reference_number.to_receipt(date, name, words, "Funeral", "CASH", am, or_no, ref_no);
//        Reference_number.print_receipt(to);

    }
}
