/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import bb.dlg.Dlg_pay_rites;
import bb.dlg.Dlg_pay_rites.OutputData2;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.rpt.Reference_number;
import p.svc.S9_payments;
import p.to.to_rites_fees;

/**
 *
 * @author dummy
 */
public class Dlg_choose_pay extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_choose_payment
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

        public final List<String> sac;

        public OutputData(List<String> sac) {
            this.sac = sac;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_choose_pay(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_choose_pay(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_choose_pay() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_choose_pay myRef;

    private void setThisRef(Dlg_choose_pay myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_choose_pay> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_choose_pay create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_choose_pay create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_choose_pay dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_choose_pay((java.awt.Frame) parent, false);
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
            Dlg_choose_pay dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_choose_pay((java.awt.Dialog) parent, false);
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


        Dlg_choose_pay dialog = Dlg_choose_pay.create(new javax.swing.JFrame(), true);
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
        jButton7 = new javax.swing.JButton();
        xb_matrimony = new javax.swing.JCheckBox();
        xb_baptism = new javax.swing.JCheckBox();
        xb_acceptance = new javax.swing.JCheckBox();
        xb_communion = new javax.swing.JCheckBox();
        xb_2nd_mat = new javax.swing.JCheckBox();
        xb_funeral = new javax.swing.JCheckBox();
        xb_confirmation = new javax.swing.JCheckBox();
        xb_prof_of_faith = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);

        jButton7.setText("CLOSE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(xb_matrimony);
        xb_matrimony.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_matrimony.setText("MATRIMONY");
        xb_matrimony.setEnabled(false);

        buttonGroup1.add(xb_baptism);
        xb_baptism.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_baptism.setText("BAPTISM");
        xb_baptism.setEnabled(false);

        buttonGroup1.add(xb_acceptance);
        xb_acceptance.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_acceptance.setText("ACCEPTANCE");
        xb_acceptance.setEnabled(false);

        buttonGroup1.add(xb_communion);
        xb_communion.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_communion.setText("COMMUNION");
        xb_communion.setEnabled(false);

        buttonGroup1.add(xb_2nd_mat);
        xb_2nd_mat.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_2nd_mat.setText("2ND MATRIMONY");
        xb_2nd_mat.setEnabled(false);

        buttonGroup1.add(xb_funeral);
        xb_funeral.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_funeral.setText("FUNERAL");
        xb_funeral.setEnabled(false);

        buttonGroup1.add(xb_confirmation);
        xb_confirmation.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_confirmation.setText("CONFIRMATION");
        xb_confirmation.setEnabled(false);

        buttonGroup1.add(xb_prof_of_faith);
        xb_prof_of_faith.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        xb_prof_of_faith.setText("PROF OF FAITH");
        xb_prof_of_faith.setEnabled(false);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xb_baptism)
                    .addComponent(xb_acceptance)
                    .addComponent(xb_matrimony))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xb_communion)
                            .addComponent(xb_2nd_mat))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xb_confirmation)
                            .addComponent(xb_prof_of_faith)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(xb_funeral)
                        .addGap(41, 41, 41)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(xb_baptism)
                        .addGap(42, 42, 42)
                        .addComponent(xb_matrimony)
                        .addGap(43, 43, 43)
                        .addComponent(xb_acceptance))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(xb_communion)
                                .addGap(42, 42, 42)
                                .addComponent(xb_2nd_mat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(xb_confirmation)
                                .addGap(42, 42, 42)
                                .addComponent(xb_prof_of_faith)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(xb_funeral)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(91, 91, 91))
        );

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT SACRAMENT TO PAY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox xb_2nd_mat;
    private javax.swing.JCheckBox xb_acceptance;
    private javax.swing.JCheckBox xb_baptism;
    private javax.swing.JCheckBox xb_communion;
    private javax.swing.JCheckBox xb_confirmation;
    private javax.swing.JCheckBox xb_funeral;
    private javax.swing.JCheckBox xb_matrimony;
    private javax.swing.JCheckBox xb_prof_of_faith;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();

    }
    String pname = "";
    String p_id = "";

    public void do_pass(String _baptized, String _comm, String _confirm, String _married, String _2nd_married, String _prof_faith, String _acceptance, String _death, String name, String ref_id) {
//        _baptized="Not Paid";
        pname = name;
        p_id = ref_id;
        if (_baptized.equals("Not Paid")) {
            xb_baptism.setEnabled(true);

        }

        if (_comm.equals("Not Paid")) {
            xb_communion.setEnabled(true);
        }
        if (_confirm.equals("Not Paid")) {
            xb_confirmation.setEnabled(true);
        }
        if (_married.equals("Not Paid")) {
            xb_matrimony.setEnabled(true);
        }
        if (_2nd_married.equals("Not Paid")) {
            xb_2nd_mat.setEnabled(true);
        }
        if (_prof_faith.equals("Not Paid")) {
            xb_prof_of_faith.setEnabled(true);
        }
        if (_acceptance.equals("Not Paid")) {
            xb_acceptance.setEnabled(true);
        }
        if (_death.equals("Not Paid")) {
            xb_funeral.setEnabled(true);
        }


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

    private void ok1() {
        List<String> sel = new ArrayList();
        String type = "";
        if (xb_baptism.isSelected()) {
            sel.add("Baptism");
            type = "Baptism";
        }
        if (xb_communion.isSelected()) {
            sel.add("Communion");
            type = "Communion";
        }
        if (xb_confirmation.isSelected()) {
            sel.add("Confirmation");
            type = "Confirmation";
        }
        if (xb_matrimony.isSelected()) {
            sel.add("Matrimony");
            type = "Matrimony";
        }
        if (xb_2nd_mat.isSelected()) {
            sel.add("2nd Matrimony");
            type = "2nd Matrimony";
        }
        if (xb_prof_of_faith.isSelected()) {
            sel.add("Prof of Faith");
            type = "Prof of Faith";
        }
        if (xb_acceptance.isSelected()) {
            sel.add("Acceptance");
            type = "Acceptance";
        }
        if (xb_funeral.isSelected()) {
            sel.add("Funeral");
            type = "Funeral";
        }

        if (sel.isEmpty()) {
            return;
        }
        Window p = (Window) this;
        Dlg_pay_rites nd = Dlg_pay_rites.create(p, true);
        nd.setTitle("");
        nd.do_pass(type);
        nd.setCallback(new Dlg_pay_rites.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_pay_rites.OutputData data) {
                closeDialog.ok();
                do_pay_others(p_id, data.or_no, data.amount, pname, data.sac_name);
                ok2();
            }

            @Override
            public void matrimony(CloseDialog closeDialog, OutputData2 data) {
                closeDialog.ok();
                do_pay_matrimony(p_id, data.or_no, data.t, pname);
                ok2();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

    }

    private void ok2() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(new ArrayList()));
        }
    }

    private void do_pay_others(String ref_no, String or_no, double amount, String name, String type) {

        S9_payments.do_others(ref_no, or_no, amount, name, type);


        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());


        String words = DigitToWord.convertToWordsIn(amount);
        String am = FitIn.fmt_wc_0(amount);

//        Reference_number.to_receipt to = new Reference_number.to_receipt(date, name, words, type, "CASH", am, or_no, ref_no);
//        String do_print = System.getProperty("do_print");
//        if (do_print.equals("true")) {
//             Reference_number.print_receipt(to);
//        }
       

    }

    private void do_pay_matrimony(String ref_no, String or_no, List<to_rites_fees> t, String name) {

        S9_payments.do_pay_marriage(ref_no, or_no, t, name);

        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());

        double amount = 0;
        for (to_rites_fees tt : t) {
            amount += tt.rate;
        }
        String words = DigitToWord.convertToWordsIn(amount);
        String am = FitIn.fmt_wc_0(amount);

//        Reference_number.to_receipt to = new Reference_number.to_receipt(date, name, words, "Matrimony", "CASH", am, or_no, ref_no);
//        String do_print = System.getProperty("do_print");
//        if (do_print.equals("true")) {
//             Reference_number.print_receipt(to);
//        }
       

    }
}
