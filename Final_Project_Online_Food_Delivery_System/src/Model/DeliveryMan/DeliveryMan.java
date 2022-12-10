/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DeliveryMan;

import Model.UserAccount.UserAccount;

/**
 *
 * @author puppalanagavaishnavi
 */
public class DeliveryMan {
    
    private int deliveryManId;
    private String deliveryManName;
    private UserAccount userAccount;
    private long deliveryManNumber;
    private String community;
    private long zipcodeCovered;

    public DeliveryMan(String deliveryManName, UserAccount userAccount, String community) {
        this.userAccount = userAccount;
        this.deliveryManName = this.userAccount.getUsername();
        this.community = community;
    }
    
    public DeliveryMan(UserAccount userAcct) {
        userAccount = userAcct;
    }

    public DeliveryMan() {
        userAccount = new UserAccount();
    }

    public int getDeliveryManId() {
        return deliveryManId;
    }

    public void setDeliveryManId(int deliveryManId) {
        this.deliveryManId = deliveryManId;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public long getDeliveryManNumber() {
        return deliveryManNumber;
    }

    public void setDeliveryManNumber(long deliveryManNumber) {
        this.deliveryManNumber = deliveryManNumber;
    }

    public long getZipcodeCovered() {
        return zipcodeCovered;
    }

    public void setZipcodeCovered(long zipcodeCovered) {
        this.zipcodeCovered = zipcodeCovered;
    }
    
    
  @Override
    public String toString(){
        return deliveryManName;
    }
}
