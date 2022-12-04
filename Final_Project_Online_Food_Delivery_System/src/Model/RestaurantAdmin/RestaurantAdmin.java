/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.RestaurantAdmin;

import Model.Restaurant.Restaurant;
import Model.UserAccount.UserAccount;

/**
 *
 * @author amretasrerengarajan
 */
public class RestaurantAdmin {
    private UserAccount accountDetails;
    private int resId;
    private String resName;
    private String resStreetAddress;
    private String resCity;
    private String resPincode;
    private String resType; // Eg Indian, Italian, BBQ, etc
    private int resPhoneNum;
    private Restaurant restaurantDetails;

    public UserAccount getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResStreetAddress() {
        return resStreetAddress;
    }

    public void setResStreetAddress(String resStreetAddress) {
        this.resStreetAddress = resStreetAddress;
    }

    public String getResCity() {
        return resCity;
    }

    public void setResCity(String resCity) {
        this.resCity = resCity;
    }

    public String getResPincode() {
        return resPincode;
    }

    public void setResPincode(String resPincode) {
        this.resPincode = resPincode;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public int getResPhoneNum() {
        return resPhoneNum;
    }

    public void setResPhoneNum(int resPhoneNum) {
        this.resPhoneNum = resPhoneNum;
    }
    
}
