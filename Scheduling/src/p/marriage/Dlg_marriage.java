/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.marriage;

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
import p.svc.S3_cb_convenience;
import p.svc.S7_marriage;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class Dlg_marriage extends javax.swing.JDialog {

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
    private Dlg_marriage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_marriage(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_marriage() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_marriage myRef;

    private void setThisRef(Dlg_marriage myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_marriage> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_marriage create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_marriage create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_marriage dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage((java.awt.Frame) parent, false);
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
            Dlg_marriage dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage((java.awt.Dialog) parent, false);
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


        Dlg_marriage dialog = Dlg_marriage.create(new javax.swing.JFrame(), true);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_marriage = new javax.swing.JTable();
        cb_time = new javax.swing.JComboBox();
        cb_status = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        jc_date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sponsors = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        pm_encoder.add(confirm);

        pay.setText("PAY");
        pm_cashier.add(pay);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_marriageMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_marriageMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_marriageMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_marriage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 201, 900, 560));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_timeActionPerformed(evt);
            }
        });
        jPanel1.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 220, 33));

        cb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WAITING", "APPROVED", "MARRIED" }));
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
            }
        });
        jPanel1.add(cb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, 208, 32));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("STATUS:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 78, 32));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("TIME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, -1, -1));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 91, 36));

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 90, 50, 38));

        tf_search.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });
        jPanel1.add(tf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 160, 600, 30));

        jc_date.setToolTipText("");
        jc_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jc_datePropertyChange(evt);
            }
        });
        jPanel1.add(jc_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 208, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("DATE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 105, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 427, 530));

        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, -1, 39));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SPONSORS");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 420, 30));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 420, 180));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MATRIMONY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 890, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("SEARCH:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        edit_marriage();
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
        do_remove();
    }//GEN-LAST:event_deleteActionPerformed

    private void approvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedActionPerformed
        // TODO add your handling code here:
        do_approved();
    }//GEN-LAST:event_approvedActionPerformed

    private void tbl_marriageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_marriageMouseClicked
        // TODO add your handling code here:
        select_witness();
    }//GEN-LAST:event_tbl_marriageMouseClicked

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_tf_searchKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        do_add_marriage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        do_mass_time();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_cb_statusActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        do_confirm();
    }//GEN-LAST:event_confirmActionPerformed

    private void cb_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_timeActionPerformed
        // TODO add your handling code here:
        data_employee_date();
    }//GEN-LAST:event_cb_timeActionPerformed

    private void jc_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jc_datePropertyChange
        // TODO add your handling code here:
        data_employee_date();
    }//GEN-LAST:event_jc_datePropertyChange
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem approved;
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
    private javax.swing.JMenuItem pay;
    private javax.swing.JPopupMenu pm_cashier;
    private javax.swing.JPopupMenu pm_encoder;
    private javax.swing.JTable tbl_marriage;
    private javax.swing.JTable tbl_sponsors;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        jc_date.setDate(new Date());
        init_key();
        init_time();
        init_tbl_marriage();
        jj = 2;
        data_employee();
        init_tbl_witnesses();
    }
    int jj = 0;

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
        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_mat);

    }
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_marriage() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_marriage.setModel(tbl_employee_payroll_M);
        tbl_marriage.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tbl_marriage.setRowHeight(25);

//        tbl_marriage.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {60, 0, 100, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 150, 150, 150, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 2 || i == 9) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_marriage, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.s
//          TableWidthUtilities.
        }

        tbl_marriage.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_marriage.setRowHeight(35);
        tbl_marriage.setFont(new java.awt.Font("Arial", 1, 12));
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
//        String name = tf_searc.getText();
        loadData_baptism(S7_marriage.ret_data(is_approved, is_payed, is_married, name));
    }

    private void data_employee_date() {
//        String date = lb_date_baptism.getText();

        if (jj == 0) {
        } else {

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
            String time = cb_time.getSelectedItem().toString();
            
            String date="";
            
            if(jc_date.getDate()==null){
                
            }else{
                date=DateType.sf.format(jc_date.getDate());
            }
//            System.out.println(is_approved +" - "+is_payed+ " - "+is_married);
//            JOptionPane.showMessageDialog(null, "adadad");
//        String name = tf_searc.getText();
            loadData_baptism(S7_marriage.ret_data_by_date(is_approved, is_payed, is_married, name,date , time));
        }

    }

    private void do_add_marriage() {
        S7_marriage.to_edit_marriage to = new S7_marriage.to_edit_marriage(
                "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", new Date(), "");
        Window p = (Window) this;
        Dlg_add_marriage_details nd = Dlg_add_marriage_details.create(p, true);
        nd.setTitle("");
        nd.do_pass("");
        nd.setCallback(new Dlg_add_marriage_details.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_marriage_details.OutputData data) {
                closeDialog.ok();
                add_marriage(data.ref_no, data.g_fname, data.g_lname, data.g_mi, data.g_faname, data.g_moname, data.g_address, data.b_fname, data.b_lname, data.b_mi, data.b_faname, data.b_moname, data.b_address, data.priest, data.g_contact, data.b_contact, data.wedding_type, data.wit);
                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void add_marriage(String marriage_number, String groom_fname, String groom_lname, String groom_mname, String groom_father, String groom_mother, String groom_address, String bride_fname, String bride_lname, String bride_mname, String bride_father, String bride_mother, String bride_address, String solemnized_by, String g_contact, String b_contact, String wedding_type, List<S7_marriage.to_witnesses> wit) {

        String series_of = "";

        String date_of_marriage = DateType.datetime.format(jc_date.getDate());
        String time_of_marriage = cb_time.getSelectedItem().toString();

        String date_added = DateType.datetime.format(new Date());
        S7_marriage.to_marriage_details to = new S7_marriage.to_marriage_details(
                marriage_number, series_of, groom_fname, groom_lname, groom_mname, groom_father, groom_mother, groom_address, bride_fname, bride_lname, bride_mname, bride_father, bride_mother, bride_address, date_of_marriage, time_of_marriage, solemnized_by, "0", "0", date_added, g_contact, b_contact, wedding_type);
        S7_marriage.do_add_marriage(to, wit);

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
                init_time();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void edit_marriage() {
        int row = tbl_marriage.getSelectedRow();
        if (row < 0) {
            return;
        }

//                  "REF #"0
//                , "series_of"1
//                , "GROOM NAME"2
//                , "groom_fname"3, "groom_lname"4, "groom_mname"5, "groom_father"6, "groom_mother"7, "groom_address"8
//                 , "BRIDE NAME"9
//                , "bride_fname"10, "bride_lname"11, "bride_mname"12, "bride_father"13," bride_mother"14," bride_address "15
//                , "DATE OF MARRIAGE"16
//                , "TIME"17
//                , "PRIEST"18
//                , "book_number"19
//                ," page_number"20
//                ," date_added"21
//                ,"CONTACT #"22
//                ,"groom_contact"23,"bride_contact"24,"Wedding Type"25

        final String marriage_number = tbl_marriage.getModel().getValueAt(row, 0).toString();
        String wedding_type = tbl_marriage.getModel().getValueAt(row, 25).toString();
        String g_fname = tbl_marriage.getModel().getValueAt(row, 3).toString();
        String g_mi = tbl_marriage.getModel().getValueAt(row, 4).toString();
        String g_lname = tbl_marriage.getModel().getValueAt(row, 5).toString();
        String g_moname = tbl_marriage.getModel().getValueAt(row, 7).toString();
        String g_faname = tbl_marriage.getModel().getValueAt(row, 6).toString();
        String b_fname = tbl_marriage.getModel().getValueAt(row, 10).toString();
        String b_mi = tbl_marriage.getModel().getValueAt(row, 11).toString();
        String b_lname = tbl_marriage.getModel().getValueAt(row, 12).toString();
        String b_moname = tbl_marriage.getModel().getValueAt(row, 14).toString();
        String b_faname = tbl_marriage.getModel().getValueAt(row, 13).toString();
        String ref_no = tbl_marriage.getModel().getValueAt(row, 0).toString();
        String g_contact = tbl_marriage.getModel().getValueAt(row, 23).toString();
        String g_address = tbl_marriage.getModel().getValueAt(row, 8).toString();
        String b_contact = tbl_marriage.getModel().getValueAt(row, 24).toString();
        String b_address = tbl_marriage.getModel().getValueAt(row, 15).toString();
        String priest = tbl_marriage.getModel().getValueAt(row, 18).toString();
        Date date_added = new Date();
        String time = tbl_marriage.getModel().getValueAt(row, 17).toString();

        S7_marriage.to_edit_marriage to = new S7_marriage.to_edit_marriage(
                wedding_type, g_fname, g_mi, g_lname, g_moname, g_faname, b_fname, b_mi, b_lname, b_moname, b_faname, ref_no, g_contact, g_address, b_contact, b_address, priest, date_added, time);

        Window p = (Window) this;
        Dlg_add_marriage_details nd = Dlg_add_marriage_details.create(p, true);
        nd.setTitle("");
        nd.do_pass(marriage_number);
        nd.do_pass2(to);
        nd.setCallback(new Dlg_add_marriage_details.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_marriage_details.OutputData data) {
                closeDialog.ok();
                S7_marriage.to_edit_marriage to1 = new S7_marriage.to_edit_marriage(
                        data.wedding_type, data.g_fname, data.g_mi, data.g_lname, data.g_moname, data.g_faname, data.b_fname, data.b_mi, data.b_lname, data.b_moname, data.b_faname, data.ref_no, data.g_contact, data.g_address, data.b_contact, data.b_address, data.priest, data.date_added, data.time);
                do_edit(to1, data.wit);
                data_employee();
                loadData_baptism2(S7_marriage.ret_witnesses(marriage_number));
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_edit(S7_marriage.to_edit_marriage to1, List<S7_marriage.to_witnesses> wit) {
        S7_marriage.edit_marriage(to1, wit);
    }

    private void pm_tbl_users(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_encoder.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void do_delete() {
        int row = tbl_marriage.getSelectedRow();
        if (row < 0) {
            return;
        }


    }

    private void do_remove() {
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
                remove(rem);
                data_employee();
                clear();

            }
        });

        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void clear() {
        tbl_witness_ALM.clear();
        tbl_witness_M.fireTableDataChanged();
    }

    private void remove(List<String> datas) {
        for (String t : datas) {
            S7_marriage.delete_marriage(t);
        }
        JOptionPane.showMessageDialog(null, "Successfully Deleted");
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

    private void approve(List<String> datas) {
        for (String t : datas) {
            S7_marriage.approve_marriage(t);
        }
        JOptionPane.showMessageDialog(null, "Successfully Updated");
    }

    private void do_confirm() {
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
                confirm(rem);
                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void confirm(List<String> datas) {
        for (String t : datas) {
            S7_marriage.confirm_marriage(t);
        }
        clear();
        JOptionPane.showMessageDialog(null, "Successfully Updated");
    }
    private ArrayListModel tbl_witness_ALM;
    private TblwitnessModel tbl_witness_M;
////    

    private void init_tbl_witnesses() {
        tbl_witness_ALM = new ArrayListModel();
        tbl_witness_M = new TblwitnessModel(tbl_witness_ALM);


        tbl_sponsors.setModel(tbl_witness_M);
        tbl_sponsors.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_sponsors.setRowHeight(25);

//        tbl_sponsors.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {0, 0, 100};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_sponsors, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_sponsors.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_sponsors.setRowHeight(35);
        tbl_sponsors.setFont(new java.awt.Font("Arial", 1, 12));
    }

    private void loadData_witness(List<S7_marriage.to_witnesses> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_witness_ALM.addAll(acc);
    }

    private void loadData_baptism2(List<S7_marriage.to_witnesses> acc) {
        tbl_witness_ALM.clear();
        tbl_witness_ALM.addAll(acc);
    }

    public static class TblwitnessModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "marriage_no", "NAME"
        };

        public TblwitnessModel(ListModel listmodel) {
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
            S7_marriage.to_witnesses tt = (S7_marriage.to_witnesses) getRow(row);

            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return tt.marriage_number;

                default:
                    return tt.name;
            }
        }
    }

    private void select_witness() {
        int row = tbl_marriage.getSelectedRow();
        if (row < 0) {
            return;
        }

        String marriage_number = tbl_marriage.getModel().getValueAt(row, 0).toString();
//        System.out.println(marriage_number);
        ret_witnesses(marriage_number);
    }

    private void ret_witnesses(String marriage_num) {
//        String date = lb_date_baptism.getText();

        loadData_baptism2(S7_marriage.ret_witnesses(marriage_num));

    }
}
