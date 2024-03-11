package com.prathamesh.cruddemo.dao;

import com.prathamesh.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // That's it ... no need to write any code LOL!
}
