/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import bb.dlg.Dlg_confirm;
import bb.svc2.S7_book_archives;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.combobox.ListComboBoxModel;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.S8_baptism;
import p.new_form.to_baptism.S1_new_baptism;
import p.new_form.to_baptism.to_baptism;
import p.new_form.to_baptism.to_baptism.to_marriage_tribunal;
import p.svc.S3_cb_convenience;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_new_baptism extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_new_baptism
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

        public final to_basic_info to_basic;
        public final to_2nd_details to_2nd_info;
        public final List<S8_baptism.to_sponsors> to_spon;
        public final List<to_baptism.to_marriage_tribunal> to_marriage_trib;

        public OutputData(to_basic_info to_basic, to_2nd_details to_2nd_info, List<S8_baptism.to_sponsors> to_spon, List<to_marriage_tribunal> to_marriage_trib) {
            this.to_basic = to_basic;
            this.to_2nd_info = to_2nd_info;
            this.to_spon = to_spon;
            this.to_marriage_trib = to_marriage_trib;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_new_baptism(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_new_baptism(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_new_baptism() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_new_baptism myRef;

    private void setThisRef(Dlg_new_baptism myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_new_baptism> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_new_baptism create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_new_baptism create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_new_baptism dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_baptism((java.awt.Frame) parent, false);
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
            Dlg_new_baptism dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_baptism((java.awt.Dialog) parent, false);
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
            System.setProperty("sun.java2d.opengl", "True");
            Application.setSystemLookAndFeel();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Dlg_new_baptism dialog = Dlg_new_baptism.create(new javax.swing.JFrame(), true);
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

        jPanel4 = new javax.swing.JPanel();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_sponsors = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        lbl_mi = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        lbl_date_of_birth = new javax.swing.JLabel();
        lbl_bplace = new javax.swing.JLabel();
        lbl_father = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_god_father = new javax.swing.JTextField();
        tf_prox_god_father = new javax.swing.JTextField();
        tf_godmother = new javax.swing.JTextField();
        tf_presider = new javax.swing.JTextField();
        cb_priest = new javax.swing.JComboBox();
        cb_time = new javax.swing.JComboBox();
        dp_bapt_date = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        tf_prox_godmother = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        tf_bapt_church = new javax.swing.JTextField();
        lbl_mother = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbl_ref_no = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_pageno = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        cb_years = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        tf_no = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        dp_reg_prof = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        dp_comm_date = new com.toedter.calendar.JDateChooser();
        tf_com_chruch = new javax.swing.JTextField();
        tf_1st_commchurch = new javax.swing.JTextField();
        cb_rel_prof = new javax.swing.JCheckBox();
        cb_diaconate = new javax.swing.JCheckBox();
        dp_1st_com_date = new com.toedter.calendar.JDateChooser();
        dp_diaconate = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_marriage = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_edit.setText("EDIT");
        btn_edit.setFocusable(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel4.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 110, 40));

        btn_delete.setText("DELETE");
        btn_delete.setFocusable(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 110, 40));

        btn_add.setText("ADD");
        btn_add.setFocusable(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel4.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 630, 110, 40));

        jButton3.setText("CLOSE");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 630, 110, 40));

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BAPTISM INFORMATION");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 40));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_sponsors.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_sponsors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sponsors.setText("0");
        lbl_sponsors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl_sponsors, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 50, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Middle Name:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Last Name:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Date of Birth:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Place Of Birth:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Father:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Mother:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ref #:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 30));

        lbl_fname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_fname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_fname.setText("Ronald");
        jPanel3.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 330, 30));

        lbl_mi.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mi.setText("Cadayday");
        jPanel3.add(lbl_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 330, 30));

        lbl_lname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_lname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_lname.setText("Pascua");
        jPanel3.add(lbl_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 330, 30));

        lbl_date_of_birth.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_date_of_birth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_date_of_birth.setText("February 8, 1991");
        jPanel3.add(lbl_date_of_birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 330, 30));

        lbl_bplace.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_bplace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bplace.setText("Manila City");
        jPanel3.add(lbl_bplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 330, 30));

        lbl_father.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_father.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_father.setText("Basilio Pascua");
        jPanel3.add(lbl_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 330, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("SPONSORS:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 110, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Bapt. Date:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 110, 30));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Time:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Presider:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, 30));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Proxy Godfather:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 10, 30));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Godfather:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 10, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Godmother:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 20, 30));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Bapt. Church:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 30));

        tf_god_father.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_god_father.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_god_father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_god_fatherActionPerformed(evt);
            }
        });
        jPanel3.add(tf_god_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));

        tf_prox_god_father.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_prox_god_father.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_prox_god_father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_prox_god_fatherActionPerformed(evt);
            }
        });
        jPanel3.add(tf_prox_god_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, 30));

        tf_godmother.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_godmother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_godmother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_godmotherActionPerformed(evt);
            }
        });
        jPanel3.add(tf_godmother, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 10, 30));

        tf_presider.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_presider.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_presider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_presiderActionPerformed(evt);
            }
        });
        jPanel3.add(tf_presider, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 10, 30));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 370, 30));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 370, 30));

        dp_bapt_date.setFocusable(false);
        jPanel3.add(dp_bapt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 260, 30));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Proxy Godmother:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 20, 30));

        tf_prox_godmother.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_prox_godmother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_prox_godmother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_prox_godmotherActionPerformed(evt);
            }
        });
        jPanel3.add(tf_prox_godmother, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 10, 30));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Priest:");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 110, 30));

        tf_bapt_church.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bapt_church.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bapt_church.setText("St. Catherine of Alexandria");
        tf_bapt_church.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bapt_churchActionPerformed(evt);
            }
        });
        jPanel3.add(tf_bapt_church, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 370, 30));

        lbl_mother.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mother.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mother.setText("Rosie Pascua");
        jPanel3.add(lbl_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 330, 30));

        jButton8.setText("+");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 60, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("First Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 30));

        lbl_ref_no.setBackground(new java.awt.Color(35, 11, 11));
        lbl_ref_no.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_ref_no.setForeground(java.awt.Color.green);
        lbl_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ref_no.setText("0");
        lbl_ref_no.setOpaque(true);
        jPanel3.add(lbl_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 100, 30));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Year:");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 110, 30));

        tf_book_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_book_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_book_no.setText("0");
        tf_book_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_noActionPerformed(evt);
            }
        });
        tf_book_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_book_noFocusLost(evt);
            }
        });
        jPanel3.add(tf_book_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 110, 30));

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("NO:");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 60, 30));

        tf_pageno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_pageno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_pageno.setText("0");
        tf_pageno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pagenoActionPerformed(evt);
            }
        });
        jPanel3.add(tf_pageno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 110, 30));

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Book No:");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 110, 30));

        cb_years.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cb_years.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_yearsActionPerformed(evt);
            }
        });
        jPanel3.add(cb_years, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 370, 30));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Page No:");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 110, 30));

        tf_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_no.setText("0");
        tf_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_noActionPerformed(evt);
            }
        });
        jPanel3.add(tf_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 110, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 590, 610));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setText("REMARKS:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 140, -1));

        tf_remarks.setColumns(20);
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        tf_remarks.setWrapStyleWord(true);
        jScrollPane4.setViewportView(tf_remarks);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 590, 60));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("1st Comm Church:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        dp_reg_prof.setFocusable(false);
        jPanel1.add(dp_reg_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 260, 30));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("1st Comm Date:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Confirmation Date:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 30));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Marriage:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, 30));

        dp_comm_date.setFocusable(false);
        jPanel1.add(dp_comm_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 260, 30));

        tf_com_chruch.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_com_chruch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_com_chruch.setText("St. Catherine of Alexandria");
        tf_com_chruch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_com_chruchActionPerformed(evt);
            }
        });
        jPanel1.add(tf_com_chruch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 370, 30));

        tf_1st_commchurch.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_1st_commchurch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_1st_commchurch.setText("St. Catherine of Alexandria");
        tf_1st_commchurch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_1st_commchurchActionPerformed(evt);
            }
        });
        jPanel1.add(tf_1st_commchurch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 370, 30));

        cb_rel_prof.setText("Religious Profession:");
        cb_rel_prof.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(cb_rel_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, -1));

        cb_diaconate.setText("(sub) Diaconate:");
        cb_diaconate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(cb_diaconate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        dp_1st_com_date.setFocusable(false);
        jPanel1.add(dp_1st_com_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 260, 30));

        dp_diaconate.setFocusable(false);
        jPanel1.add(dp_diaconate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 260, 30));

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Confirmation Church:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 30));

        tbl_marriage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Marriage No.", "Date of Marriage", "Death of 1st Spouse", "Decree of 1st Annulment", "Case No.", "tribunal No"
            }
        ));
        tbl_marriage.setFocusable(false);
        jScrollPane1.setViewportView(tbl_marriage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 540, 140));

        jButton5.setText("-");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 50, -1));

        jButton6.setText("+");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 50, -1));

        jButton7.setText("[]");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 50, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 620, 570));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_god_fatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_god_fatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_god_fatherActionPerformed

    private void tf_prox_god_fatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_prox_god_fatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_prox_god_fatherActionPerformed

    private void tf_godmotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_godmotherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_godmotherActionPerformed

    private void tf_presiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_presiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_presiderActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_prox_godmotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_prox_godmotherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_prox_godmotherActionPerformed

    private void tf_pagenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pagenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pagenoActionPerformed

    private void tf_com_chruchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_com_chruchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_com_chruchActionPerformed

    private void tf_1st_commchurchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_1st_commchurchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_1st_commchurchActionPerformed

    private void tf_book_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_noActionPerformed
        // TODO add your handling code here:
        get_year();
      
    }//GEN-LAST:event_tf_book_noActionPerformed

    private void tf_bapt_churchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bapt_churchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bapt_churchActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        sponsors();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here
        add_sponsor();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        do_edit_sponsors();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        do_remove();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        j2 = 1;
        ok1();
    }//GEN-LAST:event_btn_addActionPerformed

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

    private void cb_yearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_yearsActionPerformed
        // TODO add your handling code here:
        get_book_no();
    }//GEN-LAST:event_cb_yearsActionPerformed

    private void tf_book_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_book_noFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_noFocusLost

    private void tf_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_noActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JCheckBox cb_diaconate;
    private javax.swing.JComboBox cb_priest;
    private javax.swing.JCheckBox cb_rel_prof;
    private javax.swing.JComboBox cb_time;
    private javax.swing.JComboBox cb_years;
    private com.toedter.calendar.JDateChooser dp_1st_com_date;
    private com.toedter.calendar.JDateChooser dp_bapt_date;
    private com.toedter.calendar.JDateChooser dp_comm_date;
    private com.toedter.calendar.JDateChooser dp_diaconate;
    private com.toedter.calendar.JDateChooser dp_reg_prof;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_bplace;
    private javax.swing.JLabel lbl_date_of_birth;
    private javax.swing.JLabel lbl_father;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_mi;
    private javax.swing.JLabel lbl_mother;
    private javax.swing.JLabel lbl_ref_no;
    private javax.swing.JLabel lbl_sponsors;
    private javax.swing.JTable tbl_marriage;
    private javax.swing.JTextField tf_1st_commchurch;
    private javax.swing.JTextField tf_bapt_church;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_com_chruch;
    private javax.swing.JTextField tf_god_father;
    private javax.swing.JTextField tf_godmother;
    private javax.swing.JTextField tf_no;
    private javax.swing.JTextField tf_pageno;
    private javax.swing.JTextField tf_presider;
    private javax.swing.JTextField tf_prox_god_father;
    private javax.swing.JTextField tf_prox_godmother;
    private javax.swing.JTextArea tf_remarks;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        hiden();
        init_cb_years();
        dp_1st_com_date.setDate(new Date());
        dp_bapt_date.setDate(new Date());
        dp_comm_date.setDate(new Date());
        dp_diaconate.setDate(new Date());
        dp_reg_prof.setDate(new Date());
        dp_bapt_date.transferFocus();
        cb_time.grabFocus();
//        cb_priest.setEditable(true);
//        cb_time.setEditable(true);
        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);


        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_bap);
        AutoCompleteDecorator.decorate(cb_priest);
        AutoCompleteDecorator.decorate(cb_time);
        AutoCompleteDecorator.decorate(cb_years);
        init_key();
        init_tbl_marriage();
    }

    private void get_book_no() {
        String year = cb_years.getSelectedItem().toString();
        String book_no = S7_book_archives.ret_arc_book_no(year);
        tf_book_no.setText(book_no);
        tf_book_no.selectAll();
    }

    private void get_year() {
        tf_book_no.selectAll();
        String book_no = tf_book_no.getText();
        String year = S7_book_archives.ret_arc_year(book_no);
//        JOptionPane.showMessageDialog(null, year);
//        cb_years.setFocusable(false);
        if (year.equals("0")) {
        } else {
            cb_years.setSelectedItem(year);
            AutoCompleteDecorator.decorate(cb_years);
              tf_book_no.transferFocus();
        }

//        cb_years.setSelectedIndex(10);

    }

    private void init_cb_years() {
        cb_years.setModel(new ListComboBoxModel(S7_book_archives.ret_arc_by_sac("Baptism")));
    }

    private void hiden() {
//        jLabel20.setVisible(false);
//        cb_time.setVisible(false);
        jLabel23.setVisible(false);
        tf_god_father.setVisible(false);
        jLabel22.setVisible(false);

        tf_prox_god_father.setVisible(false);
        jLabel24.setVisible(false);
        tf_godmother.setVisible(false);
        tf_prox_godmother.setVisible(false);
        tf_presider.setVisible(false);

        jLabel21.setVisible(false);
        jLabel26.setVisible(false);

    }

    // <editor-fold defaultstate="collapsed" desc="to_basic_info">
    public static class to_basic_info {

        public final String fname;
        public final String mi;
        public final String lname;
        public final String bday;
        public final String bday_place;
        public final String father;
        public final String mother;
        public final String godfather;
        public final String proxy_godfather;
        public final String godmother;
        public final String proxy_godmother;
        public final String presider;
        public final String date_of_baptism;
        public final String time;
        public final String bap_church;
        public final String priest;

        public to_basic_info(String fname, String mi, String lname, String bday, String bday_place, String father, String mother, String godfather, String proxy_godfather, String godmother, String proxy_godmother, String presider, String date_of_baptism, String time, String bap_church, String priest) {
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.bday = bday;
            this.bday_place = bday_place;
            this.father = father;
            this.mother = mother;
            this.godfather = godfather;
            this.proxy_godfather = proxy_godfather;
            this.godmother = godmother;
            this.proxy_godmother = proxy_godmother;
            this.presider = presider;
            this.date_of_baptism = date_of_baptism;
            this.time = time;
            this.bap_church = bap_church;
            this.priest = priest;
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="to_2nd_details">
    public static class to_2nd_details {

        public final String book_no;
        public final String page_no;
        public final String f_comm_date;
        public final String f_comm_church;
        public final String f_confirmation_date;
        public final String f_confirmation_church;
        public final String is_diaconate;
        public final String diaconate_date;
        public final String is_rel_profession;
        public final String rel_prof_date;
        public final String remarks;
        public final String years;
        public final String num;

        public to_2nd_details(String book_no, String page_no, String f_comm_date, String f_comm_church, String f_confirmation_date, String f_confirmation_church, String is_diaconate, String diaconate_date, String is_rel_profession, String rel_prof_date, String remarks,String years,String num) {
            this.book_no = book_no;
            this.page_no = page_no;
            this.f_comm_date = f_comm_date;
            this.f_comm_church = f_comm_church;
            this.f_confirmation_date = f_confirmation_date;
            this.f_confirmation_church = f_confirmation_church;
            this.is_diaconate = is_diaconate;
            this.diaconate_date = diaconate_date;
            this.is_rel_profession = is_rel_profession;
            this.rel_prof_date = rel_prof_date;
            this.remarks = remarks;
            this.years=years;
            this.num=num;
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="to_sponsors">
    public static class to_sponsors {

        List<S8_baptism.to_sponsors> sponsors;

        public to_sponsors(List<S8_baptism.to_sponsors> sponsors) {
            this.sponsors = sponsors;
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="to_marriage">
    public static class to_marriage {

        List<to_baptism.to_marriage_tribunal> to_marr_trib;

        public to_marriage(List<to_marriage_tribunal> to_marr_trib) {
            this.to_marr_trib = to_marr_trib;
        }
    }
    // </editor-fold>
    int jj = 0;

    public void do_pass1(String ref_no) {
        jj = 2;


        lbl_ref_no.setText(ref_no);

        to_basic_info tb = S1_new_baptism.ret_bap_basic_info(ref_no);
        to_2nd_details t2 = S1_new_baptism.ret_baptism_2nd_info(ref_no);

        loadData_baptism2(S1_new_baptism.ret_bap_marr(ref_no));
        sponsors_ALM = S1_new_baptism.ret_bap_sponsors(ref_no);

        lbl_sponsors.setText("" + sponsors_ALM.size());
        btn_add.setEnabled(false);
//         
//         
        cb_years.setSelectedItem(t2.years);
        tf_no.setText(t2.num);
        
        lbl_mi.setText(tb.mi);
        lbl_fname.setText(tb.fname);
        lbl_mi.setText(tb.mi);
        lbl_lname.setText(tb.lname);
        lbl_date_of_birth.setText(tb.bday);
        lbl_bplace.setText(tb.bday_place);
        lbl_father.setText(tb.father);
        lbl_mother.setText(tb.mother);

        tf_god_father.setText(tb.godfather);
        tf_prox_god_father.setText(tb.proxy_godfather);
        tf_godmother.setText(tb.godmother);
        tf_prox_godmother.setText(tb.proxy_godmother);
        tf_presider.setText(tb.presider);

        tf_bapt_church.setText(tb.bap_church);

        cb_priest.setSelectedItem(tb.priest);
        cb_time.setSelectedItem(tb.time);


        tf_book_no.setText(t2.book_no);
        tf_pageno.setText(t2.page_no);

        tf_1st_commchurch.setText(t2.f_comm_church);

        tf_com_chruch.setText(t2.f_confirmation_church);

        if (t2.is_diaconate.equals("1")) {
            cb_diaconate.setSelected(true);
        } else {
            cb_diaconate.setSelected(false);
        }

        if (t2.is_rel_profession.equals("1")) {
            cb_rel_prof.setSelected(true);
        } else {
            cb_rel_prof.setSelected(false);
        }





        tf_remarks.setText(t2.remarks);

        try {
            dp_bapt_date.setDate(DateType.sf.parse(tb.date_of_baptism));
            dp_1st_com_date.setDate(DateType.sf.parse(t2.f_comm_date));
            dp_comm_date.setDate(DateType.sf.parse(t2.f_confirmation_date));
            dp_diaconate.setDate(DateType.sf.parse(t2.diaconate_date));
            dp_reg_prof.setDate(DateType.sf.parse(t2.rel_prof_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_baptism.class.getName()).log(Level.SEVERE, null, ex);
        }


//        
    }

    public void do_pass(String f_name, String mi, String lname, String bday, String place_of_birth, String father, String mother, String ref_no, String bapt_date, String bapt_place) {
        lbl_bplace.setText(place_of_birth);
        lbl_date_of_birth.setText(bday);
        lbl_father.setText(father);
        lbl_fname.setText(f_name);
        lbl_lname.setText(lname);
        lbl_mi.setText(mi);
        lbl_mother.setText(mother);
        lbl_ref_no.setText(ref_no);
        tf_bapt_church.setText(bapt_place);
        try {
            dp_bapt_date.setDate(DateType.sf.parse(bapt_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_baptism.class.getName()).log(Level.SEVERE, null, ex);
        }

        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        sponsors_ALM.clear();

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

    private void init_tbl_marriage() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_marriage.setModel(tbl_employee_payroll_M);
        tbl_marriage.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_marriage.setRowHeight(25);

        tbl_marriage.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 150, 150, 150, 150, 150};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
//            if (i == 0) {
//                continue;
//            }
            TableWidthUtilities.setColumnWidth(tbl_marriage, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        Dimension d = tbl_marriage.getTableHeader().getPreferredSize();
        d.height = 20;
        tbl_marriage.getTableHeader().setPreferredSize(d);

        tbl_marriage.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_marriage.setRowHeight(35);
        tbl_marriage.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_baptism(List<to_baptism.to_marriage_tribunal> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    private void loadData_baptism2(List<to_baptism.to_marriage_tribunal> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Marr No.", "Date of Marriage", "Date of Death(Spouse)", "Decree of Ordinance", "Case No", "Tribunal No"
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
            to_baptism.to_marriage_tribunal tt = (to_baptism.to_marriage_tribunal) getRow(row);

            switch (col) {
                case 0:
                    return tt.marriage_no;
                case 1:
                    return tt.date_of_marriage;
                case 2:
                    return tt.Date_of_death_of_spouse;
                case 3:
                    return tt.decree_ordi_no;
                case 4:
                    return tt.case_no;

                default:
                    return tt.tribunal_no;
            }
        }
    }

    private void data_employee() {
//        String date = lb_date_baptism.getText();
//        String name = tf_searc.getText();
    }
//
//    private void pm_tbl_users(MouseEvent evt) {
//        if (evt.isPopupTrigger()) {
//            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
//        }
//    }

    private void add_sponsor() {
        int row = tbl_marriage.getRowCount();
//        JOptionPane.showMessageDialog(null, row);
        row++;
        Window p = (Window) this;
        Dlg_marriage_trib nd = Dlg_marriage_trib.create(p, true);
        nd.setTitle("");

        nd.do_pass(row, DateType.sf.format(new Date()), DateType.sf.format(new Date()), "", "", "");
        nd.setCallback(new Dlg_marriage_trib.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_marriage_trib.OutputData data) {
                closeDialog.ok();
//                set_sporsors(data.name);
                set_sporsors(data.marriage_no, data.date_of_marriage, data.date_of_death, data.decree_no, data.case_no, data.tribunal_no);
            }
        });
        Center.setCenter(nd);
//        Application.locateOnParentCenter(p, nd);

        nd.setVisible(true);
    }

    private void set_sporsors(int marriage_no, String date_of_marriage, String date_of_death, String decree_no, String case_no, String tribunal_no) {

        List<to_baptism.to_marriage_tribunal> datas = new ArrayList();

        to_baptism.to_marriage_tribunal to = new to_baptism.to_marriage_tribunal(marriage_no, date_of_marriage, date_of_death, decree_no, case_no, tribunal_no);
        datas.add(to);
        loadData_baptism(datas);
    }

    private void set_sporsors(String ma) {
//        List<to_marriage_tribunal> datas = new ArrayList();
//
//        to_marriage_tribunal to = new to_marriage_tribunal(m_no, date_of_marriage, date_of_death, decree, case_no, tribunal_no);
//        datas.add(to);
//        loadData_baptism(datas);
    }

    private void do_edit_sponsors() {
        int idx = tbl_marriage.getSelectedRow();
        if (idx < 0) {
            return;
        }

        int marriage_no = Integer.parseInt(tbl_marriage.getModel().getValueAt(idx, 0).toString());
        String date_of_marriage = tbl_marriage.getModel().getValueAt(idx, 1).toString();
        String date_of_death = tbl_marriage.getModel().getValueAt(idx, 2).toString();
        String ord_no = tbl_marriage.getModel().getValueAt(idx, 3).toString();
        String case_no = tbl_marriage.getModel().getValueAt(idx, 4).toString();
        String tribunal_no = tbl_marriage.getModel().getValueAt(idx, 5).toString();




        Window p = (Window) this;
        Dlg_marriage_trib nd = Dlg_marriage_trib.create(p, true);
        nd.setTitle("");

        nd.do_pass(marriage_no, date_of_marriage, date_of_death, ord_no, case_no, tribunal_no);
        nd.setCallback(new Dlg_marriage_trib.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_marriage_trib.OutputData data) {
                closeDialog.ok();
                set_val(closeDialog, data);
//                set_sporsors(data.name);
//                set_sporsors(data.marriage_no, data.date_of_marriage, data.date_of_death, data.decree_no, data.case_no, data.tribunal_no);
            }
        });
        Center.setCenter(nd);
//        Application.locateOnParentCenter(p, nd);

        nd.setVisible(true);
    }

    private void set_val(CloseDialog closeDialog, Dlg_marriage_trib.OutputData data) {
        int idx = tbl_marriage.getSelectedRow();
        if (idx < 0) {
            return;
        }

        to_baptism.to_marriage_tribunal order = (to_baptism.to_marriage_tribunal) tbl_employee_payroll_ALM.get(tbl_marriage.convertRowIndexToModel(idx));

        order.setCase_no(data.case_no);
        order.setDate_of_death_of_spouse(data.date_of_death);
        order.setDate_of_marriage(data.date_of_marriage);
        order.setDecree_ordi_no(data.decree_no);
        order.setTribunal_no(data.tribunal_no);
        tbl_employee_payroll_M.fireTableDataChanged();

        tbl_marriage.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_marriage);


    }

    private void do_remove() {

        final int[] idx = tbl_marriage.getSelectedRows();


        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                List rem = new ArrayList();
                for (int ix : idx) {
                    if (tbl_marriage.isRowSelected(ix)) {
                        int mx = tbl_marriage.convertRowIndexToModel(ix);
                        rem.add(tbl_employee_payroll_ALM.get(mx));
                    }
                }

                tbl_employee_payroll_ALM.removeAll(rem);
                tbl_employee_payroll_M.fireTableDataChanged();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

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
    int j2 = 0;

    private void ok1() {


        String fname = lbl_fname.getText();
        String mi = lbl_mi.getText();
        String lname = lbl_lname.getText();
        String bday = lbl_date_of_birth.getText();
        String bday_place = lbl_bplace.getText();
        String father = lbl_father.getText();
        String mother = lbl_mother.getText();
        String godfather = tf_god_father.getText();
        String proxy_godfather = tf_prox_god_father.getText();
        String godmother = tf_godmother.getText();
        String proxy_godmother = tf_prox_godmother.getText();
        String presider = tf_presider.getText();
        String date_of_baptism = DateType.sf.format(dp_bapt_date.getDate());
        String time = cb_time.getSelectedItem().toString();
        String bap_church = tf_bapt_church.getText();
        String priest = cb_priest.getSelectedItem().toString();

        final to_basic_info to_basic = new to_basic_info(fname, mi, lname, bday, bday_place, father, mother, godfather, proxy_godfather, godmother, proxy_godmother, presider, date_of_baptism, time, bap_church, priest);

        String book_no = tf_book_no.getText();
        String page_no = tf_pageno.getText();
        String f_comm_date = DateType.sf.format(dp_1st_com_date.getDate());
        String f_comm_church = tf_1st_commchurch.getText();
        String f_confirmation_date = DateType.sf.format(dp_comm_date.getDate());
        String f_confirmation_church = tf_com_chruch.getText();

        String is_diaconate = "";
        if (cb_diaconate.isSelected()) {
            is_diaconate = "1";
        } else {
            is_diaconate = "0";
        }
        String diaconate_date = DateType.sf.format(dp_diaconate.getDate());


        String is_rel_profession = "";
        if (cb_rel_prof.isSelected()) {
            is_rel_profession = "1";
        } else {
            is_rel_profession = "0";
        }
        String rel_prof_date = DateType.sf.format(dp_reg_prof.getDate());
        String remarks = tf_remarks.getText();
  
        String years=cb_years.getSelectedItem().toString();
        String num=tf_no.getText();
        

        final to_2nd_details to_2nd_inf = new to_2nd_details(book_no, page_no, f_comm_date, f_comm_church, f_confirmation_date, f_confirmation_church, is_diaconate, diaconate_date, is_rel_profession, rel_prof_date, remarks,years,num);


        final List<S8_baptism.to_sponsors> to_spon = sponsors_ALM;
        final List<to_baptism.to_marriage_tribunal> to_marriage_trib = tbl_employee_payroll_ALM;

        if (callback != null) {
            if (j2 == 1) {
                callback.ok(new CloseDialog(this), new OutputData(to_basic, to_2nd_inf, to_spon, to_marriage_trib));
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

                        do_edit(to_basic, to_2nd_inf, to_spon, to_marriage_trib);

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

                        do_delete(to_basic, to_2nd_inf, to_spon, to_marriage_trib);

                    }
                });
                Center.setCenter(nd);

                nd.setVisible(true);

            }

        }
    }

    private void do_edit(to_basic_info to_basic, to_2nd_details to_2nd_inf, List<S8_baptism.to_sponsors> to_spon, List<to_marriage_tribunal> to_marriage_trib) {
        callback.edit(new CloseDialog(this), new OutputData(to_basic, to_2nd_inf, to_spon, to_marriage_trib));
    }

    private void do_delete(to_basic_info to_basic, to_2nd_details to_2nd_inf, List<S8_baptism.to_sponsors> to_spon, List<to_marriage_tribunal> to_marriage_trib) {
        callback.delete(new CloseDialog(this), new OutputData(to_basic, to_2nd_inf, to_spon, to_marriage_trib));
    }
}
