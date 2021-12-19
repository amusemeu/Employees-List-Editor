package com.amusemeu.employee.Employee.Editor.Service;


import com.amusemeu.employee.Employee.Editor.Repositories.DepartmentsRepository;
import com.amusemeu.employee.Employee.Editor.Models.Departments;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentsService {
    private final DepartmentsRepository departmentsRepository;

    public DepartmentsService(DepartmentsRepository departmentsRepository) {
        this.departmentsRepository = departmentsRepository;
    }
    public List<Departments> list() {
        return departmentsRepository.findAll();
    }
    public void addDepartment(Departments departments){
        departmentsRepository.save(departments);
    }
    public void deleteDepartment(Long id){
        departmentsRepository.deleteById(id);
    }

}
