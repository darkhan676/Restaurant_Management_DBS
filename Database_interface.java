package com.company;
import java.sql.*;
public interface Database_interface {
    Connection getConnection() throws SQLException, ClassNotFoundException;
}
