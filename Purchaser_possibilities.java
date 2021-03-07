package com.company;

public class Purchaser_possibilities {
    private final Purchaser_commands iooi;  // private final iooi variable

    public Purchaser_possibilities(Purchaser_commands iooi){ // constructor

        this.iooi = iooi;
    }
    public String order_check(String date){  // order_check method
        o_r_d_e_r_list order = iooi.date_checker(date);  // calling a date_checker
        return (order == null ? "Date is free!" : "Date is not free.Please,choose another date! "); // if result is null = Date is free, otherwise Date is not free and purchaser need to choose another date
    }
    public String order_add(int order_id,String order_date,int sits,int client_id){  // order_add method
        if(order_check(order_date) == "Date is free!") { // if order_check  == Date is free
            o_r_d_e_r_list order = new o_r_d_e_r_list(order_id, order_date, sits, client_id); // adding order
            boolean checker = iooi.addOrder(order); // checking for addOrder checker
            return (checker ? "Order was added.Please,run again and choose option 3 to check your price" : "Order was not added"); // The result
        }
        else
            return "Date is not free";  // The result
    }
    public String purchaser_add(int id, String name, String gender, String address, int age){ // purchaser_add method

        Purchaser purchaser = new Purchaser(id,name,gender,address,age);  // creating new Purchaser

        boolean checker = iooi.addClient(purchaser); // checker

        return (checker ? "Client was successfully added! Please,run again and choose option 4 to make a reservation.Good Luck!" : "Client was not added :("); // The result
    }
    public String order_delete(int order_id,String order_date,int sits,int client_id){ // order_delete method
        o_r_d_e_r_list order = new o_r_d_e_r_list(order_id, order_date, sits, client_id);   // creating new o_r_d_e_r_list

        boolean checker = iooi.deleteOrderClient(order); // checker

        return (checker ? "Client was successfully deleted!" : "Client was not deleted :("); // The result
    }
    public String purchaser_delete(int id, String name, String gender, String address, int age){ // purchaser_delete method
        Purchaser purchaser = new Purchaser(id,name,gender,address,age); // creating new Purchaser

        boolean checker = iooi.deleteClientInfo(purchaser); // checker

        return (checker ? "Client information was successfully deleted" : "Client information was not deleted");    // The result
    }
}
