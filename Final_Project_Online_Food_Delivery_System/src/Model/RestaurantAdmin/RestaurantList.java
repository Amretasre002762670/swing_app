/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.RestaurantAdmin;

import Model.Restaurant.Restaurant;
import Model.RestaurantAdmin.RestaurantAdmin;
import Model.System.Ecosystem;
import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author amretasrerengarajan
 */
public class RestaurantList {
    
    Ecosystem ecosystem;
    ArrayList<RestaurantAdmin> restaurantAdminList;

    public RestaurantList(Ecosystem ecosystem) {
        this.ecosystem = ecosystem;
        this.restaurantAdminList = new ArrayList<RestaurantAdmin>();
    }

    public Ecosystem getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(Ecosystem ecosystem) {
        this.ecosystem = ecosystem;
    }

    public ArrayList<RestaurantAdmin> getRestaurantAdminList() {
        return restaurantAdminList;
    }

    public void setRestaurantAdminList(ArrayList<RestaurantAdmin> restaurantAdminList) {
        this.restaurantAdminList = restaurantAdminList;
    }

    
}
