package com.amusemeu.employee.Employee.Editor.Repositories;

import com.amusemeu.employee.Employee.Editor.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
