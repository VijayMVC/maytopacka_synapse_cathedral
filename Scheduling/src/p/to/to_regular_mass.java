/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.to;

/**
 *
 * @author dummy
 */
public class to_regular_mass {
      public final String number;
    public  String time;
    public  String priest;
    public final String choir;

    public to_regular_mass(String number, String time, String priest, String choir) {
        this.number = number;
        this.time = time;
        this.priest = priest;
        this.choir = choir;
    }

    public String getPriest() {
        return priest;
    }

    public void setPriest(String priest) {
        this.priest = priest;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    

    @Override
    public String toString() {
        return "to_regular_mass{" + "number=" + number + ", time=" + time + ", priest=" + priest + ", choir=" + choir + '}';
    }

}
