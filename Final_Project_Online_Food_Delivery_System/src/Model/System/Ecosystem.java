/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.System;

import Model.Customer.Customer;
import Model.Customer.CustomerDirectory;
import Model.DeliveryMan.DeliveryManDirectory;
import Model.Employee.EmployeeDirectory;
import Model.Restaurant.RestaurantDirectory;
import Model.RestaurantAdmin.RestaurantList;
import Model.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class Ecosystem {

    private static Ecosystem business;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private RestaurantDirectory restaurantDirectory;
    private RestaurantList restaurantAdminList;
    private EmployeeDirectory employeeList;
    private UserAccountDirectory userAccountDir;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }

    public Ecosystem() {
        customerDirectory = new CustomerDirectory(this);
        deliveryManDirectory = new DeliveryManDirectory(this);
        restaurantDirectory = new RestaurantDirectory(this);
        restaurantAdminList = new RestaurantList(this);
        userAccountDir = new UserAccountDirectory(this);
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

    public RestaurantList getRestaurantAdminList() {
        return restaurantAdminList;
    }

    public void setRestaurantAdminList(RestaurantList restaurantAdminList) {
        this.restaurantAdminList = restaurantAdminList;
    }

    public UserAccountDirectory getUserAccountDir() {
        return userAccountDir;
    }

    public void setUserAccountDir(UserAccountDirectory userAccountDir) {
        this.userAccountDir = userAccountDir;
    }

//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new SystemAdminrole());
//        return roleList;
//    }
    public EmployeeDirectory getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(EmployeeDirectory employeeList) {
        this.employeeList = employeeList;
    }

}
