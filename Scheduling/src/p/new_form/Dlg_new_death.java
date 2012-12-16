/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.new_form.to_baptism.S5_new_funeral;
import p.svc.S3_cb_convenience;
import p.util.DateType;

/**
 *
 * @author dummy
 */
public class Dlg_new_death extends javax.swing.JDialog {

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

        public final to_funeral to;

        public OutputData(to_funeral to) {
            this.to = to;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_new_death(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_new_death(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_new_death() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_new_death myRef;

    private void setThisRef(Dlg_new_death myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_new_death> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_new_death create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_new_death create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_new_death dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_death((java.awt.Frame) parent, false);
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
            Dlg_new_death dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_new_death((java.awt.Dialog) parent, false);
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


        Dlg_new_death dialog = Dlg_new_death.create(new javax.swing.JFrame(), true);
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
        dp_death = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dp_burial_date = new com.toedter.calendar.JDateChooser();
        tf_wife = new javax.swing.JTextField();
        tf_burial_place = new javax.swing.JTextField();
        tf_sac = new javax.swing.JTextField();
        tf_presider = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_page_no = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        cb_time = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_mi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_date_of_birth = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_bplace = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbl_father = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_mother = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cb_priest = new javax.swing.JComboBox();
        lbl_ref_no = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dp_date_bapt = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_bap_church = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_cause_of_death = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUNERAL INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 1120, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Remarks:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 90, 30));
        jPanel3.add(dp_death, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 180, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Date of Burial:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 120, 30));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Cause of Death:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 120, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Place of Burial:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 120, 30));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Wife/Husband:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 120, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Sac. of Annointing:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, 30));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Presider:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 90, 30));
        jPanel3.add(dp_burial_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 180, 30));

        tf_wife.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_wife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_wifeActionPerformed(evt);
            }
        });
        jPanel3.add(tf_wife, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 410, 30));

        tf_burial_place.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_burial_place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_burial_placeActionPerformed(evt);
            }
        });
        jPanel3.add(tf_burial_place, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 370, 30));

        tf_sac.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel3.add(tf_sac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 410, 30));

        tf_presider.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel3.add(tf_presider, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 370, 30));

        tf_remarks.setColumns(20);
        tf_remarks.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        tf_remarks.setWrapStyleWord(true);
        jScrollPane4.setViewportView(tf_remarks);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 370, 70));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Book No:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 90, 30));

        tf_book_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_book_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_book_no.setText("0");
        jPanel3.add(tf_book_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 80, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Page No:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 80, 30));

        tf_page_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_page_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_page_no.setText("0");
        jPanel3.add(tf_page_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, 80, 30));

        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel3.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 110, 40));

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 110, 40));

        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 110, 40));

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 110, 40));

        cb_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 370, 30));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Time:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 80, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("First Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 30));

        lbl_fname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_fname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_fname.setText("Ronald");
        jPanel3.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 330, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Middle Name:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 108, 120, 30));

        lbl_mi.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mi.setText("Cadayday");
        jPanel3.add(lbl_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 330, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Last Name:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 138, 120, 30));

        lbl_lname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_lname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_lname.setText("Pascua");
        jPanel3.add(lbl_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 330, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Date of Birth:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 168, 150, 30));

        lbl_date_of_birth.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_date_of_birth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_date_of_birth.setText("February 8, 1991");
        jPanel3.add(lbl_date_of_birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 330, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Place Of Birth:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

        lbl_bplace.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_bplace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bplace.setText("Manila City");
        jPanel3.add(lbl_bplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 330, 30));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Father:");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 228, 110, 30));

        lbl_father.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_father.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_father.setText("Basilio Pascua");
        jPanel3.add(lbl_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 330, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Mother:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 30));

        lbl_mother.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_mother.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mother.setText("Rosie Pascua");
        jPanel3.add(lbl_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 330, 30));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Priest:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 110, 30));

        cb_priest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_priest, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 370, 30));

        lbl_ref_no.setBackground(new java.awt.Color(35, 11, 11));
        lbl_ref_no.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_ref_no.setForeground(java.awt.Color.green);
        lbl_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ref_no.setText("0");
        lbl_ref_no.setOpaque(true);
        jPanel3.add(lbl_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 100, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ref #:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 30));
        jPanel3.add(dp_date_bapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 230, 30));

        tf_bap_church.setColumns(20);
        tf_bap_church.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bap_church.setLineWrap(true);
        tf_bap_church.setRows(5);
        tf_bap_church.setWrapStyleWord(true);
        jScrollPane5.setViewportView(tf_bap_church);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 310, 50));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Bapt. Church:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 110, 30));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Date of Baptism:");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, 30));

        tf_cause_of_death.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_cause_of_death.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cause_of_deathActionPerformed(evt);
            }
        });
        jPanel3.add(tf_cause_of_death, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 410, 40));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Date of Death:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1100, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        jj = 1;
        ok1();
    }//GEN-LAST:event_btn_addActionPerformed

    private void tf_burial_placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_burial_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_burial_placeActionPerformed

    private void tf_wifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_wifeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_wifeActionPerformed

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

    private void tf_cause_of_deathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cause_of_deathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cause_of_deathActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JComboBox cb_priest;
    private javax.swing.JComboBox cb_time;
    private com.toedter.calendar.JDateChooser dp_burial_date;
    private com.toedter.calendar.JDateChooser dp_date_bapt;
    private com.toedter.calendar.JDateChooser dp_death;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JTextArea tf_bap_church;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_burial_place;
    private javax.swing.JTextField tf_cause_of_death;
    private javax.swing.JTextField tf_page_no;
    private javax.swing.JTextField tf_presider;
    private javax.swing.JTextArea tf_remarks;
    private javax.swing.JTextField tf_sac;
    private javax.swing.JTextField tf_wife;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

        dp_date_bapt.setDate(new Date());
        dp_burial_date.setDate(new Date());
        dp_death.setDate(new Date());

        S3_cb_convenience.cb_init(cb_priest, S3_cb_convenience.s_priest);

        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time_fun);
        AutoCompleteDecorator.decorate(cb_priest);
        AutoCompleteDecorator.decorate(cb_time);
        init_key();
    }
    int jj = 0;

    public void do_pass() {
    }

    public void do_pass1(String ref_no, String gender) {
        btn_add.setEnabled(false);

        to_funeral to = S5_new_funeral.ret_data(ref_no);
        lbl_ref_no.setText(ref_no);
        lbl_fname.setText(to.fname);
        lbl_mi.setText(to.mi);
        lbl_lname.setText(to.lname);
        lbl_bplace.setText(to.place_of_birth);

        lbl_father.setText(to.father);
        lbl_mother.setText(to.mother);

        lbl_date_of_birth.setText(to.bday);
        tf_wife.setText(to.wife_husband);
        tf_sac.setText(to.sac_of_annointing);

        tf_book_no.setText(to.book_no);
        tf_page_no.setText(to.page_no);
        tf_burial_place.setText(to.place_buried);
        tf_presider.setText(to.presider);
        tf_remarks.setText(to.remarks);
        tf_bap_church.setText(to.bapt_place);
        tf_cause_of_death.setText(to.cause_of_death);
        try {
            dp_date_bapt.setDate(DateType.sf.parse(to.bapt_date));
            dp_death.setDate(DateType.sf.parse(to.date_died));
            dp_burial_date.setDate(DateType.sf.parse(to.funeral_date));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_new_marriages.class.getName()).log(Level.SEVERE, null, ex);
        }

        cb_time.setSelectedItem(to.funeral_time);
        cb_priest.setSelectedItem(to.priest);


//        btn_edit.setEnabled(false);
//        btn_delete.setEnabled(false);

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

    public static class to_funeral {

        public final String fname;
        public final String mi;
        public final String lname;
        public final String bday;
        public final String place_of_birth;
        public final String bapt_date;
        public final String bapt_place;
        public final String father;
        public final String mother;
        public final String funeral_date;
        public final String funeral_time;
        public final String priest;
        public final String wife_husband;
        public final String w_ref_no;
        public final String sac_of_annointing;
        public final String presider;
        public final String remarks;
        public final String book_no;
        public final String page_no;
        public final String status;
        public final String date_added;
        public final String date_died;
        public final String place_buried;
        public final String cause_of_death;

        public to_funeral(String fname, String mi, String lname, String bday, String place_of_birth, String bapt_date, String bapt_place, String father, String mother, String funeral_date, String funeral_time, String priest, String wife_husband, String w_ref_no, String sac_of_annointing, String presider, String remarks, String book_no, String page_no, String status, String date_added, String date_died, String place_buried, String cause_of_death) {
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.bday = bday;
            this.place_of_birth = place_of_birth;
            this.bapt_date = bapt_date;
            this.bapt_place = bapt_place;
            this.father = father;
            this.mother = mother;
            this.funeral_date = funeral_date;
            this.funeral_time = funeral_time;
            this.priest = priest;
            this.wife_husband = wife_husband;
            this.w_ref_no = w_ref_no;
            this.sac_of_annointing = sac_of_annointing;
            this.presider = presider;
            this.remarks = remarks;
            this.book_no = book_no;
            this.page_no = page_no;
            this.status = status;
            this.date_added = date_added;
            this.date_died = date_died;
            this.place_buried = place_buried;
            this.cause_of_death = cause_of_death;
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
        String fname = lbl_fname.getText();
        String mi = lbl_mi.getText();
        String lname = lbl_lname.getText();
        String bday = lbl_date_of_birth.getText();
        String place_of_birth = lbl_bplace.getText();

        String bapt_date = DateType.sf.format(dp_date_bapt.getDate());
        String bapt_place = tf_bap_church.getText();
        String father = lbl_father.getText();
        String mother = lbl_mother.getText();
        String funeral_date = DateType.sf.format(dp_burial_date.getDate());

        String funeral_time = cb_time.getSelectedItem().toString();
        String priest = cb_priest.getSelectedItem().toString();
        String wife_husband = tf_wife.getText();
        String w_ref_no = "0";
        String sac_of_annointing = tf_sac.getText();

        String presider = tf_presider.getText();
        String remarks = tf_remarks.getText();
        String book_no = tf_book_no.getText();
        String page_no = tf_page_no.getText();
        String status = "1";

        String date_added = DateType.datetime.format(new Date());
        String date_died = DateType.sf.format(dp_death.getDate());
        String place_buried = tf_burial_place.getText();
        String cause_of_death = tf_cause_of_death.getText();
        to_funeral to = new to_funeral(fname, mi, lname, bday, place_of_birth, bapt_date, bapt_place, father, mother, funeral_date, funeral_time, priest, wife_husband, w_ref_no, sac_of_annointing, presider, remarks, book_no, page_no, status, date_added, date_died, place_buried, cause_of_death);

        if (callback != null) {
            if (jj == 1) {
                callback.ok(new CloseDialog(this), new OutputData(to));
            }
            if (jj == 2) {
                callback.edit(new CloseDialog(this), new OutputData(to));
            }
            if (jj == 3) {
                callback.delete(new CloseDialog(this), new OutputData(to));
            }

        }
    }
}
