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

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String requestTime;
    private String resolveTime;
    private String requestDate;
    Order orderRequest;

//    public WorkRequest(){
//        requestTime = new Time();
//        resolveTime = new Time();
//        requestDate = new Date();
//    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
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

    
    
    

}
