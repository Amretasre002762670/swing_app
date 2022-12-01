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
    private String custAddress;
    private int custPhoneNumber; 
    private UserAccount userAccount;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
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
    
}
