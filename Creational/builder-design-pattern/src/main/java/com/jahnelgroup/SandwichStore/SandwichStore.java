package com.jahnelgroup.SandwichStore;

import com.jahnelgroup.customer.Customer;
import com.jahnelgroup.employee.Employee;
import com.jahnelgroup.sandwich.Sandwich;

import java.util.LinkedList;
import java.util.Queue;

/*
    The SandwichStore is a class that provides a location to manage the director components(Employees) and the Sandwich objects they create.
 */
public class SandwichStore {

    /*
        Queue of employees that are available to build sandwiches.
     */
    private Queue<Employee> availableEmployees = new LinkedList<>();

    public SandwichStore() {
        availableEmployees.add(new Employee("Victor"));
        availableEmployees.add(new Employee("Steven"));
        availableEmployees.add(new Employee("Joe"));
    }

    public Sandwich handleCustomer(Customer c) {
        return makeOrder(getNextEmployee(), c);
    }

    public Sandwich makeOrder(Employee e, Customer c) {
        return e.makeOrder(c);
    }

    public synchronized Employee getNextEmployee() {
        return availableEmployees.remove();
    }

}
