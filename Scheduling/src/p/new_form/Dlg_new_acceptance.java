/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import overallPOS.modules.share.utils.Center;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.S8_baptism;
import p.new_form.to_baptism.S1_new_baptism;
import p.new_form.to_baptism.S6_new_acceptance;
import p.svc.S3_cb_convenience;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_new_acceptance extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_new_communion
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;


    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);

        void edit(CloseDialog closeDialog, OutputData data);

        void delete(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {

        public final to_acceptance to;
        public final List<S8_baptism.to_sponsors> to_sponsors;

        public OutputData(to_acceptance to, List<S8_baptism.to_sponsors> to_sponsors) {
            this.to = to;
            this.to_sponsors = to_sponsors;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_new_acceptance(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_new_acceptance(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_new_acceptance() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_new_acceptance myRef;

    private void setThisRef(Dlg_new_acceptance myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_new_acceptance> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_new_acceptance create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_new_acceptance create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_new_acceptance dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_acceptance((java.awt.Frame) parent, false);
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
            Dlg_new_acceptance dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_acceptance((java.awt.Dialog) parent, false);
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


        Dlg_new_acceptance dialog = Dlg_new_acceptance.create(new javax.swing.JFrame(), true);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dp_acc_church = new javax.swing.JTextField();
        dp_acc_date = new com.toedter.calendar.JDateChooser();
        lbl_ref_no = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_mi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_bplace = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbl_date_of_birth = new javax.swing.JLabel();
        lbl_mother = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_father = new javax.swing.JLabel();
        dp_date_bapt = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_bap_church = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cb_priest = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        xb_acc = new javax.swing.JCheckBox();
        xb_election = new javax.swing.JCheckBox();
        xb_scrunity3 = new javax.swing.JCheckBox();
        xb_present_of_creed = new javax.swing.JCheckBox();
        dp_election = new com.toedter.calendar.JDateChooser();
        xb_scrunity1 = new javax.swing.JCheckBox();
        xb_scrunity2 = new javax.swing.JCheckBox();
        xb_ephepheta_rite = new javax.swing.JCheckBox();
        xb_recitation_of_creed = new javax.swing.JCheckBox();
        xb_present_l_pr = new javax.swing.JCheckBox();
        dp_ephepheta_rite = new com.toedter.calendar.JDateChooser();
        dp_present_of_creed = new com.toedter.calendar.JDateChooser();
        dp_scrunity1 = new com.toedter.calendar.JDateChooser();
        dp_scrunity3 = new com.toedter.calendar.JDateChooser();
        dp_scrunity2 = new com.toedter.calendar.JDateChooser();
        dp_recitation = new com.toedter.calendar.JDateChooser();
        dp_present_l_pr = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tf_presider = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_bookno = new javax.swing.JTextField();
        tf_pageno = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dp_accep_date = new com.toedter.calendar.JDateChooser();
        lbl_sponsors = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACCEPTANCE INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 1262, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Acceptance Date:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Acceptance Church:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 170, 30));
        jPanel3.add(dp_acc_church, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 410, 30));
        jPanel3.add(dp_acc_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 180, 30));

        lbl_ref_no.setBackground(new java.awt.Color(35, 11, 11));
        lbl_ref_no.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_ref_no.setForeground(java.awt.Color.green);
        lbl_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ref_no.setText("0");
        lbl_ref_no.setOpaque(true);
        jPanel3.add(lbl_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 100, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ref #:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 30));

        lbl_fname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_fname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_fname.setText("Ronald");
        jPanel3.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 330, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("First Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 30));

        lbl_mi.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mi.setText("Cadayday");
        jPanel3.add(lbl_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 330, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Middle Name:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 30));

        lbl_lname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_lname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_lname.setText("Pascua");
        jPanel3.add(lbl_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 330, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Date of Birth:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Last Name:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Place Of Birth:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 30));

        lbl_bplace.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_bplace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bplace.setText("Manila City");
        jPanel3.add(lbl_bplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 330, 30));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Father:");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 30));

        lbl_date_of_birth.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_date_of_birth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_date_of_birth.setText("February 8, 1991");
        jPanel3.add(lbl_date_of_birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 330, 30));

        lbl_mother.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mother.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mother.setText("Rosie Pascua");
        jPanel3.add(lbl_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 330, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Mother:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, 30));

        lbl_father.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_father.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_father.setText("Basilio Pascua");
        jPanel3.add(lbl_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 330, 30));
        jPanel3.add(dp_date_bapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 230, 30));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Date of Baptism:");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 30));

        tf_bap_church.setColumns(20);
        tf_bap_church.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bap_church.setLineWrap(true);
        tf_bap_church.setRows(5);
        tf_bap_church.setWrapStyleWord(true);
        jScrollPane5.setViewportView(tf_bap_church);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 310, 50));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Bapt. Church:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 110, 30));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Time:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, 30));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 410, 30));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Priest:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 120, 30));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 410, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 570));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xb_acc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_acc.setText("Acceptance");
        xb_acc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 150, 40));

        xb_election.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_election.setText("Election");
        xb_election.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_election, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 160, 30));

        xb_scrunity3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_scrunity3.setText("Scrutiny 3");
        xb_scrunity3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_scrunity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 180, 30));

        xb_present_of_creed.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_present_of_creed.setText("Present. of Creed");
        xb_present_of_creed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_present_of_creed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 180, 30));
        jPanel4.add(dp_election, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 200, 30));

        xb_scrunity1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_scrunity1.setText("Scrutiny 1");
        xb_scrunity1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_scrunity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, 30));

        xb_scrunity2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_scrunity2.setText("Scrutiny 2");
        xb_scrunity2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_scrunity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 180, 30));

        xb_ephepheta_rite.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_ephepheta_rite.setText("Ephepheta Rite");
        xb_ephepheta_rite.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_ephepheta_rite, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 180, 30));

        xb_recitation_of_creed.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_recitation_of_creed.setText("Recitation of Creed");
        xb_recitation_of_creed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_recitation_of_creed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 180, 30));

        xb_present_l_pr.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xb_present_l_pr.setText("Present. Lord's Pr.");
        xb_present_l_pr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(xb_present_l_pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 30));
        jPanel4.add(dp_ephepheta_rite, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 200, 30));
        jPanel4.add(dp_present_of_creed, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 200, 30));
        jPanel4.add(dp_scrunity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 200, 30));
        jPanel4.add(dp_scrunity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 200, 30));
        jPanel4.add(dp_scrunity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 200, 30));
        jPanel4.add(dp_recitation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 200, 30));
        jPanel4.add(dp_present_l_pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 200, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Presider:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 30));
        jPanel4.add(tf_presider, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 410, 30));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Book No:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, 30));

        tf_bookno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bookno.setText("0");
        jPanel4.add(tf_bookno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, 30));

        tf_pageno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_pageno.setText("0");
        jPanel4.add(tf_pageno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 110, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Page No:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 120, 30));

        tf_remarks.setColumns(20);
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        tf_remarks.setWrapStyleWord(true);
        jScrollPane4.setViewportView(tf_remarks);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 320, 60));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Remarks:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 90, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Sponsors:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 50, 30));
        jPanel4.add(dp_accep_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, 30));

        lbl_sponsors.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_sponsors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sponsors.setText("0");
        lbl_sponsors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lbl_sponsors, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 610, 510));

        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 110, 40));

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 110, 40));

        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, 110, 40));

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        jj = 2;
        ok1();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:jj
        jj = 3;
        ok1();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        jj = 1;
        ok1();
    }//GEN-LAST:event_btn_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sponsors();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JComboBox cb_priest;
    private javax.swing.JComboBox cb_time;
    private javax.swing.JTextField dp_acc_church;
    private com.toedter.calendar.JDateChooser dp_acc_date;
    private com.toedter.calendar.JDateChooser dp_accep_date;
    private com.toedter.calendar.JDateChooser dp_date_bapt;
    private com.toedter.calendar.JDateChooser dp_election;
    private com.toedter.calendar.JDateChooser dp_ephepheta_rite;
    private com.toedter.calendar.JDateChooser dp_present_l_pr;
    private com.toedter.calendar.JDateChooser dp_present_of_creed;
    private com.toedter.calendar.JDateChooser dp_recitation;
    private com.toedter.calendar.JDateChooser dp_scrunity1;
    private com.toedter.calendar.JDateChooser dp_scrunity2;
    private com.toedter.calendar.JDateChooser dp_scrunity3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_bplace;
    private javax.swing.JLabel lbl_date_of_birth;
    private javax.swing.JLabel lbl_father;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_mi;
    private javax.swing.JLabel lbl_mother;
    private javax.swing.JLabel lbl_ref_no;
    private javax.swing.JLabel lbl_sponsors;
    private javax.swing.JTextArea tf_bap_church;
    private javax.swing.JTextField tf_bookno;
    private javax.swing.JTextField tf_pageno;
    private javax.swing.JTextField tf_presider;
    private javax.swing.JTextArea tf_remarks;
    private javax.swing.JCheckBox xb_acc;
    private javax.swing.JCheckBox xb_election;
    private javax.swing.JCheckBox xb_ephepheta_rite;
    private javax.swing.JCheckBox xb_present_l_pr;
    private javax.swing.JCheckBox xb_present_of_creed;
    private javax.swing.JCheckBox xb_recitation_of_creed;
    private javax.swing.JCheckBox xb_scrunity1;
    private javax.swing.JCheckBox xb_scrunity2;
    private javax.swing.JCheckBox xb_scrunity3;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        dp_acc_date.setDate(new Date());
        dp_accep_date.setDate(new Date());
        dp_date_bapt.setDate(new Date());
        dp_election.setDate(new Date());
        dp_ephepheta_rite.setDate(new Date());
        dp_present_l_pr.setDate(new Date());
        dp_present_of_creed.setDate(new Date());
        dp_recitation.setDate(new Date());
        dp_acc_date.setDate(new Date());
        dp_scrunity1.setDate(new Date());
        dp_scrunity2.setDate(new Date());
        dp_scrunity3.setDate(new Date());

        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);

        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_acceptance);
        AutoCompleteDecorator.decorate(cb_priest);
        AutoCompleteDecorator.decorate(cb_time);

        init_key();
    }
    int jj = 0;

    public void do_pass() {
    }

    public void do_pass1(String ref_no, String gender) {
        btn_add.setEnabled(false);

        to_acceptance to = S6_new_acceptance.ret_data(ref_no);
        sponsors_ALM = S6_new_acceptance.ret_bap_sponsors(ref_no);
        lbl_sponsors.setText("" + sponsors_ALM.size());

        lbl_ref_no.setText(ref_no);
        lbl_fname.setText(to.fname);
        lbl_mi.setText(to.mi);
        lbl_lname.setText(to.lname);
        lbl_bplace.setText(to.place_of_birth);

        lbl_father.setText(to.father);
        lbl_mother.setText(to.mother);

        lbl_date_of_birth.setText(to.bday);

        tf_presider.setText(to.presider);
        tf_remarks.setText(to.remarks);
        tf_bap_church.setText(to.bapt_place);
        try {
            dp_date_bapt.setDate(DateType.sf.parse(to.bapt_date));
            dp_acc_date.setDate(DateType.sf.parse(to.acc_date));

            dp_accep_date.setDate(DateType.sf.parse(to.acceptance_date));
            dp_election.setDate(DateType.sf.parse(to.elected_date));
            dp_scrunity1.setDate(DateType.sf.parse(to.scrunity1_date));
            dp_present_l_pr.setDate(DateType.sf.parse(to.present_l_date));
            dp_scrunity2.setDate(DateType.sf.parse(to.scrunity2_date));
            dp_scrunity3.setDate(DateType.sf.parse(to.scrunity3_date));
            dp_present_of_creed.setDate(DateType.sf.parse(to.present_date));
            dp_recitation.setDate(DateType.sf.parse(to.recit_date));
            dp_ephepheta_rite.setDate(DateType.sf.parse(to.ephepheta_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
        }

        cb_time.setSelectedItem(to.acceptance_time);
        cb_priest.setSelectedItem(to.priest);

        if (to.is_acc.equals("1")) {
            xb_acc.setSelected(true);
        }

        if (to.is_elected.equals("1")) {
            xb_election.setSelected(true);
        }

        if (to.is_ephepheta.equals("1")) {
            xb_ephepheta_rite.setSelected(true);
        }

        if (to.is_present.equals("1")) {
            xb_present_of_creed.setSelected(true);
        }

        if (to.is_present_l.equals("1")) {
            xb_present_l_pr.setSelected(true);
        }


        if (to.is_recit.equals("1")) {
            xb_recitation_of_creed.setSelected(true);
        }

        if (to.is_scrunity1.equals("1")) {
            xb_scrunity1.setSelected(true);
        }

        if (to.is_scrunity2.equals("1")) {
            xb_scrunity2.setSelected(true);
        }
        if (to.is_scrunity3.equals("1")) {
            xb_scrunity3.setSelected(true);
        }


    }

    public void do_pass(String f_name, String mi, String lname, String bday, String place_of_birth, String father, String mother, String ref_no, String bapt_date, String bapt_church, String gender) {
        lbl_ref_no.setText(ref_no);
        lbl_fname.setText(f_name);
        lbl_mi.setText(mi);
        lbl_lname.setText(lname);
        lbl_bplace.setText(place_of_birth);

        lbl_father.setText(father);
        lbl_mother.setText(mother);
        tf_bap_church.setText(bapt_church);
        lbl_date_of_birth.setText(bday);
        try {
            dp_date_bapt.setDate(DateType.sf.parse(bapt_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
        }



        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);



    }

    public static class to_acceptance {

        public final String ref_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String bday;
        public final String place_of_birth;
        public final String bapt_date;
        public final String bapt_place;
        public final String book_no;
        public final String page_no;
        public final String acceptance_date;
        public final String acceptance_time;
        public final String priest;
        public final String presider;
        public final String remarks;
        public final String status;
        public final String date_added;
        public final String father;
        public final String mother;
        public final String is_acc;
        public final String acc_date;
        public final String is_elected;
        public final String elected_date;
        public final String is_scrunity1;
        public final String scrunity1_date;
        public final String is_present;
        public final String present_date;
        public final String is_scrunity2;
        public final String scrunity2_date;
        public final String is_scrunity3;
        public final String scrunity3_date;
        public final String is_present_l;
        public final String present_l_date;
        public final String is_recit;
        public final String recit_date;
        public final String is_ephepheta;
        public final String ephepheta_date;

        public to_acceptance(String ref_no, String fname, String mi, String lname, String bday, String place_of_birth, String bapt_date, String bapt_place, String book_no, String page_no, String acceptance_date, String acceptance_time, String priest, String presider, String remarks, String status, String date_added, String father, String mother, String is_acc, String acc_date, String is_elected, String elected_date, String is_scrunity1, String scrunity1_date, String is_present, String present_date, String is_scrunity2, String scrunity2_date, String is_scrunity3, String scrunity3_date, String is_present_l, String present_l_date, String is_recit, String recit_date, String is_ephepheta, String ephepheta_date) {
            this.ref_no = ref_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.bday = bday;
            this.place_of_birth = place_of_birth;
            this.bapt_date = bapt_date;
            this.bapt_place = bapt_place;
            this.book_no = book_no;
            this.page_no = page_no;
            this.acceptance_date = acceptance_date;
            this.acceptance_time = acceptance_time;
            this.priest = priest;
            this.presider = presider;
            this.remarks = remarks;
            this.status = status;
            this.date_added = date_added;
            this.father = father;
            this.mother = mother;
            this.is_acc = is_acc;
            this.acc_date = acc_date;
            this.is_elected = is_elected;
            this.elected_date = elected_date;
            this.is_scrunity1 = is_scrunity1;
            this.scrunity1_date = scrunity1_date;
            this.is_present = is_present;
            this.present_date = present_date;
            this.is_scrunity2 = is_scrunity2;
            this.scrunity2_date = scrunity2_date;
            this.is_scrunity3 = is_scrunity3;
            this.scrunity3_date = scrunity3_date;
            this.is_present_l = is_present_l;
            this.present_l_date = present_l_date;
            this.is_recit = is_recit;
            this.recit_date = recit_date;
            this.is_ephepheta = is_ephepheta;
            this.ephepheta_date = ephepheta_date;
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

        String ref_no = lbl_ref_no.getText();
        String fname = lbl_fname.getText();
        String mi = lbl_mi.getText();
        String lname = lbl_lname.getText();
        String bday = lbl_date_of_birth.getText();

        String place_of_birth = lbl_bplace.getText();
        String bapt_date = DateType.sf.format(dp_date_bapt.getDate());
        String bapt_place = tf_bap_church.getText();
        String book_no = tf_bookno.getText();
        String page_no = tf_pageno.getText();

        String acceptance_date = DateType.sf.format(dp_date_bapt.getDate());
        String acceptance_time = cb_time.getSelectedItem().toString();
        String priest = cb_priest.getSelectedItem().toString();
        String presider = tf_presider.getText();
        String remarks = tf_remarks.getText();

        String status = "1";
        String date_added = DateType.datetime.format(new Date());
        String father = lbl_father.getText();
        String mother = lbl_mother.getText();

        String is_acc = "0";
        if (xb_acc.isSelected()) {
            is_acc = "1";
        }
        String acc_date = DateType.sf.format(dp_accep_date.getDate());
        String is_elected = "0";
        if (xb_election.isSelected()) {
            is_elected = "1";
        }
        String elected_date = DateType.sf.format(dp_election.getDate());
        String is_scrunity1 = "0";
        if (xb_scrunity1.isSelected()) {
            is_scrunity1 = "1";
        }
        String scrunity1_date = DateType.sf.format(dp_scrunity1.getDate());

        String is_present = "0";
        if (xb_present_of_creed.isSelected()) {
            is_present = "1";
        }
        String present_date = DateType.sf.format(dp_present_l_pr.getDate());
        String is_scrunity2 = "0";
        if (xb_scrunity2.isSelected()) {
            is_scrunity2 = "1";
        }
        String scrunity2_date = DateType.sf.format(dp_scrunity2.getDate());
        String is_scrunity3 = "0";
        if (xb_scrunity3.isSelected()) {
            is_scrunity3 = "1";
        }

        String scrunity3_date = DateType.sf.format(dp_scrunity3.getDate());
        String is_present_l = "0";
        if (xb_present_l_pr.isSelected()) {
            is_present_l = "1";
        }
        String present_l_date = DateType.sf.format(dp_present_of_creed.getDate());
        String is_recit = "0";
        if (xb_recitation_of_creed.isSelected()) {
            is_recit = "1";
        }
        String recit_date = DateType.sf.format(dp_recitation.getDate());

        String is_ephepheta = "0";
        if (xb_ephepheta_rite.isSelected()) {
            is_ephepheta = "1";
        }
        String ephepheta_date = DateType.sf.format(dp_ephepheta_rite.getDate());

        to_acceptance to = new to_acceptance(ref_no, fname, mi, lname, bday, place_of_birth, bapt_date, bapt_place, book_no, page_no, acceptance_date, acceptance_time, priest, presider, remarks, status, date_added, father, mother, is_acc, acc_date, is_elected, elected_date, is_scrunity1, scrunity1_date, is_present, present_date, is_scrunity2, scrunity2_date, is_scrunity3, scrunity3_date, is_present_l, present_l_date, is_recit, recit_date, is_ephepheta, ephepheta_date);
        if (callback != null) {
            if (jj == 1) {
                callback.ok(new CloseDialog(this), new OutputData(to, sponsors_ALM));
            }
            if (jj == 2) {
                callback.edit(new CloseDialog(this), new OutputData(to, sponsors_ALM));
            }
            if (jj == 3) {
                callback.delete(new CloseDialog(this), new OutputData(to, sponsors_ALM));
            }


        }
    }
    private List<S8_baptism.to_sponsors> sponsors_ALM = new ArrayList();

    private void sponsors() {

        String name = lbl_fname.getText() + " " + lbl_mi.getText() + " " + lbl_lname.getText();
        Window p = (Window) this;
        Dlg_new_bap_sponsors nd = Dlg_new_bap_sponsors.create(p, true);
        nd.setTitle("");
        nd.not_yet_added(name, "0", sponsors_ALM);

        nd.setCallback(new Dlg_new_bap_sponsors.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_bap_sponsors.OutputData data) {
                closeDialog.ok();
                sponsors_ALM = data.wit;
                int r = sponsors_ALM.size();
                lbl_sponsors.setText("" + r);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
}
