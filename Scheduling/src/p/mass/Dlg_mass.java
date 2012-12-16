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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.svc.S1_mass_schedules;
import p.svc.S1_mass_schedules.to_name;
import p.svc.S4_ret_number;
import p.svc.S5_save_new_mass_schedule;
import p.to.to_regular_mass;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_mass extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_mass
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
    private Dlg_mass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_mass(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_mass() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_mass myRef;

    private void setThisRef(Dlg_mass myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_mass> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_mass create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_mass create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_mass dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mass((java.awt.Frame) parent, false);
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
            Dlg_mass dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mass((java.awt.Dialog) parent, false);
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


        Dlg_mass dialog = Dlg_mass.create(new javax.swing.JFrame(), true);
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

        pm_time = new javax.swing.JPopupMenu();
        edit = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        view = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btn_ty = new javax.swing.JButton();
        btn_pt = new javax.swing.JButton();
        btn_co = new javax.swing.JButton();
        btn_requiem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_ty1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mass_schedules = new javax.swing.JTable();
        jc_date = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_ref_no = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        pm_time.add(edit);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        pm_time.add(delete);

        view.setText("VIEW RECORDS");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        pm_time.add(view);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(170, 220, 238));

        btn_ty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ty.setText("Thanks Giving");
        btn_ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tyActionPerformed(evt);
            }
        });

        btn_pt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_pt.setText("Petition Mass");
        btn_pt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ptActionPerformed(evt);
            }
        });

        btn_co.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_co.setText("Common");
        btn_co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coActionPerformed(evt);
            }
        });

        btn_requiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_requiem.setText("Requiem Mass");
        btn_requiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_requiemActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_ty1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ty1.setText("SCHEDULES");
        btn_ty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ty1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_ty1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(btn_ty, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_pt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_co, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_requiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_requiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_co, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ty1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbl_mass_schedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TIME ", "PRIEST", "ID"
            }
        ));
        tbl_mass_schedules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_mass_schedulesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_mass_schedulesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_mass_schedules);

        jc_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jc_dateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jc_dateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jc_dateMouseReleased(evt);
            }
        });
        jc_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jc_datePropertyChange(evt);
            }
        });
        jc_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jc_dateKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel1.setText("CHOOSE DATE:");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel2.setText("REFERENCE #:");

        lb_ref_no.setBackground(new java.awt.Color(0, 0, 0));
        lb_ref_no.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        lb_ref_no.setForeground(new java.awt.Color(0, 255, 0));
        lb_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ref_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_ref_no.setOpaque(true);

        jButton2.setText("RECORDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_ref_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jc_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_ref_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jc_date, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tyActionPerformed
        // TODO add your handling code here:

        do_add("Thanks Giving");
    }//GEN-LAST:event_btn_tyActionPerformed

    private void btn_ptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ptActionPerformed
        // TODO add your handling code here:
//        show_intentions();
        do_add("Petition Mass");
    }//GEN-LAST:event_btn_ptActionPerformed

    private void btn_coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coActionPerformed
        // TODO add your handling code here:
        do_add("Common");
    }//GEN-LAST:event_btn_coActionPerformed

    private void btn_requiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_requiemActionPerformed
        // TODO add your handling code here:
        do_requeim();
    }//GEN-LAST:event_btn_requiemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ty1ActionPerformed
        // TODO add your handling code here:
        schedules();
    }//GEN-LAST:event_btn_ty1ActionPerformed

    private void jc_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jc_datePropertyChange
        // TODO add your handling code here:
        data_employee();
//         JOptionPane.showMessageDialog(null, "adadad");
//        

    }//GEN-LAST:event_jc_datePropertyChange

    private void jc_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jc_dateMouseClicked
        // TODO add 
    }//GEN-LAST:event_jc_dateMouseClicked

    private void jc_dateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jc_dateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_dateMouseReleased

    private void jc_dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jc_dateMousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_dateMousePressed

    private void jc_dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jc_dateKeyReleased
        // TODO add your handling code here:
//         JOptionPane.showMessageDialog(null, "adadad");
    }//GEN-LAST:event_jc_dateKeyReleased

    private void tbl_mass_schedulesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mass_schedulesMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);

    }//GEN-LAST:event_tbl_mass_schedulesMousePressed

    private void tbl_mass_schedulesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mass_schedulesMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_mass_schedulesMouseReleased

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
        view_records();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        view_records();
    }//GEN-LAST:event_viewActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_co;
    private javax.swing.JButton btn_pt;
    private javax.swing.JButton btn_requiem;
    private javax.swing.JButton btn_ty;
    private javax.swing.JButton btn_ty1;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JCalendar jc_date;
    private javax.swing.JLabel lb_ref_no;
    private javax.swing.JPopupMenu pm_time;
    private javax.swing.JTable tbl_mass_schedules;
    private javax.swing.JMenuItem view;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        set_ref_no();
        init_key();
        init_tbl_mass();
        data_employee();
    }

    private void set_ref_no() {
        lb_ref_no.setText("" + S1_mass_schedules.get_ref_number());
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

    private void init_tbl_mass() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_mass_schedules.setModel(tbl_employee_payroll_M);
        tbl_mass_schedules.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_mass_schedules.setRowHeight(25);

//        tbl_mass_schedules.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {200, 400, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_mass_schedules, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_mass_schedules.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_mass_schedules.setRowHeight(35);
        tbl_mass_schedules.setFont(new java.awt.Font("Arial", 1, 12));
    }

    private void loadData_baptism(List<to_regular_mass> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "TIME", "PRIEST", "ID"
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
            to_regular_mass tt = (to_regular_mass) getRow(row);

            switch (col) {
                case 0:
                    return tt.time;
                case 1:
                    return tt.priest;

                default:
                    return tt.number;
            }
        }
    }

    private void data_employee() {
        if (tbl_employee_payroll_ALM == null) {
            return;
        }

        Date date = jc_date.getDate();
        loadData_baptism(S1_mass_schedules.get_scheds(date));
//        System.out.println(date);
    }

    private void schedules() {
        Window p = (Window) this;
        Dlg_mass_schedules nd = Dlg_mass_schedules.create(p, true);
        nd.setTitle("");
//        nd.do_pass();
        nd.setCallback(new Dlg_mass_schedules.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_schedules.OutputData data) {
                closeDialog.ok();
                do_add_schedule(data.time, data.priest);
                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_add_schedule(String time, String priest) {
        Date scheduled_date = jc_date.getDate();


        String mass_sched_number = "" + S4_ret_number.ret_mass_schedule_number();
        String mass_type = "";
        String priest_number = "1";

        S5_save_new_mass_schedule.save_new_mass_schedule(mass_sched_number, mass_type, time, scheduled_date, priest_number, priest, "");
//        JOptionPane.showMessageDialog(null, "adadad");
    }

    private void pm_tbl_users(MouseEvent evt) {
//        pm_tbl_users
        if (evt.isPopupTrigger()) {
            pm_time.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void do_edit() {
        int row = tbl_mass_schedules.getSelectedRow();
        if (row < 0) {
            return;
        }
        String time = tbl_mass_schedules.getModel().getValueAt(row, 0).toString();
        String priest = tbl_mass_schedules.getModel().getValueAt(row, 1).toString();
        final String id = tbl_mass_schedules.getModel().getValueAt(row, 2).toString();
        Window p = (Window) this;
        Dlg_mass_schedules nd = Dlg_mass_schedules.create(p, true);
        nd.setTitle("");
        nd.do_pass(time, priest);
        nd.setCallback(new Dlg_mass_schedules.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_schedules.OutputData data) {
                closeDialog.ok();
//                do_add_schedule(data.time, data.priest);
                do_edit_schedule(id, data.time, data.priest);
                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_edit_schedule(String id, String time, String priest) {
        S1_mass_schedules.edit_schedule(id, time, priest);
    }

    private void do_delete_schedule(String id) {
        int row = tbl_mass_schedules.getSelectedRow();
        if (row < 0) {
            return;
        }
        String time = tbl_mass_schedules.getModel().getValueAt(row, 0).toString();
        String priest = tbl_mass_schedules.getModel().getValueAt(row, 1).toString();
        final String ids = tbl_mass_schedules.getModel().getValueAt(row, 2).toString();
        Window p = (Window) this;
        Dlg_mass_schedules nd = Dlg_mass_schedules.create(p, true);
        nd.setTitle("");
        nd.do_pass(time, priest);
        nd.setCallback(new Dlg_mass_schedules.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_schedules.OutputData data) {
                closeDialog.ok();
//                do_add_schedule(data.time, data.priest);

                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_delete() {
        int row = tbl_mass_schedules.getSelectedRow();
        if (row < 0) {
            return;
        }
        String time = tbl_mass_schedules.getModel().getValueAt(row, 0).toString();
        String priest = tbl_mass_schedules.getModel().getValueAt(row, 1).toString();
        final String ids = tbl_mass_schedules.getModel().getValueAt(row, 2).toString();
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                delete_schedule(ids);
                data_employee();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void delete_schedule(String id) {
        S1_mass_schedules.delete_schedule(id);
    }

    private void do_add(final String type) {
//        Thanks Giving
//Common
//Petition Mass
//Requiem Mass
        int row = tbl_mass_schedules.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Select Schedule");
            return;
        }
//        "TIME", "PRIEST", "ID"
        final String time = tbl_mass_schedules.getModel().getValueAt(row, 0).toString();
        final String priest = tbl_mass_schedules.getModel().getValueAt(row, 1).toString();

        Window p = (Window) this;
        Dlg_mass_intention nd = Dlg_mass_intention.create(p, true);
        nd.setTitle("");
        nd.do_pass("", "", "");
        nd.setCallback(new Dlg_mass_intention.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_intention.OutputData data) {
                closeDialog.ok();
                save_thanks_giving(time, priest, data.name, data.contact, data.message, type);
                set_ref_no();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_requeim() {
        int row = tbl_mass_schedules.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Select Schedule");
            return;
        }
//        "TIME", "PRIEST", "ID"
        final String time = tbl_mass_schedules.getModel().getValueAt(row, 0).toString();
        final String priest = tbl_mass_schedules.getModel().getValueAt(row, 1).toString();

        Window p = (Window) this;
        Dlg_mass_requiem nd = Dlg_mass_requiem.create(p, true);
        nd.setTitle("");
        nd.do_pass("", "", "");
        nd.setCallback(new Dlg_mass_requiem.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_requiem.OutputData data) {
                closeDialog.ok();
                save_requiem(time, priest, data.name, data.contact, data.to_name);
                set_ref_no();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void save_requiem(String time, String priest, String name, String contact, List<to_name> to_name) {

        String ref_no = lb_ref_no.getText();
        String tg_date = DateType.datetime.format(jc_date.getDate());

//        S1_mass_schedules.add_intention_requiem(time, priest, name, contact, "", "Requiem Mass", ref_no, tg_date, to_name);
    }

    private void save_thanks_giving(String time, String priest, String parishioner, String contact, String message, String type) {
//        String type = "Thanks Giving";
        String ref_no = lb_ref_no.getText();
        String tg_date = DateType.datetime.format(jc_date.getDate());

//        S1_mass_schedules.add_intention(time, priest, parishioner, contact, message, type, ref_no, tg_date);

    }

    private void view_records() {
        String date = DateType.sf.format(jc_date.getDate());
        Window p = (Window) this;
        Dlg_view_intention_records nd = Dlg_view_intention_records.create(p, true);
        nd.setTitle("");
        nd.do_pass(date);
        nd.setCallback(new Dlg_view_intention_records.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_view_intention_records.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
}
