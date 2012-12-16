/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.marriage;

import bb.dlg.Dlg_confirm;
import bb.dlg.Dlg_pay_rites;
import bb.dlg.Dlg_pay_rites.OutputData2;
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
import p.rpt.Reference_number;
import p.svc.S3_cb_convenience;
import p.svc.S7_marriage;
import p.svc.S9_payments;
import p.to.to_rites_fees;

/**
 *
 * @author i1
 */
public class Dlg_marriage_payment extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_marriage
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
    private Dlg_marriage_payment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_marriage_payment(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_marriage_payment() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_marriage_payment myRef;

    private void setThisRef(Dlg_marriage_payment myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_marriage_payment> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_marriage_payment create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_marriage_payment create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_marriage_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_payment((java.awt.Frame) parent, false);
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
            Dlg_marriage_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_payment((java.awt.Dialog) parent, false);
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


        Dlg_marriage_payment dialog = Dlg_marriage_payment.create(new javax.swing.JFrame(), true);
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

        pm_encoder = new javax.swing.JPopupMenu();
        edit = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        approved = new javax.swing.JMenuItem();
        confirm = new javax.swing.JMenuItem();
        pm_cashier = new javax.swing.JPopupMenu();
        pay = new javax.swing.JMenuItem();
        cancel = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_marriage = new javax.swing.JTable();
        cb_status = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        pm_encoder.add(edit);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        pm_encoder.add(delete);

        approved.setText("APPROVE");
        approved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedActionPerformed(evt);
            }
        });
        pm_encoder.add(approved);

        confirm.setText("CONFIRM");
        pm_encoder.add(confirm);

        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        pm_cashier.add(pay);

        cancel.setText("CANCEL");
        pm_cashier.add(cancel);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_marriage.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_marriage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_marriageMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_marriageMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_marriage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 161, 1302, 570));

        cb_status.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APPROVED", "PAYED" }));
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
            }
        });
        getContentPane().add(cb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 64, 225, 30));

        jLabel1.setText("STATUS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 78, 30));

        jLabel3.setText("SEARCH NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 123, -1));

        tf_search.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });
        getContentPane().add(tf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 554, 36));

        jButton1.setText("VIEW FEES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 110, 130, 40));

        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 110, 110, 40));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void tbl_marriageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_marriageMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_marriageMousePressed

    private void tbl_marriageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_marriageMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_marriageMouseReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void approvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedActionPerformed
        // TODO add your handling code here:
        do_approved();
    }//GEN-LAST:event_approvedActionPerformed

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        // TODO add your handling code here:
        set_bnt();
        data_employee();
    }//GEN-LAST:event_cb_statusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        do_fees();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
        do_pay();
    }//GEN-LAST:event_payActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_tf_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        do_pay();
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem approved;
    private javax.swing.JMenuItem cancel;
    private javax.swing.JComboBox cb_status;
    private javax.swing.JMenuItem confirm;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem pay;
    private javax.swing.JPopupMenu pm_cashier;
    private javax.swing.JPopupMenu pm_encoder;
    private javax.swing.JTable tbl_marriage;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_time();
        init_tbl_marriage();
        data_employee();
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

    private void init_time() {
//        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_mat);
    }
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_marriage() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_marriage.setModel(tbl_employee_payroll_M);
        tbl_marriage.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_marriage.setRowHeight(25);

//        tbl_marriage.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 0, 100, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 150, 150, 150, 0, 0, 0, 100, 0, 0, 100};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 2 || i == 9) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_marriage, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.s
//          TableWidthUtilities.
        }

        tbl_marriage.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_marriage.setRowHeight(35);
        tbl_marriage.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_baptism(List<S7_marriage.to_marriage_details> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        // 100,0,100,0,0,0,0,0,0,100,0,0,0,0,0,0,100,100,100,0,0,0,100,0,0
        public static String[] COLUMNS = {
            "REF #", "series_of", "GROOM NAME", "groom_fname", "groom_lname", "groom_mname", "groom_father", "groom_mother", "groom_address", "BRIDE NAME", "bride_fname", "bride_lname", "bride_mname", "bride_father", " bride_mother", " bride_address", "DATE OF MARRIAGE", "TIME", "PRIEST", "book_number", " page_number", " date_added", "CONTACT #", "groom_contact", "bride_contact", "Wedding Type"
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
            S7_marriage.to_marriage_details tt = (S7_marriage.to_marriage_details) getRow(row);

            switch (col) {
                case 0:
                    return tt.marriage_number;
                case 1:
                    return tt.series_of;
                case 2:
                    return tt.groom_fname + " " + tt.groom_mname + " " + tt.groom_lname;
                case 3:
                    return tt.groom_fname;
                case 4:
                    return tt.groom_mname;
                case 5:
                    return tt.groom_lname;
                case 6:
                    return tt.groom_father;
                case 7:
                    return tt.groom_mother;
                case 8:
                    return tt.groom_address;
                case 9:
                    return tt.bride_fname + " " + tt.bride_mname + " " + tt.bride_lname;
                case 10:
                    return tt.bride_fname;
                case 11:
                    return tt.bride_mname;
                case 12:
                    return tt.bride_lname;
                case 13:
                    return tt.bride_father;
                case 14:
                    return tt.bride_mother;
                case 15:
                    return tt.bride_address;
                case 16:
                    return tt.date_of_marriage;
                case 17:
                    return tt.time_of_marriage;
                case 18:
                    return tt.solemnized_by;
                case 19:
                    return tt.book_number;
                case 20:
                    return tt.page_number;
                case 21:
                    return tt.date_added;
                case 22:
                    return tt.g_contact + " / " + tt.b_contact;
                case 23:
                    return tt.g_contact;
                case 24:
                    return tt.b_contact;

                default:
                    return tt.wedding_type;
            }
        }
    }

    private void data_employee() {
//        String date = lb_date_baptism.getText();

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
//         if (cb_status.getSelectedIndex() == 2) {
//            is_approved = "yes";
//            is_payed = "yes";
//            is_married = "yes";
//        }
//        String name = tf_searc.getText();
        loadData_baptism(S7_marriage.ret_data(is_approved, is_payed, is_married, search));
    }

    private void do_approved() {
        int[] idx = tbl_marriage.getSelectedRows();

        final List<String> rem = new ArrayList();
        for (int ix : idx) {
            if (tbl_marriage.isRowSelected(ix)) {
//                int mx = tbl_marriage.convertRowIndexToModel(ix);
                String ref_no = tbl_marriage.getModel().getValueAt(ix, 0).toString();
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
                approve(rem);
                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void set_bnt() {
        if (cb_status.getSelectedIndex() == 0) {
            jButton2.setText("PAY");
        } else {
            jButton2.setText("CANCEl");
        }
    }

    private void pm_tbl_users(MouseEvent evt) {

        if (evt.isPopupTrigger()) {
            if (cb_status.getSelectedIndex() == 0) {
                pay.setVisible(true);
                cancel.setVisible(false);
            } else {
                pay.setVisible(false);
                cancel.setVisible(true);
            }

            pm_cashier.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void pm_tbl_cancel(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_cashier.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void approve(List<String> datas) {
        for (String t : datas) {
            S7_marriage.approve_marriage(t);
        }
        JOptionPane.showMessageDialog(null, "Successfully Updated");
    }

    private void do_pay() {
        int row = tbl_marriage.getSelectedRow();
        if (row < 0) {
            return;
        }
        final String ref_no = tbl_marriage.getModel().getValueAt(row, 0).toString();
        String g_name = tbl_marriage.getModel().getValueAt(row, 2).toString();
        String b_name = tbl_marriage.getModel().getValueAt(row, 9).toString();
        String type = tbl_marriage.getModel().getValueAt(row, 25).toString();
        final String name = g_name + " / " + b_name;
        Window p = (Window) this;
        Dlg_pay_rites nd = Dlg_pay_rites.create(p, true);
        nd.setTitle("");
        nd.do_pass("Matrimony");
        nd.do_pass2(type);
        nd.setCallback(new Dlg_pay_rites.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_pay_rites.OutputData data) {
                closeDialog.ok();
//                do_pay_other_rites(ref_no, data.or_no, 0, name);
                data_employee();
            }

            @Override
            public void matrimony(CloseDialog closeDialog, OutputData2 data) {
                closeDialog.ok();
                do_pay_matrimony(ref_no, data.or_no, data.t, name);
                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_pay_matrimony(String ref_no, String or_no, List<to_rites_fees> t, String name) {

        S9_payments.do_pay_marriage(ref_no, or_no, t, name);

        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());

        double amount = 0;
        for (to_rites_fees tt : t) {
            amount += tt.rate;
        }
        String words = DigitToWord.convertToWordsIn(amount);
        String am = FitIn.fmt_wc_0(amount);

//        Reference_number.to_receipt to = new Reference_number.to_receipt(date, name, words, "Matrimony", "CASH", am, or_no, ref_no);
//        Reference_number.print_receipt(to);

    }

    private void do_pay_other_rites(String ref_no, String or_no, double amount, String name) {

//        S9_payments(ref_no, or_no, 0, name);
    }
}
