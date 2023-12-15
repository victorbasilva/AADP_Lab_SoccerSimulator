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

    public static void createSchemaAndTables(String dbName, String[] teams) {
        Connection connection = null;
        try {
            connection = connect(dbName);

            createSchema(connection, dbName);
            useDatabase(connection, dbName);

            for (String team : teams) {
                createTable(connection, team);
            }
        } finally {
            closeConnection(connection);
        }
    }

    private static Connection connect(String dbName) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/";
            connection = DriverManager.getConnection(url, "football", "Java is almost as good as football");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static void createSchema(Connection connection, String dbName) {
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE SCHEMA IF NOT EXISTS " + dbName + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void useDatabase(Connection connection, String dbName) {
        try (Statement statement = connection.createStatement()) {
            statement.execute("USE " + dbName + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection, String team) {
        try (Statement statement = connection.createStatement()) {
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS " + team + " ("
                            + "name VARCHAR(30) NOT NULL,"
                            + "number INT NOT NULL PRIMARY KEY,"
                            + "birth VARCHAR(30),"
                            + "position VARCHAR(30),"
                            + "goalsScored INT,"
                            + "background TEXT(1000));"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
