/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.mass;

import bb.dlg.Dlg_confirm;
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
import p.svc.S1_mass_schedules;
import p.svc.S1_mass_schedules.to_name;
import p.svc.S3_cb_convenience;

/**
 *
 * @author i1
 */
public class Dlg_view_intention_records extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_view_intention_records
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
    private Dlg_view_intention_records(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_view_intention_records(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_view_intention_records() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_view_intention_records myRef;

    private void setThisRef(Dlg_view_intention_records myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_view_intention_records> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_view_intention_records create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_view_intention_records create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_view_intention_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_view_intention_records((java.awt.Frame) parent, false);
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
            Dlg_view_intention_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_view_intention_records((java.awt.Dialog) parent, false);
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


        Dlg_view_intention_records dialog = Dlg_view_intention_records.create(new javax.swing.JFrame(), true);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_records = new javax.swing.JTable();
        cb_time = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cb_types = new javax.swing.JComboBox();

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

        jLabel1.setText("CHOOSE TIME:");

        tbl_records.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_recordsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_recordsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_records);

        cb_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_timeActionPerformed(evt);
            }
        });

        jLabel2.setText("TYPE:");

        cb_types.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thanks Giving", "Common", "Petition Mass", "Requiem Mass" }));
        cb_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_typesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_types, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cb_types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_timeActionPerformed
        // TODO add your handling code here:
        data_records();
    }//GEN-LAST:event_cb_timeActionPerformed

    private void cb_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_typesActionPerformed
        // TODO add your handling code here:
        data_records();
    }//GEN-LAST:event_cb_typesActionPerformed

    private void tbl_recordsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_recordsMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_recordsMousePressed

    private void tbl_recordsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_recordsMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);;
    }//GEN-LAST:event_tbl_recordsMouseReleased

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        do_edit();
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        do_delete();
    }//GEN-LAST:event_deleteActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_time;
    private javax.swing.JComboBox cb_types;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTable tbl_records;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        cb_init();
        init_tbl_intention_records();
    }

    private void cb_init() {


        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time);


        AutoCompleteDecorator.decorate(cb_time);
    }
    String dates = "";

    public void do_pass(String date) {
        dates = date;
        data_records();
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

    private void pm_tbl_users(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_intention_records() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_records.setModel(tbl_employee_payroll_M);
        tbl_records.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_records.setRowHeight(25);

//        tbl_records.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 0, 0, 200, 100, 0, 100, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_records, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_records.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_records.setRowHeight(35);
        tbl_records.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_baptism(List<S1_mass_schedules.to_intention_records> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Reference No.", "date", "time", "PARISHIONER", "CONTACT #", "mass_type", "MESSAGE", "priest"
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
            S1_mass_schedules.to_intention_records tt = (S1_mass_schedules.to_intention_records) getRow(row);

            switch (col) {
                case 0:
                    return tt.ref_num;
                case 1:
                    return tt.date;
                case 2:
                    return tt.time;
                case 3:
                    return tt.name;
                case 4:
                    return tt.contact;
                case 5:
                    return tt.mass_type;
                case 6:
                    return tt.message;
                default:
                    return tt.priest;
            }
        }
    }

    private void data_records() {
//        String date = lb_date_baptism.getText();
        String time = cb_time.getSelectedItem().toString();
        String type = cb_types.getSelectedItem().toString();
        loadData_baptism(S1_mass_schedules.ret_intentions(dates, time, type));
    }

    private void do_edit() {

        int row = tbl_records.getSelectedRow();
        if (row < 0) {
            return;
        }

        final String ref_no = tbl_records.getModel().getValueAt(row, 0).toString();
        String name = tbl_records.getModel().getValueAt(row, 3).toString();
        String contact = tbl_records.getModel().getValueAt(row, 4).toString();
        String message = tbl_records.getModel().getValueAt(row, 6).toString();
        String priest = tbl_records.getModel().getValueAt(row, 7).toString();
        String type = tbl_records.getModel().getValueAt(row, 5).toString();

        if (type.equalsIgnoreCase("Requiem Mass")) {
            Window p = (Window) this;
            Dlg_mass_requiem nd = Dlg_mass_requiem.create(p, true);
            nd.setTitle("");
            nd.do_pass(name, contact, ref_no);
            nd.setCallback(new Dlg_mass_requiem.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_mass_requiem.OutputData data) {
                    closeDialog.ok();
                    do_edit_intention_requiem(ref_no, data.name, data.contact, data.to_name);
                    data_records();
                }
            });
            Center.setCenter(nd);

            nd.setVisible(true);
        } else {
            Window p = (Window) this;
            Dlg_mass_intention nd = Dlg_mass_intention.create(p, true);
            nd.setTitle("");
            nd.do_pass(name, contact, message);
            nd.setCallback(new Dlg_mass_intention.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_mass_intention.OutputData data) {
                    closeDialog.ok();
                    do_edit_intention(ref_no, data.name, data.contact, data.message);
                    data_records();
                }
            });
            Center.setCenter(nd);

            nd.setVisible(true);
        }


    }

    private void do_edit_intention_requiem(String ref_no, String name, String contact, List<to_name> to_name) {
        S1_mass_schedules.edit_intention_requiem(ref_no, name, contact, to_name);
    }

    private void do_edit_intention(String ref_no, String name, String contact, String message) {
        S1_mass_schedules.edit_intention(ref_no, name, contact, message);
    }

    private void do_delete() {
        int row = tbl_records.getSelectedRow();
        if (row < 0) {
            return;
        }

        final String ref_no = tbl_records.getModel().getValueAt(row, 0).toString();

        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                delete_intention(ref_no);
                data_records();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void delete_intention(String ref) {
        S1_mass_schedules.delete_intention(ref);
    }
}
