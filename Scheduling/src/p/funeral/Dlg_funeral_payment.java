/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.funeral;

import p.baptism.*;
import bb.dlg.Dlg_confirm;
import bb.dlg.Dlg_mass_time;
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
import p.baptism.S8_baptism.to_baptism;
import p.rpt.Reference_number;
import p.svc.S7_marriage;
import p.svc.S9_payments;
import p.to.to_rites_fees;

/**
 *
 * @author dummy
 */
public class Dlg_funeral_payment extends javax.swing.JDialog {

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
    private Dlg_funeral_payment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_funeral_payment(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_funeral_payment() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_funeral_payment myRef;

    private void setThisRef(Dlg_funeral_payment myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_funeral_payment> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_funeral_payment create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_funeral_payment create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_funeral_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_funeral_payment((java.awt.Frame) parent, false);
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
            Dlg_funeral_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_funeral_payment((java.awt.Dialog) parent, false);
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


        Dlg_funeral_payment dialog = Dlg_funeral_payment.create(new javax.swing.JFrame(), true);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_baptism = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_baptism.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_baptism.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_baptismMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_baptismMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_baptism);

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

    private void tbl_baptismMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_baptismMousePressed
        // TODO add your handling code here:
//        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_baptismMousePressed

    private void tbl_baptismMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_baptismMouseReleased
        // TODO add your handling code here:
//        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_baptismMouseReleased

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_baptism;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
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


        tbl_baptism.setModel(tbl_employee_payroll_M);
        tbl_baptism.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_baptism.setRowHeight(25);

//        tbl_baptism.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 200, 0, 0, 0, 0, 100, 0, 0, 0, 100, 100, 100, 0, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_baptism, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_baptism.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_baptism.setRowHeight(35);
        tbl_baptism.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_baptism(List<S10_funeral.to_funeral> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            //            "Ref #", "NAME", " child_fname", " child_lname", " child_mi", " father", " mother", "PLACE OF BIRTH", " DATE OF BIRTH", " DATE OF BAPTISM", "TIME", " PRIEST", " book_number", "page_number", " date_added", " date_modified"
            "REF #", "NAME", "f_name", "l_name", "mi", "contact_number", "ADDRESS", "cause_of_death", "date buried", "buried at", "DATE", "TIME", "PRIEST", "book_no", "page_no"
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
            S10_funeral.to_funeral tt = (S10_funeral.to_funeral) getRow(row);
//            "REF #", "NAME","f_name", "l_name", "mi", "contact_number", "ADDRESS", "cause_of_death", "page_no", "priest", "DATE", "TIME", "PRIEST", "book_no", "page_no"
            switch (col) {

                case 0:
                    return tt.burial_mass_number;
                case 1:
                    return tt.f_name + " " + tt.mi + " " + tt.l_name;
                case 2:
                    return tt.f_name;
                case 3:
                    return tt.l_name;
                case 4:
                    return tt.mi;
                case 5:
                    return tt.contact_number;
                case 6:
                    return tt.address;
                case 7:
                    return tt.cause_of_death;
                case 8:
                    return tt.date_buried;

                case 9:
                    return tt.buried_at;
                case 10:
                    return tt.scheduled_time;
                case 11:
                    return tt.scheduled_date;
                case 12:
                    return tt.priest;
                case 13:
                    return tt.book_no;


                default:
                    return tt.page_no;
            }
        }
    }

    private void data_bap() {

        String is_approved = "";
        String is_payed = "";
        String is_confirm = "";
        if (cb_status.getSelectedIndex() == 0) {
            is_approved = "yes";
            is_payed = "no";
            is_confirm = "no";
        }
        if (cb_status.getSelectedIndex() == 1) {
            is_approved = "yes";
            is_payed = "yes";
            is_confirm = "no";
        }

        String search = tf_search.getText();
//        String date = lb_date_baptism.getText();
//        String name = tf_searc.getText();
        loadData_baptism(S10_funeral.do_ret_funeral_payment(is_approved, is_payed, is_confirm));
    }

    private void do_add_baptism() {
        Window p = (Window) this;
        Dlg_add_funeral nd = Dlg_add_funeral.create(p, true);
        nd.setTitle("");
//        S8_baptism.to_baptism to = new S8_baptism.to_baptism("", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

//        nd.do_pass(to);
        nd.setCallback(new Dlg_add_funeral.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_funeral.OutputData data) {
                closeDialog.ok();
                add_baptism(data.data);
                data_bap();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

//    private void pm_tbl_users(MouseEvent evt) {
//        if (evt.isPopupTrigger()) {
//            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
//        }
//    }
    private void add_baptism(S10_funeral.to_funeral data) {
        S10_funeral.do_add(data);
        data_bap();
    }

    private void do_edit_baptism() {


        int row = tbl_baptism.getSelectedRow();
        if (row < 0) {
            return;
        }

        String burial_mass_number = tbl_baptism.getModel().getValueAt(row, 0).toString();
        String f_name = tbl_baptism.getModel().getValueAt(row, 2).toString();
        String l_name = tbl_baptism.getModel().getValueAt(row, 3).toString();
        String mi = tbl_baptism.getModel().getValueAt(row, 4).toString();
        String contact_number = tbl_baptism.getModel().getValueAt(row, 5).toString();
        String address = tbl_baptism.getModel().getValueAt(row, 6).toString();
        String cause_of_death = tbl_baptism.getModel().getValueAt(row, 7).toString();
        String date_buried = tbl_baptism.getModel().getValueAt(row, 8).toString();
        String buried_at = tbl_baptism.getModel().getValueAt(row, 9).toString();
        String scheduled_time = tbl_baptism.getModel().getValueAt(row, 10).toString();
        String scheduled_date = tbl_baptism.getModel().getValueAt(row, 11).toString();
        String priest = tbl_baptism.getModel().getValueAt(row, 12).toString();
        String book_no = tbl_baptism.getModel().getValueAt(row, 13).toString();
        String page_no = tbl_baptism.getModel().getValueAt(row, 14).toString();

//  "REF #", "NAME","f_name", "l_name", "mi", "contact_number", "ADDRESS", "cause_of_death",  "DATE", "TIME", "PRIEST", "book_no", "page_no"

        S10_funeral.to_funeral to = new S10_funeral.to_funeral(burial_mass_number, f_name, l_name, mi, contact_number, address, cause_of_death, date_buried, buried_at, scheduled_time, scheduled_date, priest, book_no, page_no);
        Window p = (Window) this;
        Dlg_add_funeral nd = Dlg_add_funeral.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_add_funeral.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_funeral.OutputData data) {
                closeDialog.ok();
                edit_baptism(data.data);
                data_bap();

            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void edit_baptism(S10_funeral.to_funeral data) {
        S10_funeral.edit_baptism(data);
    }

    private void do_remove() {
        int[] idx = tbl_baptism.getSelectedRows();

        final List<String> rem = new ArrayList();
        for (int ix : idx) {
            if (tbl_baptism.isRowSelected(ix)) {
//                int mx = tbl_marriage.convertRowIndexToModel(ix);
                String ref_no = tbl_baptism.getModel().getValueAt(ix, 0).toString();
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
            S10_funeral.delete_baptism(t);
        }
        JOptionPane.showMessageDialog(null, "Successfully Deleted");
    }

    private void do_pay() {
        int row = tbl_baptism.getSelectedRow();
        if (row < 0) {
            return;
        }
        final String ref_no = tbl_baptism.getModel().getValueAt(row, 0).toString();
        final String f_name = tbl_baptism.getModel().getValueAt(row, 1).toString();
//        String b_name = tbl_baptism.getModel().getValueAt(row, 9).toString();
//        String type = tbl_baptism.getModel().getValueAt(row, 25).toString();
//        final String name = g_name + " / " + b_name;
        Window p = (Window) this;
        Dlg_pay_rites nd = Dlg_pay_rites.create(p, true);
        nd.setTitle("");
        nd.do_pass("Funeral");
        nd.do_pass2("Ordinary");

        nd.setCallback(new Dlg_pay_rites.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_pay_rites.OutputData data) {
                closeDialog.ok();
                do_pay_funeral(ref_no, ref_no,data.amount,  f_name);
                data_bap();
            }

            @Override
            public void matrimony(CloseDialog closeDialog, OutputData2 data) {
                
            }
            
            
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_pay_funeral(String ref_no, String or_no, double amount, String name) {

        S9_payments.do_pay_other_funeral(ref_no, or_no, amount, name,"Funeral");

        
        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());

        
        String words = DigitToWord.convertToWordsIn(amount);
        String am = FitIn.fmt_wc_0(amount);

//        Reference_number.to_receipt to = new Reference_number.to_receipt(date, name, words, "Funeral", "CASH", am, or_no, ref_no);
//        Reference_number.print_receipt(to);

    }
}
