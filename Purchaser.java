package com.company;
import java.util.*;
public class Purchaser { // class Purchaser
    private int id;      // private int id variable
    private String na_me;    // private String name variable
    private String gen_der;  // private String gender variable
    private String add_ress; // private String address variable
    private int a_g_e;         // private int age variable


    public Purchaser(int id, String na_me, String gen_der, String add_ress, int a_g_e){ // constructor
        this.id = id;
        this.na_me = na_me;
        this.gen_der = gen_der;
        this.add_ress = add_ress;
        this.a_g_e = a_g_e;

    }

    public int getId() {  // getter getId

        return id;
    }

    public String getName() {  // getter getName

        return na_me;
    }

    public String getGender() {     // getter getGender

        return gen_der;
    }

    public String getAddress() {        // getter getAddress

        return add_ress;
    }

    public int getAge() {           // getter getAge

        return a_g_e;
    }

    public void setId(int id) {   // setter setId

        this.id = id;
    }

    public void setName(String na_me) {     // setter setName

        this.na_me = na_me;
    }

    public void setGender(String gen_der) {     // setter setGender

        this.gen_der = gen_der;
    }

    public void setAddress(String add_ress) {       // setter setAdress

        this.add_ress = add_ress;
    }

    public void setAge(int a_g_e) {             // setter setAge

        this.a_g_e = a_g_e;
    }
    @Override
    public String toString() {          // toString method
        return "Purchaser{" +
                "id=" + id +
                ", name='" + na_me + '\'' +
                ", gender='" + gen_der + '\'' +
                ", address='" + add_ress + '\'' +
                ", age=" + a_g_e +
                '}';
    }
}
