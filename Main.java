package com.company;

public class Main {

    public static void main(String[] args) {
        /*String jdbcURL = "jdbc:postgresql://localhost:5432/Restaurant"; // connecting to my Database Bank
        String username = "postgres"; // username
        String password = "postgres"; // password
        Connection connection = null; // connection
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password); // trying to connect
            String sql = "INSERT INTO Restaurant (restaurant_name, restaurant_address, restaurant_sits) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql); // connecting
            statement.setString(1, "Vista Restaurant & Bar"); // getting the name from the main
            statement.setString(2, "Dostyk,2"); // getting the address from the main
            statement.setInt(3, 300); // getting the accNum
            statement.execute(); // execute
        } catch (SQLException throwables) { // catching the exceptions
            throwables.printStackTrace();
        } finally {
            try {
                connection.close(); // closing the connection
            } catch (SQLException throwables) { // catching the exceptions
                throwables.printStackTrace();
            }
        }*/
        Database_interface sql_database_dara = new SQL_database_connection();
        Purchaser_commands baga = new Purchaser_order(sql_database_dara);
        Purchaser_possibilities show = new Purchaser_possibilities(baga);
        Run_ner runNer = new Run_ner(show);
        runNer.ready_go();

    }

}
