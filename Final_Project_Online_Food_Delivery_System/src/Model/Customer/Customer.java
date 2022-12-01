/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer;

import Model.UserAccount.UserAccount;

/**
 *
 * @author puppalanagavaishnavi
 */
public class Customer {

    private String custName;
    private String home_streetAddress;
    private String home_City;
    private String home_pincode;
    private int custPhoneNumber;
    private UserAccount userAccount;

    public Customer(String custName, String home_streetAddress, String home_City, String home_pincode, int custPhoneNumber, UserAccount userAccount) {
        this.userAccount = userAccount;
        this.custName = userAccount.getUsername();
        this.home_streetAddress = home_streetAddress;
        this.home_City = home_City;
        this.home_pincode = home_pincode;
        this.custPhoneNumber = this.userAccount.getPhone_number();
    }
    
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustPhoneNumber() {
        return custPhoneNumber;
    }

    public void setCustPhoneNumber(int custPhoneNumber) {
        this.custPhoneNumber = custPhoneNumber;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getHome_streetAddress() {
        return home_streetAddress;
    }

    public void setHome_streetAddress(String home_streetAddress) {
        this.home_streetAddress = home_streetAddress;
    }

    public String getHome_City() {
        return home_City;
    }

    public void setHome_City(String home_City) {
        this.home_City = home_City;
    }

    public String getHome_pincode() {
        return home_pincode;
    }

    public void setHome_pincode(String home_pincode) {
        this.home_pincode = home_pincode;
    }
    
    

}
