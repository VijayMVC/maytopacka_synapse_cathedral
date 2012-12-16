/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.confirmation;

import p.baptism.*;
import bb.dlg.Dlg_confirm;
import bb.dlg.Dlg_mass_time;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.Center;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import overallPOS.modules.share.utils.TableWidthUtilities;
import p.baptism.S8_baptism.to_baptism;
import p.svc.S3_cb_convenience;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_confirmation extends javax.swing.JDialog {

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
    private Dlg_confirmation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_confirmation(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_confirmation() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_confirmation myRef;

    private void setThisRef(Dlg_confirmation myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_confirmation> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_confirmation create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_confirmation create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_confirmation dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_confirmation((java.awt.Frame) parent, false);
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
            Dlg_confirmation dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_confirmation((java.awt.Dialog) parent, false);
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


        Dlg_confirmation dialog = Dlg_confirmation.create(new javax.swing.JFrame(), true);
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
        approve = new javax.swing.JMenuItem();
        confirm = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_confirmation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jc_date = new com.toedter.calendar.JDateChooser();
        cb_status = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sponsors = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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

        approve.setText("APPROVE");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });
        pm_pop.add(approve);

        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        pm_pop.add(confirm);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_confirmationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_confirmationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_confirmationMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_confirmation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 177, 920, 580));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("SEARCH:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 130, -1, 39));

        tf_search.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });
        getContentPane().add(tf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 132, 586, 37));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("CLOSE");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, -1, 40));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 77, 37));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("DATE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, -1, 30));

        jc_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jc_datePropertyChange(evt);
            }
        });
        jPanel1.add(jc_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 240, 34));

        cb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WAITING", "APPROVED", "BAPTIZED" }));
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
            }
        });
        jPanel1.add(cb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, 240, 35));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("STATUS:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONFIRMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 920, -1));

        tbl_sponsors.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_sponsors);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 420, 520));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SPONSORS");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 420, 30));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_timeActionPerformed(evt);
            }
        });
        jPanel1.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 240, 33));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("TIME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, -1, 30));

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 90, 50, 38));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 420, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        do_add_baptism();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_confirmationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_confirmationMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_confirmationMousePressed

    private void tbl_confirmationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_confirmationMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_confirmationMouseReleased

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        do_edit_baptism();
    }//GEN-LAST:event_editActionPerformed

    private void tbl_confirmationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_confirmationMouseClicked
        // TODO add your handling code here:
        data_sponsors();
    }//GEN-LAST:event_tbl_confirmationMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        do_remove();
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        do_mass_time();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        // TODO add your handling code here:
        data_bap();
    }//GEN-LAST:event_cb_statusActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
        data_bap();
    }//GEN-LAST:event_tf_searchKeyReleased

    private void jc_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jc_datePropertyChange
        // TODO add your handling code here:
        data_bap_by_date();
    }//GEN-LAST:event_jc_datePropertyChange

    private void cb_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_timeActionPerformed
        // TODO add your handling code here:
        data_bap_by_date();
    }//GEN-LAST:event_cb_timeActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        // TODO add your handling code here:
        approve_confirmation();
    }//GEN-LAST:event_approveActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        confirm_confirmation();
    }//GEN-LAST:event_confirmActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem approve;
    private javax.swing.JComboBox cb_status;
    private javax.swing.JComboBox cb_time;
    private javax.swing.JMenuItem confirm;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jc_date;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTable tbl_confirmation;
    private javax.swing.JTable tbl_sponsors;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        jc_date.setDate(new Date());
        init_key();
        init_time();
        init_tbl_baptism();
        jj = 2;
        data_bap();
        init_tbl_sponsors();
    }
    int jj = 0;

    private void init_time() {
        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_con);

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
//        String date = lb_date_baptism.getText();
//        String name = tf_searc.getText();
        String is_approved = "";
        String is_payed = "";
        String is_married = "";
        if (cb_status.getSelectedIndex() == 0) {
            is_approved = "no";
            is_payed = "no";
            is_married = "no";
        }
        if (cb_status.getSelectedIndex() == 1) {
            is_approved = "yes";
            is_payed = "yes";
            is_married = "no";
        }
        if (cb_status.getSelectedIndex() == 2) {
            is_approved = "yes";
            is_payed = "yes";
            is_married = "yes";
        }
        String name = tf_search.getText();
        loadData_baptism(S9_confirmation.do_ret_confirmation(is_approved, is_payed, is_married, name));

    }

    private void data_bap_by_date() {
//        String date = lb_date_baptism.getText();
//        String name = tf_searc.getText();
        String is_approved = "";
        String is_payed = "";
        String is_married = "";
        if (jj == 0) {
        } else {

            if (cb_status.getSelectedIndex() == 0) {
                is_approved = "no";
                is_payed = "no";
                is_married = "no";
            }
            if (cb_status.getSelectedIndex() == 1) {
                is_approved = "yes";
                is_payed = "yes";
                is_married = "no";
            }
            if (cb_status.getSelectedIndex() == 2) {
                is_approved = "yes";
                is_payed = "yes";
                is_married = "yes";
            }

            String name = tf_search.getText();

            String time = cb_time.getSelectedItem().toString();

            String date = "";

            if (jc_date.getDate() == null) {
            } else {
                date = DateType.sf.format(jc_date.getDate());
            }

            loadData_baptism(S9_confirmation.do_ret_confirmation_by_date(is_approved, is_payed, is_married, name, date, time));

        }


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
                data_sponsors2(confirmation_no);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void edit_baptism(S9_confirmation.to_confirmation data, ArrayListModel l) {
        S9_confirmation.edit_confirmation(data, l);
    }

    private void approve_confirmation() {
        int row = tbl_confirmation.getSelectedRow();
        if (row < 0) {
            return;
        }

        final String confirmation_no = tbl_confirmation.getModel().getValueAt(row, 0).toString();
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                do_approve(confirmation_no);
                 data_bap();
                clear();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_approve(String confirmation_no) {
        S9_confirmation.approve_confirmation(confirmation_no);
    }

    private void confirm_confirmation() {
        int row = tbl_confirmation.getSelectedRow();
        if (row < 0) {
            return;
        }

        final String confirmation_no = tbl_confirmation.getModel().getValueAt(row, 0).toString();
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                do_confirm(confirmation_no);
                 data_bap();
                clear();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_confirm(String confirmation_no) {
        S9_confirmation.confirm_confirmation(confirmation_no);
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
                clear();

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

    private void clear() {
        tbl_sponsors_ALM.clear();
        tbl_sponsors_M.fireTableDataChanged();
    }
    private ArrayListModel tbl_sponsors_ALM;
    private TblsponsorsModel tbl_sponsors_M;
////    

    private void init_tbl_sponsors() {
        tbl_sponsors_ALM = new ArrayListModel();
        tbl_sponsors_M = new TblsponsorsModel(tbl_sponsors_ALM);


        tbl_sponsors.setModel(tbl_sponsors_M);
        tbl_sponsors.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_sponsors.setRowHeight(25);

//        tbl_sponsors.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_sponsors, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_sponsors.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_sponsors.setRowHeight(35);
        tbl_sponsors.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_sponsors(List<S9_confirmation.to_sponsors> acc) {
        tbl_sponsors_ALM.clear();
        tbl_sponsors_ALM.addAll(acc);
    }

    public static class TblsponsorsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "NAME", "id"
        };

        public TblsponsorsModel(ListModel listmodel) {
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
            S9_confirmation.to_sponsors tt = (S9_confirmation.to_sponsors) getRow(row);

            switch (col) {
                case 0:
                    return tt.name;

                default:
                    return tt.id;
            }
        }
    }

    private void data_sponsors() {

        int row = tbl_confirmation.getSelectedRow();
        if (row < 0) {
            return;
        }

        String baptism_number = tbl_confirmation.getModel().getValueAt(row, 0).toString();
        loadData_sponsors(S9_confirmation.ret_data(baptism_number));

    }

    private void data_sponsors2(String num) {
//
//        int row = tbl_confirmation.getSelectedRow();
//        if (row < 0) {
//            return;
//        }
//
//        String baptism_number = tbl_confirmation.getModel().getValueAt(row, 0).toString();
        loadData_sponsors(S9_confirmation.ret_data(num));

    }
}
