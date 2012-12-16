/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.pnl;

import bb.dlg.*;
import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import overallPOS.modules.share.utils.Application;
import overallPOS.modules.share.utils.Center;
import overallPOS.modules.share.utils.CloseDialog;
import overallPOS.modules.share.utils.FullScreen2;
import p.marriage.Dlg_marriage;
import p.mass.Dlg_mass;
import p.new_form.Dlg_cashiering1;
import p.new_form.Dlg_choose_pay;
import p.new_form.Dlg_main;
import bb.svc2.S3_insert_new_user;
import java.awt.*;
import overallPOS.modules.share.utils.*;
import p.mass.Dlg_mass2;
import p.new_form.Dlg_search_recepient2;
import p.to.to_users;
import p.util.Connected;
import p.util.Maximize;
import p.util.Wallpaper;
import rpt_main.Dlg_scheduler_report;

/**
 *
 * @author Dummy
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        myInit();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_holder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        lb_status = new javax.swing.JLabel();
        lb_s_name = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        pnl_holder.setOpaque(false);
        pnl_holder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("SCREEN NAME:");
        pnl_holder.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("DATE:");
        pnl_holder.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("STATUS:");
        pnl_holder.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, 20));

        jButton5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_mass1.png"))); // NOI18N
        jButton5.setText("INTENTIONS");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_mass2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 120));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_baptism1.png"))); // NOI18N
        jButton3.setText("SACRAMENTS");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_baptism2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 260, 120));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_announcement1.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_announcement2.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 260, 120));

        jButton7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_dev1.png"))); // NOI18N
        jButton7.setText("ACCOUNTS");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setEnabled(false);
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_dev2.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 260, 120));

        jButton11.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_ask1.png"))); // NOI18N
        jButton11.setText("REPORTS");
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_ask2.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 260, 110));

        jButton4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_profile1.png"))); // NOI18N
        jButton4.setText("CASHIERING");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_profile2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 260, 120));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_donors1.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusable(false);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_donors2.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 260, 110));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_matrimony.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusable(false);
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_matrimony2.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 260, 120));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_events1.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusable(false);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_events2.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 260, 120));

        jButton13.setText("STAND-BY");
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 240, 100));

        jButton14.setText("LOGOUT");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 240, 100));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb/img3/btn_confirmation1.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnl_holder.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 260, 110));

        lb_status.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_holder.add(lb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 146, 20));

        lb_s_name.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_s_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnl_holder.add(lb_s_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 256, 20));

        lb_date.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnl_holder.add(lb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 289, 20));

        getContentPane().add(pnl_holder);
        pnl_holder.setBounds(70, 30, 840, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        do_mass();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        do_matrimony();
//        do_marriage
        do_sacraments();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        do_confirmation();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        do_accounts();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
//        do_projects();
        do_reports();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        do_cashiering();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
//        do_profile();
        do_search();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
//        do_gallery();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
//        do_donors();
//        do_reports();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
//        do_ask_away();
        this.do_login();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
//        do_developers();
        logout();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
//        do_events();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Application.setSystemLookAndFeel();
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
//                new Dashboard().setVisible(true);
                Dashboard aw = new Dashboard();
                aw.start_timer();
                load_back(aw);
                aw.do_login();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_s_name;
    private javax.swing.JLabel lb_status;
    private javax.swing.JPanel pnl_holder;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        do_key();
        DateTime.setLabel(lb_date);
        setBounds();
    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void do_key() {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
    }

    private void do_accounts() {
        Window p = (Window) this;
        Dlg_user_registration nd = Dlg_user_registration.create(p, true);
        nd.setTitle("");
//        nd.do_pass();
        nd.setCallback(new Dlg_user_registration.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_user_registration.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private class MyDispatcher implements KeyEventDispatcher {

        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

                    disposed();
                }
            }

            if (e.getID() == KeyEvent.KEY_PRESSED) {
                if (e.getKeyCode() == KeyEvent.VK_F9) {
                }
            }
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                if (e.getKeyCode() == KeyEvent.VK_F8) {
                }
            }



            return false;
        }
    }

    // </editor-fold>
    private static void load_back(JFrame f) {


        JLabel l = new JLabel();
        String url = "/bb/img2/bakk1.png";
//        File fi = new File("/home/dummy/Documents/Scheduling/src/bbg");
        Wallpaper.do_set(url, f);
        FullScreen2.do_max_normal(f);
        f.setAlwaysOnTop(false);
//        JFrame f = new JFrame();
//        f.add(pnl);

//        String version = check_version();
//        JFrame f = Application.launchMainFrame(pnl, "Synapse Software Technologies - POS");
//        f.setUndecorated(true);
//        f.setVisible(true);
//        f.setAlwaysOnTop(false);
        f.setVisible(true);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);

//            do_check_date();

//        f.pack();
    }

    public void start_timer() {
        t.start();
    }
    Timer t = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            String conn = Connected.conn();
            if (conn.equals("no")) {
//                btn_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/img/on2.png")));
                lb_status.setText("Offline");
                lb_status.setForeground(Color.red);
                t.stop();
//                jj = 1;
                not_connected();
            } else {
                lb_status.setText("Online");
//                btn_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/img/on1.png")));
                lb_status.setForeground(Color.BLUE);
//                set_first_category();
//                updateReceipt();
            }
//            jj++;
        }
    });

    private void not_connected() {
        Window p = (Window) this;
        Dlg_warning nd = Dlg_warning.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_warning.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_warning.OutputData data) {
                closeDialog.ok();
                t.start();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void setBounds() {
//       Toolkit tk = Toolkit.getDefaultToolkit();
//        int xSize = ((int) tk.getScreenSize().getWidth());
//        int ySize = ((int) tk.getScreenSize().getHeight());
//        System.out.println(xSize + " " + ySize);
        Center.setCenter(pnl_holder);
//        this.pack();
    }

    public void do_login() {
        Window p = (Window) this;
        dlg_log_in nd = dlg_log_in.create(p, true);
        nd.setTitle("");
//        nd.do_pass();
        nd.setCallback(new dlg_log_in.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, dlg_log_in.Data data) {
                closeDialog.ok();
                set_user(data.username, data.acct_type);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
    int lvl = 0;

    private void set_user(String user_name, String acct_type) {
        String name = S3_insert_new_user.get_name(user_name);
        lb_s_name.setText(name);
        to_users.setUser_level1(acct_type);

        to_users.setUsername1(name);
        if (acct_type.equals("0")) {
            lvl = 0;
            jButton7.setEnabled(true);
//            JOptionPane.showMessageDialog(null, "ADMIN");
        }
        if (acct_type.equals("1")) {
            lvl = 1;
            jButton4.setText("SCHEDULING");
            to_users.setUser_level1("1");
//             JOptionPane.showMessageDialog(null, "SCHEDULER");
//            Window p = (Window) this;
//            Dlg_scheduler_report nd = Dlg_scheduler_report.create(p, true);
//            nd.setTitle("");
//            nd.do_pass();
//            nd.setCallback(new Dlg_scheduler_report.Callback() {
//
//                @Override
//                public void ok(CloseDialog closeDialog, Dlg_scheduler_report.OutputData data) {
//                    closeDialog.ok();
//                }
//            });
//            Center.setCenter(nd);
//
//            nd.setVisible(true);
        }
        if (acct_type.equals("2")) {
            lvl = 2;
//            do_cashiering();
            to_users.setUser_level1("2");
//             JOptionPane.showMessageDialog(null, "CASHIER");
        }
        if (acct_type.equals("3")) {
            lvl = 3;
            to_users.setUser_level1("3");
//             JOptionPane.showMessageDialog(null, "ENCODER");
        }

    }

    private void do_cashier() {
        Window p = (Window) this;
        Dlg_choose_pay nd = Dlg_choose_pay.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_choose_pay.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_choose_pay.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_mass() {
        if (to_users.user_level1 == null || to_users.user_level1.equals("2")) {
            Window p = (Window) this;
            Dlg_mass2 nd = Dlg_mass2.create(p, true);
            nd.setTitle("");
//        nd.do_pass("");
            nd.setCallback(new Dlg_mass2.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_mass2.OutputData data) {
                    closeDialog.ok();
                }
            });
            Maximize.set(nd);
        }

    }

    private void do_mass_time() {
        Window p = (Window) this;
        Dlg_mass nd = Dlg_mass.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new Dlg_mass.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mass.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void logout() {
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                System.exit(1);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_marriage() {
        Window p = (Window) this;
        Dlg_marriage nd = Dlg_marriage.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_marriage.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_marriage.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_cashiering() {
        if (to_users.user_level1.equals("2")) {
            Window p = (Window) this;
            Dlg_cashiering1 nd = Dlg_cashiering1.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_cashiering1.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_cashiering1.OutputData data) {
                    closeDialog.ok();
                }
            });
            Center.setCenter(nd);

            nd.setVisible(true);
        }
        if (to_users.user_level1.equals("1")) {
            Window p = (Window) this;
            Dlg_scheduling nd = Dlg_scheduling.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_scheduling.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_scheduling.OutputData data) {
                    closeDialog.ok();
                }
            });
            Center.setCenter(nd);

            nd.setVisible(true);
        }


    }

    private void do_confirmation() {
        Window p = (Window) this;
        Dlg_officials nd = Dlg_officials.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_officials.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_officials.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void do_scheduling() {
//        Window p = (Window) this;
//        Dlg_funeral nd = Dlg_funeral.create(p, true);
//        nd.setTitle("");
//        nd.do_pass();
//        nd.setCallback(new Dlg_funeral.Callback() {
//
//            @Override
//            public void ok(CloseDialog closeDialog, Dlg_funeral.OutputData data) {
//                closeDialog.ok();
//            }
//        });
//        Center.setCenter(nd);
//
//        nd.setVisible(true);
    }

    private void do_reports() {
        //
        if (lvl == 0) {
        }
        if (lvl == 1) {
            Window p = (Window) this;
            Dlg_scheduler_report nd = Dlg_scheduler_report.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_scheduler_report.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_scheduler_report.OutputData data) {
                    closeDialog.ok();
                }
            });
            Center.setCenter(nd);

            nd.setVisible(true);
        }
        if (lvl == 2) {
            Window p = (Window) this;
            Dlg_cashiering1 nd = Dlg_cashiering1.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_cashiering1.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_cashiering1.OutputData data) {
                    closeDialog.ok();
                }
            });
            Center.setCenter(nd);

            nd.setVisible(true);
        }
        if (lvl == 3) {
        }
    }

    private void do_sacraments() {
        Window p = (Window) this;
        Dlg_main nd = Dlg_main.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_main.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_main.OutputData data) {
                closeDialog.ok();
            }
        });

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());

        Center.setCenter(nd);
        nd.setVisible(true);
//        nd.setSize(xSize, ySize);
    }

    private void do_search() {
        Window p = (Window) this;
        Dlg_search_recepient2 nd = Dlg_search_recepient2.create(p, true);
        nd.setTitle("");
        nd.do_pass("", "");
        nd.setCallback(new Dlg_search_recepient2.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_search_recepient2.OutputData data) {
                closeDialog.ok();
            }
        });

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());

        nd.setVisible(true);
        nd.setSize(xSize, ySize);
//        Center.setCenter(nd);

    }
}
