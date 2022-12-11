/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Restaurant;

import Model.Menu.Menu;
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
    private int res_pincode;
    private String res_type;
    private ArrayList<Menu> menulist;

    public Restaurant() {
        this.menulist = new ArrayList<Menu>();
    }

    public Restaurant(RestaurantAdmin restaurantAdmin) {
        this.restaurantAdmin = restaurantAdmin;
        this.menulist = new ArrayList<Menu>();
    }

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

    public int getRes_pincode() {
        return res_pincode;
    }

    public void setRes_pincode(int res_pincode) {
        this.res_pincode = res_pincode;
    }

    public RestaurantAdmin getRestaurantAdmin() {
        return restaurantAdmin;
    }

    public void setRestaurantAdmin(RestaurantAdmin restaurantAdmin) {
        this.restaurantAdmin = restaurantAdmin;
    }

    public String getRes_type() {
        return res_type;
    }

    public void setRes_type(String res_type) {
        this.res_type = res_type;
    }

    public ArrayList<Menu> getMenulist() {
        return menulist;
    }

    public void setMenulist(ArrayList<Menu> menulist) {
        this.menulist = menulist;
    }


    public Menu addMenu(Menu newMenu) {
        System.out.println("Inside menu method");
        System.out.println(newMenu.getFood_name());
        menulist.add(newMenu);
        return newMenu;
    }

    @Override
    public String toString() {
        return restaurantName;
    }

}
