package com.example.ems.repository;

import com.example.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
