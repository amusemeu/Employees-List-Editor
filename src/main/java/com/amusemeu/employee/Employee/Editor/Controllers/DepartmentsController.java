package com.amusemeu.employee.Employee.Editor.Controllers;


import com.amusemeu.employee.Employee.Editor.Models.Departments;
import com.amusemeu.employee.Employee.Editor.Service.DepartmentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentsController {
    private final DepartmentsService departmentsService;

    public DepartmentsController(DepartmentsService departmentsService) {
        this.departmentsService = departmentsService;
    }
    @GetMapping(path = "list")
    public List<Departments> list(){
        return departmentsService.list();
    }
    @PostMapping(path = "itemDep")
    public List<Departments> addDepartment(@RequestBody Departments departments){
        departmentsService.addDepartment(departments);
        return departmentsService.list();
    }
    @DeleteMapping(path = "itemDel/{id}")
    public void deleteDepartment(@PathVariable Long id){
        departmentsService.deleteDepartment(id);
    }

}
