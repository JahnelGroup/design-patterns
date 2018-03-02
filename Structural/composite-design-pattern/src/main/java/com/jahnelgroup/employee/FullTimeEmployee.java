package com.jahnelgroup.employee;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is the Composite entity of the design pattern.
 * It implements the Employee interface and it has children that are also implementations of the Employee interface. 
 *
 */
public class FullTimeEmployee implements Employee {

    /*
     * List of other Employees under this entity.
     * 
     */
    private List<Employee> subordinates = new ArrayList<>();
    
    @Override
    public Employee getChild(int id) {
        return this.subordinates.get(id);
    }

    @Override
    public void addSubordinate(Employee e) {
        this.subordinates.add(e);
    }

    @Override
    public void removeSubordinate(Employee e) {
        this.subordinates.remove(e);
    }

    @Override
    public String getStatus() {
        return FullTimeEmployee.class.getSimpleName();
    }

    @Override
    public List<Employee> getSubordinates() {
        return this.subordinates;
    }

}
