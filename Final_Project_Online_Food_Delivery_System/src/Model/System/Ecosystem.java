/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.System;
import Model.Customer.Customer;
import Model.Customer.CustomerDirectory;
import Model.DeliveryMan.DeliveryManDirectory;
import Model.Restaurant.RestaurantDirectory;
import Model.Role.Role;
import Model.Role.SystemAdminrole;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class Ecosystem extends Organization{
    
    private static Ecosystem business;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private RestaurantDirectory restaurantDirectory;
    
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();  
        }
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }
    private Ecosystem() {
        super(null);
        customerDirectory  = new CustomerDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        restaurantDirectory = new RestaurantDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminrole());
        return roleList;
    }

   
}


