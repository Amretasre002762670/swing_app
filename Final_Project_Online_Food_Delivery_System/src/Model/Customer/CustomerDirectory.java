/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer;

import Model.System.Ecosystem;
import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class CustomerDirectory {
    Ecosystem ecosystem;
    private ArrayList<Customer> customerList;

    public CustomerDirectory(Ecosystem ecosystem) {
        this.ecosystem = ecosystem;
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
//    public Customer createnewCustomer  (){
//        Customer newC = new Customer();
//        customerList.add(newC);  
//        return newC;
//    }
    
    public Customer addCustomer(UserAccount user) {
        Customer newCustomer = new Customer(user);
        customerList.add(newCustomer);
        return newCustomer;
    }
   
     public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
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

    public void createCustomer(Customer cus) {
        customerList.add(cus);
    }
}
