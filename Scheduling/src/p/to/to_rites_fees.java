/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.to;

/**
 *
 * @author Dummy
 */
public class to_rites_fees {
    
    public  String name;
    public  double rate;
    public  String type;
    public final String id;
    public boolean check;

    public to_rites_fees(String name, double rate, String type, String id,boolean check) {
        this.name = name;
        this.rate = rate;
        this.type = type;
        this.id = id;
        this.check=check;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    
    
   
    
    
}
