/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

import Model.Customer.Customer;
import Model.Employee.Employee;
import Model.Role.Role;
import Model.System.Ecosystem;
import Model.System.Organization;
import java.util.ArrayList;
import Model.WorkQueue.WorkQueue;
import Model.WorkQueue.WorkRequest;


/**
 *
 * @author puppalanagavaishnavi
 */
public class UserAccountDirectory {
    

   // Ecosystem ecosystem;

    Ecosystem ecosystem;
    Organization org;

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory(Ecosystem ecosystem) {
     //   this.ecosystem = ecosystem;
        userAccountList = new ArrayList();
    }
    
    public UserAccountDirectory(Organization org) {
//        this.ecosystem = ecosystem;
        this.org = org;
        userAccountList = new ArrayList();
    }

    public UserAccountDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount addUserAccounts(UserAccount newUser) {
        userAccountList.add(newUser);
        return newUser;
    }

    public UserAccount findUserAccountWithUserName(String userName) {
        UserAccount searchedUser = null;
        for (UserAccount account : userAccountList) {
            if (account.getUsername().equals(userName)) {
                searchedUser = account;
            }
        }
        return searchedUser;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
     public UserAccount AddUserAccount() {
        UserAccount newUserAccount = new UserAccount();
        userAccountList.add(newUserAccount);
        return newUserAccount;
     }

//    public UserAccount createUserAccount(String username, String password, Employee employee) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
