/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

import Model.Employee.Employee;
import Model.Role.Role;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author puppalanagavaishnavi
 */
public class UserAccount {

    private String username;
    private String password;
   private Employee employee;
    private String role;
    private WorkQueue workQueue;


    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 public Employee getEmployee() {
       return employee; 
 }

    public void setEmployee(Employee employee) {
       this.employee = employee;
   }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return username;
    }
}
