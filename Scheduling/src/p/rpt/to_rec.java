/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.rpt;

/**
 *
 * @author Dummy
 */
public class to_rec {

    public final String date;
    public final String name;
    public final String words;
    public final String type;
    public final String mode;
    public final String amount;
    public final String or;
    public final String received_by;

    public to_rec(String date, String name, String words, String type, String mode, String amount, String or, String received_by) {
        this.date = date;
        this.name = name;
        this.words = words;
        this.type = type;
        this.mode = mode;
        this.amount = amount;
        this.or = or;
        this.received_by = received_by;
    }
}
