/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.main;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import overallPOS.modules.share.utils.*;
import p.pnl.Dashboard;
import p.util.Wallpaper;

/**
 *
 * @author u2
 */
public class Main {

    private void start() {
        Dashboard aw = new Dashboard();
//        FullScreen.do_max_normal(aw);
        aw.setAlwaysOnTop(false);

        JLabel l = new JLabel();
        String url = "/bb/img2/bakk1.png";
//        File fi = new File("/home/dummy/Documents/Scheduling/src/bbg");
        Wallpaper.do_set(url, aw);
        FullScreen2.do_max_normal(aw);
        aw.start_timer();
        aw.do_login();

    }

    public static void main(String[] args) {

        Window p = (Window) new JFrame();
        loading nd = loading.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new loading.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, loading.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);

        try {

            String conf = (args.length > 0 ? args[0] : null);
            Properties prop = new Properties();

            String userHome = System.getProperty("user.home");
            System.out.println(userHome);
            conf = (conf == null ? "smis.conf" : conf);
            System.out.println(conf);
            File file = new File(userHome + "/" + conf);
            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                prop.load(is);
            } else {
                file = new File(conf);
                if (file.exists()) {
                    InputStream is = new FileInputStream(file);
                    prop.load(is);
                }
            }


            System.setProperty("do_print", prop.getProperty("do_print", "false"));
            System.out.println(System.getProperty("do_print") + "asdad");
            System.setProperty("entityName", prop.getProperty("entityName", "Intelink-One"));
//            JOptionPane.showMessageDialog(null, System.getProperty("entityName"));
            System.setProperty("pdf.reader.loc", prop.getProperty("pdf.reader.loc", "AcroRd32.exe"));
            System.setProperty("instanceSocket", prop.getProperty("instanceSocket", "800"));

//            System.setProperty("pool_host", prop.getProperty("local_conn", "localhost"));
//           
//            System.setProperty("pool_user", prop.getProperty("local_user", "root"));
//            System.setProperty("pool_password", prop.getProperty("local_pass", "password"));

            System.setProperty("HOST_CONN_PYOP_SEND", prop.getProperty("server_conn", "localhost"));
            System.setProperty("HOST_PARAM_PYOP_SEND", prop.getProperty("server_param", "?user=root&password=password"));

            System.setProperty("pool_host", prop.getProperty("pool_host", "localhost"));
            System.out.println(System.getProperty("pool_host"));
            System.setProperty("app_all", prop.getProperty("app_all", "false"));
            System.setProperty("pool_user", prop.getProperty("pool_user", "root"));
            System.setProperty("pool_password", prop.getProperty("pool_password", "password"));
            System.out.println(prop.getProperty("pool_host", "localhost"));

            System.setProperty("cashiering_for", prop.getProperty("cashiering_for", "coop"));
            System.setProperty("path", prop.getProperty("path", "C:\\Users\\Dummy\\images\\"));
            System.out.println(prop.getProperty("cashiering_for", "localhost"));
             System.setProperty("terminal_id", prop.getProperty("terminal_id", "1"));

            System.setProperty("license", prop.getProperty("license", ""));

            System.setProperty("terminal", prop.getProperty("terminal", "T1"));
             System.setProperty("do_print_receipt", prop.getProperty("do_print_receipt", "0"));

            System.setProperty("receipt_printer_disabled", prop.getProperty("receipt_printer_disabled", "true"));
            System.setProperty("receipt_printer_show_dialog", prop.getProperty("receipt_printer_show_dialog", "false"));
            System.setProperty("receipt_printer", prop.getProperty("receipt_printer", ""));
            System.setProperty("report_printer_show_dialog", prop.getProperty("report_printer_show_dialog", "false"));
            System.setProperty("report_printer", prop.getProperty("report_printer", ""));

            System.setProperty("stock_lenient", prop.getProperty("stock_lenient", "false"));


            Lg.$.severe(System.getProperty("receipt_printer"));



        } catch (Exception ex) {
            Lg.$.severe(ex.getMessage());
            throw new RuntimeException(ex);


        }

        new Main().start();
    }

    public void aw() {
    }
}
