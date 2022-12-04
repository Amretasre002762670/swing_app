/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Restaurant;

import Model.RestaurantAdmin.RestaurantAdmin;
import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private RestaurantAdmin restaurantAdmin;
    private int phoneNumber;
    private String res_street_add;
    private String res_city;
    private String res_pincode;
    private ArrayList<String> menulist;

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getMenulist() {
        return menulist;
    }

    public void setMenulist(ArrayList<String> menulist) {
        this.menulist = menulist;
    }

    public String getRes_street_add() {
        return res_street_add;
    }

    public void setRes_street_add(String res_street_add) {
        this.res_street_add = res_street_add;
    }

    public String getRes_city() {
        return res_city;
    }

    public void setRes_city(String res_city) {
        this.res_city = res_city;
    }

    public String getRes_pincode() {
        return res_pincode;
    }

    public void setRes_pincode(String res_pincode) {
        this.res_pincode = res_pincode;
    }

    public RestaurantAdmin getRestaurantAdmin() {
        return restaurantAdmin;
    }

    public void setRestaurantAdmin(RestaurantAdmin restaurantAdmin) {
        this.restaurantAdmin = restaurantAdmin;
    }
    
    

}
