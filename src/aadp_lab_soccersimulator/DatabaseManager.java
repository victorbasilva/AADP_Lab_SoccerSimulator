/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

/**
 *
 * @author Victor
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost/";
    private static final String USER = "football";
    private static final String PASS = "Java is almost as good as football";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void createSchema(String dbName) {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void useDatabase(String dbName) {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute("USE " + dbName + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable(String teamName) {
        String createTableQuery = String.format(
                "CREATE TABLE IF NOT EXISTS %s ("
                        + "name VARCHAR(30) NOT NULL,"
                        + "number INT NOT NULL PRIMARY KEY,"
                        + "birth VARCHAR(30),"
                        + "position VARCHAR(30),"
                        + "goalsScored INT,"
                        + "background TEXT(1000));", teamName);

        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(createTableQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertPlayer(String teamName, Player player) {
        String insertPlayerQuery = String.format(
                "INSERT INTO %s (name, number, birth, position, goalsScored, background) "
                        + "VALUES (\"%s\", %d, \"%s\", \"%s\", %d,  \"%s\") ;",
                teamName, player.getName(), player.getNumber(), player.getBirth(), player.getPosition(),
                player.getGoalsScored(), player.getBackground());

        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(insertPlayerQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add more methods as needed
}




