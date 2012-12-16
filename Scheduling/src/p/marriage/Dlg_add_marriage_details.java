/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.marriage;

import bb.dlg.Dlg_name;
import bb.dlg.Dlg_officials;
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
import p.svc.S1_mass_schedules;
import p.svc.S3_cb_convenience;
import p.svc.S7_marriage;
import p.svc.S7_marriage.to_edit_marriage;

/**
 *
 * @author i1
 */
public class Dlg_add_marriage_details extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_add_marriage_details
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

        public final String wedding_type;
        public final String g_fname;
        public final String g_mi;
        public final String g_lname;
        public final String g_moname;
        public final String g_faname;
        public final String b_fname;
        public final String b_mi;
        public final String b_lname;
        public final String b_moname;
        public final String b_faname;
        public final String ref_no;
        public final String g_contact;
        public final String g_address;
        public final String b_contact;
        public final String b_address;
        public final String priest;
        public final Date date_added;
        public final String time;
        public final List<S7_marriage.to_witnesses> wit;

        public OutputData(String wedding_type, String g_fname, String g_mi, String g_lname, String g_moname, String g_faname, String b_fname, String b_mi, String b_lname, String b_moname, String b_faname, String ref_no, String g_contact, String g_address, String b_contact, String b_address, String priest, Date date_added, String time, List<S7_marriage.to_witnesses> wit) {
            this.wedding_type = wedding_type;
            this.g_fname = g_fname;
            this.g_mi = g_mi;
            this.g_lname = g_lname;
            this.g_moname = g_moname;
            this.g_faname = g_faname;
            this.b_fname = b_fname;
            this.b_mi = b_mi;
            this.b_lname = b_lname;
            this.b_moname = b_moname;
            this.b_faname = b_faname;
            this.ref_no = ref_no;
            this.g_contact = g_contact;
            this.g_address = g_address;
            this.b_contact = b_contact;
            this.b_address = b_address;
            this.priest = priest;
            this.date_added = date_added;
            this.time = time;
            this.wit = wit;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_add_marriage_details(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_add_marriage_details(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_add_marriage_details() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_add_marriage_details myRef;

    private void setThisRef(Dlg_add_marriage_details myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_add_marriage_details> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_add_marriage_details create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_add_marriage_details create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_add_marriage_details dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_marriage_details((java.awt.Frame) parent, false);
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
            Dlg_add_marriage_details dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_marriage_details((java.awt.Dialog) parent, false);
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


        Dlg_add_marriage_details dialog = Dlg_add_marriage_details.create(new javax.swing.JFrame(), true);
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
        jLabel2 = new javax.swing.JLabel();
        tf_g_fname = new javax.swing.JTextField();
        tf_g_mi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_g_lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_g_faname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_g_moname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_b_fname = new javax.swing.JTextField();
        tf_b_mi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_b_lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_b_faname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_b_moname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cb_wed_name = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lb_ref_no = new javax.swing.JLabel();
        cb_priest = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_g_address = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_g_contact = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_b_contact = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_b_address = new javax.swing.JTextArea();
        cb_time = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        dp_date = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_sponsors = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("PRIEST:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 70, 20));

        tf_g_fname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_g_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 346, 28));

        tf_g_mi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_g_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 346, 28));

        jLabel3.setText("MIDDLE NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel4.setText("LAST NAME:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        tf_g_lname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_g_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 346, 28));

        jLabel5.setText("ADDRESS:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        tf_g_faname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_g_faname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 346, 28));

        jLabel6.setText("MOTHER'S  NAME:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        tf_g_moname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_g_moname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 346, 28));

        jLabel7.setText("FIRST NAME:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        tf_b_fname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_b_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 346, 28));

        tf_b_mi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_b_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 346, 28));

        jLabel8.setText("MIDDLE NAME:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        jLabel9.setText("LAST NAME:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        tf_b_lname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_b_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 346, 28));

        jLabel10.setText("FATHER'S  NAME:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        tf_b_faname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_b_faname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 346, 28));

        jLabel11.setText("MOTHER'S  NAME:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        tf_b_moname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(tf_b_moname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 346, 28));

        jLabel12.setText("FIRST NAME:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel18.setText("DATE:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 30));

        jLabel19.setText("TIME:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 70, 30));

        cb_wed_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ORDINARY", "SPECIAL" }));
        jPanel1.add(cb_wed_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, -1));

        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 590, 100, 40));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 590, 100, 40));

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel15.setText("REFERENCE #:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        lb_ref_no.setBackground(new java.awt.Color(0, 0, 0));
        lb_ref_no.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        lb_ref_no.setForeground(new java.awt.Color(0, 255, 0));
        lb_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ref_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_ref_no.setOpaque(true);
        jPanel1.add(lb_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 130, 30));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 390, 30));

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, 50, 30));

        jLabel16.setText("CONTACT #:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        ta_g_address.setColumns(20);
        ta_g_address.setLineWrap(true);
        ta_g_address.setRows(5);
        jScrollPane1.setViewportView(ta_g_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 350, -1));

        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "GROOM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Charter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 510, 430));

        jLabel20.setText("FATHER'S  NAME:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));
        jPanel1.add(tf_g_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 350, -1));

        jLabel21.setText("CONTACT #:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, 20));
        jPanel1.add(tf_b_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 350, -1));

        jLabel22.setText("ADDRESS:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        ta_b_address.setColumns(20);
        ta_b_address.setLineWrap(true);
        ta_b_address.setRows(5);
        jScrollPane2.setViewportView(ta_b_address);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 350, -1));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 280, -1));

        jLabel17.setText("WEDDING TYPE:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 20));
        jPanel1.add(dp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 280, 30));

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
        jScrollPane3.setViewportView(tbl_sponsors);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 200, 340, 370));

        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 170, -1, -1));

        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BRIDE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Charter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 530, 430));

        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SPONSORS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Charter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, 360, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        do_officials();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        add_witness();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        do_edit_witnesses();
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        do_remove();
    }//GEN-LAST:event_deleteActionPerformed

    private void tbl_sponsorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sponsorsMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_sponsorsMousePressed

    private void tbl_sponsorsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sponsorsMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_sponsorsMouseReleased
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_priest;
    private javax.swing.JComboBox cb_time;
    private javax.swing.JComboBox cb_wed_name;
    private javax.swing.JMenuItem delete;
    private com.toedter.calendar.JDateChooser dp_date;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_ref_no;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTextArea ta_b_address;
    private javax.swing.JTextArea ta_g_address;
    private javax.swing.JTable tbl_sponsors;
    private javax.swing.JTextField tf_b_contact;
    private javax.swing.JTextField tf_b_faname;
    private javax.swing.JTextField tf_b_fname;
    private javax.swing.JTextField tf_b_lname;
    private javax.swing.JTextField tf_b_mi;
    private javax.swing.JTextField tf_b_moname;
    private javax.swing.JTextField tf_g_contact;
    private javax.swing.JTextField tf_g_faname;
    private javax.swing.JTextField tf_g_fname;
    private javax.swing.JTextField tf_g_lname;
    private javax.swing.JTextField tf_g_mi;
    private javax.swing.JTextField tf_g_moname;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        set_ref_no();
        set_priest();
        init_time();
        init_tbl_witnesses();
    }

    private void init_time() {
        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_mat);

    }

    private void set_priest() {
        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);
    }

    private void set_ref_no() {
        lb_ref_no.setText("" + S1_mass_schedules.get_ref_number_marriage());
    }

    public void do_pass(String marriage_number) {

        ret_witnesses(marriage_number);
        dp_date.setDate(new Date());
    }
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_witnesses() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_sponsors.setModel(tbl_employee_payroll_M);
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

    private void loadData_baptism(List<S7_marriage.to_witnesses> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    private void loadData_baptism2(List<S7_marriage.to_witnesses> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "marriage_no", "NAME"
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

    private void data_add_witness(String name) {
//        String date = lb_date_baptism.getText();

        loadData_baptism(S7_marriage.add_witnesses("0", lb_ref_no.getText(), name));

    }

    private void ret_witnesses(String marriage_num) {
//        String date = lb_date_baptism.getText();

        loadData_baptism2(S7_marriage.ret_witnesses(marriage_num));

    }

    private void pm_tbl_users(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void add_witness() {


        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");
        nd.do_pass("");
        nd.setCallback(new Dlg_name.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_name.OutputData data) {
                closeDialog.ok();
                data_add_witness(data.name);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_edit_witnesses() {
        int idx = tbl_sponsors.getSelectedRow();
        if (idx < 0) {
            return;
        }

        String name = tbl_sponsors.getModel().getValueAt(idx, 2).toString();
        S7_marriage.to_witnesses order = (S7_marriage.to_witnesses) tbl_employee_payroll_ALM.get(tbl_sponsors.convertRowIndexToModel(idx));

        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");
        nd.do_pass(name);
        nd.setCallback(new Dlg_name.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_name.OutputData data) {
                set_val(closeDialog, data);
                closeDialog.ok();

            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void set_val(CloseDialog closeDialog, Dlg_name.OutputData data) {
        int idx = tbl_sponsors.getSelectedRow();
        if (idx < 0) {
            return;
        }

        S7_marriage.to_witnesses order = (S7_marriage.to_witnesses) tbl_employee_payroll_ALM.get(tbl_sponsors.convertRowIndexToModel(idx));
        order.setName(data.name);

        tbl_employee_payroll_M.fireTableDataChanged();

        tbl_sponsors.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_sponsors);


    }

    private void do_remove() {

        int[] idx = tbl_sponsors.getSelectedRows();

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

    public void do_pass2(to_edit_marriage to) {
        tf_g_faname.setText(to.g_faname);
        tf_g_contact.setText(to.g_contact);
        tf_g_fname.setText(to.g_fname);
        tf_g_lname.setText(to.g_lname);
        tf_g_mi.setText(to.g_mi);
        tf_g_moname.setText(to.g_moname);

        tf_b_faname.setText(to.b_faname);
        tf_b_contact.setText(to.b_contact);
        tf_b_fname.setText(to.b_fname);
        tf_b_lname.setText(to.b_lname);
        tf_b_mi.setText(to.b_mi);
        tf_b_moname.setText(to.b_moname);

        cb_priest.setSelectedItem(to.priest);
        cb_time.setSelectedItem(to.time);
        dp_date.setDate(to.date_added);

        lb_ref_no.setText(to.ref_no);
        ta_b_address.setText(to.b_address);
        ta_g_address.setText(to.g_address);
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
        if (tbl_employee_payroll_ALM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input Witnesses");
            return;
        }
        String wedding_type = cb_wed_name.getSelectedItem().toString();

        String g_fname = tf_g_fname.getText();
        String g_mi = tf_g_mi.getText();
        String g_lname = tf_g_lname.getText();
        String g_moname = tf_g_moname.getText();
        String g_faname = tf_g_faname.getText();

        String b_fname = tf_b_fname.getText();
        String b_mi = tf_b_mi.getText();
        String b_lname = tf_b_lname.getText();
        String b_moname = tf_b_moname.getText();
        String b_faname = tf_b_faname.getText();

        String ref_no = lb_ref_no.getText();

        String g_contact = tf_g_contact.getText();
        String g_address = ta_g_address.getText();

        String b_contact = tf_b_contact.getText();
        String b_address = ta_b_address.getText();
        String priest = cb_priest.getSelectedItem().toString();

        Date date_added = dp_date.getDate();
        String time = cb_time.getSelectedItem().toString();

        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(wedding_type, g_fname, g_mi, g_lname, g_moname, g_faname, b_fname, b_mi, b_lname, b_moname, b_faname, ref_no, g_contact, g_address, b_contact, b_address, priest, date_added, time, tbl_employee_payroll_ALM));
        }


    }

    private void do_officials() {
        Window p = (Window) this;
        Dlg_officials nd = Dlg_officials.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_officials.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_officials.OutputData data) {
//                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
}
