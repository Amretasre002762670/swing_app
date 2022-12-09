/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Order;

import java.util.ArrayList;

/**
 *
 * @author amretasrerengarajan
 */
public class OrderList {
    private ArrayList<Order> orderList;

    public OrderList() {
        this.orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order addOrder(Order newOrder) {
        orderList.add(newOrder);
        return newOrder;
    }
    
    
}
