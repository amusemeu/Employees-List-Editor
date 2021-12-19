package com.amusemeu.employee.Employee.Editor.Controllers;

import com.amusemeu.employee.Employee.Editor.Models.Employee;
import com.amusemeu.employee.Employee.Editor.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "list")
    public List<Employee> list(){
        return employeeService.list();
    }

    @PostMapping(path = "item")
    public List<Employee> add(@RequestBody Employee employee){
        employeeService.add(employee);
        return employeeService.list();
    }

    @DeleteMapping(path = "item/{id}")
    public void delete(@PathVariable Long id){
        employeeService.delete(id);
    }

    @PutMapping(path = "item")
    public void update(@RequestBody Employee employee){
        employeeService.update(employee);
    }

}
