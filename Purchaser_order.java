package com.company;

import  java.sql.*;

public class Purchaser_order implements Purchaser_commands {
    private final Database_interface database;  // private final database variable

    public Purchaser_order(Database_interface database) {  // constructor
        this.database = database;
    }

    @Override
    public o_r_d_e_r_list date_checker(String order_date) {  // date_checker method
        Connection che = null;
        try {
            che = database.getConnection(); // connected to database
            String fafa = "SELECT order_date,order_id,order_sits,client_id FROM order_list WHERE order_date=?"; // query to insert data
            PreparedStatement dara = che.prepareStatement(fafa);  // prepared_statement
            dara.setString(1,order_date);   // setting String
            ResultSet baga = dara.executeQuery();       // executing Query
            if(baga.next()){  // if ResultSet is true
            o_r_d_e_r_list ss = new o_r_d_e_r_list(baga.getInt("order_id"),baga.getString("order_date"),baga.getInt("order_sits"),baga.getInt("client_id"));
            return  ss;  // returning the result
            }
        } catch (SQLException throwables) { // catching exceptions
            throwables.printStackTrace();
        } catch (ClassNotFoundException dara) { // catching exceptions
            dara.printStackTrace();
        } finally {
            try {
                che.close();      // close connection to database
            } catch (SQLException throwables) { // catching exceptions
                throwables.printStackTrace();
            }

        }
        return null;  // other wise return null
    }
   public boolean addClient(Purchaser client) { // addClient method
        Connection ohye = null;
        try{
            ohye = database.getConnection();  // connected to database
            String lala = "INSERT INTO Client(client_id,client_name,client_gender,client_address,client_age) VALUES(?,?,?,?,?)"; // query to insert data
            PreparedStatement dara = ohye.prepareStatement(lala);      // prepared_statement
            dara.setInt(1,client.getId());
            dara.setString(2,client.getName());
            dara.setString(3,client.getGender());
            dara.setString(4,client.getAddress());
            dara.setInt(5,client.getAge());
            dara.execute();     // execute
            return true;        // returning true
        }catch (SQLException throwables){   // catching exceptions
            throwables.printStackTrace();
        }catch (ClassNotFoundException dara){   // catching exceptions
            dara.printStackTrace();
        }finally {
            try{
                ohye.close();     // close connection to database
            }catch (SQLException throwables){   // catching exceptions
                throwables.printStackTrace();
            }
        }
        return false;  // otherwise returning false
    }
    public boolean deleteOrderClient(o_r_d_e_r_list order){     // deleteOrderClient method
        Connection beauty = null;
        try{
            beauty = database.getConnection();      // connected to database
            String qwqw = "DELETE FROM Order_list WHERE client_id = ?";  // query to delete data
            PreparedStatement baga =  beauty.prepareStatement(qwqw);        // prepared_statement
            baga.setInt(1, order.getPurchase_id());         // setting int
            baga.execute();     // execute
            return true;        // returning true
        }catch (SQLException throwables){       // catching exceptions
            throwables.printStackTrace();
        }catch (ClassNotFoundException dara){       // catching exceptions
            dara.printStackTrace();
        }finally {
            try{
                beauty.close(); // close connection to database
            }catch (SQLException throwables){       // catching exceptions
                throwables.printStackTrace();
            }
        }
        return false;       // otherwise returning false
    }

    @Override
    public boolean deleteClientInfo(Purchaser client) {
        Connection poi = null;
        try{
            poi = database.getConnection();      // connected to database
            String zxc = "DELETE FROM Client WHERE client_id = ?";     // query to delete data
            PreparedStatement baga =  poi.prepareStatement(zxc);        // prepared_statement
            baga.setInt(1, client.getId());     // setting int
            baga.execute();     // execute
            return true;         // returning true
        }catch (SQLException throwables){       // catching exceptions
            throwables.printStackTrace();
        }catch (ClassNotFoundException dara){   // catching exceptions
            dara.printStackTrace();
        }finally {
            try{
                poi.close();     // close connection to database
            }catch (SQLException throwables){   // catching exceptions
                throwables.printStackTrace();
            }
        }
        return false;       // otherwise returning false
    }

    public boolean addOrder(o_r_d_e_r_list order) {  // addOrder method
        Connection tyty = null;
        try{
            tyty = database.getConnection();      // connected to database
            String koko = "INSERT INTO Order_list (order_id,order_date,order_sits,client_id) VALUES(?,?,?,?)";       // query to insert data
            PreparedStatement dara = tyty.prepareStatement(koko);      // prepared_statement
            dara.setInt(1,order.getOrder_id());
            dara.setString(2,order.getDate());
            dara.setInt(3,order.getSits());
            dara.setInt(4,order.getPurchase_id());
            dara.execute();     // execute
            return true;        // returning true
        }catch (SQLException throwables){     // catching exceptions
            throwables.printStackTrace();
        }catch (ClassNotFoundException dara){     // catching exceptions
            dara.printStackTrace();
        }finally {
            try{
                tyty.close();         // close connection to database
            }catch (SQLException throwables){     // catching exceptions
                throwables.printStackTrace();
            }
        }
        return false;       // otherwise returning false
    }
    }

