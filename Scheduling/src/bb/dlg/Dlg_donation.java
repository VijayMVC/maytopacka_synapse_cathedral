/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Dlg_quantity.java
 *
 * Created on Nov 16, 2011, 6:28:55 PM
 */
package bb.dlg;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import overallPOS.modules.share.utils.*;

import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.svc.S1_mass_schedules;

/**
 *
 * @author u2
 */
public class Dlg_donation extends javax.swing.JDialog {

    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class OutputData {

        public final double amount;
        public final String donor;
        public final String or_no;

        public OutputData(double amount, String donor, String or_no) {
            this.amount = amount;
            this.donor = donor;
            this.or_no = or_no;
        }

       
    }

    public static class InputData {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_donation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_donation(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_donation() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_donation myRef;

    private void setThisRef(Dlg_donation myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_donation> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_donation create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_donation create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_donation dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_donation((java.awt.Frame) parent, false);
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
            Dlg_donation dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_donation((java.awt.Dialog) parent, false);
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


        Dlg_donation dialog = Dlg_donation.create(new javax.swing.JFrame(), true);
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
//            validateTree();
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

        pnl_floor = new javax.swing.JPanel();
        pnl_numpad = new javax.swing.JPanel();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        pnl_payment = new javax.swing.JPanel();
        ds_change = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_due = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_amount = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ds_title1 = new javax.swing.JLabel();
        tf_donor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_ref_no = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_floor.setBackground(new java.awt.Color(159, 207, 243));
        pnl_floor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_floor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_numpad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 9, 149), 3, true));
        pnl_numpad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_9.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(41, 9, 149));
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 150, 120));

        btn_6.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(41, 9, 149));
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 110));

        btn_8.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(41, 9, 149));
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 120));

        btn_5.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(41, 9, 149));
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 110));

        btn_7.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(41, 9, 149));
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 120));

        btn_3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(41, 9, 149));
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 150, 110));

        btn_1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(41, 9, 149));
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, 110));

        btn_2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(41, 9, 149));
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, 110));

        btn_0.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(41, 9, 149));
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 310, 80));

        btn_dot.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(41, 9, 149));
        btn_dot.setText(".");
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 150, 80));

        btn_4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(41, 9, 149));
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        pnl_numpad.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 110));

        pnl_floor.add(pnl_numpad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 480, 450));

        pnl_payment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_payment.setForeground(new java.awt.Color(41, 9, 149));
        pnl_payment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ds_change.setBackground(java.awt.Color.darkGray);
        ds_change.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        ds_change.setForeground(java.awt.Color.green);
        ds_change.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ds_change.setText("0.00");
        ds_change.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        ds_change.setEnabled(false);
        ds_change.setOpaque(true);
        pnl_payment.add(ds_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 249, 362, 67));

        jLabel9.setBackground(new java.awt.Color(41, 9, 149));
        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 9, 149));
        jLabel9.setText("Change:");
        pnl_payment.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 226, -1, -1));

        jLabel5.setBackground(new java.awt.Color(41, 9, 149));
        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 9, 149));
        jLabel5.setText("Enter Amount:");
        pnl_payment.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_due.setBackground(java.awt.Color.darkGray);
        lbl_due.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lbl_due.setForeground(java.awt.Color.green);
        lbl_due.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_due.setText("0.0");
        lbl_due.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        lbl_due.setEnabled(false);
        lbl_due.setOpaque(true);
        pnl_payment.add(lbl_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 362, -1));

        jLabel6.setBackground(new java.awt.Color(41, 9, 149));
        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 9, 149));
        jLabel6.setText("AMOUNT DUE:");
        pnl_payment.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        tf_amount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tf_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tf_amount.setText("0.00");
        tf_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_payment.add(tf_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 362, 64));

        btn_cancel.setText("CLOSE");
        btn_cancel.setFocusable(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pnl_payment.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 90, 50));

        btn_ok.setText("OK");
        btn_ok.setFocusable(false);
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        pnl_payment.add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 90, 50));

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(149, 9, 12));
        jLabel14.setText("(ENTER)");
        pnl_payment.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 416, 80, -1));

        jLabel16.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(149, 9, 12));
        jLabel16.setText("(ESCAPE)");
        pnl_payment.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 414, 80, 20));

        btn_clear.setText("CLEAR");
        btn_clear.setFocusable(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        pnl_payment.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 80, 49));

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(149, 9, 12));
        jLabel18.setText("(F5)");
        pnl_payment.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 414, 60, 20));

        pnl_floor.add(pnl_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 390, 450));

        ds_title1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        ds_title1.setForeground(new java.awt.Color(41, 9, 149));
        ds_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ds_title1.setText("DONATION");
        ds_title1.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ds_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(603, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(ds_title1)
                .addContainerGap())
        );

        pnl_floor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 870, 70));

        tf_donor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tf_donor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pnl_floor.add(tf_donor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 670, 30));

        jButton1.setText("SEARCH");
        pnl_floor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("DONOR:");
        pnl_floor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel2.setText("RECEIPT #:");
        pnl_floor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        lb_ref_no.setBackground(new java.awt.Color(0, 0, 0));
        lb_ref_no.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        lb_ref_no.setForeground(new java.awt.Color(0, 255, 0));
        lb_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ref_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_ref_no.setOpaque(true);
        pnl_floor.add(lb_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_floor, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_floor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
// TODO add your handling code here:
        do_3();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
// TODO add your handling code here:
        do_6();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        do_7();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:do_7()
        do_1();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        do_2();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        do_4();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        do_5();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        do_8();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:do_1();
        do_9();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        // TODO add your handling code here:
        do_dot();
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        do_0();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
//    clear_field();
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
//        do_ok();
        ok1();
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        do_clear();
    }//GEN-LAST:event_btn_clearActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel ds_change;
    private javax.swing.JLabel ds_title1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_ref_no;
    private javax.swing.JLabel lbl_due;
    private javax.swing.JPanel pnl_floor;
    private javax.swing.JPanel pnl_numpad;
    private javax.swing.JPanel pnl_payment;
    private javax.swing.JLabel tf_amount;
    private javax.swing.JTextField tf_donor;
    // End of variables declaration//GEN-END:variables
    //<editor-fold defaultstate="collapsed" desc=" myInit ">

    private void myInit() {
        initActionKey();
        init_num();
        set_ref_no();
    }
    double am = 0;

    public void do_pass() {
        set_ref_no();
//        am = amount;
//        lbl_due.setText(FitIn.fmt_wc_0(amount));

    }

    private void init_num() {
        tf_dummy = new JTextField();
        CurrencyDocument cd = new CurrencyDocument(true, 10);
        tf_dummy.setDocument(cd);
    }

    private void initActionKey() {

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_PERIOD, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dot.doClick();
            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_BACK_SPACE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                clear_field();
            }
        });


        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD0, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_0.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_0, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_0.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_0, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_0.doClick();
//                JOptionPane.showMessageDialog(null, "adadad");
            }
        });



        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD1, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_1.doClick();
            }
        });



        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_1, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_1.doClick();
            }
        });




        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD2, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_2.doClick();
            }
        });


        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_2, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_2.doClick();
            }
        });



        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD3, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_3.doClick();

            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_3, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_3.doClick();

            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD4, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_4.doClick();
            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_4, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_4.doClick();
            }
        });



        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD5, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_5.doClick();
            }
        });


        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_5, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_5.doClick();
            }
        });


        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD6, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_6.doClick();
            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_6, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_6.doClick();
            }
        });


        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD7, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_7.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_7, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_7.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD8, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_8.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_8, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_8.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_NUMPAD9, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_9.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_9, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_9.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_DECIMAL, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dot.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ENTER, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn_ok.doClick();
            }
        });

        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_F5, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {

//                do_clear();
                btn_clear.doClick();
            }
        });
    }
    //</editor-fold>

    private void set_ref_no() {
        lb_ref_no.setText("" + S1_mass_schedules.get_or_no());
    }

    public void load(InputData data) {
    }

    private void cancel() {
        this.setVisible(false);
    }

    private void do_ok() {
        if (callback == null) {
            return;
        }

//        Executor.doExecute(this, new Executor.Task() {
//            
//            @Override
//            public void work_on() {
        prcss_work_on();
//            }
//        });
    }

    private void prcss_work_on() {
//        callback.ok(new CloseDialog(this), new Dlg_donation.OutputData());
//        this.dispose();
    }
    JTextField tf_dummy;

    private void put_text(String str) {

        CurrencyDocument.decimalInserter(tf_dummy, str);
        tf_amount.setText(tf_dummy.getText());
//        screen_computation();

    }

    private boolean screen_computation() {
        double amt_due = 0;
        double amt_tendered = 0;

        double credit = 0;

        try {
            amt_due = Round2.withZeroBack(lbl_due.getText()).doubleValue();

            String str_tendered = tf_dummy.getText();
            if (str_tendered.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Asang Bayad?");
                return false;
            }

            amt_tendered = Double.parseDouble(str_tendered);
        } catch (Exception e) {
            amt_due = 0;
            amt_tendered = 0;
        }

        double change = amt_tendered - amt_due;

        if (change < 0) {
            ds_change.setText("Kulang");
            return false;
        } else if (change == 0) {
//            CashDrawer.open();
            ds_change.setText("Exact");
        } else {
//            CashDrawer.open();
            ds_change.setText(MessageFormat.format("{0,number,#,##0.00}", change));
        }

        return true;

    }

    private void do_7() {
        put_text("7");
    }

    private void do_8() {
        put_text("8");
    }

    private void do_9() {
        put_text("9");
    }

    private void do_4() {
        put_text("4");
    }

    private void do_5() {
        put_text("5");
    }

    private void do_6() {
        put_text("6");
    }

    private void do_1() {
        put_text("1");
    }

    private void do_2() {
        put_text("2");
    }

    private void do_3() {
        put_text("3");
    }

    private void do_0() {
        put_text("0");
    }

    private void do_dot() {
        put_text(".");
    }

    private void ok1() {

        if (tf_amount.getText().isEmpty() || tf_donor.getText().isEmpty()) {
            return;
        }
        double amm = Double.parseDouble(tf_amount.getText());
        if (amm == 0) {
            JOptionPane.showMessageDialog(null, "Input Amount");
            return;
        }
        String donor = tf_donor.getText();
        
        String or_no=lb_ref_no.getText();
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(amm, donor,or_no));
        }
    }

    private void do_clear() {
        tf_dummy.setText("");
        tf_amount.setText(tf_dummy.getText());
        ds_change.setText("0.0");
//        screen_computation();
    }
}
