package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {

    private Connection con;
    private static DbManager dbManagerGetInstatce =null;


    private DbManager() throws SQLException{

        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "kodilla_user");
        connectionProperties.put("password", "kodilla_password");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" + "&useSSL=False" ,connectionProperties);

    }

    public static DbManager getInstance() throws SQLException{
        if(dbManagerGetInstatce == null){
            dbManagerGetInstatce = new DbManager();
        }
        return dbManagerGetInstatce;
    }

    public Connection getConnection() {
        return con;
    }
}
