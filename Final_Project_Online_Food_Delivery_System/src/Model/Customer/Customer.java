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

    private int custId;
    private String custName;
    private String home_streetAddress;
    private String home_City;
    private int home_pincode;
    private int custPhoneNumber;
    private String cus_emailid;
    private UserAccount userAccount;

    public Customer(UserAccount user) {
        this.userAccount = user;
    }
    
//    public Customer(int custId, String custName, String home_streetAddress, String home_City, int home_pincode, int custPhoneNumber, String cus_emailid) {
//        this.custId = custId;
//        this.custName = custName;
//        this.home_streetAddress = home_streetAddress;
//        this.home_City = home_City;
//        this.home_pincode = home_pincode;
//        this.cus_emailid = cus_emailid;
//        this.custPhoneNumber = custPhoneNumber;
//    }
    
    public Customer(int custId, String custName, String home_streetAddress, String home_City, int home_pincode, int custPhoneNumber, String cus_emailid, UserAccount userAccount) {
        this.userAccount = userAccount;
        this.custId = custId;
        this.custName = custName;
        this.home_streetAddress = home_streetAddress;
        this.home_City = home_City;
        this.home_pincode = home_pincode;
        this.cus_emailid = cus_emailid;
        this.custPhoneNumber = custPhoneNumber;
    }

   
    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
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

    public int getHome_pincode() {
        return home_pincode;
    }

    public void setHome_pincode(int home_pincode) {
        this.home_pincode = home_pincode;
    }

    public String getCus_emailid() {
        return cus_emailid;
    }

    public void setCus_emailid(String cus_emailid) {
        this.cus_emailid = cus_emailid;
    }
    

}
