/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexa
 */
public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/projects";
    public static final String USER = "root";
    public static final String PASS = "";

    public static Connection getConnection() {
        try {

            Class.forName(DRIVER);

            System.out.println("Conexão com o banco, realizada com sucesso!");

            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException | ClassNotFoundException ex) {

            throw new RuntimeException("Error na conexão com o banco de dados!" + ex.getMessage(), ex);

        }
    }

    public static void closeConnection(Connection con) {
        try {

            if (con != null) {
                con.close();
            }

            System.out.println("Conexão com o banco, encerrada com sucesso!");

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao fechar conexão com o banco!" + ex.getMessage(), ex);

        }
    }

    public static void closeConnection(Connection con, PreparedStatement statement) {
        try {

            if (con != null) {
                con.close();
            }

            if (statement != null) {
                statement.close();
            }

            System.out.println("Conexão com o banco, encerrada com sucesso!");

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao fechar conexão com o banco!" + ex.getMessage(), ex);

        }
    }

    public static void closeConnection(Connection con, PreparedStatement statement, ResultSet result) {
        try {

            if (con != null) {
                con.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (result != null) {
                result.close();
            }

            System.out.println("Conexão com o banco, encerrada com sucesso!");

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao fechar conexão com o banco!" + ex.getMessage(), ex);

        }
    }
}
