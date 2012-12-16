/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.cashier;

import bb.dlg.Dlg_intention_rates;
import bb.dlg.Dlg_quantity1;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import overallPOS.modules.share.utils.*;
import overallPOS.modules.share.utils.KeyMapping.KeyAction;
import p.rpt.Reference_number;
import p.svc.S1_mass_schedules;
import p.svc.S1_mass_schedules.to_payment;
import p.svc.S6_rates;
import p.to.to_rites_fees;
import p.util.DateType;

/**
 *
 * @author i1
 */
public class Dlg_payment_intentions extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_view_intention_records
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
    private Dlg_payment_intentions(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_payment_intentions(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_payment_intentions() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_payment_intentions myRef;

    private void setThisRef(Dlg_payment_intentions myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_payment_intentions> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_payment_intentions create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_payment_intentions create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_payment_intentions dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_payment_intentions((java.awt.Frame) parent, false);
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
            Dlg_payment_intentions dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_payment_intentions((java.awt.Dialog) parent, false);
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


        Dlg_payment_intentions dialog = Dlg_payment_intentions.create(new javax.swing.JFrame(), true);
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

        pm_pop = new javax.swing.JPopupMenu();
        edit = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        pm_pay = new javax.swing.JPopupMenu();
        pay = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_records = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cb_types = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tf_ref = new javax.swing.JTextField();
        lb_total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_tg = new javax.swing.JLabel();
        lb_c = new javax.swing.JLabel();
        lb_petition = new javax.swing.JLabel();
        lb_r = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        edit.setText("EDIT");
        pm_pop.add(edit);

        delete.setText("DELETE");
        pm_pop.add(delete);

        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        pm_pay.add(pay);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        tbl_records.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_recordsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_recordsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_recordsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_records);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(18, 212, 1040, 490);

        jLabel2.setText("REQUIEM:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(860, 90, 90, 18);

        cb_types.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thanks Giving", "Common", "Petition Mass", "Requiem Mass" }));
        cb_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_typesActionPerformed(evt);
            }
        });
        jPanel1.add(cb_types);
        cb_types.setBounds(160, 60, 353, 28);

        jLabel3.setText("REFERENCE #:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(19, 110, 140, 18);

        tf_ref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_refKeyReleased(evt);
            }
        });
        jPanel1.add(tf_ref);
        tf_ref.setBounds(160, 110, 353, 30);

        lb_total.setBackground(new java.awt.Color(0, 0, 0));
        lb_total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_total.setForeground(new java.awt.Color(0, 255, 0));
        lb_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_total.setText("0.00");
        lb_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_total.setOpaque(true);
        jPanel1.add(lb_total);
        lb_total.setBounds(800, 170, 255, 27);

        jLabel1.setText("TOTAL:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(710, 170, 73, 27);

        jLabel5.setText("TYPE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(21, 70, 70, 18);

        jLabel6.setText("THANKS GIVING:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(580, 50, 140, 18);

        jLabel7.setText("COMMON:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(580, 90, 120, 18);

        jLabel8.setText("PETITION:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(860, 50, 90, 18);

        lb_tg.setForeground(new java.awt.Color(51, 153, 255));
        lb_tg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tg.setText("0.00");
        lb_tg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb_tg);
        lb_tg.setBounds(720, 40, 80, 30);

        lb_c.setForeground(new java.awt.Color(51, 153, 255));
        lb_c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_c.setText("0.00");
        lb_c.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb_c);
        lb_c.setBounds(720, 80, 80, 30);

        lb_petition.setForeground(new java.awt.Color(51, 153, 255));
        lb_petition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_petition.setText("0.00");
        lb_petition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb_petition);
        lb_petition.setBounds(950, 40, 80, 30);

        lb_r.setForeground(new java.awt.Color(51, 153, 255));
        lb_r.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_r.setText("0.00");
        lb_r.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb_r);
        lb_r.setBounds(950, 80, 80, 30);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(980, 120, 50, 28);

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHARGES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Charter", 1, 14))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(558, 19, 500, 140);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_typesActionPerformed
        // TODO add your handling code here:
        data_records();
    }//GEN-LAST:event_cb_typesActionPerformed

    private void tf_refKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_refKeyReleased
        // TODO add your handling code here:
        data_records();
    }//GEN-LAST:event_tf_refKeyReleased

    private void tbl_recordsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_recordsMousePressed
        // TODO add your handling code here:
        pm_pay(evt);
    }//GEN-LAST:event_tbl_recordsMousePressed

    private void tbl_recordsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_recordsMouseReleased
        // TODO add your handling code here:
        pm_pay(evt);
    }//GEN-LAST:event_tbl_recordsMouseReleased

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
        do_pay();
    }//GEN-LAST:event_payActionPerformed

    private void tbl_recordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_recordsMouseClicked
        // TODO add your handling code here:
        do_compute();
    }//GEN-LAST:event_tbl_recordsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        do_rates();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_types;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_c;
    private javax.swing.JLabel lb_petition;
    private javax.swing.JLabel lb_r;
    private javax.swing.JLabel lb_tg;
    private javax.swing.JLabel lb_total;
    private javax.swing.JMenuItem pay;
    private javax.swing.JPopupMenu pm_pay;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTable tbl_records;
    private javax.swing.JTextField tf_ref;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        do_set_rates();
        cb_init();
        init_tbl_intention_records();
        data_records();
    }

    private void do_set_rates() {
        lb_c.setText("" + FitIn.fmt_wc(S6_rates.get_intention_rate("Common")));
        lb_petition.setText("" + FitIn.fmt_wc(S6_rates.get_intention_rate("Petition Mass")));
        lb_r.setText("" + FitIn.fmt_wc(S6_rates.get_intention_rate("Requiem Mass")));
        lb_tg.setText("" + FitIn.fmt_wc(S6_rates.get_intention_rate("Thanks Giving")));


    }

    private void cb_init() {
//        S3_cb_convenience.cb_init(cb_time, S3_cb_convenience.s_time);
//
//
//        AutoCompleteDecorator.decorate(cb_time);
    }

//    String dates="";
    public void do_pass(String date) {
//        dates=date;
        data_records();
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

    private void init_tbl_intention_records() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_records.setModel(tbl_employee_payroll_M);
        tbl_records.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_records.setRowHeight(25);

//        tbl_records.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 0, 0, 200, 100, 0, 100};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_records, i, tbl_widths_accounts[i]);
//          TableWidthUtilities.
//          TableWidthUtilities.
        }

        tbl_records.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        tbl_records.setRowHeight(35);
        tbl_records.setFont(new java.awt.Font("Arial", 1, 10));
    }

    private void loadData_baptism(List<S1_mass_schedules.to_intention_records> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Reference No.", "date", "time", "PARISHIONER", "CONTACT #", "mass_type", "MESSAGE"
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
            S1_mass_schedules.to_intention_records tt = (S1_mass_schedules.to_intention_records) getRow(row);

            switch (col) {
                case 0:
                    return tt.ref_num;
                case 1:
                    return tt.date;
                case 2:
                    return tt.time;
                case 3:
                    return tt.name;
                case 4:
                    return tt.contact;
                case 5:
                    return tt.mass_type;

                default:
                    return tt.mass_type;
            }
        }
    }

    private void data_records() {
//        String date = lb_date_baptism.getText();
        String ref = tf_ref.getText();
        String type = cb_types.getSelectedItem().toString();
        loadData_baptism(S1_mass_schedules.ret_intentions_payment(ref, type));
    }

    private void pm_pay(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_pay.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void do_pay() {
        int[] idx = tbl_records.getSelectedRows();
//        JOptionPane.showMessageDialog(null, idx);
        if (idx.length <= 0) {
            return;
        }


        final List<S1_mass_schedules.to_payment> datas = new ArrayList();
        final List<String> payor = new ArrayList();
        final List<String> amount = new ArrayList();
//          "Reference No.", "date", "time", "PARISHIONER", "CONTACT #", "mass_type", "MESSAGE"
        double charges = 0;
        for (int ix : idx) {
            String ref_num = tbl_records.getModel().getValueAt(ix, 0).toString();
            String type = tbl_records.getModel().getValueAt(ix, 5).toString();
            String name = tbl_records.getModel().getValueAt(ix, 3).toString();
            double amounts = S6_rates.get_intention_rate(type);
            String date = DateType.datetime.format(new Date());

            String payment_type = "Cash";
            charges += S6_rates.get_intention_rate(type);

            S1_mass_schedules.to_payment to = new S1_mass_schedules.to_payment("", ref_num, amounts, type, date, payment_type, name);
            datas.add(to);

//            ref_no.add(tbl_records.getModel().getValueAt(ix, 0).toString());
//            System.out.println(tbl_charges.getModel().getValueAt(ix, 1).toString());
        }

        System.out.println(charges);

        int row = tbl_records.getSelectedRow();
        final String name = tbl_records.getModel().getValueAt(row, 3).toString();
        final String types = tbl_records.getModel().getValueAt(row, 5).toString();


        Window p = (Window) this;
        Dlg_quantity1 nd = Dlg_quantity1.create(p, true);
        nd.setTitle("");
        nd.do_pass(charges);
        nd.setCallback(new Dlg_quantity1.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_quantity1.OutputData data) {
                closeDialog.ok();
                pay(datas, data.or_no, name);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void pay(List<to_payment> datas, String or_no, String name) {
//        for (S1_mass_schedules.to_payment aw : datas) {
//              S1_mass_schedules.pay(or_no,aw.reference_number,aw.amount,aw.or_type,aw.date_added,aw.payment_type,aw);
//            String num = tbl_charges.getModel().getValueAt(row, 1).toString();
        S1_mass_schedules.pay(or_no, datas);
//        }

        SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd,yyyy");
        String date = sf.format(new Date());

        double amount = 0;
//        for (to_rites_fees tt : t) {
//            amount += tt.rate;
//        }
        String words = DigitToWord.convertToWordsIn(amount);
        String am = FitIn.fmt_wc_0(amount);

//        Reference_number.to_receipt to = new Reference_number.to_receipt(date, name, words, "INTENTIONS", "CASH", am, or_no, or_no);
//        String do_print = System.getProperty("do_print");
//        JOptionPane.showMessageDialog(null, do_print);
//        if (do_print.equals("true")) {
//            Reference_number.print_receipt(to);
//        }

        JOptionPane.showMessageDialog(null, "Payed");
        data_records();
        lb_total.setText("0.00");
    }

    private void do_compute() {
//          "Reference No.", "date", "time", "PARISHIONER", "CONTACT #", "mass_type", "MESSAGE"
        int[] idx = tbl_records.getSelectedRows();
//        JOptionPane.showMessageDialog(null, idx);
        if (idx.length <= 0) {
            lb_total.setText("0.00");
            return;
        }


        final List<String> rem = new ArrayList();
        double charges = 0;
        for (int ix : idx) {
            String type = tbl_records.getModel().getValueAt(ix, 5).toString();

            charges += S6_rates.get_intention_rate(type);

            rem.add(tbl_records.getModel().getValueAt(ix, 1).toString());
//            System.out.println(tbl_charges.getModel().getValueAt(ix, 1).toString());
        }
        lb_total.setText(FitIn.fmt_wc_0(charges));
    }

    private void do_rates() {
        Window p = (Window) this;
        Dlg_intention_rates nd = Dlg_intention_rates.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_intention_rates.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_intention_rates.OutputData data) {
//                closeDialog.ok();
                do_set_rates();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }
}
