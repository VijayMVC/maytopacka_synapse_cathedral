/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bb.dlg;

import bb.dlg2.Dlg_add_official;
import bb.dlg2.Dlg_designation;
import bb.dlg2.Dlg_edit_official;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import overallPOS.modules.share.utils.Center;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import overallPOS.modules.share.utils.TableWidthUtilities;
import p.svc.S3_cb_convenience;
import p.svc.S8_officials;

/**
 *
 * @author dummy
 */
public class Dlg_officials extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_officials
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

        public final String priest;

        public OutputData(String priest) {
            this.priest = priest;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_officials(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_officials(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_officials() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_officials myRef;

    private void setThisRef(Dlg_officials myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_officials> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_officials create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_officials create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_officials dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_officials((java.awt.Frame) parent, false);
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
            Dlg_officials dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_officials((java.awt.Dialog) parent, false);
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


        Dlg_officials dialog = Dlg_officials.create(new javax.swing.JFrame(), true);
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
        cb_position = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_official = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_position.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cb_position.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIEST" }));
        cb_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_positionActionPerformed(evt);
            }
        });
        jPanel1.add(cb_position, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 400, 34));

        jLabel1.setText("DESIGNATION:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 34));

        tbl_official.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_official.setFocusable(false);
        tbl_official.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_officialMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_officialMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_officialMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_official);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 191, 800, 497));

        jButton1.setText("ADD");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 90, 38));

        jLabel2.setText("Search Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, 30));

        tf_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_nameKeyReleased(evt);
            }
        });
        jPanel1.add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 489, 38));

        jButton2.setText("+");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 53, 34));

        jButton3.setText("CLOSE");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 650, 90, 38));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("OFFICIALS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 930, -1));

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_positionActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_cb_positionActionPerformed

    private void tf_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameKeyReleased
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_tf_nameKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        do_add();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_officialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_officialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_officialMouseClicked

    private void tbl_officialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_officialMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_officialMousePressed

    private void tbl_officialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_officialMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_officialMouseReleased

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        do_edit();
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        do_delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        do_designations();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ok2();
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_position;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTable tbl_official;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        jButton4.setVisible(false);
        init_designation();
        AutoCompleteDecorator.decorate(cb_position);
        init_tbl_official();
        data_employee();

    }

    private void init_designation() {
        S3_cb_convenience.cb_init(cb_position, S3_cb_convenience.s_designation);
    }

    public void do_pass() {
        data_employee();
    }

    public void do_pass2(String name) {
        jButton4.setVisible(true);
        tf_name.setText(name);
        tf_name.grabFocus();
        data_employee();
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
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_PLUS, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                jButton1.doClick();
//                disposed();
            }
        });
    }
    // </editor-fold>
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_official() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_official.setModel(tbl_employee_payroll_M);
        tbl_official.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_official.setRowHeight(25);

//        tbl_official.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {200, 150, 0, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_official, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_official.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_official.setRowHeight(35);
        tbl_official.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_baptism(List<S8_officials.to_official> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "NAME", "CONTACT #", "id", "is_manager"
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
            S8_officials.to_official tt = (S8_officials.to_official) getRow(row);

            switch (col) {
            case 0:
                return tt.name;
            case 1:
                return tt.contact;
            case 2:
                return tt.id;

            default:
                return tt.is_manager;
            }
        }
    }

    private void data_employee() {
//        String date = lb_date_baptism.getText();
        String designation = cb_position.getSelectedItem().toString();
        String name = tf_name.getText();
        loadData_baptism(S8_officials.ret_datas(designation, name));
    }

    private void do_add() {
        final String designation = cb_position.getSelectedItem().toString();
        Window p = (Window) this;
        Dlg_add_official nd = Dlg_add_official.create(p, true);
        nd.setTitle("");
        nd.do_pass("", "");
        nd.setCallback(new Dlg_add_official.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_official.OutputData data) {
//                closeDialog.ok();
                add_official(data.name, data.contact, designation, data.is_manager);
                data_employee();
//                ok1();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

    }

    private void ok1() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(""));
        }
    }

    private void ok2() {
        int row = tbl_official.getSelectedRow();
        if (row < 0) {
            return;
        }

        String name = tbl_official.getModel().getValueAt(row, 0).toString();
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(name));
        }
    }

    private void add_official(String name, String contact, String designation, String is_manager) {
        S8_officials.add_official(name, contact, designation, is_manager);
    }

    private void pm_tbl_users(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void do_edit() {
        int row = tbl_official.getSelectedRow();
        if (row < 0) {
            return;
        }
        String designation = cb_position.getSelectedItem().toString();
        String name = tbl_official.getModel().getValueAt(row, 0).toString();
        String contact = tbl_official.getModel().getValueAt(row, 1).toString();
        String is_manager = tbl_official.getModel().getValueAt(row, 3).toString();
        final String id = tbl_official.getModel().getValueAt(row, 2).toString();
        Window p = (Window) this;
        Dlg_edit_official nd = Dlg_edit_official.create(p, true);
        nd.setTitle("");
        nd.do_pass(name, contact, designation, is_manager);
        nd.setCallback(new Dlg_edit_official.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_edit_official.OutputData data) {
                closeDialog.ok();
//                add_official(data.name,data.contact,designation);
                edit_official(data.name, data.contact, data.designation, id, data.is_manager);
                data_employee();
                ok1();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void edit_official(String name, String contact, String designation, String id, String is_manager) {
        S8_officials.edit_official(name, contact, designation, id, is_manager);
    }

    private void do_delete() {
        int row = tbl_official.getSelectedRow();
        if (row < 0) {
            return;
        }

        final String id = tbl_official.getModel().getValueAt(row, 2).toString();
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                delete_official(id);
                data_employee();
                ok1();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void delete_official(String id) {
        S8_officials.delete_official(id);
    }

    private void do_designations() {
        Window p = (Window) this;
        Dlg_designation nd = Dlg_designation.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_designation.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_designation.OutputData data) {
//                closeDialog.ok();
                init_designation();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
}
