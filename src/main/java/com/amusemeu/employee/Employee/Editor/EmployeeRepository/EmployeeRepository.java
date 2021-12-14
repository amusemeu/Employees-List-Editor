package com.amusemeu.employee.Employee.Editor.EmployeeRepository;

import com.amusemeu.employee.Employee.Editor.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
