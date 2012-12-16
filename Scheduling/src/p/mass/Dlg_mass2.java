/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.mass;

import bb.dlg.Dlg_confirm;
import com.lowagie.text.Font;
import java.awt.Cursor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.rpt.Reference_number;
import p.svc.S1_mass_schedules;
import p.svc.S4_ret_number;
import p.svc.TableAdapter_mass;
import p.to.to_users;
import p.util.DateType;
import p.util.Maximize;
import p.util.TableUtility;
import rpt_main.Dlg_cash_report;

/**
 *
 * @author Dummy
 */
public class Dlg_mass2 extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_mass2
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
    private Dlg_mass2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_mass2(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_mass2() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_mass2 myRef;

    private void setThisRef(Dlg_mass2 myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_mass2> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_mass2 create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.MODELESS);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_mass2 create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_mass2 dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mass2((java.awt.Frame) parent, false);
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
            Dlg_mass2 dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mass2((java.awt.Dialog) parent, false);
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


        Dlg_mass2 dialog = Dlg_mass2.create(new javax.swing.JFrame(), true);
        Maximize.set(dialog);
//        dialog.setVisible(true);

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
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tf_type = new javax.swing.JTextField();
        bt_2 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_0 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_14 = new javax.swing.JButton();
        btn_15 = new javax.swing.JButton();
        btn_16 = new javax.swing.JButton();
        btn_17 = new javax.swing.JButton();
        btn_18 = new javax.swing.JButton();
        btn_19 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();
        btn_21 = new javax.swing.JButton();
        btn_22 = new javax.swing.JButton();
        btn_23 = new javax.swing.JButton();
        btn_24 = new javax.swing.JButton();
        btn_25 = new javax.swing.JButton();
        btn_26 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        btn_11 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_ref_no = new javax.swing.JLabel();
        lbl_sp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbl_amount = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbl_state = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        lbl_trans = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_prev = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_s = new javax.swing.JTable();
        lbl_t = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btn_tg = new javax.swing.JButton();
        btn_pm = new javax.swing.JButton();
        btn_comm = new javax.swing.JButton();
        btn_req = new javax.swing.JButton();
        btn_don = new javax.swing.JButton();
        btn_tra = new javax.swing.JButton();
        btn_tra1 = new javax.swing.JButton();
        btn_tra2 = new javax.swing.JButton();
        btn_tra3 = new javax.swing.JButton();
        btn_con = new javax.swing.JButton();
        btn_bap = new javax.swing.JButton();
        btn_fun = new javax.swing.JButton();
        btn_mar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton12.setText("jButton3");

        jButton13.setText("jButton3");

        jButton15.setText("jButton3");

        jButton14.setText("jButton3");

        jButton16.setText("jButton3");

        jButton11.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tf_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_type.setFocusable(false);
        tf_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_typeActionPerformed(evt);
            }
        });
        tf_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_typeKeyReleased(evt);
            }
        });

        bt_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_2.setText("2");
        bt_2.setFocusable(false);
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_1.setText("1");
        bt_1.setFocusable(false);
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_3.setText("3");
        bt_3.setFocusable(false);
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_4.setText("4");
        bt_4.setFocusable(false);
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_5.setText("5");
        bt_5.setFocusable(false);
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_6.setText("6");
        bt_6.setFocusable(false);
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_7.setText("7");
        bt_7.setFocusable(false);
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        bt_8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_8.setText("8");
        bt_8.setFocusable(false);
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_9.setText("9");
        bt_9.setFocusable(false);
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        bt_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_0.setText("0");
        bt_0.setFocusable(false);
        bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_0ActionPerformed(evt);
            }
        });

        jButton58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton58.setText("SPACE");
        jButton58.setFocusable(false);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton59.setText("CAPS");
        jButton59.setFocusable(false);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_2.setText("W");
        btn_2.setFocusable(false);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_3.setText("E");
        btn_3.setFocusable(false);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_4.setText("R");
        btn_4.setFocusable(false);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_5.setText("T");
        btn_5.setFocusable(false);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_6.setText("Y");
        btn_6.setFocusable(false);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_7.setText("U");
        btn_7.setFocusable(false);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_8.setText("I");
        btn_8.setFocusable(false);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_9.setText("O");
        btn_9.setFocusable(false);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_10.setText("P");
        btn_10.setFocusable(false);
        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });

        btn_12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_12.setText("S");
        btn_12.setFocusable(false);
        btn_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_12ActionPerformed(evt);
            }
        });

        btn_13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_13.setText("D");
        btn_13.setFocusable(false);
        btn_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_13ActionPerformed(evt);
            }
        });

        btn_14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_14.setText("F");
        btn_14.setFocusable(false);
        btn_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_14ActionPerformed(evt);
            }
        });

        btn_15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_15.setText("G");
        btn_15.setFocusable(false);
        btn_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_15ActionPerformed(evt);
            }
        });

        btn_16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_16.setText("H");
        btn_16.setFocusable(false);
        btn_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_16ActionPerformed(evt);
            }
        });

        btn_17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_17.setText("J");
        btn_17.setFocusable(false);
        btn_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_17ActionPerformed(evt);
            }
        });

        btn_18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_18.setText("K");
        btn_18.setFocusable(false);
        btn_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_18ActionPerformed(evt);
            }
        });

        btn_19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_19.setText("L");
        btn_19.setFocusable(false);
        btn_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_19ActionPerformed(evt);
            }
        });

        btn_20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_20.setText("Z");
        btn_20.setFocusable(false);
        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });

        btn_21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_21.setText("X");
        btn_21.setFocusable(false);
        btn_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_21ActionPerformed(evt);
            }
        });

        btn_22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_22.setText("C");
        btn_22.setFocusable(false);
        btn_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_22ActionPerformed(evt);
            }
        });

        btn_23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_23.setText("V");
        btn_23.setFocusable(false);
        btn_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_23ActionPerformed(evt);
            }
        });

        btn_24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_24.setText("B");
        btn_24.setFocusable(false);
        btn_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_24ActionPerformed(evt);
            }
        });

        btn_25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_25.setText("N");
        btn_25.setFocusable(false);
        btn_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_25ActionPerformed(evt);
            }
        });

        btn_26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_26.setText("M");
        btn_26.setFocusable(false);
        btn_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_26ActionPerformed(evt);
            }
        });

        jButton85.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton85.setText("123");
        jButton85.setFocusable(false);
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jButton86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton86.setText("C");
        jButton86.setFocusable(false);
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        jButton87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton87.setText("ENTER");
        jButton87.setFocusable(false);
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        btn_11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_11.setText("A");
        btn_11.setFocusable(false);
        btn_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_11ActionPerformed(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_1.setText("Q");
        btn_1.setFocusable(false);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_type, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tf_type, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ref_no.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_ref_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ref_no.setText("100");
        lbl_ref_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl_ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 27));

        lbl_sp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_sp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_sp.setText("MESSAGE:");
        jPanel3.add(lbl_sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 136, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CHOOSE TIME:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 136, 27));

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_name.setOpaque(true);
        lbl_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nameMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 500, 30));

        lbl_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_date.setText("OCTOBER 1,2012");
        lbl_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_date.setOpaque(true);
        lbl_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dateMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 500, 30));

        lbl_time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_time.setOpaque(true);
        lbl_time.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_timeMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 500, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CHOOSE DATE:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 27));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("REF #:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 27));

        btn_next.setText("NEXT");
        btn_next.setFocusable(false);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        jPanel3.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 90, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("AMOUNT:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 27));

        lbl_amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_amount.setText("0.00");
        lbl_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_amount.setOpaque(true);
        lbl_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_amountMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 277, 180, 40));

        lbl_state.setColumns(20);
        lbl_state.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_state.setLineWrap(true);
        lbl_state.setRows(5);
        lbl_state.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_stateMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lbl_state);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 500, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("OR #:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 90, 27));

        lbl_trans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_trans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_trans.setText("100");
        lbl_trans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 210, 27));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ENTER   NAME:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 136, 35));

        btn_prev.setText("PREV");
        btn_prev.setFocusable(false);
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });
        jPanel3.add(btn_prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, 70));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        tbl_s.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_s.setFocusable(false);
        tbl_s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_sMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_s);

        lbl_t.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_t.setForeground(new java.awt.Color(0, 102, 255));
        lbl_t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_t.setText("Thanks Giving");
        lbl_t.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_t, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_t, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("X");
        buttonGroup2.add(jButton3);
        jButton3.setFocusable(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 61, -1));

        btn_tg.setBackground(new java.awt.Color(102, 102, 255));
        btn_tg.setText("THANKS GIVING");
        buttonGroup3.add(btn_tg);
        btn_tg.setFocusable(false);
        btn_tg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tgMouseEntered(evt);
            }
        });
        btn_tg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tgActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 122, 30));

        btn_pm.setBackground(new java.awt.Color(102, 102, 255));
        btn_pm.setText("PETITON MASS");
        buttonGroup3.add(btn_pm);
        btn_pm.setFocusable(false);
        btn_pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pmMouseEntered(evt);
            }
        });
        btn_pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pmActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 122, 30));

        btn_comm.setBackground(new java.awt.Color(102, 102, 255));
        btn_comm.setText("COMMON");
        buttonGroup3.add(btn_comm);
        btn_comm.setFocusable(false);
        btn_comm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_commMouseEntered(evt);
            }
        });
        btn_comm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commActionPerformed(evt);
            }
        });
        jPanel2.add(btn_comm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 122, 30));

        btn_req.setBackground(new java.awt.Color(102, 102, 255));
        btn_req.setText("REQUIEM");
        buttonGroup3.add(btn_req);
        btn_req.setFocusable(false);
        btn_req.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reqMouseEntered(evt);
            }
        });
        btn_req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reqActionPerformed(evt);
            }
        });
        jPanel2.add(btn_req, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 30));

        btn_don.setBackground(new java.awt.Color(102, 102, 255));
        btn_don.setText("DONATION-PROJ");
        buttonGroup3.add(btn_don);
        btn_don.setFocusable(false);
        btn_don.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_donMouseEntered(evt);
            }
        });
        btn_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donActionPerformed(evt);
            }
        });
        jPanel2.add(btn_don, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 123, 30));

        btn_tra.setBackground(new java.awt.Color(102, 102, 255));
        btn_tra.setText("TRANSFER");
        buttonGroup3.add(btn_tra);
        btn_tra.setFocusable(false);
        btn_tra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_traMouseEntered(evt);
            }
        });
        btn_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_traActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 30));

        btn_tra1.setBackground(new java.awt.Color(102, 102, 255));
        btn_tra1.setText("TIME");
        buttonGroup2.add(btn_tra1);
        btn_tra1.setFocusable(false);
        btn_tra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tra1MouseEntered(evt);
            }
        });
        btn_tra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tra1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        btn_tra2.setBackground(new java.awt.Color(102, 102, 255));
        btn_tra2.setText("REP");
        buttonGroup2.add(btn_tra2);
        btn_tra2.setFocusable(false);
        btn_tra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tra2MouseEntered(evt);
            }
        });
        btn_tra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tra2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 62, -1));

        btn_tra3.setBackground(new java.awt.Color(102, 102, 255));
        btn_tra3.setText("TEMP");
        buttonGroup2.add(btn_tra3);
        btn_tra3.setFocusable(false);
        btn_tra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tra3MouseEntered(evt);
            }
        });
        btn_tra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tra3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        btn_con.setBackground(new java.awt.Color(255, 255, 255));
        btn_con.setText("CONFIRMATION");
        buttonGroup3.add(btn_con);
        btn_con.setFocusable(false);
        btn_con.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_conMouseEntered(evt);
            }
        });
        btn_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conActionPerformed(evt);
            }
        });
        jPanel2.add(btn_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 30));

        btn_bap.setBackground(new java.awt.Color(255, 255, 255));
        btn_bap.setText("BAPTISM");
        buttonGroup3.add(btn_bap);
        btn_bap.setFocusable(false);
        btn_bap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bapMouseEntered(evt);
            }
        });
        btn_bap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bapActionPerformed(evt);
            }
        });
        jPanel2.add(btn_bap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 30));

        btn_fun.setBackground(new java.awt.Color(255, 255, 255));
        btn_fun.setText("FUNERAL");
        buttonGroup3.add(btn_fun);
        btn_fun.setFocusable(false);
        btn_fun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_funMouseEntered(evt);
            }
        });
        btn_fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funActionPerformed(evt);
            }
        });
        jPanel2.add(btn_fun, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 123, 30));

        btn_mar.setBackground(new java.awt.Color(255, 255, 255));
        btn_mar.setText("MARRIAGE");
        buttonGroup3.add(btn_mar);
        btn_mar.setFocusable(false);
        btn_mar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_marMouseEntered(evt);
            }
        });
        btn_mar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 123, 30));

        jButton1.setText("BARRIO");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, 30));

        jButton2.setText("DONATION-SPEC");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, 30));

        jButton4.setText("CEMETERY");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, 30));

        jButton5.setText("MPC");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_20.getText());
    }//GEN-LAST:event_btn_20ActionPerformed

    private void lbl_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dateMouseClicked
        // TODO add your handling code here:
        if (p_btn == 5 || p_btn == 6) {

            lbl_date.setText(DateType.str.format(new Date()));

        } else {
            p_input = 1;
            clear_1();
            tf_type.setFocusable(false);
            set_table_tg();
            set_bg_lbl();
            set_n();
        }

//        tbl_s.setRowSelectionInterval(0, 0);
    }//GEN-LAST:event_lbl_dateMouseClicked

    private void lbl_timeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_timeMouseClicked
        // TODO add your handling code here:
        p_input = 2;
        clear_1();

        tf_type.setFocusable(false);
        set_table_tg();
        set_bg_lbl();
        set_n();
//        tbl_s.setRowSelectionInterval(0, 0);
    }//GEN-LAST:event_lbl_timeMouseClicked

    private void lbl_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nameMouseClicked
        // TODO add your handling code here:
        p_input = 3;
//        clear_1();
        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
        set_bg_lbl();
        set_n();
    }//GEN-LAST:event_lbl_nameMouseClicked

    private void btn_tgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tgActionPerformed
        // TODO add your handling code here:
        p_btn = 1;
        p_input = 1;
        lbl_t.setText("Thanks Giving");
        set_cost();
        clear();
        set_bg_btn();
        set_table_tg();
    }//GEN-LAST:event_btn_tgActionPerformed

    private void btn_pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pmActionPerformed
        // TODO add your handling code here:
        p_btn = 2;
        p_input = 1;
        lbl_t.setText("Petition Mass");
        set_cost();

        clear();
        set_bg_btn();
        set_table_tg();
    }//GEN-LAST:event_btn_pmActionPerformed

    private void btn_commActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commActionPerformed
        // TODO add your handling code here:
        p_btn = 3;
        p_input = 1;
        lbl_t.setText("Common");
        set_cost();

        clear();
        set_bg_btn();
        set_table_tg();
    }//GEN-LAST:event_btn_commActionPerformed

    private void btn_reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reqActionPerformed
        // TODO add your handling code here:
        p_btn = 4;
        p_input = 1;
        lbl_t.setText("Requiem Mass");
        set_cost();

        clear();
        set_bg_btn();
        set_table_tg();
        lbl_amount.setText("0.00");
    }//GEN-LAST:event_btn_reqActionPerformed

    private void btn_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donActionPerformed
        // TODO add your handling code here:
        p_btn = 5;
        p_input = 3;
        lbl_t.setText("Donation");
        set_cost();

        lbl_state.setText("");
        lbl_name.setText("");
        lbl_date.setText(DateType.str.format(new Date()));
        lbl_time.setText("now");

        sponsors.clear();
        set_bg_btn();
        set_bg_lbl();
        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
    }//GEN-LAST:event_btn_donActionPerformed

    private void btn_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_traActionPerformed
        // TODO add your handling code here:
        p_btn = 6;
        p_input = 3;
        lbl_t.setText("Transfer");
        set_cost();


        lbl_state.setText("");
        lbl_name.setText("");
        lbl_date.setText(DateType.str.format(new Date()));
        lbl_time.setText("now");

        sponsors.clear();
        set_bg_lbl();
        set_bg_btn();
        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
    }//GEN-LAST:event_btn_traActionPerformed

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_1.getText());
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_2.getText());
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_3.getText());
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_4.getText());
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_5.getText());
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_6.getText());
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_7.getText());
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_8.getText());
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_9.getText());
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_0ActionPerformed
        // TODO add your handling code here:
        set_lbl(bt_0.getText());
    }//GEN-LAST:event_bt_0ActionPerformed

    private void tbl_sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sMouseClicked
        // TODO add your handling code here:set_n()


        removes();
        set_n();


    }//GEN-LAST:event_tbl_sMouseClicked

    private void tf_typeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_typeKeyReleased
        // TODO add your handling code here:
        set_key();
    }//GEN-LAST:event_tf_typeKeyReleased

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
        sponsor();
    }//GEN-LAST:event_jButton87ActionPerformed

    private void tf_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_typeActionPerformed
        // TODO add your handling code here:
//        tf_type.selectAll();
//        sponsor();
//        set_key();
        btn_next.doClick();
    }//GEN-LAST:event_tf_typeActionPerformed

    private void tbl_sMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sMousePressed
        // TODO add your handling code here:
//       removes();
    }//GEN-LAST:event_tbl_sMousePressed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_1.getText());
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_2.getText());
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_3.getText());
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_4.getText());
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_6.getText());
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_6.getText());
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_8.getText());
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_9.getText());
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_9.getText());
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_10.getText());
    }//GEN-LAST:event_btn_10ActionPerformed

    private void btn_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_11ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_11.getText());
    }//GEN-LAST:event_btn_11ActionPerformed

    private void btn_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_12ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_12.getText());
    }//GEN-LAST:event_btn_12ActionPerformed

    private void btn_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_13ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_13.getText());
    }//GEN-LAST:event_btn_13ActionPerformed

    private void btn_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_15ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_15.getText());
    }//GEN-LAST:event_btn_15ActionPerformed

    private void btn_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_14ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_14.getText());
    }//GEN-LAST:event_btn_14ActionPerformed

    private void btn_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_16ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_16.getText());
    }//GEN-LAST:event_btn_16ActionPerformed

    private void btn_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_17ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_17.getText());
    }//GEN-LAST:event_btn_17ActionPerformed

    private void btn_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_18ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_18.getText());
    }//GEN-LAST:event_btn_18ActionPerformed

    private void btn_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_19ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_19.getText());
    }//GEN-LAST:event_btn_19ActionPerformed

    private void btn_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_21ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_21.getText());
    }//GEN-LAST:event_btn_21ActionPerformed

    private void btn_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_22ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_22.getText());
    }//GEN-LAST:event_btn_22ActionPerformed

    private void btn_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_23ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_23.getText());
    }//GEN-LAST:event_btn_23ActionPerformed

    private void btn_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_24ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_24.getText());
    }//GEN-LAST:event_btn_24ActionPerformed

    private void btn_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_25ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_25.getText());
    }//GEN-LAST:event_btn_25ActionPerformed

    private void btn_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_26ActionPerformed
        // TODO add your handling code here:
        set_lbl(btn_26.getText());
    }//GEN-LAST:event_btn_26ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        set_lbl(" ");
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        if (caps == 1) {
            caps = 0;
            jButton59.setText("caps");
        } else {
            caps = 1;
            jButton59.setText("CAPS");
        }
        set_size();
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        if (cars == 1) {
            cars = 0;
        } else {
            cars = 1;
        }
        set_size();
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        lbl_t.setText("Log-out");
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_tra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tra1ActionPerformed
        // TODO add your handling code here:
        lbl_t.setText("Time Settings");
        time_settings();
    }//GEN-LAST:event_btn_tra1ActionPerformed

    private void btn_tra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tra2ActionPerformed
        // TODO add your handling code here:
        lbl_t.setText("Reports");
        reports();
    }//GEN-LAST:event_btn_tra2ActionPerformed

    private void btn_tra1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tra1MouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Time Settings");
    }//GEN-LAST:event_btn_tra1MouseEntered

    private void btn_tra2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tra2MouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Reports");
    }//GEN-LAST:event_btn_tra2MouseEntered

    private void btn_traMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_traMouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Transfer");
    }//GEN-LAST:event_btn_traMouseEntered

    private void btn_donMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_donMouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Donations");
    }//GEN-LAST:event_btn_donMouseEntered

    private void btn_reqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reqMouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Requiem Mass");
    }//GEN-LAST:event_btn_reqMouseEntered

    private void btn_commMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_commMouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Common");
    }//GEN-LAST:event_btn_commMouseEntered

    private void btn_pmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pmMouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Petition Mass");
    }//GEN-LAST:event_btn_pmMouseEntered

    private void btn_tgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tgMouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Thanks Giving");
    }//GEN-LAST:event_btn_tgMouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Log-out");
    }//GEN-LAST:event_jButton3MouseEntered

    private void btn_tra3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tra3MouseEntered
        // TODO add your handling code here:
//        lbl_t.setText("Templates");
    }//GEN-LAST:event_btn_tra3MouseEntered

    private void btn_tra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tra3ActionPerformed
        // TODO add your handling code here:
        lbl_t.setText("Templates");
        templates();

    }//GEN-LAST:event_btn_tra3ActionPerformed

    private void lbl_amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_amountMouseClicked
        // TODO add your handling code here:
        p_input = 5;
//        tf_type.setText("");
//        lbl_state.setText("");
        if (p_btn == 5 && p_input == 4) {
            tf_type.setText("");
        }

        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
        set_bg_lbl();
    }//GEN-LAST:event_lbl_amountMouseClicked

    private void btn_conMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_conMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_conMouseEntered

    private void btn_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conActionPerformed
        p_btn = 8;
        p_input = 3;
        lbl_t.setText("CONFIRMATION");
        set_cost();


        lbl_state.setText("");
        lbl_name.setText("");
        lbl_date.setText(DateType.str.format(new Date()));
        lbl_time.setText("now");

        sponsors.clear();
        set_bg_lbl();
        set_bg_btn();
        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
    }//GEN-LAST:event_btn_conActionPerformed

    private void btn_bapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bapMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bapMouseEntered

    private void btn_bapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bapActionPerformed
        p_btn = 7;
        p_input = 3;
        lbl_t.setText("BAPTISM");
        set_cost();


        lbl_state.setText("");
        lbl_name.setText("");
        lbl_date.setText(DateType.str.format(new Date()));
        lbl_time.setText("now");

        sponsors.clear();
        set_bg_lbl();
        set_bg_btn();
        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
    }//GEN-LAST:event_btn_bapActionPerformed

    private void btn_funMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_funMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_funMouseEntered

    private void btn_funActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funActionPerformed
        p_btn = 10;
        p_input = 3;
        lbl_t.setText("FUNERAL");
        set_cost();


        lbl_state.setText("");
        lbl_name.setText("");
        lbl_date.setText(DateType.str.format(new Date()));
        lbl_time.setText("now");

        sponsors.clear();
        set_bg_lbl();
        set_bg_btn();
        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
    }//GEN-LAST:event_btn_funActionPerformed

    private void btn_marMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_marMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_marMouseEntered

    private void btn_marActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marActionPerformed
        p_btn = 9;
        p_input = 3;
        lbl_t.setText("MARRIAGE");
        set_cost();


        lbl_state.setText("");
        lbl_name.setText("");
        lbl_date.setText(DateType.str.format(new Date()));
        lbl_time.setText("now");

        sponsors.clear();
        set_bg_lbl();
        set_bg_btn();
        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
    }//GEN-LAST:event_btn_marActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btn_prevActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
        tf_type.setText("");
    }//GEN-LAST:event_jButton86ActionPerformed

    private void lbl_stateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_stateMouseClicked
        // TODO add your handling code here:
        p_input = 4;
//        tf_type.setText("");
//        lbl_state.setText("");
        if (p_btn == 5 && p_input == 4) {
            tf_type.setText("");
        }

        tf_type.setFocusable(true);
        tf_type.grabFocus();
        set_table_tg();
        set_bg_lbl();
    }//GEN-LAST:event_lbl_stateMouseClicked
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_0;
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_11;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_13;
    private javax.swing.JButton btn_14;
    private javax.swing.JButton btn_15;
    private javax.swing.JButton btn_16;
    private javax.swing.JButton btn_17;
    private javax.swing.JButton btn_18;
    private javax.swing.JButton btn_19;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_21;
    private javax.swing.JButton btn_22;
    private javax.swing.JButton btn_23;
    private javax.swing.JButton btn_24;
    private javax.swing.JButton btn_25;
    private javax.swing.JButton btn_26;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_bap;
    private javax.swing.JButton btn_comm;
    private javax.swing.JButton btn_con;
    private javax.swing.JButton btn_don;
    private javax.swing.JButton btn_fun;
    private javax.swing.JButton btn_mar;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_pm;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_req;
    private javax.swing.JButton btn_tg;
    private javax.swing.JButton btn_tra;
    private javax.swing.JButton btn_tra1;
    private javax.swing.JButton btn_tra2;
    private javax.swing.JButton btn_tra3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_ref_no;
    private javax.swing.JLabel lbl_sp;
    private javax.swing.JTextArea lbl_state;
    private javax.swing.JLabel lbl_t;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_trans;
    private javax.swing.JTable tbl_s;
    private javax.swing.JTextField tf_type;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
//        lbl_state.setLineWrap(true);
//        
        init_key();
        lbl_ref_no.setVisible(false);
        jLabel8.setVisible(false);
        set_ref();
//        set_or_no();
        lbl_state.enable(false);
        p_btn = 1;
        set_bg_btn();
        set_bg_lbl();
        set_table_tg();

        set_n();
    }

    private void set_ref() {
        lbl_ref_no.setText("" + S1_mass_schedules.get_ref_number());
        set_or_no();
    }

    private void set_or_no() {
        lbl_trans.setText("" + S1_mass_schedules.get_receipt_no());
    }

    private void clear() {
        tf_type.setText("");
        lbl_name.setText("");
        lbl_state.setText("");
        lbl_time.setText("");
        lbl_amount.setText("0.00");
        sponsors.clear();
        p_input = 1;
        set_bg_lbl();
        tf_type.setFocusable(false);
        set_table_tg();
    }

    private void clear_1() {
        tf_type.setText("");
        lbl_name.setText("");
//        lbl_state.setText("");
//        lbl_time.setText("");


    }
    List<String> sponsors = new ArrayList();

    private void set_table_tg() {

        String[] col_names = new String[1];
        List<String[]> datas = new ArrayList();

        int[] col_editable = {};
        int[] col_to_center = {};
        int[] col_to_right = {};
        if (p_input == 1) {
            col_names = TableAdapter_mass.payroll_col_names("DATE");
            datas = TableAdapter_mass.date_data();


        }
        if (p_input == 2) {
            String type = "";
            if (p_btn == 1) {
                type = "Thanks Giving";
            }
            if (p_btn == 2) {
                type = "Petition Mass";
            }
            if (p_btn == 3) {
                type = "Common";
            }
            if (p_btn == 4) {
                type = "Requiem";
            }
            if (p_btn == 5) {
                type = "Donation";
            }
            if (p_btn == 6) {
                type = "Trans";
            }
            col_names = TableAdapter_mass.payroll_col_names("TIME");
            datas = TableAdapter_mass.time_data(type);

        }
        if (p_input == 3) {
            col_names = TableAdapter_mass.payroll_col_names("");

        }
        if (p_input == 5) {
            col_names = TableAdapter_mass.payroll_col_names("");
            datas = TableAdapter_mass.data_amount();
        }
        if (p_input == 4) {

            if (p_btn == 1 || p_btn == 2 || p_btn == 3) {
                col_names = TableAdapter_mass.payroll_col_names("MESSAGE");
                String type = "";
                if (p_btn == 1) {
                    type = "Thanks Giving";
                }
                if (p_btn == 2) {
                    type = "Petition Mass";
                }
                if (p_btn == 3) {
                    type = "Common";
                }

                datas = TableAdapter_mass.message_data(type);

            }
            if (p_btn == 4) {
                col_names = TableAdapter_mass.payroll_col_names("FOR THE SOULDS OF");
//                System.out.println(sponsors.size());

                datas = TableAdapter_mass.sponsor_data(sponsors);

//                sponsor();
            }
            if (p_btn == 5 || p_btn == 6) {
                col_names = TableAdapter_mass.payroll_col_names("");
                datas = new ArrayList();
            }


            if (p_btn == 7) {
                col_names = TableAdapter_mass.payroll_col_names("RECORDS");
                List<TableAdapter_mass.f_receipts> d = TableAdapter_mass.
                        cert_data("Cert_Baptism");
                datas = TableAdapter_mass.cert_data(d);
            }
            if (p_btn == 8) {
                col_names = TableAdapter_mass.payroll_col_names("RECORDS");
                List<TableAdapter_mass.f_receipts> d = TableAdapter_mass.
                        cert_data("Cert_Confirmation");
                datas = TableAdapter_mass.cert_data(d);
            }
            if (p_btn == 9) {
                col_names = TableAdapter_mass.payroll_col_names("RECORDS");
                List<TableAdapter_mass.f_receipts> d = TableAdapter_mass.
                        cert_data("Cert_Marriage");
                datas = TableAdapter_mass.cert_data(d);
            }
            if (p_btn == 10) {
                col_names = TableAdapter_mass.payroll_col_names("RECORDS");
                List<TableAdapter_mass.f_receipts> d = TableAdapter_mass.
                        cert_data("Cert_Funeral");
                datas = TableAdapter_mass.cert_data(d);
            }

        }
        if (p_btn == 4 && p_input == 1) {
            col_names = TableAdapter_mass.payroll_col_names("DATE");
            datas = TableAdapter_mass.date_data();
//                sponsor();
        }
        if (p_btn >= 6 && p_input == 5) {
            col_names = TableAdapter_mass.payroll_col_names("");
            datas = new ArrayList();

//                sponsor();
        }
        if (p_btn >= 6 && p_input == 4) {
            col_names = TableAdapter_mass.payroll_col_names("");
            datas = new ArrayList();

//                sponsor();
        }

        TableAdapter_mass.set_table(tbl_s, col_names, datas, col_editable, col_to_center, col_to_right);
        if (!datas.isEmpty()) {
            tbl_s.setRowSelectionInterval(0, 0);
        }
//        tbl_s.setRowSelectionInterval(0, 0);
        tbl_s.setRowHeight(40);
//        tbl_s.setAutoResizeMode(1);
        tbl_s.getTableHeader().
                setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_s.setFont(new java.awt.Font("Arial", 1, 12));

        int[] tbl_widths_accounts = {
            0, 100, 0
        };

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_s, i, tbl_widths_accounts[i]);
        }
        TableUtility.align_column_to_Center(tbl_s, 1);
        TableUtility.align_row_to_Center(tbl_s, 1);

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
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_RIGHT, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                btn_next.doClick();
//                JOptionPane.showMessageDialog(null, "adadad");
            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_LEFT, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                btn_prev.doClick();
                removes();
                set_n();
            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_UP, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                choose_up();
//                 removes();
                set_n();
            }
        });
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_DOWN, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                choose_down();
//                removes();
                set_n();
            }
        });
    }
    // </editor-fold>
    int p_input = 1;
    int d_row = -1;

    private void choose_down() {


        int row = tbl_s.getSelectedRow();
//        JOptionPane.showMessageDialog(null, tbl_s.getRowCount() - 1 + " "+row);
        if (row < 0 || row == tbl_s.getRowCount() - 1) {
//            return;
        } else {
            row++;
            tbl_s.setRowSelectionInterval(row, row);
        }


    }

    private void choose_up() {

        int row = tbl_s.getSelectedRow();
        if (row <= 0) {
//            return;
        } else {
            row--;
            tbl_s.setRowSelectionInterval(row, row);
        }


    }

    private void set_bg_lbl() {
        if (p_input == 1) {
            lbl_date.setBackground(new java.awt.Color(102, 255, 0));

            lbl_time.setBackground(new java.awt.Color(240, 240, 240));
            lbl_name.setBackground(new java.awt.Color(240, 240, 240));
            lbl_state.setBackground(new java.awt.Color(240, 240, 240));
            lbl_amount.setBackground(new java.awt.Color(240, 240, 240));
        }
        if (p_input == 2) {
            lbl_time.setBackground(new java.awt.Color(102, 255, 0));

            lbl_date.setBackground(new java.awt.Color(240, 240, 240));
            lbl_name.setBackground(new java.awt.Color(240, 240, 240));
            lbl_state.setBackground(new java.awt.Color(240, 240, 240));
            lbl_amount.setBackground(new java.awt.Color(240, 240, 240));

        }
        if (p_input == 3) {
            lbl_name.setBackground(new java.awt.Color(102, 255, 0));

            lbl_time.setBackground(new java.awt.Color(240, 240, 240));
            lbl_date.setBackground(new java.awt.Color(240, 240, 240));
            lbl_state.setBackground(new java.awt.Color(240, 240, 240));
            lbl_amount.setBackground(new java.awt.Color(240, 240, 240));
        }
        if (p_input == 4) {
            lbl_state.setBackground(new java.awt.Color(102, 255, 0));

            lbl_time.setBackground(new java.awt.Color(240, 240, 240));
            lbl_name.setBackground(new java.awt.Color(240, 240, 240));
            lbl_date.setBackground(new java.awt.Color(240, 240, 240));
            lbl_amount.setBackground(new java.awt.Color(240, 240, 240));
        }
        if (p_input == 5) {
            lbl_amount.setBackground(new java.awt.Color(102, 255, 0));

            lbl_state.setBackground(new java.awt.Color(240, 240, 240));
            lbl_time.setBackground(new java.awt.Color(240, 240, 240));
            lbl_name.setBackground(new java.awt.Color(240, 240, 240));
            lbl_date.setBackground(new java.awt.Color(240, 240, 240));
        }



    }
    int p_btn = 1;

    private void set_bg_btn() {

//        JButton[] btn1 = {btn_tg, btn_pm, btn_comm, btn_req, btn_don, btn_pm};
        if (p_btn == 1) {
            btn_tg.setBackground(new java.awt.Color(102, 255, 0));

            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));


            lbl_sp.setText("MESSAGE:");
        }
        if (p_btn == 2) {
            btn_pm.setBackground(new java.awt.Color(102, 255, 0));

            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));

            lbl_sp.setText("MESSAGE:");
        }
        if (p_btn == 3) {
            btn_comm.setBackground(new java.awt.Color(102, 255, 0));

            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));

            lbl_sp.setText("MESSAGE:");
        }

        if (p_btn == 4) {
            btn_req.setBackground(new java.awt.Color(102, 255, 0));

            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));

            lbl_sp.setText("SOUL OF:");
        }
        if (p_btn == 5) {
            btn_don.setBackground(new java.awt.Color(102, 255, 0));

            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));

            lbl_sp.setText("REMARKS:");
        }
        if (p_btn == 6) {
            btn_tra.setBackground(new java.awt.Color(102, 255, 0));

            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));

            lbl_sp.setText("REMARKS:");
        }

        if (p_btn == 7) {
            btn_bap.setBackground(new java.awt.Color(102, 255, 0));

            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));


            lbl_sp.setText("Recepient");
        }
        if (p_btn == 8) {

            btn_con.setBackground(new java.awt.Color(102, 255, 0));

            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));
            lbl_sp.setText("Recepient:");
        }

        if (p_btn == 9) {

            btn_mar.setBackground(new java.awt.Color(102, 255, 0));

            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_con.setBackground(new java.awt.Color(240, 240, 240));
            btn_fun.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));
            lbl_sp.setText("Recepient:");
        }
        if (p_btn == 10) {

            btn_fun.setBackground(new java.awt.Color(102, 255, 0));

            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_tg.setBackground(new java.awt.Color(240, 240, 240));
            btn_pm.setBackground(new java.awt.Color(240, 240, 240));
            btn_comm.setBackground(new java.awt.Color(240, 240, 240));
            btn_req.setBackground(new java.awt.Color(240, 240, 240));
            btn_don.setBackground(new java.awt.Color(240, 240, 240));
            btn_tra.setBackground(new java.awt.Color(240, 240, 240));
            btn_mar.setBackground(new java.awt.Color(240, 240, 240));
            btn_bap.setBackground(new java.awt.Color(240, 240, 240));
            lbl_sp.setText("Recepient:");
        }
    }
    int caps = 1;

    private void set_lbl(String text) {
        if (caps == 1) {
            text = text.toUpperCase();
        } else {
            text = text.toLowerCase();
        }
        String n = tf_type.getText();
        n = n + text;
        tf_type.setText(n);
        if (p_input == 3) {
            lbl_name.setText(n);
        }
        if (p_input == 5) {
            lbl_amount.setText(n);
        }
        if (p_input == 4) {
            lbl_state.setText(TableAdapter_mass.add_string(sponsors));
        }
    }

    private void set_size() {
        JButton[] btn = {btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10, btn_11, btn_12, btn_13, btn_14, btn_15, btn_16, btn_17, btn_18, btn_19, btn_20, btn_21, btn_22, btn_23, btn_24, btn_25, btn_26
        };

        String[] st = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        String[] st2 = {"_", "-", "=", "+", "{", "}", "[", "]", "|", "\\", ";", ":", "'", "''", "<", ">", ",", ".", "/", "?", "", "", "", "", "", ""};

        JButton[] btn2 = {bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9, bt_0};
        String[] st3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] st4 = {"!", "@", "#", "$", "%", "^", "&", "*", "", ""};
        int ii = 0;
        int ii2 = 0;
        if (cars == 1) {
            for (JButton b : btn) {
                if (caps == 1) {
                    st[ii] = st[ii].toUpperCase();
                    b.setText(st[ii]);
                } else {
                    st[ii] = st[ii].toLowerCase();
                    b.setText(st[ii]);
                }
                ii++;

            }
            for (JButton b : btn2) {
                if (caps == 1) {
                    st3[ii2] = st3[ii2].toUpperCase();
                    b.setText(st3[ii2]);
                } else {
                    st3[ii2] = st3[ii2].toLowerCase();
                    b.setText(st3[ii2]);
                }

                ii2++;
            }
        }
        int i = 0;
        int i2 = 0;
        if (cars == 0) {
            for (JButton b : btn) {
                b.setText(st2[i]);
                i++;
            }
            for (JButton b : btn2) {
                b.setText(st4[i2]);
                i2++;
            }
        }

    }
    int cars = 1;

    private void set_key() {
        String n = tf_type.getText();
//        n = n + text;
//        tf_type.setText(n);


        if (p_btn == 1 || p_btn == 2 || p_btn == 3) {
            if (p_input == 1) {
                lbl_date.setText(n);
            }
            if (p_input == 2) {
                lbl_time.setText(n);
            }
            if (p_input == 3) {
                lbl_name.setText(n);
            }
            if (p_input == 5) {
                lbl_amount.setText(n);
            }
            if (p_input == 4) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
                lbl_state.setText(name + " " + tf_type.getText());
            }
            if (p_input == 5) {
//                int row = tbl_s.getSelectedRow();
//                if (row < 0) {
//                    return;
//                }
//                String name = tbl_s.getModel().
//                        getValueAt(row, 1).
//                        toString();
                lbl_amount.setText(tf_type.getText());
            }
        }

        if (p_btn == 4) {
//            }
            if (p_input == 3) {
                lbl_name.setText(n);
            }
            if (p_input == 4) {
                lbl_state.setText(TableAdapter_mass.add_string(sponsors));
            }
            if (p_input == 5) {
                lbl_amount.setText(tf_type.getText());
            }
//            if (p_input == 6) {
//                lbl_amount.setText(tf_type.getText());
//            }

        }
        if (p_btn == 5) {
            if (p_input == 3) {
                lbl_name.setText(n);
            }
            if (p_input == 4 || p_input==5) {
//                lbl_state.setText(n);
                lbl_amount.setText(FitIn.fmt_wc_0(FitIn.toDouble(tf_type.getText())));
            }

        }
        if (p_btn >= 6) {
            if (p_input == 3) {
                lbl_name.setText(n);
            }
            if (p_input == 4 || p_input==5) {
                lbl_state.setText(n);
                lbl_amount.setText(FitIn.fmt_wc_0(FitIn.toDouble(n)));
            }

        }

    }

    private void sponsor() {
        String n = tf_type.getText();
        if (n.isEmpty()) {
//            return;
        } else {
            if (p_btn == 4 && p_input == 4) {
                sponsors.add(n);
                compute_requiem_cost();
                set_table_tg();
            }
        }
    }
    Date pressedtime;
    long timeClicked;

    private void set_n() {


        if (p_btn == 1 || p_btn == 2 || p_btn == 3) {
            if (p_input == 1) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();

                lbl_date.setText(name);
            }
            if (p_input == 2) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();

                lbl_time.setText(name);
            }
            if (p_input == 3) {
//                lbl_name.setText("");
                tf_type.setText(lbl_name.getText());
            }
            if (p_input == 4) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
//                lbl_amount.setText(name);
                lbl_state.setText(name + lbl_name.getText());
            }
//            if (p_input == 5) {
//                lbl_amount.setText(tf_type.getText());
//            }
            if (p_input == 5) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
                lbl_amount.setText(name);
            }
        }
        if (p_btn == 4) {
            if (p_input == 1) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
                lbl_date.setText(name);
            }
            if (p_input == 2) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
                lbl_time.setText(name);
            }
            if (p_input == 3) {
//                lbl_name.setText("");
                tf_type.setText(lbl_name.getText());
            }
            if (p_input == 4) {
                lbl_state.setText(TableAdapter_mass.add_string(sponsors));
            }
            if (p_input == 5) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }

                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
                lbl_amount.setText(name);
            }
        }
        if (p_btn > 6) {
            if (p_input == 4) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
                String amount = tbl_s.getModel().
                        getValueAt(row, 2).
                        toString();
                String id = tbl_s.getModel().
                        getValueAt(row, 0).
                        toString();
                lbl_state.setText(name + tf_type.getText());
                lbl_amount.setText(amount);
                r_id = id;

            }
            if (p_input == 5) {
                int row = tbl_s.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String name = tbl_s.getModel().
                        getValueAt(row, 1).
                        toString();
                lbl_amount.setText(name);
            }
        }

    }

    private void removes() {

        if (p_btn == 4 && p_input == 4) {
            int row = tbl_s.getSelectedRow();
            if (row < 0) {
//                return;
            } else {
                sponsors.remove(row);
                set_table_tg();
                set_key();
            }
            compute_requiem_cost();
        }
    }

    private void set_cost() {
        if (p_btn == 1) {
            lbl_amount.setText("100.00");
        }
        if (p_btn == 2) {
            lbl_amount.setText("100.00");
        }
        if (p_btn == 3) {
            lbl_amount.setText("100.00");
        }
        if (p_btn == 4) {
            lbl_amount.setText("0.00");
        }
        if (p_btn == 5) {
            lbl_amount.setText("0.00");
        }
        if (p_btn == 6) {
            lbl_amount.setText("0.00");
        }
    }

    private void compute_requiem_cost() {
        int size = sponsors.size();
        double am = 100 * size;
        lbl_amount.setText(FitIn.fmt_wc_0(am));
    }

    private void next() {

//        JOptionPane.showMessageDialog(null, p_input);
        if (p_input == 1) {
            p_input = 2;
//            clear_1();

            tf_type.setFocusable(false);
            set_table_tg();
            set_bg_lbl();
            set_n();
        } else if (p_input == 2) {
            p_input = 3;
//            clear_1();
            tf_type.setFocusable(true);
            tf_type.grabFocus();
            set_table_tg();
            set_bg_lbl();
            set_n();
        } else if (p_input == 3) {
            p_input = 4;
//        tf_type.setText("");
//        lbl_state.setText("");
            if (p_btn == 5 && p_input == 4) {
                tf_type.setText("");
            }

            tf_type.setFocusable(true);
            tf_type.grabFocus();
            tf_type.selectAll();
            set_table_tg();
            set_bg_lbl();
        } else if (p_input == 4) {
            p_input = 5;
//        tf_type.setText("");
//        lbl_state.setText("");
            if (p_btn == 5 && p_input == 4) {
                tf_type.setText("");
            }
            tf_type.setText(lbl_amount.getText());
            tf_type.setFocusable(true);
            tf_type.grabFocus();
            tf_type.selectAll();
            set_table_tg();
            set_bg_lbl();
        } else {
            Window p = (Window) this;
            Dlg_confirm nd = Dlg_confirm.create(p, true);
            nd.setTitle("");
//            nd.do_pass("");
            nd.setCallback(new Dlg_confirm.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                    closeDialog.ok();
                    save();
                }
            });
            Center.setCenter(nd);

            nd.setVisible(true);
        }

    }

    private void prev() {

//        JOptionPane.showMessageDialog(null, p_input);
        if (p_input == 2) {
            p_input = 1;
//            clear_1();

            tf_type.setFocusable(false);
            set_table_tg();
            set_bg_lbl();
            set_n();
        } else if (p_input == 3) {
            p_input = 2;
//            clear_1();

            tf_type.setFocusable(true);
            tf_type.grabFocus();
            set_table_tg();
            set_bg_lbl();
            set_n();
        } else if (p_input == 4) {
            p_input = 3;
//        tf_type.setText("");
//        lbl_state.setText("");
            if (p_btn == 5 && p_input == 4) {
                tf_type.setText("");
            }

            tf_type.setFocusable(true);
            tf_type.grabFocus();
            tf_type.selectAll();
            set_table_tg();
            set_bg_lbl();
        } else if (p_input == 5) {
            p_input = 4;
//        tf_type.setText("");
//        lbl_state.setText("");
            if (p_btn == 5 && p_input == 4) {
                tf_type.setText("");
            }
            tf_type.setText(lbl_amount.getText());
            tf_type.setFocusable(true);
            tf_type.grabFocus();
            tf_type.selectAll();
            set_table_tg();
            set_bg_lbl();
        } else {
        }

    }

    private void time_settings() {
        Window p = (Window) this;
        Dlg_mass_scheds nd = Dlg_mass_scheds.create(p, true);
        nd.setTitle("");
//            nd.do_pass("");
        nd.setCallback(new Dlg_mass_scheds.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_scheds.OutputData data) {
                closeDialog.ok();
                save();
                set_ref();
                p_input = 1;
                p_btn = 4;
                next();

            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void templates() {
        Window p = (Window) this;
        Dlg_mass_templates nd = Dlg_mass_templates.create(p, true);
        nd.setTitle("");
//            nd.do_pass("");
        nd.setCallback(new Dlg_mass_templates.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass_templates.OutputData data) {
                closeDialog.ok();
//                save();
//                set_ref();
//                p_input = 1;
//                p_btn = 4;
//                next();

            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void save() {

        String user_name = "Ronald Pascua";
        String user_id = "1";
        String terminal_id = System.getProperty("terminal_id", "1");
        if (to_users.username1 == null) {
            user_name = "";
            user_id = "1";
        } else {
            user_name = to_users.username1;
            user_id = S4_ret_number.ret_user_id(user_name);
        }


//        JOptionPane.showMessageDialog(null, user_name+ " -" +user_id);

        String path = System.getProperty("path", "C:\\Users\\Dummy\\images");
        String dates = DateType.sf1.format(new Date());
        String names = "";
        String words = "";
        String types = "";
        String modes = "";
        String amounts = "";
        String ors = "";
        String received_by = user_name;

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (p_btn == 1 || p_btn == 2 || p_btn == 3) {
            String type = "Thanks Giving";
            if (p_btn == 1) {
                type = "Thanks Giving";
            }
            if (p_btn == 2) {
                type = "Petition Mass";
            }
            if (p_btn == 3) {
                type = "Common";
            }

            String time = lbl_time.getText();
            String priest = "";
            String parishioner = lbl_name.getText();
            String contact = "";

            String ref_no = "" + S1_mass_schedules.get_ref_number();
            String message = lbl_state.getText();

            Date d = new Date();
            try {
                d = DateType.str.parse(lbl_date.getText());
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_mass2.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
            String tg_date = DateType.sf.format(d);

            String or_no = "" + S1_mass_schedules.get_receipt_no();
            double amount = FitIn.toDouble(lbl_amount.getText());
            S1_mass_schedules.add_intention(time, priest, parishioner, contact, message, type, ref_no, tg_date, or_no, amount, terminal_id, user_id, user_name);

            amounts = FitIn.fmt_wc_0(amount);
            ors = or_no;
            names = parishioner;
            modes = "Cash";
            types = type;
            words = DigitToWord.convertToWordsIn(amount) + " Pesos";
            words = words.toUpperCase();
            Reference_number.to_receipt t = new Reference_number.to_receipt(dates, names, words, types, modes, amounts, ors, received_by, path);
            String print = System.getProperty("do_print_receipt", "0");
            if (print.equals("1")) {
                Reference_number.print_receipt(t);
//                Reference_number.print_receipt(t);
            }

            clear();
            set_ref();
        }

        if (p_btn == 4) {
            String type = "Requiem Mass";
            String time = lbl_time.getText();
            String priest = "";
            String parishioner = lbl_name.getText();
            String contact = "";
            String ref_no = "" + S1_mass_schedules.get_ref_number();

            Date d = new Date();
            try {
                d = DateType.str.parse(lbl_date.getText());
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_mass2.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
            String tg_date = DateType.sf.format(d);

            String message = lbl_state.getText();
//            message = message.substring(1, message.length());
            String or_no = "" + S1_mass_schedules.get_receipt_no();
            double amount = FitIn.toDouble(lbl_amount.getText());
            S1_mass_schedules.add_intention_requiem(time, priest, parishioner, contact, message, type, ref_no, tg_date, sponsors, or_no, amount, terminal_id, user_id, user_name);

            amounts = FitIn.fmt_wc_0(amount);
            ors = or_no;
            names = parishioner;
            modes = "Cash";
            types = type;
            words = DigitToWord.convertToWordsIn(amount) + " Pesos";
            words = words.toUpperCase();
            Reference_number.to_receipt t = new Reference_number.to_receipt(dates, names, words, types, modes, amounts, ors, received_by, path);
            String print = System.getProperty("do_print_receipt", "0");
            if (print.equals("1")) {
                Reference_number.print_receipt(t);
//                Reference_number.print_receipt(t);
            }
            clear();
            set_ref();
            set_or_no();
        }
        if (p_btn == 5) {
            String parishioner = lbl_name.getText();
            double message = FitIn.toDouble(lbl_amount.getText());
            String or_no = "" + S1_mass_schedules.get_receipt_no();
            String ref_no = lbl_ref_no.getText();


            S1_mass_schedules.do_pay_donation(parishioner, message, or_no, "Donation", ref_no, terminal_id, user_id, user_name);
            amounts = FitIn.fmt_wc_0(message);
            ors = or_no;
            names = parishioner;
            modes = "Cash";
            types = "Donation";
            words = DigitToWord.convertToWordsIn(message) + " Pesos";
            words = words.toUpperCase();
            Reference_number.to_receipt t = new Reference_number.to_receipt(dates, names, words, types, modes, amounts, ors, received_by, path);
            String print = System.getProperty("do_print_receipt", "0");
            if (print.equals("1")) {
                Reference_number.print_receipt(t);
//                Reference_number.print_receipt(t);
            }
            clear();
            set_ref();
            set_or_no();
        }
        if (p_btn == 6) {
            String parishioner = lbl_name.getText();
            double message = FitIn.toDouble(lbl_amount.getText());
            String or_no = "" + S1_mass_schedules.get_receipt_no();
            String ref_no = lbl_ref_no.getText();
            S1_mass_schedules.do_pay_donation(parishioner, message, or_no, "Transfer", ref_no, terminal_id, user_id, user_name);

            amounts = FitIn.fmt_wc_0(message);
            ors = or_no;
            names = parishioner;
            modes = "Cash";
            types = "Transfer";
            words = DigitToWord.convertToWordsIn(message) + " Pesos ";
            words = words.toUpperCase();
            Reference_number.to_receipt t = new Reference_number.to_receipt(dates, names, words, types, modes, amounts, ors, received_by, path);
            String print = System.getProperty("do_print_receipt", "0");
            if (print.equals("1")) {
                Reference_number.print_receipt(t);
                Reference_number.print_receipt(t);
            }
            clear();
            set_ref();
            set_or_no();
        }
        if (p_btn > 6) {
            String parishioner = lbl_name.getText();
            double message = FitIn.toDouble(lbl_amount.getText());
            String or_no = "" + S1_mass_schedules.get_receipt_no();
            String ref_no = lbl_ref_no.getText();
            String type = "";
            if (p_btn == 7) {
                type = "Cert_Baptism";
            }
            if (p_btn == 8) {
                type = "Cert_Confirmation";
            }
            if (p_btn == 9) {
                type = "Cert_Marriage";
            }
            if (p_btn == 10) {
                type = "Cert_Funeral";
            }
            S1_mass_schedules.do_pay_cert(parishioner, message, or_no, "Transfer", ref_no, terminal_id, user_id, user_name, r_id);

            amounts = FitIn.fmt_wc_0(message);
            ors = or_no;
            names = parishioner;
            modes = "Cash";
            types = "Transfer";
            words = DigitToWord.convertToWordsIn(message) + " Pesos";
            words = words.toUpperCase();
            Reference_number.to_receipt t = new Reference_number.to_receipt(dates, names, words, types, modes, amounts, ors, received_by, path);
            String print = System.getProperty("do_print_receipt", "0");
            if (print.equals("1")) {
                Reference_number.print_receipt(t);
//                Reference_number.print_receipt(t);
            }
            clear();
            set_ref();
            set_or_no();
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        JOptionPane.showMessageDialog(null, "Successfully Added");
    }
    String r_id = "";
    private void reports(){
        Window p = (Window) this;
        Dlg_cash_report nd = Dlg_cash_report.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new Dlg_cash_report.Callback() {
            
            @Override
            public void ok(CloseDialog closeDialog, Dlg_cash_report.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);
        
        nd.setVisible(true);
    }
}
