/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.RestaurantAdmin;

import Model.Restaurant.Restaurant;
import Model.UserAccount.UserAccount;

/**
 *
 * @author amretasrerengarajan
 */
public class RestaurantAdmin {
    
    private UserAccount accountDetails;
    private int resAdminId;
    private String resName;
//    private Restaurant restaurantDetails;

    public RestaurantAdmin(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
//        this.restaurantDetails = new Restaurant(this);
    }

    public UserAccount getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
    }

    public int getResAdminId() {
        return resAdminId;
    }

    public void setResAdminId(int resAdminId) {
        this.resAdminId = resAdminId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

//    public Restaurant getRestaurantDetails() {
//        return restaurantDetails;
//    }
//
//    public void setRestaurantDetails(Restaurant restaurantDetails) {
//        this.restaurantDetails = restaurantDetails;
//    }

}
