/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.funeral;

import p.baptism.*;
import bb.dlg.Dlg_confirm;
import bb.dlg.Dlg_name;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.S8_baptism.to_baptism;
import p.confirmation.S9_confirmation;
import p.funeral.S10_funeral.to_funeral;
import p.svc.S1_mass_schedules;
import p.svc.S3_cb_convenience;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_add_funeral extends javax.swing.JDialog {

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

        public final S10_funeral.to_funeral data;

        public OutputData(to_funeral data) {
            this.data = data;
        }
       
        
       
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_add_funeral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_add_funeral(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_add_funeral() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_add_funeral myRef;

    private void setThisRef(Dlg_add_funeral myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_add_funeral> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_add_funeral create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_add_funeral create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_add_funeral dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_funeral((java.awt.Frame) parent, false);
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
            Dlg_add_funeral dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_funeral((java.awt.Dialog) parent, false);
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


        Dlg_add_funeral dialog = Dlg_add_funeral.create(new javax.swing.JFrame(), true);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        tf_mi = new javax.swing.JTextField();
        tf_lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        tf_page_no = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cb_priest = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        lb_ref_no = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_contact = new javax.swing.JTextField();
        tf_address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_cause_of_death = new javax.swing.JTextField();
        dp_buried = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        tf_buried_at = new javax.swing.JTextField();

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
        getContentPane().add(dp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 220, 30));

        jLabel1.setText("TIME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setText("PRIEST:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 64, 388, 30));

        jLabel3.setText("FIRST NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 165, -1, -1));

        jLabel4.setText("MIDDLE NAME:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 205, -1, -1));

        jLabel8.setText("LAST NAME:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 239, -1, -1));

        jLabel9.setText("BURIED AT:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));
        getContentPane().add(tf_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 160, 337, 30));
        getContentPane().add(tf_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 200, 337, 30));
        getContentPane().add(tf_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 234, 337, 30));

        jLabel10.setText("BOOK NO.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jLabel11.setText("PAGE NO.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));
        getContentPane().add(tf_book_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 119, 30));
        getContentPane().add(tf_page_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 119, 30));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 105, 40));

        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 105, 40));

        jLabel12.setText("DATE:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 28));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 321, 30));

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

        jLabel13.setText("CONTACT #:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 40));
        getContentPane().add(tf_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 337, 30));
        getContentPane().add(tf_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 337, 30));

        jLabel14.setText("ADDRESS:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 40));

        jLabel16.setText("CAUSE OF DEATH:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, 40));
        getContentPane().add(tf_cause_of_death, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 337, 30));
        getContentPane().add(dp_buried, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 220, 30));

        jLabel18.setText("DATE BURIED:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));
        getContentPane().add(tf_buried_at, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 337, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
     
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
    private com.toedter.calendar.JDateChooser dp_buried;
    private com.toedter.calendar.JDateChooser dp_date;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_ref_no;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_buried_at;
    private javax.swing.JTextField tf_cause_of_death;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_mi;
    private javax.swing.JTextField tf_page_no;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        dp_buried.setDate(new Date());
        init_key();
        init_date();
        set_ref_no();
      
        init_time();
        set_priest();
    }

    private void init_time() {
        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_burial);

    }

    private void set_ref_no() {
        lb_ref_no.setText("" + S1_mass_schedules.get_ref_number_funeral());
    }

    private void set_priest() {
        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);
    }

    private void init_date() {
        dp_date.setDate(new Date());
    }
    String bap_no = "";

    public void do_pass(S10_funeral.to_funeral to) {
//        dp_date.setDate(DateType.to.date_of_baptism);
        lb_ref_no.setText(to.burial_mass_number);
        bap_no = to.burial_mass_number;
        
        cb_priest.setSelectedItem(to.priest);
        cb_time.setSelectedItem(to.scheduled_time);
        try {
            dp_date.setDate(DateType.sf.parse(to.scheduled_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_add_funeral.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        tf_page_no.setText(to.page_no);
        tf_book_no.setText(to.book_no);
        
        tf_fname.setText(to.f_name);
        tf_lname.setText(to.l_name);
        tf_mi.setText(to.mi);
        
        tf_contact.setText(to.contact_number);
        tf_address.setText(to.address);
        tf_cause_of_death.setText(to.cause_of_death);
        tf_buried_at.setText(to.buried_at);
        try {
            dp_buried.setDate(DateType.sf.parse(to.date_buried));

        } catch (ParseException ex) {
            Logger.getLogger(Dlg_add_funeral.class.getName()).log(Level.SEVERE, null, ex);
        }
        //        loadData_baptism2(S9_confirmation.ret_data(to.baptismal_number));
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
   
    private void ok1() {

        
        String burial_mass_number = lb_ref_no.getText();
        String f_name = tf_fname.getText();
        String l_name = tf_lname.getText();
        String mi = tf_mi.getText();
        
        String contact_number = tf_contact.getText();
        String address = tf_address.getText();
        String cause_of_death=tf_cause_of_death.getText();
        
        
        String buried_at = tf_buried_at.getText();
        
        String buried=DateType.sf.format(dp_buried.getDate());
        
        
        
        
        String scheduled_time = DateType.sf.format(dp_date.getDate());
        String scheduled_date = DateType.sf.format(dp_date.getDate());
        String priest = cb_priest.getSelectedItem().toString();
        String book_no = "0";
        String page_no = "0";
      
        S10_funeral.to_funeral to =new S10_funeral.to_funeral(burial_mass_number, f_name, l_name, mi, contact_number, address, cause_of_death, buried, buried_at, scheduled_time, scheduled_date, priest, book_no, page_no);
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(to));
        }
    }
}
