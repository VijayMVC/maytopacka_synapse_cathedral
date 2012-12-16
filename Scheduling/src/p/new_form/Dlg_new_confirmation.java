/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import bb.dlg.Dlg_confirm;
import bb.dlg.Dlg_name;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.S8_baptism;
import p.new_form.to_baptism.S1_new_baptism;
import p.new_form.to_baptism.S2_new_communion;
import p.new_form.to_baptism.S3_new_confirmation;
import p.svc.S3_cb_convenience;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_new_confirmation extends javax.swing.JDialog {

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

        public final to_confirmation to_conf;
        public final List<to_conf_sponsors> sponsor;

        public OutputData(to_confirmation to_conf, List<to_conf_sponsors> sponsor) {
            this.to_conf = to_conf;
            this.sponsor = sponsor;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_new_confirmation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_new_confirmation(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_new_confirmation() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_new_confirmation myRef;

    private void setThisRef(Dlg_new_confirmation myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_new_confirmation> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_new_confirmation create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_new_confirmation create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_new_confirmation dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_confirmation((java.awt.Frame) parent, false);
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
            Dlg_new_confirmation dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_confirmation((java.awt.Dialog) parent, false);
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


        Dlg_new_confirmation dialog = Dlg_new_confirmation.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        dp_conf_date = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cb_priest = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        tf_presider = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tf_bookno = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tf_pageno = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sponsors = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_ref_no = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbl_mi = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbl_bday = new javax.swing.JLabel();
        lbl_place = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbl_father = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lbl_mother = new javax.swing.JLabel();
        dp_bapt_date = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_bapt_place = new javax.swing.JTextArea();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONFIRMATION INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 1190, -1));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Confirmation Date:");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));
        jPanel3.add(dp_conf_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 260, 30));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Time:");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 30));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 370, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Priest:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 148, 110, 30));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 370, 30));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Presider:");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 198, 110, 30));

        tf_presider.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_presider.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_presider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_presiderActionPerformed(evt);
            }
        });
        jPanel3.add(tf_presider, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 370, 30));

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Book No:");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, 30));

        tf_bookno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bookno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bookno.setText("0");
        tf_bookno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_booknoActionPerformed(evt);
            }
        });
        jPanel3.add(tf_bookno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, 30));

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Page No:");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 110, 30));

        tf_pageno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_pageno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_pageno.setText("0");
        tf_pageno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pagenoActionPerformed(evt);
            }
        });
        jPanel3.add(tf_pageno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 110, 30));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Sponsors:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, -1));

        tbl_sponsors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "NAME"
            }
        ));
        jScrollPane1.setViewportView(tbl_sponsors);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 430, 210));

        jButton6.setText("+");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 60, -1));

        jButton7.setText("[]");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 60, -1));

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 60, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 610, 540));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_remarks.setColumns(20);
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        tf_remarks.setWrapStyleWord(true);
        jScrollPane5.setViewportView(tf_remarks);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 350, 80));

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Remarks:");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 110, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ref #:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 30));

        lbl_ref_no.setBackground(new java.awt.Color(35, 11, 11));
        lbl_ref_no.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_ref_no.setForeground(java.awt.Color.green);
        lbl_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ref_no.setText("0");
        lbl_ref_no.setOpaque(true);
        jPanel4.add(lbl_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 100, 30));

        lbl_fname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_fname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_fname.setText("Ronald");
        jPanel4.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 330, 30));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("First Name:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 30));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Middle Name:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, -1));

        lbl_mi.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mi.setText("Cadayday");
        jPanel4.add(lbl_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 330, 30));

        lbl_lname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_lname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_lname.setText("Pascua");
        jPanel4.add(lbl_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 330, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Last Name:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Date of Birth:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, -1));

        lbl_bday.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_bday.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bday.setText("February 8, 1991");
        jPanel4.add(lbl_bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 330, 30));

        lbl_place.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_place.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_place.setText("Manila City");
        jPanel4.add(lbl_place, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 330, 30));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Place Of Birth:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, -1));

        lbl_father.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_father.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_father.setText("Basilio Pascua");
        jPanel4.add(lbl_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 330, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Father:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, -1));

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Mother:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, -1));

        lbl_mother.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mother.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mother.setText("Rosie Pascua");
        jPanel4.add(lbl_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 330, 30));
        jPanel4.add(dp_bapt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 160, 30));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Bapt. Date:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 30));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Bapt. Church:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, 30));

        tf_bapt_place.setColumns(20);
        tf_bapt_place.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bapt_place.setLineWrap(true);
        tf_bapt_place.setRows(5);
        tf_bapt_place.setWrapStyleWord(true);
        jScrollPane2.setViewportView(tf_bapt_place);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 350, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 540));

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 100, 40));

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 640, 100, 40));

        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 640, 100, 40));

        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_presiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_presiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_presiderActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_booknoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_booknoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_booknoActionPerformed

    private void tf_pagenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pagenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pagenoActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        jj = 1;
        ok1();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        jj = 2;
        ok1();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        jj = 3;
        ok1();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
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
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JComboBox cb_priest;
    private javax.swing.JComboBox cb_time;
    private com.toedter.calendar.JDateChooser dp_bapt_date;
    private com.toedter.calendar.JDateChooser dp_conf_date;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_bday;
    private javax.swing.JLabel lbl_father;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_mi;
    private javax.swing.JLabel lbl_mother;
    private javax.swing.JLabel lbl_place;
    private javax.swing.JLabel lbl_ref_no;
    private javax.swing.JTable tbl_sponsors;
    private javax.swing.JTextArea tf_bapt_place;
    private javax.swing.JTextField tf_bookno;
    private javax.swing.JTextField tf_pageno;
    private javax.swing.JTextField tf_presider;
    private javax.swing.JTextArea tf_remarks;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        dp_bapt_date.setDate(new Date());
        dp_conf_date.setDate(new Date());


        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);

        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_con);
        AutoCompleteDecorator.decorate(cb_priest);
        AutoCompleteDecorator.decorate(cb_time);
        init_key();
        init_tbl_sponsors();
    }

//    public void do_pass(){
// 
//    }
    public void do_pass(String f_name, String mi, String lname, String bday, String place_of_birth, String father, String mother, String ref_no, String bapt_date, String bapt_place) {
        lbl_place.setText(place_of_birth);
        lbl_bday.setText(bday);
        lbl_father.setText(father);
        lbl_fname.setText(f_name);
        lbl_lname.setText(lname);
        lbl_mi.setText(mi);
        lbl_mother.setText(mother);
        lbl_ref_no.setText(ref_no);
        tf_bapt_place.setText(bapt_place);
        try {
            dp_bapt_date.setDate(DateType.sf.parse(bapt_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_communion.class.getName()).log(Level.SEVERE, null, ex);
        }


        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);


    }
    int jj = 0;
    private List< Dlg_new_confirmation.to_conf_sponsors> sponsors_ALM = new ArrayList();

    public void do_pass1(String ref_no) {
        jj = 2;


        lbl_ref_no.setText(ref_no);
        Dlg_new_confirmation.to_confirmation to = S3_new_confirmation.get_details(ref_no);
        btn_add.setEnabled(false);
//         
//         
        sponsors_ALM = S3_new_confirmation.ret_bap_sponsors(ref_no);
        loadData_baptism2(S3_new_confirmation.ret_bap_sponsors(ref_no));

        lbl_fname.setText(to.fname);
        lbl_mi.setText(to.mi);
        lbl_lname.setText(to.lname);
        lbl_bday.setText(to.bday);
        tf_bapt_place.setText(to.bapt_place);
        lbl_father.setText(to.father);
        lbl_mother.setText(to.mother);


        tf_bookno.setText(to.book_no);
        tf_pageno.setText(to.page_no);
        cb_time.setSelectedItem(to.time);
        cb_priest.setSelectedItem(to.priest);
        tf_presider.setText(to.presider);
        tf_remarks.setText(to.remarks);


        try {
            dp_bapt_date.setDate(DateType.sf.parse(to.bapt_date));
            dp_conf_date.setDate(DateType.sf.parse(to.conf_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_communion.class.getName()).log(Level.SEVERE, null, ex);
        }
//        
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

    public static class to_confirmation {

        public final String fname;
        public final String mi;
        public final String lname;
        public final String bday;
        public final String place_of_birth;
        public final String bapt_date;
        public final String bapt_place;
        public final String book_no;
        public final String page_no;
        public final String conf_date;
        public final String time;
        public final String priest;
        public final String presider;
        public final String remarks;
        public final String father;
        public final String mother;

        public to_confirmation(String fname, String mi, String lname, String bday, String place_of_birth, String bapt_date, String bapt_place, String book_no, String page_no, String conf_date, String time, String priest, String presider, String remarks, String father, String mother) {
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.bday = bday;
            this.place_of_birth = place_of_birth;
            this.bapt_date = bapt_date;
            this.bapt_place = bapt_place;
            this.book_no = book_no;
            this.page_no = page_no;
            this.conf_date = conf_date;
            this.time = time;
            this.priest = priest;
            this.presider = presider;
            this.remarks = remarks;
            this.father = father;
            this.mother = mother;
        }
    }

    public static class to_conf_sponsors {

        public String name;

        public to_conf_sponsors(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private void ok1() {

        String fname = lbl_fname.getText();
        String mi = lbl_mi.getText();
        String lname = lbl_lname.getText();
        String bday = lbl_bday.getText();
        String place_of_birth = lbl_place.getText();
        String bapt_date = DateType.sf.format(dp_bapt_date.getDate());
        String father = lbl_father.getText();
        String mother = lbl_mother.getText();


        String bapt_place = tf_bapt_place.getText();
        String book_no = tf_bookno.getText();
        String page_no = tf_pageno.getText();
        String comm_date = DateType.sf.format(dp_conf_date.getDate());
        String time = cb_time.getSelectedItem().toString();
        String priest = cb_priest.getSelectedItem().toString();
        String presider = tf_presider.getText();
        String remarks = tf_remarks.getText();

        final Dlg_new_confirmation.to_confirmation to = new Dlg_new_confirmation.to_confirmation(fname, mi, lname, bday, place_of_birth, bapt_date, bapt_place, book_no, page_no, comm_date, time, priest, presider, remarks, father, mother);
        if (callback != null) {

            if (jj == 1) {
                callback.ok(new CloseDialog(this), new Dlg_new_confirmation.OutputData(to, tbl_employee_payroll_ALM));
            }
            if (jj == 2) {

                Window p = (Window) this;
                Dlg_confirm nd = Dlg_confirm.create(p, true);
                nd.setTitle("");
                nd.do_pass();
                nd.setCallback(new Dlg_confirm.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                        closeDialog.ok();

                        do_edit(to);

                    }
                });
                Center.setCenter(nd);

                nd.setVisible(true);

            }
            if (jj == 3) {
                Window p = (Window) this;
                Dlg_confirm nd = Dlg_confirm.create(p, true);
                nd.setTitle("");
                nd.do_pass();
                nd.setCallback(new Dlg_confirm.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                        closeDialog.ok();

                        do_delete(to);

                    }
                });
                Center.setCenter(nd);

                nd.setVisible(true);

            }

        }
    }

    private void do_edit(Dlg_new_confirmation.to_confirmation to) {
        callback.edit(new CloseDialog(this), new Dlg_new_confirmation.OutputData(to, tbl_employee_payroll_ALM));
    }

    private void do_delete(Dlg_new_confirmation.to_confirmation to) {
        callback.delete(new CloseDialog(this), new Dlg_new_confirmation.OutputData(to, tbl_employee_payroll_ALM));
    }
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_sponsors() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_sponsors.setModel(tbl_employee_payroll_M);
        tbl_sponsors.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_sponsors.setRowHeight(25);

//        tbl_sponsors.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_sponsors, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_sponsors.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_sponsors.setRowHeight(35);
        tbl_sponsors.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_baptism(List<Dlg_new_confirmation.to_conf_sponsors> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    private void loadData_baptism2(List<Dlg_new_confirmation.to_conf_sponsors> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "NAME"
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
            Dlg_new_confirmation.to_conf_sponsors tt = (Dlg_new_confirmation.to_conf_sponsors) getRow(row);

            switch (col) {
//                case 0:
//                    return tt.name;

                default:
                    return tt.name;
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
        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_name.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_name.OutputData data) {
                closeDialog.ok();
                set_sporsors(data.name);
            }
        });
        Center.setCenter(nd);
//        Application.locateOnParentCenter(p, nd);

        nd.setVisible(true);
    }

    private void set_sporsors(String name) {
        List<Dlg_new_confirmation.to_conf_sponsors> datas = new ArrayList();
        Dlg_new_confirmation.to_conf_sponsors to = new Dlg_new_confirmation.to_conf_sponsors(name);
        datas.add(to);
        loadData_baptism(datas);
    }

    private void do_edit_sponsors() {
        int idx = tbl_sponsors.getSelectedRow();
        if (idx < 0) {
            return;
        }

        String name = tbl_sponsors.getModel().getValueAt(idx, 0).toString();
        Dlg_new_confirmation.to_conf_sponsors order = (Dlg_new_confirmation.to_conf_sponsors) tbl_employee_payroll_ALM.get(tbl_sponsors.convertRowIndexToModel(idx));

        Window p = (Window) this;
        Dlg_name nd = Dlg_name.create(p, true);
        nd.setTitle("");
        nd.do_pass(name);
//        nd.load(new Dlg_name.InputData(order.souls_of));
        nd.setCallback(new Dlg_name.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_name.OutputData data) {
                set_val(closeDialog, data);
                closeDialog.ok();

            }
        });
        Application.locateOnParentCenter(p, nd);

        nd.setVisible(true);
    }

    private void set_val(CloseDialog closeDialog, Dlg_name.OutputData data) {
        int idx = tbl_sponsors.getSelectedRow();
        if (idx < 0) {
            return;
        }

        Dlg_new_confirmation.to_conf_sponsors order = (Dlg_new_confirmation.to_conf_sponsors) tbl_employee_payroll_ALM.get(tbl_sponsors.convertRowIndexToModel(idx));
        order.setName(data.name);

        tbl_employee_payroll_M.fireTableDataChanged();

        tbl_sponsors.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_sponsors);


    }

    private void do_remove() {

        final int[] idx = tbl_sponsors.getSelectedRows();


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
                    if (tbl_sponsors.isRowSelected(ix)) {
                        int mx = tbl_sponsors.convertRowIndexToModel(ix);
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
}
