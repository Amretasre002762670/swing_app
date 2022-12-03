/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.System;

import Model.Employee.Employee;
import Model.Role.SystemAdminrole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author puppalanagavaishnavi
 */
public class ConfigureaSystem {
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
      
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RA");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminrole());
        
        return system;
}
}