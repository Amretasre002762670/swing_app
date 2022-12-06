/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.RestaurantAdmin;

import Model.System.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author amretasrerengarajan
 */
public class RestaurantList {
    
    Ecosystem ecosystem;
    ArrayList<RestaurantAdmin> retaurantAdmin;

    public RestaurantList(Ecosystem ecosystem) {
        this.ecosystem = ecosystem;
        this.retaurantAdmin = new ArrayList<RestaurantAdmin>();
    }

    
    public ArrayList<RestaurantAdmin> getRetaurantAdmin() {
        return retaurantAdmin;
    }

    public void setRetaurantAdmin(ArrayList<RestaurantAdmin> retaurantAdmin) {
        this.retaurantAdmin = retaurantAdmin;
    }
    
    
}
