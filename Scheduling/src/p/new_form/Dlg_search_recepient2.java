/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.new_form;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.new_form.to_baptism.S7_approval;
import p.rpt.other_reports.rpt_scheduler_others;
import bb.svc2.S6_parishioners;
import bb.svc2.S6_parishioners.to_parishioners;
import bb.svc2.S7_book_archives;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.combobox.ListComboBoxModel;
import p.svc.S1_mass_schedules;
import p.to.to_users;
import p.util.DateType;
import p.util.NumberToPower;
import p.util.Series_of;
import p.util.TableUtility;
import rpt_main.Dlg_priest;

/**
 *
 * @author dummy
 */
public class Dlg_search_recepient2 extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_search_person
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

        public final S6_parishioners.to_parishioners to;

        public OutputData(to_parishioners to) {
            this.to = to;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_search_recepient2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_search_recepient2(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_search_recepient2() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_search_recepient2 myRef;

    private void setThisRef(Dlg_search_recepient2 myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_search_recepient2> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_search_recepient2 create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.MODELESS);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_search_recepient2 create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_search_recepient2 dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_search_recepient2((java.awt.Frame) parent, false);
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
            Dlg_search_recepient2 dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_search_recepient2((java.awt.Dialog) parent, false);
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
//            System.setProperty("sun.java2d.opengl", "True");
            Application.setSystemLookAndFeel();
//            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Dlg_search_recepient2 dialog = Dlg_search_recepient2.create(new javax.swing.JFrame(), true);
//        Dlg_search_person d=new Dlg_search_person();
//        dialog.setVisible(true);
//        JFrame f = new JFrame();
//        f.add(d);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());

//        Center.setCenter(dialog);
//
        dialog.setVisible(true);
//      
        dialog.setSize(xSize, ySize);
////        String version = check_version();
////        JFrame f = Application.launchMainFrame(pnl, "Synapse Software Technologies - POS");
////        f.setUndecorated(true);
////        f.setVisible(true);
////        f.setAlwaysOnTop(false);
//        f.setVisible(true);
//        f.setExtendedState(JFrame.MAXIMIZED_BOTH);

//            do_check_date();
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

        pm_scheduler = new javax.swing.JPopupMenu();
        approve = new javax.swing.JMenuItem();
        confirm = new javax.swing.JMenuItem();
        cert = new javax.swing.JMenuItem();
        pm_cashier = new javax.swing.JPopupMenu();
        pay = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_name = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pnl_help = new javax.swing.JPanel();
        lb_dt = new javax.swing.JLabel();
        lb_df = new javax.swing.JLabel();
        dp_date_to = new com.toedter.calendar.JDateChooser();
        dp_date_from = new com.toedter.calendar.JDateChooser();
        tf_book_no = new javax.swing.JTextField();
        tf_page_no = new javax.swing.JTextField();
        cb_years = new javax.swing.JComboBox();
        lb_dt1 = new javax.swing.JLabel();
        lb_dt2 = new javax.swing.JLabel();
        lb_dt3 = new javax.swing.JLabel();
        tf_num = new javax.swing.JTextField();
        cb_search = new javax.swing.JComboBox();
        cbx_baptism = new javax.swing.JCheckBox();
        cbx_conf = new javax.swing.JCheckBox();
        cbx_marriage = new javax.swing.JCheckBox();
        cbx_funeral = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        tf_b_no = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_p_no = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_index = new javax.swing.JTextField();
        cbx_date = new javax.swing.JCheckBox();
        dp_d_f = new com.toedter.calendar.JDateChooser();
        dp_d_t = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        approve.setText("APPROVE");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });
        pm_scheduler.add(approve);

        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        pm_scheduler.add(confirm);

        cert.setText("PRINT CERTIFICATE");
        cert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certActionPerformed(evt);
            }
        });
        pm_scheduler.add(cert);

        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        pm_cashier.add(pay);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Sacrament Recepients");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.Color.white);

        tbl_name.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_nameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_nameMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_name);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        jButton1.setText("OK");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLOSE");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tf_search.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Search by:");

        pnl_help.setBackground(java.awt.Color.white);
        pnl_help.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_dt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_dt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_dt.setText("BOOK NO:");
        pnl_help.add(lb_dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 80, 30));

        lb_df.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_df.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_df.setText("DATE FROM:");
        pnl_help.add(lb_df, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 30));

        dp_date_to.setFocusable(false);
        pnl_help.add(dp_date_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 140, -1));

        dp_date_from.setFocusable(false);
        pnl_help.add(dp_date_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, -1));

        tf_book_no.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tf_book_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_book_no.setFocusable(false);
        tf_book_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_book_noKeyReleased(evt);
            }
        });
        pnl_help.add(tf_book_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 80, -1));

        tf_page_no.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tf_page_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_page_no.setFocusable(false);
        tf_page_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_page_noKeyReleased(evt);
            }
        });
        pnl_help.add(tf_page_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 90, -1));

        cb_years.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_years.setFocusable(false);
        cb_years.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cb_yearsKeyReleased(evt);
            }
        });
        pnl_help.add(cb_years, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 410, 30));

        lb_dt1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_dt1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_dt1.setText("DATE TO:");
        pnl_help.add(lb_dt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, 30));

        lb_dt2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_dt2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_dt2.setText("PAGE NO:");
        pnl_help.add(lb_dt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, 30));

        lb_dt3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_dt3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_dt3.setText("NO.");
        pnl_help.add(lb_dt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 40, 30));

        tf_num.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tf_num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_num.setFocusable(false);
        tf_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_numKeyReleased(evt);
            }
        });
        pnl_help.add(tf_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 100, -1));

        cb_search.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cb_search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Baptism", "      Date", "      Archive", "Communion", "      Date", "      Archive", "Confirmation", "      Date", "      Archive", "Marriage", "      Date", "      Archive", "2nd Marriage", "      Date", "      Archive", "Profession of Faith", "      Date", "      Archive", "Acceptance", "      Date", "      Archive", "Death", "      Date", "      Archive", " " }));
        cb_search.setFocusable(false);
        cb_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_searchActionPerformed(evt);
            }
        });
        pnl_help.add(cb_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 21, 30));

        buttonGroup1.add(cbx_baptism);
        cbx_baptism.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbx_baptism.setSelected(true);
        cbx_baptism.setText("BAPTISM");
        cbx_baptism.setFocusable(false);
        cbx_baptism.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_baptismActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbx_conf);
        cbx_conf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbx_conf.setText("CONFIRMATION");
        cbx_conf.setFocusable(false);
        cbx_conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_confActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbx_marriage);
        cbx_marriage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbx_marriage.setText("MARRIAGE");
        cbx_marriage.setFocusable(false);
        cbx_marriage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_marriageActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbx_funeral);
        cbx_funeral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbx_funeral.setText("FUNERAL");
        cbx_funeral.setFocusable(false);
        cbx_funeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_funeralActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("BOOK NO:");

        tf_b_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_b_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_b_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_b_noKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PAGE NO:");

        tf_p_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_p_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_p_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_p_noKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("INDEX:");

        tf_index.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_index.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_index.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_indexKeyReleased(evt);
            }
        });

        cbx_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_dateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TO");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("NEW");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tf_search))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_conf)
                        .addGap(18, 18, 18)
                        .addComponent(cbx_marriage)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbx_funeral)
                        .addGap(70, 70, 70)
                        .addComponent(cbx_date)
                        .addGap(15, 15, 15)
                        .addComponent(dp_d_f, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_b_no, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_p_no, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_index, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dp_d_t, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(pnl_help, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_baptism)
                            .addComponent(cbx_conf)
                            .addComponent(cbx_marriage)
                            .addComponent(cbx_funeral))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbx_date)
                            .addComponent(dp_d_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dp_d_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_b_no, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_p_no, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_index, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_help, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_searchActionPerformed
        // TODO add your handling code here:
        init_hlper();
    }//GEN-LAST:event_cb_searchActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
//        data_by_name();
        set_table();
    }//GEN-LAST:event_tf_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nameMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_nameMousePressed

    private void tbl_nameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nameMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_nameMouseReleased

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
        do_payment();
    }//GEN-LAST:event_payActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        // TODO add your handling code here:
        do_approve();
    }//GEN-LAST:event_approveActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        do_confirm();
    }//GEN-LAST:event_confirmActionPerformed

    private void certActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certActionPerformed
        // TODO add your handling code here:
        do_print();
    }//GEN-LAST:event_certActionPerformed

    private void tf_book_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_book_noKeyReleased
        // TODO add your handling code here:
//        data_by_name();
    }//GEN-LAST:event_tf_book_noKeyReleased

    private void tf_page_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_page_noKeyReleased
        // TODO add your handling code here:
//        data_by_name();
    }//GEN-LAST:event_tf_page_noKeyReleased

    private void tf_numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_numKeyReleased
        // TODO add your handling code here:
//        data_by_name();
    }//GEN-LAST:event_tf_numKeyReleased

    private void cb_yearsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_yearsKeyReleased
        // TODO add your handling code here:
//        data_by_name();
    }//GEN-LAST:event_cb_yearsKeyReleased

    private void cbx_confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_confActionPerformed
        // TODO add your handling code here:
        set_table();
    }//GEN-LAST:event_cbx_confActionPerformed

    private void cbx_baptismActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_baptismActionPerformed
        // TODO add your handling code here:
        set_table();
    }//GEN-LAST:event_cbx_baptismActionPerformed

    private void cbx_marriageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_marriageActionPerformed
        // TODO add your handling code here:
        set_table();
    }//GEN-LAST:event_cbx_marriageActionPerformed

    private void cbx_funeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_funeralActionPerformed
        // TODO add your handling code here:
        set_table();
    }//GEN-LAST:event_cbx_funeralActionPerformed

    private void tf_b_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_b_noKeyReleased
        // TODO add your handling code here:
        set_table();
    }//GEN-LAST:event_tf_b_noKeyReleased

    private void tf_p_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_p_noKeyReleased
        // TODO add your handling code here:
        set_table();
    }//GEN-LAST:event_tf_p_noKeyReleased

    private void tf_indexKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_indexKeyReleased
        // TODO add your handling code here:
        set_table();;
    }//GEN-LAST:event_tf_indexKeyReleased

    private void cbx_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_dateActionPerformed
        // TODO add your handling code here:
        set_table();
    }//GEN-LAST:event_cbx_dateActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem approve;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_search;
    private javax.swing.JComboBox cb_years;
    private javax.swing.JCheckBox cbx_baptism;
    private javax.swing.JCheckBox cbx_conf;
    private javax.swing.JCheckBox cbx_date;
    private javax.swing.JCheckBox cbx_funeral;
    private javax.swing.JCheckBox cbx_marriage;
    private javax.swing.JMenuItem cert;
    private javax.swing.JMenuItem confirm;
    private com.toedter.calendar.JDateChooser dp_d_f;
    private com.toedter.calendar.JDateChooser dp_d_t;
    private com.toedter.calendar.JDateChooser dp_date_from;
    private com.toedter.calendar.JDateChooser dp_date_to;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_df;
    private javax.swing.JLabel lb_dt;
    private javax.swing.JLabel lb_dt1;
    private javax.swing.JLabel lb_dt2;
    private javax.swing.JLabel lb_dt3;
    private javax.swing.JMenuItem pay;
    private javax.swing.JPopupMenu pm_cashier;
    private javax.swing.JPopupMenu pm_scheduler;
    private javax.swing.JPanel pnl_help;
    private javax.swing.JTable tbl_name;
    private javax.swing.JTextField tf_b_no;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_index;
    private javax.swing.JTextField tf_num;
    private javax.swing.JTextField tf_p_no;
    private javax.swing.JTextField tf_page_no;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        dp_d_f.setDate(new Date());
        dp_d_t.setDate(new Date());
        tf_search.grabFocus();
        init_date();
        init_date_to();
        init_key();
        init_hlper();
        dates();
        set_table();
//        init_tbl_names();
//        data_by_name();

    }

    private void dates() {
        dp_d_f.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                set_table();
            }
        });
        dp_d_t.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                set_table();
            }
        });
    }

    private void init_cb() {
//          int row = cb_search.getSelectedIndex();
//          if(row==2 || row==3){
//              
//          }
    }

    public void acc_set(int type) {
        usr_type = type;
    }

    private void init_date() {
        dp_date_from.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                dp_date_to.setDate(dp_date_from.getDate());
//                data_by_name();
            }
        });
    }

    private void init_date_to() {
        dp_date_to.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
//                dp_date_to.setDate(dp_date_from.getDate());
//                data_by_name();
            }
        });
    }

    private void init_hlper() {
        int row = cb_search.getSelectedIndex();
        if (row == 0) {
            pnl_help.setVisible(false);
        } else {
            if (row == 2) {
//                 cb_years.setModel(new ListComboBoxModel(S7_book_archives.ret_arc_by_sac("Baptism")));
                date();
            }
            if (row == 3) {
                cb_years.setModel(new ListComboBoxModel(S7_book_archives.ret_arc_by_sac("Baptism")));
                AutoCompleteDecorator.decorate(cb_years);
                archive();
            }

            pnl_help.setVisible(true);

        }
    }

    private void date() {
        lb_df.setText("DATE FROM:");
        dp_date_from.setVisible(true);
        dp_date_to.setVisible(true);

        tf_book_no.setVisible(false);
        tf_page_no.setVisible(false);
        tf_num.setVisible(false);
        cb_years.setVisible(false);


        lb_dt.setVisible(false);
        lb_dt2.setVisible(false);
        lb_dt3.setVisible(false);
    }

    private void archive() {
        lb_df.setText("YEAR:");
        dp_date_from.setVisible(false);
        dp_date_to.setVisible(false);

        tf_book_no.setVisible(true);
        tf_page_no.setVisible(true);
        tf_num.setVisible(true);
        cb_years.setVisible(true);


        lb_dt.setVisible(true);
        lb_dt2.setVisible(true);
        lb_dt3.setVisible(true);
    }
    String gends = "";
    String refs = "";
    String marr_status = "";

    public void do_pass(String genders, String ref_no) {
//        data_by_name();
        gends = genders;
        refs = ref_no;
    }

    public void do_pass2() {
        marr_status = "4";
    }
//    List<String[]> model_data = new ArrayListModel();

    private void set_table() {
        String rite_name = "";
        if (cbx_baptism.isSelected()) {
            rite_name = "Date of Baptism";
        }
        if (cbx_conf.isSelected()) {
            rite_name = "Date of Confirmation";
        }
        if (cbx_marriage.isSelected()) {
            rite_name = "Date of Marriage";
        }
        if (cbx_funeral.isSelected()) {
            rite_name = "Date of Funeral";
        }
        String search = tf_search.getText();
        String book_no = tf_b_no.getText();
        String page_no = tf_p_no.getText();
        String index_no = tf_index.getText();

        String date_from = "";
        String date_to = "";
        if (cbx_date.isSelected()) {
            date_from = DateType.sf.format(dp_d_f.getDate());
            date_to = DateType.sf.format(dp_d_t.getDate());
        } else {
            date_from = "0001-01-01";
            date_to = DateType.sf.format(new Date());
        }

        String[] col_names = Set_table_search.set_table_header(rite_name);
        List<String[]> data_holder = Set_table_search.ret_data(search, rite_name, book_no, page_no, index_no, date_from, date_to, gends, refs, marr_status);
        final int[] col_editable = {};
        int[] cols_to_center = {};
        int[] rows_to_right = {};
        Set_table_search.set_table(tbl_name, col_names, data_holder, col_editable, cols_to_center, rows_to_right);




        int[] tbl_widths_accounts = {
            60, 100, 100, 100, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 130, 80, 80, 80, 100, 200, 200, 120, 120
        };

        tbl_name.setAutoResizeMode(0);
        tbl_name.getTableHeader().
                setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_name.setRowHeight(35);
        tbl_name.setFont(new java.awt.Font("Arial", 0, 10));



        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            TableWidthUtilities.setColumnWidth(tbl_name, i, tbl_widths_accounts[i]);
            if (i == 31 || i == 32) {
                continue;
            }
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
    // <editor-fold defaultstate="collapsed" desc="TABLE">
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_names() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_name.setModel(tbl_employee_payroll_M);
        tbl_name.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_name.setRowHeight(25);
//        tbl_name.getTableHeader().setPreferredSize(new Dimension(0, 15));
        tbl_name.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {60, 100, 100, 100, 70, 100, 100, 100, 200, 0, 0, 0, 0, 150, 150, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            TableWidthUtilities.setColumnWidth(tbl_name, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        Dimension d = tbl_name.getTableHeader().
                getPreferredSize();
        d.height = 30;
        tbl_name.getTableHeader().
                setPreferredSize(d);

        TableUtility.align_row_to_Center(tbl_name, 2);
        TableUtility.align_row_to_left(tbl_name, 3);
        TableUtility.align_row_to_Center(tbl_name, 0);

        TableUtility.align_row_to_Center(tbl_name, 4);


        tbl_name.getTableHeader().
                setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_name.setRowHeight(35);
        tbl_name.setFont(new java.awt.Font("Arial", 0, 12));
    }

    private void loadData_baptism(List<S6_parishioners.to_parishioners> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "Baptism", "Communion", "Confirmation", "Marriage", "2nd Marriage", "Prof of Faith", "Acceptance", "Death", "Date Added", "Place of Baptism"
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
            S6_parishioners.to_parishioners tt = (S6_parishioners.to_parishioners) getRow(row);

            switch (col) {
            case 0:
                return tt.ref_id;
            case 1:
                return tt.fname;
            case 2:
                return tt.mi;
            case 3:
                return tt.lname;
            case 4:
                return tt.gender;
            case 5:
                return tt.date_of_baptism;
            case 6:
                return tt.date_of_birth;
            case 7:
                return tt.place_of_birth;
            case 8:
                return tt.address1;
            case 9:
                return tt.address2;
            case 10:
                return tt.city;
            case 11:
                return tt.states;
            case 12:
                return tt.zip_code;
            case 13:
                return tt.father;
            case 14:
                return tt.mother;
            case 15:
                return tt.is_baptized;
            case 16:
                return tt.is_comm;
            case 17:
                return tt.is_confirm;
            case 18:
                return tt.is_married;
            case 19:
                return tt.is_2nd_married;
            case 20:
                return tt.is_prof_faith;
            case 21:
                return tt.is_acceptance;
            case 22:
                return tt.is_death;
            case 23:
                return tt.date_added;

            default:
                return tt.bapt_place;
//            
            }
        }
    }
    // </editor-fold>

    private void data_by_name() {
//        String date = lb_date_baptism.getText();
        if (tf_search.getText().
                isEmpty()) {
            return;
        }
        int row = cb_search.getSelectedIndex();
        String name = tf_search.getText();
        String date_from = DateType.sf.format(dp_date_from.getDate());
        String date_to = DateType.sf.format(dp_date_to.getDate());
        String years = cb_years.getSelectedItem().
                toString();
        String book_no = tf_book_no.getText();
        String page_no = tf_page_no.getText();
        String num = tf_num.getText();
        if (row == 2) {
            loadData_baptism(S6_parishioners.ret_data_baptism_date(date_from, date_to, name));
        } else if (row == 3) {
            loadData_baptism(S6_parishioners.ret_data_baptism_archive(years, book_no, page_no, num, name));
        } else {
            loadData_baptism(S6_parishioners.ret_data(name));
        }


    }

    private void ok1() {

        int row = tbl_name.getSelectedRow();
        if (row < 0) {
            return;
        }
//           "Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "is_baptized", "is_comm", "is_confirm", "is_married", "is_2nd_married", "is_prof_faith", "is_acceptance", "is_death", "Date Added"

        String ref_id = tbl_name.getModel().
                getValueAt(row, 0).
                toString();
        String fname = tbl_name.getModel().
                getValueAt(row, 1).
                toString();
        String mi = tbl_name.getModel().
                getValueAt(row, 2).
                toString();
        String lname = tbl_name.getModel().
                getValueAt(row, 3).
                toString();
        String date_of_baptism = tbl_name.getModel().
                getValueAt(row, 5).
                toString();
        String date_of_birth = tbl_name.getModel().
                getValueAt(row, 6).
                toString();
        String place_of_birth = tbl_name.getModel().
                getValueAt(row, 7).
                toString();
        String address1 = tbl_name.getModel().
                getValueAt(row, 8).
                toString();
        String address2 = tbl_name.getModel().
                getValueAt(row, 9).
                toString();
        String city = tbl_name.getModel().
                getValueAt(row, 10).
                toString();
        String states = tbl_name.getModel().
                getValueAt(row, 11).
                toString();
        String zip_code = tbl_name.getModel().
                getValueAt(row, 12).
                toString();
        String father = tbl_name.getModel().
                getValueAt(row, 13).
                toString();
        String mother = tbl_name.getModel().
                getValueAt(row, 14).
                toString();
        String is_baptized = tbl_name.getModel().
                getValueAt(row, 15).
                toString();
        String is_comm = tbl_name.getModel().
                getValueAt(row, 16).
                toString();
        String is_confirm = tbl_name.getModel().
                getValueAt(row, 17).
                toString();
        String is_married = tbl_name.getModel().
                getValueAt(row, 18).
                toString();
        String is_2nd_married = tbl_name.getModel().
                getValueAt(row, 19).
                toString();
        String is_prof_faith = tbl_name.getModel().
                getValueAt(row, 20).
                toString();

        String is_acceptance = tbl_name.getModel().
                getValueAt(row, 21).
                toString();
        String is_death = tbl_name.getModel().
                getValueAt(row, 22).
                toString();
        String date_added = tbl_name.getModel().
                getValueAt(row, 23).
                toString();

        String gender = tbl_name.getModel().
                getValueAt(row, 4).
                toString();
//        String bapt_church = tbl_name.getModel().
//                getValueAt(row, 24).
//                toString();
        String bapt_church = "St. Catherine of Alexandria Parish";
        to_parishioners to = new to_parishioners(ref_id, fname, mi, lname, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_church, "", "", "", "", "", "", "", "", "");
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(to));
        }
    }
    int usr_type = 0;

    private void pm_tbl_users(MouseEvent evt) {
//        to_users.setUser_level1("1");
        if (to_users.user_level1 == null) {
            to_users.setUser_level1("1");
        }
        if (evt.isPopupTrigger()) {
            if (to_users.user_level1.equals("1")) {
                pm_scheduler.show(evt.getComponent(), evt.getX(), evt.getY());
            }
            if (to_users.user_level1.equals("2")) {
                pm_cashier.show(evt.getComponent(), evt.getX(), evt.getY());
            }

        }
    }

    private void do_pay() {
        int row = tbl_name.getSelectedRow();
        if (row < 0) {
            return;
        }
//           "Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "is_baptized", "is_comm", "is_confirm", "is_married", "is_2nd_married", "is_prof_faith", "is_acceptance", "is_death", "Date Added"

        String ref_id = tbl_name.getModel().
                getValueAt(row, 0).
                toString();
        String fname = tbl_name.getModel().
                getValueAt(row, 1).
                toString();
        String mi = tbl_name.getModel().
                getValueAt(row, 2).
                toString();
        String lname = tbl_name.getModel().
                getValueAt(row, 3).
                toString();


        String is_baptized = tbl_name.getModel().
                getValueAt(row, 15).
                toString();
        String is_comm = tbl_name.getModel().
                getValueAt(row, 16).
                toString();
        String is_confirm = tbl_name.getModel().
                getValueAt(row, 17).
                toString();
        String is_married = tbl_name.getModel().
                getValueAt(row, 18).
                toString();
        String is_2nd_married = tbl_name.getModel().
                getValueAt(row, 19).
                toString();
        String is_prof_faith = tbl_name.getModel().
                getValueAt(row, 20).
                toString();

        String is_acceptance = tbl_name.getModel().
                getValueAt(row, 21).
                toString();
        String is_death = tbl_name.getModel().
                getValueAt(row, 22).
                toString();

        Window p = (Window) this;
        Dlg_choose_payment nd = Dlg_choose_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass(is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death);
        nd.setCallback(new Dlg_choose_payment.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_choose_payment.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

    }

    private void do_approve() {
        int row = tbl_name.getSelectedRow();
        if (row < 0) {
            return;
        }
//           "Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "is_baptized", "is_comm", "is_confirm", "is_married", "is_2nd_married", "is_prof_faith", "is_acceptance", "is_death", "Date Added"

        final String ref_id = tbl_name.getModel().
                getValueAt(row, 0).
                toString();
        String fname = tbl_name.getModel().
                getValueAt(row, 1).
                toString();
        String mi = tbl_name.getModel().
                getValueAt(row, 2).
                toString();
        String lname = tbl_name.getModel().
                getValueAt(row, 3).
                toString();


        String is_baptized = tbl_name.getModel().
                getValueAt(row, 15).
                toString();
        String is_comm = tbl_name.getModel().
                getValueAt(row, 16).
                toString();
        String is_confirm = tbl_name.getModel().
                getValueAt(row, 17).
                toString();
        String is_married = tbl_name.getModel().
                getValueAt(row, 18).
                toString();
        String is_2nd_married = tbl_name.getModel().
                getValueAt(row, 19).
                toString();
        String is_prof_faith = tbl_name.getModel().
                getValueAt(row, 20).
                toString();

        String is_acceptance = tbl_name.getModel().
                getValueAt(row, 21).
                toString();
        String is_death = tbl_name.getModel().
                getValueAt(row, 22).
                toString();

        final String gender = tbl_name.getModel().
                getValueAt(row, 4).
                toString();
        Window p = (Window) this;
        Dlg_choose_approve nd = Dlg_choose_approve.create(p, true);
        nd.setTitle("");
        nd.do_pass(is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death);
        nd.setCallback(new Dlg_choose_approve.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_choose_approve.OutputData data) {
                closeDialog.ok();
                approve(data.sac, ref_id, gender);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

    }

    private void approve(List<String> sac, String ref_id, String gender) {
        S7_approval.do_approved(sac, ref_id, gender);
        JOptionPane.showMessageDialog(null, "Successfully Approved");
//        data_by_name();
    }

    private void do_confirm() {
        int row = tbl_name.getSelectedRow();
        if (row < 0) {
            return;
        }
//           "Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "is_baptized", "is_comm", "is_confirm", "is_married", "is_2nd_married", "is_prof_faith", "is_acceptance", "is_death", "Date Added"

        final String ref_id = tbl_name.getModel().
                getValueAt(row, 0).
                toString();
        String fname = tbl_name.getModel().
                getValueAt(row, 1).
                toString();
        String mi = tbl_name.getModel().
                getValueAt(row, 2).
                toString();
        String lname = tbl_name.getModel().
                getValueAt(row, 3).
                toString();

        String name = fname + " " + mi + " " + lname;

        String is_baptized = tbl_name.getModel().
                getValueAt(row, 15).
                toString();
        String is_comm = tbl_name.getModel().
                getValueAt(row, 16).
                toString();
        String is_confirm = tbl_name.getModel().
                getValueAt(row, 17).
                toString();
        String is_married = tbl_name.getModel().
                getValueAt(row, 18).
                toString();
        String is_2nd_married = tbl_name.getModel().
                getValueAt(row, 19).
                toString();
        String is_prof_faith = tbl_name.getModel().
                getValueAt(row, 20).
                toString();

        String is_acceptance = tbl_name.getModel().
                getValueAt(row, 21).
                toString();
        String is_death = tbl_name.getModel().
                getValueAt(row, 22).
                toString();

        final String gender = tbl_name.getModel().
                getValueAt(row, 4).
                toString();

        Window p = (Window) this;
        Dlg_choose_confirm_1 nd = Dlg_choose_confirm_1.create(p, true);
        nd.setTitle("");
        nd.do_pass(is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death);
        nd.setCallback(new Dlg_choose_confirm_1.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_choose_confirm_1.OutputData data) {
                closeDialog.ok();
                confirm(data.sac, ref_id, gender);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

    }

    private void confirm(List<String> sac, String ref_id, String gender) {

        S7_approval.do_confirm(sac, ref_id, gender);
        JOptionPane.showMessageDialog(null, "Successfully Confirm");
//        data_by_name();
    }

    private void do_payment() {
        int row = tbl_name.getSelectedRow();
        if (row < 0) {
            return;
        }
//           "Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "is_baptized", "is_comm", "is_confirm", "is_married", "is_2nd_married", "is_prof_faith", "is_acceptance", "is_death", "Date Added"

        final String ref_id = tbl_name.getModel().
                getValueAt(row, 0).
                toString();
        String fname = tbl_name.getModel().
                getValueAt(row, 1).
                toString();
        String mi = tbl_name.getModel().
                getValueAt(row, 2).
                toString();
        String lname = tbl_name.getModel().
                getValueAt(row, 3).
                toString();

        String name = fname + " " + mi + " " + lname;

        String is_baptized = tbl_name.getModel().
                getValueAt(row, 15).
                toString();
        String is_comm = tbl_name.getModel().
                getValueAt(row, 16).
                toString();
        String is_confirm = tbl_name.getModel().
                getValueAt(row, 17).
                toString();
        String is_married = tbl_name.getModel().
                getValueAt(row, 18).
                toString();
        String is_2nd_married = tbl_name.getModel().
                getValueAt(row, 19).
                toString();
        String is_prof_faith = tbl_name.getModel().
                getValueAt(row, 20).
                toString();

        String is_acceptance = tbl_name.getModel().
                getValueAt(row, 21).
                toString();
        String is_death = tbl_name.getModel().
                getValueAt(row, 22).
                toString();

        Window p = (Window) this;
        Dlg_choose_pay nd = Dlg_choose_pay.create(p, true);
        nd.setTitle("");
        nd.do_pass(is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, name, ref_id);
        nd.setCallback(new Dlg_choose_pay.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_choose_pay.OutputData data) {
                closeDialog.ok();
//                data_by_name();
//                confirm(data.sac, ref_id);
            }
        });

        Center.setCenter(nd);

        nd.setVisible(true);

    }

    private void do_print() {
        int row = tbl_name.getSelectedRow();
        if (row < 0) {
            return;
        }
//           "Ref #", "First Name", "Middle Name", "Last Name", "Gender", "Date of Baptism", "Date of Birth", "Place of Birth", "Address 1", "Address 2", "City", "State", "Zip Code", "Father", "Mother", "is_baptized", "is_comm", "is_confirm", "is_married", "is_2nd_married", "is_prof_faith", "is_acceptance", "is_death", "Date Added"

        final String ref_id = tbl_name.getModel().
                getValueAt(row, 0).
                toString();
        String fname = tbl_name.getModel().
                getValueAt(row, 1).
                toString();
        String mi = tbl_name.getModel().
                getValueAt(row, 2).
                toString();
        String lname = tbl_name.getModel().
                getValueAt(row, 3).
                toString();

        String name = fname + " " + mi + " " + lname;

        String is_baptized = tbl_name.getModel().
                getValueAt(row, 15).
                toString();
        String is_comm = tbl_name.getModel().
                getValueAt(row, 16).
                toString();
        String is_confirm = tbl_name.getModel().
                getValueAt(row, 17).
                toString();
        String is_married = tbl_name.getModel().
                getValueAt(row, 18).
                toString();
        String is_2nd_married = tbl_name.getModel().
                getValueAt(row, 19).
                toString();
        String is_prof_faith = tbl_name.getModel().
                getValueAt(row, 20).
                toString();

        String is_acceptance = tbl_name.getModel().
                getValueAt(row, 21).
                toString();
        String is_death = tbl_name.getModel().
                getValueAt(row, 22).
                toString();

        String gender = tbl_name.getModel().
                getValueAt(row, 4).
                toString();

        String b_date = tbl_name.getModel().
                getValueAt(row, 27).
                toString();
        String book_no = tbl_name.getModel().
                getValueAt(row, 27).
                toString();
//        JOptionPane.showMessageDialog(null, b_date);
        if (b_date.equalsIgnoreCase("NO DATA")) {
            JOptionPane.showMessageDialog(null, b_date);
            return;
        }
        do_certificate();
    }

    private void do_certificate() {
        int row = tbl_name.getSelectedRow();
        if (row < 0) {
            return;
        }

        final String gender = tbl_name.getModel().
                getValueAt(row, 4).
                toString();
        final String day = NumberToPower.set(DateType.d.format(new Date()));
        final String month = DateType.m.format(new Date());
        final String year = DateType.y.format(new Date());
        final String series_of = Series_of.series();
        final String ref_no = tbl_name.getModel().
                getValueAt(row, 0).
                toString();

        String fname = tbl_name.getModel().
                getValueAt(row, 1).
                toString();
        String mi = tbl_name.getModel().
                getValueAt(row, 2).
                toString();
        String lname = tbl_name.getModel().
                getValueAt(row, 3).
                toString();

        final String name = fname + " " + mi + " " + lname;


        Window p = (Window) this;
        Dlg_priest nd = Dlg_priest.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_priest.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_priest.OutputData data) {
                closeDialog.ok();


                if (cbx_marriage.isSelected()) {
                    do_exe_marriage(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_cert_matrimonys_2", gender);
                    add_reciept(name, "Cert_Matrimony", ref_no);
                }

                if (cbx_baptism.isSelected()) {
                    do_exe(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_baptisms_5_1");
                    add_reciept(name, "Cert_Baptism", ref_no);
                }
                if (cbx_conf.isSelected()) {
                    do_exe(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_confirmations_2");
                    add_reciept(name, "Cert_Confirmation", ref_no);
                }
                if (cbx_funeral.isSelected()) {
                    do_exe(ref_no, day, month, year, data.priest, data.asst_priest, series_of, "rpt_burials_2");
                    add_reciept(name, "Cert_Burial", ref_no);
                }


            }
        });
        Center.setCenter(nd);
        nd.setVisible(true);
    }

    private void do_exe(String ref_no, String day, String month, String year, String priest, String asst_priest, String series_of, final String template) {

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

    private void add_reciept(String parishioner, String type, String ref_no) {
        String or_no = "" + S1_mass_schedules.get_f_receipt_no();
        double amount = 100;
        String terminal_id = System.getProperty("terminal_id", "1");
        String user_id = "1";
        String user_name = "Ronald Pascua";
        S1_mass_schedules.add_receipt_certificate(or_no, parishioner, amount, type, ref_no, terminal_id, user_id, user_name);

//        JOptionPane.showMessageDialog(null, "adadad");

    }
}
