/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Restaurant;

import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class Restaurant {
    private int restaurantId;
      private String restaurantName;
    private String restaurantManager;
    private Integer phoneNumber;
    private String address;
    private ArrayList<String> menulist;
    
    private UserAccount userAccount;

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantManager() {
        return restaurantManager;
    }

    public void setRestaurantManager(String restaurantManager) {
        this.restaurantManager = restaurantManager;
    } 

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getMenulist() {
        return menulist;
    }

    public void setMenulist(ArrayList<String> menulist) {
        this.menulist = menulist;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
}
