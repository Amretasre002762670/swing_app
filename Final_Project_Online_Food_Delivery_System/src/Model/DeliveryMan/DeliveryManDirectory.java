/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DeliveryMan;

import Model.UserAccount.UserAccount;
import java.util.ArrayList;
import Model.Customer.Customer;
import Model.System.Ecosystem;
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
     public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(String name, UserAccount userAccount){
        DeliveryMan d = new DeliveryMan();
        d.setDeliveryManName(name);
        d.setUserAccount(userAccount);
        deliveryManList.add(d);  
        return d;
    }
    
    public void deleteDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManList.remove(deliveryMan);
    }
}

