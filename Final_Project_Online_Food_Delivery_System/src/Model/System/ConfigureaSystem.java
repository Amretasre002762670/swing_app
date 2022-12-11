/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.System;

import Model.Employee.Employee;
import Model.UserAccount.UserAccount;

/**
 *
 * @author puppalanagavaishnavi
 */
public class ConfigureaSystem {

    public static Ecosystem configure() {

        Ecosystem system = Ecosystem.getInstance();

        Employee employee = system.getEmployeeList().createEmployee("RA");

        UserAccount ua = new UserAccount();
        ua.setUsername("sysadmin");
        ua.setPassword("sysadmin");
        ua.setRole("System Admin");

        system.getUserAccountDir().addUserAccounts(ua);

        return system;
    }
}
