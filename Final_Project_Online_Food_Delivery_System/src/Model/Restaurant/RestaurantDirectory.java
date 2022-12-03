/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Restaurant;

import Model.UserAccount.UserAccount;
import Model.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class RestaurantDirectory {
     private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<>();
    }
    
      public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurentList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
 
    
    public void deleteRestaurant(Restaurant restaurant) {
        restaurantList.remove(restaurant);
    }

    
 public Restaurant createRestaurant(){
        Restaurant r = new Restaurant();
        restaurantList.add(r);  
        return r;
    }
  public boolean findRestaurant(String RestaurantName, String RestaurantPassword) {
        boolean ifRestaurant = false;
        for (Restaurant res: restaurantList) {
            if (res.getRestaurantName().equals(RestaurantName) && res.getUserAccount().getPassword().equals(RestaurantPassword)) {
                ifRestaurant = true;
            }
        }
        return ifRestaurant;
    }
    
    public Restaurant searchRestaurantProfile(String restaurantName) {
        Restaurant resultRestaurant = null;
        for (Restaurant res: restaurantList) {
            if (res.getRestaurantName().equals(restaurantName)) {
                  resultRestaurant = res;
            }
        }
        return resultRestaurant;
    }
}
