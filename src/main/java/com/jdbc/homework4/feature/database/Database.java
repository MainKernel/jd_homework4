package com.jdbc.homework4.feature.database;

import com.jdbc.homework4.feature.prefs.Prefs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

public class Database {
    private static final Database INSTANCE = new Database();
    private Connection connection;

    private Database() {
        try {
            String connectionUrl = new Prefs().getString("dbUrl");
            connection = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        return INSTANCE;
    }

    public int executeUpdate(String s) {
        try (Statement st = connection.createStatement();) {
            return st.executeUpdate(s);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void updateService(String command){
        String populateDB = new Prefs().getString(command);
        try {
            String sql = String.join("\n", Files.readAllLines(Paths.get(populateDB)));
            int update = executeUpdate(sql);
            if(update == -1){
                throw new SQLException();
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String s) {
        try {
            Statement st = connection.createStatement();
            return st.executeQuery(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet queryService(String command){
        String query = new Prefs().getString(command);
        String sql = null;
        try {
            sql = String.join("\n", Files.readAllLines(Paths.get(query)));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return executeQuery(sql);
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnections() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
