/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.cashier;

import bb.dlg.Dlg_donation;
import bb.dlg2.dlg_rite_fees_settings;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import overallPOS.modules.share.utils.Center;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.Dlg_baptism_payment;
import p.confirmation.Dlg_confirmation_payment;
import p.funeral.Dlg_funeral_payment;
import p.marriage.Dlg_marriage_payment;
import p.svc.S1_mass_schedules;
import rpt_main.Dlg_cash_report;

/**
 *
 * @author i1
 */
public class Dlg_cashier_menu extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_cashier_menu
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
    private Dlg_cashier_menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_cashier_menu(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_cashier_menu() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_cashier_menu myRef;

    private void setThisRef(Dlg_cashier_menu myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_cashier_menu> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_cashier_menu create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.MODELESS);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_cashier_menu create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_cashier_menu dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashier_menu((java.awt.Frame) parent, false);
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
            Dlg_cashier_menu dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashier_menu((java.awt.Dialog) parent, false);
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


        Dlg_cashier_menu dialog = Dlg_cashier_menu.create(new javax.swing.JFrame(), true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_payments = new javax.swing.JToggleButton();
        btn_reports = new javax.swing.JToggleButton();
        btn_voider = new javax.swing.JToggleButton();
        pnl_payments = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        pnl_reports = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(btn_payments);
        btn_payments.setSelected(true);
        btn_payments.setText("PAYMENTS");
        btn_payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        buttonGroup1.add(btn_reports);
        btn_reports.setText("REPORTS");
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 40));

        buttonGroup1.add(btn_voider);
        btn_voider.setText("VIEW FEES");
        btn_voider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voiderActionPerformed(evt);
            }
        });
        jPanel1.add(btn_voider, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 110, 40));

        pnl_payments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_payments.setFocusTraversalPolicyProvider(true);

        jButton2.setText("INTENTIONS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MATRIMONY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DONATIONS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton15.setText("BAPTISM");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("CONFIRMATION");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("FUNERAL");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_paymentsLayout = new javax.swing.GroupLayout(pnl_payments);
        pnl_payments.setLayout(pnl_paymentsLayout);
        pnl_paymentsLayout.setHorizontalGroup(
            pnl_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_paymentsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(pnl_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        pnl_paymentsLayout.setVerticalGroup(
            pnl_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_paymentsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnl_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 153, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 77, 560, 380));

        pnl_reports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_reports.setFocusTraversalPolicyProvider(true);
        pnl_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("ALL - RITES");
        pnl_reports.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 190, 50));

        jButton6.setText("MATRIMONY");
        pnl_reports.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 190, 50));

        jButton7.setText("BAPTISM");
        pnl_reports.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 190, 50));

        jButton8.setText("CONFIRMATION");
        pnl_reports.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 190, 50));

        jButton9.setText("FUNERAL");
        pnl_reports.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 190, 50));

        jButton10.setText("REQUIEM");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pnl_reports.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 190, 50));

        jButton11.setText("PETITION");
        pnl_reports.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 50));

        jButton12.setText("ALL - INTENTIONS");
        pnl_reports.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 50));

        jButton13.setText("THANKS GIVING");
        pnl_reports.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, 50));

        jButton14.setText("COMMON");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        pnl_reports.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 50));

        jPanel1.add(pnl_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 77, 560, 380));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 380, 70));

        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 105, 42));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voiderActionPerformed
        // TODO add your handling code here:
        do_fees();

    }//GEN-LAST:event_btn_voiderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentsActionPerformed
        // TODO add your handling code here:
        set_payment();
    }//GEN-LAST:event_btn_paymentsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        payment_intention();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        donations();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        do_payment_matrimony();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        do_payment_baptism();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        do_payment_confirmation();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        do_payment_funeral();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        // TODO add your handling code here:
//        set_payment();
        reports();
    }//GEN-LAST:event_btn_reportsActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_payments;
    private javax.swing.JToggleButton btn_reports;
    private javax.swing.JToggleButton btn_voider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnl_payments;
    private javax.swing.JPanel pnl_reports;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        set_visible();
        set_payment();
    }

    private void set_visible() {
        pnl_payments.setVisible(false);

        pnl_reports.setVisible(false);
    }

    private void do_fees() {
        Window p = (Window) this;
        dlg_rite_fees_settings nd = dlg_rite_fees_settings.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new dlg_rite_fees_settings.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, dlg_rite_fees_settings.Data data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
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

    private void set_payment() {
        if (btn_payments.isSelected()) {
            pnl_payments.setVisible(true);

            pnl_reports.setVisible(false);
        }
        if (btn_reports.isSelected()) {
//            pnl_payments.setVisible(false);
//            pnl_reports.setVisible(true);
        }

    }

    private void reports() {
        Window p = (Window) this;
        Dlg_cash_report nd = Dlg_cash_report.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_cash_report.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_cash_report.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void payment_intention() {
        Window p = (Window) this;
        Dlg_payment_intentions nd = Dlg_payment_intentions.create(p, true);
        nd.setTitle("");
        nd.do_pass("");
        nd.setCallback(new Dlg_payment_intentions.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_payment_intentions.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void donations() {

        Window p = (Window) this;
        Dlg_donation nd = Dlg_donation.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_donation.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_donation.OutputData data) {
                closeDialog.ok();
                do_add_donations(data.donor, data.amount, data.or_no);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_add_donations(String name, double amount, String or_no) {
//        S1_mass_schedules.do_pay_donation(name, amount, or_no,"");
    }

    private void do_payment_matrimony() {
        Window p = (Window) this;
        Dlg_marriage_payment nd = Dlg_marriage_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_marriage_payment.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_marriage_payment.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_payment_confirmation() {
        Window p = (Window) this;
        Dlg_confirmation_payment nd = Dlg_confirmation_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirmation_payment.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirmation_payment.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_payment_funeral() {
        Window p = (Window) this;
        Dlg_funeral_payment nd = Dlg_funeral_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_funeral_payment.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_funeral_payment.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_payment_baptism() {
        Window p = (Window) this;
        Dlg_baptism_payment nd = Dlg_baptism_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_baptism_payment.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_baptism_payment.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
}
