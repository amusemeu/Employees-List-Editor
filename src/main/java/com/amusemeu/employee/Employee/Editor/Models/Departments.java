package com.amusemeu.employee.Employee.Editor.Models;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Departments {

    @Id
    @SequenceGenerator(name = "departments_sequencer", sequenceName = "departments_sequencer")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departments_sequencer")
    @Column(name = "department_id")
    private Long department_id;

    @Column(name = "department_name")
    private String department_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departments")
    @JsonManagedReference
    private List<Employee> emps;

    public Departments() {
    }
    public Departments(Long department_id) {
        this.department_id = department_id;
    }

    public Departments(Long department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public void addEmployeeToDepartment(Employee employee){
        if (emps == null){
            emps = new ArrayList<>();
        }
        emps.add(employee);
        employee.setDepartments(this);
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }


}
