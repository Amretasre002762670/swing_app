/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DeliveryMan;

import Model.UserAccount.UserAccount;
import java.util.ArrayList;
import Model.System.Ecosystem;
import Model.WorkQueue.WorkQueue;
import Model.WorkQueue.WorkRequest;

/**
 *
 * @author puppalanagavaishnavi
 */
public class DeliveryManDirectory {

    Ecosystem ecosystem;
    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory(Ecosystem ecosystem) {
        this.ecosystem = ecosystem;
        deliveryManList = new ArrayList<DeliveryMan>();
    }
    
    public DeliveryManDirectory() {
        deliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public void addDeliveryMan(DeliveryMan addDelMan) {
        deliveryManList.add(addDelMan);
    }

    public DeliveryMan addDeliveryManWithUserAcct(UserAccount user) {
        DeliveryMan delMan = new DeliveryMan(user);
        deliveryManList.add(delMan);
        return delMan;
    }

//public Customer addCustomer(UserAccount user) {
//        Customer newCustomer = new Customer(user);
//        customerList.add(newCustomer);
//        return newCustomer;
//    }
    public DeliveryMan createDeliveryMan(String name, UserAccount userAccount) {
        DeliveryMan d = new DeliveryMan(userAccount);
        d.setDeliveryManName(name);
        d.setUserAccount(userAccount);
        deliveryManList.add(d);
        return d;
    }

    public void deleteDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManList.remove(deliveryMan);
    }

    public DeliveryMan findDeliveryManDetails(UserAccount user) {
        
        DeliveryMan deliveryManDetails = new DeliveryMan();

        for (DeliveryMan delMan : deliveryManList) {
            if (delMan.getUserAccount().getUsername().equals(user.getUsername())) {
                deliveryManDetails = delMan;
                break;
            }
        }
        return deliveryManDetails;
    }
   
}
