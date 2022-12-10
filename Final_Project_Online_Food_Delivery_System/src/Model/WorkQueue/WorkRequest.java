/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Order.Order;
import Model.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author puppalanagavaishnavi
 */
public class WorkRequest {

    private String message; // "Order Placed"
    private UserAccount resAdmin;
    private UserAccount cusAcct;
    private UserAccount deliveryMan;
    private String status;
    private String requestTime;
    private String resolveTime;
    private String requestDate;
    Order orderRequest;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getResAdmin() {
        return resAdmin;
    }

    public UserAccount getCusAcct() {
        return cusAcct;
    }

    public UserAccount getDeliveryMan() {
        return deliveryMan;
    }

    public void setResAdmin(UserAccount resAdmin) {
        this.resAdmin = resAdmin;
    }

    public void setCusAcct(UserAccount cusAcct) {
        this.cusAcct = cusAcct;
    }

    public void setDeliveryMan(UserAccount deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getResolveTime() {
        return resolveTime;
    }

    public void setResolveTime(String resolveTime) {
        this.resolveTime = resolveTime;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public Order getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(Order orderRequest) {
        this.orderRequest = orderRequest;
    }
    
//    public WorkRequest updateWorkRequestMessage(WorkRequest workReq, String Message) {
//        orderRequest.get
//    }

    @Override
    public String toString() {
        return requestDate; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

}
