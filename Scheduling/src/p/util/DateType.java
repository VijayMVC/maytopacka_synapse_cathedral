/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dummy
 */
public class DateType {

    public static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    public static SimpleDateFormat sf1 = new SimpleDateFormat("EEE, MMM dd,yyyy");
    public static SimpleDateFormat d = new SimpleDateFormat("dd");
    public static SimpleDateFormat m = new SimpleDateFormat("MMMMMMMMMMM");
    public static SimpleDateFormat y = new SimpleDateFormat("yyyy");
    public static SimpleDateFormat m1 = new SimpleDateFormat("MM");
    public static SimpleDateFormat str = new SimpleDateFormat("MMMMMMMMMMM dd,yyyy (EEEEEEEE)");

    public static void main(String[] args) {
        String a = "September 03,2011 (MONDAY)";
        Date d = new Date();
        try {
            d = str.parse(a);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(d);
    }
}
