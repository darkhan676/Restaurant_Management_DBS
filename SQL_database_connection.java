package com.company;
import java.sql.*;
public class SQL_database_connection implements Database_interface {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String connectionWay = "jdbc:postgresql://localhost:5432/Restaurant"; // connecting to database Restaurant
        try{
        Class.forName("org.postgresql.Driver"); // Class.forName driver

        Connection con_nec_tion = DriverManager.getConnection(connectionWay, "postgres", "postgres"); // login and password

        return con_nec_tion;  // returning connection
        }catch (Exception d){       // catching exception
            System.out.println(d);
            return null;        // returning null
        }
    }
}
