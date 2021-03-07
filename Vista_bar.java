package com.company;

import java.sql.*;

public class Vista_bar {   // class Vista_bar
    private String na_me;        // private String name variable
    private String add_ress;     // private String address variable
    private int number_of_sits; // private int number_of_sits variable

    public Vista_bar() {   // default constructor
        na_me = "Vista Restaurant & Bar";
        add_ress = "Dostyk,2";
        number_of_sits = 300;
    }

    public  String getName() {  // getter getName
        return na_me;
    }

    public String getAddress() {  // getter getAddress
        return add_ress;
    }

    public long getNumber_of_sits() { // getter getNumber_of_sits
        return number_of_sits;
    }

    public void set_Name(String na_me) {  // setter set_Name
        this.na_me = na_me;
    }

    public void set_Address(String address) {  // setter set_Address
        this.add_ress = address;
    }

    public void set_Number_of_sits(int number_of_sits) {  // setter set_Number_of_sits
        this.number_of_sits = number_of_sits;
    }

    @Override
    public String toString() { // toString method
        return "Restaurant{" +
                "name='" + na_me + '\'' +
                ", address='" + add_ress + '\'' +
                ", number_of_sits=" + number_of_sits +
                '}';
    }
}
