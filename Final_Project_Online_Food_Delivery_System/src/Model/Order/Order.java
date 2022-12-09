/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Order;

import Model.Customer.Customer;
import Model.Menu.Menu;
import Model.Menu.OrderMenuItem;
import Model.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author amretasrerengarajan
 */
public class Order {

    private int order_id;
    private String datePlaced;
    private String orderCreatedAt;
    private Customer cusDetails;
    private Restaurant resDetails;
    private ArrayList<Menu> menu;
    private float total;
//    private ArrayList<OrderMenuItem> orderHis;

    public Order() {
//        orderHis = new ArrayList<OrderMenuItem>();
        menu = new ArrayList<Menu>();
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getDatePlaced() {
        return datePlaced;
    }

    public void setDatePlaced(String datePlaced) {
        this.datePlaced = datePlaced;
    }

    public String getOrderCreatedAt() {
        return orderCreatedAt;
    }

    public void setOrderCreatedAt(String orderCreatedAt) {
        this.orderCreatedAt = orderCreatedAt;
    }
    
//    public Date getDatePlaced() {
//        return datePlaced;
//    }
//
//    public void setDatePlaced(Date datePlaced) {
//        this.datePlaced = datePlaced;
//    }
//
//    public Date getOrderCreatedAt() {
//        return orderCreatedAt;
//    }
//
//    public void setOrderCreatedAt(Date orderCreatedAt) {
//        this.orderCreatedAt = orderCreatedAt;
//    }

    public Customer getCusDetails() {
        return cusDetails;
    }

    public void setCusDetails(Customer cusDetails) {
        this.cusDetails = cusDetails;
    }

    public Restaurant getResDetails() {
        return resDetails;
    }

    public void setResDetails(Restaurant resDetails) {
        this.resDetails = resDetails;
    }

//    public ArrayList<OrderMenuItem> getOrderHis() {
//        return orderHis;
//    }
//
//    public void setOrderHis(ArrayList<OrderMenuItem> orderHis) {
//        this.orderHis = orderHis;
//    }
//    
//    public void addOrderItem(OrderMenuItem item) {
//        orderHis.add(item);
//    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }
    
    public void addMenu(Menu item) {
        menu.add(item);
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return datePlaced; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
