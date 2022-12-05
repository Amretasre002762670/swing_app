/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

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
        for(UserAccount account: userAccountList) {
            if(account.getUsername().equals(userName)) {
                searchedUser = account;
            }
        }
        return searchedUser;
    }
}
