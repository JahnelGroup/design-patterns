package com.jahnelgroup.employee;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is consider a Leaf element within the design pattern.
 * It implements the Component but does not have any children.
 * 
 */
public class PartTimeEmployee implements Employee {

    /*
     * Not needed for Leaf element.
     * 
     */
    @Override
    public Employee getChild(int id) {
        return null;
    }

    /*
     * Not needed for Leaf element.
     * 
     */
    @Override
    public void addSubordinate(Employee e) { }

    /*
     * Not needed for Leaf element.
     * 
     */
    @Override
    public void removeSubordinate(Employee e) { }

    /*
     * (non-Javadoc)
     * @see com.jahnelgroup.employee.Employee#getStatus()
     * 
     */
    @Override
    public String getStatus() {
        return PartTimeEmployee.class.getSimpleName();
    }

    @Override
    public List<Employee> getSubordinates() {
        return new ArrayList<>();
    }

}
