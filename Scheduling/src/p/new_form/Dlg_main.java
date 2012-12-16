/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import bb.dlg.Dlg_confirm;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.Timer;
import overallPOS.modules.share.utils.Center;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.KeyMapping;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.baptism.S8_baptism;
import p.baptism.S8_baptism.to_sponsors;
import p.new_form.Dlg_new_acceptance.to_acceptance;
import p.new_form.Dlg_new_baptism.to_2nd_details;
import p.new_form.Dlg_new_baptism.to_basic_info;
import p.new_form.Dlg_new_communion.to_communion;
import p.new_form.Dlg_new_confirmation.to_conf_sponsors;
import p.new_form.Dlg_new_confirmation.to_confirmation;
import p.new_form.Dlg_new_death.to_funeral;
import p.new_form.Dlg_new_marriages.to_marriage;
import p.new_form.Dlg_new_marriages.to_marriage_sponsors;
import p.new_form.to_baptism.*;
import p.new_form.to_baptism.to_baptism.to_marriage_tribunal;
import bb.svc2.S6_parishioners;
import bb.svc2.S6_parishioners.to_parishioners;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.*;
import p.rpt.other_reports.rpt_scheduler_others;
import p.svc.S1_mass_schedules;
import p.util.DateType;
import p.util.NumberToPower;
import p.util.Series_of;
import rpt_main.Dlg_priest;

/**
 *
 * @author dummy
 */
public class Dlg_main extends javax.swing.JDialog {

    /**
     * Creates new form Main_form
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
    private Dlg_main(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_main(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_main() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_main myRef;

    private void setThisRef(Dlg_main myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_main> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_main create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.MODELESS);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_main create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_main dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_main((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().
                        log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_main dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_main((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().
                        log(Level.INFO, "instances: {0}", dialogContainer.size());
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
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.
                    getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_main dialog = Dlg_main.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().
                    removeAll();
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
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        lbl_baptism = new javax.swing.JCheckBox();
        lbl_communion = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        lbl_marriage = new javax.swing.JCheckBox();
        lbl_confirmation = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        lbl_prof_of_faith = new javax.swing.JCheckBox();
        lbl_2nd_marriage = new javax.swing.JCheckBox();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        lbl_death = new javax.swing.JCheckBox();
        lbl_acceptance = new javax.swing.JCheckBox();
        jButton15 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        btn_p_comm = new javax.swing.JButton();
        btn_p_bap = new javax.swing.JButton();
        btn_p_marr = new javax.swing.JButton();
        btn_p_conf = new javax.swing.JButton();
        btn_p_prof = new javax.swing.JButton();
        btn_p_2nd = new javax.swing.JButton();
        btn_p_fun = new javax.swing.JButton();
        btn_p_acc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_lname = new javax.swing.JTextField();
        tf_fname = new javax.swing.JTextField();
        tf_mi = new javax.swing.JTextField();
        dp_bday = new com.toedter.calendar.JDateChooser();
        dp_baptism = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_address2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_place = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_address1 = new javax.swing.JTextArea();
        tf_mother = new javax.swing.JTextField();
        tf_zipcode = new javax.swing.JTextField();
        tf_city = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_state = new javax.swing.JTextField();
        tf_father = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        cb_female = new javax.swing.JCheckBox();
        cb_male = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_bapt_place = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        lbl_ref = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("BAPTISM");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 30));

        lbl_baptism.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_baptism.setForeground(java.awt.Color.red);
        lbl_baptism.setText("No Record");
        lbl_baptism.setFocusable(false);
        lbl_baptism.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_baptismActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_baptism, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 120, 30));

        lbl_communion.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_communion.setForeground(java.awt.Color.red);
        lbl_communion.setText("No Record");
        lbl_communion.setFocusable(false);
        lbl_communion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_communionActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_communion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 120, 30));

        jButton9.setText("COMMUNION");
        jButton9.setEnabled(false);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        jButton10.setText("MARRIAGE");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 30));

        lbl_marriage.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_marriage.setForeground(java.awt.Color.red);
        lbl_marriage.setText("No Record");
        lbl_marriage.setFocusable(false);
        lbl_marriage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_marriageActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_marriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 120, 30));

        lbl_confirmation.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_confirmation.setForeground(java.awt.Color.red);
        lbl_confirmation.setText("No Record");
        lbl_confirmation.setFocusable(false);
        lbl_confirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_confirmationActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_confirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 120, 30));

        jButton11.setText("CONFIRMATION");
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 30));

        jButton12.setText("PROF OF FAITH");
        jButton12.setEnabled(false);
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 30));

        lbl_prof_of_faith.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_prof_of_faith.setForeground(java.awt.Color.red);
        lbl_prof_of_faith.setText("No Record");
        lbl_prof_of_faith.setFocusable(false);
        lbl_prof_of_faith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_prof_of_faithActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_prof_of_faith, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 120, 30));

        lbl_2nd_marriage.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_2nd_marriage.setForeground(java.awt.Color.red);
        lbl_2nd_marriage.setText("No Record");
        lbl_2nd_marriage.setFocusable(false);
        lbl_2nd_marriage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_2nd_marriageActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_2nd_marriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 120, 30));

        jButton13.setText("2ND MARRIAGE");
        jButton13.setEnabled(false);
        jButton13.setFocusable(false);
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 30));

        jButton14.setText("FUNERAL");
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 30));

        lbl_death.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_death.setForeground(java.awt.Color.red);
        lbl_death.setText("No Record");
        lbl_death.setFocusable(false);
        lbl_death.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_deathActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_death, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 120, 30));

        lbl_acceptance.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_acceptance.setForeground(java.awt.Color.red);
        lbl_acceptance.setText("No Record");
        lbl_acceptance.setFocusable(false);
        lbl_acceptance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_acceptanceActionPerformed(evt);
            }
        });
        jPanel3.add(lbl_acceptance, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 120, 30));

        jButton15.setText("ACCEPTANCE");
        jButton15.setEnabled(false);
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("STATUS:");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setText("REMARKS:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 320, 90));

        btn_p_comm.setText("PRINT");
        btn_p_comm.setEnabled(false);
        btn_p_comm.setFocusable(false);
        btn_p_comm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_commActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_comm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 70, 30));

        btn_p_bap.setText("PRINT");
        btn_p_bap.setEnabled(false);
        btn_p_bap.setFocusable(false);
        btn_p_bap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_bapActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_bap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 70, 30));

        btn_p_marr.setText("PRINT");
        btn_p_marr.setEnabled(false);
        btn_p_marr.setFocusable(false);
        btn_p_marr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_marrActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_marr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 70, 30));

        btn_p_conf.setText("PRINT");
        btn_p_conf.setEnabled(false);
        btn_p_conf.setFocusable(false);
        btn_p_conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_confActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, 30));

        btn_p_prof.setText("PRINT");
        btn_p_prof.setEnabled(false);
        btn_p_prof.setFocusable(false);
        btn_p_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_profActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 70, 30));

        btn_p_2nd.setText("PRINT");
        btn_p_2nd.setEnabled(false);
        btn_p_2nd.setFocusable(false);
        btn_p_2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_2ndActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_2nd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 70, 30));

        btn_p_fun.setText("PRINT");
        btn_p_fun.setEnabled(false);
        btn_p_fun.setFocusable(false);
        btn_p_fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_funActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_fun, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 70, 30));

        btn_p_acc.setText("PRINT");
        btn_p_acc.setEnabled(false);
        btn_p_acc.setFocusable(false);
        btn_p_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_accActionPerformed(evt);
            }
        });
        jPanel3.add(btn_p_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 70, 30));

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAIN FORM");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("+");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 50, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("MOTHER:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 110, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("MIDDLE NAME:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 120, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("LAST NAME:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("BAPT. CHURCH:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("DATE OF BIRTH:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PLACE OF BIRTH:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 50));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ADDRESS 2:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("CITY:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 30));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("ZIP CODE:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 80, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("FATHER:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 110, 30));

        tf_lname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tf_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 370, 30));

        tf_fname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fnameActionPerformed(evt);
            }
        });
        jPanel4.add(tf_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 370, 30));

        tf_mi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_mi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_miActionPerformed(evt);
            }
        });
        jPanel4.add(tf_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 370, 30));
        jPanel4.add(dp_bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 230, 30));
        jPanel4.add(dp_baptism, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 230, 30));

        tf_address2.setColumns(20);
        tf_address2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_address2.setLineWrap(true);
        tf_address2.setRows(5);
        jScrollPane1.setViewportView(tf_address2);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 380, 50));

        tf_place.setColumns(20);
        tf_place.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_place.setLineWrap(true);
        tf_place.setRows(5);
        tf_place.setWrapStyleWord(true);
        jScrollPane2.setViewportView(tf_place);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 380, 50));

        tf_address1.setColumns(20);
        tf_address1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_address1.setLineWrap(true);
        tf_address1.setRows(5);
        jScrollPane3.setViewportView(tf_address1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 380, 50));

        tf_mother.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_mother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tf_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 370, 30));

        tf_zipcode.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_zipcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_zipcode.setText("6200");
        tf_zipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_zipcodeActionPerformed(evt);
            }
        });
        jPanel4.add(tf_zipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 110, 30));

        tf_city.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_city.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_city.setText("Dumaguete");
        jPanel4.add(tf_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 370, 30));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("STATE:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 110, 30));

        tf_state.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_state.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_state.setText("Negros Oriental");
        tf_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_stateActionPerformed(evt);
            }
        });
        jPanel4.add(tf_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 210, 30));

        tf_father.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_father.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tf_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 370, 30));

        jButton7.setText("+");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 50, 30));

        jButton16.setText("+");
        jButton16.setFocusable(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 50, 30));

        buttonGroup1.add(cb_female);
        cb_female.setText("FEMALE");
        cb_female.setFocusable(false);
        cb_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_femaleActionPerformed(evt);
            }
        });
        jPanel4.add(cb_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 90, -1));

        buttonGroup1.add(cb_male);
        cb_male.setSelected(true);
        cb_male.setText("MALE");
        cb_male.setFocusable(false);
        jPanel4.add(cb_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 70, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("ADDRESS 1:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 50));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("FIRST NAME:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 120, 30));

        tf_bapt_place.setColumns(20);
        tf_bapt_place.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_bapt_place.setLineWrap(true);
        tf_bapt_place.setRows(5);
        tf_bapt_place.setText("St. Catherine of Alexandria");
        tf_bapt_place.setWrapStyleWord(true);
        jScrollPane5.setViewportView(tf_bapt_place);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 380, 50));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("DATE OF BAPTISM:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 20, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(java.awt.Color.red);
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("*");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 20, 30));

        btn_delete.setText("DELETE");
        btn_delete.setFocusable(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 76, 40));

        btn_edit.setText("EDIT");
        btn_edit.setFocusable(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel4.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 76, 40));

        btn_add.setText("ADD");
        btn_add.setFocusable(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel4.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 76, 40));

        btn_new.setText("NEW");
        btn_new.setFocusable(false);
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });
        jPanel4.add(btn_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 76, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SACRAMENTS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENTER DATA FOR RECEPIENT (FIRST)");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("CLOSE");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("REF. #:");

        lbl_ref.setBackground(new java.awt.Color(24, 14, 14));
        lbl_ref.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_ref.setForeground(java.awt.Color.green);
        lbl_ref.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ref.setText("0");
        lbl_ref.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbl_ref, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        do_confirmation();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tf_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_miActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_miActionPerformed

    private void tf_zipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_zipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_zipcodeActionPerformed

    private void tf_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_stateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void cb_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_femaleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        do_baptism();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        do_communion();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        do_marriage();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void lbl_baptismActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_baptismActionPerformed
        // TODO add your handling code here:
        check(lbl_baptism);
    }//GEN-LAST:event_lbl_baptismActionPerformed

    private void lbl_communionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_communionActionPerformed
        // TODO add your handling code here:
        check(lbl_communion);
    }//GEN-LAST:event_lbl_communionActionPerformed

    private void lbl_confirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_confirmationActionPerformed
        // TODO add your handling code here:
        check(lbl_confirmation);
    }//GEN-LAST:event_lbl_confirmationActionPerformed

    private void lbl_marriageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_marriageActionPerformed
        // TODO add your handling code here:
        check(lbl_marriage);
    }//GEN-LAST:event_lbl_marriageActionPerformed

    private void lbl_2nd_marriageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_2nd_marriageActionPerformed
        // TODO add your handling code here:
        check(lbl_2nd_marriage);
    }//GEN-LAST:event_lbl_2nd_marriageActionPerformed

    private void lbl_prof_of_faithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_prof_of_faithActionPerformed
        // TODO add your handling code here:
        check(lbl_prof_of_faith);
    }//GEN-LAST:event_lbl_prof_of_faithActionPerformed

    private void lbl_acceptanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_acceptanceActionPerformed
        // TODO add your handling code here:
        check(lbl_acceptance);
    }//GEN-LAST:event_lbl_acceptanceActionPerformed

    private void lbl_deathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_deathActionPerformed
        // TODO add your handling code here:
        check(lbl_death);
    }//GEN-LAST:event_lbl_deathActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        do_prof_of_faith();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here
        do_acceptance();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        do_death();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void tf_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fnameActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        add_parishioner();
        JOptionPane.showMessageDialog(null, "Successfully Added");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        clear_data();
        set_no_record();
        disabled();
        btn_add.setEnabled(true);

        t.start();
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        prompt_edit();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        prompt_delete();

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_p_bapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_bapActionPerformed
        // TODO add your handling code here:
        print_name = 1;
        print();
    }//GEN-LAST:event_btn_p_bapActionPerformed

    private void btn_p_commActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_commActionPerformed
        // TODO add your handling code here:
        print_name = 2;
         print();
    }//GEN-LAST:event_btn_p_commActionPerformed

    private void btn_p_confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_confActionPerformed
        // TODO add your handling code here:
        print_name = 3;
         print();
    }//GEN-LAST:event_btn_p_confActionPerformed

    private void btn_p_marrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_marrActionPerformed
        // TODO add your handling code here:
        print_name = 4;
         print();
    }//GEN-LAST:event_btn_p_marrActionPerformed

    private void btn_p_2ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_2ndActionPerformed
        // TODO add your handling code here:
        print_name = 5;
         print();
    }//GEN-LAST:event_btn_p_2ndActionPerformed

    private void btn_p_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_profActionPerformed
        // TODO add your handling code here:
        print_name = 6;
         print();
    }//GEN-LAST:event_btn_p_profActionPerformed

    private void btn_p_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_accActionPerformed
        // TODO add your handling code here:
        print_name = 7;
         print();
    }//GEN-LAST:event_btn_p_accActionPerformed

    private void btn_p_funActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_funActionPerformed
        // TODO add your handling code here:
        print_name = 8;
         print();
    }//GEN-LAST:event_btn_p_funActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_p_2nd;
    private javax.swing.JButton btn_p_acc;
    private javax.swing.JButton btn_p_bap;
    private javax.swing.JButton btn_p_comm;
    private javax.swing.JButton btn_p_conf;
    private javax.swing.JButton btn_p_fun;
    private javax.swing.JButton btn_p_marr;
    private javax.swing.JButton btn_p_prof;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_female;
    private javax.swing.JCheckBox cb_male;
    private com.toedter.calendar.JDateChooser dp_baptism;
    private com.toedter.calendar.JDateChooser dp_bday;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JCheckBox lbl_2nd_marriage;
    private javax.swing.JCheckBox lbl_acceptance;
    private javax.swing.JCheckBox lbl_baptism;
    private javax.swing.JCheckBox lbl_communion;
    private javax.swing.JCheckBox lbl_confirmation;
    private javax.swing.JCheckBox lbl_death;
    private javax.swing.JCheckBox lbl_marriage;
    private javax.swing.JCheckBox lbl_prof_of_faith;
    private javax.swing.JLabel lbl_ref;
    private javax.swing.JTextArea tf_address1;
    private javax.swing.JTextArea tf_address2;
    private javax.swing.JTextArea tf_bapt_place;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_father;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_mi;
    private javax.swing.JTextField tf_mother;
    private javax.swing.JTextArea tf_place;
    private javax.swing.JTextField tf_state;
    private javax.swing.JTextField tf_zipcode;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        set_date();
        init_ref_id();

        disabled();
//        set_enable();
        t.start();
        tf_fname.grabFocus();
    }
    Timer t = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {

            init_ref_id();
        }
    });
    int paroshioner_exists = 0;

    private void disabled() {
        btn_add.setEnabled(true);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
    }

    private void enabled() {
        btn_add.setEnabled(false);
        btn_edit.setEnabled(true);
        btn_delete.setEnabled(true);
    }

    private void init_ref_id() {
        lbl_ref.setText("" + S6_parishioners.get_ref_id());
    }

    private void set_date() {
        dp_baptism.setDate(new Date());
        dp_bday.setDate(new Date());
    }

    private void set_enable() {
        lbl_2nd_marriage.enable(false);
        lbl_acceptance.enable(false);
        lbl_baptism.enable(false);
        lbl_communion.enable(false);
        lbl_confirmation.enable(false);
        lbl_death.enable(false);
        lbl_marriage.enable(false);
        lbl_prof_of_faith.enable(false);
    }

    private void check(JCheckBox cb) {
        if (cb.isSelected()) {
            cb.setSelected(false);
        } else {
            cb.setSelected(true);
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

    private void do_baptism() {

        String f_name = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String bapt_date = DateType.sf.format(dp_baptism.getDate());
        String bapt_church = tf_bapt_place.getText();

        Window p = (Window) this;
        Dlg_new_baptism nd = Dlg_new_baptism.create(p, true);
        nd.setTitle("");

        final String ref_no = lbl_ref.getText();

        if (btn_edit.isEnabled() && !lbl_baptism.getText().
                equalsIgnoreCase("No Record")) {
            nd.do_pass1(ref_no);
        } else {
            nd.do_pass(f_name, mi, lname, bday, place_of_birth, father, mother, lbl_ref.
                    getText(), bapt_date, bapt_church);
        }


        nd.setCallback(new Dlg_new_baptism.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_baptism.OutputData data) {
                closeDialog.ok();
                add_baptism(data.to_2nd_info, data.to_basic, data.to_marriage_trib, data.to_spon, ref_no);
            }

            @Override
            public void delete(CloseDialog closeDialog, Dlg_new_baptism.OutputData data) {
                closeDialog.ok();
                delete_baptism(ref_no);
            }

            @Override
            public void edit(CloseDialog closeDialog, Dlg_new_baptism.OutputData data) {
                edit_baptism(data.to_2nd_info, data.to_basic, data.to_marriage_trib, data.to_spon, ref_no);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);


    }

    private void do_communion() {

        final String ref_no = lbl_ref.getText();
        String f_name = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String bapt_date = DateType.sf.format(dp_baptism.getDate());
        String bapt_church = tf_bapt_place.getText();

        Window p = (Window) this;
        Dlg_new_communion nd = Dlg_new_communion.create(p, true);
        nd.setTitle("");
        if (btn_edit.isEnabled() && !lbl_communion.getText().
                equalsIgnoreCase("No Record")) {
            nd.do_pass1(ref_no);
        } else {
            nd.do_pass(f_name, mi, lname, bday, place_of_birth, father, mother, lbl_ref.
                    getText(), bapt_date, bapt_church);
        }

        nd.setCallback(new Dlg_new_communion.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_communion.OutputData data) {
                closeDialog.ok();
                add_communion(data.to_comm, ref_no);
            }

            @Override
            public void delete(CloseDialog closeDialog, Dlg_new_communion.OutputData data) {
                closeDialog.ok();
                delete_comm(ref_no);
            }

            @Override
            public void edit(CloseDialog closeDialog, Dlg_new_communion.OutputData data) {
                edit_communion(data.to_comm, ref_no);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void add_communion(to_communion to_comm, String ref_no) {


        if (paroshioner_exists == 0) {
            try {
                dp_baptism.setDate(DateType.sf.parse(to_comm.bapt_date));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_main.class.getName()).
                        log(Level.SEVERE, null, ex);
            }

            tf_bapt_place.setText(to_comm.bapt_place);
            add_parishioner();
        }

        S2_new_communion.add(to_comm, ref_no);
        clear_data();
    }

    private void edit_communion(to_communion to_comm, String ref_no) {
        S2_new_communion.edit(to_comm, ref_no);

        clear_data();
    }

    private void delete_comm(String ref_no) {
        S2_new_communion.delete(ref_no);
        paroshioner_exists = 0;
        clear_data();
    }

    private void do_confirmation() {
        final String ref_no = lbl_ref.getText();
        String f_name = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String bapt_date = DateType.sf.format(dp_baptism.getDate());
        String bapt_church = tf_bapt_place.getText();

        Window p = (Window) this;
        Dlg_new_confirmation nd = Dlg_new_confirmation.create(p, true);
        nd.setTitle("");
        if (btn_edit.isEnabled() && !lbl_confirmation.getText().
                equalsIgnoreCase("No Record")) {
            nd.do_pass1(ref_no);
        } else {
            nd.do_pass(f_name, mi, lname, bday, place_of_birth, father, mother, lbl_ref.
                    getText(), bapt_date, bapt_church);
        }

        nd.setCallback(new Dlg_new_confirmation.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_confirmation.OutputData data) {
                closeDialog.ok();
                add_confirmation(data.to_conf, ref_no, data.sponsor);
            }

            @Override
            public void edit(CloseDialog closeDialog, Dlg_new_confirmation.OutputData data) {
                edit_confirmation(data.to_conf, ref_no, data.sponsor);
            }

            @Override
            public void delete(CloseDialog closeDialog, Dlg_new_confirmation.OutputData data) {
                delete_confirmation(ref_no);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void add_confirmation(to_confirmation to_conf, String ref_no, List<to_conf_sponsors> sponsor) {

        if (paroshioner_exists == 0) {
            try {
                dp_baptism.setDate(DateType.sf.parse(to_conf.bapt_date));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_main.class.getName()).
                        log(Level.SEVERE, null, ex);
            }

            tf_bapt_place.setText(to_conf.bapt_place);
            add_parishioner();
        }

        S3_new_confirmation.add(to_conf, ref_no, sponsor);
        clear_data();
    }

    private void edit_confirmation(to_confirmation to_conf, String ref_no, List<to_conf_sponsors> sponsor) {
        S3_new_confirmation.edit(to_conf, ref_no, sponsor);

        clear_data();
    }

    private void delete_confirmation(String ref_no) {
        S3_new_confirmation.delete(ref_no);
        paroshioner_exists = 0;
        clear_data();
    }

    private void do_marriage() {
        final String ref_no = lbl_ref.getText();
        String f_name = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String bapt_date = DateType.sf.format(dp_baptism.getDate());
        String bapt_church = tf_bapt_place.getText();

        String gender = "0";

        if (cb_male.isSelected()) {
            gender = "1";
        } else {
            gender = "0";
        }

        Window p = (Window) this;
        Dlg_new_marriages nd = Dlg_new_marriages.create(p, true);
        nd.setTitle("");
        if (btn_edit.isEnabled() && !lbl_marriage.getText().
                equalsIgnoreCase("No Record")) {
            nd.do_pass1(ref_no, gender);
        } else {
            nd.do_pass(f_name, mi, lname, bday, place_of_birth, father, mother, lbl_ref.
                    getText(), bapt_date, bapt_church, gender);
        }


        nd.setCallback(new Dlg_new_marriages.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_marriages.OutputData data) {
                closeDialog.ok();
                add_marriage(data.to_marr, ref_no, data.to_marr_sp);
            }

            @Override
            public void edit(CloseDialog closeDialog, Dlg_new_marriages.OutputData data) {
                edit_marriage(data.to_marr, data.to_marr_sp);
            }

            @Override
            public void delete(CloseDialog closeDialog, Dlg_new_marriages.OutputData data) {
                closeDialog.ok();
                delete_marriage(data.to_marr);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void add_marriage(to_marriage to_marr, String ref_no, List<to_marriage_sponsors> to_marr_sp) {


        if (paroshioner_exists == 0) {

            add_parishioner();
        }

        S4_new_marriage.add_marriage(to_marr, to_marr_sp);
        clear_data();
    }

    private void edit_marriage(to_marriage to_marr, List<to_marriage_sponsors> to_marr_sp) {

        S4_new_marriage.edit_marriage(to_marr, to_marr_sp);
        clear_data();
    }

    private void delete_marriage(to_marriage to_marr) {
        S4_new_marriage.delete(to_marr.g_ref_no, to_marr.b_ref_no);
        paroshioner_exists = 0;
        clear_data();
    }

    private void do_prof_of_faith() {

        Window p = (Window) this;
        Dlg_new_Prof_of_faith nd = Dlg_new_Prof_of_faith.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_new_Prof_of_faith.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_Prof_of_faith.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_acceptance() {

        final String ref_no = lbl_ref.getText();
        String f_name = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String bapt_date = DateType.sf.format(dp_baptism.getDate());
        String bapt_church = tf_bapt_place.getText();

        String gender = "0";

        if (cb_male.isSelected()) {
            gender = "1";
        } else {
            gender = "0";
        }

        Window p = (Window) this;
        Dlg_new_acceptance nd = Dlg_new_acceptance.create(p, true);
        nd.setTitle("");
        if (btn_edit.isEnabled() && !lbl_acceptance.getText().
                equalsIgnoreCase("No Record")) {
            nd.do_pass1(ref_no, gender);
        } else {
            nd.do_pass(f_name, mi, lname, bday, place_of_birth, father, mother, lbl_ref.
                    getText(), bapt_date, bapt_church, gender);
        }

        nd.setCallback(new Dlg_new_acceptance.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_acceptance.OutputData data) {
                closeDialog.ok();
                add_acceptance(data.to, ref_no, data.to_sponsors);
            }

            @Override
            public void edit(CloseDialog closeDialog, Dlg_new_acceptance.OutputData data) {
                edit_acceptance(data.to, ref_no, data.to_sponsors);
            }

            @Override
            public void delete(CloseDialog closeDialog, Dlg_new_acceptance.OutputData data) {
                closeDialog.ok();
                delete_acceptance(ref_no);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void add_acceptance(to_acceptance to, String ref_no, List<S8_baptism.to_sponsors> sponsors) {

        if (paroshioner_exists == 0) {

            add_parishioner();
        }

        S6_new_acceptance.add(to, ref_no, sponsors);
        clear_data();
    }

    private void edit_acceptance(to_acceptance to, String ref_no, List<S8_baptism.to_sponsors> sponsors) {

        S6_new_acceptance.edit(to, ref_no, sponsors);
        clear_data();
    }

    private void delete_acceptance(String ref_no) {
        S6_new_acceptance.delete(ref_no);
        paroshioner_exists = 0;
        clear_data();
    }

    private void do_death() {

        final String ref_no = lbl_ref.getText();
        String f_name = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String bapt_date = DateType.sf.format(dp_baptism.getDate());
        String bapt_church = tf_bapt_place.getText();

        String gender = "0";

        if (cb_male.isSelected()) {
            gender = "1";
        } else {
            gender = "0";
        }

        Window p = (Window) this;
        Dlg_new_death nd = Dlg_new_death.create(p, true);
        nd.setTitle("");
        if (btn_edit.isEnabled() && !lbl_death.getText().
                equalsIgnoreCase("No Record")) {
            nd.do_pass1(ref_no, gender);
        } else {
            nd.do_pass(f_name, mi, lname, bday, place_of_birth, father, mother, lbl_ref.
                    getText(), bapt_date, bapt_church, gender);
        }
        nd.setCallback(new Dlg_new_death.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_new_death.OutputData data) {
                closeDialog.ok();
                add_funeral(data.to, ref_no);
            }

            @Override
            public void edit(CloseDialog closeDialog, Dlg_new_death.OutputData data) {
                edit_funeral(data.to, ref_no);
            }

            @Override
            public void delete(CloseDialog closeDialog, Dlg_new_death.OutputData data) {
                closeDialog.ok();
                delete_funeral(ref_no);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void add_funeral(to_funeral to, String ref_no) {

        if (paroshioner_exists == 0) {

            add_parishioner();
        }

        S5_new_funeral.add(to, ref_no);
        clear_data();
    }

    private void edit_funeral(to_funeral to, String ref_no) {

        S5_new_funeral.edit(to, ref_no);
        clear_data();
    }

    private void delete_funeral(String ref_no) {
        S5_new_funeral.delete(ref_no);
        paroshioner_exists = 0;
        clear_data();
    }

    private void add_parishioner() {


        String ref_id = lbl_ref.getText();
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String date_of_baptism = DateType.sf.format(dp_baptism.getDate());
        String date_of_birth = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String address1 = tf_address1.getText();
        String address2 = tf_address2.getText();
        String city = tf_city.getText();
        String states = tf_state.getText();
        String zip_code = tf_zipcode.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String is_baptized = "0";
        String is_comm = "0";
        String is_confirm = "0";
        String is_married = "0";
        String is_2nd_married = "0";
        String is_prof_faith = "0";
        String is_acceptance = "0";
        String is_death = "0";
        String date_added = DateType.datetime.format(new Date());
        String gender = "0";

        if (cb_male.isSelected()) {
            gender = "1";
        } else {
            gender = "0";
        }

        if (fname.isEmpty() || lname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete Required Details");
            return;
        }
        String bapt_church = tf_bapt_place.getText();

        S6_parishioners.to_parishioners to = new S6_parishioners.to_parishioners(ref_id, fname, mi, lname, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_church, "", "", "", "", "", "", "", "", "");
        S6_parishioners.add_parishioner(to);
        Lg.s(Dlg_main.class, "Successfully Added");
//       

        clear_data();
    }

    private void prompt_edit() {
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                edit_parishioner();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void prompt_delete() {
        final String ref_id = lbl_ref.getText();
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                delete_parishioner(ref_id);
                set_no_record();
                disabled();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void delete_parishioner(String ref_id) {
        S6_parishioners.delete_parishioner(ref_id);
        clear_data();
        t.stop();
    }

    private void edit_parishioner() {

        String ref_id = lbl_ref.getText();
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String date_of_baptism = DateType.sf.format(dp_baptism.getDate());
        String date_of_birth = DateType.sf.format(dp_bday.getDate());
        String place_of_birth = tf_place.getText();
        String address1 = tf_address1.getText();
        String address2 = tf_address2.getText();
        String city = tf_city.getText();
        String states = tf_state.getText();
        String zip_code = tf_zipcode.getText();
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String is_baptized = "0";
        String is_comm = "0";
        String is_confirm = "0";
        String is_married = "0";
        String is_2nd_married = "0";
        String is_prof_faith = "0";
        String is_acceptance = "0";
        String is_death = "0";
        String date_added = DateType.datetime.format(new Date());
        String gender = "0";
        if (cb_male.isSelected()) {
            gender = "1";
        } else {
            gender = "0";
        }
        String bapt_church = tf_bapt_place.getText();
        S6_parishioners.to_parishioners to = new S6_parishioners.to_parishioners(ref_id, fname, mi, lname, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_church, "", "", "", "", "", "", "", "", "");
        S6_parishioners.edit_parishioner(to, ref_id);
        t.stop();
//        clear_data();
    }

    private void clear_data() {
        tf_fname.setText("");
        tf_mi.setText("");
        tf_lname.setText("");

        dp_baptism.setDate(new Date());
        dp_bday.setDate(new Date());

        tf_place.setText("");
        tf_address1.setText("");
        tf_address2.setText("");


        tf_state.setText("");
        tf_zipcode.setText("");
        tf_mother.setText("");
        tf_father.setText("");

        init_ref_id();

        paroshioner_exists = 0;
        tf_bapt_place.setText("");
        t.start();

    }

    private void set_no_record() {
        lbl_2nd_marriage.setText("No Record");
        lbl_acceptance.setText("No Record");
        lbl_baptism.setText("No Record");
        lbl_communion.setText("No Record");
        lbl_confirmation.setText("No Record");
        lbl_death.setText("No Record");
        lbl_marriage.setText("No Record");
        lbl_prof_of_faith.setText("No Record");
    }

    private void search() {
        Window p = (Window) this;
        Dlg_search_recepient2 nd = Dlg_search_recepient2.create(p, true);
        nd.setTitle("");
        nd.do_pass("","");
        nd.setCallback(new Dlg_search_recepient2.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_search_recepient2.OutputData data) {
                closeDialog.ok();
                paroshioner_exists = 1;
                set_data(data.to);
                enabled();
                t.stop();

            }
        });
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());

//        Center.setCenter(nd);
        nd.setVisible(true);
        nd.setSize(xSize, ySize);
    }

    private void set_data(to_parishioners to) {
        lbl_ref.setText(to.ref_id);

        tf_address1.setText(to.address1);
        tf_address2.setText(to.address2);
        tf_city.setText(to.city);
        tf_father.setText(to.father);
        tf_fname.setText(to.fname);
        tf_lname.setText(to.lname);
        tf_mi.setText(to.mi);
        tf_mother.setText(to.mother);
        tf_place.setText(to.place_of_birth);
        tf_state.setText(to.states);
        tf_zipcode.setText(to.zip_code);
        tf_bapt_place.setText(to.bapt_place);
        try {
            dp_baptism.setDate(DateType.sf.parse(to.date_of_baptism));
            dp_bday.setDate(DateType.sf.parse(to.date_of_birth));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_main.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        if (to.gender.equals("Male")) {
            cb_male.setSelected(true);
        } else {
            cb_female.setSelected(true);
        }

        btn_add.setEnabled(false);

        lbl_baptism.setText(to.is_baptized);
        lbl_2nd_marriage.setText(to.is_2nd_married);
        lbl_acceptance.setText(to.is_acceptance);
        lbl_communion.setText(to.is_comm);
        lbl_confirmation.setText(to.is_confirm);
        lbl_death.setText(to.is_death);
        lbl_marriage.setText(to.is_married);
        lbl_prof_of_faith.setText(to.is_prof_faith);

        if (lbl_baptism.getText().
                equalsIgnoreCase("OK")) {
            btn_p_bap.setEnabled(true);
        } else {
            btn_p_bap.setEnabled(false);
        }

        if (lbl_2nd_marriage.getText().
                equalsIgnoreCase("OK")) {
            btn_p_2nd.setEnabled(true);
        } else {
            btn_p_2nd.setEnabled(false);
        }
        if (lbl_acceptance.getText().
                equalsIgnoreCase("OK")) {
            btn_p_acc.setEnabled(true);
        } else {
            btn_p_acc.setEnabled(false);
        }

        if (lbl_communion.getText().
                equalsIgnoreCase("OK")) {
            btn_p_comm.setEnabled(true);
        } else {
            btn_p_comm.setEnabled(false);
        }
        if (lbl_confirmation.getText().
                equalsIgnoreCase("OK")) {
            btn_p_conf.setEnabled(true);
        } else {
            btn_p_conf.setEnabled(false);
        }
        if (lbl_death.getText().
                equalsIgnoreCase("OK")) {
            btn_p_fun.setEnabled(true);
        } else {
            btn_p_fun.setEnabled(false);
        }

        if (lbl_marriage.getText().
                equalsIgnoreCase("OK")) {
            btn_p_marr.setEnabled(true);
        } else {
            btn_p_marr.setEnabled(false);
        }
        if (lbl_prof_of_faith.getText().
                equalsIgnoreCase("OK")) {
            btn_p_prof.setEnabled(true);
        } else {
            btn_p_prof.setEnabled(false);
        }

    }

    private void add_baptism(to_2nd_details to_2nd_info, to_basic_info to_basic, List<to_marriage_tribunal> to_marriage_trib, List<to_sponsors> to_spon, String ref_no) {

        S1_new_baptism.add(to_2nd_info, to_basic, to_marriage_trib, to_spon, ref_no);
        if (paroshioner_exists == 0) {
            try {
                dp_baptism.setDate(DateType.sf.parse(to_basic.date_of_baptism));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_main.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
            tf_bapt_place.setText(to_basic.bap_church);
            add_parishioner();
//            JOptionPane.showMessageDialog(null, "Successfully Added");
        }
        String get = System.getProperty("app_all", "false");
        if (get.equals("true")) {
            S1_new_baptism.update_parishioner_baptism(to_basic.date_of_baptism, ref_no, to_2nd_info.book_no, to_2nd_info.page_no, to_2nd_info.num);
        }

        clear_data();
    }

    private void edit_baptism(to_2nd_details to_2nd_info, to_basic_info to_basic, List<to_marriage_tribunal> to_marriage_trib, List<to_sponsors> to_spon, String ref_no) {

        S1_new_baptism.edit(to_2nd_info, to_basic, to_marriage_trib, to_spon, ref_no);
        clear_data();
    }

    private void delete_baptism(String ref_no) {
        S6_parishioners.delete_parishioner_bap(ref_no);
        paroshioner_exists = 0;
        set_no_record();
//        clear_data();
    }
    int print_name = 0;

    private void print() {

        final String ref_no = lbl_ref.getText();
        final String series_of = Series_of.series();
        final String template;

        final String day = NumberToPower.set(DateType.d.format(new Date()));
        final String month = DateType.m.format(new Date());
        final String year = DateType.y.format(new Date());

        String gen = "Male";
        if (cb_female.isSelected()) {
            gen = "Female";
        } else {
            gen = "Male";
        }

        final String name = tf_fname.getText() + " " + tf_mi.getText() + " " + tf_lname.
                getText();

        final String gender = gen;
        Window p = (Window) this;
        Dlg_priest nd = Dlg_priest.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_priest.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_priest.OutputData data) {
                closeDialog.ok();


                if (print_name == 4) {
                    do_exe_marriage(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_cert_matrimonys_2", gender);
                    add_reciept(name, "Cert_Matrimony", ref_no);
                }

                if (print_name == 1) {
                    do_exe(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_baptisms_5_1");
                    add_reciept(name, "Cert_Baptism", ref_no);
                }
                if (print_name == 3) {
                    do_exe(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_confirmations_2");
                    add_reciept(name, "Cert_Confirmation", ref_no);
                }
                if (print_name == 8) {
                    do_exe(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_burials_2");
                    add_reciept(name, "Cert_Burial", ref_no);
                }


            }
        });
        Center.setCenter(nd);
        nd.setVisible(true);
    }

    private void add_reciept(String parishioner, String type, String ref_no) {
        String or_no = "" + S1_mass_schedules.get_f_receipt_no();
        double amount = 100;
        String terminal_id = System.getProperty("terminal_id", "1");
        String user_id = "1";
        String user_name = "Ronald Pascua";
        S1_mass_schedules.add_receipt_certificate(or_no, parishioner, amount, type, ref_no, terminal_id, user_id, user_name);

//        JOptionPane.showMessageDialog(null, "adadad");

    }

    private void do_exe(String ref_no, String day, String month, String year, String priest, String asst_priest,
            String series_of, final String template) {

//       
        java.io.File file = new java.io.File("");
        String path = System.getProperty("path", "C:\\Users\\Dummy\\images\\");
//        path="/home/dummy/images";
//        JOptionPane.showMessageDialog(null, path);
//        System.out.println(path + " /logo_cathedral.jpeg");
        final rpt_scheduler_others.to_cert to = new rpt_scheduler_others.to_cert(ref_no, day, month, year, priest, asst_priest, series_of, path);
        Executor.doExecute(this, new Executor.Task() {

            @Override
            public void work_on() {
                rpt_scheduler_others.pdf_viewer_cert(to, template);
//                    do_ok1();
//                    prcss_work_on();

            }
        });
    }

    private void do_exe_marriage(String ref_no, String day, String month, String year, String priest, String asst_priest, String series_of, final String template, String gender) {
        String g_ref_no = "";
        String b_ref_no = "";
        String g_address = "";
        String b_address = "";
        String path = System.getProperty("path", "C:\\Users\\Dummy\\images\\");
        if (gender.equals("Male")) {
            g_ref_no = ref_no;
            b_ref_no = rpt_scheduler_others.get_b_ref_no(g_ref_no);

            g_address = rpt_scheduler_others.get_p_address(g_ref_no);
            b_address = rpt_scheduler_others.get_p_address(b_ref_no);

        } else {
            b_ref_no = ref_no;
            g_ref_no = rpt_scheduler_others.get_g_ref_no(b_ref_no);

            g_address = rpt_scheduler_others.get_p_address(g_ref_no);
            b_address = rpt_scheduler_others.get_p_address(b_ref_no);
        }

//        JOptionPane.showMessageDialog(null, b_ref_no + " "+g_ref_no);

        final rpt_scheduler_others.to_cert_marriage to = new rpt_scheduler_others.to_cert_marriage(day, month, year, priest, asst_priest, series_of, g_ref_no, b_ref_no, g_address, b_address, path);

        Executor.doExecute(this, new Executor.Task() {

            @Override
            public void work_on() {
                rpt_scheduler_others.pdf_viewer_cert_marriage(to, template);


//                    do_ok1();
//                    prcss_work_on();

            }
        });
    }
}
