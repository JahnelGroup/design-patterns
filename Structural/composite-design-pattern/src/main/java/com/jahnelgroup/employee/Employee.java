package com.jahnelgroup.employee;

import java.util.List;

/*
 * The Employee is the Component of the design pattern. 
 * It is the interface everything else implements regardless if the entity is a parent or child.
 * 
 */
public interface Employee {

    Employee getChild(int id);
    
    void addSubordinate(Employee e);
    
    void removeSubordinate(Employee e);
    
    List<Employee> getSubordinates();
    
    /*
     * Get status of employee. 
     * 
     */
    String getStatus();
    
}
