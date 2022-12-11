/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Restaurant;

import Model.UserAccount.UserAccount;
import Model.Customer.Customer;
import Model.System.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class RestaurantDirectory {
    
    
    Ecosystem ecosystem;
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory(Ecosystem ecosystem) {
        this.ecosystem = ecosystem;
        restaurantList = new ArrayList<Restaurant>();
    }
    
    

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public Restaurant addRestaurant(Restaurant resDetails) {
        restaurantList.add(resDetails);
        return resDetails;
    }
       
    
    public ArrayList<Restaurant> searchWithResName(String resName) {
        ArrayList<Restaurant> result = new ArrayList<Restaurant>();
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRestaurantName().equals(resName)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public ArrayList<Restaurant> searchWithResAdd(String streetAddress) {
        ArrayList<Restaurant> result = new ArrayList<Restaurant>();
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRestaurantName().contains(streetAddress)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public ArrayList<Restaurant> searchWithResPincode(int pincode) {
        ArrayList<Restaurant> result = new ArrayList<Restaurant>();
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRes_pincode() == pincode) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public ArrayList<Restaurant> searchWithResCity(String city) {
        ArrayList<Restaurant> result = new ArrayList<Restaurant>();
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRes_city().equals(city)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public ArrayList<Restaurant> searchWithResType(String type) {
        ArrayList<Restaurant> result = new ArrayList<Restaurant>();
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRes_type().contains(type)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public void setRestaurentList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public void deleteRestaurant(Restaurant restaurant) {
        restaurantList.remove(restaurant);
    }

    public Restaurant createRestaurant() {
        Restaurant r = new Restaurant();
        restaurantList.add(r);
        return r;
    }

    public boolean findRestaurant(String RestaurantName, String RestaurantPassword) {
        boolean ifRestaurant = false;
        for (Restaurant res : restaurantList) {
            if (res.getRestaurantName().equals(RestaurantName) && res.getRestaurantAdmin().getAccountDetails().getPassword().equals(RestaurantPassword)) {
                ifRestaurant = true;
            }
        }
        return ifRestaurant;
    }

    public Restaurant searchRestaurantProfile(String restaurantName) {
        Restaurant resultRestaurant = null;
        for (Restaurant res : restaurantList) {
            if (res.getRestaurantName().equals(restaurantName)) {
                resultRestaurant = res;
            }
        }
        return resultRestaurant;
    }

    public Restaurant searchRestaurantWithUserAccount(UserAccount user) {
        Restaurant searchedRestaurant = null;
        for(Restaurant restaurant: restaurantList) {
            System.out.println("Inside loop");
            System.out.println(restaurant.getRestaurantAdmin().getAccountDetails().getUsername());
            if(restaurant.getRestaurantAdmin().getAccountDetails().getUsername().equals(user.getUsername())) {
                searchedRestaurant = restaurant;
            }
        }
        return searchedRestaurant;
    }
}

