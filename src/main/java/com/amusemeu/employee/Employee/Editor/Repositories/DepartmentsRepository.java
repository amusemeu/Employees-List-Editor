package com.amusemeu.employee.Employee.Editor.Repositories;

import com.amusemeu.employee.Employee.Editor.Models.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
}
