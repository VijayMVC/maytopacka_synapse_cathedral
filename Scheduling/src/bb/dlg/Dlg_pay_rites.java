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

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.*;

import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.svc.S1_mass_schedules;
import p.svc.S1_ret_rites_fees;
import p.to.to_rites_fees;

/**
 *
 * @author u2
 */
public class Dlg_pay_rites extends javax.swing.JDialog {

    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);

        void matrimony(CloseDialog closeDialog, OutputData2 data);
    }

    public static class OutputData {

        public final String or_no;
        public final double amount;
        public final String sac_name;

        public OutputData(String or_no, double amount,String sac_name) {
            this.or_no = or_no;
            this.amount = amount;
            this.sac_name=sac_name;
        }
    }

    public static class OutputData2 {

        public final String or_no;
        public final List<to_rites_fees> t;

        public OutputData2(String or_no, List<to_rites_fees> t) {
            this.or_no = or_no;
            this.t = t;
        }
    }

    public static class InputData {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_pay_rites(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_pay_rites(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_pay_rites() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_pay_rites myRef;

    private void setThisRef(Dlg_pay_rites myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_pay_rites> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_pay_rites create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_pay_rites create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_pay_rites dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_pay_rites((java.awt.Frame) parent, false);
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
            Dlg_pay_rites dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_pay_rites((java.awt.Dialog) parent, false);
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


        Dlg_pay_rites dialog = Dlg_pay_rites.create(new javax.swing.JFrame(), true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel2 = new javax.swing.JLabel();
        lb_ref_no = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rate = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cb_rites = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        rb_ord = new javax.swing.JRadioButton();
        rb_special = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_floor.setBackground(new java.awt.Color(159, 207, 243));
        pnl_floor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_floor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_numpad.setBackground(java.awt.Color.white);
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

        pnl_floor.add(pnl_numpad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 480, 450));

        pnl_payment.setBackground(java.awt.Color.white);
        pnl_payment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_payment.setForeground(new java.awt.Color(41, 9, 149));
        pnl_payment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ds_change.setBackground(java.awt.Color.darkGray);
        ds_change.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        ds_change.setForeground(java.awt.Color.green);
        ds_change.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ds_change.setText("0.00");
        ds_change.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
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
        pnl_payment.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 115, -1, -1));

        lbl_due.setBackground(java.awt.Color.darkGray);
        lbl_due.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lbl_due.setForeground(java.awt.Color.green);
        lbl_due.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_due.setText("400.00");
        lbl_due.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        lbl_due.setOpaque(true);
        pnl_payment.add(lbl_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 49, 362, -1));

        jLabel6.setBackground(new java.awt.Color(41, 9, 149));
        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 9, 149));
        jLabel6.setText("AMOUNT DUE:");
        pnl_payment.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, -1, -1));

        tf_amount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tf_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tf_amount.setText("0.00");
        tf_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_payment.add(tf_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 150, 362, 64));

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

        pnl_floor.add(pnl_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 390, 450));

        jPanel1.setBackground(java.awt.Color.white);

        ds_title1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        ds_title1.setForeground(new java.awt.Color(41, 9, 149));
        ds_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ds_title1.setText("TO PAY");
        ds_title1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel2.setText("RECEIPT #:");

        lb_ref_no.setBackground(new java.awt.Color(0, 0, 0));
        lb_ref_no.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        lb_ref_no.setForeground(new java.awt.Color(0, 255, 0));
        lb_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ref_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_ref_no.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(ds_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(lb_ref_no, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ds_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2))
                        .addComponent(lb_ref_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        pnl_floor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 70));

        tbl_rate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Rate"
            }
        ));
        tbl_rate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_rateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_rate);

        pnl_floor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 880, 230));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CHOOSE RITES:");
        pnl_floor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        cb_rites.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_rites.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Baptism", "Communion", "Confirmation", "Matrimony", "2nd Matrimony", "Prof of Faith", "Acceptance", "Funeral" }));
        cb_rites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ritesActionPerformed(evt);
            }
        });
        pnl_floor.add(cb_rites, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TYPE:");
        pnl_floor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 558, -1, 30));

        buttonGroup1.add(rb_ord);
        rb_ord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_ord.setSelected(true);
        rb_ord.setText("Ordinary");
        rb_ord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ordActionPerformed(evt);
            }
        });
        pnl_floor.add(rb_ord, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, -1, 30));

        buttonGroup1.add(rb_special);
        rb_special.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_special.setText("Special");
        rb_special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_specialActionPerformed(evt);
            }
        });
        pnl_floor.add(rb_special, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_floor, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_floor, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tbl_rateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_rateMouseClicked
        // TODO add your handling code here:
        enable_check();
    }//GEN-LAST:event_tbl_rateMouseClicked

    private void cb_ritesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ritesActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_cb_ritesActionPerformed

    private void rb_ordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ordActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_rb_ordActionPerformed

    private void rb_specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_specialActionPerformed
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_rb_specialActionPerformed
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_rites;
    private javax.swing.JLabel ds_change;
    private javax.swing.JLabel ds_title1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_ref_no;
    private javax.swing.JLabel lbl_due;
    private javax.swing.JPanel pnl_floor;
    private javax.swing.JPanel pnl_numpad;
    private javax.swing.JPanel pnl_payment;
    private javax.swing.JRadioButton rb_ord;
    private javax.swing.JRadioButton rb_special;
    private javax.swing.JTable tbl_rate;
    private javax.swing.JLabel tf_amount;
    // End of variables declaration//GEN-END:variables
    //<editor-fold defaultstate="collapsed" desc=" myInit ">

    private void myInit() {
        initActionKey();
        init_num();
        set_ref_no();
        init_tbl();
        data_employee();
        do_compute();
    }
    double am = 0;

    public void do_pass(double amount) {

        am = amount;
        lbl_due.setText(FitIn.fmt_wc_0(amount));
        do_compute();

    }

    public void do_pass(String type) {
        if (type.equals("Matrimony")) {
            rb_special.setEnabled(true);
        } else {
            rb_ord.setSelected(true);
            rb_special.setEnabled(false);
        }
        cb_rites.setSelectedItem(type);
        cb_rites.enable(false);

    }

    public void do_pass2(String types) {

//        JOptionPane.showMessageDialog(null, types);
        if (types.equalsIgnoreCase("ORDINARY")) {
            rb_ord.setEnabled(true);
            rb_ord.setSelected(true);
            rb_special.setEnabled(false);
        } else {
            rb_special.setEnabled(true);
            rb_special.setSelected(true);
            rb_ord.setEnabled(false);
        }
        data_employee();
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
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_rate.setModel(tbl_employee_payroll_M);
        tbl_rate.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_rate.setRowHeight(25);

//        tbl_rate.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {200, 100, 0, 0, 100};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_rate, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

    }

    private void loadData(List<to_rites_fees> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    private void loadData1(List<to_rites_fees> acc) {
//        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Particulars", "Rate", "State", "id", "CHECK"
        };

        public TblInvoicesModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
//           
            if (column == 4) {
                return true;
            }

            return false;
        }

        @Override
        public Class getColumnClass(int col) {


            if (col == 4) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_rites_fees tt = (to_rites_fees) getRow(row);

            switch (col) {
                case 0:
                    return tt.name;
                case 1:
                    return tt.rate;
                case 2:
                    return tt.type;
                case 3:
                    return tt.id;

                default:
                    return tt.check;
            }
        }
    }

    private void enable_check() {
        int row = tbl_rate.getSelectedRow();
        if (row < 0) {
            return;
        }
        int idx = tbl_rate.getSelectedRow();
        if (idx < 0) {
            return;
        }
        boolean check = Boolean.parseBoolean(tbl_rate.getModel().getValueAt(row, 4).toString());

        if (check == true) {
            check = false;
        } else {
            check = true;
        }
        to_rites_fees order = (to_rites_fees) tbl_employee_payroll_ALM.get(tbl_rate.convertRowIndexToModel(idx));
        order.setCheck(check);

        tbl_employee_payroll_M.fireTableDataChanged();

        tbl_rate.getSelectionModel().setSelectionInterval(idx, idx);
        HelpScrollToView.view(idx, tbl_rate);
        do_compute();

    }

    private void do_compute() {
        List<to_rites_fees> datas = tbl_employee_payroll_ALM;
        double amount = 0;
        for (to_rites_fees to : datas) {

            boolean check = to.check;
            if (check == true) {
                amount += to.rate;
            }

        }
        lbl_due.setText(FitIn.fmt_wc_0(amount));
    }

    private void data_employee() {

        String rites = cb_rites.getSelectedItem().toString();
        if (rites.equals("Matrimony")) {
            rb_ord.setVisible(true);
            rb_special.setVisible(true);
            jLabel1.setVisible(true);
        } else {
            rb_ord.setVisible(false);
            rb_special.setVisible(false);
            jLabel1.setVisible(false);
        }
        String type = "";
        if (rites.equals("Funeral")) {
            rites = "Funeral";
        }

        String stat = "";

        if (rites.equals("Matrimony")) {
            if (rb_ord.isSelected()) {
                stat = "Ordinary";
            }
            if (rb_special.isSelected()) {
                stat = "Special";
            }
        } else {
            stat = "Ordinary";
        }



        loadData(S1_ret_rites_fees.ret_rate(rites, stat));
        do_compute();

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
//        prcss_work_on();
//            }
//        });
    }
//    private void prcss_work_on() {
//
//        callback.ok(new CloseDialog(this), new Dlg_pay_rites.OutputData(lb_ref_no.getText()));
//        this.dispose();
//    }
    JTextField tf_dummy;

    private void put_text(String str) {

        CurrencyDocument.decimalInserter(tf_dummy, str);
        tf_amount.setText(tf_dummy.getText());
        screen_computation();

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

        if (tbl_employee_payroll_ALM.isEmpty()) {
            return;
        }
        double am = Double.parseDouble(FitIn.fmt_woc_0(lbl_due.getText()));
        if (am == 0) {
            return;
        }

        String sac_na=cb_rites.getSelectedItem().toString();
        if (cb_rites.getSelectedIndex() == 3) {

            if (callback != null) {
                List<to_rites_fees> datas = tbl_employee_payroll_ALM;
                List<to_rites_fees> r = new ArrayList();
                for (to_rites_fees t : datas) {
                    if (t.check == true) {
                        r.add(t);
                    }
                }

                callback.matrimony(new CloseDialog(this), new OutputData2(lb_ref_no.getText(), r));
            }
        } else {
            if (callback != null) {
                callback.ok(new CloseDialog(this), new OutputData(lb_ref_no.getText(), am,sac_na));
            }
        }


    }

    private void do_clear() {
        tf_dummy.setText("");
        tf_amount.setText(tf_dummy.getText());
        ds_change.setText("0.0");
//        screen_computation();
    }
}
