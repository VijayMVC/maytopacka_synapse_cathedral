/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.baptism;

import bb.dlg.Dlg_confirm;
import bb.dlg.Dlg_name;
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
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.S8_baptism.to_baptism;
import p.svc.S1_mass_schedules;
import p.svc.S3_cb_convenience;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_add_baptism extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_add_baptims
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

        public final S8_baptism.to_baptism data;
        public final ArrayListModel l;

        public OutputData(to_baptism data, ArrayListModel l) {
            this.data = data;
            this.l = l;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_add_baptism(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_add_baptism(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_add_baptism() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_add_baptism myRef;

    private void setThisRef(Dlg_add_baptism myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_add_baptism> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_add_baptism create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_add_baptism create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_add_baptism dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_baptism((java.awt.Frame) parent, false);
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
            Dlg_add_baptism dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_baptism((java.awt.Dialog) parent, false);
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


        Dlg_add_baptism dialog = Dlg_add_baptism.create(new javax.swing.JFrame(), true);
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
        dp_date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        tf_mi = new javax.swing.JTextField();
        tf_lname = new javax.swing.JTextField();
        tf_bplace = new javax.swing.JTextField();
        dp_bday = new com.toedter.calendar.JDateChooser();
        tf_father = new javax.swing.JTextField();
        tf_mother = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sponsors = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        tf_page_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cb_priest = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        lb_ref_no = new javax.swing.JLabel();

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
        getContentPane().add(dp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 220, -1));

        jLabel1.setText("TIME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        jLabel2.setText("PRIEST:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 388, 30));

        jLabel3.setText("FIRST NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 165, -1, -1));

        jLabel4.setText("MIDDLE NAME:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 205, -1, -1));

        jLabel5.setText("PLACE OF BIRTH:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 279, -1, -1));

        jLabel6.setText("MOTHER'S NAME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 378, -1, -1));

        jLabel7.setText("FATHER'S NAME:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 427, -1, -1));

        jLabel8.setText("LAST NAME:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 239, -1, -1));

        jLabel9.setText("DATE OF BIRTH:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 330, -1, -1));
        getContentPane().add(tf_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 160, 337, 30));
        getContentPane().add(tf_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 200, 337, 30));
        getContentPane().add(tf_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 234, 337, 30));
        getContentPane().add(tf_bplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 274, 337, 30));
        getContentPane().add(dp_bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 320, 200, 30));
        getContentPane().add(tf_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 422, 337, 30));
        getContentPane().add(tf_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 373, 337, 30));

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
        tbl_sponsors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_sponsorsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_sponsorsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sponsors);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 166, 417, 340));

        jLabel10.setText("BOOK NO.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 472, -1, -1));

        jLabel11.setText("PAGE NO.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 506, -1, -1));
        getContentPane().add(tf_book_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 467, 119, 30));
        getContentPane().add(tf_page_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 501, 119, 30));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 106, -1));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 518, 105, 40));

        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 518, 105, 40));

        jLabel12.setText("DATE:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 28));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 321, -1));

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel15.setText("REFERENCE #:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        lb_ref_no.setBackground(new java.awt.Color(0, 0, 0));
        lb_ref_no.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        lb_ref_no.setForeground(new java.awt.Color(0, 255, 0));
        lb_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ref_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_ref_no.setOpaque(true);
        getContentPane().add(lb_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        do_remove();
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here;
        add_sponsor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_sponsorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sponsorsMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_sponsorsMousePressed

    private void tbl_sponsorsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sponsorsMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_sponsorsMouseReleased

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        do_edit_sponsors();
    }//GEN-LAST:event_editActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_priest;
    private javax.swing.JComboBox cb_time;
    private javax.swing.JMenuItem delete;
    private com.toedter.calendar.JDateChooser dp_bday;
    private com.toedter.calendar.JDateChooser dp_date;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_ref_no;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTable tbl_sponsors;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_bplace;
    private javax.swing.JTextField tf_father;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_mi;
    private javax.swing.JTextField tf_mother;
    private javax.swing.JTextField tf_page_no;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        dp_bday.setDate(new Date());
        init_key();
        init_date();
        set_ref_no();
        init_tbl_sponsors();

        init_time();
        set_priest();
    }

    private void init_time() {
        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_bap);

    }

    private void set_ref_no() {
        lb_ref_no.setText("" + S1_mass_schedules.get_ref_number_baptism());
    }

    private void set_priest() {
        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);
    }

    private void init_date() {
        dp_date.setDate(new Date());
    }
    String bap_no = "";

    public void do_pass(S8_baptism.to_baptism to) {
//        dp_date.setDate(DateType.to.date_of_baptism);
        lb_ref_no.setText(to.baptismal_number);
        bap_no = to.baptismal_number;
        cb_priest.setSelectedItem(to.baptized_by);
        cb_time.setSelectedItem(to.time_of_baptism);
        tf_book_no.setText(to.book_number);
        tf_bplace.setText(to.place_of_birth);
        tf_father.setText(to.father);
        tf_mother.setText(to.mother);

        tf_fname.setText(to.child_fname);
        tf_lname.setText(to.child_lname);
        tf_mi.setText(to.child_mi);
        tf_page_no.setText(to.page_number);


        loadData_baptism2(S8_baptism.ret_data(to.baptismal_number));
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

    private void init_tbl_sponsors() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_sponsors.setModel(tbl_employee_payroll_M);
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

    private void loadData_baptism(List<S8_baptism.to_sponsors> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    private void loadData_baptism2(List<S8_baptism.to_sponsors> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "NAME", "id"
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
            S8_baptism.to_sponsors tt = (S8_baptism.to_sponsors) getRow(row);

            switch (col) {
                case 0:
                    return tt.name;

                default:
                    return tt.id;
            }
        }
    }

    private void data_employee() {
//        String date = lb_date_baptism.getText();
//        String name = tf_searc.getText();
    }

    private void pm_tbl_users(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void add_sponsor() {
        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_name.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_name.OutputData data) {
                closeDialog.ok();
                set_sporsors(data.name);
            }
        });
        Center.setCenter(nd);
//        Application.locateOnParentCenter(p, nd);

        nd.setVisible(true);
    }

    private void set_sporsors(String name) {
        List<S8_baptism.to_sponsors> datas = new ArrayList();
        S8_baptism.to_sponsors to = new S8_baptism.to_sponsors(name, "0");
        datas.add(to);
        loadData_baptism(datas);
    }

    private void do_edit_sponsors() {
        int idx = tbl_sponsors.getSelectedRow();
        if (idx < 0) {
            return;
        }

        String name = tbl_sponsors.getModel().getValueAt(idx, 0).toString();
        S8_baptism.to_sponsors order = (S8_baptism.to_sponsors) tbl_employee_payroll_ALM.get(tbl_sponsors.convertRowIndexToModel(idx));

        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");
        nd.do_pass(name);
//        nd.load(new Dlg_name.InputData(order.souls_of));
        nd.setCallback(new Dlg_name.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_name.OutputData data) {
                set_val(closeDialog, data);
                closeDialog.ok();

            }
        });
        Application.locateOnParentCenter(p, nd);

        nd.setVisible(true);
    }

    private void set_val(CloseDialog closeDialog, Dlg_name.OutputData data) {
        int idx = tbl_sponsors.getSelectedRow();
        if (idx < 0) {
            return;
        }

        S8_baptism.to_sponsors order = (S8_baptism.to_sponsors) tbl_employee_payroll_ALM.get(tbl_sponsors.convertRowIndexToModel(idx));
        order.setName(data.name);

        tbl_employee_payroll_M.fireTableDataChanged();

        tbl_sponsors.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_sponsors);


    }

    private void do_remove() {

        final int[] idx = tbl_sponsors.getSelectedRows();


        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                List rem = new ArrayList();
                for (int ix : idx) {
                    if (tbl_sponsors.isRowSelected(ix)) {
                        int mx = tbl_sponsors.convertRowIndexToModel(ix);
                        rem.add(tbl_employee_payroll_ALM.get(mx));
                    }
                }

                tbl_employee_payroll_ALM.removeAll(rem);
                tbl_employee_payroll_M.fireTableDataChanged();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

    }

    private void ok1() {

        String baptismal_number = lb_ref_no.getText();
        String child_fname = tf_fname.getText();
        String child_lname = tf_lname.getText();
        String child_mi = tf_mi.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String place_of_birth = tf_bplace.getText();
        String date_of_birth = DateType.sf.format(dp_bday.getDate());
        String date_of_baptism = DateType.sf.format(dp_date.getDate());
        String time_of_baptism = cb_time.getSelectedItem().toString();
        String baptized_by = cb_priest.getSelectedItem().toString();
        String book_number = "0";
        String page_number = "0";
        String date_added = DateType.datetime.format(new Date());
        String date_modified = DateType.sf.format(new Date());
        if (tbl_employee_payroll_ALM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input Sponsors");
            return;
        }
        to_baptism to = new to_baptism(baptismal_number, child_fname, child_lname, child_mi, father, mother, place_of_birth, date_of_birth, date_of_baptism, time_of_baptism, baptized_by, book_number, page_number, date_added, date_modified);

        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(to, tbl_employee_payroll_ALM));
        }
    }
}
