/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_marriage_trib extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_marriage_trib
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

        public final int marriage_no;
        public final String date_of_marriage;
        public final String date_of_death;
        public final String decree_no;
        public final String case_no;
        public final String tribunal_no;

        public OutputData(int marriage_no, String date_of_marriage, String date_of_death, String decree_no, String case_no, String tribunal_no) {
            this.marriage_no = marriage_no;
            this.date_of_marriage = date_of_marriage;
            this.date_of_death = date_of_death;
            this.decree_no = decree_no;
            this.case_no = case_no;
            this.tribunal_no = tribunal_no;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_marriage_trib(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_marriage_trib(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_marriage_trib() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_marriage_trib myRef;

    private void setThisRef(Dlg_marriage_trib myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_marriage_trib> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_marriage_trib create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_marriage_trib create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_marriage_trib dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_trib((java.awt.Frame) parent, false);
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
            Dlg_marriage_trib dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_trib((java.awt.Dialog) parent, false);
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


        Dlg_marriage_trib dialog = Dlg_marriage_trib.create(new javax.swing.JFrame(), true);
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
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl_m_no = new javax.swing.JLabel();
        dp_date_of_death = new com.toedter.calendar.JDateChooser();
        dp_date_of_marriage = new com.toedter.calendar.JDateChooser();
        tf_trib_no = new javax.swing.JTextField();
        tf_or_no = new javax.swing.JTextField();
        tf_case_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Tribunal No:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 30));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Marriage No.");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 160, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Date of Marriage:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, 30));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Date of Death(Spouse):");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 30));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Decree of Ordinance No:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 30));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Case No:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 30));

        lbl_m_no.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_m_no.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_m_no.setText("0");
        jPanel1.add(lbl_m_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 330, 30));
        jPanel1.add(dp_date_of_death, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 260, 30));
        jPanel1.add(dp_date_of_marriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 260, 30));

        tf_trib_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_trib_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_trib_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_trib_noActionPerformed(evt);
            }
        });
        jPanel1.add(tf_trib_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 180, 30));

        tf_or_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_or_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_or_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_or_noActionPerformed(evt);
            }
        });
        jPanel1.add(tf_or_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 180, 30));

        tf_case_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_case_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_case_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_case_noActionPerformed(evt);
            }
        });
        jPanel1.add(tf_case_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 180, 30));

        jButton1.setText("CLOSE:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 298, 100, 40));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 298, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_trib_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_trib_noActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_tf_trib_noActionPerformed

    private void tf_or_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_or_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_or_noActionPerformed

    private void tf_case_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_case_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_case_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dp_date_of_death;
    private com.toedter.calendar.JDateChooser dp_date_of_marriage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_m_no;
    private javax.swing.JTextField tf_case_no;
    private javax.swing.JTextField tf_or_no;
    private javax.swing.JTextField tf_trib_no;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
    }

    public void do_pass(int marriage_no, String date_of_marriage, String date_of_death, String decree_no, String case_no, String tribunal_no) {
        lbl_m_no.setText("" + marriage_no);
        try {
            dp_date_of_marriage.setDate(DateType.sf.parse(date_of_marriage));
            dp_date_of_death.setDate(DateType.sf.parse(date_of_death));
            tf_or_no.setText(decree_no);
            tf_case_no.setText(case_no);
            tf_trib_no.setText(tribunal_no);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_trib.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        int marriage_no = Integer.parseInt(lbl_m_no.getText());
        String date_of_marriage = DateType.sf.format(dp_date_of_marriage.getDate());
        String date_of_death = DateType.sf.format(dp_date_of_death.getDate());
        String decree_no = tf_or_no.getText();
        String case_no = tf_case_no.getText();

        String tribunal_no = tf_trib_no.getText();

        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(marriage_no,date_of_marriage,date_of_death,decree_no,case_no,tribunal_no));
        }
    }
}
