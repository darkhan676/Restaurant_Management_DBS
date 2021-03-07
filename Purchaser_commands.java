package com.company;

public interface Purchaser_commands {       // Interface Purchaser_commands
    boolean addClient(Purchaser client);    // boolean addClient
    boolean deleteOrderClient(o_r_d_e_r_list order);    // boolean deleteOrderClient
    boolean deleteClientInfo(Purchaser client); // boolean deleteClientInfo
    o_r_d_e_r_list date_checker(String date);      //  o_r_d_e_r_list date_checker
    boolean addOrder(o_r_d_e_r_list order);     // boolean addOrder
}
