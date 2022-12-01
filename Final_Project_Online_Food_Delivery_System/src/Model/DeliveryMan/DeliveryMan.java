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
    private String community;

    public DeliveryMan(String deliveryManName, UserAccount userAccount, String community) {
        this.userAccount = userAccount;
        this.deliveryManName = this.userAccount.getUsername();
        this.community = community;
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

}
