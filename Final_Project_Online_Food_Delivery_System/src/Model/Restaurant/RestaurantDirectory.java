/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
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
}
