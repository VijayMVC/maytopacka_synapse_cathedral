/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p.svc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import overallPOS.modules.share.utils.PoolConnection;

/**
 *
 * @author Dummy
 */
public class S4_ret_number {

    public static int ret_announcement_number() {

        int number = 0;


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(p.announcement_number) from db_bulletin.announcements p";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int ret_event_number() {

        int number = 0;


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(p.event_number) as num from db_bulletin.events p";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {

            PoolConnection.close();
        }
    }

    public static int ret_gallery_number() {
        int number = 0;

        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(p.gallery_number) as num from db_bulletin.gallery p";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int ret_projects_number() {

        int number = 0;


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(p.project_number) as num from db_bulletin.projects p";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int ret_donors_number() {

        int number = 0;


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(p.donor_number) from db_bulletin.donors p";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int ret_mass_schedule_number() {

        int number = 0;


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(p.mass_sched_number) from db_bulletin.mass_schedules p";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static int ret_marriage_number() {

        int number = 0;


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select max(p.marriage_number) from db_bulletin.marriage p";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                number = rs.getInt(1);

            }
            number++;
            return number;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static String ret_user_id(String user_name) {

        String name = "";


        try {
            Connection conn = PoolConnection.connect();
            String s0 = "select p.id from db_bulletin.users p where p.user_code='" + user_name + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                name = rs.getString(1);

            }

            return name;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            PoolConnection.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(ret_user_id("cashier"));
    }
}
