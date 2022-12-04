/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Orders;

import java.security.Timestamp;

/**
 *
 * @author SRADDHA
 */
public class Orders {
   private String Order_id;
    private Timestamp Order_Created_At;
    private String Restaurant_Name;
    private String Restaurant_street_address;
    private String Customer_name;
    private int Customer_phone_number;
    private String Customer_street_address;

    public String getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(String Order_id) {
        this.Order_id = Order_id;
    }

    public Timestamp getOrder_Created_At() {
        return Order_Created_At;
    }

    public void setOrder_Created_At(Timestamp Order_Created_At) {
        this.Order_Created_At = Order_Created_At;
    }

    public String getRestaurant_Name() {
        return Restaurant_Name;
    }

    public void setRestaurant_Name(String Restaurant_Name) {
        this.Restaurant_Name = Restaurant_Name;
    }

    public String getRestaurant_street_address() {
        return Restaurant_street_address;
    }

    public void setRestaurant_street_address(String Restaurant_street_address) {
        this.Restaurant_street_address = Restaurant_street_address;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String Customer_name) {
        this.Customer_name = Customer_name;
    }

    public int getCustomer_phone_number() {
        return Customer_phone_number;
    }

    public void setCustomer_phone_number(int Customer_phone_number) {
        this.Customer_phone_number = Customer_phone_number;
    }

    public String getCustomer_street_address() {
        return Customer_street_address;
    }

    public void setCustomer_street_address(String Customer_street_address) {
        this.Customer_street_address = Customer_street_address;
    }
    
    
}
