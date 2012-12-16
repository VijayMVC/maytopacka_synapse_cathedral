/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dlg_rate_settings.java
 *
 * Created on Feb 12, 2012, 10:10:29 PM
 */
package bb.dlg2;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.Application;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.FitIn;
import overallPOS.modules.share.utils.HelpScrollToView;
import overallPOS.modules.share.utils.TableWidthUtilities;
import p.svc.S1_ret_rites_fees;
import p.to.to_rites_fees;

/**
 *
 * @author Dummy
 */
public class dlg_rite_fees_settings extends javax.swing.JDialog {

    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;




    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, Data data);
    }

    public static class Data {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private dlg_rite_fees_settings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private dlg_rite_fees_settings(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public dlg_rite_fees_settings() {
        super();
        initComponents();
        myInit();

    }
    private dlg_rite_fees_settings myRef;

    private void setThisRef(dlg_rite_fees_settings myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, dlg_rite_fees_settings> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static dlg_rite_fees_settings create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static dlg_rite_fees_settings create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            dlg_rite_fees_settings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new dlg_rite_fees_settings((java.awt.Frame) parent, false);
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
            dlg_rite_fees_settings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new dlg_rite_fees_settings((java.awt.Dialog) parent, false);
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


        dlg_rite_fees_settings dialog = dlg_rite_fees_settings.create(new javax.swing.JFrame(), true);
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
//            validateTree();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rate = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cb_rites = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rb_special = new javax.swing.JRadioButton();
        rb_ord = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_rate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Rate"
            }
        ));
        tbl_rate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_rateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_rate);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 500, 330));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TYPE:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cb_rites.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_rites.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matrimony", "Confirmation", "Baptism", "Funeral", "Communion", "Prof. of Faith", "Acceptance", "2nd Marriage", " " }));
        cb_rites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ritesActionPerformed(evt);
            }
        });
        jPanel2.add(cb_rites, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 21, 210, 30));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, -1));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, -1));

        buttonGroup2.add(rb_special);
        rb_special.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_special.setText("Special");
        rb_special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_specialActionPerformed(evt);
            }
        });
        jPanel2.add(rb_special, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 30));

        buttonGroup2.add(rb_ord);
        rb_ord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_ord.setSelected(true);
        rb_ord.setText("Ordinary");
        rb_ord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ordActionPerformed(evt);
            }
        });
        jPanel2.add(rb_ord, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CHOOSE RITES:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lb_total.setBackground(new java.awt.Color(0, 0, 0));
        lb_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lb_total.setForeground(new java.awt.Color(0, 255, 0));
        lb_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_total.setText("0.00");
        lb_total.setOpaque(true);
        jPanel2.add(lb_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 240, 30));

        jLabel4.setText("TOTAL:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, 30));

        jButton4.setText("CLOSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_ordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ordActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_rb_ordActionPerformed

    private void rb_specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_specialActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_rb_specialActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        do_remove();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        do_edit_rites();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        add_rite();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_ritesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ritesActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_cb_ritesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_rateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_rateMouseClicked
        // TODO add your handling code here:
        enable_check();
    }//GEN-LAST:event_tbl_rateMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cb_rites;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_total;
    private javax.swing.JRadioButton rb_ord;
    private javax.swing.JRadioButton rb_special;
    private javax.swing.JTable tbl_rate;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_tbl();
        data_employee();
    }
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_rate.setModel(tbl_employee_payroll_M);
        tbl_rate.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_rate.setRowHeight(25);

//        tbl_rate.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {200, 100, 0, 0, 100};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_rate, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

    }

    private void loadData(List<to_rites_fees> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    private void loadData1(List<to_rites_fees> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Rate", "State", "id", "CHECK"
        };

        public TblInvoicesModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
//           
            if (column == 3) {
                return true;
            }

            return true;
        }

        @Override
        public Class getColumnClass(int col) {


            if (col == 4) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_rites_fees tt = (to_rites_fees) getRow(row);

            switch (col) {
                case 0:
                    return tt.name;
                case 1:
                    return tt.rate;
                case 2:
                    return tt.type;
                case 3:
                    return tt.id;

                default:
                    return tt.check;
            }
        }
    }

    private void enable_check() {
        int row = tbl_rate.getSelectedRow();
        if (row < 0) {
            return;
        }
        int idx = tbl_rate.getSelectedRow();
        if (idx < 0) {
            return;
        }
        boolean check = Boolean.parseBoolean(tbl_rate.getModel().getValueAt(row, 4).toString());

        if (check == true) {
            check = false;
        } else {
            check = true;
        }
        to_rites_fees order = (to_rites_fees) tbl_employee_payroll_ALM.get(tbl_rate.convertRowIndexToModel(idx));
        order.setCheck(check);

        tbl_employee_payroll_M.fireTableDataChanged();

        tbl_rate.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_rate);
        do_compute();

    }

    private void do_compute() {
        List<to_rites_fees> datas = tbl_employee_payroll_ALM;
        double amount = 0;
        for (to_rites_fees to : datas) {
            
            boolean check=to.check;
            if(check==true){
                 amount += to.rate;
            }
           
        }
        lb_total.setText(FitIn.fmt_wc_0(amount));
    }

    private void data_employee() {

        String rites = cb_rites.getSelectedItem().toString();
        if (rites.equals("Matrimony")) {
            rb_ord.setVisible(true);
            rb_special.setVisible(true);
            jLabel1.setVisible(true);
        } else {
            rb_ord.setVisible(false);
            rb_special.setVisible(false);
            jLabel1.setVisible(false);
        }
        String type = "";
        if (rites.equals("Funeral")) {
            rites = "Funeral";
        }

        String stat = "";

        if (rites.equals("Matrimony")) {
            if (rb_ord.isSelected()) {
                stat = "Ordinary";
            }
            if (rb_special.isSelected()) {
                stat = "Special";
            }
        } else {
            stat = "Ordinary";
        }



        loadData(S1_ret_rites_fees.ret_rate(rites, stat));
        do_compute();

    }

//    private void data_rite(String name, double rate, String states) {
////        tbl_employee_payroll_ALM.clear();
//        loadData1(S1_ret_rites_fees.add(tbl_employee_payroll_ALM, name, rate, states));
//    }
//    
    private void add_rite() {
        Window p = (Window) this;
        dlg_rites nd = dlg_rites.create(p, true);
        nd.setTitle("Prompt");
        String aw = "3";
        if (cb_rites.getSelectedItem().equals("Matrimony")) {
            if (rb_special.isSelected()) {
                aw = "1";
            } else {
                aw = "0";
            }

        } else {
            aw = "0";
        }
        nd.pass(aw);
        nd.setCallback(new dlg_rites.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, dlg_rites.Data data) {
                closeDialog.ok();
//                data_rite(data.name, data.rate, data.state);
                add(data.name, data.rate);
                data_employee();
                do_compute();
            }
        });
        Application.locateOnParentCenter(p, nd);

        nd.setVisible(true);
    }

    private void add(String name, double rate) {
        String stat = "";
        if (rb_ord.isSelected()) {
            stat = "Ordinary";
        }
        if (rb_special.isSelected()) {
            stat = "Special";
        }
        String type = cb_rites.getSelectedItem().toString();

        S1_ret_rites_fees.save_fees(name, rate, type, stat);

    }
//    

    private void do_edit_rites() {



        int row = tbl_rate.getSelectedRow();
        if (row < 0) {
//            return;
        } else {


            String name = tbl_rate.getModel().getValueAt(row, 0).toString();
            double rate = Double.parseDouble(tbl_rate.getModel().getValueAt(row, 1).toString());
            final String stat = tbl_rate.getModel().getValueAt(row, 2).toString();
            final String id = tbl_rate.getModel().getValueAt(row, 3).toString();

            Window p = (Window) this;
            dlg_rites1 nd = dlg_rites1.create(p, true);
            nd.setTitle("Prompt");

            String aw = "3";
            if (cb_rites.getSelectedItem().equals("Matrimony")) {
                if (rb_special.isSelected()) {
                    aw = "1";
                } else {
                    aw = "0";
                }

                nd.pass(name, rate, stat);
                nd.setCallback(new dlg_rites1.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, dlg_rites1.Data data) {
//                    set_val(closeDialog, data);
                        closeDialog.ok();
                        edit_fee(closeDialog, data, id);
                        data_employee();
                        do_compute();
                    }
                });
                Application.locateOnParentCenter(p, nd);

                nd.setVisible(true);
            } else {
                aw = "0";

                nd.pass(aw);
                nd.pass(name, rate, stat);
                nd.setCallback(new dlg_rites1.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, dlg_rites1.Data data) {
//                    set_val(closeDialog, data);
                        closeDialog.ok();
                        edit_fee(closeDialog, data, id);
                        data_employee();
                        do_compute();
                    }
                });
                Application.locateOnParentCenter(p, nd);

                nd.setVisible(true);
            }
        }
    }

    private void edit_fee(CloseDialog closeDialog, dlg_rites1.Data data, String id) {
        S1_ret_rites_fees.edit(data, id);
    }

    private void set_val(CloseDialog closeDialog, dlg_rites1.Data data) {
        int idx = tbl_rate.getSelectedRow();
        if (idx < 0) {
            return;
        }

        to_rites_fees order = (to_rites_fees) tbl_employee_payroll_ALM.get(tbl_rate.convertRowIndexToModel(idx));

        order.setName(data.name);
        order.setRate(data.rate);
        order.setType(data.state);

        tbl_employee_payroll_M.fireTableDataChanged();

        tbl_rate.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_rate);


    }
//    
    int i = 0;

    private void do_remove() {
        int[] idx = tbl_rate.getSelectedRows();

        List rem = new ArrayList();
        for (int ix : idx) {
            if (tbl_rate.isRowSelected(ix)) {
                int mx = tbl_rate.convertRowIndexToModel(ix);
                rem.add(tbl_employee_payroll_ALM.get(mx));
            }
        }

        int row = tbl_rate.getSelectedRow();
        if (row < 0) {
        } else {
            String name = tbl_rate.getModel().getValueAt(row, 0).toString();
            String stat = "0";
            if (cb_rites.getSelectedItem().equals("Matrimony")) {
                if (rb_special.isSelected()) {
                    stat = "Special";
                } else {
                    stat = "Ordinary";
                }
            } else {
                stat = "Ordinary";
            }
//            JOptionPane.showMessageDialog(null, name+ " "+stat + " "+cb_rites.getSelectedItem().toString());
            S1_ret_rites_fees.do_delete(name, stat, cb_rites.getSelectedItem().toString());


        }
        tbl_employee_payroll_ALM.removeAll(rem);
        tbl_employee_payroll_M.fireTableDataChanged();
        data_employee();
        do_compute();

    }

    private void do_save() {
        String stat = "";
        if (rb_ord.isSelected()) {
            stat = "Ordinary";
        }
        if (rb_special.isSelected()) {
            stat = "Special";
        }
        String type = cb_rites.getSelectedItem().toString();

        S1_ret_rites_fees.do_save_fees(tbl_employee_payroll_ALM, type, stat);

//        tbl_employee_payroll_ALM.clear();


    }
}
