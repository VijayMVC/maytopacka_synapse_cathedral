/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.mass;

import bb.dlg.Dlg_name;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.svc.S1_mass_schedules;

/**
 *
 * @author i1
 */
public class Dlg_mass_requiem extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_mass_intention
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
        public final String name;
        public final String contact;
        public final List<S1_mass_schedules.to_name> to_name;

        public OutputData(String name, String contact, List<S1_mass_schedules.to_name> to_name) {
            this.name = name;
            this.contact = contact;
            this.to_name = to_name;
        }

        
        
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_mass_requiem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_mass_requiem(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_mass_requiem() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_mass_requiem myRef;

    private void setThisRef(Dlg_mass_requiem myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_mass_requiem> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_mass_requiem create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_mass_requiem create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_mass_requiem dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mass_requiem((java.awt.Frame) parent, false);
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
            Dlg_mass_requiem dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mass_requiem((java.awt.Dialog) parent, false);
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


        Dlg_mass_requiem dialog = Dlg_mass_requiem.create(new javax.swing.JFrame(), true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_contact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_souls = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jLabel1.setText("NAME:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jLabel2.setText("CONTACT #:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        tf_name.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jPanel1.add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 388, 30));

        tf_contact.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jPanel1.add(tf_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 388, 30));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 107, -1));

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 560, 100, -1));

        tbl_souls.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_souls);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 480, 410));

        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 84, 30));

        jButton4.setText("EDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 84, 30));

        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        do_add();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        do_edit();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        do_remove();
    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_souls;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_names();
    }

    public void do_pass(String name,String contact,String ref) {
        
        tf_name.setText(name);
        tf_contact.setText(contact);
        load_names(ref);
    }
    private void load_names(String ref_no){
         loadData_baptism(S1_mass_schedules.set_data2(ref_no));
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

    private void init_tbl_names() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);
        
        
        tbl_souls.setModel(tbl_employee_payroll_M);
        tbl_souls.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_souls.setRowHeight(25);
        
//        tbl_souls.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100};
        
        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if(i==0)continue;
            TableWidthUtilities.setColumnWidth(tbl_souls, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }
        
        tbl_souls.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_souls.setRowHeight(35);
        tbl_souls.setFont(new java.awt.Font("Arial", 1, 10));
    }
    
    private void loadData_baptism(List<S1_mass_schedules.to_name> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }
    
    public static class TblInvoicesModel extends AbstractTableAdapter {
        
        public static String[] COLUMNS = {
            "NAME"
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
            S1_mass_schedules.to_name tt = (S1_mass_schedules.to_name) getRow(row);
            
            switch (col) {
               
                
                default:
                    return tt.name;
            }
        }
    }
    
    private void data_names(String name) {
//        String date = lb_date_baptism.getText();
//        String name = tf_searc.getText();
        loadData_baptism(S1_mass_schedules.set_data(name));
    }
    private void do_add(){
        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");
        nd.do_pass("");
        nd.setCallback(new Dlg_name.Callback() {
            
            @Override
            public void ok(CloseDialog closeDialog, Dlg_name.OutputData data) {
                closeDialog.ok();
                data_names(data.name);
            }
        });
        Center.setCenter(nd);
        
        nd.setVisible(true);
    }
    
   
    
   
    private void do_edit() {
        int idx = tbl_souls.getSelectedRow();
        if (idx < 0) {
            return;
        }
        String name=tbl_souls.getModel().getValueAt(idx, 0).toString();
        S1_mass_schedules.to_name order = ( S1_mass_schedules.to_name) tbl_employee_payroll_ALM.get(tbl_souls.convertRowIndexToModel(idx));
        
        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");
//        nd.load(new Dlg_name.InputData(order.souls_of));
        nd.do_pass(name);
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
        int idx = tbl_souls.getSelectedRow();
        if (idx < 0) {
            return;
        }
        
         S1_mass_schedules.to_name order = ( S1_mass_schedules.to_name) tbl_employee_payroll_ALM.get(tbl_souls.convertRowIndexToModel(idx));
        order.setName(data.name);
        
        tbl_employee_payroll_M.fireTableDataChanged();
        
        tbl_souls.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_souls);
        
        
    }
    
    private void do_remove() {
        int[] idx = tbl_souls.getSelectedRows();
        
        List rem = new ArrayList();
        for (int ix : idx) {
            if (tbl_souls.isRowSelected(ix)) {
                int mx = tbl_souls.convertRowIndexToModel(ix);
                rem.add(tbl_employee_payroll_ALM.get(mx));
            }
        }
        
        tbl_employee_payroll_ALM.removeAll(rem);
        tbl_employee_payroll_M.fireTableDataChanged();
    }
//    
    private void ok1() {
        String name=tf_name.getText();
        String contact=tf_contact.getText();
//        String message=tf_message.getText();
        if(name.isEmpty()|| tbl_employee_payroll_ALM.isEmpty()){
            JOptionPane.showMessageDialog(null, "Input Name");
            return;
        }
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(name,contact,tbl_employee_payroll_ALM));
        }
    }
}
