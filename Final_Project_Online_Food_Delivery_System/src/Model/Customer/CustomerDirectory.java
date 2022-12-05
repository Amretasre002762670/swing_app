/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer;

import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(Customer newCustomer) {
        customerList.add(newCustomer);
        return newCustomer;
    }
    
    public boolean findCustomer(String customerName, String customerPassword) {
        boolean ifCustomer = false;
        for (Customer cus: customerList) {
            if (cus.getCustName().equals(customerName) && cus.getUserAccount().getPassword().equals(customerPassword)) {
                ifCustomer = true;
            }
        }
        return ifCustomer;
    }
    
    public Customer searchCustomerProfile(String customerName) {
        Customer resultCustomer = null;
        for (Customer cus: customerList) {
            if (cus.getCustName().equals(customerName)) {
//                resultCustomer = new Customer(customerProfile.getCustName(), customerProfile.getHome_streetAddress(), customerProfile.getHome_City(), customerProfile.getHome_pincode(), customerProfile.getUserAccount().getPhone_number(), customerProfile.getUserAccount());
                  resultCustomer = cus;
            }
        }
        return resultCustomer;
    }
    
    public Customer searchCustomerWithUserAccount(UserAccount user) {
        Customer searchedCustomer = null;
        for(Customer customer: customerList) {
            if(customer.getUserAccount().getUsername().equals(user.getUsername())) {
                searchedCustomer = customer;
            }
        }
        return searchedCustomer;
    }
    
}
