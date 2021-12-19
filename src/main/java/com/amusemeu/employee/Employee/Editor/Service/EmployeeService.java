package com.amusemeu.employee.Employee.Editor.Service;

import com.amusemeu.employee.Employee.Editor.Repositories.EmployeeRepository;
import com.amusemeu.employee.Employee.Editor.Models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    public final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    public void add(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    public void update(Employee employee) {
        Optional<Employee> row = employeeRepository.findById(employee.getId());
        if (row.isPresent()) {
            Employee item = row.get();
            if (employee.getDepartments() != null) {
                item.setDepartments(employee.getDepartments());
            }
            employeeRepository.save(item);
        }
    }
}
