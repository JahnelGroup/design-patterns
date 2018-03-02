package com.jahnelgroup.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/*
 * These tests test that all Employee implementations are treated the same.
 * 
 */
public class EmployeeTests {

    @Test
    public void shouldReturnAllTheStatusesOfEmployees() {
        List<Employee> employees = new ArrayList<>(Arrays.asList(new PartTimeEmployee(),
                                                                 new FullTimeEmployee()));
        Employee higherUp = new FullTimeEmployee();
        higherUp.addSubordinate(new PartTimeEmployee());
        employees.add(higherUp);
        List<String> statuses = employees.stream()
                                         .flatMap(es -> {
                                             // Creating separate stream in order to flatten tree while including the parent.
                                             List<Employee> currLvl = es.getSubordinates();
                                             currLvl.add(es);
                                             return currLvl.stream();
                                         })
                                         .map(es -> es.getStatus())
                                         .collect(Collectors.toList());
        assertThat(statuses).containsExactlyInAnyOrder("PartTimeEmployee", 
                                                       "FullTimeEmployee", 
                                                       "FullTimeEmployee", 
                                                       "PartTimeEmployee");
    }

}
