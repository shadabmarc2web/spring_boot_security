package com.marc2web.security.data;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.marc2web.security.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
