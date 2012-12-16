/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpt_main;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.logging.Level;
import overallPOS.modules.share.utils.Center;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.Executor;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.rpt.other_reports.rpt_scheduler_others;
import p.util.DateType;
import rpt_scheduler.rpt_scheduler_reports;
import rpt_scheduler_intentionss.Dlg_report_time;
import rpt_scheduler_intentionss.rpt_scheduler_intentions;

/**
 *
 * @author i1
 */
public class Dlg_scheduler_report extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_scheduler_report
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
    private Dlg_scheduler_report(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_scheduler_report(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_scheduler_report() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_scheduler_report myRef;

    private void setThisRef(Dlg_scheduler_report myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_scheduler_report> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_scheduler_report create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.MODELESS);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_scheduler_report create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_scheduler_report dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_scheduler_report((java.awt.Frame) parent, false);
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
            Dlg_scheduler_report dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_scheduler_report((java.awt.Dialog) parent, false);
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


        Dlg_scheduler_report dialog = Dlg_scheduler_report.create(new javax.swing.JFrame(), true);
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

        bg_intentions = new javax.swing.ButtonGroup();
        bg_rites = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dp_from = new com.toedter.calendar.JDateChooser();
        dp_to = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cb_payed = new javax.swing.JRadioButton();
        cb_unpaid = new javax.swing.JRadioButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cb_r_waiting = new javax.swing.JRadioButton();
        cb_r_approved = new javax.swing.JRadioButton();
        cb_r_cancelled = new javax.swing.JRadioButton();
        cb_r_confirmed = new javax.swing.JRadioButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        cb_r_payed = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(959, 572));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHOOSE  REPORT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 29, 959, 53);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("DATE FROM:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(141, 111, 126, 29);
        getContentPane().add(dp_from);
        dp_from.setBounds(271, 111, 172, 35);
        getContentPane().add(dp_to);
        dp_to.setBounds(621, 111, 172, 35);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("DATE TO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(511, 111, 110, 29);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setText("ALL");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(50, 240, 160, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("THANKS GIVING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 290, 160, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("PETITION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 340, 160, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("COMMON");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 390, 160, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("REQUIEM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(50, 440, 160, 40);

        bg_intentions.add(cb_payed);
        cb_payed.setSelected(true);
        cb_payed.setText("PAYED");
        getContentPane().add(cb_payed);
        cb_payed.setBounds(220, 270, 70, 23);

        bg_intentions.add(cb_unpaid);
        cb_unpaid.setText("UNPAID");
        cb_unpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_unpaidActionPerformed(evt);
            }
        });
        getContentPane().add(cb_unpaid);
        cb_unpaid.setBounds(220, 320, 120, 23);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton2.setText("PARISHIONERS");
        jToggleButton2.setEnabled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(710, 340, 160, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("MATRIMONY");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(380, 240, 160, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("BAPTISM");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(380, 290, 160, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("CONFIRMATION");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(380, 340, 160, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("FUNERAL");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(380, 390, 160, 40);

        bg_rites.add(cb_r_waiting);
        cb_r_waiting.setSelected(true);
        cb_r_waiting.setText("WAITING");
        cb_r_waiting.setEnabled(false);
        getContentPane().add(cb_r_waiting);
        cb_r_waiting.setBounds(550, 260, 100, 23);

        bg_rites.add(cb_r_approved);
        cb_r_approved.setText("APPROVED");
        cb_r_approved.setEnabled(false);
        getContentPane().add(cb_r_approved);
        cb_r_approved.setBounds(550, 300, 110, 23);

        bg_rites.add(cb_r_cancelled);
        cb_r_cancelled.setText("CANCELLED");
        cb_r_cancelled.setEnabled(false);
        getContentPane().add(cb_r_cancelled);
        cb_r_cancelled.setBounds(550, 420, 110, 23);

        bg_rites.add(cb_r_confirmed);
        cb_r_confirmed.setText("CONFIRMED");
        cb_r_confirmed.setEnabled(false);
        getContentPane().add(cb_r_confirmed);
        cb_r_confirmed.setBounds(550, 380, 110, 23);

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton4.setText("MASS SCHEDULES");
        jToggleButton4.setEnabled(false);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(710, 240, 160, 40);

        jToggleButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton5.setText("OFFICIALS");
        jToggleButton5.setEnabled(false);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(710, 290, 160, 40);

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "INTENTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18)))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 330, 350);

        bg_rites.add(cb_r_payed);
        cb_r_payed.setText("PAYED");
        cb_r_payed.setEnabled(false);
        getContentPane().add(cb_r_payed);
        cb_r_payed.setBounds(550, 330, 110, 40);

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RITES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 190, 310, 350);

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OTHERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 190, 230, 300);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("CLOSE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 498, 101, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        intention_all();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        thanks_giving();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        petition_mass();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        common();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        requiem_mass();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        matrimony();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        baptism();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        confirmation();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        funeral();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        do_mass_schedulers("rpt_mass_scheds");
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        do_mass_schedulers("rpt_officials");
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cb_unpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_unpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_unpaidActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_intentions;
    private javax.swing.ButtonGroup bg_rites;
    private javax.swing.JRadioButton cb_payed;
    private javax.swing.JRadioButton cb_r_approved;
    private javax.swing.JRadioButton cb_r_cancelled;
    private javax.swing.JRadioButton cb_r_confirmed;
    private javax.swing.JRadioButton cb_r_payed;
    private javax.swing.JRadioButton cb_r_waiting;
    private javax.swing.JRadioButton cb_unpaid;
    private com.toedter.calendar.JDateChooser dp_from;
    private com.toedter.calendar.JDateChooser dp_to;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        dp_from.setDate(new Date());
        dp_to.setDate(new Date());

        init_key();
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

    private void do_intentions_all(final String template) {
        final rpt_scheduler_reports.to_date_to to = new rpt_scheduler_reports.to_date_to(dp_from.getDate(), dp_to.getDate(), "Ronald Pascua");
        Executor.doExecute(this, new Executor.Task() {

            @Override
            public void work_on() {
                rpt_scheduler_reports.pdf_viewer_date_to(to, template);
//                    do_ok1();
//                    prcss_work_on();

            }
        });
    }

    private void do_mass_schedulers(final String template) {
        final rpt_scheduler_others.to_date_to to = new rpt_scheduler_others.to_date_to(dp_from.getDate(), dp_from.getDate(), "Ronald Pascua");
        Executor.doExecute(this, new Executor.Task() {

            @Override
            public void work_on() {
                rpt_scheduler_others.pdf_viewer_date_to(to, template);
//                    do_ok1();
//                    prcss_work_on();

            }
        });
    }

    private void do_intentions(final String template) {
        final rpt_scheduler_intentions.to_date_to to = new rpt_scheduler_intentions.to_date_to(dp_from.getDate(), dp_to.getDate(), "Ronald Pascua");
        Executor.doExecute(this, new Executor.Task() {

            @Override
            public void work_on() {
                rpt_scheduler_intentions.pdf_viewer_date_to(to, template);
//                    do_ok1();
//                    prcss_work_on();

            }
        });
    }

    private void do_intentions_time(final String template) {

        String date = DateType.sf.format(dp_from.getDate());

        Window p = (Window) this;
        Dlg_report_time nd = Dlg_report_time.create(p, true);
        nd.setTitle("");
        nd.do_pass("", date);
        nd.setCallback(new Dlg_report_time.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_time.OutputData data) {
                closeDialog.ok();
                do_show(data.time, data.priest, template);

            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);



    }

    private void do_show(String time, String priest, final String template) {
        final rpt_scheduler_intentions.to_date_to_time to = new rpt_scheduler_intentions.to_date_to_time(dp_from.getDate(), dp_from.getDate(), "Ronald Pascua", time, priest);
        Executor.doExecute(this, new Executor.Task() {

            @Override
            public void work_on() {
                rpt_scheduler_intentions.pdf_viewer_date_to_time(to, template);
//                    do_ok1();
//                    prcss_work_on();

            }
        });
    }

    private void matrimony() {
        
        if (cb_r_waiting.isSelected()) {
            do_intentions_all("rpt_mat_pending");

        }
        if (cb_r_approved.isSelected()) {
            do_intentions_all("rpt_mat_approved");

        }
        if (cb_r_confirmed.isSelected()) {
            do_intentions_all("rpt_mat_married");

        }
        if (cb_r_payed.isSelected()) {
            do_intentions_all("rpt_mat_payed");

        }

    }

    private void baptism() {
        if (cb_r_waiting.isSelected()) {
            do_intentions_all("rpt_bap_pending");

        }
        if (cb_r_approved.isSelected()) {
            do_intentions_all("rpt_bap_approved");

        }
        if (cb_r_confirmed.isSelected()) {
            do_intentions_all("rpt_bap_baptized_1");

        }

        if (cb_r_payed.isSelected()) {
            do_intentions_all("rpt_bap_pay");

        }


    }

    private void confirmation() {

        if (cb_r_waiting.isSelected()) {
            do_intentions_all("rpt_con_pending_1");

        }
        if (cb_r_approved.isSelected()) {
            do_intentions_all("rpt_con_approved");

        }
        if (cb_r_confirmed.isSelected()) {
            do_intentions_all("rpt_con_confirmed_1");

        }
        if (cb_r_payed.isSelected()) {
            do_intentions_all("rpt_con_payed_1");

        }

    }

    private void funeral() {

        if (cb_r_waiting.isSelected()) {
            do_intentions_all("rpt_fun_pending");

        }
        if (cb_r_approved.isSelected()) {
            do_intentions_all("rpt_fun_approved");

        }
        if (cb_r_confirmed.isSelected()) {
            do_intentions_all("rpt_fun_confirmed");

        }
        if (cb_r_payed.isSelected()) {
            do_intentions_all("rpt_fun_payed");
        }

    }

    private void intention_all() {

        if (cb_payed.isSelected()) {
            do_intentions("rpt_mass_intentions_all_paid");

        }
        if (cb_unpaid.isSelected()) {
            do_intentions("rpt_mass_intentions_all_unpaid");
        }

    }

    private void thanks_giving() {

        if (cb_payed.isSelected()) {
            do_intentions_time("rpt_mass_intentions_ty_paid");

        }
        if (cb_unpaid.isSelected()) {
        }

    }

    private void petition_mass() {

        if (cb_payed.isSelected()) {
            do_intentions_time("rpt_mass_intentions_pet_mass");

        }
        if (cb_unpaid.isSelected()) {
        }

    }

    private void common() {

        if (cb_payed.isSelected()) {
            do_intentions_time("rpt_mass_intentions_common_paid");

        }
        if (cb_unpaid.isSelected()) {
        }

    }

    private void requiem_mass() {

        if (cb_payed.isSelected()) {
            do_intentions_time("rpt_mass_intentions_requiem_mass_1");

        }
        if (cb_unpaid.isSelected()) {
        }

    }

    private void do_certificate(final String template) {
        String num = "2";
        final String day = DateType.d.format(new Date());
        final String month = DateType.m.format(new Date());
        final String year = DateType.y.format(new Date());
        String priest = "adadad";
        String asst_priest = "adadad";
        String series_of = "2012-2013";
        String path=System.getProperty("path", "/home/dummy");
        final rpt_scheduler_others.to_cert to = new rpt_scheduler_others.to_cert(num, day, month, year, priest, asst_priest, series_of,path);
        Executor.doExecute(this, new Executor.Task() {

            @Override
            public void work_on() {
                rpt_scheduler_others.pdf_viewer_cert(to, template);
//                    do_ok1();
//                    prcss_work_on();

            }
        });

    }

    private void do_certificate() {
        Window p = (Window) this;
        Dlg_search_certificate nd = Dlg_search_certificate.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_search_certificate.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_search_certificate.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
}
