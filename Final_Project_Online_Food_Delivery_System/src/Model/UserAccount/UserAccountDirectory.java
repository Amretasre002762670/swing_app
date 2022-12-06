/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

import Model.Employee.Employee;
import Model.Role.Role;
import Model.Role.SystemAdminrole;
import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
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

//    public UserAccount createUserAccount(String username, String password, Employee employee) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
