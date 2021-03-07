package com.company;

public class o_r_d_e_r_list {
    private int or_der_id;       // private variable integer or_der_id
    private String or_der_date; // private variable String order_date
    private int sits;          // private variable integer sits
    private int purchase_id;      // private variable integer purchase_id;

    public o_r_d_e_r_list(int order_id, String date, int sits, int purchase_id){ // constructor o_r_d_e_r_list
        this.or_der_id = order_id;
        this.or_der_date = date;
        this.sits = sits;
        this.purchase_id = purchase_id;
    }
    public String getDate() {       // getter getDate

        return or_der_date;
    }

    public int getSits() {          // getter getSits

        return sits;
    }

    public int getPurchase_id() {    // getter getPurchase_id

        return purchase_id;
    }

    public void setDate(String order_date) {        // setter setDate

        this.or_der_date = order_date;
    }

    public void setSits(int sits) {             // setter setDate

        this.sits = sits;
    }

    public void setPurchase_id(int purchase_id) {     // setter setPurchase_id

        this.purchase_id = purchase_id;
    }

    public int getOrder_id() {          //  getter getOrder_id

        return or_der_id;
    }

    public void setOrder_id(int order_id) {         // setter setOrder_id

        this.or_der_id = order_id;
    }

    @Override
    public String toString() {          // toString method
        return "o_r_d_e_r_list{" +
                "or_der_id=" + or_der_id +
                ", or_der_date='" + or_der_date + '\'' +
                ", sits=" + sits +
                ", purchase_id=" + purchase_id +
                '}';
    }
}
