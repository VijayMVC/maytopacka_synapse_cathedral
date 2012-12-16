/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import bb.dlg.Dlg_confirm;
import java.awt.Toolkit;
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
import p.new_form.to_baptism.S4_new_marriage;
import p.svc.S3_cb_convenience;
import bb.svc2.S6_parishioners.to_parishioners;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_new_marriages extends javax.swing.JDialog {

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

        public final to_marriage to_marr;
        public final List<to_marriage_sponsors> to_marr_sp;

        public OutputData(to_marriage to_marr, List<to_marriage_sponsors> to_marr_sp) {
            this.to_marr = to_marr;
            this.to_marr_sp = to_marr_sp;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_new_marriages(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_new_marriages(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_new_marriages() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_new_marriages myRef;

    private void setThisRef(Dlg_new_marriages myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_new_marriages> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_new_marriages create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_new_marriages create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_new_marriages dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_marriages((java.awt.Frame) parent, false);
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
            Dlg_new_marriages dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_marriages((java.awt.Dialog) parent, false);
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


        Dlg_new_marriages dialog = Dlg_new_marriages.create(new javax.swing.JFrame(), true);
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
        jLabel11 = new javax.swing.JLabel();
        tf_groom_mother = new javax.swing.JTextField();
        tf_groom_fname = new javax.swing.JTextField();
        tf_groom_mi = new javax.swing.JTextField();
        tf_groom_lname = new javax.swing.JTextField();
        tf_groom_bplace = new javax.swing.JTextField();
        tf_groom_father = new javax.swing.JTextField();
        dp_groom_bday = new com.toedter.calendar.JDateChooser();
        dp_groom_bapt_date = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_groom_bapt_church = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        lbl_groom_ref = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tf_brider_mother = new javax.swing.JTextField();
        tf_bride_fname = new javax.swing.JTextField();
        tf_bride_mi = new javax.swing.JTextField();
        tf_brider_lname = new javax.swing.JTextField();
        tf_bride_bplace = new javax.swing.JTextField();
        tf_bride_father = new javax.swing.JTextField();
        dp_bride_bday = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        tf_brider_bapt_church = new javax.swing.JTextArea();
        dp_brider_bapt_date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        lbl_bride_ref = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        xb_groom_disp_canonical = new javax.swing.JCheckBox();
        xb_groom_former_marriage = new javax.swing.JCheckBox();
        xb_groom_disp_cult = new javax.swing.JCheckBox();
        xb_brider_disp_cult = new javax.swing.JCheckBox();
        xb_brider_former_marr = new javax.swing.JCheckBox();
        xb_bride_disp_canonical = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btn_bride = new javax.swing.JButton();
        btn_groom = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tf_pageno = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        dp_marr_date = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        cb_priest = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tf_presider = new javax.swing.JTextField();
        cb_time = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        lbl_sponsor = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MARRIAGE INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 1290, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("GROOM");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        tf_groom_mother.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_groom_mother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_groom_mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_groom_motherActionPerformed(evt);
            }
        });
        jPanel3.add(tf_groom_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 310, 30));

        tf_groom_fname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_groom_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_groom_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_groom_fnameActionPerformed(evt);
            }
        });
        jPanel3.add(tf_groom_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 310, 30));

        tf_groom_mi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_groom_mi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_groom_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_groom_miActionPerformed(evt);
            }
        });
        jPanel3.add(tf_groom_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 310, 30));

        tf_groom_lname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_groom_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_groom_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_groom_lnameActionPerformed(evt);
            }
        });
        jPanel3.add(tf_groom_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 30));

        tf_groom_bplace.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_groom_bplace.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_groom_bplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_groom_bplaceActionPerformed(evt);
            }
        });
        jPanel3.add(tf_groom_bplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 30));

        tf_groom_father.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_groom_father.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_groom_father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_groom_fatherActionPerformed(evt);
            }
        });
        jPanel3.add(tf_groom_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 310, 30));
        jPanel3.add(dp_groom_bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, 30));
        jPanel3.add(dp_groom_bapt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 230, 30));

        tf_groom_bapt_church.setColumns(20);
        tf_groom_bapt_church.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_groom_bapt_church.setLineWrap(true);
        tf_groom_bapt_church.setRows(5);
        tf_groom_bapt_church.setWrapStyleWord(true);
        jScrollPane5.setViewportView(tf_groom_bapt_church);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 310, 50));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ref #:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 30));

        lbl_groom_ref.setBackground(new java.awt.Color(35, 11, 11));
        lbl_groom_ref.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_groom_ref.setForeground(java.awt.Color.green);
        lbl_groom_ref.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_groom_ref.setText("0");
        lbl_groom_ref.setOpaque(true);
        jPanel3.add(lbl_groom_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, 30));

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 60, 30));

        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 60, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 450));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("First Name:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, 30));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Middle Name:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 120, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Last Name:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 120, 30));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Date of Birth:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 120, 30));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Place Of Birth:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 120, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Father:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 120, 30));

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Bapt. Church:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 120, 30));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("BRIDE");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        tf_brider_mother.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_brider_mother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_brider_mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_brider_motherActionPerformed(evt);
            }
        });
        jPanel4.add(tf_brider_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 310, 30));

        tf_bride_fname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bride_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bride_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bride_fnameActionPerformed(evt);
            }
        });
        jPanel4.add(tf_bride_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 310, 30));

        tf_bride_mi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bride_mi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bride_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bride_miActionPerformed(evt);
            }
        });
        jPanel4.add(tf_bride_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 310, 30));

        tf_brider_lname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_brider_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_brider_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_brider_lnameActionPerformed(evt);
            }
        });
        jPanel4.add(tf_brider_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 30));

        tf_bride_bplace.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bride_bplace.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bride_bplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bride_bplaceActionPerformed(evt);
            }
        });
        jPanel4.add(tf_bride_bplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 30));

        tf_bride_father.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bride_father.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bride_father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bride_fatherActionPerformed(evt);
            }
        });
        jPanel4.add(tf_bride_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 310, 30));
        jPanel4.add(dp_bride_bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 30));

        tf_brider_bapt_church.setColumns(20);
        tf_brider_bapt_church.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_brider_bapt_church.setLineWrap(true);
        tf_brider_bapt_church.setRows(5);
        tf_brider_bapt_church.setWrapStyleWord(true);
        jScrollPane6.setViewportView(tf_brider_bapt_church);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 310, 50));
        jPanel4.add(dp_brider_bapt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ref #:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 30));

        lbl_bride_ref.setBackground(new java.awt.Color(35, 11, 11));
        lbl_bride_ref.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_bride_ref.setForeground(java.awt.Color.green);
        lbl_bride_ref.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bride_ref.setText("0");
        lbl_bride_ref.setOpaque(true);
        jPanel4.add(lbl_bride_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, 30));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 60, 30));

        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 60, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 350, 450));

        xb_groom_disp_canonical.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        xb_groom_disp_canonical.setText("Display from Canonical Form");
        jPanel1.add(xb_groom_disp_canonical, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 290, -1));

        xb_groom_former_marriage.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        xb_groom_former_marriage.setText("Former Marriage");
        jPanel1.add(xb_groom_former_marriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        xb_groom_disp_cult.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        xb_groom_disp_cult.setText("Disp Cult.");
        jPanel1.add(xb_groom_disp_cult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 130, -1));

        xb_brider_disp_cult.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        xb_brider_disp_cult.setText("Disp Cult.");
        jPanel1.add(xb_brider_disp_cult, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 130, -1));

        xb_brider_former_marr.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        xb_brider_former_marr.setText("Former Marriage");
        jPanel1.add(xb_brider_former_marr, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        xb_bride_disp_canonical.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        xb_bride_disp_canonical.setText("Display from Canonical Form");
        jPanel1.add(xb_bride_disp_canonical, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 290, -1));

        jLabel2.setText("Choose from the Buttons to Coordinate:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        btn_bride.setText("Coordinate with Bride's Master Record");
        jPanel1.add(btn_bride, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 360, -1));

        btn_groom.setText("Coordinate with Groom's Master Record");
        jPanel1.add(btn_groom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 360, -1));

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Book No:");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        tf_book_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_book_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_book_no.setText("0");
        tf_book_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_noActionPerformed(evt);
            }
        });
        jPanel5.add(tf_book_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 80, 30));

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Page No:");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 90, 30));

        tf_pageno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_pageno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_pageno.setText("0");
        tf_pageno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pagenoActionPerformed(evt);
            }
        });
        jPanel5.add(tf_pageno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, 30));

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Marriage Date:");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel5.add(dp_marr_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Time:");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 30));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 370, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Priest:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, -1));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Presider:");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, -1));

        tf_presider.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_presider.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_presider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_presiderActionPerformed(evt);
            }
        });
        jPanel5.add(tf_presider, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 370, 30));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 360, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("SPONSORS:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, 30));

        lbl_sponsor.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_sponsor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sponsor.setText("0");
        lbl_sponsor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lbl_sponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 50, 30));

        jButton8.setText("+");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 50, 30));

        tf_remarks.setColumns(20);
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        tf_remarks.setWrapStyleWord(true);
        jScrollPane4.setViewportView(tf_remarks);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 370, 40));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setText("REMARKS:");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 400, 430));

        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 110, 40));

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, 110, 40));

        jButton5.setText("CLOSE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 110, 40));

        btn_ok.setText("ADD");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 670, 110, 40));

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Mother:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 120, 30));

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Bapt. Date:");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_groom_motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_groom_motherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_groom_motherActionPerformed

    private void tf_groom_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_groom_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_groom_fnameActionPerformed

    private void tf_groom_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_groom_miActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_groom_miActionPerformed

    private void tf_groom_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_groom_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_groom_lnameActionPerformed

    private void tf_groom_bplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_groom_bplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_groom_bplaceActionPerformed

    private void tf_groom_fatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_groom_fatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_groom_fatherActionPerformed

    private void tf_brider_motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_brider_motherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_brider_motherActionPerformed

    private void tf_bride_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bride_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bride_fnameActionPerformed

    private void tf_bride_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bride_miActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bride_miActionPerformed

    private void tf_brider_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_brider_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_brider_lnameActionPerformed

    private void tf_bride_bplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bride_bplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bride_bplaceActionPerformed

    private void tf_bride_fatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bride_fatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bride_fatherActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf_book_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_noActionPerformed

    private void tf_pagenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pagenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pagenoActionPerformed

    private void tf_presiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_presiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_presiderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jj = 1;
        search();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        // TODO add your handling code here:
        j2 = 1;
        ok1();
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        j2 = 2;
        ok1();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        j2 = 3;
        ok1();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        sponsors();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jj = 2;
        search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        clear_groom();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        clear_bride();
    }//GEN-LAST:event_jButton7ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bride;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_groom;
    private javax.swing.JButton btn_ok;
    private javax.swing.JComboBox cb_priest;
    private javax.swing.JComboBox cb_time;
    private com.toedter.calendar.JDateChooser dp_bride_bday;
    private com.toedter.calendar.JDateChooser dp_brider_bapt_date;
    private com.toedter.calendar.JDateChooser dp_groom_bapt_date;
    private com.toedter.calendar.JDateChooser dp_groom_bday;
    private com.toedter.calendar.JDateChooser dp_marr_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_bride_ref;
    private javax.swing.JLabel lbl_groom_ref;
    private javax.swing.JLabel lbl_sponsor;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_bride_bplace;
    private javax.swing.JTextField tf_bride_father;
    private javax.swing.JTextField tf_bride_fname;
    private javax.swing.JTextField tf_bride_mi;
    private javax.swing.JTextArea tf_brider_bapt_church;
    private javax.swing.JTextField tf_brider_lname;
    private javax.swing.JTextField tf_brider_mother;
    private javax.swing.JTextArea tf_groom_bapt_church;
    private javax.swing.JTextField tf_groom_bplace;
    private javax.swing.JTextField tf_groom_father;
    private javax.swing.JTextField tf_groom_fname;
    private javax.swing.JTextField tf_groom_lname;
    private javax.swing.JTextField tf_groom_mi;
    private javax.swing.JTextField tf_groom_mother;
    private javax.swing.JTextField tf_pageno;
    private javax.swing.JTextField tf_presider;
    private javax.swing.JTextArea tf_remarks;
    private javax.swing.JCheckBox xb_bride_disp_canonical;
    private javax.swing.JCheckBox xb_brider_disp_cult;
    private javax.swing.JCheckBox xb_brider_former_marr;
    private javax.swing.JCheckBox xb_groom_disp_canonical;
    private javax.swing.JCheckBox xb_groom_disp_cult;
    private javax.swing.JCheckBox xb_groom_former_marriage;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        dp_groom_bday.setDate(new Date());
        dp_bride_bday.setDate(new Date());
        dp_marr_date.setDate(new Date());

        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);

        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_mat);

        AutoCompleteDecorator.decorate(cb_priest);
        AutoCompleteDecorator.decorate(cb_time);


        init_key();
    }

    public void do_pass1(String ref_no, String gender) {
//        JOptionPane.showMessageDialog(null, ref_no);
        btn_ok.setEnabled(false);

        to_marriage to = S4_new_marriage.ret_details(ref_no);
        sponsors_ALM = S4_new_marriage.ret_bap_sponsors(ref_no);

        lbl_sponsor.setText("" + sponsors_ALM.size());
        lbl_groom_ref.setText(to.g_ref_no);
        tf_groom_fname.setText(to.g_fname);
        tf_groom_mi.setText(to.g_mi);
        tf_groom_lname.setText(to.g_lname);
        tf_groom_bplace.setText(to.g_place_of_birth);

        tf_groom_bapt_church.setText(to.g_bapt_place);
        tf_groom_father.setText(to.g_father);
        tf_groom_mother.setText(to.b_mother);


        try {
            dp_groom_bday.setDate(DateType.sf.parse(to.b_bday));
            dp_groom_bapt_date.setDate(DateType.sf.parse(to.g_bapt_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
        }


        lbl_bride_ref.setText(to.b_ref_no);
        tf_bride_fname.setText(to.b_fname);
        tf_bride_mi.setText(to.b_mi);
        tf_brider_lname.setText(to.b_lname);
        tf_bride_bplace.setText(to.b_place_of_birth);

        tf_brider_bapt_church.setText(to.b_bapt_place);
        tf_bride_father.setText(to.b_father);
        tf_brider_mother.setText(to.b_mother);


        tf_book_no.setText(to.book_no);
        tf_presider.setText(to.presider);
        tf_pageno.setText(to.page_no);
        tf_remarks.setText(to.remarks);


        cb_time.setSelectedItem(to.marr_time);
        cb_priest.setSelectedItem(to.priest);

        try {
            dp_bride_bday.setDate(DateType.sf.parse(to.b_bday));
            dp_brider_bapt_date.setDate(DateType.sf.parse(to.b_bapt_date));
            dp_marr_date.setDate(DateType.sf.parse(to.marr_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
        }


        if (to.g_disp_cult.equals("1")) {
            xb_groom_disp_cult.setSelected(true);
        }
        if (to.g_disp_canonical.equals("1")) {
            xb_groom_disp_canonical.setSelected(true);
        }
        if (to.g_former_marr.equals("1")) {
            xb_groom_former_marriage.setSelected(true);
        }

        if (to.b_disp_cult.equals("1")) {
            xb_brider_disp_cult.setSelected(true);
        }
        if (to.b_disp_canonical.equals("1")) {
            xb_bride_disp_canonical.setSelected(true);
        }
        if (to.b_former_marr.equals("1")) {
            xb_brider_former_marr.setSelected(true);
        }

        if (gender.equals("1")) {
            jButton9.setEnabled(false);
            jButton2.setEnabled(false);
        } else {
            jButton1.setEnabled(false);
            jButton7.setEnabled(false);
        }


    }
    int j2 = 0;

    public void do_pass(String f_name, String mi, String lname, String bday, String place_of_birth, String father, String mother, String ref_no, String bapt_date, String bapt_place, String gender) {
        if (gender.equals("1")) {
            lbl_groom_ref.setText(ref_no);
            tf_groom_fname.setText(f_name);
            tf_groom_mi.setText(mi);
            tf_groom_lname.setText(lname);
            tf_groom_bplace.setText(place_of_birth);

            tf_groom_bapt_church.setText(bapt_place);
            tf_groom_father.setText(father);
            tf_groom_mother.setText(mother);


            try {
                dp_groom_bday.setDate(DateType.sf.parse(bday));
                dp_groom_bapt_date.setDate(DateType.sf.parse(bapt_date));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
            }

            btn_bride.setEnabled(false);
            jButton2.setEnabled(false);


            btn_edit.setEnabled(false);
            btn_delete.setEnabled(false);
            jButton9.setEnabled(false);
//          


//            lbl_bride_ref.setText("" + S6_parishioners.get_ref_id());

        } else {
            lbl_bride_ref.setText(ref_no);
            tf_bride_fname.setText(f_name);
            tf_bride_mi.setText(mi);
            tf_brider_lname.setText(lname);
            tf_bride_bplace.setText(place_of_birth);

            tf_brider_bapt_church.setText(bapt_place);
            tf_bride_father.setText(father);
            tf_brider_mother.setText(mother);


            try {
                dp_bride_bday.setDate(DateType.sf.parse(bday));
                dp_brider_bapt_date.setDate(DateType.sf.parse(bapt_date));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
            }
            btn_groom.setEnabled(false);

            jButton1.setEnabled(false);
            jButton7.setEnabled(false);
//            lbl_groom_ref.setText("" + S6_parishioners.get_ref_id());
        }


    }

    public void do_pass() {
    }

    public static class to_marriage {

        public final String g_ref_no;
        public final String g_fname;
        public final String g_mi;
        public final String g_lname;
        public final String g_bday;
        public final String g_place_of_birth;
        public final String g_bapt_date;
        public final String g_bapt_place;
        public final String g_disp_cult;
        public final String g_disp_canonical;
        public final String g_former_marr;
        public final String g_father;
        public final String g_mother;
        public final String b_ref_no;
        public final String b_fname;
        public final String b_mi;
        public final String b_lname;
        public final String b_bday;
        public final String b_place_of_birth;
        public final String b_bapt_date;
        public final String b_bapt_place;
        public final String b_disp_cult;
        public final String b_disp_canonical;
        public final String b_former_marr;
        public final String b_father;
        public final String b_mother;
        public final String book_no;
        public final String page_no;
        public final String marr_date;
        public final String marr_time;
        public final String priest;
        public final String presider;
        public final String remarks;
        public final String status;
        public final String date_added;

        public to_marriage(String g_ref_no, String g_fname, String g_mi, String g_lname, String g_bday, String g_place_of_birth, String g_bapt_date, String g_bapt_place, String g_disp_cult, String g_disp_canonical, String g_former_marr, String g_father, String g_mother, String b_ref_no, String b_fname, String b_mi, String b_lname, String b_bday, String b_place_of_birth, String b_bapt_date, String b_bapt_place, String b_disp_cult, String b_disp_canonical, String b_former_marr, String b_father, String b_mother, String book_no, String page_no, String marr_date, String marr_time, String priest, String presider, String remarks, String status, String date_added) {
            this.g_ref_no = g_ref_no;
            this.g_fname = g_fname;
            this.g_mi = g_mi;
            this.g_lname = g_lname;
            this.g_bday = g_bday;
            this.g_place_of_birth = g_place_of_birth;
            this.g_bapt_date = g_bapt_date;
            this.g_bapt_place = g_bapt_place;
            this.g_disp_cult = g_disp_cult;
            this.g_disp_canonical = g_disp_canonical;
            this.g_former_marr = g_former_marr;
            this.g_father = g_father;
            this.g_mother = g_mother;
            this.b_ref_no = b_ref_no;
            this.b_fname = b_fname;
            this.b_mi = b_mi;
            this.b_lname = b_lname;
            this.b_bday = b_bday;
            this.b_place_of_birth = b_place_of_birth;
            this.b_bapt_date = b_bapt_date;
            this.b_bapt_place = b_bapt_place;
            this.b_disp_cult = b_disp_cult;
            this.b_disp_canonical = b_disp_canonical;
            this.b_former_marr = b_former_marr;
            this.b_father = b_father;
            this.b_mother = b_mother;
            this.book_no = book_no;
            this.page_no = page_no;
            this.marr_date = marr_date;
            this.marr_time = marr_time;
            this.priest = priest;
            this.presider = presider;
            this.remarks = remarks;
            this.status = status;
            this.date_added = date_added;
        }
    }
    private List<to_marriage_sponsors> sponsors_ALM = new ArrayList();

    public static class to_marriage_sponsors {

        public final String name;

        public to_marriage_sponsors(String name) {
            this.name = name;
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
        String g_ref_no = lbl_groom_ref.getText();
        String g_fname = tf_groom_fname.getText();
        String g_mi = tf_groom_mi.getText();
        String g_lname = tf_groom_lname.getText();
        String g_bday = DateType.sf.format(dp_groom_bday.getDate());
        String g_place_of_birth = tf_groom_bplace.getText();
        String g_bapt_date = DateType.sf.format(dp_groom_bapt_date.getDate());
        String g_bapt_place = tf_groom_bapt_church.getText();

        String g_disp_cult = "0";
        if (xb_groom_disp_cult.isSelected()) {
            g_disp_cult = "1";
        }
        String g_disp_canonical = "0";
        if (xb_groom_disp_canonical.isSelected()) {
            g_disp_canonical = "1";
        }
        String g_former_marr = "0";
        if (xb_groom_former_marriage.isSelected()) {
            g_former_marr = "1";
        }

        String g_father = tf_groom_father.getText();
        String g_mother = tf_groom_mother.getText();



        String b_ref_no = lbl_bride_ref.getText();
        String b_fname = tf_bride_fname.getText();
        String b_mi = tf_bride_mi.getText();
        String b_lname = tf_brider_lname.getText();
        String b_bday = DateType.sf.format(dp_bride_bday.getDate());
        String b_place_of_birth = tf_bride_bplace.getText();
        String b_bapt_date = DateType.sf.format(dp_brider_bapt_date.getDate());
        String b_bapt_place = tf_brider_bapt_church.getText();


        String b_disp_cult = "0";
        String b_disp_canonical = "0";
        String b_former_marr = "0";



        if (xb_brider_disp_cult.isSelected()) {
            b_disp_cult = "1";
        }

        if (xb_bride_disp_canonical.isSelected()) {
            b_disp_canonical = "1";
        }

        if (xb_brider_former_marr.isSelected()) {
            b_former_marr = "1";
        }

        String b_father = tf_bride_father.getText();
        String b_mother = tf_brider_mother.getText();



        String book_no = tf_book_no.getText();
        String page_no = tf_pageno.getText();
        String marr_date = DateType.sf.format(dp_marr_date.getDate());
        String marr_time = cb_time.getSelectedItem().toString();
        String priest = cb_priest.getSelectedItem().toString();
        String presider = tf_presider.getText();
        String remarks = tf_remarks.getText();
        String status = "1";
        String date_added = DateType.datetime.format(new Date());

        final to_marriage to_ma = new to_marriage(g_ref_no, g_fname, g_mi, g_lname, g_bday, g_place_of_birth, g_bapt_date, g_bapt_place, g_disp_cult, g_disp_canonical, g_former_marr, g_father, g_mother, b_ref_no, b_fname, b_mi, b_lname, b_bday, b_place_of_birth, b_bapt_date, b_bapt_place, b_disp_cult, b_disp_canonical, b_former_marr, b_father, b_mother, book_no, page_no, marr_date, marr_time, priest, presider, remarks, status, date_added);

        if (callback != null) {

            if (j2 == 1) {
                callback.ok(new CloseDialog(this), new OutputData(to_ma, sponsors_ALM));
            }
            if (j2 == 2) {
                Window p = (Window) this;
                Dlg_confirm nd = Dlg_confirm.create(p, true);
                nd.setTitle("");
                nd.do_pass();
                nd.setCallback(new Dlg_confirm.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                        closeDialog.ok();

                        do_edit(to_ma);

                    }
                });
                Center.setCenter(nd);

                nd.setVisible(true);
            }
            if (j2 == 3) {
                Window p = (Window) this;
                Dlg_confirm nd = Dlg_confirm.create(p, true);
                nd.setTitle("");
                nd.do_pass();
                nd.setCallback(new Dlg_confirm.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                        closeDialog.ok();

                        do_delete(to_ma);

                    }
                });
                Center.setCenter(nd);

                nd.setVisible(true);
            }

        }
    }

    private void do_edit(to_marriage to_ma) {
        callback.edit(new CloseDialog(this), new OutputData(to_ma, sponsors_ALM));
    }

    private void do_delete(to_marriage to_ma) {
        callback.delete(new CloseDialog(this), new OutputData(to_ma, sponsors_ALM));
    }

    private void sponsors() {


        String g_name = tf_groom_fname.getText() + " " + tf_groom_mi.getText() + " " + tf_groom_lname.getText();
        String b_name = tf_bride_fname.getText() + " " + tf_bride_mi.getText() + " " + tf_brider_lname.getText();
        String name = g_name + " & " + b_name;
        Window p = (Window) this;
        Dlg_new_marr_sponsors nd = Dlg_new_marr_sponsors.create(p, true);
        nd.setTitle("");
        nd.not_yet_added(name, "0", sponsors_ALM);

        nd.setCallback(new Dlg_new_marr_sponsors.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_marr_sponsors.OutputData data) {
                closeDialog.ok();
                sponsors_ALM = data.wit;
                int r = sponsors_ALM.size();
                lbl_sponsor.setText("" + r);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
    int jj = 0;

    private void search() {
        Window p = (Window) this;
        Dlg_search_recepient2 nd = Dlg_search_recepient2.create(p, true);
        nd.setTitle("");
        nd.do_pass("","");
        nd.setCallback(new Dlg_search_recepient2.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_search_recepient2.OutputData data) {
                closeDialog.ok();
//                paroshioner_exists = 1;

                if (jj == 1) {
                    set_data1(data.to);
                } else {
                    set_data2(data.to);
                }
            }
        });
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());

        nd.setVisible(true);
        nd.setSize(xSize, ySize);

    }

    private void set_data1(to_parishioners to) {

        lbl_groom_ref.setText(to.ref_id);
        tf_groom_fname.setText(to.fname);
        tf_groom_mi.setText(to.mi);
        tf_groom_lname.setText(to.lname);
        tf_groom_bplace.setText(to.place_of_birth);

        tf_groom_bapt_church.setText(to.bapt_place);
        tf_groom_father.setText(to.father);
        tf_groom_mother.setText(to.mother);


        try {
            dp_groom_bday.setDate(DateType.sf.parse(to.date_of_birth));
            dp_groom_bapt_date.setDate(DateType.sf.parse(to.date_of_baptism));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    private void set_data2(to_parishioners to) {


        lbl_bride_ref.setText(to.ref_id);
        tf_bride_fname.setText(to.fname);
        tf_bride_mi.setText(to.mi);
        tf_brider_lname.setText(to.lname);
        tf_bride_bplace.setText(to.place_of_birth);

        tf_brider_bapt_church.setText(to.bapt_place);
        tf_bride_father.setText(to.father);
        tf_brider_mother.setText(to.mother);


        try {
            dp_bride_bday.setDate(DateType.sf.parse(to.date_of_birth));
            dp_brider_bapt_date.setDate(DateType.sf.parse(to.date_of_baptism));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clear_bride() {
        lbl_bride_ref.setText("0");
        tf_bride_fname.setText("");
        tf_bride_mi.setText("");
        tf_brider_lname.setText("");
        tf_bride_bplace.setText("");

        tf_brider_bapt_church.setText("");
        tf_bride_father.setText("");
        tf_brider_mother.setText("");



        dp_bride_bday.setDate((new Date()));
        dp_brider_bapt_date.setDate(new Date());

    }

    private void clear_groom() {

        lbl_groom_ref.setText("0");
        tf_groom_fname.setText("");
        tf_groom_mi.setText("");
        tf_groom_lname.setText("");
        tf_groom_bplace.setText("");

        tf_groom_bapt_church.setText("");
        tf_groom_father.setText("");
        tf_groom_mother.setText("");



        dp_groom_bday.setDate(new Date());
        dp_groom_bapt_date.setDate(new Date());

    }
}
