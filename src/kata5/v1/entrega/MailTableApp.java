/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata5.v1.entrega;

/**
 *
 * @author aleja
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailTableApp {

    private static String database = "jdbc:sqlite:kata5P1.db";

    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(database);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public void insert(String mail) {
        String sql = "INSERT INTO direcc_email(Mail) VALUES(?)";
        try ( Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, mail);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}