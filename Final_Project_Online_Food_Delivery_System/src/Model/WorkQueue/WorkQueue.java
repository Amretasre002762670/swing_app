/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class WorkQueue {
     private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public void addWorkRequest(WorkRequest workRequest) {
        workRequestList.add(workRequest);
    }
    
    public WorkRequest findWorkrequestForCustomer(Customer cusDetails) {
       WorkRequest searchResult = new WorkRequest();
       for(WorkRequest workReq: workRequestList) {
           if(workReq.getSender().getUsername().equals(cusDetails.getCustName())) {
               searchResult = workReq;
               break;
           }
       }
       return searchResult;
    }
}
