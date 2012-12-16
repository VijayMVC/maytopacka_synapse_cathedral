/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.rpt.other_reports;

/**
 *
 * @author dummy
 */
public class path {

    public static void main(String[] args) {
        java.io.File file = new java.io.File("");
        String path = file.getAbsolutePath();
        System.out.println(path);
    }
}
